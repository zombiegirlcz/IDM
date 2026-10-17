package rrk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256883a;

    static {
        int[] iArr = new int[trk.a.values().length];
        try {
            iArr[trk.a.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[trk.a.ETF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[trk.a.BONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f256883a = iArr;
    }
}
