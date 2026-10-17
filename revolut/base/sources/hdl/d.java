package hdl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\f¨\u0006\u0018"}, d2 = {"Lhdl/d;", "Lhdl/e;", "Lidl/a;", "f", "Lidl/a;", "i", "()Lidl/a;", "details", "Ljo3/a;", "g", "Ljo3/a;", "j", "()Ljo3/a;", "total", "h", "availableToInvest", "availableToWithdraw", "l", "unsettled", "k", "committed", "m", "unsettledBuys", "totalOwned", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends e {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final idl.a details;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.a total;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableToInvest")
    @NotNull
    private final jo3.a availableToInvest;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("availableToWithdraw")
    @NotNull
    private final jo3.a availableToWithdraw;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("unsettled")
    @NotNull
    private final jo3.a unsettled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("committed")
    @NotNull
    private final jo3.a committed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("unsettledBuys")
    @NotNull
    private final jo3.a unsettledBuys;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalOwned")
    @NotNull
    private final jo3.a totalOwned;

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getAvailableToInvest() {
        return this.availableToInvest;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getAvailableToWithdraw() {
        return this.availableToWithdraw;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getCommitted() {
        return this.committed;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final idl.a getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.a getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.a getTotalOwned() {
        return this.totalOwned;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final jo3.a getUnsettled() {
        return this.unsettled;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final jo3.a getUnsettledBuys() {
        return this.unsettledBuys;
    }
}
