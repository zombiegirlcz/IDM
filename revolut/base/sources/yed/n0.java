package yed;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f312873b;

    static {
        int[] iArr = new int[mgd.b.values().length];
        try {
            iArr[mgd.b.ONE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mgd.b.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f312872a = iArr;
        int[] iArr2 = new int[mgd.e.values().length];
        try {
            iArr2[mgd.e.ONE_HOUR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[mgd.e.ONE_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f312873b = iArr2;
    }
}
