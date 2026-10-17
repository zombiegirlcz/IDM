package f7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f132642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f132643b;

    static {
        int[] iArr = new int[wd6.e.values().length];
        try {
            iArr[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f132642a = iArr;
        int[] iArr2 = new int[i7j.j.values().length];
        try {
            iArr2[i7j.j.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i7j.j.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f132643b = iArr2;
    }
}
