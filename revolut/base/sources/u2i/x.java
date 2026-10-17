package u2i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f276699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f276700c;

    static {
        int[] iArr = new int[wd6.e.values().length];
        try {
            iArr[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f276698a = iArr;
        int[] iArr2 = new int[b2i.a.values().length];
        try {
            iArr2[b2i.a.ESTIMATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f276699b = iArr2;
        int[] iArr3 = new int[m.values().length];
        try {
            iArr3[m.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[m.COMMODITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f276700c = iArr3;
    }
}
