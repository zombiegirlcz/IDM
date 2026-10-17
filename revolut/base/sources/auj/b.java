package auj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9840a;

    static {
        int[] iArr = new int[d0j.m.values().length];
        try {
            iArr[d0j.m.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0j.m.PAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0j.m.ARCHIVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9840a = iArr;
    }
}
