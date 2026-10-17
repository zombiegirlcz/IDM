package lue;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200233a;

    static {
        int[] iArr = new int[aue.c.values().length];
        try {
            iArr[aue.c.SINGLE_TRANSACTION_MAX_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aue.c.UNVERIFIED_CARDS_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[aue.c.COUNTRY_SPECIFIC_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[aue.c.CARDS_HIGH_RISK_COUNTRY_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[aue.c.DAILY_LIMIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[aue.c.ACCOUNT_LIMIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[aue.c.ALL_TRANSACTIONS_LIMIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[aue.c.WEEKLY_LIMIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[aue.c.MONTHLY_LIMIT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[aue.c.YEARLY_LIMIT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f200233a = iArr;
    }
}
