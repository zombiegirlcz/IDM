package l4h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192128a;

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
            iArr[eel.c.ONE_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[eel.c.FIVE_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[eel.c.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f192128a = iArr;
    }
}
