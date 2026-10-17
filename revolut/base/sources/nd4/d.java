package nd4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f214326b;

    static {
        int[] iArr = new int[ju3.g.values().length];
        try {
            iArr[ju3.g.BOTTOM_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ju3.g.STATUS_DIALOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f214325a = iArr;
        int[] iArr2 = new int[jv3.b.values().length];
        try {
            iArr2[jv3.b.MANDATORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[jv3.b.OPTIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f214326b = iArr2;
    }
}
