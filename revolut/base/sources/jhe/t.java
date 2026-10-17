package jhe;

import ahe.c0;
import ahe.d0;
import ahe.j0;
import ahe.w0;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$HomeTotalWealth2;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sfe.z;
import skm.p0;
import tof.q6;
import vkm.c2;
import vkm.d2;
import vkm.v1;
import vkm.y;
import zh9.u0;
import zhm.a1;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahe.t f174234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ssi.o f174235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qfe.a f174236c;
    public final mhf.b d;
    public final kge.d e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tzg.m f174237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rkg.b f174238h;

    public t(ahe.t interactor, x mapper, mhe.g tileMapper, ssi.o transactionsWidgetUiModel, qfe.a accountsTransactionsFilterProvider, mhf.b transactionsFilterInteractor, kge.d apmHomeActionsProvider, gte.a featureToggleInteractor, tzg.m wealthAccountsInteractor, rkg.b investAccountFilterMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(tileMapper, "tileMapper");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(accountsTransactionsFilterProvider, "accountsTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsFilterInteractor, "transactionsFilterInteractor");
        Intrinsics.checkNotNullParameter(apmHomeActionsProvider, "apmHomeActionsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(investAccountFilterMapper, "investAccountFilterMapper");
        this.f174234a = interactor;
        this.f174235b = transactionsWidgetUiModel;
        this.f174236c = accountsTransactionsFilterProvider;
        this.d = transactionsFilterInteractor;
        this.e = apmHomeActionsProvider;
        this.f = featureToggleInteractor;
        this.f174237g = wealthAccountsInteractor;
        this.f174238h = investAccountFilterMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(jhe.t r18, java.util.Set r19, java.util.List r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jhe.t.o(jhe.t, java.util.Set, java.util.List, gim.c):java.lang.Object");
    }

    public static TransactionListDestination p(Set set, Set set2) {
        return new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new TransactionsListFilterType.ConfigurableFilter.AccountFilters(set, a1.l(y0.b(NonProductAccountFilter.Crypto.f89715a), set2)), (TransactionContext) null), (String) null, (AccountId) null, (rhf.h) null, rhf.g.TOTAL_WEALTH_HOME, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65263));
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        HomeFeedWidgetContext.TotalWealth.INSTANCE.getClass();
        return new z(new HomeFeedWidgetContext.TotalWealth(null, 1, null), dsh.s.ADD_NEW_WIDGET);
    }

    @Override // pfe.b
    public final Flow j(ProductAccountId accountId, boolean z) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        w0 w0Var = (w0) this.f174234a;
        w0Var.getClass();
        Continuation continuation = null;
        wkm.l lVarQ = vkm.q.Q(vkm.q.s(new y(new g2d.c(2, 17, continuation), nim.a.u(new s(this, null), u0.m(vkm.q.M(rd0.e.e(new v1(new c0(w0Var, null)), h0.f322473a, new d0(3, null)), w0Var.f5040a, c2.a(d2.Companion, 1000L, 2), 1), ((jte.d) this.f).c(TransactionListApi$Toggles$HomeTotalWealth2.f91962c) ? nim.a.A(tzg.m.c(this.f174237g, null, cfl.k.f23744a, 1), new je5.n(26)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2)))), new je5.n(25), vkm.q.f290100b), new bbg.c0(continuation, this, z, 4));
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        Flow flowC = vkm.q.C(lVarQ, oji.e.f225788b);
        w0Var.getClass();
        return new y(new imk.p0(this, continuation, 28), new t38.e(flowC, 24, new ie7.h(new v1(new j0(w0Var, continuation, 0)), this, 13), new dqd.w(3, 1, null)));
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        w0 w0Var = (w0) this.f174234a;
        w0Var.getClass();
        return nim.a.v(u0.m(nim.a.v(u0.m(new v1(new j0(w0Var, null, 0)), vkm.q.q(nim.a.v(w0Var.f5043g.e(w4l.h.f294642c), new agh.h(15)))), new ahe.u(w0Var, 2)), this.e.p()), new cia.b(this, accountId, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.util.Set r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jhe.r
            if (r0 == 0) goto L13
            r0 = r7
            jhe.r r0 = (jhe.r) r0
            int r1 = r0.f174232w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174232w = r1
            goto L18
        L13:
            jhe.r r0 = new jhe.r
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174232w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.tab.accounts.models.NonProductAccountFilter$Crypto r7 = com.revolut.feature.tab.accounts.models.NonProductAccountFilter.Crypto.f89715a
            java.util.Set r7 = zhm.y0.b(r7)
            r0.f174232w = r3
            qfe.a r2 = r5.f174236c
            rhe.m r2 = (rhe.m) r2
            rhe.g r3 = new rhe.g
            r4 = 0
            r3.<init>(r6, r7, r2, r4)
            java.lang.Object r7 = skm.e0.G(r3, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r6 = zhm.d0.d1(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jhe.t.q(java.util.Set, gim.c):java.lang.Object");
    }
}
