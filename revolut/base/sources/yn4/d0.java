package yn4;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lyn4/d0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getNewTerm", "()I", "newTerm", "Ljo3/a;", "b", "Ljo3/a;", "getRepaymentAmount", "()Ljo3/a;", "repaymentAmount", "c", "getRemainingTotalAmount", "remainingTotalAmount", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedScheduleTerm")
    private final int newTerm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentAmount")
    @NotNull
    private final jo3.a repaymentAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingTotalAmount")
    @NotNull
    private final jo3.a remainingTotalAmount;

    public d0(int i, jo3.a repaymentAmount, jo3.a remainingTotalAmount) {
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        this.newTerm = i;
        this.repaymentAmount = repaymentAmount;
        this.remainingTotalAmount = remainingTotalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.newTerm == d0Var.newTerm && Intrinsics.f(this.repaymentAmount, d0Var.repaymentAmount) && Intrinsics.f(this.remainingTotalAmount, d0Var.remainingTotalAmount);
    }

    public final int hashCode() {
        return this.remainingTotalAmount.hashCode() + v7.j(this.repaymentAmount, Integer.hashCode(this.newTerm) * 31, 31);
    }
}
