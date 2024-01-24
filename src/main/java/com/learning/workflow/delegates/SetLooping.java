package com.learning.workflow.delegates;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SetLooping implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		List<String> noOfFriends = new ArrayList<String>();
		String friend1=execution.getVariable("friend1").toString();
		String friend2=execution.getVariable("friend2").toString();
		String friend3=execution.getVariable("friend3").toString();
		noOfFriends.add(friend3);
		noOfFriends.add(friend2);
		noOfFriends.add(friend1);
		execution.setVariable("noOfFriends", noOfFriends);
	}

}
