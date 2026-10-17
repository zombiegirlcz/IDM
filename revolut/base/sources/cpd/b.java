package cpd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f107930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f107931c;

    static {
        int[] iArr = new int[yld.d.values().length];
        try {
            iArr[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yld.d.NET_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yld.d.INCOME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yld.d.CASHFLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yld.d.SALES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[yld.d.EARNINGS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f107929a = iArr;
        int[] iArr2 = new int[yld.c.values().length];
        try {
            iArr2[yld.c.PIE_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yld.c.BAR_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[yld.c.LINE_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f107930b = iArr2;
        int[] iArr3 = new int[zod.a.values().length];
        try {
            iArr3[zod.a.CASHFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[zod.a.SPENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[zod.a.EXPENSES.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[zod.a.NET_BALANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[zod.a.INCOME.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[zod.a.SALES.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        f107931c = iArr3;
    }
}
