package rgk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanAction.OpenUrl f254217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar, PricingPlanAction.OpenUrl openUrl, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f254217w = openUrl;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f254217w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            PricingPlanAction.OpenUrl openUrl = this.f254217w;
            com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar = this.v;
            m mVar = new m(bVar, openUrl, null);
            this.u = 1;
            if (bVar.Y2(this, mVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
