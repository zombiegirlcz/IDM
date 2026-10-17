package d0d;

import gzc.x;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110343a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.SUBMITTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.IN_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x.ACTION_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[x.VERIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f110343a = iArr;
    }
}
