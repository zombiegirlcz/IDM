package ldl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lldl/b;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "contributions", "b", "withdrawals", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("contributions")
    @NotNull
    private final jo3.a contributions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("withdrawals")
    @NotNull
    private final jo3.a withdrawals;

    public b(jo3.a contributions, jo3.a withdrawals) {
        Intrinsics.checkNotNullParameter(contributions, "contributions");
        Intrinsics.checkNotNullParameter(withdrawals, "withdrawals");
        this.contributions = contributions;
        this.withdrawals = withdrawals;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getContributions() {
        return this.contributions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getWithdrawals() {
        return this.withdrawals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.contributions, bVar.contributions) && Intrinsics.f(this.withdrawals, bVar.withdrawals);
    }

    public final int hashCode() {
        return this.withdrawals.hashCode() + (this.contributions.hashCode() * 31);
    }
}
