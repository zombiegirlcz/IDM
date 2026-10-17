package cvl;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerController;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SourcePocketPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SourcePocketPickerController sourcePocketPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = sourcePocketPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        String listId = model.f52708a;
        Object obj3 = model.f52715m;
        com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = (com.revolut.trading.orders.ui.screens.pocket_picker.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof n) {
            com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.z;
            q qVar = ((n) obj3).f109498a;
            oki.h.v2(aVar2, new SourcePocketPickerScreenContract$ModalStep.SectionExplanation(qVar.f109499a, qVar.f109500b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
