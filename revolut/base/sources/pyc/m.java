package pyc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f240789b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.USER_ACTION_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.UNDER_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f240788a = iArr;
        int[] iArr2 = new int[hyc.c.values().length];
        try {
            iArr2[hyc.c.UPDATE_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[hyc.c.UPLOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hyc.c.UNDER_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[hyc.c.APPROVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f240789b = iArr2;
    }
}
