package uyg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f284346b;

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
        f284345a = iArr;
        int[] iArr2 = new int[vyg.e.values().length];
        try {
            iArr2[vyg.e.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vyg.e.POSITIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vyg.e.SECTOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vyg.e.PRODUCT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f284346b = iArr2;
    }
}
