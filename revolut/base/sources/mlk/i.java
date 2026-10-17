package mlk;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import igk.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanCancelFeaturesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(PlanCancelFeaturesScreen planCancelFeaturesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planCancelFeaturesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            default:
                return new i(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanCancelFeaturesScreen planCancelFeaturesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h0) planCancelFeaturesScreen.e3()).C2(f.a.f161244a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h0) planCancelFeaturesScreen.e3()).C2(f.b.f161245a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                planCancelFeaturesScreen.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
