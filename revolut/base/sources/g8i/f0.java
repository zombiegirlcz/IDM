package g8i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f141374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f141375b;

    static {
        int[] iArr = new int[j8l.d.values().length];
        try {
            iArr[j8l.d.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j8l.d.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f141374a = iArr;
        int[] iArr2 = new int[x5i.l.values().length];
        try {
            iArr2[x5i.l.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[x5i.l.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f141375b = iArr2;
    }
}
