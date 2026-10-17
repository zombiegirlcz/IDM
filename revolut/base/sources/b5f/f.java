package b5f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12518a;

    static {
        int[] iArr = new int[x4f.a.values().length];
        try {
            iArr[x4f.a.BANK_BALANCES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x4f.a.BROKERAGE_HOLDINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12518a = iArr;
    }
}
