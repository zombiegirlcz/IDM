package sl;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264027a;

    static {
        int[] iArr = new int[ml.f.values().length];
        try {
            iArr[ml.f.DOCUMENT_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ml.f.DOCUMENT_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ml.f.DOCUMENT_NFC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f264027a = iArr;
    }
}
