package f28;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f131464b;

    static {
        int[] iArr = new int[h0.values().length];
        try {
            iArr[h0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h0.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h0.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h0.HALF_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h0.YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h0.ALL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f131463a = iArr;
        int[] iArr2 = new int[eel.c.values().length];
        try {
            iArr2[eel.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[eel.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[eel.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[eel.c.SIX_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[eel.c.ONE_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[eel.c.FIVE_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[eel.c.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        f131464b = iArr2;
    }
}
