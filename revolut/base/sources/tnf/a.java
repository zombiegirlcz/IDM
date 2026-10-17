package tnf;

import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272439a;

    static {
        int[] iArr = new int[y6.values().length];
        try {
            iArr[y6.DEFI_TOPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y6.DEFI_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y6.DEFI_SWAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f272439a = iArr;
    }
}
