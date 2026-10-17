package byg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19821a;

    static {
        int[] iArr = new int[vyg.a.values().length];
        try {
            iArr[vyg.a.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vyg.a.POSITIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vyg.a.SECTOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vyg.a.PRODUCT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f19821a = iArr;
    }
}
