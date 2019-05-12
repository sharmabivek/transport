package Transport;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController //stereotype annotation
@EnableAutoConfiguration //configure Spring, based on the jar dependencies
public class Transport {

	@RequestMapping("/")
	String home() {
		return "Transport Page!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Transport.class, args);
	}

}
