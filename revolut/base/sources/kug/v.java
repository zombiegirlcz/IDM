package kug;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189811a;

    static {
        int[] iArr = new int[ltg.a.values().length];
        try {
            iArr[ltg.a.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ltg.a.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ltg.a.SKIPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f189811a = iArr;
    }
}
