package uz;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284476a;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.FACE_MATCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.FRAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f284476a = iArr;
    }
}
