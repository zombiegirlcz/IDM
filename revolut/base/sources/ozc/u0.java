package ozc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f231339a;

    static {
        int[] iArr = new int[gzc.t.values().length];
        try {
            iArr[gzc.t.UPLOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gzc.t.UNDER_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gzc.t.UPDATE_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[gzc.t.APPROVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f231339a = iArr;
    }
}
