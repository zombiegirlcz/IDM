package hq9;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ViewSplitItemsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ViewSplitItemsController viewSplitItemsController, Continuation continuation) {
        super(2, continuation);
        this.v = viewSplitItemsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Object obj3 = vhVar.f54883a.f;
        com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a aVar2 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a) jVarE3;
        aVar2.getClass();
        SplitBillItem splitBillItem = obj3 instanceof SplitBillItem ? (SplitBillItem) obj3 : null;
        if (splitBillItem == null) {
            hx7.e.h(new IllegalArgumentException(a0.d.m(obj3, "Expected SplitBillItem parcel, got ")));
        } else {
            oki.h.v2(aVar2.f79284r, new ViewSplitItemsControllerContract$ModalStep.RemoveItem(splitBillItem), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
