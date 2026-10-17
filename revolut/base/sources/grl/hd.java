package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum hd implements com.google.protobuf.a1 {
    ADR(0),
    ETF(1),
    ETC(2),
    ETN(3),
    EQUITY(4),
    WARRANT(5),
    SPAC(6),
    CFD(7),
    BOND(8),
    COMMODITY(9),
    FUND(10),
    MUTUAL_FUND(11),
    STRUCTURED_NOTE(12),
    OPTION(13),
    UNRECOGNIZED(-1);

    public static final int ADR_VALUE = 0;
    public static final int BOND_VALUE = 8;
    public static final int CFD_VALUE = 7;
    public static final int COMMODITY_VALUE = 9;
    public static final int EQUITY_VALUE = 4;
    public static final int ETC_VALUE = 2;
    public static final int ETF_VALUE = 1;
    public static final int ETN_VALUE = 3;
    public static final int FUND_VALUE = 10;
    public static final int MUTUAL_FUND_VALUE = 11;
    public static final int OPTION_VALUE = 13;
    public static final int SPAC_VALUE = 6;
    public static final int STRUCTURED_NOTE_VALUE = 12;
    public static final int WARRANT_VALUE = 5;
    private static final com.google.protobuf.b1 internalValueMap = new gd();
    private final int value;

    hd(int i) {
        this.value = i;
    }

    public static hd a(int i) {
        switch (i) {
            case 0:
                return ADR;
            case 1:
                return ETF;
            case 2:
                return ETC;
            case 3:
                return ETN;
            case 4:
                return EQUITY;
            case 5:
                return WARRANT;
            case 6:
                return SPAC;
            case 7:
                return CFD;
            case 8:
                return BOND;
            case 9:
                return COMMODITY;
            case 10:
                return FUND;
            case 11:
                return MUTUAL_FUND;
            case 12:
                return STRUCTURED_NOTE;
            case 13:
                return OPTION;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
