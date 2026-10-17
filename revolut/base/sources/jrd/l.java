package jrd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178002a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.YEAR_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.MONTH_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f178002a = iArr;
    }
}
