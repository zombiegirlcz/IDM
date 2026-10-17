package dv5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f118043a;

    static {
        int[] iArr = new int[ibd.f.values().length];
        try {
            iArr[ibd.f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ibd.f.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f118043a = iArr;
    }
}
