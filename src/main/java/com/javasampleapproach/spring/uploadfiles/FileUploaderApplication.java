package com.javasampleapproach.spring.uploadfiles;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javasampleapproach.spring.uploadfiles.storage.StorageService;

@SpringBootApplication
public class FileUploaderApplication implements CommandLineRunner {

	@Resource
	StorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(FileUploaderApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		/*storageService.deleteAll();
		storageService.init();*/
	}
}
