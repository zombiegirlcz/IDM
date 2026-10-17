package com.revolut.feature.wealth.analytics.ui.widgetised.dashboard;

import bwg.b;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.utils.ListItemTarget;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardContract$ModalStep;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$id;
import iv0.p;
import iyg.g0;
import iyg.i;
import iyg.u;
import iyg.v;
import java.util.ArrayList;
import jpc.e;
import jul.o;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import rp0.l0;
import skm.a2;
import te0.w;
import tyg.f;
import tyg.j;
import tyg.m;
import vkm.j2;
import vkm.q;
import vyg.c;
import ybl.l;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements i {
    public final l A;
    public final AnalyticsProduct B;
    public final xwg.a C;
    public final b D;
    public final l0 E;
    public final myg.i F;
    public final gte.a G;
    public final vii.b H;
    public final com.revolut.kompot.navigable.vc.modal.a I;
    public a2 J;
    public a2 K;
    public a2 L;
    public a2 M;
    public a2 N;
    public final Object O;
    public final y P;
    public final WidgetisedAnalyticsDashboardContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f95064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ou5.b f95065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f95066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f95067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tyg.h f95068t;
    public final kpj.f u;
    public final jwg.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jxg.a f95069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tyg.a f95070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f95071y;
    public final o z;

    public a(WidgetisedAnalyticsDashboardContract$InputData inputData, g0 stateMapper, f widgetisedAnalyticsTotalValueInteractor, ou5.b widgetisedAnalyticsPnLInteractor, e widgetisedAnalyticsPerformanceInteractor, m widgetisedTimeframeInteractor, tyg.h widgetisedCurrentAllocationInteractor, kpj.f productTypeEnabledInteractor, jwg.h netWorthInteractor, jxg.a complexAnalyticsStateInteractor, tyg.a cryptoDisclaimerParamsInteractor, j configInteractor, o portfolioInsightsInteractor, l tradingConfigInteractor, AnalyticsProduct analyticsProduct, xwg.a portfolioInsightsUsageBottomSheetFactory, b emptyStateProvider, l0 popupMenuDialogDisplayer, myg.i popupMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsTotalValueInteractor, "widgetisedAnalyticsTotalValueInteractor");
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsPnLInteractor, "widgetisedAnalyticsPnLInteractor");
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsPerformanceInteractor, "widgetisedAnalyticsPerformanceInteractor");
        Intrinsics.checkNotNullParameter(widgetisedTimeframeInteractor, "widgetisedTimeframeInteractor");
        Intrinsics.checkNotNullParameter(widgetisedCurrentAllocationInteractor, "widgetisedCurrentAllocationInteractor");
        Intrinsics.checkNotNullParameter(productTypeEnabledInteractor, "productTypeEnabledInteractor");
        Intrinsics.checkNotNullParameter(netWorthInteractor, "netWorthInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsStateInteractor, "complexAnalyticsStateInteractor");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerParamsInteractor, "cryptoDisclaimerParamsInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(portfolioInsightsInteractor, "portfolioInsightsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(portfolioInsightsUsageBottomSheetFactory, "portfolioInsightsUsageBottomSheetFactory");
        Intrinsics.checkNotNullParameter(emptyStateProvider, "emptyStateProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(popupMapper, "popupMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f95064p = widgetisedAnalyticsTotalValueInteractor;
        this.f95065q = widgetisedAnalyticsPnLInteractor;
        this.f95066r = widgetisedAnalyticsPerformanceInteractor;
        this.f95067s = widgetisedTimeframeInteractor;
        this.f95068t = widgetisedCurrentAllocationInteractor;
        this.u = productTypeEnabledInteractor;
        this.v = netWorthInteractor;
        this.f95069w = complexAnalyticsStateInteractor;
        this.f95070x = cryptoDisclaimerParamsInteractor;
        this.f95071y = configInteractor;
        this.z = portfolioInsightsInteractor;
        this.A = tradingConfigInteractor;
        this.B = analyticsProduct;
        this.C = portfolioInsightsUsageBottomSheetFactory;
        this.D = emptyStateProvider;
        this.E = popupMenuDialogDisplayer;
        this.F = popupMapper;
        this.G = featureToggleInteractor;
        this.H = new vii.b();
        this.I = hx7.e.a(this, new in1.a(this, 22));
        Lazy lazyY0 = w.y0(new p(this, 5));
        this.O = lazyY0;
        this.P = d.b(this, new iyg.a(f0.f322471a, null, (c) lazyY0.getValue(), false, null, inputData.f95057c, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, dvg.a.NOT_ONBOARDED, inputData.d), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof iyg.w
            if (r0 == 0) goto L13
            r0 = r6
            iyg.w r0 = (iyg.w) r0
            int r1 = r0.f169751w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169751w = r1
            goto L18
        L13:
            iyg.w r0 = new iyg.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f169751w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L4f
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            ybl.l r5 = r5.A
            r6 = 0
            r2 = 3
            kotlinx.coroutines.flow.Flow r5 = ybl.l.a(r5, r6, r2)
            iui.b r6 = new iui.b
            r2 = 24
            r6.<init>(r2)
            jhi.b r5 = mo3.a.g(r5, r4, r6, r3)
            r0.f169751w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.util.Optional r6 = (java.util.Optional) r6
            java.lang.Object r5 = gj7.b.m(r6)
            hel.a r5 = (hel.a) r5
            if (r5 == 0) goto L5c
            com.revolut.shared.feature.wealth.models.config.Links r5 = r5.e
            return r5
        L5c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a.I2(com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum J2(com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof iyg.x
            if (r0 == 0) goto L13
            r0 = r5
            iyg.x r0 = (iyg.x) r0
            int r1 = r0.f169752w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169752w = r1
            goto L18
        L13:
            iyg.x r0 = new iyg.x
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f169752w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ybl.l r4 = r4.A
            akg.n r4 = ybl.l.d(r4)
            iui.b r5 = new iui.b
            r2 = 25
            r5.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r5, r3)
            r0.f169752w = r3
            java.lang.Object r5 = vkm.q.x(r4, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r5 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r5
            hel.b r4 = r5.f105106a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a.J2(com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a, gim.c):java.lang.Enum");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(this.E.f256113c), null, null, new v(10, this, continuation), 3);
        l2(new iaf.d(this, continuation, 26), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.I;
    }

    public final void K2() {
        WidgetisedAnalyticsType widgetisedAnalyticsType = ((iyg.a) ((j2) this.P.f22677a).getValue()).f169704b;
        if (widgetisedAnalyticsType == null) {
            return;
        }
        a2 a2Var = this.N;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.N = yji.l.a1(this, this.f95068t.a(widgetisedAnalyticsType, vyg.a.ASSET), null, null, new v(1, this, continuation), 3);
    }

    public final void L2() {
        y yVar = this.P;
        WidgetisedAnalyticsType widgetisedAnalyticsType = ((iyg.a) ((j2) yVar.f22677a).getValue()).f169704b;
        if (widgetisedAnalyticsType == null) {
            return;
        }
        a2 a2Var = this.K;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.K = yji.l.b1(this, this.f95066r.S(widgetisedAnalyticsType, ((iyg.a) ((j2) yVar.f22677a).getValue()).f169705c, iwg.c.TIME_WEIGHTED, null), null, new v(4, this, continuation), 3);
    }

    public final void M2() {
        y yVar = this.P;
        WidgetisedAnalyticsType widgetisedAnalyticsType = ((iyg.a) ((j2) yVar.f22677a).getValue()).f169704b;
        if (widgetisedAnalyticsType == null) {
            return;
        }
        a2 a2Var = this.M;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.M = yji.l.b1(this, this.f95065q.x(widgetisedAnalyticsType, ((iyg.a) ((j2) yVar.f22677a).getValue()).f169705c, vyg.f.TOTAL), null, new v(5, this, continuation), 3);
    }

    public final void N2() {
        y yVar = this.P;
        WidgetisedAnalyticsType analyticsType = ((iyg.a) ((j2) yVar.f22677a).getValue()).f169704b;
        if (analyticsType == null) {
            return;
        }
        a2 a2Var = this.L;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        c timeframe = ((iyg.a) ((j2) yVar.f22677a).getValue()).f169705c;
        ou5.b bVar = this.f95065q;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        this.L = yji.l.b1(this, nim.a.v(bVar.x(analyticsType, timeframe, vyg.f.TOTAL), new tx.f(26)), null, new v(6, this, continuation), 3);
    }

    public final void O2(WidgetisedAnalyticsType widgetisedAnalyticsType, c cVar) {
        if (widgetisedAnalyticsType == null) {
            return;
        }
        a2 a2Var = this.J;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.J = yji.l.b1(this, this.f95064p.a(widgetisedAnalyticsType, cVar), null, new v(8, this, continuation), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P2() {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a.P2():void");
    }

    public final void Q2() {
        c selectedTimeframe = ((iyg.a) ((j2) this.P.f22677a).getValue()).f169705c;
        if (!((jte.d) this.G).c(WealthAnalyticsApi$Toggles.AnalyticsDashboardContextualHeader.f94961c)) {
            h.v2(this.I, new WidgetisedAnalyticsDashboardContract$ModalStep.SelectTimeframe(selectedTimeframe), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        ListItemTarget listItemTarget = new ListItemTarget(R$id.recyclerView, "ACCOUNT_DROPDOWN_ID", com.revolut.core.ui_kit.R$id.internal_action_subheader_end_button);
        this.F.getClass();
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        EnumEntries<c> enumEntriesA = c.a();
        ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesA, 10));
        for (c cVar : enumEntriesA) {
            arrayList.add(PopupMenuItem.Companion.a(PopupMenuItem.INSTANCE, j6.a.q("analytics_dashboard_timeframe_", cVar.name()), uyg.e.a(cVar), cVar == selectedTimeframe, null, cVar, null, null, 232));
        }
        this.E.c(listItemTarget, zi0.c.d(arrayList), mw0.o.BELOW_START, mw0.m.f209296a);
    }

    public final void R2(iyg.h hVar) {
        if (((iyg.a) ((j2) this.P.f22677a).getValue()).f169710m == dvg.a.ONBOARDED) {
            C2(hVar);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.D.getClass();
        iwk.b bVar = new iwk.b(12);
        y yVar = this.P;
        Continuation continuation = null;
        yji.l.b1(this, yVar.B(bVar), null, new v(11, this, continuation), 3);
        int i = 0;
        yji.l.b1(this, q.Q(yVar.B(new iwk.b(15)), new u(i, this, continuation)), null, new v(i, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.P;
    }
}
