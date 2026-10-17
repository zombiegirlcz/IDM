package d7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f112057c;

    static {
        int[] iArr = new int[wd6.e.values().length];
        try {
            iArr[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f112055a = iArr;
        int[] iArr2 = new int[wd6.i.values().length];
        try {
            iArr2[wd6.i.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[wd6.i.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.i.MERCHANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f112056b = iArr2;
        int[] iArr3 = new int[wd6.h.values().length];
        try {
            iArr3[wd6.h.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[wd6.h.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[wd6.h.RECURRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[wd6.h.MARKET.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[wd6.h.TAKE_PROFIT_STOP_LOSS.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[wd6.h.TAKE_PROFIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[wd6.h.STOP_LOSS.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f112057c = iArr3;
    }
}
