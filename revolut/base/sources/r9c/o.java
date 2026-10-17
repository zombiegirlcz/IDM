package r9c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252568a;

    static {
        int[] iArr = new int[f6c.a.values().length];
        try {
            iArr[f6c.a.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f6c.a.SDK_EXPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f6c.a.WEB_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f252568a = iArr;
    }
}
