package dmj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k0 k0Var = new k0(this.v, continuation);
        k0Var.u = obj2;
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k0) create((EsimPhoneNumberCheckout) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimPhoneNumberCheckout esimPhoneNumberCheckout = (EsimPhoneNumberCheckout) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q7c.g gVar = this.v.f101383q;
        u6c.n nVar = new u6c.n(null, null, u6c.t.ESIM_MOBILE_PLANS, Long.valueOf(esimPhoneNumberCheckout.d.f100403c.f100321a.f115082a), esimPhoneNumberCheckout.d.f100403c.f100321a.f115083b, false, null, null, 995);
        k6c.a aVar2 = k6c.b.Companion;
        return com.revolut.data.database.models.openbanking.d.x("EsimMobilePlanPhoneNumberCheckoutScreenModel", "Failed to obtain default payment pocket via PaymentMethodsInteractor", nim.a.v(gVar.b(nVar, w4l.i.f294643c), new a(2)));
    }
}
