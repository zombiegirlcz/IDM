package tcl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f269880b;

    static {
        int[] iArr = new int[eel.i.values().length];
        try {
            iArr[eel.i.PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[eel.i.YTM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f269879a = iArr;
        int[] iArr2 = new int[eel.c.values().length];
        try {
            iArr2[eel.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[eel.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[eel.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[eel.c.SIX_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[eel.c.ONE_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[eel.c.FIVE_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[eel.c.TEN_YEARS.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[eel.c.ALL.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[eel.c.YEAR_TO_DATE.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        f269880b = iArr2;
    }
}
