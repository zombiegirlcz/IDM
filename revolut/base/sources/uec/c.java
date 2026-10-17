package uec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ShippingContact f279333w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ShippingContact shippingContact, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f279333w = shippingContact;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f279333w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((DeliveryMethods) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DeliveryMethods deliveryMethods = (DeliveryMethods) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        DeliveryMethods.DeliveryMethod deliveryMethod = (DeliveryMethods.DeliveryMethod) d0.d0(deliveryMethods.f84735b);
        boolean z = deliveryMethods.f84734a;
        ShippingContact shippingContact = this.f279333w;
        return (!z || deliveryMethod == null) ? zi0.c.i(new pec.c(shippingContact)) : e.Z2(this.v, shippingContact, deliveryMethod);
    }
}
