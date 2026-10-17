package a8e;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2190a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.COMMODITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2190a = iArr;
    }
}
