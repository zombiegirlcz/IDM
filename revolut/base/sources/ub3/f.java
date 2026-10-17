package ub3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278737a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.METRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.IMPERIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f278737a = iArr;
    }
}
