package uz;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284551a;

    static {
        int[] iArr = new int[p0.values().length];
        try {
            iArr[p0.CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p0.WAITING_FOR_MATCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p0.MATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p0.CAPTURE_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f284551a = iArr;
    }
}
