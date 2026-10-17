package vi9;

import zh9.p0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289540a;

    static {
        int[] iArr = new int[p0.values().length];
        try {
            iArr[p0.PAY_IN_30_DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p0.PAY_IN_3.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p0.PAY_IN_6.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p0.PAY_IN_9.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[p0.PAY_IN_12.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f289540a = iArr;
    }
}
