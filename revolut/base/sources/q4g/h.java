package q4g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242147a;

    static {
        int[] iArr = new int[l7g.q.values().length];
        try {
            iArr[l7g.q.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l7g.q.CONFIRMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l7g.q.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l7g.q.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l7g.q.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f242147a = iArr;
    }
}
