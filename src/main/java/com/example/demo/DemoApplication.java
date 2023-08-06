package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Hello");
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student(
				"Eng2015001", "John Doe", Student.Gender.MALE, 1);
		studentRepository.save(student);

	}
}
