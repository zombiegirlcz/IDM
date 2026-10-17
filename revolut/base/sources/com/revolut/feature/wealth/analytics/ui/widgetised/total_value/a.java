package com.revolut.feature.wealth.analytics.ui.widgetised.total_value;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import gzg.b;
import gzg.d0;
import gzg.n;
import gzg.p;
import gzg.t;
import gzg.u;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import oxg.q;
import rp0.l0;
import skm.a2;
import tyg.f;
import tyg.j;
import vkm.j2;
import vyg.c;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements p {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f95131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gzg.a f95132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f95133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tyg.h f95134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byg.a f95135t;
    public final l0 u;
    public final tyg.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f95137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f95138y;
    public a2 z;

    public a(WidgetisedAnalyticsTotalValueScreenContract$InputData inputData, d0 stateMapper, f totalValueInteractor, b totalValueInfoDialogProvider, gzg.a contributionsDialogProvider, q destinationProvider, tyg.h allocationInteractor, byg.a allocationCategoryPopupMenuProvider, l0 popupMenuDialogDisplayer, tyg.a cryptoDisclaimerParamsInteractor, j widgetisedProductConfigInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(totalValueInteractor, "totalValueInteractor");
        Intrinsics.checkNotNullParameter(totalValueInfoDialogProvider, "totalValueInfoDialogProvider");
        Intrinsics.checkNotNullParameter(contributionsDialogProvider, "contributionsDialogProvider");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        Intrinsics.checkNotNullParameter(allocationInteractor, "allocationInteractor");
        Intrinsics.checkNotNullParameter(allocationCategoryPopupMenuProvider, "allocationCategoryPopupMenuProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerParamsInteractor, "cryptoDisclaimerParamsInteractor");
        Intrinsics.checkNotNullParameter(widgetisedProductConfigInteractor, "widgetisedProductConfigInteractor");
        this.o = totalValueInteractor;
        this.f95131p = totalValueInfoDialogProvider;
        this.f95132q = contributionsDialogProvider;
        this.f95133r = destinationProvider;
        this.f95134s = allocationInteractor;
        this.f95135t = allocationCategoryPopupMenuProvider;
        this.u = popupMenuDialogDisplayer;
        this.v = cryptoDisclaimerParamsInteractor;
        this.f95136w = e.a(this, new t(this, 0));
        WidgetisedAnalyticsType widgetisedAnalyticsType = inputData.f95126a;
        this.f95137x = d.b(this, new n(widgetisedAnalyticsType, inputData.f95127b, widgetisedProductConfigInteractor.f(widgetisedAnalyticsType), inputData.f95128c, null, null, null, false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), widgetisedProductConfigInteractor.a(widgetisedAnalyticsType), vyg.a.ASSET, inputData.d), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.v.a(((n) ((j2) this.f95137x.f22677a).getValue()).f148108a), null, null, new u(this, null, 0), 3);
    }

    public final void I2() {
        a2 a2Var = this.z;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        y yVar = this.f95137x;
        this.z = l.a1(this, this.f95134s.a(((n) ((j2) yVar.f22677a).getValue()).f148108a, ((n) ((j2) yVar.f22677a).getValue()).f148114l), null, null, new u(this, continuation, 2), 3);
    }

    public final void J2() {
        a2 a2Var = this.f95138y;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        y yVar = this.f95137x;
        c cVar = ((n) ((j2) yVar.f22677a).getValue()).f148109b;
        this.f95138y = l.a1(this, this.o.a(((n) ((j2) yVar.f22677a).getValue()).f148108a, cVar), null, null, new u(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95136w;
    }

    public final void K2(String listId, String selectedId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        boolean zF = Intrinsics.f(listId, "CHART_TIMEFRAMES_LIST_ID");
        y yVar = this.f95137x;
        if (zF) {
            H2(yVar, new gqh.a(selectedId, 14));
        } else if (Intrinsics.f(listId, "TOTAL_VALUE_ALLOCATION_CATEGORIES_LIST_ID")) {
            H2(yVar, new gqh.a(selectedId, 15));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, new exe.j(new g9j.q(rd0.e.b(this.u.f256113c), 27), 12), null, new u(this, null, 1), 3);
        gvi.p pVar = new gvi.p(26);
        y yVar = this.f95137x;
        l.b1(this, vkm.q.q(yVar.B(pVar)), null, new gzg.y(this, null, 0), 3);
        l.b1(this, vkm.q.q(yVar.B(new gvi.p(27))), null, new gzg.y(this, null, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f95137x;
    }
}
