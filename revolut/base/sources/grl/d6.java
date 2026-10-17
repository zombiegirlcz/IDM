package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum d6 implements com.google.protobuf.a1 {
    MARKET(0),
    LIMIT(1),
    STOP(2),
    RECURRING(3),
    UNRECOGNIZED(-1);

    public static final int LIMIT_VALUE = 1;
    public static final int MARKET_VALUE = 0;
    public static final int RECURRING_VALUE = 3;
    public static final int STOP_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new c6();
    private final int value;

    d6(int i) {
        this.value = i;
    }

    public static d6 a(int i) {
        if (i == 0) {
            return MARKET;
        }
        if (i == 1) {
            return LIMIT;
        }
        if (i == 2) {
            return STOP;
        }
        if (i != 3) {
            return null;
        }
        return RECURRING;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
