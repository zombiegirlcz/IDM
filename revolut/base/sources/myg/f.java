package myg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210502a;

    static {
        int[] iArr = new int[jyg.a.values().length];
        try {
            iArr[jyg.a.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jyg.a.INVEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jyg.a.JISA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jyg.a.ALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f210502a = iArr;
    }
}
