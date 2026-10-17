package gpd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145445a;

    static {
        int[] iArr = new int[epd.d.values().length];
        try {
            iArr[epd.d.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[epd.d.REMOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f145445a = iArr;
    }
}
