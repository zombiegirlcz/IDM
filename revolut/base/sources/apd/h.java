package apd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8170a;

    static {
        int[] iArr = new int[xjg.m.values().length];
        try {
            iArr[xjg.m.NIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xjg.m.DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xjg.m.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8170a = iArr;
    }
}
