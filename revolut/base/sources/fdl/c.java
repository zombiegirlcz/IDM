package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfdl/c;", "Lfdl/e1;", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getAmount", "()J", "amount", "b", "Ljava/lang/String;", "getDestinationPocketId", "destinationPocketId", "c", "getOp", "op", "Lfdl/i3;", "d", "Lfdl/i3;", "getSide", "()Lfdl/i3;", "side", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("destinationPocketId")
    private final String destinationPocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("op")
    @NotNull
    private final String op;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final i3 side;

    public c(long j2, String str, String op2, i3 side) {
        Intrinsics.checkNotNullParameter(op2, "op");
        Intrinsics.checkNotNullParameter(side, "side");
        this.amount = j2;
        this.destinationPocketId = str;
        this.op = op2;
        this.side = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.amount == cVar.amount && Intrinsics.f(this.destinationPocketId, cVar.destinationPocketId) && Intrinsics.f(this.op, cVar.op) && this.side == cVar.side;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.amount) * 31;
        String str = this.destinationPocketId;
        return this.side.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.op);
    }
}
