package vgg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f289181b;

    static {
        int[] iArr = new int[hfg.x.values().length];
        try {
            iArr[hfg.x.TAX_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f289180a = iArr;
        int[] iArr2 = new int[hfg.b0.values().length];
        try {
            iArr2[hfg.b0.MILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[hfg.b0.REV_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[hfg.b0.GIFT_CARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hfg.b0.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        f289181b = iArr2;
    }
}
