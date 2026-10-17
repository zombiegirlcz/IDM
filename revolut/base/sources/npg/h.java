package npg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218214a;

    static {
        int[] iArr = new int[ncd.b.values().length];
        try {
            iArr[ncd.b.CHECK_VERIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ncd.b.GLOBE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ncd.b.REFINANCING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ncd.b.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f218214a = iArr;
    }
}
