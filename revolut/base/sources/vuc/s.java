package vuc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f292339a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.WALLETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.MERCHANTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f292339a = iArr;
    }
}
