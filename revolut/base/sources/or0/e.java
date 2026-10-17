package or0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f228009a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.LEFT_TO_RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.RIGHT_TO_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f228009a = iArr;
    }
}
