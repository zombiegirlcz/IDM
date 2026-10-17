package ltl;

import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199966a;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f199966a = iArr;
    }
}
