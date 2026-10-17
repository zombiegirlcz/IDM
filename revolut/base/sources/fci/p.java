package fci;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f133801a;

    static {
        int[] iArr = new int[cci.g.values().length];
        try {
            iArr[cci.g.ATM_WITHDRAWAL_ABROAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cci.g.ATM_WITHDRAWAL_DOMESTIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cci.g.BUDGETING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cci.g.CASHBACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cci.g.COMMODITIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cci.g.CRYPTO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[cci.g.DAILY_PURCHASE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[cci.g.DIRECT_DEBITS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[cci.g.DISPOSABLE_CARDS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[cci.g.FX.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[cci.g.INVESTING.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[cci.g.JUNIOR.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[cci.g.LINKED_ACCOUNTS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[cci.g.LIVING_ABROAD.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[cci.g.LOCAL_AUTHORITIES.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[cci.g.MANAGE_PROPERTY.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[cci.g.METAL.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[cci.g.MORTGAGE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[cci.g.ONLINE_PURCHASE.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[cci.g.P2P.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[cci.g.P2P_DOMESTIC.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[cci.g.P2P_EUR.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[cci.g.PAYMENTS.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[cci.g.PURCHASE_PROTECTION.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[cci.g.RECURRING_PAYMENTS.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[cci.g.REMITTANCE.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[cci.g.REMITTANCE_ABROAD.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[cci.g.REMITTANCE_DOMESTIC.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[cci.g.REMITTANCE_REV_USER.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[cci.g.REMITTANCE_SELF_ABROAD.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[cci.g.REMITTANCE_SELF_DOMESTIC.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[cci.g.RENT.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[cci.g.SALARY.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[cci.g.SAVINGS.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[cci.g.SMART_DELAY.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[cci.g.SPENDING.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[cci.g.SPENDING_ABROAD.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[cci.g.SPENDING_DOMESTIC.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[cci.g.STOCKS.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[cci.g.SUBSCRIPTIONS.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[cci.g.TRADING_ABROAD.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[cci.g.TRADING_COMMODITIES.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[cci.g.TRADING_DOMESTIC.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[cci.g.TRAVEL_INSURANCE.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[cci.g.UTILITIES.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[cci.g.VAULTS.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[cci.g.VIRTUAL_CARDS.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        f133801a = iArr;
    }
}
