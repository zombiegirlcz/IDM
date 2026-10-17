package po9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237925a;

    static {
        int[] iArr = new int[oo9.a.values().length];
        try {
            iArr[oo9.a.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oo9.a.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oo9.a.EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f237925a = iArr;
    }
}
