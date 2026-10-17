package m1c;

import com.revolut.feature.rev_points.models.RevPointsProductRate;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f201460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsProductRate f201461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.d f201462c;
    public final a1 d;
    public final dj0.d e;
    public final dj0.d f;

    public u1(hha.d pricingPlan, RevPointsProductRate revPointsProductRate, hha.d dVar, a1 a1Var, dj0.d minMoneyValueInBaseCurrency, dj0.d onePointMoneyValue) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(revPointsProductRate, "revPointsProductRate");
        Intrinsics.checkNotNullParameter(minMoneyValueInBaseCurrency, "minMoneyValueInBaseCurrency");
        Intrinsics.checkNotNullParameter(onePointMoneyValue, "onePointMoneyValue");
        this.f201460a = pricingPlan;
        this.f201461b = revPointsProductRate;
        this.f201462c = dVar;
        this.d = a1Var;
        this.e = minMoneyValueInBaseCurrency;
        this.f = onePointMoneyValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.f201460a, u1Var.f201460a) && Intrinsics.f(this.f201461b, u1Var.f201461b) && Intrinsics.f(this.f201462c, u1Var.f201462c) && Intrinsics.f(this.d, u1Var.d) && Intrinsics.f(this.e, u1Var.e) && Intrinsics.f(this.f, u1Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f201461b.hashCode() + (this.f201460a.hashCode() * 31)) * 31;
        hha.d dVar = this.f201462c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a1 a1Var = this.d;
        return this.f.hashCode() + v7.c((iHashCode2 + (a1Var != null ? a1Var.hashCode() : 0)) * 31, 31, this.e);
    }
}
