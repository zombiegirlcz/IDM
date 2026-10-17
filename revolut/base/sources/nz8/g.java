package nz8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220999a;

    static {
        int[] iArr = new int[pz8.g.values().length];
        try {
            iArr[pz8.g.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pz8.g.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pz8.g.FRAUD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pz8.g.APP_TIPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pz8.g.PRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pz8.g.YOUTH_TRADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f220999a = iArr;
    }
}
