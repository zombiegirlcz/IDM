package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details;

import amd.i;
import cli.y;
import cod.c;
import com.revolut.data.model.Data;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import eqj.g;
import gmd.d;
import hr6.l;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import knd.e;
import knd.j0;
import knd.v;
import knd.x0;
import knd.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l5i.q;
import oki.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import rnd.j;
import skm.e0;
import ukm.f;
import vkm.j2;
import vkm.z1;
import xnd.n;
import zhm.d0;
import zhm.h0;
import znd.c0;
import znd.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements znd.b {

    @NotNull
    public static final c0 Companion = new c0();
    public static final Set U;
    public final nhf.a A;
    public final CoroutineScope B;
    public final y0 C;
    public final e D;
    public final j0 E;
    public final c F;
    public final bub.a G;
    public final kgm.c H;
    public final j I;
    public final xnd.a J;
    public final d K;
    public final jnd.h L;
    public final ujf.h M;
    public final y N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final AnalyticsAccountsSelection S;
    public final z1 T;
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lmd.a f87563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f87564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ge3.e f87565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ge3.d f87566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kge.d f87567t;
    public final v u;
    public final AnalyticsDetailsContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x0 f87568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l80.e f87569x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n f87570y;
    public final l z;

    static {
        yld.d[] elements = {yld.d.SPENDING, yld.d.INCOME};
        Intrinsics.checkNotNullParameter(elements, "elements");
        U = kotlin.collections.d.y0(elements);
    }

    public b(q analyticsTransactionsInteractor, lmd.a analyticsInteractor, g transactionAnalyticsInteractor, ge3.e transactionCategorisationInteractor, ge3.d earliestTransactionInteractor, kge.d customPeriodProvider, v analyticsDataProvider, AnalyticsDetailsContract$InputData inputData, x0 groupClickHandler, l80.e dateProvider, n analyticsDetailsParamsProvider, l freelancerCommandFactory, nhf.a unitedWalletInteractor, CoroutineScope coroutineScope, gte.a featureToggleInteractor, y0 initialBalancesByPeriodProvider, e analyticsAccountBalanceProvider, j0 analyticsGroupingExtraDataProvider, c chartOptionsStateFactory, bub.a revPointsOptInPlacementsExtension, kgm.c analyticsInlineTransactionsProvider, j analyticsAccountProvider, xnd.a analyticsAccountExtraDataProvider, d jointAccountParticipantsProvider, jnd.h analyticsBudgetProvider, ujf.h transactionSwipeActionHandler, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(transactionAnalyticsInteractor, "transactionAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(earliestTransactionInteractor, "earliestTransactionInteractor");
        Intrinsics.checkNotNullParameter(customPeriodProvider, "customPeriodProvider");
        Intrinsics.checkNotNullParameter(analyticsDataProvider, "analyticsDataProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(groupClickHandler, "groupClickHandler");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(analyticsDetailsParamsProvider, "analyticsDetailsParamsProvider");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(initialBalancesByPeriodProvider, "initialBalancesByPeriodProvider");
        Intrinsics.checkNotNullParameter(analyticsAccountBalanceProvider, "analyticsAccountBalanceProvider");
        Intrinsics.checkNotNullParameter(analyticsGroupingExtraDataProvider, "analyticsGroupingExtraDataProvider");
        Intrinsics.checkNotNullParameter(chartOptionsStateFactory, "chartOptionsStateFactory");
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsExtension, "revPointsOptInPlacementsExtension");
        Intrinsics.checkNotNullParameter(analyticsInlineTransactionsProvider, "analyticsInlineTransactionsProvider");
        Intrinsics.checkNotNullParameter(analyticsAccountProvider, "analyticsAccountProvider");
        Intrinsics.checkNotNullParameter(analyticsAccountExtraDataProvider, "analyticsAccountExtraDataProvider");
        Intrinsics.checkNotNullParameter(jointAccountParticipantsProvider, "jointAccountParticipantsProvider");
        Intrinsics.checkNotNullParameter(analyticsBudgetProvider, "analyticsBudgetProvider");
        Intrinsics.checkNotNullParameter(transactionSwipeActionHandler, "transactionSwipeActionHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = analyticsTransactionsInteractor;
        this.f87563p = analyticsInteractor;
        this.f87564q = transactionAnalyticsInteractor;
        this.f87565r = transactionCategorisationInteractor;
        this.f87566s = earliestTransactionInteractor;
        this.f87567t = customPeriodProvider;
        this.u = analyticsDataProvider;
        this.v = inputData;
        this.f87568w = groupClickHandler;
        this.f87569x = dateProvider;
        this.f87570y = analyticsDetailsParamsProvider;
        this.z = freelancerCommandFactory;
        this.A = unitedWalletInteractor;
        this.B = coroutineScope;
        this.C = initialBalancesByPeriodProvider;
        this.D = analyticsAccountBalanceProvider;
        this.E = analyticsGroupingExtraDataProvider;
        this.F = chartOptionsStateFactory;
        this.G = revPointsOptInPlacementsExtension;
        this.H = analyticsInlineTransactionsProvider;
        this.I = analyticsAccountProvider;
        this.J = analyticsAccountExtraDataProvider;
        this.K = jointAccountParticipantsProvider;
        this.L = analyticsBudgetProvider;
        this.M = transactionSwipeActionHandler;
        Data data = new Data(null, null, true, 3, null);
        yld.c cVar = yld.c.LINE_CHART;
        i iVar = i.CATEGORIES;
        i.Companion.getClass();
        i[] elements = {iVar, i.MERCHANTS, i.COUNTRIES, i.CURRENCIES};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.N = mra.d.b(this, new znd.a(data, cVar, iVar, kotlin.collections.d.y0(elements), null, null, -1, false, false, false, false, 30, true, null, null, null, null, null, null, null, null, GroupingExtraData.None.f87450a, h0.f322473a, null, null, false), stateMapper, null, true, 4);
        jte.d dVar = (jte.d) featureToggleInteractor;
        this.O = dVar.c(AnalyticsFeatureApi$Toggles.CreditCardCardholdersAnalyticsCategory.f87392c);
        this.P = dVar.c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c);
        this.Q = dVar.c(AnalyticsFeatureApi$Toggles.AnalyticsTransactionDetailsPager.f87389c);
        this.R = dVar.c(AnalyticsFeatureApi$Toggles.AnalyticsJointAccountContributions.f87386c);
        this.S = inputData.f87546a;
        z1 z1VarB = vkm.q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.T = z1VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b r11, yld.c r12, lzi.i r13, gim.c r14) throws java.lang.Throwable {
        /*
            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsContract$InputData r0 = r11.v
            boolean r1 = r14 instanceof znd.g0
            if (r1 == 0) goto L15
            r1 = r14
            znd.g0 r1 = (znd.g0) r1
            int r2 = r1.f323755w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f323755w = r2
            goto L1a
        L15:
            znd.g0 r1 = new znd.g0
            r1.<init>(r11, r14)
        L1a:
            java.lang.Object r14 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f323755w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r14)
            goto L86
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            yhm.o.b(r14)
            lzi.i r14 = lzi.i.CUSTOM
            if (r13 == r14) goto L3b
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        L3b:
            cod.c r14 = r11.F
            yld.d r3 = r0.f87547b
            r14.getClass()
            java.util.List r13 = cod.c.a(r3, r13)
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto L89
            boolean r12 = r13.contains(r12)
            if (r12 == 0) goto L53
            goto L89
        L53:
            lmd.a r11 = r11.f87563p
            java.lang.Object r12 = zhm.d0.b0(r13)
            r8 = r12
            yld.c r8 = (yld.c) r8
            yld.d r12 = r0.f87547b
            r1.f323755w = r4
            qmd.j r6 = r11.f196949a
            qmd.a r7 = hx7.q.b0(r12)
            r6.getClass()
            o4a.b r5 = new o4a.b
            r9 = 0
            r10 = 26
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r5, r1)
            if (r11 != r2) goto L7c
            goto L7e
        L7c:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L7e:
            if (r11 != r2) goto L81
            goto L83
        L81:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L83:
            if (r11 != r2) goto L86
            return r2
        L86:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L89:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.I2(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b, yld.c, lzi.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(3:14|45|46)(2:15|16))(5:17|85|18|73|74))(5:22|83|23|51|52))(6:27|(1:29)(1:30)|(1:32)(1:33)|34|(1:36)(1:37)|(3:77|47|(1:88)(3:50|51|52))(3:(4:42|(1:87)|45|46)|73|74))|53|75|57|(1:59)(1:60)|61|81|62|63|(1:89)|73|74|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ef, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f0, code lost:
    
        r15 = r10;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.J2(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof znd.y0
            if (r0 == 0) goto L13
            r0 = r7
            znd.y0 r0 = (znd.y0) r0
            int r1 = r0.f323804w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f323804w = r1
            goto L18
        L13:
            znd.y0 r0 = new znd.y0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f323804w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L8f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L6c
        L36:
            yhm.o.b(r7)
            l5i.q r7 = r6.o
            com.revolut.retail.feature.api.AnalyticsAccountsSelection r2 = r6.S
            r7.getClass()
            java.lang.String r5 = "analyticsAccountsSelection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.Object r7 = r7.f
            le3.k r7 = (le3.k) r7
            java.util.Set r2 = r2.getF99208a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = zhm.d0.d1(r2)
            vkm.v r7 = r7.a(r2)
            znc.j r2 = new znc.j
            r5 = 10
            r2.<init>(r5)
            r5 = 0
            jhi.b r7 = mo3.a.g(r7, r5, r2, r4)
            r0.f323804w = r4
            java.lang.Object r7 = r6.L2(r7, r0)
            if (r7 != r1) goto L6c
            goto L8e
        L6c:
            java.util.List r7 = (java.util.List) r7
            eqj.g r6 = r6.f87564q
            java.util.Collection r7 = (java.util.Collection) r7
            r2 = 0
            tof.q6[] r2 = new tof.q6[r2]
            java.lang.Object[] r7 = r7.toArray(r2)
            tof.q6[] r7 = (tof.q6[]) r7
            int r2 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r2)
            tof.q6[] r7 = (tof.q6[]) r7
            pfm.r r6 = r6.a(r7)
            r0.f323804w = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L8f
        L8e:
            return r1
        L8f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.K2(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b, gim.c):java.lang.Object");
    }

    public static void P2(b bVar, znd.c cVar, int i) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        bVar.H2(bVar.N, new zhf.f(cVar, 22));
    }

    @Override // yji.l
    public final void I1() {
        l2(new r0(0, this, null), new yi5.b(26));
    }

    @Override // yji.l
    public final void K1() {
        e0.n(this.B.getF74819h());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(jhi.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof znd.h0
            if (r0 == 0) goto L13
            r0 = r8
            znd.h0 r0 = (znd.h0) r0
            int r1 = r0.f323759w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f323759w = r1
            goto L18
        L13:
            znd.h0 r0 = new znd.h0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f323759w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L49
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            z6k.l r8 = new z6k.l
            r2 = 3
            r4 = 5
            r5 = 0
            r8.<init>(r2, r4, r5)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r2, r8)
            r0.f323759w = r3
            java.lang.Object r8 = vkm.q.z(r7, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L54
            tof.i1 r7 = tof.i1.f272794a
            java.util.List r7 = zhm.u.c(r7)
            return r7
        L54:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.L2(jhi.b, gim.c):java.lang.Object");
    }

    public final ind.g M2() {
        return (ind.g) ((znd.a) ((j2) this.N.f22677a).getValue()).f323707a.getContent();
    }

    public final void N2() {
        Set set = ((znd.a) ((j2) this.N.f22677a).getValue()).f323715n;
        if (set == null) {
            return;
        }
        if (set.size() > 1) {
            r6.b.D("Cannot manage categories for multiple wallets at the same time");
        }
        WalletId walletId = (WalletId) d0.L0(set);
        String str = walletId != null ? walletId.f66106a : null;
        if (str == null) {
            return;
        }
        C1(new AnalyticsFeatureConfig.CategoryManagement.Destination(str, AnalyticsFeatureConfig.CategoryManagement.Mode.Manage.f87405a));
    }

    public final void O2(mpd.c cVar) {
        ind.g gVar = (ind.g) ((znd.a) ((j2) this.N.f22677a).getValue()).f323707a.getContent();
        if (gVar == null) {
            return;
        }
        l2(new z9m.a(this, gVar, cVar, (Continuation) null, 7), new yi5.b(26));
    }

    public final void Q2(lzi.i expectedType, Integer num) {
        lzi.j jVar;
        ind.g gVar;
        lzi.h hVar;
        DateTime dateTime;
        LocalDate localDate;
        java.time.LocalDate earliestTrnxDate;
        List listC;
        Object objPrevious;
        y yVar = this.N;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        ind.g gVar2 = (ind.g) ((znd.a) j2Var.getValue()).f323707a.getContent();
        if (gVar2 == null || (jVar = gVar2.f162805b) == null || (gVar = (ind.g) ((znd.a) j2Var2.getValue()).f323707a.getContent()) == null || (hVar = gVar.f162806c) == null || (dateTime = ((znd.a) j2Var2.getValue()).e) == null || (localDate = dateTime.toLocalDate()) == null || (earliestTrnxDate = jli.b.e(localDate)) == null) {
            return;
        }
        lzi.h hVarN = xam.a.n(hVar, expectedType, num != null ? num.intValue() : 1L);
        java.time.LocalDate inclusionDate = (java.time.LocalDate) kotlin.ranges.f.d(jVar.f200981b.f99211b, ((l80.f) this.f87569x).e());
        kge.d dVar = this.f87567t;
        kzi.a aVar = (kzi.a) dVar.f183975c;
        Intrinsics.checkNotNullParameter(earliestTrnxDate, "earliestTrnxDate");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(inclusionDate, "inclusionDate");
        if (expectedType == lzi.i.CUSTOM) {
            return;
        }
        if (hVarN != null) {
            listC = ((gqj.c) aVar).a(earliestTrnxDate, hVarN);
        } else {
            listC = ((gqj.c) aVar).c(earliestTrnxDate, expectedType, num != null ? ((gqj.c) aVar).b(expectedType, num.intValue(), inclusionDate) : null);
        }
        ListIterator listIterator = listC.listIterator(listC.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = (AnalyticsSpendingPeriod$Interval) objPrevious;
            java.time.LocalDate localDate2 = analyticsSpendingPeriod$Interval.f99210a;
            if (inclusionDate.compareTo((Object) analyticsSpendingPeriod$Interval.f99211b) <= 0 && inclusionDate.compareTo((Object) localDate2) >= 0) {
                break;
            }
        }
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval2 = (AnalyticsSpendingPeriod$Interval) objPrevious;
        if (analyticsSpendingPeriod$Interval2 == null) {
            return;
        }
        ((eqj.d) dVar.f183974b).h(new lzi.j(expectedType, analyticsSpendingPeriod$Interval2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R2(com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r8, java.util.List r9, java.lang.String r10, com.revolut.core.ui_kit.models.Clause r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.R2(com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, java.util.List, java.lang.String, com.revolut.core.ui_kit.models.Clause, boolean):void");
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new r0(2, this, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.N;
    }
}
