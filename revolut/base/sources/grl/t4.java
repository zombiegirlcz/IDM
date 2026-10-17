package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum t4 implements com.google.protobuf.a1 {
    ACTIVE(0),
    INACTIVE(1),
    UNRECOGNIZED(-1);

    public static final int ACTIVE_VALUE = 0;
    public static final int INACTIVE_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new s4();
    private final int value;

    t4(int i) {
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
