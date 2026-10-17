package foh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f136962b;

    static {
        int[] iArr = new int[wnh.e.values().length];
        try {
            iArr[wnh.e.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wnh.e.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wnh.e.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wnh.e.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[wnh.e.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f136961a = iArr;
        int[] iArr2 = new int[wnh.d.values().length];
        try {
            iArr2[wnh.d.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[wnh.d.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[wnh.d.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f136962b = iArr2;
    }
}
