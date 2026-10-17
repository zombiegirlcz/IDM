package hbf;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.TransferProgressScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.TransferProgressScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferProgressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TransferProgressScreen transferProgressScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferProgressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar2 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        if (obj3 instanceof j) {
            oki.h.v2(aVar2.f91660w, new TransferProgressScreenContract$ModalStep.FeeDetails(((j) obj3).f150667a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
