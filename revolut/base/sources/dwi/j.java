package dwi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f120431a;

    static {
        int[] iArr = new int[svi.o.values().length];
        try {
            iArr[svi.o.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[svi.o.REFUNDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[svi.o.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[svi.o.CANCELLING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f120431a = iArr;
    }
}
