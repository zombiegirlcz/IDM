package gcm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142857a;

    static {
        int[] iArr = new int[ecm.g0.values().length];
        f142857a = iArr;
        try {
            iArr[ecm.g0.CT_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f142857a[ecm.g0.CT_WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
