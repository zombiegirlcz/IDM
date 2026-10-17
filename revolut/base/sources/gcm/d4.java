package gcm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142615a;

    static {
        int[] iArr = new int[ecm.r.values().length];
        f142615a = iArr;
        try {
            iArr[ecm.r.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f142615a[ecm.r.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f142615a[ecm.r.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f142615a[ecm.r.TRANSIENT_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f142615a[ecm.r.SHUTDOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
