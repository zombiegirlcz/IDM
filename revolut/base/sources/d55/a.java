package d55;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111350a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.Fixed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.Variable.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.TemporaryFixed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f111350a = iArr;
    }
}
