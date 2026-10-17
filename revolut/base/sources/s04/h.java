package s04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ls04/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "getDebtType", "debtType", "c", "getCreditProvider", "creditProvider", "", "d", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "amount", "e", "getMonthlyRepaymentAmount", "monthlyRepaymentAmount", "f", "getCurrentBalance", "currentBalance", "g", "getDebtShare", "debtShare", "", "h", "Ljava/lang/Boolean;", "isRepaid", "()Ljava/lang/Boolean;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtType")
    @NotNull
    private final String debtType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditProvider")
    @NotNull
    private final String creditProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    private final Long amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("monthlyRepayment")
    private final Long monthlyRepaymentAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currentBalance")
    private final Long currentBalance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtShare")
    private final String debtShare;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("isRepaid")
    private final Boolean isRepaid;

    public h(String id10, String debtType, String creditProvider, Long l2, Long l3, Long l4, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(creditProvider, "creditProvider");
        this.id = id10;
        this.debtType = debtType;
        this.creditProvider = creditProvider;
        this.amount = l2;
        this.monthlyRepaymentAmount = l3;
        this.currentBalance = l4;
        this.debtShare = str;
        this.isRepaid = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.debtType, hVar.debtType) && Intrinsics.f(this.creditProvider, hVar.creditProvider) && Intrinsics.f(this.amount, hVar.amount) && Intrinsics.f(this.monthlyRepaymentAmount, hVar.monthlyRepaymentAmount) && Intrinsics.f(this.currentBalance, hVar.currentBalance) && Intrinsics.f(this.debtShare, hVar.debtShare) && Intrinsics.f(this.isRepaid, hVar.isRepaid);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.debtType), 31, this.creditProvider);
        Long l2 = this.amount;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.monthlyRepaymentAmount;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.currentBalance;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.debtShare;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isRepaid;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }
}
