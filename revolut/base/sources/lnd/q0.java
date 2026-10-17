package lnd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f197197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f197198b;

    static {
        int[] iArr = new int[amd.i.values().length];
        try {
            iArr[amd.i.CATEGORIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[amd.i.TRANSACTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[amd.i.MERCHANTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[amd.i.COUNTRIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[amd.i.CURRENCIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[amd.i.CARDHOLDERS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[amd.i.PARTICIPANTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[amd.i.SOURCE_ACCOUNTS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[amd.i.CARDS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f197197a = iArr;
        int[] iArr2 = new int[yld.d.values().length];
        try {
            iArr2[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[yld.d.INCOME.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[yld.d.NET_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[yld.d.EARNINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[yld.d.CASHFLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[yld.d.SALES.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        f197198b = iArr2;
    }
}
