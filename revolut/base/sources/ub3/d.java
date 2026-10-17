package ub3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278734a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.NoEuActions.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.BothAllowed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.OnlyDepositCash.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.OnlySelectLocation.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f278734a = iArr;
    }
}
