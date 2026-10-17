package om4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f226767a;

    static {
        int[] iArr = new int[bb5.a.values().length];
        try {
            iArr[bb5.a.ACTION_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bb5.a.WAITING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bb5.a.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bb5.a.OFFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bb5.a.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f226767a = iArr;
    }
}
