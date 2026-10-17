package ozc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f231284a;

    static {
        int[] iArr = new int[gzc.x.values().length];
        try {
            iArr[gzc.x.SUBMITTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gzc.x.IN_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gzc.x.VERIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[gzc.x.ACTION_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f231284a = iArr;
    }
}
