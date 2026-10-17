package lnd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f197199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f197200b;

    static {
        int[] iArr = new int[yld.c.values().length];
        try {
            iArr[yld.c.PIE_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yld.c.BAR_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yld.c.LINE_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f197199a = iArr;
        int[] iArr2 = new int[yld.d.values().length];
        try {
            iArr2[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yld.d.INCOME.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yld.d.CASHFLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yld.d.NET_BALANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yld.d.EARNINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[yld.d.SALES.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f197200b = iArr2;
    }
}
