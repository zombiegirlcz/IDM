package c8i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22172b;

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
        f22171a = iArr;
        int[] iArr2 = new int[jli.c.values().length];
        try {
            iArr2[jli.c.PERIOD_SELECTION_WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[jli.c.PERIOD_SELECTION_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f22172b = iArr2;
    }
}
