package z55;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f319488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f319489b;

    static {
        int[] iArr = new int[b95.a.values().length];
        try {
            iArr[b95.a.PERSONAL_LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b95.a.REFINANCING_LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b95.a.MORTGAGE_LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f319488a = iArr;
        int[] iArr2 = new int[com.revolut.feature.credit.loan.api.models.rev10.k.values().length];
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.k.AdditionalCharges.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.k.CollateralLoss.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.k.Termination.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f319489b = iArr2;
    }
}
