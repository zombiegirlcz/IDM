package d8l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112298a;

    static {
        int[] iArr = new int[f8l.e.values().length];
        try {
            iArr[f8l.e.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.e.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f8l.e.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f8l.e.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f112298a = iArr;
    }
}
