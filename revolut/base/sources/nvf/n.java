package nvf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f219590b;

    static {
        int[] iArr = new int[zwf.d.values().length];
        try {
            iArr[zwf.d.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zwf.d.IMAGE_BASE64.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f219589a = iArr;
        int[] iArr2 = new int[zwf.b.values().length];
        try {
            iArr2[zwf.b.IMAGE_BASE64.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[zwf.b.URL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f219590b = iArr2;
    }
}
