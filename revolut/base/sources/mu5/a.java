package mu5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f208962b;

    static {
        int[] iArr = new int[del.d.values().length];
        try {
            iArr[del.d.TotalValue.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[del.d.Performance.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[del.d.Alphabetical.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[del.d.Products.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f208961a = iArr;
        int[] iArr2 = new int[del.e.values().length];
        try {
            iArr2[del.e.Ascending.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[del.e.Descending.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f208962b = iArr2;
    }
}
