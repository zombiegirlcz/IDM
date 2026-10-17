package pbf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f234677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f234678b;

    static {
        int[] iArr = new int[qbf.b.values().length];
        try {
            iArr[qbf.b.ANNUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qbf.b.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qbf.b.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f234677a = iArr;
        int[] iArr2 = new int[lbf.c.values().length];
        try {
            iArr2[lbf.c.ANNUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[lbf.c.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[lbf.c.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f234678b = iArr2;
    }
}
