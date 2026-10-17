package sel;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f262223a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f262223a = iArr;
    }
}
