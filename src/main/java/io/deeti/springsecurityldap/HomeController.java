package io.deeti.springsecurityldap;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {

    @GetMapping(value="/")
    public String home() {
        
        return "Home";
    }
    
    
}
