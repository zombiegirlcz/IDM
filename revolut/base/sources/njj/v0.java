package njj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class v0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v0 v0Var = new v0(this.v, continuation);
        v0Var.u = obj2;
        return v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v0) create((EsimDataPlan) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimDataPlan esimDataPlan = (EsimDataPlan) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q7c.g gVar = this.v.f101172q;
        u6c.n nVar = new u6c.n(null, null, u6c.t.ESIM_MOBILE_PLANS, Long.valueOf(esimDataPlan.e.f115082a), esimDataPlan.e.f115083b, false, null, null, 995);
        k6c.a aVar2 = k6c.b.Companion;
        return com.revolut.data.database.models.openbanking.d.x("EsimMobilePlanCheckoutScreenModel", "Failed to obtain default payment pocket via PaymentMethodsInteractor", nim.a.v(gVar.b(nVar, w4l.i.f294643c), new njf.d(5)));
    }
}
