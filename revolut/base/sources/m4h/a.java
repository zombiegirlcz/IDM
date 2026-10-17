package m4h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f202729a;

    static {
        int[] iArr = new int[g3h.a.values().length];
        try {
            iArr[g3h.a.SELL_ONLY_RISK_APPETITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g3h.a.SELL_ONLY_LIQUIDITY_CONSTRAINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g3h.a.SELL_ONLY_GOING_OTC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g3h.a.SELL_ONLY_SANCTIONS_ON_BUY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g3h.a.SELL_ONLY_PENNY_STOCK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g3h.a.SUSPENDED_MERGERS_AND_ACQUISITIONS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[g3h.a.SUSPENDED_STOCK_SPLIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[g3h.a.SUSPENDED_GOING_OTC.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[g3h.a.SUSPENDED_SANCTIONS_SUSPEND.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[g3h.a.SUSPENDED_GOING_PRIVATE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[g3h.a.SUSPENDED_BANKRUPTCY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f202729a = iArr;
    }
}
