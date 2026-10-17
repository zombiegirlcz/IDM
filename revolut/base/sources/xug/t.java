package xug;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f309069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f309070b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.OPEN_POSITIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.UPCOMING_DIVIDENDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.OPEN_POSITIONS_AND_UPCOMING_DIVIDENDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f309069a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.DONATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[f.CLOSE_POSITIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f309070b = iArr2;
    }
}
