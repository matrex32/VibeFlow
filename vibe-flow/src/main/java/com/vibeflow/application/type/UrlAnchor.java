package com.vibeflow.application.type;

import lombok.Getter;

/**
 * Enum representing various URL anchors used in the application
 * 
 * @author Denis
 */
@Getter
public enum UrlAnchor {

	/**
	 * Represents the anchor for an invalid user.
	 */
	INVALID_USER("/login#invalid-user"),

	/**
	 * Represents the anchor for successful confirmation of registration.
	 */
	SUCCES_CONFIRMATION("/login#success-confirmation"),

	/**
	 *  Represents the anchor for an invalid token.
	 */
	INVALID_TOKEN("/login#invalid-token"),
	
	/**
	 * Represents the anchor for an expired token.
	 */
	TOKEN_EXPIRED("/login#token-expired"),
	
	/**
	 * Represents the anchor for a user who is already confirmed.
	 */
	USER_ALREADY_CONFIRMED("/login#user-already-confirmed"),

	/**
	 * Repreents the anchor for a user who is unconfirmed
	 */
	UNCONFIRMED_USER("/login#unconfirmed-user"),
	
	/**
	 * Represents the path to reset password view
	 */
	RESET_PASSWORD("/reset-password?token="),
	
	RESET_PASSWORD_SUCCESSFULLY("/reset-password#reset-password-successfully"),
	
	/**
	 * Represents the reset password invalid token
	 */
	RESET_PASSWORD_INVALID_TOKEN("/reset-password#invalid-token"),
	
	/**
	 * Reppresents the reset password token expired
	 */
	RESET_PASSWORD_TOKEN_EXPIRED("/reset-password#token-expired");

	/**
     * The actual URL anchor string associated with the enum constant.
     */
	private final String anchor;

	/**
	 * Constructs a UrlAnchor enum constant with the specified URL anchor string.
	 *  
	 * @param anchor The URL anchor string to be associated with the enum constant.
	 */
	private UrlAnchor(String anchor) {
		this.anchor = anchor;
	}
}
