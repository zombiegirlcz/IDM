package jcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0019"}, d2 = {"Ljcl/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "pocketId", "Ljo3/b;", "b", "Ljo3/b;", "e", "()Ljo3/b;", "total", "c", "availableToInvest", "availableToWithdraw", "g", "unsettled", "f", "committed", "h", "unsettledBuys", "totalOwned", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.b total;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableToInvest")
    @NotNull
    private final jo3.b availableToInvest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("availableToWithdraw")
    @NotNull
    private final jo3.b availableToWithdraw;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("unsettled")
    @NotNull
    private final jo3.b unsettled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("committed")
    @NotNull
    private final jo3.b committed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("unsettledBuys")
    @NotNull
    private final jo3.b unsettledBuys;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalOwned")
    @NotNull
    private final jo3.b totalOwned;

    public a(String pocketId, jo3.b total, jo3.b availableToInvest, jo3.b availableToWithdraw, jo3.b unsettled, jo3.b committed, jo3.b unsettledBuys, jo3.b totalOwned) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        Intrinsics.checkNotNullParameter(unsettled, "unsettled");
        Intrinsics.checkNotNullParameter(committed, "committed");
        Intrinsics.checkNotNullParameter(unsettledBuys, "unsettledBuys");
        Intrinsics.checkNotNullParameter(totalOwned, "totalOwned");
        this.pocketId = pocketId;
        this.total = total;
        this.availableToInvest = availableToInvest;
        this.availableToWithdraw = availableToWithdraw;
        this.unsettled = unsettled;
        this.committed = committed;
        this.unsettledBuys = unsettledBuys;
        this.totalOwned = totalOwned;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getAvailableToInvest() {
        return this.availableToInvest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getAvailableToWithdraw() {
        return this.availableToWithdraw;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getCommitted() {
        return this.committed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.pocketId, aVar.pocketId) && Intrinsics.f(this.total, aVar.total) && Intrinsics.f(this.availableToInvest, aVar.availableToInvest) && Intrinsics.f(this.availableToWithdraw, aVar.availableToWithdraw) && Intrinsics.f(this.unsettled, aVar.unsettled) && Intrinsics.f(this.committed, aVar.committed) && Intrinsics.f(this.unsettledBuys, aVar.unsettledBuys) && Intrinsics.f(this.totalOwned, aVar.totalOwned);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getTotalOwned() {
        return this.totalOwned;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.b getUnsettled() {
        return this.unsettled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.b getUnsettledBuys() {
        return this.unsettledBuys;
    }

    public final int hashCode() {
        return this.totalOwned.hashCode() + y.e(this.unsettledBuys, y.e(this.committed, y.e(this.unsettled, y.e(this.availableToWithdraw, y.e(this.availableToInvest, y.e(this.total, this.pocketId.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }
}
