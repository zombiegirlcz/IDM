package fzd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConsolidatedStatementCustomisationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = consolidatedStatementCustomisationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = model.f53228a;
        u uVar = (u) lVarE3;
        z zVar = uVar.f139165s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (kotlin.text.a0.H(listId, "ID_PRODUCT_", false) || kotlin.text.a0.H(listId, "ID_ELEMENT_", false)) {
            uVar.f139164r.c3(listId);
        } else if (kotlin.text.a0.H(listId, "ID_TRANSACTION_CATEGORY_ITEM_", false)) {
            zVar.h3(d0.e0(listId, "ID_TRANSACTION_CATEGORY_ITEM_"));
        } else if (kotlin.text.a0.H(listId, "ID_TRANSACTION_DIRECTION_ITEM_", false)) {
            zVar.i3(d0.e0(listId, "ID_TRANSACTION_DIRECTION_ITEM_"));
        }
        return Unit.f186387a;
    }
}
