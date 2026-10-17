package snh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f264629b;

    static {
        int[] iArr = new int[iih.b.values().length];
        try {
            iArr[iih.b.DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iih.b.WITHDRAW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f264628a = iArr;
        int[] iArr2 = new int[cfl.c.values().length];
        try {
            iArr2[cfl.c.TOPUP_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cfl.c.TOPUP_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cfl.c.WITHDRAWAL_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cfl.c.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f264629b = iArr2;
    }
}
