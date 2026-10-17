package ejb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126853a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.TOP_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.AUTO_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.INTEREST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.WITHDRAWAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f126853a = iArr;
    }
}
