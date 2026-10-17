package c46;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f21093c;

    static {
        int[] iArr = new int[f8l.b.values().length];
        try {
            iArr[f8l.b.FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.b.TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21091a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f21092b = iArr2;
        int[] iArr3 = new int[kyh.g.values().length];
        try {
            iArr3[kyh.g.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[kyh.g.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f21093c = iArr3;
    }
}
