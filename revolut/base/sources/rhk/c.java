package rhk;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanFilter f254507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanSelection f254508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f254509c;
    public final xfa.b d;
    public final PlanChangeSuccessActionStrategy e;
    public final boolean f;

    public /* synthetic */ c(PlanFilter planFilter, PlanSelection planSelection, e eVar, xfa.b bVar, PlanChangeSuccessActionStrategy planChangeSuccessActionStrategy) {
        this(planFilter, planSelection, eVar, bVar, planChangeSuccessActionStrategy, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f254507a, cVar.f254507a) && Intrinsics.f(this.f254508b, cVar.f254508b) && Intrinsics.f(this.f254509c, cVar.f254509c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + v1.c.c(this.d, (this.f254509c.hashCode() + ((this.f254508b.hashCode() + (this.f254507a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public c(PlanFilter planFilter, PlanSelection planSelection, e uiConfig, xfa.b source, PlanChangeSuccessActionStrategy successActionStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(planFilter, "planFilter");
        Intrinsics.checkNotNullParameter(planSelection, "planSelection");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
        this.f254507a = planFilter;
        this.f254508b = planSelection;
        this.f254509c = uiConfig;
        this.d = source;
        this.e = successActionStrategy;
        this.f = z;
    }
}
