package n7i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f213137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f213138b;

    static {
        int[] iArr = new int[k1j.a.values().length];
        try {
            iArr[k1j.a.POCKETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k1j.a.JOINT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k1j.a.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k1j.a.CRYPTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k1j.a.REVOLUT_X_FIAT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k1j.a.COMMODITIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f213137a = iArr;
        int[] iArr2 = new int[x5i.d.values().length];
        try {
            iArr2[x5i.d.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[x5i.d.TARGET.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f213138b = iArr2;
    }
}
