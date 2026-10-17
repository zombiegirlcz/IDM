package y9a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311822a;

    static {
        int[] iArr = new int[g8a.s.values().length];
        try {
            iArr[g8a.s.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g8a.s.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f311822a = iArr;
    }
}
