package x36;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f302673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f302674c;

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
        f302672a = iArr;
        int[] iArr2 = new int[k1j.a.values().length];
        try {
            iArr2[k1j.a.DEFI.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f302673b = iArr2;
        int[] iArr3 = new int[h46.a.values().length];
        try {
            iArr3[h46.a.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[h46.a.CEFI_TO_DEFI.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f302674c = iArr3;
    }
}
