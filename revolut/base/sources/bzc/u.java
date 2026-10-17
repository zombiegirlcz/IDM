package bzc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f19979b;

    static {
        int[] iArr = new int[xyc.e.values().length];
        try {
            iArr[xyc.e.USER_ACTION_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xyc.e.UNDER_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xyc.e.VERIFICATION_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f19978a = iArr;
        int[] iArr2 = new int[hyc.c.values().length];
        try {
            iArr2[hyc.c.UPDATE_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hyc.c.UPLOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[hyc.c.UNDER_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[hyc.c.APPROVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f19979b = iArr2;
    }
}
