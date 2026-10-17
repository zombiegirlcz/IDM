package tgk;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanFilter f271189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xfa.b f271190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b93.f f271191c;
    public final e93.d d;
    public final boolean e;
    public final NaviCommand f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccountId f271192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f271193h;

    public d(PlanFilter planFilter, xfa.b source, b93.f checkoutCardParams, e93.d dVar, boolean z, NaviCommand naviCommand, AccountId accountId, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(planFilter, "planFilter");
        PlanSelection.LowestPlan planSelection = PlanSelection.LowestPlan.f103356a;
        Intrinsics.checkNotNullParameter(planSelection, "planSelection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(checkoutCardParams, "checkoutCardParams");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f271189a = planFilter;
        this.f271190b = source;
        this.f271191c = checkoutCardParams;
        this.d = dVar;
        this.e = z;
        this.f = naviCommand;
        this.f271192g = accountId;
        this.f271193h = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        if (!this.f271189a.equals(dVar.f271189a)) {
            return false;
        }
        Object obj3 = PlanSelection.LowestPlan.f103356a;
        return obj3.equals(obj3) && this.f271190b == dVar.f271190b && Intrinsics.f(this.f271191c, dVar.f271191c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f271192g, dVar.f271192g) && Intrinsics.f(this.f271193h, dVar.f271193h);
    }

    public final int hashCode() {
        int iHashCode = (this.f271191c.hashCode() + v1.c.c(this.f271190b, (PlanSelection.LowestPlan.f103356a.hashCode() + (this.f271189a.hashCode() * 31)) * 31, 31)) * 31;
        e93.d dVar = this.d;
        int iC = j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e);
        NaviCommand naviCommand = this.f;
        return this.f271193h.hashCode() + l.b(this.f271192g, (iC + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31, 31);
    }
}
