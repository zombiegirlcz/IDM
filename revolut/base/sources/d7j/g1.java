package d7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112001a;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wd6.h.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wd6.h.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f112001a = iArr;
    }
}
