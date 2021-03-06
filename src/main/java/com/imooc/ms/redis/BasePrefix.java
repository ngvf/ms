package com.imooc.ms.redis;

public abstract class BasePrefix implements KeyPrefix{

	private int expireSeconds;
	
	private String prefix;
	
	public BasePrefix(String prefix) {
		this.expireSeconds = 0;
		this.prefix = prefix;
	}

	
	public BasePrefix(int expireSeconds, String prefix) {
		this.expireSeconds = expireSeconds;
		this.prefix = prefix;
	}

	@Override
	public int expireSeconds() {//默认0是永不过期
		return expireSeconds;
	}

	@Override
	public String getPrefix() {
		String className = getClass().getSimpleName();
		
		return className+":"+prefix;
	}

	


	
	
	
}
