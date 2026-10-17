package u80;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278062a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.UNSIGNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.SIGNED_ONLY_NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f278062a = iArr;
    }
}
