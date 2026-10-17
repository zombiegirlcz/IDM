package o2j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221626a;

    static {
        int[] iArr = new int[k1j.a.values().length];
        try {
            iArr[k1j.a.SPOT_MARGIN_COLLATERAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k1j.a.FUTURES_COLLATERAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f221626a = iArr;
    }
}
