package dfj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f114171a;

    static {
        int[] iArr = new int[dej.f3.values().length];
        try {
            iArr[dej.f3.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dej.f3.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f114171a = iArr;
    }
}
