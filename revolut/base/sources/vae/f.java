package vae;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f287282a;

    static {
        int[] iArr = new int[k1j.c.values().length];
        try {
            iArr[k1j.c.POCKETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k1j.c.JOINT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k1j.c.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k1j.c.SUBACCOUNTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k1j.c.JOINT_SUBACCOUNTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k1j.c.PRO_VAULTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f287282a = iArr;
    }
}
