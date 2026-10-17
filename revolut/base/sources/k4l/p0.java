package k4l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f180994a;

    static {
        int[] iArr = new int[o0.values().length];
        try {
            iArr[o0.RECEIVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o0.PARTIALLY_FILLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o0.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o0.DECLINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f180994a = iArr;
    }
}
