package d7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f111971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f111972c;

    static {
        int[] iArr = new int[m6j.a.values().length];
        try {
            iArr[m6j.a.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m6j.a.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f111970a = iArr;
        int[] iArr2 = new int[wd6.h.values().length];
        try {
            iArr2[wd6.h.RECURRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f111971b = iArr2;
        int[] iArr3 = new int[l6j.c.values().length];
        try {
            iArr3[l6j.c.RETAIL_POCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[l6j.c.TRADING_HOLDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f111972c = iArr3;
    }
}
