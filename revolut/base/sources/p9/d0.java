package p9;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f234205a;

    static {
        int[] iArr = new int[d9.g0.values().length];
        f234205a = iArr;
        try {
            iArr[d9.g0.READ_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f234205a[d9.g0.READ_WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f234205a[d9.g0.WRITE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f234205a[d9.g0.AUTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
