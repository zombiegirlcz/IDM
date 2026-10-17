package bkf;

import tof.p0;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16401a;

    static {
        int[] iArr = new int[p0.values().length];
        try {
            iArr[p0.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p0.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f16401a = iArr;
    }
}
