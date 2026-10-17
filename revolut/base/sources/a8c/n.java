package a8c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f2171b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.APP_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.WEB_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2170a = iArr;
        int[] iArr2 = new int[x7c.a.values().length];
        try {
            iArr2[x7c.a.VERIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[x7c.a.UNVERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f2171b = iArr2;
    }
}
