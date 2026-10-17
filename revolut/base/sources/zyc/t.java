package zyc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f326429a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SUBMITTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.IN_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.ACTION_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.VERIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f326429a = iArr;
    }
}
