package w1i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f293858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f293859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f293860c;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f293858a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f293859b = iArr2;
        int[] iArr3 = new int[y1i.a.values().length];
        try {
            iArr3[y1i.a.PRICE_CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[y1i.a.PRICE_SHOULD_BE_LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[y1i.a.PRICE_SHOULD_BE_HIGHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f293860c = iArr3;
    }
}
