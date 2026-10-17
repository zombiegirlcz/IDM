package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lfdl/v2;", "Lfdl/e1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuantity", "quantity", "b", "getSourcePocketId", "sourcePocketId", "c", "getOp", "op", "Lfdl/i3;", "d", "Lfdl/i3;", "getSide", "()Lfdl/i3;", "side", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v2 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantity")
    @NotNull
    private final String quantity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourcePocketId")
    private final String sourcePocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("op")
    @NotNull
    private final String op;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final i3 side;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return Intrinsics.f(this.quantity, v2Var.quantity) && Intrinsics.f(this.sourcePocketId, v2Var.sourcePocketId) && Intrinsics.f(this.op, v2Var.op) && this.side == v2Var.side;
    }

    public final int hashCode() {
        int iHashCode = this.quantity.hashCode() * 31;
        String str = this.sourcePocketId;
        return this.side.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.op);
    }
}
