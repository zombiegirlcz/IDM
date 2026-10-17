package z27;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f319006a;

    static {
        int[] iArr = new int[ds6.n.values().length];
        try {
            iArr[ds6.n.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ds6.n.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f319006a = iArr;
    }
}
