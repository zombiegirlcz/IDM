package ghk;

import ggk.g1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f143969b;

    public m(String selectedPlanId, g1 pageLayout) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(pageLayout, "pageLayout");
        this.f143968a = selectedPlanId;
        this.f143969b = pageLayout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f143968a, mVar.f143968a) && Intrinsics.f(this.f143969b, mVar.f143969b);
    }

    public final int hashCode() {
        return this.f143969b.hashCode() + (this.f143968a.hashCode() * 31);
    }
}
