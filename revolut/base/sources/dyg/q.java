package dyg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121125a;

    static {
        int[] iArr = new int[vyg.a.values().length];
        try {
            iArr[vyg.a.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vyg.a.SECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vyg.a.POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vyg.a.PRODUCT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f121125a = iArr;
    }
}
