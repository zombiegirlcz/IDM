package z1i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f318836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f318837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f318838c;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f318836a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f318837b = iArr2;
        int[] iArr3 = new int[b2i.a.values().length];
        try {
            iArr3[b2i.a.PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[b2i.a.ESTIMATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f318838c = iArr3;
    }
}
