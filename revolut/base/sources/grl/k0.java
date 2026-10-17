package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum k0 implements com.google.protobuf.a1 {
    STOCK(0),
    ETF(1),
    BOND(2),
    CFD(3),
    COMMODITY(4),
    UNRECOGNIZED(-1);

    public static final int BOND_VALUE = 2;
    public static final int CFD_VALUE = 3;
    public static final int COMMODITY_VALUE = 4;
    public static final int ETF_VALUE = 1;
    public static final int STOCK_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new j0();
    private final int value;

    k0(int i) {
        this.value = i;
    }

    public static k0 a(int i) {
        if (i == 0) {
            return STOCK;
        }
        if (i == 1) {
            return ETF;
        }
        if (i == 2) {
            return BOND;
        }
        if (i == 3) {
            return CFD;
        }
        if (i != 4) {
            return null;
        }
        return COMMODITY;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
