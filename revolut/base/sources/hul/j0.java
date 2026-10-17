package hul;

import k4l.q0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155736a;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.MARKET_ON_OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.GOOD_TIL_EXT_MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q0.GTC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f155736a = iArr;
    }
}
