package g1i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f139644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f139645c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[wd6.e.values().length];
        try {
            iArr[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f139643a = iArr;
        int[] iArr2 = new int[m1i.g.values().length];
        try {
            iArr2[m1i.g.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[m1i.g.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f139644b = iArr2;
        int[] iArr3 = new int[wd6.c.values().length];
        try {
            iArr3[wd6.c.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[wd6.c.CRYPTO_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[wd6.c.COMMODITY_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[wd6.c.FREELANCER_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[wd6.c.FIAT_ONLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f139645c = iArr3;
        int[] iArr4 = new int[wd6.i.values().length];
        try {
            iArr4[wd6.i.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[wd6.i.MERCHANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[wd6.i.TRADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
