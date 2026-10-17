package twb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f274980b;

    static {
        int[] iArr = new int[tvb.e.values().length];
        try {
            iArr[tvb.e.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tvb.e.EPAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tvb.e.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f274979a = iArr;
        int[] iArr2 = new int[tvb.c.values().length];
        try {
            iArr2[tvb.c.AU_NZ.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[tvb.c.IL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[tvb.c.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f274980b = iArr2;
    }
}
