package com.revolut.feature.transaction_list.impl.ui.list.screen.transactions;

import akg.n;
import anf.b;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.transactions.api.navigation.UpcomingPaymentsPocketInfo;
import eqj.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jhi.k;
import jkg.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import md6.m;
import mjf.f;
import oki.h;
import okl.l1;
import org.jetbrains.annotations.NotNull;
import qg7.v;
import qgf.j;
import qgf.s;
import sjf.e;
import ska.c;
import vdl.c1;
import vgf.a0;
import vgf.b0;
import vgf.c0;
import vgf.d0;
import vgf.e0;
import vgf.e1;
import vgf.f0;
import vgf.g0;
import vgf.i0;
import vgf.i1;
import vgf.j1;
import vgf.k0;
import vgf.r;
import vgf.u;
import vgf.z;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.z1;
import wli.x;
import yji.l;
import zh9.u0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements u {

    @NotNull
    private static final a0 Companion = new a0();
    public final b A;
    public final TransactionsScreenContract$InputData B;
    public final x C;
    public final gte.a D;
    public final qgf.b E;
    public final f F;
    public final z G;
    public final i4b.f H;
    public final g8i.a I;
    public final y J;
    public final com.revolut.kompot.navigable.vc.modal.a K;
    public final z1 L;
    public final pkg.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f91934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f91935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f91936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f91937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f91938t;
    public final kgf.e u;
    public final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j1 f91939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ujf.h f91940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e1 f91941y;
    public final j60.a z;

    public a(pkg.b unifiedTransactionsMonthsInteractor, d unifiedTransactionsPaginationInteractor, s transactionsFilterProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, e transactionsPerformanceTracker, g transactionAnalyticsInteractor, kgf.e upcomingTransactionsInteractor, j navBarInteractionMediator, j1 transactionsScrollingHandler, ujf.h transactionSwipeActionHandler, e1 navigationProvider, j60.a expandableControllerExtension, b sumCalculator, TransactionsScreenContract$InputData inputData, x deeplinkHandler, gte.a featureToggleInteractor, qgf.b byAccountTransactionLoader, f calculatedBalanceAvailabilityInteractor, z extraDataProvider, i4b.f legalEntityContextProvider, wsg.b walletsInteractor, g8i.a transactionDetailsNavigationChecker, i1 mapper) {
        Intrinsics.checkNotNullParameter(unifiedTransactionsMonthsInteractor, "unifiedTransactionsMonthsInteractor");
        Intrinsics.checkNotNullParameter(unifiedTransactionsPaginationInteractor, "unifiedTransactionsPaginationInteractor");
        Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        Intrinsics.checkNotNullParameter(transactionAnalyticsInteractor, "transactionAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(upcomingTransactionsInteractor, "upcomingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(navBarInteractionMediator, "navBarInteractionMediator");
        Intrinsics.checkNotNullParameter(transactionsScrollingHandler, "transactionsScrollingHandler");
        Intrinsics.checkNotNullParameter(transactionSwipeActionHandler, "transactionSwipeActionHandler");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        Intrinsics.checkNotNullParameter(sumCalculator, "sumCalculator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(byAccountTransactionLoader, "byAccountTransactionLoader");
        Intrinsics.checkNotNullParameter(calculatedBalanceAvailabilityInteractor, "calculatedBalanceAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(extraDataProvider, "extraDataProvider");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(transactionDetailsNavigationChecker, "transactionDetailsNavigationChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = unifiedTransactionsMonthsInteractor;
        this.f91934p = unifiedTransactionsPaginationInteractor;
        this.f91935q = transactionsFilterProvider;
        this.f91936r = transactionsInteractor;
        this.f91937s = transactionsPerformanceTracker;
        this.f91938t = transactionAnalyticsInteractor;
        this.u = upcomingTransactionsInteractor;
        this.v = navBarInteractionMediator;
        this.f91939w = transactionsScrollingHandler;
        this.f91940x = transactionSwipeActionHandler;
        this.f91941y = navigationProvider;
        this.z = expandableControllerExtension;
        this.A = sumCalculator;
        this.B = inputData;
        this.C = deeplinkHandler;
        this.D = featureToggleInteractor;
        this.E = byAccountTransactionLoader;
        this.F = calculatedBalanceAvailabilityInteractor;
        this.G = extraDataProvider;
        this.H = legalEntityContextProvider;
        this.I = transactionDetailsNavigationChecker;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.J = mra.d.b(this, new r(data, data2, null, "", r0.g(), null, J2(null), false, calculatedBalanceAvailabilityInteractor.a(inputData.f91925a), false, null, new Data(null, null, true, 3, null)), mapper, null, false, 12);
        this.K = hx7.e.a(this, new v48.d(this, 26));
        this.L = ta6.a.a(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a r6, com.revolut.feature.unified_transactions.models.UnifiedTransaction r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof vgf.a1
            if (r0 == 0) goto L13
            r0 = r8
            vgf.a1 r0 = (vgf.a1) r0
            int r1 = r0.f289069x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289069x = r1
            goto L18
        L13:
            vgf.a1 r0 = new vgf.a1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289069x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.unified_transactions.models.UnifiedTransaction r7 = r0.u
            yhm.o.b(r8)
            goto L4d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData r8 = r6.B
            boolean r8 = r8.k
            t38.e r2 = r6.K2()
            ayf.h r4 = new ayf.h
            r5 = 5
            r4.<init>(r2, r6, r8, r5)
            r0.u = r7
            r0.f289069x = r3
            java.lang.Object r8 = vkm.q.x(r4, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r0 = r8.f186385a
            com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter r0 = (com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter) r0
            java.lang.Object r8 = r8.f186386b
            java.lang.String r8 = (java.lang.String) r8
            com.revolut.kompot.navigable.vc.modal.a r6 = r6.K
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$ModalStep$DetailsPager r1 = new com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$ModalStep$DetailsPager
            com.revolut.feature.unified_transactions.api.navigation.UnifiedPagerInput r2 = new com.revolut.feature.unified_transactions.api.navigation.UnifiedPagerInput
            r2.<init>(r7, r0)
            r1.<init>(r2, r8)
            com.revolut.kompot.common.ModalDestination$Style$FullscreenPaged r7 = com.revolut.kompot.common.ModalDestination.Style.FullscreenPaged.f98310a
            oki.h.v2(r6, r1, r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a.I2(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a, com.revolut.feature.unified_transactions.models.UnifiedTransaction, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        k kVarU;
        Object gVar;
        md6.a aVar;
        TransactionsListFilterType.ConfigurableFilter.AccountFilters accountFilters;
        com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar2 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) this.v;
        int i = 26;
        int i2 = 2;
        Continuation continuation = null;
        if (!((qgf.h) ((j2) aVar2.u.f22677a).getValue()).f245801c) {
            this.f91937s.d(TransactionsPerformanceTracker$Scenario.LIST_UI);
            l2(new i0(i2, this, continuation), new yi5.b(i));
        }
        int i3 = 1;
        l2(new i0(i3, this, continuation), new yi5.b(i));
        boolean zJ2 = J2(null);
        int i5 = 0;
        int i6 = 5;
        y yVar = this.J;
        if (zJ2) {
            l.a1(this, q.Q(K2(), new d0(i2, this, continuation)), null, null, new g0(i6, this, continuation), 3);
            l2(new i0(i5, this, continuation), new yi5.b(i));
        } else {
            H2(yVar, new vga.g(19));
        }
        TransactionsScreenContract$InputData transactionsScreenContract$InputData = this.B;
        ayf.h hVar = new ayf.h(K2(), this, transactionsScreenContract$InputData.k, i6);
        l1 l1Var = new l1(new q0(hVar, new vge.z1(this, continuation, i3), 1), 13);
        tnb.k kVar = new tnb.k(aVar2.f91917r, i);
        int i21 = 14;
        int i22 = 3;
        int i32 = 24;
        Flow flowA = this.f91934p.a(q.J(l1Var, new t38.e(new q0(new v0b.b(this.L, this, 8), new g0(7, this, continuation), 1), i32, hVar, new c(i22, continuation)), new t38.e(new q0(kVar, new a82.s(this, continuation, i21), 1), i32, hVar, new jv.d(3, 2, null))));
        z zVar = this.G;
        whf.b bVar = zVar.f289148a;
        TransactionsScreenContract$InputData transactionsScreenContract$InputData2 = zVar.f289149b;
        TransactionsListFilterType transactionsListFilterType = transactionsScreenContract$InputData2.f91925a;
        AccountId accountId = transactionsScreenContract$InputData2.f91926b;
        if (transactionsListFilterType instanceof TransactionsListFilterType.ByAccounts) {
            vkm.y yVarA = z.a(rd0.e.b(((anf.r) bVar).b(AccountId.Personal.f51414a)));
            AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
            kVarU = nim.a.u(new vgf.x(zVar, continuation, i5), u0.m(yVarA, q.Q(joint != null ? new go.g(joint, 2) : rd0.e.e(k38.c.a(zVar.f289150c, null, null, 3), h0.f322473a, new vgf.y(3, null)), new c1(continuation, zVar, i22))));
        } else {
            if (!(transactionsListFilterType instanceof TransactionsListFilterType.ByTransactionsFilter) && !(transactionsListFilterType instanceof TransactionsListFilterType.NoFilters)) {
                throw new NoWhenBranchMatchedException();
            }
            kVarU = nim.a.u(new vgf.x(zVar, continuation, i3), z.a(rd0.e.b(((anf.r) bVar).b(accountId))));
        }
        n nVarV = nim.a.v(u0.i(flowA, kVarU, new v2e.h0(rd0.e.b(this.A.b()), 9)), new vga.g(18));
        qgf.b bVar2 = this.E;
        TransactionsListFilterType transactionsListFilterType2 = bVar2.f245794c;
        int i33 = 21;
        if (transactionsListFilterType2 instanceof TransactionsListFilterType.ByAccounts) {
            rgf.y yVar2 = bVar2.f245793b;
            TransactionsListFilterType.ByAccounts byAccounts = transactionsListFilterType2 instanceof TransactionsListFilterType.ByAccounts ? (TransactionsListFilterType.ByAccounts) transactionsListFilterType2 : null;
            Set additionalFilters = (byAccounts == null || (accountFilters = byAccounts.f92007a) == null) ? null : accountFilters.f92013b;
            if (additionalFilters == null) {
                additionalFilters = h0.f322473a;
            }
            yVar2.getClass();
            Intrinsics.checkNotNullParameter(additionalFilters, "additionalFilters");
            gVar = q.Q(new mle.x(yVar2.f254182a.a(sfe.a.FULL, qfe.j.f245295a), yVar2, additionalFilters, i33), new q7b.j(continuation, bVar2, i21));
        } else {
            if (!(transactionsListFilterType2 instanceof TransactionsListFilterType.ByTransactionsFilter) && !(transactionsListFilterType2 instanceof TransactionsListFilterType.NoFilters)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new go.g(Boolean.TRUE, 2);
        }
        l.a1(this, new t38.e(nVarV, i32, gVar, new et6.j(3, 3, null)), null, null, new g0(4, this, continuation), 3);
        l.a1(this, q.Q(new ayf.h(K2(), this, transactionsScreenContract$InputData.k, 5), new d0(1, this, continuation)), null, null, new g0(i2, this, continuation), 3);
        t38.e eVarK2 = K2();
        vga.g gVar2 = new vga.g(20);
        pq0.d dVar = q.f290100b;
        l.a1(this, q.H(new f0(this, null), new q0(q.s(eVarK2, gVar2, dVar), new e0(this, null), 1)), null, null, new rf9.h(this, continuation, i21), 3);
        int i43 = 0;
        l.a1(this, q.Q(q.s(new ayf.h(K2(), this, true, 5), new vga.g(i33), dVar), new d0(i43, this, continuation)), null, null, new g0(i43, this, continuation), 3);
        switch (c0.f289075a[transactionsScreenContract$InputData.d.ordinal()]) {
            case 1:
            case 2:
                aVar = new md6.a(md6.e.CREDIT, m.f204493a, (md6.d) null, (md6.f) null, 60);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                aVar = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        l.a1(this, this.H.j(aVar), null, null, new g0(1, this, continuation), 3);
        l2(new i0(5, this, continuation), new yi5.b(26));
        if (!transactionsScreenContract$InputData.f91931l || ((r) ((j2) yVar.f22677a).getValue()).i) {
            return;
        }
        l.a1(this, new vkm.t0(yVar.B(new vga.g(22)), 1), null, null, new g0(i22, this, continuation), 3);
    }

    public final boolean J2(Long l2) {
        Long l3;
        switch (c0.f289075a[this.B.d.ordinal()]) {
            case 1:
            case 3:
            case 5:
            case 6:
            case 8:
            case 12:
                if (l2 == null || (l3 = ((r) ((j2) this.J.f22677a).getValue()).f) == null) {
                    return true;
                }
                return l2.longValue() >= l3.longValue();
            case 2:
            case 4:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.K;
    }

    public final t38.e K2() {
        com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) this.v;
        return new t38.e(new q0(q.q(new ft4.f0(t1.g(aVar.f91919t, 300L), 2)), new g0(6, this, null), 1), 24, aVar.u.B(new v(1)), new k0(3, null));
    }

    public final b0 L2(TransactionsListFilterType.ConfigurableFilter.AccountFilters accountFilters) {
        TransactionsScreenContract$InputData transactionsScreenContract$InputData;
        Set set = accountFilters.f92012a;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = set.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            transactionsScreenContract$InputData = this.B;
            if (!zHasNext) {
                break;
            }
            Object next = it8.next();
            ProductId productId = ((ProductAccountDescriptor$Value.Main) next).f89727a;
            if (productId == ProductId.CURRENCY || ((productId == ProductId.JOINT && (transactionsScreenContract$InputData.f91928g instanceof RecurringPaymentAccount.Joint)) || (productId == ProductId.PRO && (transactionsScreenContract$InputData.f91928g instanceof RecurringPaymentAccount.Pro)))) {
                arrayList.add(next);
            }
        }
        boolean zContains = zhm.v.k(rhf.g.CREDIT_CARD_HOME, rhf.g.CREDIT_CARD_CASHBACK).contains(transactionsScreenContract$InputData.d);
        UpcomingPaymentsPocketInfo.AllPockets allPockets = UpcomingPaymentsPocketInfo.AllPockets.f92022a;
        if (zContains) {
            return new b0(h0.f322473a, allPockets);
        }
        if (arrayList.isEmpty()) {
            h0 h0Var = h0.f322473a;
            return new b0(h0Var, new UpcomingPaymentsPocketInfo.ListOfPockets(h0Var));
        }
        if (!arrayList.isEmpty()) {
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                if (kotlin.text.a0.H(((ProductAccountDescriptor$Value.Main) it9.next()).f89728b.f89729a, "Total-", false)) {
                    return new b0(h0.f322473a, allPockets);
                }
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            linkedHashSet.add(((ProductAccountDescriptor$Value.Main) it10.next()).f89728b.f89729a);
        }
        return new b0(linkedHashSet, allPockets);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.J;
    }
}
