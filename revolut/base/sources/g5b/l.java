package g5b;

import k4l.m0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140736a;

    static {
        int[] iArr = new int[m0.values().length];
        try {
            iArr[m0.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m0.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m0.FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f140736a = iArr;
    }
}
