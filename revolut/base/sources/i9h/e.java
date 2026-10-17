package i9h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f159852b;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.MOST_TRADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.MOST_BOUGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u.MOST_SOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f159851a = iArr;
        int[] iArr2 = new int[v.values().length];
        try {
            iArr2[v.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[v.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[v.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f159852b = iArr2;
    }
}
