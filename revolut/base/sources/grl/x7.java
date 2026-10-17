package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum x7 implements com.google.protobuf.a1 {
    CONTEXTUAL(0),
    GENERIC(1),
    UNRECOGNIZED(-1);

    public static final int CONTEXTUAL_VALUE = 0;
    public static final int GENERIC_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new w7();
    private final int value;

    x7(int i) {
        this.value = i;
    }

    public static x7 a(int i) {
        if (i == 0) {
            return CONTEXTUAL;
        }
        if (i != 1) {
            return null;
        }
        return GENERIC;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
