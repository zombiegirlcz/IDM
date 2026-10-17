package xec;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import k3k.q0;
import k7c.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f304572w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f304572w = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.v, this.f304572w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            q7c.s sVar = bVar.o;
            Address address = this.f304572w.f60940a;
            this.u = 1;
            y0 y0Var = sVar.f242835a;
            y0Var.getClass();
            q0 q0Var = new q0(y0Var, address, null, 26);
            p0 p0Var = p0.f264001a;
            obj2 = skm.e0.J(elm.f.f127540b, q0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ShippingContact shippingContact = (ShippingContact) obj2;
        if (((e) ((j2) bVar.f84758s.f22677a).getValue()).d instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.SelectContact) {
            bVar.H2(bVar.f84758s, new z(shippingContact, 1));
        }
        return Unit.f186387a;
    }
}
