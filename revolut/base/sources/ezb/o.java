package ezb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130933a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f130933a = iArr;
    }
}
