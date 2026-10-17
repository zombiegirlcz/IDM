package zyc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f326430a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.SUBMITTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.IN_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p.ACTION_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[p.VERIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f326430a = iArr;
    }
}
