package at;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8956a;

    static {
        int[] iArr = new int[vs.f.values().length];
        try {
            iArr[vs.f.EXPIRY_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vs.f.SECURITY_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vs.f.DATE_OF_BIRTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8956a = iArr;
    }
}
