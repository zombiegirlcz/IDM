package ivc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f168824b;

    static {
        int[] iArr = new int[h86.c.values().length];
        try {
            iArr[h86.c.MOBILE_BROWSER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h86.c.BROWSER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h86.c.MOBILE_APP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f168823a = iArr;
        int[] iArr2 = new int[h86.a.values().length];
        try {
            iArr2[h86.a.APPLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[h86.a.ANDROID.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[h86.a.BROWSER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[h86.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f168824b = iArr2;
    }
}
