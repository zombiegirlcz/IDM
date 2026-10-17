package w3c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreen;
import com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CheckoutScreen checkoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = checkoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f53228a;
        boolean zF = Intrinsics.f(str, "ACCOUNT_ITEM_LIST_ID");
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        CheckoutScreen checkoutScreen = this.v;
        if (zF) {
            oki.h.v2(((com.revolut.feature.revolut_shop.ui.screen.checkout.a) checkoutScreen.d()).f84232x, CheckoutScreenContract$ModalStep.SelectPaymentMethod.f84225a, popup);
        } else if (Intrinsics.f(str, "DELIVERY_ADDRESS_ITEM_LIST_ID")) {
            Object obj3 = model.u;
            if (obj3 instanceof a4c.a) {
                i iVarE3 = checkoutScreen.d();
                Address address = ((a4c.a) obj3).f1251a;
                com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar2 = (com.revolut.feature.revolut_shop.ui.screen.checkout.a) iVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(address, "address");
                List list = (List) ((e) ((j2) aVar2.f84231w.f22677a).getValue()).f.getContent();
                oki.h.v2(aVar2.f84232x, (list == null || !list.isEmpty()) ? new CheckoutScreenContract$ModalStep.SelectDeliveryAddress(address) : new CheckoutScreenContract$ModalStep.AddDeliveryAddress(address), popup);
            }
        }
        return Unit.f186387a;
    }
}
