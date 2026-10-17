package m55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Lm55/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "f", "state", "", "c", "J", "e", "()J", "repaymentDate", "d", "loanRepaymentType", "g", "transactionId", "Lm55/i;", "Lm55/i;", "()Lm55/i;", "amountBreakdown", "", "Z", "()Z", "paymentRequired", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDate")
    private final long repaymentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("loanRepaymentType")
    @NotNull
    private final String loanRepaymentType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amountBreakdown")
    @NotNull
    private final i amountBreakdown;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentRequired")
    private final boolean paymentRequired;

    public b(String id10, String state, long j2, String loanRepaymentType, String str, i amountBreakdown, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(loanRepaymentType, "loanRepaymentType");
        Intrinsics.checkNotNullParameter(amountBreakdown, "amountBreakdown");
        this.id = id10;
        this.state = state;
        this.repaymentDate = j2;
        this.loanRepaymentType = loanRepaymentType;
        this.transactionId = str;
        this.amountBreakdown = amountBreakdown;
        this.paymentRequired = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getAmountBreakdown() {
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
    public final long getRepaymentDate() {
        return this.repaymentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.state, bVar.state) && this.repaymentDate == bVar.repaymentDate && Intrinsics.f(this.loanRepaymentType, bVar.loanRepaymentType) && Intrinsics.f(this.transactionId, bVar.transactionId) && Intrinsics.f(this.amountBreakdown, bVar.amountBreakdown) && this.paymentRequired == bVar.paymentRequired;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.repaymentDate), 31, this.loanRepaymentType);
        String str = this.transactionId;
        return Boolean.hashCode(this.paymentRequired) + ((this.amountBreakdown.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
