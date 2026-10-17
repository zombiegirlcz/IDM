package fnh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136686a;

    static {
        int[] iArr = new int[knh.a.values().length];
        try {
            iArr[knh.a.CFD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[knh.a.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[knh.a.ETF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[knh.a.BOND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[knh.a.COMMODITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f136686a = iArr;
    }
}
