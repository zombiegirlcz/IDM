package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum b4 implements com.google.protobuf.a1 {
    NOT_VERIFIED(0),
    OK(1),
    EXPIRED_OR_INVALID_KEY(EXPIRED_OR_INVALID_KEY_VALUE),
    INVALID_PAYLOAD(INVALID_PAYLOAD_VALUE),
    OLD_MESSAGE(OLD_MESSAGE_VALUE),
    UNRECOGNIZED(-1);

    public static final int EXPIRED_OR_INVALID_KEY_VALUE = 2000;
    public static final int INVALID_PAYLOAD_VALUE = 2200;
    public static final int NOT_VERIFIED_VALUE = 0;
    public static final int OK_VALUE = 1;
    public static final int OLD_MESSAGE_VALUE = 2300;
    private static final com.google.protobuf.b1 internalValueMap = new a4();
    private final int value;

    b4(int i) {
        this.value = i;
    }

    public static b4 a(int i) {
        if (i == 0) {
            return NOT_VERIFIED;
        }
        if (i == 1) {
            return OK;
        }
        if (i == 2000) {
            return EXPIRED_OR_INVALID_KEY;
        }
        if (i == 2200) {
            return INVALID_PAYLOAD;
        }
        if (i != 2300) {
            return null;
        }
        return OLD_MESSAGE;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
