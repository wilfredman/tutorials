package com.smdev.guice.msg.service.send;

import javax.inject.Singleton;

import com.smdev.guice.msg.domain.Message;
import com.smdev.guice.msg.service.MessageService;

/**
 * Service for sending e-mails
 * 
 * @author Ireth
 */
@Singleton
public class MailService implements MessageService {

	@Override
	public boolean send(Message message){
		// TODO Auto-generated method stub
		System.out.println("Email Message sent ");
		return true;
	}
}