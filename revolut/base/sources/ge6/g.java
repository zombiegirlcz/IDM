package ge6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f143234b;

    static {
        int[] iArr = new int[zd6.a.values().length];
        try {
            iArr[zd6.a.RESET_PASSWORD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zd6.a.CHANGE_PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f143233a = iArr;
        int[] iArr2 = new int[zd6.b.values().length];
        try {
            iArr2[zd6.b.WEB_CLIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[zd6.b.BROWSER_EXTENSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zd6.b.OPEN_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zd6.b.MOBILE_CLIENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f143234b = iArr2;
    }
}
