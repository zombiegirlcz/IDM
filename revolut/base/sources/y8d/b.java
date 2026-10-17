package y8d;

import f7d.i;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311654a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.CATEGORY_ADDING_MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.CATEGORY_APP_FEATURES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.CATEGORY_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.CATEGORY_CARDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i.CATEGORY_CARD_PAYMENTS_WITHDRAWALS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[i.CATEGORY_CREDIT_PRODUCTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[i.CATEGORY_EMPLOYEE_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[i.CATEGORY_EMPLOYEE_EXPLORING_REVOLUT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[i.CATEGORY_EMPLOYEE_GETTING_STARTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[i.CATEGORY_EMPLOYEE_MORE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[i.CATEGORY_EMPLOYEE_PROFILE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[i.CATEGORY_EMPLOYEE_TRANSACTION.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[i.CATEGORY_EXPLORING_REVOLUT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[i.CATEGORY_GETTING_STARTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[i.CATEGORY_INSURANCE_PRODUCTS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[i.CATEGORY_MAKING_PAYMENTS.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[i.CATEGORY_MAKING_PAYMENTS_BUSINESS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[i.CATEGORY_MANAGING_MY_BUSINESS.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[i.CATEGORY_MERCHANT_ACCOUNTS.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[i.CATEGORY_MORE.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[i.CATEGORY_MY_ACCOUNTS.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[i.CATEGORY_PROFILE.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[i.CATEGORY_PROFILE_AND_PLAN.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[i.CATEGORY_RECEIVING_PAYMENTS.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[i.CATEGORY_REFERRALS.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[i.CATEGORY_SECURITY_LOGGING_IN.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[i.CATEGORY_SETTING_UP_ACCOUNT.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[i.CATEGORY_SIGN_UP.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[i.CATEGORY_STAYS.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[i.CATEGORY_TRANSACTION.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[i.CATEGORY_TRANSFERS.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[i.CATEGORY_WEALTH.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[i.CATEGORY_UPCOMING_PAYMENTS.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[i.PROFILE_AND_SETTING.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[i.INTEGRATING_EXT_APPS.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[i.BUSINESS_ACCOUNT.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[i.CATEGORY_RESTRICTIONS_AND_VERIFICATIONS.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[i.CATEGORY_ACCOUNT_MANAGEMENT_PLANS_AND_BILLINGS.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[i.CATEGORY_TRANSFERS_INBOUND_OUTBOUND_AND_RECURRING.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[i.CATEGORY_TEAM_AND_SPEND_CONTROLS.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[i.CATEGORY_EXPENDS_AND_INVOICING.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[i.CATEGORY_CURRENCY_EXCHANGE_CRYPTO_AND_SAVINGS.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[i.CATEGORY_DATA_PROTECTION_AND_FRAUD_PREVENTION.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[i.CATEGORY_HELP_CENTER.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[i.UNKNOWN.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        f311654a = iArr;
    }
}
