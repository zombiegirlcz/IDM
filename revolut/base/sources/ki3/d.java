package ki3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f184170a;

    static {
        int[] iArr = new int[pi3.g.values().length];
        try {
            iArr[pi3.g.VERIFICATION_IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pi3.g.VERIFICATION_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pi3.g.PAYMENT_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pi3.g.WAITING_FOR_PROCESSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f184170a = iArr;
    }
}
