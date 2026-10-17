package m2f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f201996b;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.REV_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.PARTNER_POINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f201995a = iArr;
        int[] iArr2 = new int[u2f.q.values().length];
        try {
            iArr2[u2f.q.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[u2f.q.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[u2f.q.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[u2f.q.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f201996b = iArr2;
    }
}
