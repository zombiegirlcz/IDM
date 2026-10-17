package koe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186310a;

    static {
        int[] iArr = new int[zme.e.values().length];
        try {
            iArr[zme.e.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zme.e.PASSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zme.e.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f186310a = iArr;
    }
}
