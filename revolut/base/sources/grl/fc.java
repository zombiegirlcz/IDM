package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum fc implements com.google.protobuf.a1 {
    Face(0),
    Fingerprint(1),
    Pin(2),
    UNRECOGNIZED(-1);

    public static final int Face_VALUE = 0;
    public static final int Fingerprint_VALUE = 1;
    public static final int Pin_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new ec();
    private final int value;

    fc(int i) {
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
