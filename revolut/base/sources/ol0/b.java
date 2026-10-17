package ol0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f226282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f226283b;

    static {
        int[] iArr = new int[nl0.a.values().length];
        try {
            iArr[nl0.a.STANDARD_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nl0.a.FALLBACK_TO_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nl0.a.HANDLED_CUSTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f226282a = iArr;
        int[] iArr2 = new int[nl0.b.values().length];
        try {
            iArr2[nl0.b.ARBITRARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nl0.b.ENFORCED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f226283b = iArr2;
    }
}
