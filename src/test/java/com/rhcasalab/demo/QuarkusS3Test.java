package com.rhcasalab.demo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class QuarkusS3Test {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/quarkus-s3")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}