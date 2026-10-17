package fzd;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConsolidatedStatementCustomisationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = consolidatedStatementCustomisationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = model.f53304a;
        u uVar = (u) lVarE3;
        z zVar = uVar.f139165s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (kotlin.text.a0.H(listId, "ID_PRODUCT_SELECTABLE_", false) || kotlin.text.a0.H(listId, "ID_ELEMENT_SELECTABLE_", false)) {
            uVar.f139164r.d3(listId);
        } else if (kotlin.text.a0.H(listId, "ID_TRANSACTION_CATEGORY_SELECTABLE_", false)) {
            zVar.h3(d0.e0(listId, "ID_TRANSACTION_CATEGORY_SELECTABLE_"));
        } else if (kotlin.text.a0.H(listId, "ID_TRANSACTION_DIRECTION_SELECTABLE_", false)) {
            zVar.i3(d0.e0(listId, "ID_TRANSACTION_DIRECTION_SELECTABLE_"));
        }
        return Unit.f186387a;
    }
}
