package k55;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u0010"}, d2 = {"Lk55/u;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "principalAmount", "b", "loanAmount", "interestAmount", "d", "totalAmount", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("principalAmount")
    @NotNull
    private final jo3.a principalAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanAmount")
    @NotNull
    private final jo3.a loanAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestAmount")
    @NotNull
    private final jo3.a interestAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalAmount")
    @NotNull
    private final jo3.a totalAmount;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getInterestAmount() {
        return this.interestAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getLoanAmount() {
        return this.loanAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getPrincipalAmount() {
        return this.principalAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getTotalAmount() {
        return this.totalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.principalAmount, uVar.principalAmount) && Intrinsics.f(this.loanAmount, uVar.loanAmount) && Intrinsics.f(this.interestAmount, uVar.interestAmount) && Intrinsics.f(this.totalAmount, uVar.totalAmount);
    }

    public final int hashCode() {
        return this.totalAmount.hashCode() + v7.j(this.interestAmount, v7.j(this.loanAmount, this.principalAmount.hashCode() * 31, 31), 31);
    }
}
