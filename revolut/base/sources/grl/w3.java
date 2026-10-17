package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum w3 implements com.google.protobuf.a1 {
    BELOW_LOWER_BOUND(0),
    EXCEEDS_UPPER_BOUND(1),
    UNRECOGNIZED(-1);

    public static final int BELOW_LOWER_BOUND_VALUE = 0;
    public static final int EXCEEDS_UPPER_BOUND_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new v3();
    private final int value;

    w3(int i) {
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
