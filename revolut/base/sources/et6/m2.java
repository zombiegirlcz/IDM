package et6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f129274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f129275c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[ir6.f.values().length];
        try {
            iArr[ir6.f.PAYMENT_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ir6.f.INVOICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ir6.f.SHOPIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f129273a = iArr;
        int[] iArr2 = new int[ir6.b.values().length];
        try {
            iArr2[ir6.b.BOOSTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f129274b = iArr2;
        int[] iArr3 = new int[ir6.e.values().length];
        try {
            iArr3[ir6.e.PRO_REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ir6.e.PRO_TAX.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f129275c = iArr3;
        int[] iArr4 = new int[ir6.g.values().length];
        try {
            iArr4[ir6.g.TAX_HUB.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        d = iArr4;
        int[] iArr5 = new int[ir6.d.values().length];
        try {
            iArr5[ir6.d.PRO_PERKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        e = iArr5;
    }
}
