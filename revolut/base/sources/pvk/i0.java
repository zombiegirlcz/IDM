package pvk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240284a;

    static {
        int[] iArr = new int[mel.c0.values().length];
        try {
            iArr[mel.c0.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mel.c0.NEUTRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mel.c0.NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f240284a = iArr;
    }
}
