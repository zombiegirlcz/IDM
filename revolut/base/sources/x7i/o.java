package x7i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303241b;

    static {
        int[] iArr = new int[x5i.l.values().length];
        try {
            iArr[x5i.l.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x5i.l.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f303240a = iArr;
        int[] iArr2 = new int[j8l.d.values().length];
        try {
            iArr2[j8l.d.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j8l.d.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f303241b = iArr2;
    }
}
