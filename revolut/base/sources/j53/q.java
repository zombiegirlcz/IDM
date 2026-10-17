package j53;

import e93.i0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f171486a;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i0.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i0.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f171486a = iArr;
    }
}
