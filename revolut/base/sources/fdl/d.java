package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lfdl/d;", "", "", "toString", "()Ljava/lang/String;", "Lfdl/x2;", "a", "Lfdl/x2;", "b", "()Lfdl/x2;", "recommendationConsensus", "Lfdl/u2;", "Lfdl/u2;", "()Lfdl/u2;", "priceTarget", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("recommendation")
    private final x2 recommendationConsensus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceTarget")
    private final u2 priceTarget;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u2 getPriceTarget() {
        return this.priceTarget;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final x2 getRecommendationConsensus() {
        return this.recommendationConsensus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.recommendationConsensus, dVar.recommendationConsensus) && Intrinsics.f(this.priceTarget, dVar.priceTarget);
    }

    public final int hashCode() {
        x2 x2Var = this.recommendationConsensus;
        int iHashCode = (x2Var == null ? 0 : x2Var.hashCode()) * 31;
        u2 u2Var = this.priceTarget;
        return iHashCode + (u2Var != null ? u2Var.hashCode() : 0);
    }
}
