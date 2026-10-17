package roh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256023a;

    static {
        int[] iArr = new int[zel.k.values().length];
        try {
            iArr[zel.k.TOP_GAINERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zel.k.TOP_LOSERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f256023a = iArr;
    }
}
