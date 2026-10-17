package ghk;

import cmk.d;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$PlanPagerItem;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import ggk.g1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d f143981b;

    public /* synthetic */ q(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar, int i) {
        this.f143980a = i;
        this.f143981b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f143980a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) pair.f186385a;
                List allPlans = (List) pair.f186386b;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = this.f143981b;
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.a aVar = dVar.f103074x;
                hha.d currentPlan = pricingPlanSubscription.f81129a;
                PlanFilter filter = dVar.f103068p.f103045a;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(allPlans, "allPlans");
                Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
                Intrinsics.checkNotNullParameter(filter, "filter");
                Function1 function1A = aVar.a(currentPlan, allPlans, filter);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : allPlans) {
                    if (((Boolean) function1A.invoke(obj3)).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                List listC = arrayList;
                if (zIsEmpty) {
                    listC = zhm.u.c(pricingPlanSubscription.f81129a);
                }
                return listC;
            case 1:
                cnk.c result = (cnk.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, cnk.a.f25452a)) {
                    if (!Intrinsics.f(result, cnk.b.f25453a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar2 = this.f143981b;
                    g1 g1VarL2 = dVar2.L2();
                    if (g1VarL2 != null) {
                        dVar2.C2(new m(g1VarL2.f143718a, g1VarL2));
                    }
                }
                return Unit.f186387a;
            case 2:
                ymk.n it8 = (ymk.n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof ymk.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f143981b.M2(((ymk.m) it8).f315037a);
                return Unit.f186387a;
            case 3:
                cmk.d output = (cmk.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, d.a.f25317a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar3 = this.f143981b;
                dVar3.H2(dVar3.D, new q(dVar3, 4));
                dVar3.C.a();
                return Unit.f186387a;
            default:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                this.f143981b.o.getClass();
                return j.a(update, zhm.u.c(PlanPagerFlowContract$PlanPagerItem.PlanLoadingItem.f103058a), null, null, null, null, null, null, false, 254);
        }
    }
}
