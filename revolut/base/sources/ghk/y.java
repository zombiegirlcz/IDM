package ghk;

import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import ggk.g1;
import ggk.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d f143995w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f143995w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(this.f143995w, continuation, 0);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(this.f143995w, continuation, 1);
                yVar2.v = obj2;
                return yVar2;
            default:
                y yVar3 = new y(this.f143995w, continuation, 2);
                yVar3.v = obj2;
                return yVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((y) create((enk.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = this.f143995w;
        switch (i) {
            case 0:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) rVar.f314201a;
                List allPlans = (List) rVar.f314202b;
                h1 layout = (h1) rVar.f314203c;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar2 = this.f143995w;
                PlanPagerFlowContract$InputData planPagerFlowContract$InputData = dVar2.f103068p;
                cli.y yVar = dVar2.D;
                g1 g1Var = (g1) ((j) ((j2) yVar.f22677a).getValue()).e.getContent();
                String str = null;
                String str2 = g1Var != null ? g1Var.f143718a : null;
                b0 b0Var = dVar2.f103072t;
                PlanSelection selection = planPagerFlowContract$InputData.f103046b;
                hha.d currentPlan = pricingPlanSubscription.f81129a;
                PlanLayoutType layoutType = planPagerFlowContract$InputData.d.f103060b;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(selection, "selection");
                Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
                Intrinsics.checkNotNullParameter(allPlans, "allPlans");
                Intrinsics.checkNotNullParameter(layout, "layout");
                Intrinsics.checkNotNullParameter(layoutType, "layoutType");
                if (Intrinsics.f(layoutType, PlanLayoutType.Default.f103311a)) {
                    ArrayList arrayList = layout.f143727b;
                    String str3 = layout.f143726a;
                    ArrayList arrayListS = d8l.d.s(arrayList, allPlans);
                    if (str2 == null || arrayListS.isEmpty()) {
                        str = fkk.b.b(selection, arrayListS, currentPlan, str3).f152287a;
                    } else {
                        Iterator it8 = arrayListS.iterator();
                        while (it8.hasNext()) {
                            if (Intrinsics.f(((hha.d) it8.next()).f152287a, str2)) {
                            }
                        }
                        str = fkk.b.b(selection, arrayListS, currentPlan, str3).f152287a;
                    }
                } else {
                    if (!(layoutType instanceof PlanLayoutType.Gifting) && !Intrinsics.f(layoutType, PlanLayoutType.SwitchToFamily.f103313a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it9 = layout.f143727b.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((g1) next).f143718a, layout.f143726a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    g1 g1Var2 = (g1) next;
                    if (g1Var2 == null) {
                        g1Var2 = (g1) zhm.d0.d0(layout.f143727b);
                    }
                    if (g1Var2 != null) {
                        str = g1Var2.f143718a;
                    }
                }
                if (str == null) {
                    PlanLayoutType planLayoutType = planPagerFlowContract$InputData.d.f103060b;
                    planLayoutType.getClass();
                    if (!(planLayoutType instanceof PlanLayoutType.Default)) {
                        return Unit.f186387a;
                    }
                }
                String planId = str == null ? str2 : str;
                if (planId != null) {
                    dVar2.H2(yVar, new a5b.a((Object) d8l.d.l(layout, planId), (Object) dVar2, (Object) allPlans, (Object) layout, planId, 16));
                    enk.o oVar = dVar2.f103073w;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    oVar.f127845a.setValue(planId);
                }
                dVar2.P2();
                return Unit.f186387a;
            case 1:
                cli.y yVar2 = dVar.D;
                enk.d dVar3 = (enk.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (dVar3 instanceof enk.c) {
                    dVar.H2(yVar2, new r(1));
                } else {
                    if (!(dVar3 instanceof enk.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.H2(yVar2, new r(0));
                }
                return Unit.f186387a;
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.D, new ghg.r(data, 1));
                return Unit.f186387a;
        }
    }
}
