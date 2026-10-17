package ni4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f215641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f215642b;

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
        f215641a = iArr;
        int[] iArr2 = new int[ju3.h.values().length];
        try {
            iArr2[ju3.h.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ju3.h.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f215642b = iArr2;
    }
}
