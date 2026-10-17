package ggh;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143686a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.HARD_LOCKUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.SOFT_LOCKUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.ALL_SHARES_LOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.UNLOCKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f143686a = iArr;
    }
}
