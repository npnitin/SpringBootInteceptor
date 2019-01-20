package com.example.SpringBootInteceptor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("sayHello")
    public ResponseEntity sayHello(){
        return new ResponseEntity("Hello",HttpStatus.OK);
    }
}
