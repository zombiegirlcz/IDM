package d2e;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110798a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.HERO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.LOGO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.REGULAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g.DISCOVER_MORE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f110798a = iArr;
    }
}
