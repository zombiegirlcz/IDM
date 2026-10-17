package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\r\u0010\u001d¨\u0006\u001f"}, d2 = {"Lk55/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "g", "state", "c", "loanRepaymentType", "d", "e", "repaymentDate", "", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "repaymentTime", "h", "transactionId", "Lk55/u;", "Lk55/u;", "()Lk55/u;", "amountBreakdown", "", "Z", "()Z", "paymentRequired", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanRepaymentType")
    @NotNull
    private final String loanRepaymentType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("repaymentDate")
    @NotNull
    private final String repaymentDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("actualRepaymentTime")
    private final Long repaymentTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountBreakdown")
    @NotNull
    private final u amountBreakdown;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentRequired")
    private final boolean paymentRequired;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u getAmountBreakdown() {
        return this.amountBreakdown;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLoanRepaymentType() {
        return this.loanRepaymentType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getPaymentRequired() {
        return this.paymentRequired;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRepaymentDate() {
        return this.repaymentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.state, hVar.state) && Intrinsics.f(this.loanRepaymentType, hVar.loanRepaymentType) && Intrinsics.f(this.repaymentDate, hVar.repaymentDate) && Intrinsics.f(this.repaymentTime, hVar.repaymentTime) && Intrinsics.f(this.transactionId, hVar.transactionId) && Intrinsics.f(this.amountBreakdown, hVar.amountBreakdown) && this.paymentRequired == hVar.paymentRequired;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getRepaymentTime() {
        return this.repaymentTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.loanRepaymentType), 31, this.repaymentDate);
        Long l2 = this.repaymentTime;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.transactionId;
        return Boolean.hashCode(this.paymentRequired) + ((this.amountBreakdown.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }
}
