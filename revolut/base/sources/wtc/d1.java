package wtc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f299863a;

    static {
        int[] iArr = new int[qtc.k.values().length];
        try {
            iArr[qtc.k.SAVINGS_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qtc.k.POCKETS_WITHDRAWAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qtc.k.STOCKS_WITHDRAWAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qtc.k.COMMODITIES_WITHDRAWAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qtc.k.CRYPTO_WITHDRAWAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[qtc.k.TRANSFERS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[qtc.k.CARD_PAYMENTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f299863a = iArr;
    }
}
