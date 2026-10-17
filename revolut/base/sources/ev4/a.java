package ev4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129703a;

    static {
        int[] iArr = new int[vl4.c.values().length];
        try {
            iArr[vl4.c.ONGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vl4.c.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vl4.c.FUTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vl4.c.PAST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vl4.c.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f129703a = iArr;
    }
}
