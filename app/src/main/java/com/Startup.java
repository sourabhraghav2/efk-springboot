package com;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class Startup {

	@GetMapping("/test")
	public String test(){
		log.info("Working!");
		return "Working!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
}
