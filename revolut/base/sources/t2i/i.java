package t2i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f267586c;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wd6.h.MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f267584a = iArr;
        int[] iArr2 = new int[b2i.a.values().length];
        try {
            iArr2[b2i.a.PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b2i.a.ESTIMATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f267585b = iArr2;
        int[] iArr3 = new int[wd6.e.values().length];
        try {
            iArr3[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f267586c = iArr3;
    }
}
