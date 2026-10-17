package u38;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276817a;

    static {
        int[] iArr = new int[n38.q.values().length];
        try {
            iArr[n38.q.OFFBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n38.q.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n38.q.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f276817a = iArr;
    }
}
