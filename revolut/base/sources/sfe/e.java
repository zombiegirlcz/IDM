package sfe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f262409a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.RELOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.CACHE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f262409a = iArr;
    }
}
