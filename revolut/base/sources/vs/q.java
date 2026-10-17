package vs;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291707a;

    static {
        int[] iArr = new int[omi.b.values().length];
        try {
            iArr[omi.b.GREGORIAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[omi.b.JAPANESE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f291707a = iArr;
    }
}
