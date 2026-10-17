package xjf;

import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306518a;

    static {
        int[] iArr = new int[y6.values().length];
        try {
            iArr[y6.DEFI_SWAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y6.EXCHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y6.REVX_EXCHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f306518a = iArr;
    }
}
