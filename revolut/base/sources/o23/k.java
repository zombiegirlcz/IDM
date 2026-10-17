package o23;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddressFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AddressFormController addressFormController, Continuation continuation) {
        super(2, continuation);
        this.v = addressFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Address address;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.e3();
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) uVarE3;
        cli.y yVar = bVar.D;
        Address address2 = obj3 instanceof Address ? (Address) obj3 : null;
        if (address2 != null && (address = ((w) ((j2) yVar.f22677a).getValue()).e) != null) {
            Address addressK2 = bVar.K2();
            bVar.H2(yVar, new avj.p(address2, 14));
            j60.a aVar2 = bVar.f65137x;
            bVar.v.getClass();
            aVar2.A(u23.a.c(addressK2, address, address2));
        }
        return Unit.f186387a;
    }
}
