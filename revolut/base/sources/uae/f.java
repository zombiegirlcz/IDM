package uae;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f278632b;

    static {
        int[] iArr = new int[sae.a.values().length];
        try {
            iArr[sae.a.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sae.a.JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sae.a.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f278631a = iArr;
        int[] iArr2 = new int[k1j.c.values().length];
        try {
            iArr2[k1j.c.POCKETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k1j.c.JOINT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k1j.c.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f278632b = iArr2;
    }
}
