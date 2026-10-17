package znd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f323724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f323725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f323726c;

    static {
        int[] iArr = new int[yld.c.values().length];
        try {
            iArr[yld.c.PIE_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yld.c.LINE_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yld.c.BAR_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f323724a = iArr;
        int[] iArr2 = new int[fnd.a.values().length];
        try {
            iArr2[fnd.a.INFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[fnd.a.OUTFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f323725b = iArr2;
        int[] iArr3 = new int[yld.d.values().length];
        try {
            iArr3[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[yld.d.INCOME.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[yld.d.NET_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[yld.d.EARNINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[yld.d.CASHFLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[yld.d.SALES.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        f323726c = iArr3;
    }
}
