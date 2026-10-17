package e4k;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f122636b;

    static {
        int[] iArr = new int[kq2.c.values().length];
        try {
            iArr[kq2.c.SHARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kq2.c.DEBTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f122635a = iArr;
        int[] iArr2 = new int[f5j.r.values().length];
        try {
            iArr2[f5j.r.CHEQUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f122636b = iArr2;
    }
}
