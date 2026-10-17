package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum r2 implements com.google.protobuf.a1 {
    DISCOVER(0),
    ACCOUNT_SWITCHER(1),
    CREDIT_APPLICATION_DASHBOARD(2),
    CARD_ORDERING(3),
    CARD_ORDERING_MULTI(4),
    ADD_MONEY(5),
    TOTAL_WEALTH(6),
    TOTAL_WEALTH_DISCOVER(7),
    SHOPS(8),
    PREMIUM_HUB(9),
    ACCOUNT_DETAILS(10),
    PURCHASES_LIST(11),
    MAX_PURCHASE_AMOUNT(12),
    INSTALMENT_DETAILS(13),
    TRANSACTION_DETAILS(14),
    TRANSACTION_SWIPE(15),
    TRANSACTION_CONTEXT_MENU(16),
    TRANSACTION_INSTALMENT(17),
    TRANSACTION_PAY_IN_INSTALMENTS(18),
    DEEPLINK(19),
    PCW(20),
    ADD_NEW_PRODUCT_WIDGET(21),
    FINANCIAL_DIFFICULTIES(22),
    APPLICATION_REJECTED(23),
    APPLICATION_EXPIRED(24),
    CALCULATOR_SWITCH_TO_REFINANCING(25),
    GLOBAL_SEARCH(26),
    PAY_LATER_SWITCH(27),
    ADD_NEW_PRODUCT(28),
    GET_CREDIT(29),
    CARDS_LIST(30),
    CARDS_WIDGET(31),
    RETAIL_ONBOARDING(32),
    HOME(33),
    REVOLUT_PAY(34),
    CARDHOLDERS_WIDGET(35),
    CREDIT_LIMIT_CAP(36),
    PRODUCT_ARTICLES_RECREATE(37),
    CREDIT_APPLICATION_CHECKLIST(38),
    CREDIT_HEALTH(39),
    REV_POINTS_EARN_HUB(40),
    UNRECOGNIZED(-1);

    public static final int ACCOUNT_DETAILS_VALUE = 10;
    public static final int ACCOUNT_SWITCHER_VALUE = 1;
    public static final int ADD_MONEY_VALUE = 5;
    public static final int ADD_NEW_PRODUCT_VALUE = 28;
    public static final int ADD_NEW_PRODUCT_WIDGET_VALUE = 21;
    public static final int APPLICATION_EXPIRED_VALUE = 24;
    public static final int APPLICATION_REJECTED_VALUE = 23;
    public static final int CALCULATOR_SWITCH_TO_REFINANCING_VALUE = 25;
    public static final int CARDHOLDERS_WIDGET_VALUE = 35;
    public static final int CARDS_LIST_VALUE = 30;
    public static final int CARDS_WIDGET_VALUE = 31;
    public static final int CARD_ORDERING_MULTI_VALUE = 4;
    public static final int CARD_ORDERING_VALUE = 3;
    public static final int CREDIT_APPLICATION_CHECKLIST_VALUE = 38;
    public static final int CREDIT_APPLICATION_DASHBOARD_VALUE = 2;
    public static final int CREDIT_HEALTH_VALUE = 39;
    public static final int CREDIT_LIMIT_CAP_VALUE = 36;
    public static final int DEEPLINK_VALUE = 19;
    public static final int DISCOVER_VALUE = 0;
    public static final int FINANCIAL_DIFFICULTIES_VALUE = 22;
    public static final int GET_CREDIT_VALUE = 29;
    public static final int GLOBAL_SEARCH_VALUE = 26;
    public static final int HOME_VALUE = 33;
    public static final int INSTALMENT_DETAILS_VALUE = 13;
    public static final int MAX_PURCHASE_AMOUNT_VALUE = 12;
    public static final int PAY_LATER_SWITCH_VALUE = 27;
    public static final int PCW_VALUE = 20;
    public static final int PREMIUM_HUB_VALUE = 9;
    public static final int PRODUCT_ARTICLES_RECREATE_VALUE = 37;
    public static final int PURCHASES_LIST_VALUE = 11;
    public static final int RETAIL_ONBOARDING_VALUE = 32;
    public static final int REVOLUT_PAY_VALUE = 34;
    public static final int REV_POINTS_EARN_HUB_VALUE = 40;
    public static final int SHOPS_VALUE = 8;
    public static final int TOTAL_WEALTH_DISCOVER_VALUE = 7;
    public static final int TOTAL_WEALTH_VALUE = 6;
    public static final int TRANSACTION_CONTEXT_MENU_VALUE = 16;
    public static final int TRANSACTION_DETAILS_VALUE = 14;
    public static final int TRANSACTION_INSTALMENT_VALUE = 17;
    public static final int TRANSACTION_PAY_IN_INSTALMENTS_VALUE = 18;
    public static final int TRANSACTION_SWIPE_VALUE = 15;
    private static final com.google.protobuf.b1 internalValueMap = new q2();
    private final int value;

    r2(int i) {
        this.value = i;
    }

    public static r2 a(int i) {
        switch (i) {
            case 0:
                return DISCOVER;
            case 1:
                return ACCOUNT_SWITCHER;
            case 2:
                return CREDIT_APPLICATION_DASHBOARD;
            case 3:
                return CARD_ORDERING;
            case 4:
                return CARD_ORDERING_MULTI;
            case 5:
                return ADD_MONEY;
            case 6:
                return TOTAL_WEALTH;
            case 7:
                return TOTAL_WEALTH_DISCOVER;
            case 8:
                return SHOPS;
            case 9:
                return PREMIUM_HUB;
            case 10:
                return ACCOUNT_DETAILS;
            case 11:
                return PURCHASES_LIST;
            case 12:
                return MAX_PURCHASE_AMOUNT;
            case 13:
                return INSTALMENT_DETAILS;
            case 14:
                return TRANSACTION_DETAILS;
            case 15:
                return TRANSACTION_SWIPE;
            case 16:
                return TRANSACTION_CONTEXT_MENU;
            case 17:
                return TRANSACTION_INSTALMENT;
            case 18:
                return TRANSACTION_PAY_IN_INSTALMENTS;
            case 19:
                return DEEPLINK;
            case 20:
                return PCW;
            case 21:
                return ADD_NEW_PRODUCT_WIDGET;
            case 22:
                return FINANCIAL_DIFFICULTIES;
            case 23:
                return APPLICATION_REJECTED;
            case 24:
                return APPLICATION_EXPIRED;
            case 25:
                return CALCULATOR_SWITCH_TO_REFINANCING;
            case 26:
                return GLOBAL_SEARCH;
            case 27:
                return PAY_LATER_SWITCH;
            case 28:
                return ADD_NEW_PRODUCT;
            case 29:
                return GET_CREDIT;
            case 30:
                return CARDS_LIST;
            case 31:
                return CARDS_WIDGET;
            case 32:
                return RETAIL_ONBOARDING;
            case 33:
                return HOME;
            case 34:
                return REVOLUT_PAY;
            case 35:
                return CARDHOLDERS_WIDGET;
            case 36:
                return CREDIT_LIMIT_CAP;
            case 37:
                return PRODUCT_ARTICLES_RECREATE;
            case 38:
                return CREDIT_APPLICATION_CHECKLIST;
            case 39:
                return CREDIT_HEALTH;
            case 40:
                return REV_POINTS_EARN_HUB;
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
