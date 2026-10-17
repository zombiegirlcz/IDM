package g25;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139906a;

    static {
        int[] iArr = new int[ou3.l.values().length];
        try {
            iArr[ou3.l.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ou3.l.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ou3.l.TO_DO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f139906a = iArr;
    }
}
