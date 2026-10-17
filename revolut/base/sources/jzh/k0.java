package jzh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179835a;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wd6.h.RECURRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wd6.h.TAKE_PROFIT_STOP_LOSS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[wd6.h.MARKET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f179835a = iArr;
    }
}
