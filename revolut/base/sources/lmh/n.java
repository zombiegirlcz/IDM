package lmh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f197087a;

    static {
        int[] iArr = new int[zel.f.values().length];
        try {
            iArr[zel.f.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zel.f.ETP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zel.f.BOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zel.f.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f197087a = iArr;
    }
}
