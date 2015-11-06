package sample;

public class Message {

	private final String message;

	public Message(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
}
