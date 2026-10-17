package eac;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeController;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutPayManagementHomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevolutPayManagementHomeController revolutPayManagementHomeController, Continuation continuation) {
        super(2, continuation);
        this.v = revolutPayManagementHomeController;
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
        i iVarE3 = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar2 = (com.revolut.feature.revolutpay.management.impl.ui.management.home.a) iVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.B;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -1687624749) {
            ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
            if (iHashCode != 779860404) {
                if (iHashCode == 1993294699 && listId.equals("ID_SHIPPING_ADDRESS_ITEM")) {
                    oki.h.v2(aVar3, RevolutPayManagementHomeControllerContract$Step.SelectShippingContact.f84590a, fullscreen_fade);
                }
            } else if (listId.equals("ID_PAYMENT_METHOD_ITEM")) {
                oki.h.v2(aVar3, RevolutPayManagementHomeControllerContract$Step.SelectPaymentMethod.f84589a, fullscreen_fade);
            }
        } else if (listId.equals("ID_PAY_WITH_SMILE_SETTINGS_ROW")) {
            aVar2.I2();
        }
        return Unit.f186387a;
    }
}
