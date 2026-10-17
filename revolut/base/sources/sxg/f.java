package sxg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266488a;

    static {
        int[] iArr = new int[vyg.e.values().length];
        try {
            iArr[vyg.e.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vyg.e.SECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vyg.e.POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vyg.e.PRODUCT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f266488a = iArr;
    }
}
