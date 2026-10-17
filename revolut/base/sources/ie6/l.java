package ie6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f160641a;

    static {
        int[] iArr = new int[zd6.b.values().length];
        try {
            iArr[zd6.b.WEB_CLIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zd6.b.BROWSER_EXTENSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zd6.b.OPEN_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zd6.b.MOBILE_CLIENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f160641a = iArr;
    }
}
