package r7i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f252221b;

    static {
        int[] iArr = new int[x5i.d.values().length];
        try {
            iArr[x5i.d.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x5i.d.TARGET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f252220a = iArr;
        int[] iArr2 = new int[cfl.c.values().length];
        try {
            iArr2[cfl.c.TOPUP_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cfl.c.WITHDRAWAL_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cfl.c.TOPUP_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cfl.c.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f252221b = iArr2;
    }
}
