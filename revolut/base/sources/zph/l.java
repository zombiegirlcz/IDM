package zph;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324308a;

    static {
        int[] iArr = new int[soh.g.values().length];
        try {
            iArr[soh.g.PERCENTAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[soh.g.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[soh.g.MONEY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[soh.g.YEARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f324308a = iArr;
    }
}
