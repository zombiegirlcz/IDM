package xu6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f308973a;

    static {
        int[] iArr = new int[pr6.h.values().length];
        try {
            iArr[pr6.h.ACQUIRING_LOYALTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pr6.h.ACQUIRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pr6.h.FX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pr6.h.TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pr6.h.OTHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f308973a = iArr;
    }
}
