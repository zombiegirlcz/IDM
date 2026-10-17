package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum hb implements com.google.protobuf.a1 {
    SMS(0),
    Call(1),
    Email(2),
    App(3),
    Push(4),
    Password(5),
    WhatsApp(6),
    UNRECOGNIZED(-1);

    public static final int App_VALUE = 3;
    public static final int Call_VALUE = 1;
    public static final int Email_VALUE = 2;
    public static final int Password_VALUE = 5;
    public static final int Push_VALUE = 4;
    public static final int SMS_VALUE = 0;
    public static final int WhatsApp_VALUE = 6;
    private static final com.google.protobuf.b1 internalValueMap = new gb();
    private final int value;

    hb(int i) {
        this.value = i;
    }

    public static hb a(int i) {
        switch (i) {
            case 0:
                return SMS;
            case 1:
                return Call;
            case 2:
                return Email;
            case 3:
                return App;
            case 4:
                return Push;
            case 5:
                return Password;
            case 6:
                return WhatsApp;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
