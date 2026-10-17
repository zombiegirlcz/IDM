package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfdl/s0;", "Lfdl/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "ref", "b", "d", "symbol", "holding", "", "D", "()D", "allocation", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    private final String ref;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    private final String symbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("holding")
    @NotNull
    private final String holding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("allocation")
    private final double allocation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAllocation() {
        return this.allocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHolding() {
        return this.holding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.ref, s0Var.ref) && Intrinsics.f(this.symbol, s0Var.symbol) && Intrinsics.f(this.holding, s0Var.holding) && Double.compare(this.allocation, s0Var.allocation) == 0;
    }

    public final int hashCode() {
        String str = this.ref;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        return Double.hashCode(this.allocation) + p.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.holding);
    }
}
