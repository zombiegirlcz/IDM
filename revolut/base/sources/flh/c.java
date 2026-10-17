package flh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f135991a;

    static {
        int[] iArr = new int[qih.a.values().length];
        try {
            iArr[qih.a.TOTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qih.a.AVAILABLE_TO_INVEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qih.a.AVAILABLE_TO_WITHDRAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f135991a = iArr;
    }
}
