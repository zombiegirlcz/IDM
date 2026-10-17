package x8h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303405b;

    static {
        int[] iArr = new int[cfl.j.values().length];
        try {
            iArr[cfl.j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cfl.j.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f303404a = iArr;
        int[] iArr2 = new int[xzg.q0.values().length];
        try {
            iArr2[xzg.q0.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[xzg.q0.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f303405b = iArr2;
    }
}
