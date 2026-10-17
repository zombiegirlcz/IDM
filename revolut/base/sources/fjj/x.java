package fjj;

import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((Optional) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar = this.v;
        q7c.g gVar = aVar.f101099q;
        Optional optional = (Optional) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = (String) gj7.b.m(optional);
        if (str != null) {
            u6c.n nVar = new u6c.n(null, null, u6c.t.ESIM, null, null, false, null, null, 995);
            k6c.a aVar3 = k6c.b.Companion;
            return com.revolut.data.database.models.openbanking.d.x("EsimMobilePlanBillingScreenModel", "observePocket", nim.a.v(gVar.d(nVar), new fg8.y(aVar, str, 16)));
        }
        u6c.n nVar2 = new u6c.n(null, null, u6c.t.ESIM, null, null, false, null, null, 995);
        k6c.a aVar4 = k6c.b.Companion;
        return com.revolut.data.database.models.openbanking.d.x("EsimMobilePlanBillingScreenModel", "observeDefaultPocket", nim.a.v(gVar.b(nVar2, w4l.i.f294643c), new fj5.e(22)));
    }
}
