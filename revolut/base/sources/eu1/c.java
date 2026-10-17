package eu1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129463a;

    static {
        int[] iArr = new int[zz1.e.values().length];
        try {
            iArr[zz1.e.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zz1.e.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zz1.e.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zz1.e.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f129463a = iArr;
    }
}
