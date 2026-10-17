package m5e;

import nel.c0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f202931a;

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
        f202931a = iArr;
    }
}
