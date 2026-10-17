package pgi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f235959a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.DIRECT_NAVIGATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f235959a = iArr;
    }
}
