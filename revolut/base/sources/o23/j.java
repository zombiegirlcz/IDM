package o23;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddressFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AddressFormController addressFormController, Continuation continuation) {
        super(2, continuation);
        this.v = addressFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.e3();
        String listId = model.f52613a;
        com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) uVarE3;
        bVar.getClass();
        cli.y yVar = bVar.D;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        j60.a.v(bVar.f65137x, false, null, 3);
        int iHashCode = listId.hashCode();
        if (iHashCode != -2131659848) {
            if (iHashCode != -1173659697) {
                if (iHashCode == -788355943 && listId.equals("CONFIRM_ADDRESS_BUTTON_LIST_ID")) {
                    Address addressK2 = ((w) ((j2) yVar.f22677a).getValue()).f;
                    if (addressK2 == null) {
                        addressK2 = bVar.K2();
                    }
                    bVar.C2(new x(addressK2, ((w) ((j2) yVar.f22677a).getValue()).f221469j, null, 16));
                }
            } else if (listId.equals("NO_HOUSE_NUMBER_BUTTON_APPROVED_ID")) {
                bVar.l2(new q(bVar, continuation, 1), new yi5.b(26));
            }
        } else if (listId.equals("CONFIRM_POOR_ADDRESS_BUTTON_LIST_ID")) {
            bVar.C2(new x(bVar.K2(), ((w) ((j2) yVar.f22677a).getValue()).f221469j, null, 16));
        }
        return Unit.f186387a;
    }
}
