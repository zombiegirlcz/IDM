package hbf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f150682b;

    static {
        int[] iArr = new int[u8f.f.values().length];
        try {
            iArr[u8f.f.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u8f.f.SUBMITTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u8f.f.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u8f.f.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u8f.f.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[u8f.f.COMPLETED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f150681a = iArr;
        int[] iArr2 = new int[u8f.e.values().length];
        try {
            iArr2[u8f.e.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[u8f.e.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f150682b = iArr2;
    }
}
