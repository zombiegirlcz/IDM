package wkk;

import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import ggk.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ro7.n;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a f298297a;

    public i(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a aVar) {
        this.f298297a = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String planId = (String) obj2;
        Intrinsics.checkNotNullParameter(planId, "planId");
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a aVar = this.f298297a;
        return nim.a.v(ymk.a.a(aVar.f103464p, planId, PlanLayoutType.Default.f103311a, g0.DEFAULT), new n(aVar, 19));
    }
}
