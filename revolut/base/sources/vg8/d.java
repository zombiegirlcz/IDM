package vg8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0012\u0010\"¨\u0006$"}, d2 = {"Lvg8/d;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "currentBalance", "e", "savingBalance", "", "c", "J", "()J", "confirmedDate", "d", "Ljava/lang/String;", "g", "state", "failureReason", "", "f", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "u18AccountWillBeClosed", "Z", "()Z", "showAssetsTransferPendingAction", "Lvg8/c;", "Lvg8/c;", "()Lvg8/c;", "guardian", "feature_junior_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentBalance")
    @NotNull
    private final jo3.a currentBalance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("savingBalance")
    private final jo3.a savingBalance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmedDate")
    private final long confirmedDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("failureReason")
    private final String failureReason;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("u18AccountWillBeClosed")
    private final Boolean u18AccountWillBeClosed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("showAssetsTransferPendingAction")
    private final boolean showAssetsTransferPendingAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("guardian")
    private final c guardian;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getConfirmedDate() {
        return this.confirmedDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getCurrentBalance() {
        return this.currentBalance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getGuardian() {
        return this.guardian;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getSavingBalance() {
        return this.savingBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.currentBalance, dVar.currentBalance) && Intrinsics.f(this.savingBalance, dVar.savingBalance) && this.confirmedDate == dVar.confirmedDate && Intrinsics.f(this.state, dVar.state) && Intrinsics.f(this.failureReason, dVar.failureReason) && Intrinsics.f(this.u18AccountWillBeClosed, dVar.u18AccountWillBeClosed) && this.showAssetsTransferPendingAction == dVar.showAssetsTransferPendingAction && Intrinsics.f(this.guardian, dVar.guardian);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowAssetsTransferPendingAction() {
        return this.showAssetsTransferPendingAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getU18AccountWillBeClosed() {
        return this.u18AccountWillBeClosed;
    }

    public final int hashCode() {
        int iHashCode = this.currentBalance.hashCode() * 31;
        jo3.a aVar = this.savingBalance;
        int iC = p.a.c(a0.d.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.confirmedDate), 31, this.state);
        String str = this.failureReason;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.u18AccountWillBeClosed;
        int iC2 = j6.a.c((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.showAssetsTransferPendingAction);
        c cVar = this.guardian;
        return iC2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
