package c6f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21800a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.MAIN_CHART_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.MAIN_AND_ADDITIONAL_CHARTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21800a = iArr;
    }
}
