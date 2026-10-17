package byg;

import vyg.e;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19822a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.POSITIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.SECTOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.PRODUCT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f19822a = iArr;
    }
}
