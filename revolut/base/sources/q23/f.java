package q23;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationController;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardDeliveryAddressVerificationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController, Continuation continuation) {
        super(2, continuation);
        this.v = cardDeliveryAddressVerificationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarR2 = this.v.R2();
        String listId = model.f53228a;
        com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) pVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ADDRESS_ROW_LIST_ID")) {
            com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.M2(bVar, (Address) ((q) ((j2) bVar.B.f22677a).getValue()).f241511a.getContent(), true);
        } else {
            if (!Intrinsics.f(listId, "DELIVERY_TO_LIST_ID")) {
                throw new IllegalStateException(h30.l.r("Unsupported row list id ", listId));
            }
            oki.h.v2(bVar.C, CardDeliveryAddressVerificationScreenContract$ModalStep.ShowDeliveryToForm.f65145a, ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
