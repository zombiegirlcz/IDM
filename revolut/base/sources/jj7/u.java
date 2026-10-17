package jj7;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Ljj7/u;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "d", "()Ljo3/a;", "total", "b", "claimedAmount", "c", "refunded", "excessPayable", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.a total;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("claimed")
    @NotNull
    private final jo3.a claimedAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("refunded")
    private final jo3.a refunded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("excessPayable")
    private final jo3.a excessPayable;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getClaimedAmount() {
        return this.claimedAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getExcessPayable() {
        return this.excessPayable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getRefunded() {
        return this.refunded;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.total, uVar.total) && Intrinsics.f(this.claimedAmount, uVar.claimedAmount) && Intrinsics.f(this.refunded, uVar.refunded) && Intrinsics.f(this.excessPayable, uVar.excessPayable);
    }

    public final int hashCode() {
        int iJ = v7.j(this.claimedAmount, this.total.hashCode() * 31, 31);
        jo3.a aVar = this.refunded;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.excessPayable;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
