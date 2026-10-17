package yre;

import android.app.Activity;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import c1g.h;
import cli.n;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.crypto.challenge.impl.service.ChallengeRewardsService;
import com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData;
import com.revolut.feature.three_ds_verification.impl.ui.ThreeDsVerificationFlowContract$InputData;
import com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionScreenContract$InputData;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$InputData;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceOptionSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.network.reviews.TravelExperiencesReviewsService;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlowContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import h30.l;
import java.util.Collection;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kxa.j;
import m11.k;
import m3g.c0;
import n1g.a0;
import n1g.r;
import n1g.u;
import n1g.v;
import n1g.w;
import n1g.x;
import n1g.y;
import nyb.m0;
import o2j.q;
import qc0.i1;
import qc0.y0;
import rp0.m;
import v1g.i;
import vc.s;
import yc0.o;
import z0g.b0;
import z0g.e0;
import z0g.g0;
import z0g.i0;
import z0g.o0;
import z0g.t;
import z0g.z;
import zc0.y2;
import zhm.f0;
import zhm.r0;
import zxb.k0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f316283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f316284c;
    public final Object d;

    public /* synthetic */ a(Object obj2, Object obj3, int i, int i2) {
        this.f316282a = i2;
        this.f316283b = obj2;
        this.d = obj3;
        this.f316284c = i;
    }

    private final Object a() {
        z01.a aVar = (z01.a) this.f316283b;
        z01.b bVar = (z01.b) this.d;
        int i = this.f316284c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            e11.d tierClauseMapper = new e11.d();
            Intrinsics.checkNotNullParameter(tierClauseMapper, "tierClauseMapper");
            return new k();
        }
        e11.d dVar = new e11.d();
        z01.a aVar2 = bVar.f318166a;
        xe0.e eVarA = aVar2.a();
        h11.b.Companion.getClass();
        ne0.d dVar2 = new ne0.d();
        ChallengeRewardsService challengeRewardsService = (ChallengeRewardsService) v0.a.f((c21.b) aVar2.d, "retrofit", ChallengeRewardsService.class, "create(...)");
        s.k(challengeRewardsService);
        return new com.revolut.crypto.challenge.impl.ui.screen.progress.a(dVar, new i4b.f(new g11.b(eVarA, dVar2, challengeRewardsService, new e11.b())), new k11.b(aVar.a()), aVar.e.h(), (n) bVar.f318167b.get());
    }

    private final Object b() {
        z0g.c cVar = (z0g.c) this.d;
        z0g.b bVar = (z0g.b) this.f316283b;
        zxb.e eVar = bVar.f318315q;
        k0 k0Var = bVar.i;
        djf.c cVar2 = bVar.f318314p;
        int i = this.f316284c;
        switch (i) {
            case 0:
                return j.l((j60.a) cVar.e.get());
            case 1:
                return l.p((com.revolut.kompot.navigable.a) cVar.f318329c.get(), (m) cVar.d.get());
            case 2:
                return new m();
            case 3:
                z0g.b bVar2 = cVar.f318328b;
                m0 m0VarG = bVar2.i.g();
                s.j(m0VarG);
                whf.b bVarA = bVar2.f318314p.a();
                s.j(bVarA);
                a0 extension = new a0(m0VarG, bVarA);
                o1g.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                return extension;
            case 4:
                p pVar = (p) cVar.i.get();
                TravelExperiencesBookingDetailsScreenContract$InputData travelExperiencesBookingDetailsScreenContract$InputData = cVar.f318327a;
                j60.a aVar = (j60.a) cVar.e.get();
                h hVar = (h) bVar.R.get();
                hyf.a aVarA = bVar.f318307h.a();
                s.j(aVarA);
                v vVar = (v) cVar.f318332j.get();
                com.revolut.feature.rev_points.api.navigation.a aVarA2 = eVar.a();
                s.j(aVarA2);
                a0 a0Var = (a0) cVar.k.get();
                m0 m0VarG2 = k0Var.g();
                s.j(m0VarG2);
                return new r(pVar, travelExperiencesBookingDetailsScreenContract$InputData, aVar, hVar, aVarA, vVar, aVarA2, a0Var, m0VarG2, bVar.b());
            case 5:
                whf.n nVarB = cVar2.b();
                s.j(nVarB);
                return new u(nVarB, (x) cVar.f318331h.get());
            case 6:
                whf.n nVarB2 = cVar2.b();
                s.j(nVarB2);
                fub.k kVarD = eVar.d();
                s.j(kVarD);
                return new y(nVarB2, kVarD);
            case 7:
                return new w();
            case 8:
                m0 m0VarG3 = k0Var.g();
                s.j(m0VarG3);
                whf.b bVarA2 = cVar2.a();
                s.j(bVarA2);
                return new a0(m0VarG3, bVarA2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        z0g.e eVar = (z0g.e) this.d;
        int i = this.f316284c;
        if (i != 0) {
            if (i == 1) {
                return new v1g.j();
            }
            throw new AssertionError(i);
        }
        n nVar = (n) eVar.f318346b.get();
        TravelExperiencesCategoriesFiltersScreenContract$InputData travelExperiencesCategoriesFiltersScreenContract$InputData = eVar.f318345a;
        hyf.b bVarC = ((z0g.b) this.f316283b).f318307h.c();
        s.j(bVarC);
        return new i(nVar, travelExperiencesCategoriesFiltersScreenContract$InputData, bVarC);
    }

    private final Object d() {
        z0g.f fVar = (z0g.f) this.d;
        TravelExperiencesCheckoutFlowContract$InputData inputData = fVar.f318358a;
        z0g.b bVar = (z0g.b) this.f316283b;
        q8b.a aVar = bVar.f318299a;
        int i = this.f316284c;
        if (i == 0) {
            return new com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a(bVar.f318312m.b(), bVar.f318318t.e(), (c1g.g) bVar.f318310k0.get(), (h1g.h) fVar.d.get(), inputData);
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            fk3.a aVarA = bVar.v.a();
            s.j(aVarA);
            n8b.a aVarA2 = aVar.a();
            s.j(aVarA2);
            n8b.b bVarB = aVar.b();
            s.j(bVarB);
            return new c1g.d(aVarA, aVarA2, bVarB);
        }
        i1g.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        h1g.h hVar = new h1g.h();
        TravelExperienceDatesSelection travelExperienceDatesSelection = inputData.f92939b;
        TravelExperiencesBookingContactDetails.INSTANCE.getClass();
        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = TravelExperiencesBookingContactDetails.e;
        io3.d.Companion.getClass();
        io3.d dVar = io3.d.f163144x;
        xi0.b.Companion.getClass();
        xi0.b bVar2 = xi0.b.f306271c;
        TravelExperienceVisitorsSelection travelExperienceVisitorsSelection = new TravelExperienceVisitorsSelection(r0.g());
        f0 f0Var = f0.f322471a;
        hVar.f148571a = new h1g.d(travelExperienceDatesSelection, null, travelExperiencesBookingContactDetails, dVar, bVar2, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.All.f93159a, travelExperienceVisitorsSelection, TravelExperienceAvailabilitySelection.NoSelection.f92905a, TravelExperienceOptionSelection.NoSelection.f92912a, f0Var, null, f0Var, new TravelExperienceFiltersSelection(31, null), travelExperienceDatesSelection);
        return hVar;
    }

    private final Object e() {
        z0g.h hVar = (z0g.h) this.d;
        z0g.b bVar = hVar.f318374b;
        int i = this.f316284c;
        if (i == 0) {
            Object extension = (mub.b) hVar.f318375c.get();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            return lu7.m0.z(((z0g.b) this.f316283b).i.h());
        }
        if (i == 2) {
            return new d2g.y((n) hVar.e.get(), hVar.f318373a, new c1g.l((i0g.b) bVar.f318305e0.get(), bVar.f318312m.b()), (mub.b) hVar.f318375c.get());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        f2g.a attractionsDiscoveryMapper = new f2g.a();
        gte.a featureToggleInteractor = bVar.A.b();
        s.j(featureToggleInteractor);
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        f2g.c categorySectionMapper = new f2g.c();
        Intrinsics.checkNotNullParameter(attractionsDiscoveryMapper, "attractionsDiscoveryMapper");
        Intrinsics.checkNotNullParameter(categorySectionMapper, "categorySectionMapper");
        return new d2g.a0();
    }

    private final Object f() {
        z0g.i iVar = (z0g.i) this.d;
        int i = this.f316284c;
        if (i != 0) {
            if (i == 1) {
                return new g2g.r((g2g.c) iVar.f318380b.get());
            }
            if (i == 2) {
                return new g2g.d();
            }
            throw new AssertionError(i);
        }
        TravelExperiencesFilterScreenContract$InputData travelExperiencesFilterScreenContract$InputData = iVar.f318379a;
        p pVar = (p) iVar.f318381c.get();
        hyf.b bVarC = ((z0g.b) this.f316283b).f318307h.c();
        s.j(bVarC);
        return new g2g.b(travelExperiencesFilterScreenContract$InputData, pVar, bVarC);
    }

    private final Object g() {
        z0g.l lVar = (z0g.l) this.d;
        z0g.b bVar = (z0g.b) this.f316283b;
        int i = this.f316284c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            l80.e eVarH = bVar.f318306g.h();
            s.j(eVarH);
            return new v2g.k(eVarH);
        }
        n nVar = (n) lVar.f318401b.get();
        TravelExperiencesPastAndCancelledScreenContract$InputData travelExperiencesPastAndCancelledScreenContract$InputData = lVar.f318400a;
        ayf.n nVarA = bVar.f318313n.a();
        s.j(nVarA);
        return new v2g.h(nVar, travelExperiencesPastAndCancelledScreenContract$InputData, nVarA, (exf.a) bVar.f318308h0.get());
    }

    private final Object h() {
        z0g.p pVar = (z0g.p) this.d;
        z0g.b bVar = (z0g.b) this.f316283b;
        o0 o0Var = bVar.f318307h;
        int i = this.f316284c;
        if (i != 0) {
            if (i == 1) {
                m3g.a aVar = (m3g.a) pVar.f318437b.get();
                lxf.k kVar = (lxf.k) bVar.f318311l.d.get();
                s.j(kVar);
                return new c0(aVar, kVar);
            }
            if (i == 2) {
                return new m3g.b();
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
            n3g.b.Companion.getClass();
            ihm.f fVar = new ihm.f();
            Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
            return fVar;
        }
        p pVar2 = (p) pVar.f318438c.get();
        TravelExperiencesSearchResultsScreenContract$InputData travelExperiencesSearchResultsScreenContract$InputData = pVar.f318436a;
        wsg.n nVarB = bVar.f318312m.b();
        m0g.a aVar2 = (m0g.a) bVar.U.get();
        hyf.b bVarC = o0Var.c();
        s.j(bVarC);
        hyf.d dVar = (hyf.d) bVar.I.get();
        yk0.d dVar2 = new yk0.d();
        hyf.a aVarA = o0Var.a();
        s.j(aVarA);
        nyb.j jVarB = bVar.i.b();
        s.j(jVarB);
        return new com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b(pVar2, travelExperiencesSearchResultsScreenContract$InputData, nVarB, aVar2, bVarC, dVar, dVar2, aVarA, jVarB, bVar.b(), (ihm.f) pVar.d.get());
    }

    private final Object i() {
        t tVar = (t) this.d;
        int i = this.f316284c;
        if (i == 0) {
            return new q3g.g((p) tVar.f318455b.get(), tVar.f318454a, (h1g.h) ((z0g.f) this.f316283b).d.get());
        }
        if (i == 1) {
            return new q3g.h();
        }
        throw new AssertionError(i);
    }

    private final Object j() {
        z0g.v vVar = (z0g.v) this.d;
        int i = this.f316284c;
        if (i != 0) {
            if (i == 1) {
                return new l1g.h();
            }
            throw new AssertionError(i);
        }
        p pVar = (p) vVar.f318462c.get();
        TravelExperiencesAdditionalInformationScreenContract$InputData travelExperiencesAdditionalInformationScreenContract$InputData = vVar.f318461b;
        hyf.b bVarC = ((z0g.b) this.f316283b).f318307h.c();
        s.j(bVarC);
        return new l1g.f(pVar, travelExperiencesAdditionalInformationScreenContract$InputData, bVarC);
    }

    private final Object k() {
        z0g.v vVar = (z0g.v) this.d;
        int i = this.f316284c;
        if (i != 0) {
            if (i == 1) {
                return new l1g.h();
            }
            throw new AssertionError(i);
        }
        p pVar = (p) vVar.f318462c.get();
        TravelExperiencesAdditionalInformationScreenContract$InputData travelExperiencesAdditionalInformationScreenContract$InputData = vVar.f318461b;
        hyf.b bVarC = ((z0g.b) this.f316283b).f318307h.c();
        s.j(bVarC);
        return new l1g.f(pVar, travelExperiencesAdditionalInformationScreenContract$InputData, bVarC);
    }

    private final Object l() {
        z0g.b bVar = (z0g.b) this.f316283b;
        z0g.x xVar = (z0g.x) this.d;
        int i = this.f316284c;
        if (i == 0) {
            dyb.a extension = (dyb.a) xVar.d.get();
            q1g.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            s.k(extension);
            return extension;
        }
        if (i == 1) {
            o7.b provider = bVar.i.d();
            q1g.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(provider, "provider");
            dyb.a aVarE = provider.e();
            s.k(aVarE);
            return aVarE;
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        l80.e eVarH = xVar.f318468c.f318306g.h();
        s.j(eVarH);
        i3g.k kVar = new i3g.k(new r1g.c(eVarH));
        TravelExperiencesBookingsScreenContract$InputData travelExperiencesBookingsScreenContract$InputData = xVar.f318467b;
        l80.e eVarH2 = bVar.f318306g.h();
        s.j(eVarH2);
        h hVar = (h) bVar.R.get();
        dyb.a aVar = (dyb.a) xVar.d.get();
        a29.b bVarA = bVar.f318316r.a();
        s.j(bVarA);
        return new p1g.m(kVar, travelExperiencesBookingsScreenContract$InputData, eVarH2, hVar, aVar, bVarA);
    }

    private final Object m() {
        z0g.b bVar = (z0g.b) this.f316283b;
        z0g.x xVar = (z0g.x) this.d;
        int i = this.f316284c;
        if (i == 0) {
            dyb.a extension = (dyb.a) xVar.d.get();
            q1g.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            s.k(extension);
            return extension;
        }
        if (i == 1) {
            o7.b provider = bVar.i.d();
            q1g.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(provider, "provider");
            dyb.a aVarE = provider.e();
            s.k(aVarE);
            return aVarE;
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        l80.e eVarH = xVar.f318468c.f318306g.h();
        s.j(eVarH);
        i3g.k kVar = new i3g.k(new r1g.c(eVarH));
        TravelExperiencesBookingsScreenContract$InputData travelExperiencesBookingsScreenContract$InputData = xVar.f318467b;
        l80.e eVarH2 = bVar.f318306g.h();
        s.j(eVarH2);
        h hVar = (h) bVar.R.get();
        dyb.a aVar = (dyb.a) xVar.d.get();
        a29.b bVarA = bVar.f318316r.a();
        s.j(bVarA);
        return new p1g.m(kVar, travelExperiencesBookingsScreenContract$InputData, eVarH2, hVar, aVar, bVarA);
    }

    private final Object n() {
        z0g.b bVar = (z0g.b) this.f316283b;
        z zVar = (z) this.d;
        int i = this.f316284c;
        switch (i) {
            case 0:
                Object extension = (j60.a) zVar.f.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                s.k(dVar);
                return dVar;
            case 1:
                j60.a bottomExpandableDialogControllerExtension = (j60.a) zVar.e.get();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return new g1g.a(bottomExpandableDialogControllerExtension);
            case 2:
                return l.p((com.revolut.kompot.navigable.a) zVar.f318474c.get(), (m) zVar.d.get());
            case 3:
                return new m();
            case 4:
                return j.l((j60.a) zVar.e.get());
            case 5:
                p pVar = (p) zVar.i.get();
                TravelExperiencesCancellationScreenContract$InputData travelExperiencesCancellationScreenContract$InputData = zVar.f318473b;
                j60.a aVar = (j60.a) zVar.f.get();
                u1g.b bVar2 = new u1g.b(new u1g.a());
                u1g.c cVar = (u1g.c) zVar.f318477j.get();
                h hVar = (h) bVar.R.get();
                hyf.a aVarA = bVar.f318307h.a();
                s.j(aVarA);
                return new com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e(pVar, travelExperiencesCancellationScreenContract$InputData, aVar, bVar2, cVar, hVar, aVarA, ((zc6.a) bVar.k).b());
            case 6:
                return new s1g.l((b1g.c) bVar.Y.get());
            case 7:
                return new u1g.e(new u1g.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        z0g.b bVar = (z0g.b) this.f316283b;
        z zVar = (z) this.d;
        int i = this.f316284c;
        switch (i) {
            case 0:
                Object extension = (j60.a) zVar.f.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                s.k(dVar);
                return dVar;
            case 1:
                j60.a bottomExpandableDialogControllerExtension = (j60.a) zVar.e.get();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return new g1g.a(bottomExpandableDialogControllerExtension);
            case 2:
                return l.p((com.revolut.kompot.navigable.a) zVar.f318474c.get(), (m) zVar.d.get());
            case 3:
                return new m();
            case 4:
                return j.l((j60.a) zVar.e.get());
            case 5:
                p pVar = (p) zVar.i.get();
                TravelExperiencesCancellationScreenContract$InputData travelExperiencesCancellationScreenContract$InputData = zVar.f318473b;
                j60.a aVar = (j60.a) zVar.f.get();
                u1g.b bVar2 = new u1g.b(new u1g.a());
                u1g.c cVar = (u1g.c) zVar.f318477j.get();
                h hVar = (h) bVar.R.get();
                hyf.a aVarA = bVar.f318307h.a();
                s.j(aVarA);
                return new com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e(pVar, travelExperiencesCancellationScreenContract$InputData, aVar, bVar2, cVar, hVar, aVarA, ((zc6.a) bVar.k).b());
            case 6:
                return new s1g.l((b1g.c) bVar.Y.get());
            case 7:
                return new u1g.e(new u1g.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        z0g.b bVar = (z0g.b) this.f316283b;
        o0 o0Var = bVar.f318307h;
        b0 b0Var = (b0) this.d;
        int i = this.f316284c;
        if (i == 0) {
            p pVar = (p) b0Var.f318325g.get();
            TravelExperiencesDetailsScreenContract$InputData travelExperiencesDetailsScreenContract$InputData = b0Var.f318323b;
            hyf.b bVarC = o0Var.c();
            s.j(bVarC);
            hyf.a aVarA = o0Var.a();
            s.j(aVarA);
            return new a2g.r(pVar, travelExperiencesDetailsScreenContract$InputData, bVarC, aVarA, bVar.b(), new o0g.d((TravelExperiencesReviewsService) bVar.f0.get(), (t0g.g) bVar.g0.get(), (ne0.j) bVar.G.get()));
        }
        if (i == 1) {
            return new a2g.t((c2g.a) b0Var.f318324c.get(), (c2g.c) b0Var.d.get(), (c2g.g) b0Var.e.get(), new c2g.f((c90.c) b0Var.f.get()));
        }
        if (i == 2) {
            return new c2g.b();
        }
        if (i == 3) {
            hyf.a featureInteractor = o0Var.a();
            s.j(featureInteractor);
            Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
            return new c2g.d();
        }
        if (i == 4) {
            return new c2g.h();
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        BaseScreen screen = b0Var.f318322a;
        b2g.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new c90.c(screen.m2());
    }

    private final Object q() {
        z0g.b bVar = (z0g.b) this.f316283b;
        o0 o0Var = bVar.f318307h;
        z0g.c0 c0Var = (z0g.c0) this.d;
        int i = this.f316284c;
        if (i == 0) {
            p pVar = (p) c0Var.f318338h.get();
            TravelExperiencesDetailsScreenContract$InputData travelExperiencesDetailsScreenContract$InputData = c0Var.f318335b;
            hyf.b bVarC = o0Var.c();
            s.j(bVarC);
            hyf.a aVarA = o0Var.a();
            s.j(aVarA);
            r10.f fVarB = bVar.b();
            z0g.b bVar2 = c0Var.f318336c;
            return new a2g.r(pVar, travelExperiencesDetailsScreenContract$InputData, bVarC, aVarA, fVarB, new o0g.d((TravelExperiencesReviewsService) bVar2.f0.get(), (t0g.g) bVar2.g0.get(), (ne0.j) bVar2.G.get()));
        }
        if (i == 1) {
            return new a2g.t((c2g.a) c0Var.d.get(), (c2g.c) c0Var.e.get(), (c2g.g) c0Var.f.get(), new c2g.f((c90.c) c0Var.f318337g.get()));
        }
        if (i == 2) {
            return new c2g.b();
        }
        if (i == 3) {
            hyf.a featureInteractor = o0Var.a();
            s.j(featureInteractor);
            Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
            return new c2g.d();
        }
        if (i == 4) {
            return new c2g.h();
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        BaseScreen screen = c0Var.f318334a;
        b2g.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new c90.c(screen.m2());
    }

    private final Object r() {
        e0 e0Var = (e0) this.d;
        z0g.b bVar = (z0g.b) this.f316283b;
        int i = this.f316284c;
        switch (i) {
            case 0:
                fd6.a aVar = (fd6.a) e0Var.e.get();
                va.g.t(aVar);
                return aVar;
            case 1:
                return va.g.s(((zc6.a) bVar.k).d(), (xc6.a) e0Var.d.get());
            case 2:
                return r6.b.k((zc6.a) bVar.k, "factory");
            case 3:
                Object extension = (kxf.a) e0Var.f318351g.get();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                s.k(nVar);
                return nVar;
            case 4:
                z58.c cVar = bVar.f318311l.e;
                he2.b factory = new he2.b(cVar);
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object obj2 = cVar.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                kxf.a aVar2 = (kxf.a) obj2;
                s.k(aVar2);
                return aVar2;
            case 5:
                l2g.d extension2 = (l2g.d) e0Var.i.get();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 6:
                return new l2g.d((c1g.x) bVar.W.get(), bVar.f318312m.b());
            case 7:
                Object extension3 = (l2g.a) e0Var.k.get();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar2 = (yji.n) extension3;
                s.k(nVar2);
                return nVar2;
            case 8:
                ayf.n nVarA = bVar.f318313n.a();
                s.j(nVarA);
                return new l2g.c(nVarA, (j0g.j) bVar.Q.get());
            case 9:
                dyb.a extension4 = (dyb.a) e0Var.f318355m.get();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                s.k(extension4);
                return extension4;
            case 10:
                o7.b provider = bVar.i.d();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                dyb.a aVarE = provider.e();
                s.k(aVarE);
                return aVarE;
            case 11:
                return va.g.u((xc6.a) e0Var.d.get());
            case 12:
                z0g.b bVar2 = e0Var.f318350c;
                lxf.i iVar = (lxf.i) bVar2.f318311l.f326333c.get();
                s.j(iVar);
                j2g.z zVar = new j2g.z(iVar, new dyf.d(), new dyf.k(new dyf.c()), new m2g.d(), new m2g.a(), ((zc6.a) bVar2.k).c(), new m2g.b());
                TravelExperiencesHomeScreenContract$InputData travelExperiencesHomeScreenContract$InputData = e0Var.f318349b;
                wli.x xVarD = ((s41.a) bVar.o).d();
                l2g.a aVar3 = (l2g.a) e0Var.k.get();
                hyf.b bVarC = bVar.f318307h.c();
                s.j(bVarC);
                c1g.k kVar = (c1g.k) bVar.Z.get();
                exf.c cVar2 = (exf.c) bVar.f318313n.f326328r.get();
                s.j(cVar2);
                r10.f fVarB = bVar.b();
                dyb.a aVar4 = (dyb.a) e0Var.f318355m.get();
                z0g.b bVar3 = e0Var.f318350c;
                return new j2g.y(zVar, travelExperiencesHomeScreenContract$InputData, xVarD, aVar3, bVarC, kVar, cVar2, fVarB, aVar4, new c1g.l((i0g.b) bVar3.f318305e0.get(), bVar3.f318312m.b()), ((zc6.a) bVar.k).b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object s() {
        e0 e0Var = (e0) this.d;
        z0g.b bVar = (z0g.b) this.f316283b;
        int i = this.f316284c;
        switch (i) {
            case 0:
                fd6.a aVar = (fd6.a) e0Var.e.get();
                va.g.t(aVar);
                return aVar;
            case 1:
                return va.g.s(((zc6.a) bVar.k).d(), (xc6.a) e0Var.d.get());
            case 2:
                return r6.b.k((zc6.a) bVar.k, "factory");
            case 3:
                Object extension = (kxf.a) e0Var.f318351g.get();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                s.k(nVar);
                return nVar;
            case 4:
                z58.c cVar = bVar.f318311l.e;
                he2.b factory = new he2.b(cVar);
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object obj2 = cVar.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                kxf.a aVar2 = (kxf.a) obj2;
                s.k(aVar2);
                return aVar2;
            case 5:
                l2g.d extension2 = (l2g.d) e0Var.i.get();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 6:
                return new l2g.d((c1g.x) bVar.W.get(), bVar.f318312m.b());
            case 7:
                Object extension3 = (l2g.a) e0Var.k.get();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar2 = (yji.n) extension3;
                s.k(nVar2);
                return nVar2;
            case 8:
                ayf.n nVarA = bVar.f318313n.a();
                s.j(nVarA);
                return new l2g.c(nVarA, (j0g.j) bVar.Q.get());
            case 9:
                dyb.a extension4 = (dyb.a) e0Var.f318355m.get();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                s.k(extension4);
                return extension4;
            case 10:
                o7.b provider = bVar.i.d();
                k2g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                dyb.a aVarE = provider.e();
                s.k(aVarE);
                return aVarE;
            case 11:
                return va.g.u((xc6.a) e0Var.d.get());
            case 12:
                z0g.b bVar2 = e0Var.f318350c;
                lxf.i iVar = (lxf.i) bVar2.f318311l.f326333c.get();
                s.j(iVar);
                j2g.z zVar = new j2g.z(iVar, new dyf.d(), new dyf.k(new dyf.c()), new m2g.d(), new m2g.a(), ((zc6.a) bVar2.k).c(), new m2g.b());
                TravelExperiencesHomeScreenContract$InputData travelExperiencesHomeScreenContract$InputData = e0Var.f318349b;
                wli.x xVarD = ((s41.a) bVar.o).d();
                l2g.a aVar3 = (l2g.a) e0Var.k.get();
                hyf.b bVarC = bVar.f318307h.c();
                s.j(bVarC);
                c1g.k kVar = (c1g.k) bVar.Z.get();
                exf.c cVar2 = (exf.c) bVar.f318313n.f326328r.get();
                s.j(cVar2);
                r10.f fVarB = bVar.b();
                dyb.a aVar4 = (dyb.a) e0Var.f318355m.get();
                z0g.b bVar3 = e0Var.f318350c;
                return new j2g.y(zVar, travelExperiencesHomeScreenContract$InputData, xVarD, aVar3, bVarC, kVar, cVar2, fVarB, aVar4, new c1g.l((i0g.b) bVar3.f318305e0.get(), bVar3.f318312m.b()), ((zc6.a) bVar.k).b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object t() {
        g0 g0Var = (g0) this.d;
        int i = this.f316284c;
        if (i != 0) {
            if (i == 1) {
                return new o2g.g();
            }
            throw new AssertionError(i);
        }
        n nVar = (n) g0Var.f318372c.get();
        TravelExperiencesItineraryScreenContract$InputData travelExperiencesItineraryScreenContract$InputData = g0Var.f318371b;
        hyf.b bVarC = ((z0g.b) this.f316283b).f318307h.c();
        s.j(bVarC);
        return new o2g.e(nVar, travelExperiencesItineraryScreenContract$InputData, bVarC);
    }

    private final Object u() {
        g0 g0Var = (g0) this.d;
        int i = this.f316284c;
        if (i != 0) {
            if (i == 1) {
                return new o2g.g();
            }
            throw new AssertionError(i);
        }
        n nVar = (n) g0Var.f318372c.get();
        TravelExperiencesItineraryScreenContract$InputData travelExperiencesItineraryScreenContract$InputData = g0Var.f318371b;
        hyf.b bVarC = ((z0g.b) this.f316283b).f318307h.c();
        s.j(bVarC);
        return new o2g.e(nVar, travelExperiencesItineraryScreenContract$InputData, bVarC);
    }

    private final Object v() {
        z0g.b bVar = (z0g.b) this.f316283b;
        i0 i0Var = (i0) this.d;
        int i = this.f316284c;
        if (i == 0) {
            return new i3g.j(new i3g.k(new i3g.a(new c2g.f((c90.c) i0Var.d.get()))), i0Var.f318383b, (o0g.d) bVar.i0.get(), (i3g.c) i0Var.e.get());
        }
        if (i != 1) {
            if (i == 2) {
                return new i3g.c(new yk0.d(), (o0g.d) bVar.i0.get());
            }
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a screen = (com.revolut.kompot.navigable.a) i0Var.f318384c.get();
        j3g.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new c90.c(screen.m2());
    }

    @Override // phm.a
    public final Object get() {
        Object bVar;
        Object cVar;
        Object dVar;
        Object dVar2;
        switch (this.f316282a) {
            case 0:
                b bVar2 = (b) this.d;
                e eVar = (e) this.f316283b;
                int i = this.f316284c;
                if (i == 0) {
                    n nVar = (n) bVar2.f316286b.get();
                    AddMoneyMethodSelectionScreenContract$InputData addMoneyMethodSelectionScreenContract$InputData = bVar2.f316285a;
                    lh3.a aVar = (lh3.a) eVar.o.d.get();
                    s.j(aVar);
                    return new bse.e(nVar, addMoneyMethodSelectionScreenContract$InputData, aVar);
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                q qVarF = eVar.f316307t.f();
                xte.a aVar2 = (xte.a) eVar.f316299j.B.get();
                s.j(aVar2);
                return new bse.l(qVarF, aVar2);
            case 1:
                e eVar2 = (e) this.f316283b;
                int i2 = this.f316284c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    ThreeDsVerificationFlowContract$InputData threeDsVerificationFlowContract$InputData = ((f) this.d).f316308a;
                    gte.a aVarB = eVar2.f.b();
                    s.j(aVarB);
                    return new com.revolut.feature.three_ds_verification.impl.ui.a(threeDsVerificationFlowContract$InputData, aVarB);
                }
                wj0.a idempotencyKeyHolder = ((nj0.d) eVar2.d).i();
                s.j(idempotencyKeyHolder);
                l80.e dateProvider = eVar2.e.h();
                s.j(dateProvider);
                dse.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "MOVE_MONEY_IDEMPOTENCY_TAG");
            case 2:
                g gVar = (g) this.d;
                e eVar3 = (e) this.f316283b;
                u7i.l lVar = eVar3.f316297g;
                ove.t tVar = eVar3.f316305r;
                da3.j jVar = eVar3.f316298h;
                int i3 = this.f316284c;
                switch (i3) {
                    case 0:
                        return j.k((j60.a) gVar.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) gVar.f316312b.get(), (m) gVar.f316313c.get());
                    case 2:
                        return new m();
                    case 3:
                        Object extension = (v5i.b) gVar.f.get();
                        jse.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar2 = (yji.n) extension;
                        s.k(nVar2);
                        return nVar2;
                    case 4:
                        e6i.b extensionProvider = (e6i.b) lVar.f277835n0.get();
                        s.j(extensionProvider);
                        jse.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensionProvider, "extensionProvider");
                        return extensionProvider.a();
                    case 5:
                        n nVar3 = (n) gVar.f316315h.get();
                        ThreeDsVerificationScreenContract$InputData threeDsVerificationScreenContract$InputData = gVar.f316311a;
                        h61.c cVar2 = (h61.c) eVar3.k.f302823c.get();
                        s.j(cVar2);
                        l93.f fVarJ = jVar.j();
                        s.j(fVarJ);
                        mt8.d dVarB = eVar3.f316300l.b();
                        s.j(dVarB);
                        hj8.a aVarA = eVar3.f316301m.a();
                        s.j(aVarA);
                        b90.a aVarA2 = eVar3.f316295b.a();
                        s.j(aVarA2);
                        g48.r0 r0VarC = eVar3.f316302n.c();
                        ise.f0 f0Var = new ise.f0();
                        j60.a aVar3 = (j60.a) gVar.d.get();
                        lh3.a aVar4 = (lh3.a) eVar3.o.d.get();
                        s.j(aVar4);
                        o8l.c cVarB = eVar3.f316303p.b();
                        w5i.d dVarD = eVar3.f316304q.d();
                        s.j(dVarD);
                        z5i.c cVar3 = (z5i.c) lVar.l0.get();
                        s.j(cVar3);
                        v8i.a aVar5 = new v8i.a();
                        v5i.b bVar3 = (v5i.b) gVar.f.get();
                        zte.b bVar4 = (zte.b) tVar.f230127h0.get();
                        s.j(bVar4);
                        aue.d dVar3 = new aue.d();
                        xye.d dVar4 = new xye.d();
                        o7.b bVar5 = new o7.b((vte.b) tVar.l0.get());
                        sf0.h serverErrorParser = tVar.v.b();
                        s.j(serverErrorParser);
                        zte.b cardPaymentsTopUpDialogs = (zte.b) tVar.f230127h0.get();
                        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                        Intrinsics.checkNotNullParameter(cardPaymentsTopUpDialogs, "cardPaymentsTopUpDialogs");
                        r10.d dVar5 = new r10.d();
                        dVar5.f250818a = serverErrorParser;
                        dVar5.f250819b = cardPaymentsTopUpDialogs;
                        al4.b bVarN = eVar3.f316306s.n();
                        s.j(bVarN);
                        return new com.revolut.feature.three_ds_verification.impl.ui.sceen.d(nVar3, threeDsVerificationScreenContract$InputData, cVar2, fVarJ, dVarB, aVarA, aVarA2, r0VarC, f0Var, aVar3, aVar4, cVarB, dVarD, cVar3, aVar5, bVar3, bVar4, dVar3, dVar4, bVar5, dVar5, bVarN);
                    case 6:
                        ia3.r rVarB = jVar.b();
                        thf.c cVarC = eVar3.i.c();
                        s.j(cVarC);
                        m93.d dVarF = jVar.f();
                        s.j(dVarF);
                        xte.a aVar6 = (xte.a) eVar3.f316299j.B.get();
                        s.j(aVar6);
                        l4i.a aVar7 = new l4i.a();
                        gte.a aVarB2 = eVar3.f.b();
                        s.j(aVarB2);
                        return new com.revolut.feature.three_ds_verification.impl.ui.sceen.g(rVarB, cVarC, dVarF, aVar6, aVar7, aVarB2);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                ytf.b bVar6 = (ytf.b) this.d;
                ytf.e eVar4 = (ytf.e) this.f316283b;
                int i5 = this.f316284c;
                switch (i5) {
                    case 0:
                        wj0.a idempotencyKeyHolder2 = ((nj0.d) eVar4.f316767a).i();
                        s.j(idempotencyKeyHolder2);
                        l80.e dateProvider2 = eVar4.f316768b.h();
                        s.j(dateProvider2);
                        huf.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                        bVar = new m60.b(idempotencyKeyHolder2, dateProvider2, "payments_group_settle_up");
                        break;
                    case 1:
                        wj0.a idempotencyKeyHolder3 = ((nj0.d) eVar4.f316767a).i();
                        s.j(idempotencyKeyHolder3);
                        l80.e dateProvider3 = eVar4.f316768b.h();
                        s.j(dateProvider3);
                        huf.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder3, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider3, "dateProvider");
                        bVar = new m60.b(idempotencyKeyHolder3, dateProvider3, "payments_money_request");
                        break;
                    case 2:
                        wj0.a idempotencyKeyHolder4 = ((nj0.d) eVar4.f316767a).i();
                        s.j(idempotencyKeyHolder4);
                        l80.e dateProvider4 = eVar4.f316768b.h();
                        s.j(dateProvider4);
                        huf.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder4, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider4, "dateProvider");
                        bVar = new m60.b(idempotencyKeyHolder4, dateProvider4, "payments_apm_money_request");
                        break;
                    case 3:
                        pak.h priceQuoteTraceIdControllerExtensionFactory = eVar4.f316769c.a();
                        huf.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(priceQuoteTraceIdControllerExtensionFactory, "priceQuoteTraceIdControllerExtensionFactory");
                        return priceQuoteTraceIdControllerExtensionFactory.a("payments_money_request_price_quote");
                    case 4:
                        kuf.d extension2 = (kuf.d) bVar6.f316728h.get();
                        huf.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        s.k(extension2);
                        return extension2;
                    case 5:
                        vv9.a aVarA3 = ((s6k.b) eVar4.d).a();
                        s.j(aVarA3);
                        bqf.d dVarA = eVar4.e.a();
                        wsg.n nVarB = eVar4.f.b();
                        eli.j jVarA = eVar4.f316770g.a();
                        rr9.d dVarB2 = eVar4.f316771h.b();
                        s.j(dVarB2);
                        return new kuf.d(aVarA3, dVarA, nVarB, jVarA, dVarB2);
                    case 6:
                        Object extension3 = (kuf.e) bVar6.f316729j.get();
                        huf.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar4 = (yji.n) extension3;
                        s.k(nVar4);
                        return nVar4;
                    case 7:
                        wv9.c cVarD = ((s6k.b) eVar4.d).d();
                        s.j(cVarD);
                        cpf.c cVarF = eVar4.i.f();
                        s.j(cVarF);
                        return new kuf.f(cVarD, cVarF);
                    case 8:
                        r10.f factory = eVar4.f316772j.a();
                        huf.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.d();
                    case 9:
                        ManualTransferInputData manualTransferInputData = bVar6.f316724a;
                        guf.b bVar7 = (guf.b) bVar6.f316731m.get();
                        b3a.a aVarA4 = eVar4.f316778r.a();
                        s.j(aVarA4);
                        gte.a aVarB3 = eVar4.f316776p.b();
                        s.j(aVarB3);
                        bVar = new com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c(manualTransferInputData, bVar7, aVarA4, aVarB3);
                        break;
                    case 10:
                        ManualTransferInputData manualTransferInputData2 = bVar6.f316724a;
                        z7l.a aVar8 = eVar4.k;
                        lpf.a aVar9 = eVar4.e;
                        o7.b bVarA = aVar8.a();
                        ang.f fVarE = eVar4.f316773l.e();
                        bqf.d dVarA2 = aVar9.a();
                        bqf.g gVarF = aVar9.f();
                        fk3.a aVarA5 = eVar4.f316774m.a();
                        s.j(aVarA5);
                        lx1.d dVarB3 = ((ey1.e) eVar4.f316775n).b();
                        s.j(dVarB3);
                        cl3.a aVarD = eVar4.o.d();
                        s.j(aVarD);
                        opf.z zVarD = aVar9.d();
                        t1j.b bVarE = aVar9.e();
                        gte.a aVarB4 = eVar4.f316776p.b();
                        s.j(aVarB4);
                        d3j.b bVarE2 = ((b3j.p) eVar4.f316777q).e();
                        rga.c cVarB2 = eVar4.f316769c.b();
                        s.j(cVarB2);
                        return new guf.m(manualTransferInputData2, bVarA, fVarE, dVarA2, gVarF, aVarA5, dVarB3, aVarD, zVarD, bVarE, aVarB4, bVarE2, cVarB2);
                    case 11:
                        luf.c.Companion.getClass();
                        return new luf.a();
                    default:
                        throw new AssertionError(i5);
                }
                return bVar;
            case 4:
                yyk.c cVar4 = (yyk.c) this.f316283b;
                yyk.a aVar10 = (yyk.a) this.d;
                int i6 = this.f316284c;
                switch (i6) {
                    case 0:
                        ypi.h hVar = aVar10.f317949b;
                        fsi.g gVar2 = aVar10.f317948a;
                        return new ypi.e(hVar, bq.i.b(gVar2), bq.i.o(gVar2), bq.i.g(gVar2));
                    case 1:
                        return new hqi.f(aVar10.f317950c, bq.i.b(aVar10.f317948a));
                    case 2:
                        return kpi.f.a();
                    case 3:
                        Context contextI = bq.i.i(aVar10.f317948a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar10.f317948a);
                        t70.g gVarO = cVar4.f317980b.o();
                        s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 4:
                        return new tpi.i((rpi.c) aVar10.f317953j.get(), gsi.c.a(aVar10.f317948a));
                    case 5:
                        return new rpi.b(bq.i.b(aVar10.f317948a));
                    case 6:
                        return new rpi.h(bq.i.b(aVar10.f317948a));
                    case 7:
                        cVar = new iri.g((iri.j) cVar4.f317990l.get(), (iri.m) cVar4.f317998s.get(), bq.i.f(aVar10.f317948a), bq.i.l(aVar10.f317948a));
                        break;
                    case 8:
                        cVar = new iri.l((iri.m) cVar4.f317998s.get(), bq.i.f(aVar10.f317948a), (iri.d) aVar10.f317956n.get());
                        break;
                    case 9:
                        return new iri.d(bq.i.f(aVar10.f317948a));
                    case 10:
                        return new opi.b(bq.i.f(aVar10.f317948a));
                    case 11:
                        return new qi3.l(bq.i.l(aVar10.f317948a), (f9b.f) aVar10.f317958q.get(), (qi3.r) cVar4.p0.get(), (com.revolut.feature.chooser.c) cVar4.q0.get(), aVar10.d, (ypi.i) aVar10.f.get(), (hqi.l) aVar10.f317951g.get(), (opi.d) aVar10.f317957p.get(), (tpi.j) aVar10.k.get(), bq.i.o(aVar10.f317948a));
                    case 12:
                        return bq.i.t(aVar10.f317948a);
                    default:
                        throw new AssertionError(i6);
                }
                return cVar;
            case 5:
                yyk.c cVar5 = (yyk.c) this.f316283b;
                yyk.b bVar8 = (yyk.b) this.d;
                int i21 = this.f316284c;
                switch (i21) {
                    case 0:
                        bVar8.getClass();
                        dVar = new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar5.f317991m.get(), cVar5.d());
                        break;
                    case 1:
                        um.c cVar6 = (um.c) cVar5.f317992n.get();
                        bVar8.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                        yyk.c cVar7 = bVar8.e;
                        hn.h hVar2 = (hn.h) cVar7.o.get();
                        t70.g gVarO2 = cVar7.f317980b.o();
                        s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar2, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(cVar7.h());
                        builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) cVar7.Z.get(), (qc0.h) cVar7.W.get()));
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar8.f317964g)));
                        dVar = new in.e(cVar6, builderBuilderWithExpectedSize.build(), cVar5.d());
                        break;
                    case 2:
                        return bq.i.t(bVar8.f317960a);
                    case 3:
                        bVar8.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(bVar8.i.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar8.k)));
                        dVar = new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar5.P.get(), cVar5.d());
                        break;
                    case 4:
                        return new zm.a();
                    case 5:
                        return new tpi.i((rpi.c) bVar8.f317966j.get(), gsi.c.a(bVar8.f317960a));
                    case 6:
                        return new rpi.b(bq.i.b(bVar8.f317960a));
                    case 7:
                        bVar8.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(bVar8.e.h());
                        dVar = new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar5.o.get(), (npi.f) bVar8.f317968m.get());
                        break;
                    case 8:
                        Context contextI2 = bq.i.i(bVar8.f317960a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(bVar8.f317960a);
                        t70.g gVarO3 = cVar5.f317980b.o();
                        s.j(gVarO3);
                        dVar = new npi.c(contextI2, baseDelegatesActivityF2, gVarO3);
                        break;
                    case 9:
                        yyk.c cVar8 = bVar8.e;
                        return new en.c(ImmutableSet.of((ln.d) cVar8.f317983d0.get(), (ln.d) cVar8.f317995p.get()), bq.i.l(bVar8.f317960a));
                    case 10:
                        dVar = new gn.c((lpi.e) bVar8.f317970p.get(), (sm.e) cVar5.f317984e0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar5.d());
                        break;
                    case 11:
                        return new lpi.b(bq.i.i(bVar8.f317960a), bq.i.j(bVar8.f317960a));
                    case 12:
                        bVar8.getClass();
                        dVar = new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar5.f0.get(), cVar5.d());
                        break;
                    case 13:
                        bVar8.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                        yyk.c cVar9 = bVar8.e;
                        builderBuilderWithExpectedSize4.add(new wc0.a((qc0.k) cVar9.f317996q.get(), ((s41.a) cVar9.f317985g).d(), (ln.a) cVar9.f317995p.get(), (qc0.j) cVar9.Z.get(), (xl2.f) cVar9.N.get(), cVar9.a()));
                        dVar = new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) cVar5.g0.get(), (k3l.b) bVar8.f317973s.get(), cVar5.d());
                        break;
                    case 14:
                        return new k3l.d(bq.i.b(bVar8.f317960a));
                    case 15:
                        ypi.h hVar3 = bVar8.f317962b;
                        xoi.d dVar6 = bVar8.f317960a;
                        return new ypi.e(hVar3, bq.i.b(dVar6), bq.i.o(dVar6), bq.i.g(dVar6));
                    case 16:
                        return new hqi.f(bVar8.f317963c, bq.i.b(bVar8.f317960a));
                    case 17:
                        return new rpi.h(bq.i.b(bVar8.f317960a));
                    case 18:
                        dVar = new iri.g((iri.j) cVar5.f317990l.get(), (iri.m) cVar5.f317996q.get(), bq.i.f(bVar8.f317960a), bq.i.l(bVar8.f317960a));
                        break;
                    case 19:
                        dVar = new iri.l((iri.m) cVar5.f317996q.get(), bq.i.f(bVar8.f317960a), (iri.d) bVar8.f317977y.get());
                        break;
                    case 20:
                        return new iri.d(bq.i.f(bVar8.f317960a));
                    case 21:
                        dVar = new an.q((cqi.h) bVar8.A.get(), (an.a) cVar5.f317987h0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), cVar5.d());
                        break;
                    case 22:
                        return new cqi.j(bq.i.f(bVar8.f317960a));
                    case 23:
                        bVar8.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(bVar8.f317960a));
                    case 24:
                        dVar = new com.revolut.retail.toast.mediator.a((d4l.a) cVar5.i0.get(), (c4l.b) bVar8.D.get());
                        break;
                    case 25:
                        return new c4l.e(bq.i.i(bVar8.f317960a), bq.i.g(bVar8.f317960a));
                    case 26:
                        dVar = new f5l.c((f5l.a) cVar5.j0.get(), bq.i.b(bVar8.f317960a));
                        break;
                    case 27:
                        return new opi.b(bq.i.f(bVar8.f317960a));
                    case 28:
                        return new iqi.b(bVar8.d, bq.i.b(bVar8.f317960a));
                    case 29:
                        Activity activityB = bq.i.b(bVar8.f317960a);
                        y80.b bVar9 = new y80.b();
                        g60.a aVar11 = (g60.a) bVar8.I.get();
                        xoi.d dVar7 = bVar8.f317960a;
                        Activity activityB2 = bq.i.b(dVar7);
                        t80.g gVar3 = (t80.g) bVar8.J.get();
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(dVar7);
                        d4m.a aVarA6 = e4m.b.a(bVar8.K);
                        nli.a aVarG = bVar8.g();
                        t80.g gVar4 = (t80.g) bVar8.J.get();
                        l70.e eVar5 = bVar8.e.f317980b;
                        zk0.b bVarL = eVar5.l();
                        s.j(bVarL);
                        oli.c cVar10 = new oli.c(gVar4, bVarL, bVar8.g(), (g60.a) bVar8.I.get(), bVar8.h());
                        ComponentActivity componentActivityA = gmf.b.a(dVar7);
                        ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(dVar7));
                        ami.n nVar5 = new ami.n(e4m.b.a(bVar8.L), 1);
                        d4m.a aVarA7 = e4m.b.a(bVar8.K);
                        t80.g gVar5 = (t80.g) bVar8.J.get();
                        nli.a aVarG2 = bVar8.g();
                        i90.b bVar10 = new i90.b();
                        z70.a aVarF = eVar5.f();
                        s.j(aVarF);
                        c70.b bVar11 = new c70.b(aVarF, 2);
                        z70.a aVarF2 = eVar5.f();
                        s.j(aVarF2);
                        return new upi.b(activityB, bVar9, new t80.v(aVar11, activityB2, gVar3, baseDelegatesActivityF3, aVarA6, aVarG, cVar10, new oli.g(componentActivityA, activityResultRegistryA, nVar5, aVarA7, gVar5, aVarG2, bVar10, new u96.b(bVar11, new smd.s(aVarF2)), bVar8.h()), bVar8.h()));
                    case 30:
                        return new g60.a(bq.i.b(bVar8.f317960a));
                    case 31:
                        l70.e eVar6 = cVar5.f317980b;
                        l70.e eVar7 = cVar5.f317980b;
                        f80.a aVarX = eVar6.x();
                        s.j(aVarX);
                        l80.e eVarH = eVar7.h();
                        s.j(eVarH);
                        zk0.b bVarL2 = eVar7.l();
                        s.j(bVarL2);
                        dVar = new t80.b(aVarX, eVarH, bVarL2);
                        break;
                    case 32:
                        return pli.c.a(new ks0.n(bq.i.f(bVar8.f317960a)));
                    case 33:
                        return t96.a.a();
                    case 34:
                        return new aqi.d(bq.i.b(bVar8.f317960a), new y80.b());
                    case 35:
                        qc0.j jVar2 = (qc0.j) cVar5.Z.get();
                        qc0.k kVar = (qc0.k) cVar5.f317996q.get();
                        qc0.h hVar4 = (qc0.h) cVar5.W.get();
                        ypi.i iVar = (ypi.i) bVar8.u.get();
                        f9b.f fVar = (f9b.f) bVar8.f317964g.get();
                        tpi.j jVar3 = (tpi.j) bVar8.k.get();
                        hqi.l lVar2 = (hqi.l) bVar8.v.get();
                        BackendFlowContract$Configuration backendFlowContract$Configuration = (BackendFlowContract$Configuration) bVar8.O.get();
                        rpi.c cVar11 = (rpi.c) bVar8.f317966j.get();
                        npi.a aVar12 = (npi.a) bVar8.f317968m.get();
                        pri.f fVarD = bq.i.d(bVar8.f317960a);
                        k3l.b bVar12 = (k3l.b) bVar8.f317973s.get();
                        xpi.g gVar6 = (xpi.g) bVar8.C.get();
                        qc0.h hVar5 = (qc0.h) bVar8.e.W.get();
                        wpg.v.b(hVar5);
                        ImmutableSet immutableSetOf = ImmutableSet.of(hVar5);
                        mm.d dVar8 = (mm.d) cVar5.X.get();
                        opi.d dVar9 = (opi.d) bVar8.G.get();
                        qd0.b bVarN2 = cVar5.f317980b.n();
                        s.j(bVarN2);
                        return new y0(jVar2, kVar, hVar4, iVar, fVar, jVar3, lVar2, backendFlowContract$Configuration, cVar11, aVar12, fVarD, bVar12, gVar6, immutableSetOf, dVar8, dVar9, bVarN2);
                    case 36:
                        azk.a.Companion.getClass();
                        return new BackendFlowContract$Configuration(30, null, "TRADING_ONBOARDING_EXTENDED_HOURS_FLOW");
                    case 37:
                        zc0.g gVar7 = (zc0.g) bVar8.Q.get();
                        e4m.e eVar8 = cVar5.Z;
                        y90.e eVar9 = cVar5.i;
                        qc0.j jVar4 = (qc0.j) eVar8.get();
                        ypi.i iVar2 = (ypi.i) bVar8.u.get();
                        yyk.c cVar12 = bVar8.e;
                        l70.e eVar10 = cVar12.f317980b;
                        w80.b bVarJ = eVar10.j();
                        s.j(bVarJ);
                        t70.g gVarO4 = eVar10.o();
                        s.j(gVarO4);
                        zc0.c cVar13 = new zc0.c(bVarJ, gVarO4, (p80.a) bVar8.R.get(), (aa0.y) cVar12.A.get(), bVar8.f(), new yc0.j(new yc0.q(bVar8.e()), bVar8.e(), (yc0.g) cVar12.l0.get(), (ad0.a) cVar12.O.get(), (ad0.p) bVar8.W.get(), new yc0.p()), new o((yc0.g) cVar12.l0.get()), (ad0.p) bVar8.W.get(), (ad0.c) bVar8.T.get(), new ad0.t(bVar8.e(), new yc0.p()), new ad0.s(bVar8.e(), new yc0.p()), new ad0.g(bVar8.e()), new ad0.v(new yc0.q(bVar8.e())), new ad0.o(), new yc0.q(bVar8.e()), new yc0.p(), (yc0.y) cVar12.m0.get(), (bd0.a) cVar12.f317993n0.get(), (yc0.v) cVar12.f317994o0.get(), (yc0.c0) bVar8.X.get());
                        npi.a aVar13 = (npi.a) bVar8.f317968m.get();
                        xpi.g gVar8 = (xpi.g) bVar8.C.get();
                        k3l.b bVar13 = (k3l.b) bVar8.f317973s.get();
                        rpi.c cVar14 = (rpi.c) bVar8.f317966j.get();
                        zd7.b bVar14 = (zd7.b) bVar8.Z.get();
                        tpi.j jVar5 = (tpi.j) bVar8.k.get();
                        opi.d dVar10 = (opi.d) bVar8.G.get();
                        cqi.h hVar6 = (cqi.h) bVar8.A.get();
                        i1 i1VarB = eVar9.b();
                        s.j(i1VarB);
                        oc0.f fVarC = eVar9.c();
                        s.j(fVarC);
                        fc0.f fVarD2 = eVar9.d();
                        s.j(fVarD2);
                        oc0.m mVarE = eVar9.e();
                        s.j(mVarE);
                        t9l.g gVarA = cVar5.f317986h.a();
                        s.j(gVarA);
                        oc0.k kVarA = eVar9.a();
                        s.j(kVarA);
                        return new y2(hVar6, eVar9.f(), fVarD2, bVar13, aVar13, fVarC, kVarA, mVarE, dVar10, jVar4, i1VarB, cVar14, gVarA, jVar5, gVar8, iVar2, cVar13, gVar7, bVar14);
                    case 38:
                        Context context = bq.i.i(bVar8.f317960a);
                        azk.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        dVar = new p80.a(context);
                        break;
                    case 39:
                        x90.c cVar15 = cVar5.d;
                        yc0.q qVar = new yc0.q(bVar8.e());
                        yc0.r rVar = (yc0.r) bVar8.S.get();
                        ad0.c cVar16 = (ad0.c) bVar8.T.get();
                        ad0.w wVarG = cVar5.i.g();
                        s.j(wVarG);
                        yc0.f0 f0Var2 = (yc0.f0) bVar8.U.get();
                        ad0.h hVar7 = (ad0.h) bVar8.V.get();
                        ad0.n nVarF = bVar8.f();
                        u9l.a aVarB5 = cVar5.f317986h.b();
                        s.j(aVarB5);
                        return wpg.v.o(cVar15, qVar, rVar, cVar16, wVarG, f0Var2, hVar7, nVarF, aVarB5);
                    case 40:
                        return wpg.v.n(cVar5.d, bVar8.e(), new yc0.p());
                    case 41:
                        x90.c cVar17 = cVar5.d;
                        return new ad0.d();
                    case 42:
                        x90.c cVar18 = cVar5.d;
                        hbl.d dVarC = cVar5.f317986h.c();
                        s.j(dVarC);
                        return wpg.v.y(cVar18, dVarC);
                    case 43:
                        return wpg.v.a(cVar5.d, bVar8.f());
                    case 44:
                        return wpg.v.w(cVar5.d, (yc0.r) bVar8.S.get(), new yc0.p());
                    case 45:
                        dVar = new ae7.i((upi.f) bVar8.M.get(), (t80.c) cVar5.f317989k0.get(), (d4l.a) cVar5.i0.get(), (aqi.a) bVar8.Y.get(), new ae7.j(), bq.i.l(bVar8.f317960a));
                        break;
                    case 46:
                        return aqi.f.a(bVar8.f317960a, (aqi.d) bVar8.N.get());
                    default:
                        throw new AssertionError(i21);
                }
                return dVar;
            case 6:
                yzk.b bVar15 = (yzk.b) this.f316283b;
                yzk.a aVar14 = (yzk.a) this.d;
                int i22 = this.f316284c;
                switch (i22) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI3 = bq.i.i(aVar14.f318116a);
                        BaseDelegatesActivity baseDelegatesActivityF4 = bq.i.f(aVar14.f318116a);
                        t70.g gVarO5 = bVar15.f318134b.o();
                        s.j(gVarO5);
                        return new npi.c(contextI3, baseDelegatesActivityF4, gVarO5);
                    case 2:
                        return new tpi.i((rpi.c) aVar14.f318119g.get(), gsi.c.a(aVar14.f318116a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar14.f318116a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar14.f318116a));
                    case 5:
                        return new iri.g((iri.j) bVar15.f318138j.get(), (iri.m) bVar15.k.get(), bq.i.f(aVar14.f318116a), bq.i.l(aVar14.f318116a));
                    case 6:
                        return new iri.l((iri.m) bVar15.k.get(), bq.i.f(aVar14.f318116a), (iri.d) aVar14.k.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar14.f318116a));
                    case 8:
                        return new opi.b(bq.i.f(aVar14.f318116a));
                    case 9:
                        aVar14.getClass();
                        return new iqi.b(iqi.g.f167870b, bq.i.b(aVar14.f318116a));
                    case 10:
                        aVar14.getClass();
                        return new xpi.c(xpi.f.f307976c, bq.i.b(aVar14.f318116a));
                    case 11:
                        return new en.c(ImmutableSet.of((ln.d) aVar14.f318118c.f318139l.get()), bq.i.l(aVar14.f318116a));
                    case 12:
                        aVar14.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar15.f318140m.get(), bVar15.d());
                    case 13:
                        um.c cVar19 = (um.c) bVar15.f318141n.get();
                        aVar14.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(6);
                        yzk.b bVar16 = aVar14.f318118c;
                        hn.h hVar8 = (hn.h) bVar16.o.get();
                        t70.g gVarO6 = bVar16.f318134b.o();
                        s.j(gVarO6);
                        builderBuilderWithExpectedSize5.add(new jn.a(hVar8, gVarO6));
                        builderBuilderWithExpectedSize5.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize5.add(bVar16.k());
                        builderBuilderWithExpectedSize5.add(bVar16.f318143q.get());
                        builderBuilderWithExpectedSize5.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize5.add(new jn.d(e4m.b.a(aVar14.f318127r)));
                        return new in.e(cVar19, builderBuilderWithExpectedSize5.build(), bVar15.d());
                    case 14:
                        return bq.i.t(aVar14.f318116a);
                    case 15:
                        aVar14.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize6 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize6.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize6.add(aVar14.f318129t.get());
                        builderBuilderWithExpectedSize6.add(new kn.h(e4m.b.a(aVar14.f318120h)));
                        return new kn.e(builderBuilderWithExpectedSize6.build(), (ym.d) bVar15.f318144r.get(), bVar15.d());
                    case 16:
                        return new zm.a();
                    case 17:
                        aVar14.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize7 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize7.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize7.add(aVar14.f318118c.k());
                        dVar2 = new hn.d(builderBuilderWithExpectedSize7.build(), (hn.h) bVar15.o.get(), (npi.f) aVar14.f.get());
                        break;
                    case 18:
                        return new gn.c((lpi.e) aVar14.f318130w.get(), (sm.e) bVar15.v.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar15.d());
                    case 19:
                        return new lpi.b(bq.i.i(aVar14.f318116a), bq.i.j(aVar14.f318116a));
                    case 20:
                        aVar14.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar15.f318147w.get(), bVar15.d());
                    case 21:
                        aVar14.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize8 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize8.addAll((Iterable) g3l.f.a());
                        dVar2 = new g3l.c(j6.a.g(aVar14.f318118c.f318143q, builderBuilderWithExpectedSize8), (g3l.g) bVar15.f318142p.get(), (k3l.b) aVar14.z.get(), bVar15.d());
                        break;
                    case 22:
                        return new k3l.d(bq.i.b(aVar14.f318116a));
                    case 23:
                        return new f0l.c((xzk.b) bVar15.f318149y.get(), bq.i.e(aVar14.f318116a), (xpi.g) aVar14.o.get());
                    default:
                        throw new AssertionError(i22);
                }
                return dVar2;
            case 7:
                return a();
            case 8:
                return b();
            case 9:
                return c();
            case 10:
                return d();
            case 11:
                return e();
            case 12:
                return f();
            case 13:
                return g();
            case 14:
                return h();
            case 15:
                return i();
            case 16:
                return j();
            case 17:
                return k();
            case 18:
                return l();
            case 19:
                return m();
            case 20:
                return n();
            case 21:
                return o();
            case 22:
                return p();
            case 23:
                return q();
            case 24:
                return r();
            case 25:
                return s();
            case 26:
                return t();
            case 27:
                return u();
            case 28:
                return v();
            default:
                z0g.b bVar17 = (z0g.b) this.f316283b;
                i0 i0Var = (i0) this.d;
                int i32 = this.f316284c;
                if (i32 == 0) {
                    return new i3g.j(new i3g.k(new i3g.a(new c2g.f((c90.c) i0Var.d.get()))), i0Var.f318383b, (o0g.d) bVar17.i0.get(), (i3g.c) i0Var.e.get());
                }
                if (i32 != 1) {
                    if (i32 == 2) {
                        return new i3g.c(new yk0.d(), (o0g.d) bVar17.i0.get());
                    }
                    throw new AssertionError(i32);
                }
                com.revolut.kompot.navigable.a screen = (com.revolut.kompot.navigable.a) i0Var.f318384c.get();
                j3g.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new c90.c(screen.m2());
        }
    }
}
