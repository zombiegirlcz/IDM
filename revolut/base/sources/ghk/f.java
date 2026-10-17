package ghk;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import ggk.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanPagerFlow f143953w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PlanPagerFlow planPagerFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f143953w = planPagerFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f143953w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f143953w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanPagerFlow planPagerFlow = this.f143953w;
        switch (i) {
            case 0:
                String tabId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarR2 = planPagerFlow.R2();
                Intrinsics.h(tabId);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) iVarR2;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                cli.y yVar = dVar.D;
                h1 h1Var = (h1) ((j) ((j2) yVar.f22677a).getValue()).f143962g.getContent();
                if (h1Var != null) {
                    dVar.H2(yVar, new gbi.c(d8l.d.l(h1Var, tabId), tabId, 16));
                }
                dVar.P2();
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarR22 = planPagerFlow.R2();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) iVarR22;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                dVar2.n2(new ga9.v(dVar2, clickData, (Continuation) null, 23), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
