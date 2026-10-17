package h9g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150254a;

    static {
        int[] iArr = new int[cgi.b.values().length];
        try {
            iArr[cgi.b.ANYTIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cgi.b.BEFORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cgi.b.WINDOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cgi.b.AFTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f150254a = iArr;
    }
}
