package ia3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159928a;

    static {
        int[] iArr = new int[c90.b.values().length];
        try {
            iArr[c90.b.MDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c90.b.HDPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c90.b.XHDPI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c90.b.XXHDPI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c90.b.XXXHDPI.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f159928a = iArr;
    }
}
