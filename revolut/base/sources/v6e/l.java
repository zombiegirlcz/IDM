package v6e;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f286358a;

    static {
        int[] iArr = new int[n38.q.values().length];
        try {
            iArr[n38.q.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n38.q.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n38.q.TERMINATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n38.q.OFFBOARDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f286358a = iArr;
    }
}
