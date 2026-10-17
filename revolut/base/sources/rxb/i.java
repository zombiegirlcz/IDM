package rxb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258125a;

    static {
        int[] iArr = new int[kub.a.values().length];
        try {
            iArr[kub.a.CACHE_IMMEDIATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kub.a.CACHE_WAIT_FOR_SYNCHRONISATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kub.a.NETWORK_IMMEDIATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kub.a.NETWORK_IMMEDIATE_AND_FORCE_UPDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f258125a = iArr;
    }
}
