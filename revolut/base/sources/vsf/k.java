package vsf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291790a;

    static {
        int[] iArr = new int[ttf.d.values().length];
        try {
            iArr[ttf.d.REPLACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ttf.d.CORRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ttf.d.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f291790a = iArr;
    }
}
