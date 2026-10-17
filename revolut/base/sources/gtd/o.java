package gtd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146591a;

    static {
        int[] iArr = new int[g0j.b.values().length];
        try {
            iArr[g0j.b.STAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0j.b.EXPERIENCES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0j.b.LOUNGES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g0j.b.INSURANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f146591a = iArr;
    }
}
