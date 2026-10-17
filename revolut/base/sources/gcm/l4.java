package gcm;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142761a;

    static {
        int[] iArr = new int[ecm.r.values().length];
        f142761a = iArr;
        try {
            iArr[ecm.r.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f142761a[ecm.r.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f142761a[ecm.r.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f142761a[ecm.r.TRANSIENT_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
