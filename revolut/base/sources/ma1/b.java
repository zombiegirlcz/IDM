package ma1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203865a;

    static {
        int[] iArr = new int[fa1.g.values().length];
        try {
            iArr[fa1.g.SUFFICIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fa1.g.EXTREMELY_LOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fa1.g.LOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f203865a = iArr;
    }
}
