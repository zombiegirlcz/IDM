package le3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f194481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f194482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f194483c;

    static {
        int[] iArr = new int[he3.d.values().length];
        try {
            iArr[he3.d.BOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[he3.d.SPENDINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[he3.d.INCOME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f194481a = iArr;
        int[] iArr2 = new int[he3.b.values().length];
        try {
            iArr2[he3.b.START_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[he3.b.CREATED_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f194482b = iArr2;
        int[] iArr3 = new int[he3.c.values().length];
        try {
            iArr3[he3.c.DONT_EXCLUDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[he3.c.EXCLUDE_ONLY_FULLY_EXCLUDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[he3.c.EXCLUDE_INCLUDED_AND_PARTIALLY_EXCLUDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f194483c = iArr3;
    }
}
