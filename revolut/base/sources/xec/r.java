package xec;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShippingContactsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ShippingContactsScreen shippingContactsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shippingContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        String id10 = model.f53228a;
        com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) jVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        bVar.H2(bVar.f84758s, new wsg.j(id10, 26));
        return Unit.f186387a;
    }
}
