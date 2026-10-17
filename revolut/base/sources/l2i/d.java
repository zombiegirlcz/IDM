package l2i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f191798b;

    static {
        int[] iArr = new int[r1i.h.values().length];
        try {
            iArr[r1i.h.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r1i.h.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f191797a = iArr;
        int[] iArr2 = new int[r1i.e.values().length];
        try {
            iArr2[r1i.e.EXCEEDED_CRYPTO_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r1i.e.FAILED_CRYPTO_LOWER_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f191798b = iArr2;
    }
}
