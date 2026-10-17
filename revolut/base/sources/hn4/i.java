package hn4;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u0012"}, d2 = {"Lhn4/i;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "creditBalance", "b", "c", "nonChargedInstalments", "e", "totalInterest", "d", "pendingFees", "gmfTax", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditBalance")
    @NotNull
    private final jo3.a creditBalance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nonChargedInstalments")
    private final jo3.a nonChargedInstalments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalInterest")
    @NotNull
    private final jo3.a totalInterest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pendingFees")
    @NotNull
    private final jo3.a pendingFees;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("gmfTax")
    private final jo3.a gmfTax;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getCreditBalance() {
        return this.creditBalance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getGmfTax() {
        return this.gmfTax;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getNonChargedInstalments() {
        return this.nonChargedInstalments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPendingFees() {
        return this.pendingFees;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getTotalInterest() {
        return this.totalInterest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.creditBalance, iVar.creditBalance) && Intrinsics.f(this.nonChargedInstalments, iVar.nonChargedInstalments) && Intrinsics.f(this.totalInterest, iVar.totalInterest) && Intrinsics.f(this.pendingFees, iVar.pendingFees) && Intrinsics.f(this.gmfTax, iVar.gmfTax);
    }

    public final int hashCode() {
        int iHashCode = this.creditBalance.hashCode() * 31;
        jo3.a aVar = this.nonChargedInstalments;
        int iJ = v7.j(this.pendingFees, v7.j(this.totalInterest, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31);
        jo3.a aVar2 = this.gmfTax;
        return iJ + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
