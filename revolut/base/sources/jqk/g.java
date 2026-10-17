package jqk;

import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import efm.r;
import gp3.n;
import grl.r2;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import njf.j;
import te0.w;
import thf.k;
import thf.l;
import tof.i7;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements qsi.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qsi.b f177752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f177753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sjf.e f177754c;
    public final h9e.h d;
    public final mhf.b e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f177755g;

    public g(qsi.b contentProvider, l transactionsItemMapper, c moneyRequestMapping, e cardCheckoutListItemMapper, b juniorTransferRequestListItemMapper, mg8.a juniorMigrationAssetListItemMapper, sjf.e transactionsPerformanceTracker, h9e.h upcomingPaymentsInteractor, mhf.b transactionsFilterInteractor) {
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(moneyRequestMapping, "moneyRequestMapping");
        Intrinsics.checkNotNullParameter(cardCheckoutListItemMapper, "cardCheckoutListItemMapper");
        Intrinsics.checkNotNullParameter(juniorTransferRequestListItemMapper, "juniorTransferRequestListItemMapper");
        Intrinsics.checkNotNullParameter(juniorMigrationAssetListItemMapper, "juniorMigrationAssetListItemMapper");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        Intrinsics.checkNotNullParameter(upcomingPaymentsInteractor, "upcomingPaymentsInteractor");
        Intrinsics.checkNotNullParameter(transactionsFilterInteractor, "transactionsFilterInteractor");
        this.f177752a = contentProvider;
        this.f177753b = transactionsItemMapper;
        this.f177754c = transactionsPerformanceTracker;
        this.d = upcomingPaymentsInteractor;
        this.e = transactionsFilterInteractor;
        this.f = new k(1022, true, false, false, false, false);
    }

    public static final r a(g gVar, i7 i7Var, TransactionContext transactionContext, Set set, i7 i7Var2) {
        r rVarTakeUntil = ((gqk.e) gVar.f177752a).a(i7Var, transactionContext, set).takeUntil(new jof.a(18, new jpl.e(10)));
        Intrinsics.checkNotNullExpressionValue(rVarTakeUntil, "takeUntil(...)");
        TransactionsPerformanceTracker$Scenario transactionsPerformanceTracker$Scenario = TransactionsPerformanceTracker$Scenario.HOME_DOMAIN;
        oi0.d.e0(rVarTakeUntil, transactionsPerformanceTracker$Scenario.getTraceName());
        r rVarDoOnSubscribe = nz8.d.o(rVarTakeUntil, transactionsPerformanceTracker$Scenario, gVar.f177754c).doOnSubscribe(new jof.a(13, new jpl.e(11)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
        return w.z(rVarDoOnSubscribe, new jpl.e(9)).map(new jof.a(14, new f(gVar, i7Var2, transactionContext, 1)));
    }

    public static final r b(g gVar, i7 i7Var, TransactionContext context, Set disablePredefinedFilters, i7 i7Var2) {
        gqk.e eVar = (gqk.e) gVar.f177752a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(disablePredefinedFilters, "disablePredefinedFilters");
        r rVarF = ((j) eVar.f145771b).f();
        r rVarG = m70.a.g(rd0.e.c(eVar.f145772c.e(r2.UNRECOGNIZED), kotlin.coroutines.g.f186406a), null, new n(9), 1);
        gqa.a aVar = new gqa.a(6);
        h0 h0Var = h0.f322473a;
        r rVarSwitchMap = ue0.e.H(rVarG, h0Var, aVar).switchMap(new gjg.e(new gqk.a(eVar, 1), 26));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarDistinctUntilChanged = ue0.e.H(rVarSwitchMap, h0Var, new gqa.a(7)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r map = w.l(rVarF, rVarDistinctUntilChanged).map(new gjg.e(new gqa.a(10), 29));
        r rVarA = eVar.a(i7Var, context, disablePredefinedFilters);
        Intrinsics.h(map);
        r rVarSwitchMap2 = w.l(rVarA, map).switchMap(new gqk.b(new gqa.a(11), 0));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        r rVarDoOnNext = rVarSwitchMap2.map(new jof.a(15, new f(gVar, i7Var2, context, 0))).doOnNext(new jof.a(16, new jlh.g(gVar, 12)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return ue0.e.y(rVarDoOnNext, h0Var, new a5b.a(gVar, i7Var, context, disablePredefinedFilters, i7Var2, 26));
    }

    public final r c(nce.a aVar, nie.c accountDescriptor, RecurringPaymentAccount recurringPaymentAccount) {
        Intrinsics.checkNotNullParameter(accountDescriptor, "accountDescriptor");
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        return ((mce.d) this.d).b(aVar, accountDescriptor, recurringPaymentAccount);
    }
}
