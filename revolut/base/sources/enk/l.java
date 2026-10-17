package enk;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127842a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.DOWNWARDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.UPWARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.UNDEFINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f127842a = iArr;
    }
}
