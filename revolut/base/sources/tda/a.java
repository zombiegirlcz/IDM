package tda;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269941a;

    static {
        int[] iArr = new int[fda.a.values().length];
        try {
            iArr[fda.a.FIAT_CURRENCIES_POCKETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fda.a.MERCHANT_POCKETS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fda.a.REVX_FIAT_POCKETS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f269941a = iArr;
    }
}
