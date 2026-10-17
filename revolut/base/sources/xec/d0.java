package xec;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.feature.revolutpay.shipping.shared.R$string;
import k3k.q0;
import k7c.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends gim.i implements Function1 {
    public ShippingContact u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ShippingContact f304577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f304578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b f304579y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ShippingContact shippingContact, AddressFlowContract$OutputData addressFlowContract$OutputData, com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f304577w = shippingContact;
        this.f304578x = addressFlowContract$OutputData;
        this.f304579y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d0(this.f304577w, this.f304578x, this.f304579y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ShippingContact shippingContact;
        com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = this.f304579y;
        cli.y yVar = bVar.f84758s;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        int i2 = 28;
        Continuation continuation = null;
        int i3 = 1;
        if (i == 0) {
            yhm.o.b(obj2);
            ShippingContact shippingContactA = ShippingContact.a(this.f304577w, this.f304578x.f60940a);
            q7c.s sVar = bVar.o;
            this.u = shippingContactA;
            this.v = 1;
            y0 y0Var = sVar.f242835a;
            y0Var.getClass();
            q0 q0Var = new q0(shippingContactA, y0Var, continuation, i2);
            p0 p0Var = p0.f264001a;
            Object objJ = skm.e0.J(elm.f.f127540b, q0Var, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
            shippingContact = shippingContactA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shippingContact = this.u;
            yhm.o.b(obj2);
        }
        if (((e) ((j2) yVar.f22677a).getValue()).d instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.SelectContact) {
            bVar.H2(yVar, new z(shippingContact, 0));
            bVar.H2(yVar, new xe7.a(shippingContact != null ? new h(shippingContact) : g.f304588a, i3));
        }
        bVar.X1(new mii.e("ADDRESS_UPDATED_CONFIRMATION_ID", new TextLocalisedClause(R$string.revolut_pay_edit_address_toast_updated_title, null, null, 14), null, 28));
        return Unit.f186387a;
    }
}
