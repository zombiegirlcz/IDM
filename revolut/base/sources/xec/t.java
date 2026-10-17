package xec;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ ShippingContactsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ShippingContactsScreen shippingContactsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = shippingContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z1 z1Var = ((com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.u.d()).f84757r;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
