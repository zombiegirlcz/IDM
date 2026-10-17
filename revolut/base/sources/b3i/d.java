package b3i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f12034c;

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
        f12032a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f12033b = iArr2;
        int[] iArr3 = new int[c3i.a.values().length];
        try {
            iArr3[c3i.a.ESTIMATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f12034c = iArr3;
    }
}
