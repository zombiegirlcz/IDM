package rgf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllAccountsTransactionFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AllAccountsTransactionFiltersScreen allAccountsTransactionFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = allAccountsTransactionFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarR2 = this.v.R2();
        Intrinsics.h(model);
        t tVar = (t) hVarR2;
        cli.y yVar = tVar.f254174w;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        if (obj3 instanceof ProductAccountDescriptor$Value.Main) {
            tVar.H2(yVar, new ib6.j(obj3, 19));
        } else if (obj3 instanceof NonProductAccountFilter) {
            tVar.H2(yVar, new ib6.j(obj3, 20));
        }
        return Unit.f186387a;
    }
}
