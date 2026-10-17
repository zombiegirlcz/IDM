package rgf;

import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AllAccountsTransactionFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AllAccountsTransactionFiltersScreen allAccountsTransactionFiltersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = allAccountsTransactionFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AllAccountsTransactionFiltersScreen allAccountsTransactionFiltersScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) allAccountsTransactionFiltersScreen.e3();
                f fVar = (f) ((j2) tVar.f254174w.f22677a).getValue();
                Set set = fVar.d;
                Set set2 = fVar.f;
                tVar.C2(new g(new TransactionsListFilterType.ConfigurableFilter.AccountFilters(set, zhm.d0.h0(set2, fVar.e)), Intrinsics.f(fVar.d, fVar.f254151c) && Intrinsics.f(set2, fVar.f254152g)));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) allAccountsTransactionFiltersScreen.e3()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
