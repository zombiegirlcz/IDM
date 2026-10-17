package ei0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126332a;

    static {
        int[] iArr = new int[fh0.b.values().length];
        try {
            iArr[fh0.b.BARCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fh0.b.TEXT_RECOGNITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fh0.b.TEXT_RECOGNITION_JAPANESE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f126332a = iArr;
    }
}
