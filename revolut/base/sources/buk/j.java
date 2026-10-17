package buk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18902a;

    static {
        int[] iArr = new int[fuk.b.values().length];
        try {
            iArr[fuk.b.EPS_GROWTH_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fuk.b.PE_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fuk.b.DIVIDEND_YIELD_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18902a = iArr;
    }
}
