package sf1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f262258a;

    static {
        int[] iArr = new int[qf1.f.values().length];
        try {
            iArr[qf1.f.CURRENCY_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qf1.f.SWITCH_SALARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qf1.f.JOINT_ACCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qf1.f.PERSONAL_SAVINGS_ACCOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qf1.f.JUNIOR_SAVINGS_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[qf1.f.JOINT_SAVINGS_ACCOUNT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[qf1.f.LINKED_ACCOUNT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[qf1.f.PERSONAL_POCKET.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[qf1.f.GROUP_POCKET.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[qf1.f.JOINT_POCKET.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[qf1.f.TRAVEL_MILES.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[qf1.f.TRAVEL_STAYS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[qf1.f.TRAVEL_LOUNGES.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[qf1.f.TRAVEL_ASFT.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[qf1.f.TRAVEL_EXPERIENCES.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[qf1.f.TRANSPORT.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[qf1.f.LIFESTYLE_SHOPS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[qf1.f.LIFESTYLE_GIFT_CARDS.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[qf1.f.LIFESTYLE_INSURANCES.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[qf1.f.DONATIONS.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[qf1.f.ESIM.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[qf1.f.BUDGET.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[qf1.f.INCOME_SORTER.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[qf1.f.ACCOUNT_SWITCH.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[qf1.f.PRO_ACCOUNT.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[qf1.f.PRO_POCKET.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[qf1.f.PRO_TAX_POCKET.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[qf1.f.JUNIOR_POCKET.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[qf1.f.INVEST_SECURITIES.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[qf1.f.INVEST_TAA_ISA.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[qf1.f.INVEST_TAA_CUSTODIAN_JISA.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[qf1.f.INVEST_TAA_PERSONAL_JISA.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[qf1.f.INVEST_TAA_PEA.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[qf1.f.INVEST_ROBO.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[qf1.f.INVEST_SECURITIES_JOINT.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[qf1.f.INVEST_CFD.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[qf1.f.INVEST_GIA_MARGIN.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[qf1.f.INVEST_COMMODITIES.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[qf1.f.INVEST_BONDS.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[qf1.f.INVEST_ETFS.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[qf1.f.INVEST_PRIVATE_MARKETS.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[qf1.f.JUNIOR_ACCOUNT.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[qf1.f.CREDIT_CARD.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[qf1.f.SECURED_CREDIT_CARD.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[qf1.f.CREDIT_BUILDER_CARD.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[qf1.f.BALANCE_TRANSFER_CREDIT_CARD.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[qf1.f.LOAN.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[qf1.f.REFINANCING_LOAN.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[qf1.f.HOME_IMPROVEMENT_LOAN.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[qf1.f.MORTGAGE.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[qf1.f.REFINANCING_MORTGAGE.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[qf1.f.OVERDRAFT.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[qf1.f.PAY_LATER.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[qf1.f.CRYPTO_TRADING.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[qf1.f.CRYPTO_EARN.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[qf1.f.CRYPTO_LEARN.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[qf1.f.CRYPTO_STRATEGIES.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[qf1.f.CRYPTO_REVOLUT_X.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[qf1.f.REV_POINTS_POCKET.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[qf1.f.LIFESTYLE_PARTNERS.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[qf1.f.STUDENT.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        f262258a = iArr;
    }
}
