package mjf;

import tof.a1;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f206035a;

    static {
        int[] iArr = new int[a1.values().length];
        try {
            iArr[a1.CORE_LEDGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a1.EXCHANGE_LEDGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f206035a = iArr;
    }
}
