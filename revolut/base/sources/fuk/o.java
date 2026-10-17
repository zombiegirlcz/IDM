package fuk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138263a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.EPS_GROWTH_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.PE_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.DIVIDEND_YIELD_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f138263a = iArr;
    }
}
