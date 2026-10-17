package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum g0 implements com.google.protobuf.a1 {
    CRYPTO(0),
    COMMODITY(1),
    STOCK(2),
    FIAT(3),
    UNRECOGNIZED(-1);

    public static final int COMMODITY_VALUE = 1;
    public static final int CRYPTO_VALUE = 0;
    public static final int FIAT_VALUE = 3;
    public static final int STOCK_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new f0();
    private final int value;

    g0(int i) {
        this.value = i;
    }

    public static g0 a(int i) {
        if (i == 0) {
            return CRYPTO;
        }
        if (i == 1) {
            return COMMODITY;
        }
        if (i == 2) {
            return STOCK;
        }
        if (i != 3) {
            return null;
        }
        return FIAT;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
