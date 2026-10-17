package okb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225962a;

    static {
        int[] iArr = new int[npg.d.values().length];
        try {
            iArr[npg.d.INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[npg.d.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f225962a = iArr;
    }
}
