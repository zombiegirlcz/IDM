package w4e;

import nel.c0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f294560a;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.PRE_TRADE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.POST_TRADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.POST_MATURITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f294560a = iArr;
    }
}
