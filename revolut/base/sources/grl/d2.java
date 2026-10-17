package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum d2 implements com.google.protobuf.a1 {
    PASSED(0),
    PENDING(1),
    FAILED(2),
    NONE(3),
    UNRECOGNIZED(-1);

    public static final int FAILED_VALUE = 2;
    public static final int NONE_VALUE = 3;
    public static final int PASSED_VALUE = 0;
    public static final int PENDING_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new c2();
    private final int value;

    d2(int i) {
        this.value = i;
    }

    public static d2 a(int i) {
        if (i == 0) {
            return PASSED;
        }
        if (i == 1) {
            return PENDING;
        }
        if (i == 2) {
            return FAILED;
        }
        if (i != 3) {
            return null;
        }
        return NONE;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
