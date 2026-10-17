package yd9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312662a;

    static {
        int[] iArr = new int[wd9.d.values().length];
        try {
            iArr[wd9.d.COMMODITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd9.d.FX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wd9.d.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f312662a = iArr;
        int[] iArr2 = new int[ibd.f.values().length];
        try {
            iArr2[ibd.f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ibd.f.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
