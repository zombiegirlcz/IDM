package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum m2 implements com.google.protobuf.a1 {
    FIXED_TERM_CREDIT(0),
    CREDIT_CARD(1),
    BUY_NOW_PAY_LATER(2),
    CREDIT_CARD_LIMIT_INCREASE(3),
    REFINANCING_LOAN(4),
    MORTGAGE(5),
    FTC_FORBEARANCE(6),
    REFINANCING_MORTGAGE(7),
    OVERDRAFT(8),
    MORTGAGE_RENEGOTIATION(9),
    CC_FORBEARANCE(10),
    POST_TERMINATION_REPAYMENT_PLAN(11),
    POST_TERMINATION_PARTIAL_SETTLEMENTS(12),
    FAMILY_CREDIT_CARD(13),
    BASIC_CREDIT_CARD(14),
    MERCHANT_CHECKOUT_BUY_NOW_PAY_LATER(15),
    CREDIT_CARD_LIMIT_DECREASE(16),
    NON_EMBEDDED_CREDIT_INSURANCE_LOAN(17),
    NON_EMBEDDED_CREDIT_INSURANCE_CREDIT_CARD(18),
    UNRECOGNIZED(-1);

    public static final int BASIC_CREDIT_CARD_VALUE = 14;
    public static final int BUY_NOW_PAY_LATER_VALUE = 2;
    public static final int CC_FORBEARANCE_VALUE = 10;
    public static final int CREDIT_CARD_LIMIT_DECREASE_VALUE = 16;
    public static final int CREDIT_CARD_LIMIT_INCREASE_VALUE = 3;
    public static final int CREDIT_CARD_VALUE = 1;
    public static final int FAMILY_CREDIT_CARD_VALUE = 13;
    public static final int FIXED_TERM_CREDIT_VALUE = 0;
    public static final int FTC_FORBEARANCE_VALUE = 6;
    public static final int MERCHANT_CHECKOUT_BUY_NOW_PAY_LATER_VALUE = 15;
    public static final int MORTGAGE_RENEGOTIATION_VALUE = 9;
    public static final int MORTGAGE_VALUE = 5;
    public static final int NON_EMBEDDED_CREDIT_INSURANCE_CREDIT_CARD_VALUE = 18;
    public static final int NON_EMBEDDED_CREDIT_INSURANCE_LOAN_VALUE = 17;
    public static final int OVERDRAFT_VALUE = 8;
    public static final int POST_TERMINATION_PARTIAL_SETTLEMENTS_VALUE = 12;
    public static final int POST_TERMINATION_REPAYMENT_PLAN_VALUE = 11;
    public static final int REFINANCING_LOAN_VALUE = 4;
    public static final int REFINANCING_MORTGAGE_VALUE = 7;
    private static final com.google.protobuf.b1 internalValueMap = new l2();
    private final int value;

    m2(int i) {
        this.value = i;
    }

    public static m2 a(int i) {
        switch (i) {
            case 0:
                return FIXED_TERM_CREDIT;
            case 1:
                return CREDIT_CARD;
            case 2:
                return BUY_NOW_PAY_LATER;
            case 3:
                return CREDIT_CARD_LIMIT_INCREASE;
            case 4:
                return REFINANCING_LOAN;
            case 5:
                return MORTGAGE;
            case 6:
                return FTC_FORBEARANCE;
            case 7:
                return REFINANCING_MORTGAGE;
            case 8:
                return OVERDRAFT;
            case 9:
                return MORTGAGE_RENEGOTIATION;
            case 10:
                return CC_FORBEARANCE;
            case 11:
                return POST_TERMINATION_REPAYMENT_PLAN;
            case 12:
                return POST_TERMINATION_PARTIAL_SETTLEMENTS;
            case 13:
                return FAMILY_CREDIT_CARD;
            case 14:
                return BASIC_CREDIT_CARD;
            case 15:
                return MERCHANT_CHECKOUT_BUY_NOW_PAY_LATER;
            case 16:
                return CREDIT_CARD_LIMIT_DECREASE;
            case 17:
                return NON_EMBEDDED_CREDIT_INSURANCE_LOAN;
            case 18:
                return NON_EMBEDDED_CREDIT_INSURANCE_CREDIT_CARD;
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
