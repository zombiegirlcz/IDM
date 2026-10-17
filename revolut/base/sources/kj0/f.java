package kj0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f184265a;

    static {
        int[] iArr = new int[jbm.a.values().length];
        try {
            iArr[jbm.a.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jbm.a.METRICS_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jbm.a.CLOSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jbm.a.OPEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[jbm.a.FORCED_OPEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[jbm.a.HALF_OPEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f184265a = iArr;
    }
}
