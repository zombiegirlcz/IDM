package y4f;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryController;
import com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HoldingsInformationEntryController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HoldingsInformationEntryController holdingsInformationEntryController, Continuation continuation) {
        super(2, continuation);
        this.v = holdingsInformationEntryController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.trading.impl.ui.holdings.information.entry.a aVar2 = (com.revolut.feature.trading.impl.ui.holdings.information.entry.a) hVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51781a, "ON_MARGIN_CALL_ITEM")) {
            Object obj3 = model.f51787l;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryControllerContract.Parcel.OnMarginCall");
            com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.u;
            boolean z = ((l) obj3).f310909a;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z) {
                oki.h.v2(aVar3, HoldingsInformationEntryControllerContract$ModalStep.OnMarginCall.f91218a, bottom_dialog);
            } else {
                oki.h.v2(aVar3, HoldingsInformationEntryControllerContract$ModalStep.NotOnMarginCall.f91217a, bottom_dialog);
            }
        }
        return Unit.f186387a;
    }
}
