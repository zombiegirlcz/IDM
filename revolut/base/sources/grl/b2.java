package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum b2 implements com.google.protobuf.a1 {
    PHYSICAL(0),
    VIRTUAL(1),
    UNRECOGNIZED(-1);

    public static final int PHYSICAL_VALUE = 0;
    public static final int VIRTUAL_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new a2();
    private final int value;

    b2(int i) {
        this.value = i;
    }

    public static b2 a(int i) {
        if (i == 0) {
            return PHYSICAL;
        }
        if (i != 1) {
            return null;
        }
        return VIRTUAL;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
