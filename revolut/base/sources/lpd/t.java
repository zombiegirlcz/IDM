package lpd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f198989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f198990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f198991c;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.ON_THE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.WEEK_DAY_BEFORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.WEEK_DAY_AFTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f198989a = iArr;
        int[] iArr2 = new int[lzi.d.values().length];
        try {
            iArr2[lzi.d.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[lzi.d.LAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f198990b = iArr2;
        int[] iArr3 = new int[lzi.f.values().length];
        try {
            iArr3[lzi.f.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[lzi.f.TUESDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[lzi.f.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[lzi.f.THURSDAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[lzi.f.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[lzi.f.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[lzi.f.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        f198991c = iArr3;
    }
}
