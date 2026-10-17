package qah;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f244034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f244035b;

    static {
        int[] iArr = new int[mzg.c.values().length];
        try {
            iArr[mzg.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mzg.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mzg.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mzg.c.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f244034a = iArr;
        int[] iArr2 = new int[mzg.b.values().length];
        try {
            iArr2[mzg.b.MOST_TRADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[mzg.b.MOST_BOUGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[mzg.b.MOST_SOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f244035b = iArr2;
    }
}
