package ofl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224905a;

    static {
        int[] iArr = new int[kfl.a.values().length];
        try {
            iArr[kfl.a.ROBO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kfl.a.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kfl.a.TAX_ADVANTAGE_REPORTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kfl.a.PRIVATE_MARKETS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f224905a = iArr;
    }
}
