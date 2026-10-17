package hq9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ViewSplitItemsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ViewSplitItemsController viewSplitItemsController, Continuation continuation) {
        super(2, continuation);
        this.v = viewSplitItemsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String listId = model.f52373a;
        com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a aVar2 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "split_items_empty_state")) {
            oki.h.v2(aVar2.f79284r, new ViewSplitItemsControllerContract$ModalStep.AddItem(null), ModalDestination.Style.POPUP.f98311a);
        } else {
            hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown listId=", listId)));
        }
        return Unit.f186387a;
    }
}
