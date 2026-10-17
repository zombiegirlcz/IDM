package ni8;

import li8.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f215660a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.INCORRECT_AGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.TOO_YOUNG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.INVALID_AGE_DIFFERENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f215660a = iArr;
    }
}
