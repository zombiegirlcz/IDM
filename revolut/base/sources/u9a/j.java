package u9a;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAutomaticoPaymentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAutomaticoPaymentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f51913a;
        com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar2 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "NOTIFY_ME_TAG_ID")) {
            oki.h.v2(aVar2.f80621x, PixAutomaticoPaymentDetailsScreenContract$ModalStep.NotifyBeforePaymentInfo.f80612a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
