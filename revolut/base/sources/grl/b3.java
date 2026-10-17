package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum b3 implements com.google.protobuf.a1 {
    CardReader(0),
    TapToPay(1),
    UNRECOGNIZED(-1);

    public static final int CardReader_VALUE = 0;
    public static final int TapToPay_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new a3();
    private final int value;

    b3(int i) {
        this.value = i;
    }

    public static b3 a(int i) {
        if (i == 0) {
            return CardReader;
        }
        if (i != 1) {
            return null;
        }
        return TapToPay;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
