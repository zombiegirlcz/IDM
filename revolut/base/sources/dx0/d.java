package dx0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f120513a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.THEME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f120513a = iArr;
    }
}
