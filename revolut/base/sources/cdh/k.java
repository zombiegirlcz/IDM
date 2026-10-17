package cdh;

import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23260a;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n0.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f23260a = iArr;
    }
}
