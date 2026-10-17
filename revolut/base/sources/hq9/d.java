package hq9;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ViewSplitItemsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewSplitItemsController viewSplitItemsController, Continuation continuation) {
        super(2, continuation);
        this.v = viewSplitItemsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String listId = model.f52708a;
        com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a aVar2 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "split_items_header")) {
            oki.h.v2(aVar2.f79284r, new ViewSplitItemsControllerContract$ModalStep.AddItem(null), ModalDestination.Style.POPUP.f98311a);
        } else {
            hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown listId=", listId)));
        }
        return Unit.f186387a;
    }
}
