package qgf;

import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlow;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$Step;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransactionListFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TransactionListFlow transactionListFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transactionListFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            case 3:
                return new f(this.v, continuation, 3);
            default:
                return new f(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        int i = this.u;
        TransactionListFlow transactionListFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                transactionListFlow.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar3 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) transactionListFlow.d();
                yki.a aVar4 = aVar3.v;
                cli.y yVar = aVar3.u;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                boolean z = ((h) j2Var.getValue()).d instanceof TransactionsListFilterType.ConfigurableFilter.AccountFilters;
                ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                if (z) {
                    TransactionsListFilterType.ConfigurableFilter configurableFilterL2 = com.revolut.feature.transaction_list.impl.ui.list.flow.a.L2(aVar3.o);
                    Intrinsics.i(configurableFilterL2, "null cannot be cast to non-null type com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ConfigurableFilter.AccountFilters");
                    TransactionsListFilterType.ConfigurableFilter configurableFilter = ((h) j2Var2.getValue()).d;
                    Intrinsics.i(configurableFilter, "null cannot be cast to non-null type com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ConfigurableFilter.AccountFilters");
                    oki.h.w2(aVar4, new TransactionListFlowContract$Step.AllAccountsTransactionFilter((TransactionsListFilterType.ConfigurableFilter.AccountFilters) configurableFilterL2, (TransactionsListFilterType.ConfigurableFilter.AccountFilters) configurableFilter), popup);
                } else {
                    TransactionsListFilterType.ConfigurableFilter configurableFilter2 = ((h) j2Var2.getValue()).d;
                    TransactionsListFilterType.ConfigurableFilter.SelectableFilters selectableFilters = configurableFilter2 instanceof TransactionsListFilterType.ConfigurableFilter.SelectableFilters ? (TransactionsListFilterType.ConfigurableFilter.SelectableFilters) configurableFilter2 : null;
                    if (selectableFilters != null && (list = selectableFilters.f92014a) != null && (!list.isEmpty())) {
                        TransactionsListFilterType.ConfigurableFilter configurableFilter3 = ((h) j2Var2.getValue()).d;
                        Intrinsics.i(configurableFilter3, "null cannot be cast to non-null type com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ConfigurableFilter.SelectableFilters");
                        oki.h.w2(aVar4, new TransactionListFlowContract$Step.TransactionFilter(((TransactionsListFilterType.ConfigurableFilter.SelectableFilters) configurableFilter3).f92014a), popup);
                    }
                }
                break;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar6 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) transactionListFlow.d();
                aVar6.H2(aVar6.u, new ocb.u(true, 22));
                break;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar8 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) transactionListFlow.d();
                aVar8.H2(aVar8.u, new ocb.u(false, 22));
                break;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = TransactionListFlow.R;
                transactionListFlow.d3().f174035c.i0();
                break;
        }
        return Unit.f186387a;
    }
}
