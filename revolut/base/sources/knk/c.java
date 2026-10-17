package knk;

import aw0.n6;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanSingleOfferScreen f186173w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PlanSingleOfferScreen planSingleOfferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f186173w = planSingleOfferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f186173w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f186173w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f186173w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanSingleOfferScreen planSingleOfferScreen = this.f186173w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) planSingleOfferScreen.d()).N2(n6Var.f);
                break;
            case 1:
                n6 n6Var2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) planSingleOfferScreen.d()).N2(n6Var2.f);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE3 = planSingleOfferScreen.d();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a aVar4 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) hVarE3;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                aVar4.n2(new kb7.c(aVar4, clickData, null, 25), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
