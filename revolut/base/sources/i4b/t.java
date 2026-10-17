package i4b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f158385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f158386c;

    static {
        int[] iArr = new int[a4b.g.values().length];
        try {
            iArr[a4b.g.REDUCE_POSITIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a4b.g.CHANGE_POSITION_SIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a4b.g.CLOSE_POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a4b.g.OPEN_POSITION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f158384a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f158385b = iArr2;
        int[] iArr3 = new int[e2b.a.values().length];
        try {
            iArr3[e2b.a.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[e2b.a.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[e2b.a.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f158386c = iArr3;
    }
}
