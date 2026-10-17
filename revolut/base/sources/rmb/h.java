package rmb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.SavingsTermSelectionScreen;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nmb.u;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SavingsTermSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SavingsTermSelectionScreen savingsTermSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = savingsTermSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.d();
        RowDelegate.Model model2 = (RowDelegate.Model) model.f53305b;
        q qVar = (q) cVarE3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model2, "model");
        Object obj3 = model2.u;
        SavingsProductData savingsProductData = obj3 instanceof SavingsProductData ? (SavingsProductData) obj3 : null;
        if (savingsProductData != null) {
            j2 j2Var = qVar.v;
            j2Var.getClass();
            j2Var.g(null, savingsProductData);
            qVar.H2(qVar.f255237x, new u(savingsProductData, 4));
        }
        return Unit.f186387a;
    }
}
