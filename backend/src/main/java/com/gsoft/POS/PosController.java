package com.gsoft.POS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class PosController {

    @GetMapping
    public String helloGradle() {
        return "This is backend";
    }
}
