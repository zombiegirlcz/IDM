package ccb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f22982c;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.INTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f22980a = iArr;
        int[] iArr2 = new int[jli.c.values().length];
        try {
            iArr2[jli.c.PERIOD_SELECTION_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[jli.c.PERIOD_SELECTION_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[jli.c.PERIOD_SELECTION_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[jli.c.PERIOD_SELECTION_BI_WEEKLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[jli.c.PERIOD_SELECTION_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[jli.c.PERIOD_SELECTION_NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f22981b = iArr2;
        int[] iArr3 = new int[acb.a.values().length];
        try {
            iArr3[acb.a.TAX.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[acb.a.FEE.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[acb.a.CHARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        f22982c = iArr3;
    }
}
