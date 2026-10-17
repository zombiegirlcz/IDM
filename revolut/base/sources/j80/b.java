package j80;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f172076a;

    static {
        int[] iArr = new int[i80.b.values().length];
        try {
            iArr[i80.b.QR_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i80.b.BARCODE_CODE_39.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i80.b.BARCODE_CODE_128.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i80.b.BARCODE_EAN_13.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f172076a = iArr;
    }
}
