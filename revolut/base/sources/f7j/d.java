package f7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f132629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f132630b;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.RECURRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f132629a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f132630b = iArr2;
    }
}
