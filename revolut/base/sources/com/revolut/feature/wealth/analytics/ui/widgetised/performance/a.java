package com.revolut.feature.wealth.analytics.ui.widgetised.performance;

import boh.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import java.util.List;
import java.util.Optional;
import jpc.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import oxg.q;
import rp0.l0;
import skm.a2;
import sxg.k;
import tyg.j;
import vkm.j2;
import vy5.d0;
import vyg.g;
import wyc.p;
import wyg.c;
import wyg.u;
import yji.l;
import yyg.b;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements c {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f95105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f95106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0 f95107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tyg.a f95108s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zyg.a f95109t;
    public final byg.c u;
    public final kbb.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f95110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95111x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f95112y;
    public a2 z;

    public a(WidgetisedAnalyticsPerformanceContract$InputData inputData, u stateMapper, j configInteractor, e widgetisedAnalyticsPerformanceInteractor, q complexAnalyticsDestinationProvider, b calculationMethodPopupMenuProvider, l0 popupMenuDialogDisplayer, tyg.a cryptoDisclaimerParamsInteractor, zyg.a learnMoreControllerDataProvider, byg.c contributorCategoryPopupMenuProvider, kbb.c benchmarkInteractor) {
        List listC;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsPerformanceInteractor, "widgetisedAnalyticsPerformanceInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsDestinationProvider, "complexAnalyticsDestinationProvider");
        Intrinsics.checkNotNullParameter(calculationMethodPopupMenuProvider, "calculationMethodPopupMenuProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerParamsInteractor, "cryptoDisclaimerParamsInteractor");
        Intrinsics.checkNotNullParameter(learnMoreControllerDataProvider, "learnMoreControllerDataProvider");
        Intrinsics.checkNotNullParameter(contributorCategoryPopupMenuProvider, "contributorCategoryPopupMenuProvider");
        Intrinsics.checkNotNullParameter(benchmarkInteractor, "benchmarkInteractor");
        this.o = widgetisedAnalyticsPerformanceInteractor;
        this.f95105p = complexAnalyticsDestinationProvider;
        this.f95106q = calculationMethodPopupMenuProvider;
        this.f95107r = popupMenuDialogDisplayer;
        this.f95108s = cryptoDisclaimerParamsInteractor;
        this.f95109t = learnMoreControllerDataProvider;
        this.u = contributorCategoryPopupMenuProvider;
        this.v = benchmarkInteractor;
        vyg.c cVar = inputData.f95099a;
        WidgetisedAnalyticsType analyticsType = inputData.f95100b;
        boolean zH = configInteractor.h(analyticsType);
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.Crypto) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities)) {
            listC = zhm.u.c(vyg.e.ASSET);
        } else if ((analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage)) {
            listC = v.k(vyg.e.ASSET, vyg.e.SECTOR);
        } else if ((analyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts)) {
            listC = v.k(vyg.e.ASSET, vyg.e.PRODUCT, vyg.e.SECTOR);
        } else if (analyticsType instanceof WidgetisedAnalyticsType.Cfd) {
            listC = v.k(vyg.e.ASSET, vyg.e.POSITIONS);
        } else {
            if (!(analyticsType instanceof WidgetisedAnalyticsType.Robo)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = f0.f322471a;
        }
        List list = listC;
        hel.b bVar = inputData.f95101c;
        List list2 = configInteractor.d(analyticsType).f169086a;
        this.f95110w = d.b(this, new wyg.a(cVar, analyticsType, bVar, zH, null, new Data(null, null, true, 3, null), configInteractor.d(analyticsType).f169087b, list2, new Data(null, null, true, 3, null), null, null, list, vyg.e.ASSET, null, inputData.d), stateMapper, null, false, 12);
        this.f95111x = hx7.e.a(this, new wtj.c(this, 21));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.b(this.f95107r.f256113c), null, null, new wyg.v(this, continuation, 3), 3);
        l.a1(this, this.f95108s.a(((wyg.a) ((j2) this.f95110w.f22677a).getValue()).f301273b), null, null, new wyg.v(this, continuation, 1), 3);
    }

    public final void I2() {
        a2 a2Var = this.f95112y;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        y yVar = this.f95110w;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        WidgetisedAnalyticsType analyticsType = ((wyg.a) j2Var.getValue()).f301273b;
        vyg.c timeframe = ((wyg.a) j2Var2.getValue()).f301272a;
        iwg.c method = ((wyg.a) j2Var2.getValue()).f301275g;
        vyg.e category = ((wyg.a) j2Var2.getValue()).f301279m;
        e eVar = this.o;
        k kVar = (k) eVar.f177257c;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(category, "category");
        j jVar = (j) eVar.d;
        this.f95112y = l.a1(this, jVar.g(analyticsType) ? kVar.g(analyticsType, jVar.b(analyticsType), timeframe.b(), method, category) : kVar.h(analyticsType, timeframe.b(), method, category), null, null, new wyg.v(this, continuation, 0), 3);
    }

    public final void J2() {
        a2 a2Var = this.z;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.z = l.a1(this, f.e(nim.a.v(new d0(this.f95110w.B(new p(7)), 12), new p(8)), new wvg.d0(this, 20)), null, null, new wyg.v(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95111x;
    }

    public final void K2(String listId, String selectedId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        boolean zF = Intrinsics.f(listId, "CHART_TIMEFRAMES_LIST_ID");
        y yVar = this.f95110w;
        if (zF) {
            H2(yVar, new wsg.j(selectedId, 7));
        } else if (Intrinsics.f(listId, "CONTRIBUTOR_CATEGORIES_LIST_ID")) {
            H2(yVar, new wvg.d0(vyg.e.valueOf(selectedId), 22));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        boolean zC;
        g gVarS;
        p pVar = new p(9);
        y yVar = this.f95110w;
        Continuation continuation = null;
        l.a1(this, yVar.B(pVar), null, null, new wkg.e(this, continuation, 23), 3);
        WidgetisedAnalyticsType analyticsType = ((wyg.a) ((j2) yVar.f22677a).getValue()).f301273b;
        kbb.c cVar = this.v;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        j jVar = (j) cVar.f182550c;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Robo)) {
            zC = ((jte.d) jVar.f275581a).c(WealthAnalyticsApi$Toggles.Benchmark.f94965c);
        } else {
            if (!(analyticsType instanceof WidgetisedAnalyticsType.Commodities) && !(analyticsType instanceof WidgetisedAnalyticsType.Crypto)) {
                throw new NoWhenBranchMatchedException();
            }
            zC = false;
        }
        Flow flowE = (zC && (gVarS = kbb.c.S(analyticsType)) != null) ? f.e(((zq.a) cVar.d).t(), new twg.a(cVar, gVarS, 11)) : new go.g(zi0.c.P(Optional.empty(), false, null, 3), 2);
        l.b1(this, nim.a.y(rd0.e.n(flowE, h0.f322473a), new p(10)), null, new wyg.v(this, continuation, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f95110w;
    }
}
