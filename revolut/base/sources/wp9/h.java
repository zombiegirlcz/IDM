package wp9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SplitBillsSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SplitBillsSummaryScreen splitBillsSummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = splitBillsSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarD = this.v.d();
        String listId = model.f52373a;
        com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) yVarD;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ITEMIZATION_EMPTY_STATE_ID")) {
            oki.h.v2(cVar.f79256y, new SplitBillsSummaryScreenContract$Step.Itemization(cVar.J2(true), null), ModalDestination.Style.POPUP.f98311a);
        } else {
            hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown listId: ", listId)));
        }
        return Unit.f186387a;
    }
}
