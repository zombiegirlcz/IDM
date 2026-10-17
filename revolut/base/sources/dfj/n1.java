package dfj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f114049a;

    static {
        int[] iArr = new int[pfj.j.values().length];
        try {
            iArr[pfj.j.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pfj.j.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pfj.j.AWAITING_INPUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f114049a = iArr;
    }
}
