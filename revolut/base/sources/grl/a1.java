package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum a1 implements com.google.protobuf.a1 {
    Weekly(0),
    Monthly(1),
    UNRECOGNIZED(-1);

    public static final int Monthly_VALUE = 1;
    public static final int Weekly_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new z0();
    private final int value;

    a1(int i) {
        this.value = i;
    }

    public static a1 a(int i) {
        if (i == 0) {
            return Weekly;
        }
        if (i != 1) {
            return null;
        }
        return Monthly;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
