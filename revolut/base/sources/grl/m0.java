package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum m0 implements com.google.protobuf.a1 {
    OPEN(0),
    CLOSE(1),
    UNRECOGNIZED(-1);

    public static final int CLOSE_VALUE = 1;
    public static final int OPEN_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new l0();
    private final int value;

    m0(int i) {
        this.value = i;
    }

    public static m0 a(int i) {
        if (i == 0) {
            return OPEN;
        }
        if (i != 1) {
            return null;
        }
        return CLOSE;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
