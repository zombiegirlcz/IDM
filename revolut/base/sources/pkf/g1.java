package pkf;

import tof.v6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237054a;

    static {
        int[] iArr = new int[v6.values().length];
        try {
            iArr[v6.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v6.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v6.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v6.REVERTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f237054a = iArr;
    }
}
