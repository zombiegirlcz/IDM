package la0;

import xl2.d0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f193314a;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0.EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d0.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f193314a = iArr;
    }
}
