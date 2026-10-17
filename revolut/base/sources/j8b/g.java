package j8b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f172164a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.SHORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.PAST_EVENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f172164a = iArr;
    }
}
