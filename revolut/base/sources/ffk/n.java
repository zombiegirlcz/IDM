package ffk;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134842a;

    static {
        int[] iArr = new int[hha.i.values().length];
        try {
            iArr[hha.i.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hha.i.ANNUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f134842a = iArr;
    }
}
