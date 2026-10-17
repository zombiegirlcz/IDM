package ms0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208176a;

    static {
        int[] iArr = new int[m2.values().length];
        try {
            iArr[m2.IGNORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m2.ALLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f208176a = iArr;
    }
}
