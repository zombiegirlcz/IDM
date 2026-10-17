package sx8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266369a;

    static {
        int[] iArr = new int[gt8.a.values().length];
        try {
            iArr[gt8.a.UPLOADING_DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gt8.a.VERIFY_IDENTITY_IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gt8.a.REVIEW_IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[gt8.a.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f266369a = iArr;
    }
}
