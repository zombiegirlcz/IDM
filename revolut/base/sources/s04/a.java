package s04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Ls04/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getDebtType", "debtType", "b", "getCreditProvider", "creditProvider", "", "c", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "amount", "d", "getMonthlyRepaymentAmount", "monthlyRepaymentAmount", "e", "getCurrentBalance", "currentBalance", "f", "getDebtShare", "debtShare", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtType")
    @NotNull
    private final String debtType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditProvider")
    @NotNull
    private final String creditProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final Long amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("monthlyRepayment")
    private final Long monthlyRepaymentAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currentBalance")
    private final Long currentBalance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("debtShare")
    private final String debtShare;

    public a(String debtType, String creditProvider, Long l2, Long l3, Long l4, String str) {
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(creditProvider, "creditProvider");
        this.debtType = debtType;
        this.creditProvider = creditProvider;
        this.amount = l2;
        this.monthlyRepaymentAmount = l3;
        this.currentBalance = l4;
        this.debtShare = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.debtType, aVar.debtType) && Intrinsics.f(this.creditProvider, aVar.creditProvider) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.monthlyRepaymentAmount, aVar.monthlyRepaymentAmount) && Intrinsics.f(this.currentBalance, aVar.currentBalance) && Intrinsics.f(this.debtShare, aVar.debtShare);
    }

    public final int hashCode() {
        int iC = p.a.c(this.debtType.hashCode() * 31, 31, this.creditProvider);
        Long l2 = this.amount;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.monthlyRepaymentAmount;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.currentBalance;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.debtShare;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
