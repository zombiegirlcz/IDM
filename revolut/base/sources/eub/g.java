package eub;

import com.revolut.feature.rev_points.models.RevPointsBenefits;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsBenefits f129543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f129544b;

    public g(RevPointsBenefits benefits, hha.d pricingPlan) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f129543a = benefits;
        this.f129544b = pricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f129543a, gVar.f129543a) && Intrinsics.f(this.f129544b, gVar.f129544b);
    }

    public final int hashCode() {
        return this.f129544b.hashCode() + (this.f129543a.hashCode() * 31);
    }
}
