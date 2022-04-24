package com.ebayk;

import com.ebayk.data.user.User;
import com.ebayk.service.RatingAnalyzer;
import com.ebayk.service.RatingAnalyzer.UserNotFoundException;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/{id}")
public class UserController {

 @RequestMapping("/rated-users")
  public List<User> listAd(@PathVariable("id") Integer userId) throws UserNotFoundException {
    return Arrays.asList(
        // This is just placeholder sample data
       User.newUser().id(2).name("Bob").ratings(Collections.emptyList()).ratings(
          Arrays.asList(
              new UserRating(3, 4000)
          )
      ).build(),
        User.newUser().id(3).name("Charles").ratings(Collections.emptyList()).ratings(
        Arrays.asList(
            new UserRating(3, 5)
          )
      ).build());
  
  }
}
