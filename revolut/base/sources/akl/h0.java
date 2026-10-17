package akl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6024a;

    static {
        int[] iArr = new int[k0.values().length];
        try {
            iArr[k0.INITIATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k0.AWAITING_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k0.SIGN_IN_WITH_ACCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f6024a = iArr;
    }
}
