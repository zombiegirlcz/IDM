package rgk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanAction.OpenUrl f254216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar, PricingPlanAction.OpenUrl openUrl, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f254216w = openUrl;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f254216w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar = this.v;
            ajk.b bVar2 = bVar.f102968m;
            PricingPlanAction.OpenUrl openUrl = this.f254216w;
            String str = openUrl.f102805a;
            rgf.b bVar3 = new rgf.b(bVar, openUrl, 1);
            this.u = 1;
            Object objA = igk.k.a(bVar.r2(), bVar2, str, bVar3, this);
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
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
