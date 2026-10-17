package cod;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f25531b;

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
        f25530a = iArr;
        int[] iArr2 = new int[yld.d.values().length];
        try {
            iArr2[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f25531b = iArr2;
    }
}
