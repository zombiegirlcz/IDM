package vx1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f292795a;

    static {
        int[] iArr = new int[wx1.b.values().length];
        f292795a = iArr;
        try {
            iArr[wx1.b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f292795a[wx1.b.DELETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
