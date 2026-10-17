package foc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136919a;

    static {
        int[] iArr = new int[hoc.a.values().length];
        try {
            iArr[hoc.a.SIMULATED_PORTFOLIO_PERFORMANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hoc.a.HISTORICAL_PORTFOLIO_PERFORMANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hoc.a.HISTORICAL_TEMPLATE_PERFORMANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f136919a = iArr;
    }
}
