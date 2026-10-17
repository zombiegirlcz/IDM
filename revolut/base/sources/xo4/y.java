package xo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"Lxo4/y;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "fee", "b", "d", "startingBalance", "c", "e", "transactions", "repayments", "Lxo4/v;", "Lxo4/v;", "()Lxo4/v;", "interest", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    private final long fee;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("startingBalance")
    private final long startingBalance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactions")
    private final long transactions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("repayments")
    private final long repayments;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("interest")
    @NotNull
    private final v interest;

    public y(long j2, long j3, long j5, long j16, v interest) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.fee = j2;
        this.startingBalance = j3;
        this.transactions = j5;
        this.repayments = j16;
        this.interest = interest;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getRepayments() {
        return this.repayments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartingBalance() {
        return this.startingBalance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTransactions() {
        return this.transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.fee == yVar.fee && this.startingBalance == yVar.startingBalance && this.transactions == yVar.transactions && this.repayments == yVar.repayments && Intrinsics.f(this.interest, yVar.interest);
    }

    public final int hashCode() {
        return this.interest.hashCode() + a0.d.c(a0.d.c(a0.d.c(Long.hashCode(this.fee) * 31, 31, this.startingBalance), 31, this.transactions), 31, this.repayments);
    }
}
