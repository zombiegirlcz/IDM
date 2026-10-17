package t1i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267368b;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.RECURRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wd6.h.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wd6.h.MARKET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[wd6.h.TAKE_PROFIT_STOP_LOSS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[wd6.h.TAKE_PROFIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[wd6.h.STOP_LOSS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f267367a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f267368b = iArr2;
    }
}
