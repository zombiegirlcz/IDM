package kyh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190908a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f190908a = iArr;
        int[] iArr2 = new int[wd6.h.values().length];
        try {
            iArr2[wd6.h.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.h.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wd6.h.STOP.ordinal()] = 3;
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
    }
}
