package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum kc implements com.google.protobuf.a1 {
    RevolutShop(0),
    UNRECOGNIZED(-1);

    public static final int RevolutShop_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new jc();
    private final int value;

    kc(int i) {
        this.value = i;
    }

    public static kc a(int i) {
        if (i != 0) {
            return null;
        }
        return RevolutShop;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
