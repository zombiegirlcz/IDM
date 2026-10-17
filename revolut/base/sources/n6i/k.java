package n6i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f212802a;

    static {
        int[] iArr = new int[k1j.a.values().length];
        try {
            iArr[k1j.a.JOINT_NON_EXISTING_CURRENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k1j.a.PRO_NON_EXISTING_CURRENCY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k1j.a.NON_EXISTING_CURRENCY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k1j.a.CRYPTO_NON_EXISTING_CURRENCY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k1j.a.COMMODITIES_NON_EXISTING_CURRENCY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f212802a = iArr;
    }
}
