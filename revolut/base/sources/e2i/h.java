package e2i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122106a;

    static {
        int[] iArr = new int[f2i.g.values().length];
        try {
            iArr[f2i.g.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f2i.g.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f2i.g.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f122106a = iArr;
    }
}
