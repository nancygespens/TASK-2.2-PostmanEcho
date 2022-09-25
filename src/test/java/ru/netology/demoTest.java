package ru.netology;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class demoTest {

    @Test
    void shouldDemoTest() {
        ValidatableResponse some_data = given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .header("Content-Type","application/json; charset=utf-8")
                .body("data", equalTo("some data"))
                .header("Connection","keep-alive")
                ;

    }

}