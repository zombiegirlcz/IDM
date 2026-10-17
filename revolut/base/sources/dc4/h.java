package dc4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112795b;

    static {
        int[] iArr = new int[ht3.d.values().length];
        try {
            iArr[ht3.d.PRIMARY_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ht3.d.SECONDARY_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ht3.d.ITEM_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f112794a = iArr;
        int[] iArr2 = new int[uy3.g.values().length];
        try {
            iArr2[uy3.g.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[uy3.g.DOCUMENTS_UPLOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[uy3.g.TRY_AGAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f112795b = iArr2;
    }
}
