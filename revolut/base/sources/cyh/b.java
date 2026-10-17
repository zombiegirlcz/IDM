package cyh;

import tof.v6;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110094a;

    static {
        int[] iArr = new int[v6.values().length];
        try {
            iArr[v6.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v6.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f110094a = iArr;
    }
}
