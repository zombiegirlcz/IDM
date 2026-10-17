package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum k6 implements com.google.protobuf.a1 {
    PORTFOLIO(0),
    DISCOVER(1),
    UNRECOGNIZED(-1);

    public static final int DISCOVER_VALUE = 1;
    public static final int PORTFOLIO_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new j6();
    private final int value;

    k6(int i) {
        this.value = i;
    }

    public static k6 a(int i) {
        if (i == 0) {
            return PORTFOLIO;
        }
        if (i != 1) {
            return null;
        }
        return DISCOVER;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
