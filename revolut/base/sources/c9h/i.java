package c9h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22466a;

    static {
        int[] iArr = new int[cfl.c.values().length];
        try {
            iArr[cfl.c.TOPUP_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.c.WITHDRAWAL_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cfl.c.TOPUP_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cfl.c.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f22466a = iArr;
    }
}
