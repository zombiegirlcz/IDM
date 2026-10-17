package xng;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307505a;

    static {
        int[] iArr = new int[sil.c.values().length];
        try {
            iArr[sil.c.ONE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sil.c.DAILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sil.c.WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[sil.c.MONTHLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[sil.c.ANNUALLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f307505a = iArr;
    }
}
