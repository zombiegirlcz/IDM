package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum tb implements com.google.protobuf.a1 {
    STAYS(0),
    EXPERIENCES(1),
    SHOPS(2),
    TAB_HEADER(3),
    HOME_WIDGET(4),
    MILES(5),
    GIFT_CARD(6),
    POINTS_POCKET(7),
    PLAN_HUB(8),
    EXCLUSIVE_STORE(9),
    DEEPLINK(10),
    CARD_SELECTION(11),
    CASHBACK(12),
    CREDIT_WIDGET(13),
    ESIM(14),
    LOUNGES(15),
    TRANSPORT(16),
    TRANSACTION_DETAILS(17),
    REVPAY(18),
    DONATIONS(19),
    CHALLENGES_PREVIEW(20),
    ONBOARDING(21),
    TAB_AUTO_PROMPT(22),
    LOYALTY_SAVINGS(23),
    POINTS_POCKET_DISCOVERY(24),
    SPEND_ANALYTICS(25),
    POINTS_EXPIRY(26),
    FLIGHTS(27),
    RENT_AND_BILLS(28),
    AIRPORT_TRANSFERS(29),
    TRAINS_POINTS(30),
    LUGGAGE_STORAGE(31),
    STATIONS(32),
    UNRECOGNIZED(-1);

    public static final int AIRPORT_TRANSFERS_VALUE = 29;
    public static final int CARD_SELECTION_VALUE = 11;
    public static final int CASHBACK_VALUE = 12;
    public static final int CHALLENGES_PREVIEW_VALUE = 20;
    public static final int CREDIT_WIDGET_VALUE = 13;
    public static final int DEEPLINK_VALUE = 10;
    public static final int DONATIONS_VALUE = 19;
    public static final int ESIM_VALUE = 14;
    public static final int EXCLUSIVE_STORE_VALUE = 9;
    public static final int EXPERIENCES_VALUE = 1;
    public static final int FLIGHTS_VALUE = 27;
    public static final int GIFT_CARD_VALUE = 6;
    public static final int HOME_WIDGET_VALUE = 4;
    public static final int LOUNGES_VALUE = 15;
    public static final int LOYALTY_SAVINGS_VALUE = 23;
    public static final int LUGGAGE_STORAGE_VALUE = 31;
    public static final int MILES_VALUE = 5;
    public static final int ONBOARDING_VALUE = 21;
    public static final int PLAN_HUB_VALUE = 8;
    public static final int POINTS_EXPIRY_VALUE = 26;
    public static final int POINTS_POCKET_DISCOVERY_VALUE = 24;
    public static final int POINTS_POCKET_VALUE = 7;
    public static final int RENT_AND_BILLS_VALUE = 28;
    public static final int REVPAY_VALUE = 18;
    public static final int SHOPS_VALUE = 2;
    public static final int SPEND_ANALYTICS_VALUE = 25;
    public static final int STATIONS_VALUE = 32;
    public static final int STAYS_VALUE = 0;
    public static final int TAB_AUTO_PROMPT_VALUE = 22;
    public static final int TAB_HEADER_VALUE = 3;
    public static final int TRAINS_POINTS_VALUE = 30;
    public static final int TRANSACTION_DETAILS_VALUE = 17;
    public static final int TRANSPORT_VALUE = 16;
    private static final com.google.protobuf.b1 internalValueMap = new sb();
    private final int value;

    tb(int i) {
        this.value = i;
    }

    public static tb a(int i) {
        switch (i) {
            case 0:
                return STAYS;
            case 1:
                return EXPERIENCES;
            case 2:
                return SHOPS;
            case 3:
                return TAB_HEADER;
            case 4:
                return HOME_WIDGET;
            case 5:
                return MILES;
            case 6:
                return GIFT_CARD;
            case 7:
                return POINTS_POCKET;
            case 8:
                return PLAN_HUB;
            case 9:
                return EXCLUSIVE_STORE;
            case 10:
                return DEEPLINK;
            case 11:
                return CARD_SELECTION;
            case 12:
                return CASHBACK;
            case 13:
                return CREDIT_WIDGET;
            case 14:
                return ESIM;
            case 15:
                return LOUNGES;
            case 16:
                return TRANSPORT;
            case 17:
                return TRANSACTION_DETAILS;
            case 18:
                return REVPAY;
            case 19:
                return DONATIONS;
            case 20:
                return CHALLENGES_PREVIEW;
            case 21:
                return ONBOARDING;
            case 22:
                return TAB_AUTO_PROMPT;
            case 23:
                return LOYALTY_SAVINGS;
            case 24:
                return POINTS_POCKET_DISCOVERY;
            case 25:
                return SPEND_ANALYTICS;
            case 26:
                return POINTS_EXPIRY;
            case 27:
                return FLIGHTS;
            case 28:
                return RENT_AND_BILLS;
            case 29:
                return AIRPORT_TRANSFERS;
            case 30:
                return TRAINS_POINTS;
            case 31:
                return LUGGAGE_STORAGE;
            case 32:
                return STATIONS;
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
