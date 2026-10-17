package nb5;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f213982a;

    static {
        int[] iArr = new int[com.revolut.feature.credit_card.autopay.api.models_v3.a.values().length];
        try {
            iArr[com.revolut.feature.credit_card.autopay.api.models_v3.a.MIN_REPAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.credit_card.autopay.api.models_v3.a.STATEMENT_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.credit_card.autopay.api.models_v3.a.FIXED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f213982a = iArr;
    }
}
