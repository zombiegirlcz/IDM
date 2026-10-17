package o9a;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ PixAuthorisationRequestScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PixAuthorisationRequestScreen pixAuthorisationRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pixAuthorisationRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar2 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.u.d();
        aVar2.getClass();
        Intrinsics.checkNotNullParameter("NOTIFY_BEFORE_PAYMENT_ID", "listId");
        oki.h.v2(aVar2.u, PixAuthorisationRequestScreenContract$ModalStep.NotifyBeforePaymentInfo.f80591a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
