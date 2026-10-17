package dmj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckout;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutFee;
import dfj.g1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p0 p0Var = new p0(this.v, continuation);
        p0Var.u = obj2;
        return p0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yhm.r rVar = (yhm.r) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        PaymentMethod.Pocket userPocket = (PaymentMethod.Pocket) rVar.f314201a;
        EsimPhoneNumberCheckout phoneNumberCheckout = (EsimPhoneNumberCheckout) rVar.f314202b;
        boolean zBooleanValue = ((Boolean) rVar.f314203c).booleanValue();
        g1 g1Var = (g1) this.v.f101382p;
        g1Var.getClass();
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(phoneNumberCheckout, "phoneNumberCheckout");
        EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee = phoneNumberCheckout.d.f100403c;
        EsimMobilePlanPointsOption esimMobilePlanPointsOption = esimPhoneNumberCheckoutFee.f100323c;
        dj0.d dVar = esimMobilePlanPointsOption != null ? esimMobilePlanPointsOption.f100306c : null;
        if (!zBooleanValue || dVar == null) {
            dVar = esimPhoneNumberCheckoutFee.f100321a;
        }
        xi0.b bVar = userPocket.i.f115083b;
        xi0.b bVar2 = dVar.f115083b;
        long j2 = dVar.f115082a;
        if (Intrinsics.f(bVar, bVar2)) {
            return hb9.b.j(new EsimCheckoutPrice(null, dVar, dVar));
        }
        q7c.m mVar = g1Var.f113976a;
        xi0.b bVar3 = dVar.f115083b;
        akg.n nVarV = nim.a.v(mVar.b(bVar, j2, new k6c.e(bVar3)), new ar3.a(5, dVar));
        Pair[] elements = {new Pair("EsimPhoneNumberCheckoutInteractorImpl", "Failed to retrieve converted price while polling quote"), new Pair("User pocket currency", bVar.f306286a), new Pair("Original payment price", j2 + " " + bVar3.f306286a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return rd0.e.n(nVarV, kotlin.collections.d.y0(elements));
    }
}
