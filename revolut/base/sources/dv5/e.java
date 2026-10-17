package dv5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f118035a;

    static {
        int[] iArr = new int[ibd.f.values().length];
        try {
            iArr[ibd.f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ibd.f.CONFIRMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f118035a = iArr;
    }
}
