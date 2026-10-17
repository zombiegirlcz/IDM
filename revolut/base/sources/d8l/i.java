package d8l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112299a;

    static {
        int[] iArr = new int[f8l.f.values().length];
        try {
            iArr[f8l.f.RETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.f.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f8l.f.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f112299a = iArr;
    }
}
