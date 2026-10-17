package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews;

import ang.f;
import cli.y;
import efm.r;
import fag.o0;
import fag.t0;
import hx7.e;
import i9g.b0;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import sdg.g;
import sdg.i;
import sdg.k;
import sdg.l;
import yi5.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements i {
    public final TravelHotelsPropertyGuestsReviewsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f93991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sdg.a f93992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f93993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f93994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f93995t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(l stateMapper, TravelHotelsPropertyGuestsReviewsScreenContract$InputData inputData, b0 travelHotelsPropertyInteractor, sdg.a guestsReviewsPagingInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(guestsReviewsPagingInteractor, "guestsReviewsPagingInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f93991p = travelHotelsPropertyInteractor;
        this.f93992q = guestsReviewsPagingInteractor;
        this.f93993r = userInteractor;
        this.f93994s = v0.a.d("create(...)");
        this.f93995t = d.b(this, new g(0), stateMapper, null, false, 12);
        this.u = e.a(this, new sa5.a(14));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.f93993r.k(false)), null, null, new k(this, null, 0), 3);
        bgi.a guestsReviewsPageParams = new bgi.a(this.o.f93989a, 0);
        b0 b0Var = this.f93991p;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(guestsReviewsPageParams, "guestsReviewsPageParams");
        t0 t0Var = b0Var.f159780a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(guestsReviewsPageParams, "guestsReviewsPageParams");
        yji.l.a1(this, rd0.e.b(nim.a.w(mo3.a.n(t0Var.G.f(guestsReviewsPageParams, false)), new o0(10))), null, null, new k(this, null, 1), 3);
        r rVarHide = this.f93992q.f261873b.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        yji.l.a1(this, rd0.e.b(rVarHide), null, null, new k(this, null, 2), 3);
        l2(new s64.a(this, null, 15), new b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93995t;
    }
}
