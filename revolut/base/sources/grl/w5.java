package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum w5 implements com.google.protobuf.a1 {
    PUSH(0),
    INBOX(1),
    CROSS_SELL_BANNER(2),
    INVEST_PAGE(3),
    UNRECOGNIZED(-1);

    public static final int CROSS_SELL_BANNER_VALUE = 2;
    public static final int INBOX_VALUE = 1;
    public static final int INVEST_PAGE_VALUE = 3;
    public static final int PUSH_VALUE = 0;
    private static final com.google.protobuf.b1 internalValueMap = new v5();
    private final int value;

    w5(int i) {
        this.value = i;
    }

    public static w5 a(int i) {
        if (i == 0) {
            return PUSH;
        }
        if (i == 1) {
            return INBOX;
        }
        if (i == 2) {
            return CROSS_SELL_BANNER;
        }
        if (i != 3) {
            return null;
        }
        return INVEST_PAGE;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
