package aj7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Laj7/p;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "d", "()Ljo3/b;", "total", "b", "claimedAmount", "c", "refunded", "excessPayable", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.b total;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("claimed")
    @NotNull
    private final jo3.b claimedAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("refunded")
    private final jo3.b refunded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("excessPayable")
    private final jo3.b excessPayable;

    public p(jo3.b total, jo3.b claimedAmount, jo3.b bVar, jo3.b bVar2) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(claimedAmount, "claimedAmount");
        this.total = total;
        this.claimedAmount = claimedAmount;
        this.refunded = bVar;
        this.excessPayable = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getClaimedAmount() {
        return this.claimedAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getExcessPayable() {
        return this.excessPayable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getRefunded() {
        return this.refunded;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.total, pVar.total) && Intrinsics.f(this.claimedAmount, pVar.claimedAmount) && Intrinsics.f(this.refunded, pVar.refunded) && Intrinsics.f(this.excessPayable, pVar.excessPayable);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.claimedAmount, this.total.hashCode() * 31, 31);
        jo3.b bVar = this.refunded;
        int iHashCode = (iE + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.excessPayable;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
