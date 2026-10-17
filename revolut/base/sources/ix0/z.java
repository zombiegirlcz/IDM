package ix0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f169324a;

    static {
        int[] iArr = new int[ty0.b.values().length];
        try {
            iArr[ty0.b.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ty0.b.FORCE_EVERYTHING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ty0.b.FORCE_LINKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f169324a = iArr;
    }
}
