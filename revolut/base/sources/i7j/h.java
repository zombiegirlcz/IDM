package i7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f159332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f159333c;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f159331a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f159332b = iArr2;
        int[] iArr3 = new int[wd6.h.values().length];
        try {
            iArr3[wd6.h.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[wd6.h.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[wd6.h.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[wd6.h.STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[wd6.h.TAKE_PROFIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[wd6.h.STOP_LOSS.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[wd6.h.TAKE_PROFIT_STOP_LOSS.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f159333c = iArr3;
    }
}
