package ujh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f280629b;

    static {
        int[] iArr = new int[del.e.values().length];
        try {
            iArr[del.e.Ascending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[del.e.Descending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f280628a = iArr;
        int[] iArr2 = new int[del.d.values().length];
        try {
            iArr2[del.d.TotalValue.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[del.d.Performance.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[del.d.Alphabetical.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[del.d.Products.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f280629b = iArr2;
    }
}
