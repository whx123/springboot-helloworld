package org.spring.springboot.web;

import org.spring.springboot.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello() {
        //int i = 10 / 0;
        return "Hello,World!";
    }

    @RequestMapping("/getUsers")
    public String  getUaers() {
        User u = new User();
        int age = u.getAge();
        return String.valueOf(age);
    }


}
