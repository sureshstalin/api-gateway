package com.itgarden.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {


    @GetMapping
    public String ping() {
        return "API Gateway is up and running";
    }
}
