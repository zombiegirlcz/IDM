package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum b6 implements com.google.protobuf.a1 {
    BUY(0),
    SELL(1),
    UNRECOGNIZED(-1);

    public static final int BUY_VALUE = 0;
    public static final int SELL_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new a6();
    private final int value;

    b6(int i) {
        this.value = i;
    }

    public static b6 a(int i) {
        if (i == 0) {
            return BUY;
        }
        if (i != 1) {
            return null;
        }
        return SELL;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
