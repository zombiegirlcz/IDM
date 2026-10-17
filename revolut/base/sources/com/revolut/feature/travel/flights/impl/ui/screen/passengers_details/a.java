package com.revolut.feature.travel.flights.impl.ui.screen.passengers_details;

import a0e.w;
import ang.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.offer_details.TravelFlightsOfferDetails;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import j4g.c;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m6g.i;
import m6g.m;
import m6g.r;
import m7g.j;
import o6g.b;
import o6g.d;
import oki.h;
import p6g.b0;
import p6g.c0;
import p6g.d0;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements m {
    public boolean A;
    public boolean B;
    public Object C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final TravelFlightsPassengersDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f93365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f93366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final phm.a f93367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f93368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h4g.h f93369t;
    public final b u;
    public final c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j4g.a f93370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f93371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f93372y;
    public TravelFlightsOfferDetails z;

    public a(n stateMapper, TravelFlightsPassengersDetailsScreenContract$InputData inputData, d passengerFieldMapper, w fieldValidator, phm.a countryPickerControllerInteractor, f userInteractor, h4g.h offerDetailsInteractor, b outputMapper, c priceChangeDialogFactory, j4g.a flightUnavailableDialogExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(passengerFieldMapper, "passengerFieldMapper");
        Intrinsics.checkNotNullParameter(fieldValidator, "fieldValidator");
        Intrinsics.checkNotNullParameter(countryPickerControllerInteractor, "countryPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(offerDetailsInteractor, "offerDetailsInteractor");
        Intrinsics.checkNotNullParameter(outputMapper, "outputMapper");
        Intrinsics.checkNotNullParameter(priceChangeDialogFactory, "priceChangeDialogFactory");
        Intrinsics.checkNotNullParameter(flightUnavailableDialogExtension, "flightUnavailableDialogExtension");
        this.o = inputData;
        this.f93365p = passengerFieldMapper;
        this.f93366q = fieldValidator;
        this.f93367r = countryPickerControllerInteractor;
        this.f93368s = userInteractor;
        this.f93369t = offerDetailsInteractor;
        this.u = outputMapper;
        this.v = priceChangeDialogFactory;
        this.f93370w = flightUnavailableDialogExtension;
        this.f93371x = new vii.b();
        this.f93372y = new vii.b();
        f0 f0Var = f0.f322471a;
        this.C = f0Var;
        LocalDate localDate = inputData.f93357c;
        this.D = mra.d.b(this, new i(localDate == null ? inputData.f93356b : localDate, f0Var, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
        this.E = e.a(this, new lp2.c(this, 29));
    }

    public static ArrayList I2(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            j jVar = ((m6g.n) obj2).f203101b;
            if (jVar == j.CHILD || jVar == j.INFANT) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.q(yh5.b.d(q.Q(this.f93371x, new r(continuation, this, 0)), q.Q(this.f93372y, new r(continuation, this, 1)))), null, null, new lph.h(this, continuation, 27), 3);
    }

    public final p6g.w J2(String str) {
        Object next;
        List list = ((i) ((j2) this.D.f22677a).getValue()).f203094b;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((p6g.a0) it8.next()).f233268c, arrayList);
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (Intrinsics.f(((p6g.w) next).d(), str)) {
                break;
            }
        }
        return (p6g.w) next;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    public final Clause K2(p6g.w wVar) {
        d0 d0VarH = this.f93366q.h(wVar);
        if (d0VarH instanceof b0) {
            return ((b0) d0VarH).f233272a.a();
        }
        if (d0VarH instanceof c0) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void P1() {
        this.B = false;
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.B = true;
        if (this.A) {
            this.A = false;
            h.v2(this.E, TravelFlightsPassengersDetailsScreenContract$ModalStep.PriceChanged.f93364a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.D;
    }
}
