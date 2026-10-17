package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum f1 implements com.google.protobuf.a1 {
    AUTOCAPTURE(0),
    ACTIVE_LIVENESS(1),
    UNRECOGNIZED(-1);

    public static final int ACTIVE_LIVENESS_VALUE = 1;
    public static final int AUTOCAPTURE_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new e1();
    private final int value;

    f1(int i) {
        this.value = i;
    }

    public static f1 a(int i) {
        if (i == 0) {
            return AUTOCAPTURE;
        }
        if (i != 1) {
            return null;
        }
        return ACTIVE_LIVENESS;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
