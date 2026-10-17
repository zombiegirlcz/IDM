package cod;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f25535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f25536c;

    static {
        int[] iArr = new int[yld.d.values().length];
        try {
            iArr[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yld.d.INCOME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yld.d.EARNINGS.ordinal()] = 3;
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
            iArr[yld.d.NET_BALANCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f25534a = iArr;
        int[] iArr2 = new int[yld.c.values().length];
        try {
            iArr2[yld.c.LINE_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yld.c.BAR_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[yld.c.PIE_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f25535b = iArr2;
        int[] iArr3 = new int[lzi.i.values().length];
        try {
            iArr3[lzi.i.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[lzi.i.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[lzi.i.YEARLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[lzi.i.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[lzi.i.CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        f25536c = iArr3;
    }
}
