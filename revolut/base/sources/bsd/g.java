package bsd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18169a;

    static {
        int[] iArr = new int[yld.g.values().length];
        try {
            iArr[yld.g.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yld.g.LIABILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18169a = iArr;
    }
}
