package wul;

import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300233a;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f300233a = iArr;
    }
}
