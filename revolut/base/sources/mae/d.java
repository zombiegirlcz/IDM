package mae;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203999a;

    static {
        int[] iArr = new int[ibd.j.values().length];
        try {
            iArr[ibd.j.Daily.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ibd.j.Weekly.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ibd.j.Monthly.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f203999a = iArr;
    }
}
