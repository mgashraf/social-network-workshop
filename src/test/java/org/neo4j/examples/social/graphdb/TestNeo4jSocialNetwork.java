package org.neo4j.examples.social.graphdb;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.neo4j.examples.social.TestUtils;
import org.neo4j.examples.social.TheMatrix;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.index.IndexService;

public class TestNeo4jSocialNetwork extends TestUtils
{
    private static final String STORE_DIR = null;

    @BeforeClass
    public static void setupMatrixTestGraph()
    {
        Neo4jSocialNetwork socialNet = new TestNeo4jSocialNetwork().setupTheMatrix( STORE_DIR );
    }

    @AfterClass
    public static void shutdownSocialNetwork()
    {

    }

    private Neo4jSocialNetwork setupTheMatrix( String storeDir )
    {
        return socialNetworkOf( new TheMatrix( storeDir ) );
    }

    @Override
    protected Neo4jSocialNetwork createSocialNetwork( GraphDatabaseService graphDb,
            IndexService indexes )
    {
        return new Neo4jSocialNetwork( graphDb, indexes );
    }
}