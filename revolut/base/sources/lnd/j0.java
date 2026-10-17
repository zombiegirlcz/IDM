package lnd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f197183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f197184b;

    static {
        int[] iArr = new int[lzi.i.values().length];
        try {
            iArr[lzi.i.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lzi.i.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lzi.i.YEARLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lzi.i.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lzi.i.CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f197183a = iArr;
        int[] iArr2 = new int[amd.a.values().length];
        try {
            iArr2[amd.a.WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[amd.a.MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[amd.a.SIX_MONTHS.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[amd.a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[amd.a.MAX.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f197184b = iArr2;
    }
}
