package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210143b;

    static {
        int[] iArr = new int[y8.values().length];
        try {
            iArr[y8.GALLERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y8.PREVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f210142a = iArr;
        int[] iArr2 = new int[xv0.k.values().length];
        try {
            iArr2[xv0.k.BEGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[xv0.k.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f210143b = iArr2;
    }
}
