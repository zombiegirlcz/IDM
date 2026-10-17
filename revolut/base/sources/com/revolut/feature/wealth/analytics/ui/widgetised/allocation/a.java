package com.revolut.feature.wealth.analytics.ui.widgetised.allocation;

import a83.j0;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.config.Links;
import dcf.v0;
import dmj.k;
import dt4.p;
import dwi.f;
import dyg.j;
import dyg.r;
import hel.b;
import hx7.e;
import java.util.List;
import kbb.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import oxg.m;
import rp0.l0;
import skm.a2;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements j {
    public final tyg.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f95048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f95049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byg.a f95050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l0 f95051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tyg.a f95052t;
    public final AnalyticsProduct u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95053w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f95054x;

    public a(WidgetisedAnalyticsAllocationScreenContract$InputData inputData, r stateMapper, tyg.h allocationInteractor, m destinationProvider, c currencyInteractor, byg.a allocationCategoryPopupMenuProvider, l0 popupMenuDialogDisplayer, tyg.a cryptoDisclaimerParamsInteractor, tyg.j widgetisedProductConfigInteractor, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(allocationInteractor, "allocationInteractor");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        Intrinsics.checkNotNullParameter(currencyInteractor, "currencyInteractor");
        Intrinsics.checkNotNullParameter(allocationCategoryPopupMenuProvider, "allocationCategoryPopupMenuProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerParamsInteractor, "cryptoDisclaimerParamsInteractor");
        Intrinsics.checkNotNullParameter(widgetisedProductConfigInteractor, "widgetisedProductConfigInteractor");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.o = allocationInteractor;
        this.f95048p = destinationProvider;
        this.f95049q = currencyInteractor;
        this.f95050r = allocationCategoryPopupMenuProvider;
        this.f95051s = popupMenuDialogDisplayer;
        this.f95052t = cryptoDisclaimerParamsInteractor;
        this.u = analyticsProduct;
        WidgetisedAnalyticsType widgetisedAnalyticsType = inputData.f95044a;
        b bVar = inputData.f95045b;
        List listA = widgetisedProductConfigInteractor.a(widgetisedAnalyticsType);
        Links links = inputData.f95046c;
        vyg.a aVar = vyg.a.ASSET;
        Data data = new Data(null, null, true, 3, null);
        xi0.b.Companion.getClass();
        this.v = d.b(this, new dyg.h(widgetisedAnalyticsType, bVar, null, aVar, data, xi0.b.f306271c, null, listA, links), stateMapper, null, false, 12);
        this.f95053w = e.a(this, new p(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, new j0(new k(rd0.e.b(this.f95051s.f256113c), 14), 26), null, null, new dyg.l(this, continuation, 3), 3);
        l.a1(this, this.f95052t.a(((dyg.h) ((j2) this.v.f22677a).getValue()).f121109a), null, null, new dyg.l(this, continuation, 1), 3);
    }

    public final void I2() {
        a2 a2Var = this.f95054x;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        y yVar = this.v;
        this.f95054x = l.b1(this, this.o.a(((dyg.h) ((j2) yVar.f22677a).getValue()).f121109a, ((dyg.h) ((j2) yVar.f22677a).getValue()).d), null, new dyg.l(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95053w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, this.f95049q.J(), null, new dyg.l(this, continuation, 0), 3);
        l.b1(this, this.v.B(new f(26)), null, new v0(this, continuation, 24), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
