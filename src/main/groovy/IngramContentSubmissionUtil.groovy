@Grab("spring-web")

import org.springframework.web.client.RestTemplate;
import java.net.URI;
import org.springframework.http.ResponseEntity;

@Component
class IngramContentSubmissionUtil implements CommandLineRunner {

  @Autowired
  private ContentSubmissionStatusService contentSubmissionStatusService;

  void run(String... args) {
    String recordReference = args[0];
    String isbn = args[1];
    contentSubmissionStatusService.setSuccess(recordReference, isbn); 
  }
}

@Service
class ContentSubmissionStatusService {

  public void setSuccess(String recordReference, String isbn) {
    println recordReference;
    println isbn;
    //RestTemplate restTemplate = new RestTemplate();
    //String request = getSuccessRequestData(recordReference, isbn);
    //ResponseEntity<String> response = restTemplate.postForObject(new URI("http://bookwizard.blurb.com/partner/content_submission/status"), request, String.class);
    //println (response.toString());
  }

  public void setError(String recordReference, String isbn) {
    //TODO: Implement this
  }

  private String getSuccessRequestData(String recordReference, String isbn) {
    //TODO: Implement this  
    return null;
  }

  private String getErrorRequestData(String recordReference, String isbn) {
    //TODO: Implement this
    return null;
  }
}

