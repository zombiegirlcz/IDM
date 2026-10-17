package xec;

import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oec.a;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ShippingContactsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(ShippingContactsScreen shippingContactsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = shippingContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.v, continuation, 0);
            case 1:
                return new p(this.v, continuation, 1);
            default:
                return new p(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        ShippingContactsScreen shippingContactsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) shippingContactsScreen.d();
                bVar.getClass();
                bVar.n2(new xb4.e(bVar, continuation, 2), new x(bVar, 0));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar2 = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) shippingContactsScreen.d();
                i iVar = ((e) ((j2) bVar2.f84758s.f22677a).getValue()).e;
                if (iVar instanceof h) {
                    bVar2.C2(new oec.c(((h) iVar).f304589a));
                } else if (iVar instanceof g) {
                    bVar2.C2(a.C1251a.f224576a);
                } else {
                    if (!(iVar instanceof f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.B2();
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar3 = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) shippingContactsScreen.d();
                bVar3.getClass();
                bVar3.n2(new com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.a(bVar3, null), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
