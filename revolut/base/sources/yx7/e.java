package yx7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317588a;

    static {
        int[] iArr = new int[ky7.c.values().length];
        try {
            iArr[ky7.c.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ky7.c.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ky7.c.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f317588a = iArr;
    }
}
