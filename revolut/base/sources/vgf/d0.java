package vgf;

import com.revolut.core.model.account.AccountId;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.transactions.api.navigation.UpcomingPaymentsPocketInfo;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.i7;
import tof.ua;
import tof.va;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f289080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f289081x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a f289082y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f289082y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(0, this.f289082y, continuation);
                d0Var.f289080w = flowCollector;
                d0Var.f289081x = obj3;
                return d0Var.invokeSuspend(Unit.f186387a);
            case 1:
                d0 d0Var2 = new d0(1, this.f289082y, continuation);
                d0Var2.f289080w = flowCollector;
                d0Var2.f289081x = obj3;
                return d0Var2.invokeSuspend(Unit.f186387a);
            default:
                d0 d0Var3 = new d0(2, this.f289082y, continuation);
                d0Var3.f289080w = flowCollector;
                d0Var3.f289081x = obj3;
                return d0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow dVar;
        b0 b0VarL2;
        b0 b0Var;
        String str;
        efm.d0 d0VarM;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f289080w;
                    TransactionsFilterWithContext transactionsFilterWithContext = ((UnifiedTransactionsFilter) ((Pair) this.f289081x).f186385a).f94567a;
                    Flow gVar = transactionsFilterWithContext == null ? new go.g(null, 2) : mo3.a.g(nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(this.f289082y.f91936r, transactionsFilterWithContext.f91956a, null, 1, TransactionsSort.STARTED_DATE_DESC, new TransactionContext(new Priority.HIGH("Transactions including hidden"), transactionsFilterWithContext.f91957b.f60266b), 2)), new vga.g(23)), null, new vea.b(27), 1);
                    this.f289080w = null;
                    this.f289081x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f289080w;
                    UnifiedTransactionsFilter filter = (UnifiedTransactionsFilter) ((Pair) this.f289081x).f186385a;
                    pkg.b bVar = this.f289082y.o;
                    switch (bVar.f237168a) {
                        case 0:
                            Intrinsics.checkNotNullParameter(filter, "filter");
                            TransactionsFilterWithContext transactionsFilterWithContext2 = filter.f94567a;
                            if (transactionsFilterWithContext2 == null) {
                                throw new IllegalArgumentException("LegacyTransactionsMonthsAdapter requires a Standard filter");
                            }
                            dVar = new p73.d(rd0.e.b(((mjf.b0) ((com.revolut.domain.interactors.transactions.a) bVar.f237169b)).k(transactionsFilterWithContext2.f91956a, TransactionsSort.STARTED_DATE_ASC)), 14);
                            break;
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(filter, "filter");
                            Set set = (Set) bVar.f237169b;
                            ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
                            Iterator it8 = set.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((ikg.f) it8.next()).b(filter));
                            }
                            dVar = vkm.q.q(new j23.b((Flow[]) zhm.d0.d1(arrayList).toArray(new Flow[0]), 13));
                            break;
                    }
                    this.f289080w = null;
                    this.f289081x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar3 = this.f289082y;
                TransactionsScreenContract$InputData transactionsScreenContract$InputData = aVar3.B;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f289080w;
                    s sVar = (s) this.f289081x;
                    TransactionsListFilterType.ConfigurableFilter configurableFilter = sVar.f289131b;
                    TransactionsListFilterType.ConfigurableFilter.AccountFilters accountFilters = configurableFilter instanceof TransactionsListFilterType.ConfigurableFilter.AccountFilters ? (TransactionsListFilterType.ConfigurableFilter.AccountFilters) configurableFilter : null;
                    if (accountFilters != null) {
                        b0VarL2 = aVar3.L2(accountFilters);
                    } else {
                        TransactionsListFilterType transactionsListFilterType = transactionsScreenContract$InputData.f91925a;
                        boolean z = transactionsListFilterType instanceof TransactionsListFilterType.ByTransactionsFilter;
                        UpcomingPaymentsPocketInfo.AllPockets allPockets = UpcomingPaymentsPocketInfo.AllPockets.f92022a;
                        if (z) {
                            i7 i7Var = ((TransactionsListFilterType.ByTransactionsFilter) transactionsListFilterType).f92009a;
                            if (i7Var instanceof ua) {
                                b0Var = new b0(zhm.y0.b(((ua) i7Var).f273108a), allPockets);
                            } else if (i7Var instanceof va) {
                                Set set2 = ((va) i7Var).f273121a;
                                if (set2.isEmpty()) {
                                    zhm.h0 h0Var = zhm.h0.f322473a;
                                    b0VarL2 = new b0(h0Var, new UpcomingPaymentsPocketInfo.ListOfPockets(h0Var));
                                } else {
                                    b0Var = new b0(set2, allPockets);
                                }
                            } else {
                                zhm.h0 h0Var2 = zhm.h0.f322473a;
                                b0VarL2 = new b0(h0Var2, new UpcomingPaymentsPocketInfo.ListOfPockets(h0Var2));
                            }
                            b0VarL2 = b0Var;
                        } else if (transactionsListFilterType instanceof TransactionsListFilterType.NoFilters) {
                            b0VarL2 = new b0(zhm.h0.f322473a, allPockets);
                        } else {
                            if (!(transactionsListFilterType instanceof TransactionsListFilterType.ByAccounts)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b0VarL2 = aVar3.L2(((TransactionsListFilterType.ByAccounts) transactionsListFilterType).f92007a);
                        }
                    }
                    kgf.e eVar = aVar3.u;
                    RecurringPaymentAccount recurringPaymentAccount = transactionsScreenContract$InputData.f91928g;
                    RecurringPaymentFilter recurringPaymentFilter = transactionsScreenContract$InputData.f91929h;
                    Set set3 = b0VarL2.f289070a;
                    UpcomingPaymentsPocketInfo upcomingPaymentsPocketInfo = b0VarL2.f289071b;
                    String searchQuery = sVar.f289130a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
                    Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                    efm.r rVarA = g9e.a.a(eVar.f183982a, recurringPaymentFilter, recurringPaymentAccount, 19);
                    AccountId accountId = com.revolut.feature.subscriptions.models.a.a(recurringPaymentAccount);
                    Set set4 = set3;
                    if (set4 == null || set4.isEmpty()) {
                        str = "map(...)";
                        od0.i.Companion.getClass();
                        d0VarM = efm.d0.m(od0.h.a(upcomingPaymentsPocketInfo));
                        Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                    } else {
                        kgf.c cVar = eVar.f183983b;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        str = "map(...)";
                        efm.d0 d0VarFirstOrError = m70.a.g(nim.a.w(pd.b.r(osg.b.c(cVar.f183979a, w4l.h.f294642c, zhm.d0.i1(io3.k.a()), null, io3.i.INTERNAL, accountId, 4), new ke7.v(cVar, 4)), new atg.q(accountId, 2)), null, new kd8.f(13), 1).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        kce.c cVar2 = new kce.c(new imk.e(5, set3), 11);
                        d0VarFirstOrError.getClass();
                        d0VarM = new ufm.i(d0VarFirstOrError, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(d0VarM, str);
                    }
                    efm.r rVarX = d0VarM.x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    efm.r map = te0.w.l(rVarA, rVarX).map(new kce.c(new kcd.a(24), 10));
                    Intrinsics.checkNotNullExpressionValue(map, str);
                    vkm.d dVarB = rd0.e.b(nim.a.w(map, new j2c.o(eVar, 28, searchQuery, recurringPaymentFilter)));
                    this.f289080w = null;
                    this.f289081x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
