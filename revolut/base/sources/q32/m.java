package q32;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f241781a;

    static {
        int[] iArr = new int[g12.a.values().length];
        try {
            iArr[g12.a.QR_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g12.a.BARCODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f241781a = iArr;
    }
}
