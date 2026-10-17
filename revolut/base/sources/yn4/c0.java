package yn4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lyn4/c0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "getRemainingTotalAmount", "()Ljo3/a;", "remainingTotalAmount", "b", "getRepaymentAmount", "repaymentAmount", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingTotalAmount")
    @NotNull
    private final jo3.a remainingTotalAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentAmount")
    @NotNull
    private final jo3.a repaymentAmount;

    public c0(jo3.a remainingTotalAmount, jo3.a repaymentAmount) {
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        this.remainingTotalAmount = remainingTotalAmount;
        this.repaymentAmount = repaymentAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.remainingTotalAmount, c0Var.remainingTotalAmount) && Intrinsics.f(this.repaymentAmount, c0Var.repaymentAmount);
    }

    public final int hashCode() {
        return this.repaymentAmount.hashCode() + (this.remainingTotalAmount.hashCode() * 31);
    }
}
