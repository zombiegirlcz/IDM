package b7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f13051b;

    static {
        int[] iArr = new int[f8l.b.values().length];
        try {
            iArr[f8l.b.TO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.b.FROM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f13050a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f13051b = iArr2;
    }
}
