package qm1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f247747a;

    static {
        int[] iArr = new int[om1.b.values().length];
        try {
            iArr[om1.b.NOT_REGISTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[om1.b.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[om1.b.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[om1.b.INACTIVATING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f247747a = iArr;
    }
}
