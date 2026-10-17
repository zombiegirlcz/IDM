package fkh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f135838a;

    static {
        int[] iArr = new int[pih.j.values().length];
        try {
            iArr[pih.j.AvailableToWithdraw.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pih.j.UnsettledSells.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pih.j.UnsettledBuys.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f135838a = iArr;
    }
}
