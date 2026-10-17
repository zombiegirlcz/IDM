package cu8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108884a;

    static {
        int[] iArr = new int[gt8.a.values().length];
        try {
            iArr[gt8.a.VERIFY_IDENTITY_IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gt8.a.REVIEW_IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108884a = iArr;
    }
}
