package xkf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306740a;

    static {
        int[] iArr = new int[mr8.c.values().length];
        try {
            iArr[mr8.c.FIRST_TRANSFER_BETWEEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mr8.c.GUARDIAN_IS_NOT_VALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mr8.c.AMOUNT_OVER_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f306740a = iArr;
    }
}
