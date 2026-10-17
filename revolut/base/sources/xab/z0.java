package xab;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303868b;

    static {
        int[] iArr = new int[yx0.e.values().length];
        try {
            iArr[yx0.e.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yx0.e.FINGERPRINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yx0.e.FACE_ID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f303867a = iArr;
        int[] iArr2 = new int[wl0.o.values().length];
        try {
            iArr2[wl0.o.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wl0.o.FINGERPRINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wl0.o.FACE_UNLOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f303868b = iArr2;
    }
}
