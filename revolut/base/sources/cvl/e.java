package cvl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerController;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SourcePocketPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SourcePocketPickerController sourcePocketPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = sourcePocketPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        String listId = model.f53228a;
        com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = (com.revolut.trading.orders.ui.screens.pocket_picker.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (a0.H(listId, "list_id_pocket_item_borrowingLimit_", false)) {
            oki.h.v2(bVar.z, SourcePocketPickerScreenContract$ModalStep.MarginBorrowingLimitExplanation.f107047a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
