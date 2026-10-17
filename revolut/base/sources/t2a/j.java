package t2a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267526b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.GIF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.STYLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f267525a = iArr;
        int[] iArr2 = new int[g2a.a.values().length];
        try {
            iArr2[g2a.a.GALLERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g2a.a.HORIZONTAL_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f267526b = iArr2;
    }
}
