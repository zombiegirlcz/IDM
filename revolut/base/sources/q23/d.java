package q23;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardDeliveryAddressVerificationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController, Continuation continuation) {
        super(2, continuation);
        this.v = cardDeliveryAddressVerificationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Address address;
        Address address2;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarR2 = this.v.R2();
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) pVarR2;
        y yVar = bVar.B;
        Address address3 = obj3 instanceof Address ? (Address) obj3 : null;
        if (address3 != null && (address = (Address) ((q) ((j2) yVar.f22677a).getValue()).f241511a.getContent()) != null && (address2 = ((q) ((j2) yVar.f22677a).getValue()).d) != null) {
            bVar.H2(yVar, new avj.p(address3, 18));
            j60.a aVar2 = bVar.u;
            bVar.f65152t.getClass();
            aVar2.A(u23.a.c(address, address2, address3));
        }
        return Unit.f186387a;
    }
}
