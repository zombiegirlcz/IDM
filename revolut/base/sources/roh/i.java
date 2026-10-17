package roh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256015a;

    static {
        int[] iArr = new int[zel.a.values().length];
        try {
            iArr[zel.a.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zel.a.ONE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zel.a.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zel.a.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zel.a.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f256015a = iArr;
    }
}
