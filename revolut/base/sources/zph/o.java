package zph;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324311a;

    static {
        int[] iArr = new int[zel.g.values().length];
        try {
            iArr[zel.g.COUNTRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zel.g.EXPOSURE_GEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zel.g.ISSUER_COUNTRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f324311a = iArr;
    }
}
