package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum n1 implements com.google.protobuf.a1 {
    NORMAL(0),
    TILT(1),
    UNRECOGNIZED(-1);

    public static final int NORMAL_VALUE = 0;
    public static final int TILT_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new m1();
    private final int value;

    n1(int i) {
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
