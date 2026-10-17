package v4g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f286089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f286090b;

    static {
        int[] iArr = new int[o7g.d.values().length];
        try {
            iArr[o7g.d.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o7g.d.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o7g.d.CABIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o7g.d.CHECKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f286089a = iArr;
        int[] iArr2 = new int[p7g.d.values().length];
        try {
            iArr2[p7g.d.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[p7g.d.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[p7g.d.CABIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[p7g.d.CHECKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f286090b = iArr2;
    }
}
