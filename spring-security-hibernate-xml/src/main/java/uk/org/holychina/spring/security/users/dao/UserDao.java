package uk.org.holychina.spring.security.users.dao;

import uk.org.holychina.spring.security.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}