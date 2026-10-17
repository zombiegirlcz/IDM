package k61;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181610b;

    static {
        int[] iArr = new int[gk3.i.values().length];
        try {
            iArr[gk3.i.TRANSFER_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gk3.i.BANK_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gk3.i.INTERNAL_TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[gk3.i.WALLET_TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[gk3.i.CARD_TRANSFER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f181609a = iArr;
        int[] iArr2 = new int[prf.a.values().length];
        try {
            iArr2[prf.a.SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[prf.a.INVESTMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f181610b = iArr2;
    }
}
