package nii;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f216212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f216213b;

    static {
        int[] iArr = new int[h0.values().length];
        try {
            iArr[h0.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h0.CONFETTI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f216212a = iArr;
        int[] iArr2 = new int[u0.values().length];
        try {
            iArr2[u0.SOFT_FAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f216213b = iArr2;
    }
}
