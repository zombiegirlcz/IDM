package gcm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142801a;

    static {
        int[] iArr = new int[ecm.f.values().length];
        f142801a = iArr;
        try {
            iArr[ecm.f.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f142801a[ecm.f.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f142801a[ecm.f.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
