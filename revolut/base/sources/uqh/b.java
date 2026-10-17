package uqh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f282128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f282129b;

    static {
        int[] iArr = new int[zel.f.values().length];
        try {
            iArr[zel.f.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zel.f.ETP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zel.f.BOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zel.f.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f282128a = iArr;
        int[] iArr2 = new int[zel.i.values().length];
        try {
            iArr2[zel.i.ASC.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zel.i.DESC.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f282129b = iArr2;
    }
}
