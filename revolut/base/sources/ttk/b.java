package ttk;

import mel.j0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274436a;

    static {
        int[] iArr = new int[j0.values().length];
        try {
            iArr[j0.STRONG_BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0.BUY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j0.HOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j0.SELL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j0.STRONG_SELL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f274436a = iArr;
    }
}
