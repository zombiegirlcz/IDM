package gi1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144048a;

    static {
        int[] iArr = new int[ei1.n.values().length];
        try {
            iArr[ei1.n.MUNICIPALITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ei1.n.CITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f144048a = iArr;
    }
}
