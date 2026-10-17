package bul;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18905a;

    static {
        int[] iArr = new int[rcf.a.values().length];
        try {
            iArr[rcf.a.TRADING_GIA_CBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rcf.a.TRADING_POCKET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rcf.a.RETAIL_POCKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18905a = iArr;
    }
}
