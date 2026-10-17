package qoh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f248211a;

    static {
        int[] iArr = new int[zel.f.values().length];
        try {
            iArr[zel.f.CFD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zel.f.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zel.f.ETP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zel.f.BOND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f248211a = iArr;
    }
}
