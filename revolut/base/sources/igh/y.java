package igh;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f161223a;

    static {
        int[] iArr = new int[jel.w.values().length];
        try {
            iArr[jel.w.VENTURE_CAPITAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jel.w.MULTI_ASSET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jel.w.PRIVATE_CREDIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jel.w.PRIVATE_EQUITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[jel.w.INFRASTRUCTURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[jel.w.REAL_ESTATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f161223a = iArr;
    }
}
