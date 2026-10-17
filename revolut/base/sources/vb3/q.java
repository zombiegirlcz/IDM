package vb3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f287392a;

    static {
        int[] iArr = new int[ub3.k.values().length];
        try {
            iArr[ub3.k.BothAllowed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ub3.k.NoEuActions.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ub3.k.OnlyDepositCash.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ub3.k.OnlySelectLocation.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f287392a = iArr;
    }
}
