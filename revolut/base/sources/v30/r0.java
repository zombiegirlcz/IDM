package v30;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f285816a;

    static {
        int[] iArr = new int[s0.values().length];
        try {
            iArr[s0.ASSIGNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s0.AWAITING_RESPONSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s0.RESOLVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s0.OPEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s0.CLOSED_AND_RATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s0.CLOSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s0.CANCELED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f285816a = iArr;
    }
}
