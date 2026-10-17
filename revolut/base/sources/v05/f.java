package v05;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f284747b;

    static {
        int[] iArr = new int[s05.c.values().length];
        try {
            iArr[s05.c.LOCAL_PHONE_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s05.c.CREDIT_HISTORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s05.c.PAYMENT_HABITS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s05.c.UTILISATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s05.c.APPLICATIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s05.c.PUBLIC_RECORDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s05.c.SALARY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[s05.c.ID_VERIFICATION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[s05.c.ACCOUNT_AGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[s05.c.SPEND_INCOME_RATIO.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[s05.c.WEALTH_OUTFLOW_RATIO.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[s05.c.DEBT_MANAGEMENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[s05.c.TRANSACTIONS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[s05.c.BALANCE_MANAGEMENT.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[s05.c.AFFORDABILITY.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f284746a = iArr;
        int[] iArr2 = new int[s05.b.values().length];
        try {
            iArr2[s05.b.PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[s05.b.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        f284747b = iArr2;
    }
}
