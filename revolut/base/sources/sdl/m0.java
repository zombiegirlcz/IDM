package sdl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261982b;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l0.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f261981a = iArr;
        int[] iArr2 = new int[cfl.j.values().length];
        try {
            iArr2[cfl.j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cfl.j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cfl.j.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f261982b = iArr2;
    }
}
