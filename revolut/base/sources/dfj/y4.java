package dfj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f114165a;

    static {
        int[] iArr = new int[dej.f3.values().length];
        try {
            iArr[dej.f3.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dej.f3.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dej.f3.ELIGIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[dej.f3.NON_ELIGIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[dej.f3.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f114165a = iArr;
    }
}
