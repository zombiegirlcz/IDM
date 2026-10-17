package zhl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f322439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f322440c;

    static {
        int[] iArr = new int[eel.c.values().length];
        try {
            iArr[eel.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[eel.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[eel.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[eel.c.SIX_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[eel.c.YEAR_TO_DATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[eel.c.FIVE_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[eel.c.ONE_YEAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[eel.c.TEN_YEARS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[eel.c.ALL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f322438a = iArr;
        int[] iArr2 = new int[vgl.b.values().length];
        try {
            iArr2[vgl.b.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[vgl.b.TICKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[vgl.b.TICKER_PERIODICALLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        f322439b = iArr2;
        int[] iArr3 = new int[eel.i.values().length];
        try {
            iArr3[eel.i.PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[eel.i.YTM.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        f322440c = iArr3;
    }
}
