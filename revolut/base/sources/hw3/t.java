package hw3;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f156085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f156086b;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.PDF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f156085a = iArr;
        int[] iArr2 = new int[jv3.a.values().length];
        try {
            iArr2[jv3.a.MUST_EXIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[jv3.a.MUST_NOT_EXIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f156086b = iArr2;
    }
}
