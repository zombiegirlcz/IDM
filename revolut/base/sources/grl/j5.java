package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum j5 implements com.google.protobuf.a1 {
    FIXED(0),
    CASHBACK(1),
    UNRECOGNIZED(-1);

    public static final int CASHBACK_VALUE = 1;
    public static final int FIXED_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new i5();
    private final int value;

    j5(int i) {
        this.value = i;
    }

    public static j5 a(int i) {
        if (i == 0) {
            return FIXED;
        }
        if (i != 1) {
            return null;
        }
        return CASHBACK;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
