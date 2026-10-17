package com.revolut.feature.travel.experiences.impl.ui.screen.search_results;

import c1g.e0;
import c1g.u;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData;
import hyf.d;
import jki.g;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lph.c;
import m3g.a0;
import m3g.k;
import m3g.l;
import m3g.m;
import m3g.n;
import m3g.r;
import m3g.s;
import m3g.z;
import nyb.j;
import r10.f;
import rd0.e;
import skm.a2;
import w4l.h;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends g implements r {
    public a2 A;
    public final n B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesSearchResultsScreenContract$InputData f93151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.n f93152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0g.a f93153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hyf.b f93154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f93155t;
    public final yk0.d u;
    public final hyf.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f93156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f93157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.f f93158y;
    public a2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p stateMapper, TravelExperiencesSearchResultsScreenContract$InputData inputData, wsg.n walletInteractor, m0g.a travelExperiencesRepository, hyf.b travelExperiencesInteractor, d travelExperiencesSearchInteractor, yk0.d schedulerProvider, hyf.a experiencesFeatureInteractor, j revPointsEarningRatesInteractor, f dropOffInteractor, ihm.f paginationSubject) {
        m jVar;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(travelExperiencesRepository, "travelExperiencesRepository");
        Intrinsics.checkNotNullParameter(travelExperiencesInteractor, "travelExperiencesInteractor");
        Intrinsics.checkNotNullParameter(travelExperiencesSearchInteractor, "travelExperiencesSearchInteractor");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        Intrinsics.checkNotNullParameter(dropOffInteractor, "dropOffInteractor");
        Intrinsics.checkNotNullParameter(paginationSubject, "paginationSubject");
        this.f93151p = inputData;
        this.f93152q = walletInteractor;
        this.f93153r = travelExperiencesRepository;
        this.f93154s = travelExperiencesInteractor;
        this.f93155t = travelExperiencesSearchInteractor;
        this.u = schedulerProvider;
        this.v = experiencesFeatureInteractor;
        this.f93156w = revPointsEarningRatesInteractor;
        this.f93157x = dropOffInteractor;
        this.f93158y = paginationSubject;
        if (inputData instanceof TravelExperiencesSearchResultsScreenContract$InputData.PreciseLocation) {
            jVar = new l(((TravelExperiencesSearchResultsScreenContract$InputData.PreciseLocation) inputData).f93147a);
        } else if (inputData instanceof TravelExperiencesSearchResultsScreenContract$InputData.Destination) {
            TravelExperiencesSearchResultsScreenContract$InputData.Destination destination = (TravelExperiencesSearchResultsScreenContract$InputData.Destination) inputData;
            jVar = new k(destination.f93144a, destination.f93145b);
        } else {
            if (!(inputData instanceof TravelExperiencesSearchResultsScreenContract$InputData.Attraction)) {
                throw new NoWhenBranchMatchedException();
            }
            TravelExperiencesSearchResultsScreenContract$InputData.Attraction attraction = (TravelExperiencesSearchResultsScreenContract$InputData.Attraction) inputData;
            jVar = new m3g.j(attraction.f93141a, attraction.f93142b);
        }
        this.B = new n(jVar, inputData.getF93148b(), null, r0.g(), null, s.COLLAPSED, inputData.getF93149c(), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), false);
    }

    public static LocationId y2(m mVar) {
        if (mVar instanceof k) {
            return new LocationId.DestinationId(((k) mVar).f202539a);
        }
        if (mVar instanceof m3g.j) {
            return new LocationId.AttractionId(((m3g.j) mVar).f202537a);
        }
        return null;
    }

    public final void A2() {
        a2 a2Var = this.A;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.A = l2(new a0(this, continuation, 2), new yi5.b(26));
    }

    @Override // yji.l
    public final void I1() {
        b bVar;
        Continuation continuation = null;
        l2(new a0(this, continuation, 0), new yi5.b(26));
        l2(new a0(this, continuation, 1), new yi5.b(26));
        boolean zA = ((c1g.m) this.v).a();
        x2(new c(zA, 2));
        if (zA) {
            bVar = this;
            yji.l.a1(bVar, e.n(e.b(nim.a.w(j.a(this.f93156w), new m30.c(13))), h0.f322473a), null, null, new z(this, null, 1), 3);
        } else {
            bVar = this;
        }
        z2(y2(((n) t2()).f202542a), false);
        TravelExperiencesSearchResultsScreenContract$InputData travelExperiencesSearchResultsScreenContract$InputData = bVar.f93151p;
        TravelExperiencesSearchResultsScreenContract$InputData.Destination destination = travelExperiencesSearchResultsScreenContract$InputData instanceof TravelExperiencesSearchResultsScreenContract$InputData.Destination ? (TravelExperiencesSearchResultsScreenContract$InputData.Destination) travelExperiencesSearchResultsScreenContract$InputData : null;
        if (destination == null) {
            return;
        }
        String str = destination.f93145b;
        if (str == null || str.length() == 0) {
            String id10 = destination.f93144a;
            e0 e0Var = (e0) bVar.f93155t;
            e0Var.getClass();
            Intrinsics.checkNotNullParameter(id10, "destinationId");
            p0g.g gVar = e0Var.f20482b;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            h loadingStrategy = h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            yji.l.a1(bVar, e.b(gVar.e.e(id10, loadingStrategy)), null, null, new a(this, destination, null), 3);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        x2(new m30.c(16));
    }

    @Override // jki.g
    public final i r2() {
        return this.B;
    }

    public final void z2(LocationId locationId, boolean z) {
        if (z) {
            x2(new m30.c(12));
        }
        a2 a2Var = this.z;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.z = yji.l.a1(this, nim.a.v(((u) this.f93154s).a(locationId), new c09.a(8)), null, null, new z(this, null, 0), 3);
    }
}
