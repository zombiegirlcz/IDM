package m2j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f202065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f202066b;

    static {
        int[] iArr = new int[k1j.d.values().length];
        try {
            iArr[k1j.d.RETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f202065a = iArr;
        int[] iArr2 = new int[k1j.a.values().length];
        try {
            iArr2[k1j.a.VAULTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[k1j.a.JOINT_VAULTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k1j.a.PRO_VAULTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k1j.a.YOUTH_VAULTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k1j.a.TEEN_VAULTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        f202066b = iArr2;
    }
}
