package b3i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12042b;

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
        f12041a = iArr;
        int[] iArr2 = new int[wd6.h.values().length];
        try {
            iArr2[wd6.h.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.h.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wd6.h.MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wd6.h.TAKE_PROFIT_STOP_LOSS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[wd6.h.TAKE_PROFIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[wd6.h.STOP_LOSS.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[wd6.h.RECURRING.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f12042b = iArr2;
    }
}
