package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum fe implements com.google.protobuf.a1 {
    ZERO(0),
    POSITIVE(1),
    NEGATIVE(2),
    UNRECOGNIZED(-1);

    public static final int NEGATIVE_VALUE = 2;
    public static final int POSITIVE_VALUE = 1;
    public static final int ZERO_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new ee();
    private final int value;

    fe(int i) {
        this.value = i;
    }

    public static fe a(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return POSITIVE;
        }
        if (i != 2) {
            return null;
        }
        return NEGATIVE;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
