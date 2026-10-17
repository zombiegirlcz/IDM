package v20;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f285411a;

    static {
        int[] iArr = new int[v30.s0.values().length];
        try {
            iArr[v30.s0.OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v30.s0.ASSIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v30.s0.AWAITING_RESPONSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v30.s0.RESOLVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[v30.s0.CLOSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[v30.s0.CLOSED_AND_RATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[v30.s0.CANCELED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f285411a = iArr;
    }
}
