package yd9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312665a;

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
        try {
            iArr[ibd.f.BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f312665a = iArr;
    }
}
