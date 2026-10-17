package x82;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303275a;

    static {
        int[] iArr = new int[h02.f.values().length];
        try {
            iArr[h02.f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h02.f.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h02.f.USED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h02.f.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h02.f.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f303275a = iArr;
    }
}
