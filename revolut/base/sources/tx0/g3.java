package tx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275144b;

    static {
        int[] iArr = new int[b3.values().length];
        try {
            iArr[b3.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b3.OPAQUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f275143a = iArr;
        int[] iArr2 = new int[a3.values().length];
        try {
            iArr2[a3.COLLAPSE_EARLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a3.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f275144b = iArr2;
    }
}
