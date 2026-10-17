package i4b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f158395b;

    static {
        int[] iArr = new int[e2b.a.values().length];
        try {
            iArr[e2b.a.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e2b.a.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e2b.a.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f158394a = iArr;
        int[] iArr2 = new int[a4b.g.values().length];
        try {
            iArr2[a4b.g.CHANGE_POSITION_SIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a4b.g.OPEN_POSITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[a4b.g.REDUCE_POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[a4b.g.CLOSE_POSITIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f158395b = iArr2;
    }
}
