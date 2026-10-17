package com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProductOption;
import elf.g1;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r10.d;
import skm.a2;
import v4g.g;
import v4g.o;
import yji.l;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements o {
    public final TravelFlightsBaggageSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f93250p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j4g.a f93251q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f93252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f93253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93254t;

    public b(n stateMapper, TravelFlightsBaggageSelectionScreenContract$InputData inputData, d extraProductsInteractor, j4g.a flightUnavailableDialogExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extraProductsInteractor, "extraProductsInteractor");
        Intrinsics.checkNotNullParameter(flightUnavailableDialogExtension, "flightUnavailableDialogExtension");
        this.o = inputData;
        this.f93250p = extraProductsInteractor;
        this.f93251q = flightUnavailableDialogExtension;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = inputData.f93245a.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((TravelFlightsExtraProduct) obj2).f93503a == o7g.b.BAGGAGE) {
                arrayList2.add(obj2);
            }
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            ArrayList arrayList3 = ((TravelFlightsExtraProduct) it8.next()).e;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((TravelFlightsExtraProductOption) it9.next()).f93509a);
            }
            linkedHashSet.addAll(arrayList4);
        }
        this.f93253s = mra.d.b(this, new g(linkedHashSet.size() > 1 ? new a.C0564a(false) : a.b.f93249a, new Data(this.o.f93245a.f, null, false, 6, null), h0.f322473a), stateMapper, null, false, 12);
        this.f93254t = e.a(this, new v25.g(18));
    }

    public final void I2(Set set) {
        a2 a2Var = this.f93252r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        String offerId = this.o.f93245a.f93516a;
        List selectedExtraProductTokens = d0.d1(set);
        d dVar = this.f93250p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(selectedExtraProductTokens, "selectedExtraProductTokens");
        this.f93252r = l.a1(this, pyd.c.S(new g1(dVar, offerId, selectedExtraProductTokens, (Continuation) null)), null, null, new u29.c(this, set, continuation, 10), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93254t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93253s;
    }
}
