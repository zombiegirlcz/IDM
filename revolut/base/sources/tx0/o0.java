package tx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275214a;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.FULLY_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n0.CHART_DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f275214a = iArr;
    }
}
