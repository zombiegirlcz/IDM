package oc3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224083a;

    static {
        int[] iArr = new int[ub3.a.values().length];
        try {
            iArr[ub3.a.DepositCash.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ub3.a.ShowBarcode.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ub3.a.Navigate.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ub3.a.SelectLocation.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f224083a = iArr;
    }
}
