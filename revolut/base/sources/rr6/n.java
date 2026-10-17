package rr6;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f256724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f256725b;

    public n(BigDecimal planCashbackRate, hha.d pricingPlan) {
        Intrinsics.checkNotNullParameter(planCashbackRate, "planCashbackRate");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f256724a = planCashbackRate;
        this.f256725b = pricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f256724a, nVar.f256724a) && Intrinsics.f(this.f256725b, nVar.f256725b);
    }

    public final int hashCode() {
        return this.f256725b.hashCode() + (this.f256724a.hashCode() * 31);
    }
}
