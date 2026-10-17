package bnf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17147a;

    static {
        int[] iArr = new int[tof.c.values().length];
        try {
            iArr[tof.c.VAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tof.c.GROUP_VAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tof.c.JOINT_VAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tof.c.JUNIOR_VAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tof.c.PRO_VAULT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f17147a = iArr;
    }
}
