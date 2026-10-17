package m1i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f201568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f201569c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

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
        f201567a = iArr;
        int[] iArr2 = new int[wd6.h.values().length];
        try {
            iArr2[wd6.h.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.h.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wd6.h.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wd6.h.STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[wd6.h.TAKE_PROFIT_STOP_LOSS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[wd6.h.TAKE_PROFIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[wd6.h.STOP_LOSS.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f201568b = iArr2;
        int[] iArr3 = new int[r1i.h.values().length];
        try {
            iArr3[r1i.h.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[r1i.h.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f201569c = iArr3;
        int[] iArr4 = new int[o0.values().length];
        try {
            iArr4[o0.CRYPTO_UPPER_LIMIT_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[o0.RECURRING_ESTIMATED_INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[o0.FEE_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[o0.BRL_USAGE_LIMIT_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[o0.BRL_UPPER_LIMIT_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[o0.MX_BALANCE_LIMIT_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[o0.NOT_DEALABLE_CURRENCIES.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        d = iArr4;
        int[] iArr5 = new int[g.values().length];
        try {
            iArr5[g.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[g.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        e = iArr5;
        int[] iArr6 = new int[wd6.c.values().length];
        try {
            iArr6[wd6.c.CRYPTO_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[wd6.c.COMMODITY_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[wd6.c.FREELANCER_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr6[wd6.c.FIAT_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        f = iArr6;
    }
}
