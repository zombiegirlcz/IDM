package com.revolut.feature.travel.flights.impl.ui.screen.search_results;

import a7g.e0;
import a7g.q;
import a7g.r;
import a7g.v;
import cli.n;
import cli.y;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import h4g.i;
import h4g.k;
import hx7.e;
import i4g.c;
import ihm.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lk0.g;
import mra.d;
import oki.h;
import skm.a2;
import vkm.j2;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements v {
    public final TravelFlightsSearchScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f93422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f93423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f93424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i4g.b f93425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j4g.a f93426t;
    public a2 u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f93427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93428x;

    public b(n stateMapper, TravelFlightsSearchScreenContract$InputData inputData, c pagingInteractor, k searchSessionInteractor, i searchParamsInteractor, i4g.b searchFiltersSharedState, j4g.a flightUnavailableDialogExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pagingInteractor, "pagingInteractor");
        Intrinsics.checkNotNullParameter(searchSessionInteractor, "searchSessionInteractor");
        Intrinsics.checkNotNullParameter(searchParamsInteractor, "searchParamsInteractor");
        Intrinsics.checkNotNullParameter(searchFiltersSharedState, "searchFiltersSharedState");
        Intrinsics.checkNotNullParameter(flightUnavailableDialogExtension, "flightUnavailableDialogExtension");
        this.o = inputData;
        this.f93422p = pagingInteractor;
        this.f93423q = searchSessionInteractor;
        this.f93424r = searchParamsInteractor;
        this.f93425s = searchFiltersSharedState;
        this.f93426t = flightUnavailableDialogExtension;
        this.v = v0.a.d("create(...)");
        this.f93427w = d.b(this, new r(inputData.f93406a, new g(f0.f322471a), null, q.FILTERS_EXPANDED, null, null, r7g.g.RECOMMENDED, null), stateMapper, null, false, 12);
        this.f93428x = e.a(this, new a09.b(this, 20));
    }

    @Override // yji.l
    public final void I1() {
        i4g.h hVar = (i4g.h) this.f93422p;
        efm.r rVarFilter = hVar.f.hide().filter(new i31.e(16, new i3k.h(11)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        Continuation continuation = null;
        l.a1(this, vkm.q.q(rd0.e.b(rVarFilter)), null, null, new e0(this, continuation, 0), 3);
        efm.r map = hVar.f158434g.hide().filter(new i31.e(17, new i3k.h(13))).map(new i31.e(18, new i3k.h(14)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.a1(this, rd0.e.b(map), null, null, new e0(this, continuation, 1), 3);
        i4g.b bVar = this.f93425s;
        l.a1(this, bVar.f158422a, null, null, new e0(this, continuation, 2), 3);
        l.a1(this, bVar.f158423b, null, null, new e0(this, continuation, 3), 3);
        J2(this.o.f93406a, ((r) ((j2) this.f93427w.f22677a).getValue()).f1895g);
    }

    public final void I2(FlightSearchRequestFilters flightSearchRequestFilters, r7g.g gVar) {
        a2 a2Var = this.u;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.u = l2(new a1a.b(this, flightSearchRequestFilters, gVar, continuation, 8), new yi5.b(26));
    }

    public final void J2(FlightSearchQuery flightSearchQuery, r7g.g gVar) {
        a2 a2Var = this.u;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.u = l2(new a1a.b(this, flightSearchQuery, gVar, continuation, 9), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93428x;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93427w;
    }
}
