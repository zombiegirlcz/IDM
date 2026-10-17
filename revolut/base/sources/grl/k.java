package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum k implements com.google.protobuf.a1 {
    CARD(0),
    ADD_CARD(1),
    XPAY(2),
    CONNECTED_BANK(3),
    DIRECT_BANK(4),
    IDEAL(5),
    PIX(6),
    SOFORT(7),
    SALARY(8),
    CHECK(9),
    REVOLUT_ACCOUNT(10),
    CASH(11),
    REQUEST_FROM_FRIEND(12),
    PAYMENT_LINK(13),
    MCY_BANK_TRANSFER(14),
    PAY_TO(15),
    UPI_APP(16),
    NET_BANKING(17),
    MCY_UPI_APP(18),
    MCY_NET_BANKING(19),
    PSE(20),
    PIX_SMART_TRANSFER(21),
    BREB(22),
    MOVE_MONEY(23),
    PAYNOW(24),
    AKAHU(25),
    GMO_PG_BANK_DIRECT(26),
    UNRECOGNIZED(-1);

    public static final int ADD_CARD_VALUE = 1;
    public static final int AKAHU_VALUE = 25;
    public static final int BREB_VALUE = 22;
    public static final int CARD_VALUE = 0;
    public static final int CASH_VALUE = 11;
    public static final int CHECK_VALUE = 9;
    public static final int CONNECTED_BANK_VALUE = 3;
    public static final int DIRECT_BANK_VALUE = 4;
    public static final int GMO_PG_BANK_DIRECT_VALUE = 26;
    public static final int IDEAL_VALUE = 5;
    public static final int MCY_BANK_TRANSFER_VALUE = 14;
    public static final int MCY_NET_BANKING_VALUE = 19;
    public static final int MCY_UPI_APP_VALUE = 18;
    public static final int MOVE_MONEY_VALUE = 23;
    public static final int NET_BANKING_VALUE = 17;
    public static final int PAYMENT_LINK_VALUE = 13;
    public static final int PAYNOW_VALUE = 24;
    public static final int PAY_TO_VALUE = 15;
    public static final int PIX_SMART_TRANSFER_VALUE = 21;
    public static final int PIX_VALUE = 6;
    public static final int PSE_VALUE = 20;
    public static final int REQUEST_FROM_FRIEND_VALUE = 12;
    public static final int REVOLUT_ACCOUNT_VALUE = 10;
    public static final int SALARY_VALUE = 8;
    public static final int SOFORT_VALUE = 7;
    public static final int UPI_APP_VALUE = 16;
    public static final int XPAY_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new j();
    private final int value;

    k(int i) {
        this.value = i;
    }

    public static k a(int i) {
        switch (i) {
            case 0:
                return CARD;
            case 1:
                return ADD_CARD;
            case 2:
                return XPAY;
            case 3:
                return CONNECTED_BANK;
            case 4:
                return DIRECT_BANK;
            case 5:
                return IDEAL;
            case 6:
                return PIX;
            case 7:
                return SOFORT;
            case 8:
                return SALARY;
            case 9:
                return CHECK;
            case 10:
                return REVOLUT_ACCOUNT;
            case 11:
                return CASH;
            case 12:
                return REQUEST_FROM_FRIEND;
            case 13:
                return PAYMENT_LINK;
            case 14:
                return MCY_BANK_TRANSFER;
            case 15:
                return PAY_TO;
            case 16:
                return UPI_APP;
            case 17:
                return NET_BANKING;
            case 18:
                return MCY_UPI_APP;
            case 19:
                return MCY_NET_BANKING;
            case 20:
                return PSE;
            case 21:
                return PIX_SMART_TRANSFER;
            case 22:
                return BREB;
            case 23:
                return MOVE_MONEY;
            case 24:
                return PAYNOW;
            case 25:
                return AKAHU;
            case 26:
                return GMO_PG_BANK_DIRECT;
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
