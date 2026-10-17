package lnh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f197255a;

    static {
        int[] iArr = new int[knh.a.values().length];
        try {
            iArr[knh.a.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[knh.a.ETF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[knh.a.BOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[knh.a.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[knh.a.COMMODITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f197255a = iArr;
    }
}
