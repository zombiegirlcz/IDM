package lnd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f197194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f197195b;

    static {
        int[] iArr = new int[lzi.i.values().length];
        try {
            iArr[lzi.i.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lzi.i.YEARLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lzi.i.WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lzi.i.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lzi.i.CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f197194a = iArr;
        int[] iArr2 = new int[yld.c.values().length];
        try {
            iArr2[yld.c.PIE_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yld.c.BAR_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yld.c.LINE_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f197195b = iArr2;
    }
}
