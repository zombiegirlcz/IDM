package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum be implements com.google.protobuf.a1 {
    NOT_DETECTED(0),
    DETECTED_INVALID(1),
    DETECTED_VALID(2),
    UNRECOGNIZED(-1);

    public static final int DETECTED_INVALID_VALUE = 1;
    public static final int DETECTED_VALID_VALUE = 2;
    public static final int NOT_DETECTED_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new ae();
    private final int value;

    be(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
