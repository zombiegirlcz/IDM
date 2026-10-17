package gk7;

import com.revolut.feature.insurance.api.models.details.CFACClaimTransactions;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144341a;

    static {
        int[] iArr = new int[CFACClaimTransactions.EligibleTransaction.Direction.values().length];
        try {
            iArr[CFACClaimTransactions.EligibleTransaction.Direction.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CFACClaimTransactions.EligibleTransaction.Direction.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f144341a = iArr;
    }
}
