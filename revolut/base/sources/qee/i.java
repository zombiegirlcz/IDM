package qee;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsContract$ModalStep;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardDeliveryDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CardDeliveryDetailsController cardDeliveryDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = cardDeliveryDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a aVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar2 = (com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) aVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "CANCEL_ORDER_ACTION_ID")) {
            oki.h.v2(aVar2.f89444y, CardDeliveryDetailsContract$ModalStep.CancelOrderConfirmation.f89436a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
