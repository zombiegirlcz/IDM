package c7g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21979a;

    static {
        int[] iArr = new int[r7g.g.values().length];
        try {
            iArr[r7g.g.RECOMMENDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r7g.g.CHEAPEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r7g.g.FASTEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r7g.g.EARLIEST_DEPARTURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21979a = iArr;
    }
}
