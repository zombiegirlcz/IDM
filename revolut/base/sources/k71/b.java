package k71;

import tof.y6;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181774a;

    static {
        int[] iArr = new int[y6.values().length];
        try {
            iArr[y6.DEFI_SWAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y6.DEFI_TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y6.DEFI_TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f181774a = iArr;
    }
}
