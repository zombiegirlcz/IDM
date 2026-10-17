package q23;

import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardDeliveryAddressVerificationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController, Continuation continuation) {
        super(2, continuation);
        this.v = cardDeliveryAddressVerificationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Address address;
        Address address2;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarR2 = this.v.R2();
        String listId = model.f52613a;
        com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) pVarR2;
        y yVar = bVar.B;
        Intrinsics.checkNotNullParameter(listId, "listId");
        j60.a.v(bVar.u, false, null, 3);
        switch (listId.hashCode()) {
            case -2131659848:
                if (listId.equals("CONFIRM_POOR_ADDRESS_BUTTON_LIST_ID") && (address = (Address) ((q) ((j2) yVar.f22677a).getValue()).f241511a.getContent()) != null) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.O2(bVar, address);
                }
                break;
            case -1945140190:
                if (listId.equals("EDIT_POOR_ADDRESS_BUTTON_LIST_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.M2(bVar, (Address) ((q) ((j2) yVar.f22677a).getValue()).f241511a.getContent(), true);
                }
                break;
            case -1173659697:
                if (listId.equals("NO_HOUSE_NUMBER_BUTTON_APPROVED_ID") && (address2 = (Address) ((q) ((j2) yVar.f22677a).getValue()).f241511a.getContent()) != null) {
                    bVar.l2(new i(bVar, address2, null, 0), new yi5.b(26));
                }
                break;
            case -788355943:
                if (listId.equals("CONFIRM_ADDRESS_BUTTON_LIST_ID")) {
                    Address address3 = ((q) ((j2) yVar.f22677a).getValue()).e;
                    if (address3 == null) {
                        address3 = (Address) ((q) ((j2) yVar.f22677a).getValue()).f241511a.getContent();
                    }
                    if (address3 != null) {
                        bVar.H2(yVar, new avj.p(address3, 17));
                        com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.O2(bVar, address3);
                    }
                }
                break;
            case 1907086529:
                if (listId.equals("NO_HOUSE_NUMBER_BUTTON_ADD_MISSING_INFO_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.M2(bVar, (Address) ((q) ((j2) yVar.f22677a).getValue()).f241511a.getContent(), true);
                }
                break;
        }
        return Unit.f186387a;
    }
}
