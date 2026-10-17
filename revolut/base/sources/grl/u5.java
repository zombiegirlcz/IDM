package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum u5 implements com.google.protobuf.a1 {
    STOCKS(0),
    ROBO(1),
    COMMODITIES(2),
    MMF(3),
    UNRECOGNIZED(-1);

    public static final int COMMODITIES_VALUE = 2;
    public static final int MMF_VALUE = 3;
    public static final int ROBO_VALUE = 1;
    public static final int STOCKS_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new t5();
    private final int value;

    u5(int i) {
        this.value = i;
    }

    public static u5 a(int i) {
        if (i == 0) {
            return STOCKS;
        }
        if (i == 1) {
            return ROBO;
        }
        if (i == 2) {
            return COMMODITIES;
        }
        if (i != 3) {
            return null;
        }
        return MMF;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
