package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum h2 implements com.google.protobuf.a1 {
    CARD(0),
    ADD_CARD(1),
    XPAY(2),
    BANK_TRANSFER(3),
    PAY_LATER(4),
    NO_METHOD(5),
    UNRECOGNIZED(-1);

    public static final int ADD_CARD_VALUE = 1;
    public static final int BANK_TRANSFER_VALUE = 3;
    public static final int CARD_VALUE = 0;
    public static final int NO_METHOD_VALUE = 5;
    public static final int PAY_LATER_VALUE = 4;
    public static final int XPAY_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new g2();
    private final int value;

    h2(int i) {
        this.value = i;
    }

    public static h2 a(int i) {
        if (i == 0) {
            return CARD;
        }
        if (i == 1) {
            return ADD_CARD;
        }
        if (i == 2) {
            return XPAY;
        }
        if (i == 3) {
            return BANK_TRANSFER;
        }
        if (i == 4) {
            return PAY_LATER;
        }
        if (i != 5) {
            return null;
        }
        return NO_METHOD;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
