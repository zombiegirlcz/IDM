package ewh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130269a;

    static {
        int[] iArr = new int[yvh.h.values().length];
        try {
            iArr[yvh.h.CHARITY_POCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yvh.h.CURRENT_POCKET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yvh.h.VAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yvh.h.LOYALTY_PROFILE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yvh.h.WEALTH_PORTFOLIO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f130269a = iArr;
    }
}
