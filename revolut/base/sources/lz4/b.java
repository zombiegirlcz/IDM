package lz4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200937a;

    static {
        int[] iArr = new int[gs3.a.values().length];
        try {
            iArr[gs3.a.CREDIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gs3.a.LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gs3.a.PAY_LATER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f200937a = iArr;
    }
}
