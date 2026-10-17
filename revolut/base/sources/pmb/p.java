package pmb;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SavingsProductSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SavingsProductSelectionScreen savingsProductSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = savingsProductSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        String listId = model.f52613a;
        com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a aVar2 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((tmb.l) aVar2.f83331r).Z2(new tmb.e(listId));
        return Unit.f186387a;
    }
}
