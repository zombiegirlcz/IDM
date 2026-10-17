package iv5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168721a;

    static {
        int[] iArr = new int[rv5.a.values().length];
        try {
            iArr[rv5.a.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rv5.a.NEUTRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rv5.a.NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f168721a = iArr;
    }
}
