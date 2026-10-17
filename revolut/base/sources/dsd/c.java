package dsd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117291a;

    static {
        int[] iArr = new int[amd.a.values().length];
        try {
            iArr[amd.a.WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[amd.a.MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[amd.a.SIX_MONTHS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[amd.a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[amd.a.MAX.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f117291a = iArr;
    }
}
