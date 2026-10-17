package pqd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f238727a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.INVEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.CRYPTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f238727a = iArr;
    }
}
