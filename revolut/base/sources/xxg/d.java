package xxg;

import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f309518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f309519b;

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
        f309518a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z.FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[z.CFD.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f309519b = iArr2;
    }
}
