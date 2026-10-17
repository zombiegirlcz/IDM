package hcm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f151276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f151277b;

    static {
        int[] iArr = new int[j.values().length];
        f151277b = iArr;
        try {
            iArr[j.PLAINTEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f151277b[j.TLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[h.values().length];
        f151276a = iArr2;
        try {
            iArr2[h.TLS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f151276a[h.PLAINTEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
