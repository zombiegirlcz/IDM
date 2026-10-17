package sx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends com.revolut.feature.card_design.impl.card_design.carousel.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.d f266289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi3.h f266290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.d f266291c;

    public g0(e93.d cardDesign, pi3.h hVar, hha.d currentPricingPlan) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(currentPricingPlan, "currentPricingPlan");
        this.f266289a = cardDesign;
        this.f266290b = hVar;
        this.f266291c = currentPricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f266289a, g0Var.f266289a) && Intrinsics.f(this.f266290b, g0Var.f266290b) && Intrinsics.f(this.f266291c, g0Var.f266291c);
    }

    public final int hashCode() {
        int iHashCode = this.f266289a.hashCode() * 31;
        pi3.h hVar = this.f266290b;
        return this.f266291c.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31);
    }
}
