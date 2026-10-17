package ms0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208471a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.NoBackground.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.WhiteTransparentBackground.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f208471a = iArr;
    }
}
