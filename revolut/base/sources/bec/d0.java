package bec;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14767a;

    static {
        int[] iArr = new int[w6c.f.values().length];
        try {
            iArr[w6c.f.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w6c.f.SETUP_DEFAULT_PAYMENT_METHOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w6c.f.ONLY_POCKETS_FILTERED_BY_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14767a = iArr;
    }
}
