package ytj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f316832b;

    static {
        int[] iArr = new int[d0j.p.values().length];
        try {
            iArr[d0j.p.LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0j.p.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f316831a = iArr;
        int[] iArr2 = new int[d0j.n.values().length];
        try {
            iArr2[d0j.n.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d0j.n.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f316832b = iArr2;
    }
}
