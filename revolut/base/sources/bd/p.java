package bd;

import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14495a;

    static {
        int[] iArr = new int[w2.values().length];
        f14495a = iArr;
        try {
            iArr[w2.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14495a[w2.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14495a[w2.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14495a[w2.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
