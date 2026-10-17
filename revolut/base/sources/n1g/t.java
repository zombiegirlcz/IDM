package n1g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f211352b;

    static {
        int[] iArr = new int[iyf.c.values().length];
        try {
            iArr[iyf.c.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iyf.c.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[iyf.c.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[iyf.c.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f211351a = iArr;
        int[] iArr2 = new int[myf.h.values().length];
        try {
            iArr2[myf.h.PAPER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f211352b = iArr2;
    }
}
