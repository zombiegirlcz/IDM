package e9d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123948a;

    static {
        int[] iArr = new int[j7d.a.values().length];
        try {
            iArr[j7d.a.PAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j7d.a.UPCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j7d.a.TRANSFERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f123948a = iArr;
    }
}
