package kwg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190330a;

    static {
        int[] iArr = new int[gwg.a.values().length];
        try {
            iArr[gwg.a.TRADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gwg.a.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f190330a = iArr;
    }
}
