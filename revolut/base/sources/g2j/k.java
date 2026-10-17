package g2j;

import com.feature.navigation.hub.impl.ui.hub.NavigationHubControllerContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreenContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreenContract$InputData;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentContract$InputData;
import com.revolut.feature.feedback.impl.ui.screen.one_click.OneClickFeedbackContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallControllerContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$InputData;
import com.revolut.feature.wealth.analytics.benchmark.ui.PerformanceBenchmarkSelectionContract$InputData;
import g9g.c0;
import g9g.d0;
import g9g.h1;
import g9g.l0;
import g9g.x;
import g9g.x0;
import i9g.b0;
import i9g.h0;
import i9g.y;
import kotlin.jvm.internal.Intrinsics;
import ma.u;
import opf.z;
import q56.v;
import r10.t;
import s56.i0;
import s56.u0;
import sgm.e3;
import vc.s;
import w56.r;
import yo5.w;
import zxb.k0;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f140115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f140116c;

    public /* synthetic */ k(Object obj2, qji.b bVar, int i) {
        this.f140114a = i;
        this.f140115b = obj2;
        this.f140116c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f140114a) {
            case 0:
                return new a2j.d(((f) this.f140115b).k.b(), new a2j.e(), ((l) this.f140116c).f140117a);
            case 1:
                g56.e eVar = (g56.e) this.f140116c;
                ik5.d cryptoAddressTypeUiMapper = ((ak5.i) eVar.f140649b.f140636c).c();
                s.j(cryptoAddressTypeUiMapper);
                Intrinsics.checkNotNullParameter(cryptoAddressTypeUiMapper, "cryptoAddressTypeUiMapper");
                v vVar = new v();
                DeFiSendAddBeneficiaryScreenContract$InputData deFiSendAddBeneficiaryScreenContract$InputData = eVar.f140648a;
                g56.d dVar = (g56.d) this.f140115b;
                go5.c cVar = dVar.d;
                po5.a aVarD = ((w) cVar).d();
                s.j(aVarD);
                pn5.a aVar = (pn5.a) ((on5.a) dVar.e).f226911a.get();
                s.j(aVar);
                ap5.b bVarE = ((w) cVar).e();
                s.j(bVarE);
                return new com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a(vVar, deFiSendAddBeneficiaryScreenContract$InputData, aVarD, aVar, bVarE, ((ak5.i) dVar.f140636c).a());
            case 2:
                g56.f fVar = (g56.f) this.f140116c;
                DeFiSendAmountScreenContract$InputData deFiSendAmountScreenContract$InputData = fVar.f140651a;
                g56.d dVar2 = fVar.f140652b;
                uj5.a aVarB = ((ak5.i) dVar2.f140636c).b();
                s.j(aVarB);
                io5.b bVarA = ((w) dVar2.d).a();
                s.j(bVarA);
                u0 u0Var = new u0(deFiSendAmountScreenContract$InputData, aVarB, new p56.a(bVarA));
                DeFiSendAmountScreenContract$InputData deFiSendAmountScreenContract$InputData2 = fVar.f140651a;
                g56.d dVar3 = (g56.d) this.f140115b;
                vv5.e eVar2 = dVar3.f;
                xv5.c cVarA = eVar2.a();
                s.j(cVarA);
                t tVar = new t(cVarA, (e56.b) dVar3.v.get());
                w80.a aVar2 = (w80.a) dVar3.f140639j.X.get();
                s.j(aVar2);
                xv5.c cVarA2 = eVar2.a();
                s.j(cVarA2);
                k18.c cVarA3 = dVar2.k.a();
                u66.b bVar = (u66.b) dVar2.f140640l.f295393j.get();
                s.j(bVar);
                xv5.c cVarA4 = dVar2.f.a();
                s.j(cVarA4);
                i26.k kVar = (i26.k) dVar2.f140641m.i.get();
                s.j(kVar);
                i0 i0Var = new i0(cVarA3, bVar, cVarA4, kVar);
                uj5.a aVarB2 = ((ak5.i) dVar2.f140636c).b();
                s.j(aVarB2);
                s56.m mVar = new s56.m(aVarB2);
                z zVarD = dVar3.f140642n.d();
                vo9.a aVarB3 = ((ut9.a) dVar3.o).b();
                s.j(aVarB3);
                w66.b bVar2 = dVar3.f140640l;
                k18.c cVarA5 = bVar2.f295390c.a();
                xv5.c cVarA6 = bVar2.d.a();
                s.j(cVarA6);
                g26.b bVarA2 = bVar2.e.a();
                s.j(bVarA2);
                x66.d dVar4 = new x66.d(cVarA5, cVarA6, bVarA2, (u66.b) bVar2.f295393j.get());
                g26.b bVarA3 = dVar2.f140641m.a();
                s.j(bVarA3);
                return new com.revolut.feature.defi.remittances.impl.ui.send.amount.b(u0Var, deFiSendAmountScreenContract$InputData2, tVar, aVar2, cVarA2, i0Var, mVar, zVarD, aVarB3, dVar4, new e3(bVarA3, dVar2.k.a()));
            case 3:
                g56.h hVar = (g56.h) this.f140116c;
                DeFiSendReviewScreenContract$InputData deFiSendReviewScreenContract$InputData = hVar.f140657a;
                g56.d dVar5 = hVar.f140658b;
                uj5.a aVarB4 = ((ak5.i) dVar5.f140636c).b();
                s.j(aVarB4);
                io5.b bVarA4 = ((w) dVar5.d).a();
                s.j(bVarA4);
                r rVar = new r(deFiSendReviewScreenContract$InputData, aVarB4, new p56.a(bVarA4));
                DeFiSendReviewScreenContract$InputData deFiSendReviewScreenContract$InputData2 = hVar.f140657a;
                g56.d dVar6 = (g56.d) this.f140115b;
                xv5.c cVarA7 = dVar6.f.a();
                s.j(cVarA7);
                t tVar2 = new t(cVarA7, (e56.b) dVar6.v.get());
                ap5.b bVarE2 = ((w) dVar6.d).e();
                s.j(bVarE2);
                e56.b bVar3 = (e56.b) dVar5.v.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) dVar5.f140643p).c();
                s.j(aVarC);
                h56.c cVar2 = new h56.c(bVar3, aVarC);
                wj0.a aVarI = ((nj0.d) dVar6.f140637g).i();
                s.j(aVarI);
                return new w56.p(rVar, deFiSendReviewScreenContract$InputData2, tVar2, bVarE2, cVar2, aVarI, new w56.l());
            case 4:
                return new m56.f(((g56.k) this.f140116c).f140664a, ((g56.d) this.f140115b).k.a(), new m56.h());
            case 5:
                g9g.k kVar2 = (g9g.k) this.f140116c;
                rbg.o cancellationDetailsStateMapper = new rbg.o();
                rbg.r refundBreakdownStateMapper = new rbg.r();
                Intrinsics.checkNotNullParameter(cancellationDetailsStateMapper, "cancellationDetailsStateMapper");
                Intrinsics.checkNotNullParameter(refundBreakdownStateMapper, "refundBreakdownStateMapper");
                rbg.m mVar2 = new rbg.m();
                TravelHotelsCancellationConfirmationContract$InputData travelHotelsCancellationConfirmationContract$InputData = kVar2.f141724a;
                g9g.d dVar7 = (g9g.d) this.f140115b;
                i9g.n nVar = (i9g.n) dVar7.p0.get();
                j61.b bVarC = dVar7.f141643x.c();
                s.j(bVarC);
                sf0.h hVarB = kVar2.f141725b.f141645y.b();
                s.j(hVarB);
                return new rbg.j(mVar2, travelHotelsCancellationConfirmationContract$InputData, nVar, bVarC, new rbg.q(hVarB));
            case 6:
                g9g.r rVar2 = (g9g.r) this.f140116c;
                meg.i filtersUIMapper = new meg.i(rVar2.f141801b.f141628m.g());
                Intrinsics.checkNotNullParameter(filtersUIMapper, "filtersUIMapper");
                return new qeg.j(new qeg.k(), rVar2.f141800a, ((g9g.d) this.f140115b).c(), new meg.h());
            case 7:
                TravelHotelsFlowContract$InputData travelHotelsFlowContract$InputData = ((g9g.t) this.f140116c).f141812a;
                eub.e eVar3 = (eub.e) ((g9g.d) this.f140115b).i.V.get();
                s.j(eVar3);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b(travelHotelsFlowContract$InputData, eVar3);
            case 8:
                TravelHotelsHomeFlowContract$InputData travelHotelsHomeFlowContract$InputData = ((g9g.v) this.f140116c).f141831a;
                uag.v vVar2 = new uag.v();
                g9g.d dVar8 = (g9g.d) this.f140115b;
                p8g.c cVar3 = (p8g.c) dVar8.g0.get();
                k0 k0Var = dVar8.i;
                nyb.k kVarC = k0Var.c();
                s.j(kVarC);
                zja.a aVarA = ((ika.b) dVar8.f141633q).a();
                s.j(aVarA);
                fag.i0 i0Var2 = (fag.i0) dVar8.B0.get();
                nyb.j jVarB = k0Var.b();
                s.j(jVarB);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c(travelHotelsHomeFlowContract$InputData, vVar2, cVar3, kVarC, aVarA, i0Var2, jVarB, dVar8.B.a(), dVar8.f141628m.g());
            case 9:
                return new hdg.d(new hdg.e(), ((g9g.w) this.f140116c).f141837a, (y) ((g9g.d) this.f140115b).A0.get());
            case 10:
                x xVar = (x) this.f140116c;
                ndg.a amenitiesMapper = new ndg.a();
                Intrinsics.checkNotNullParameter(amenitiesMapper, "amenitiesMapper");
                return new ldg.f(new ldg.g(), xVar.f141843a, (b0) ((g9g.d) this.f140115b).m0.get());
            case 11:
                return new vdg.f(new vdg.g(), ((c0) this.f140116c).f141610a, (b0) ((g9g.d) this.f140115b).m0.get());
            case 12:
                d0 d0Var = (d0) this.f140116c;
                return new ydg.g(new aeg.b((p8g.c) d0Var.f141647b.g0.get()), d0Var.f141646a, (i9g.h) ((g9g.d) this.f140115b).q0.get());
            case 13:
                return new yeg.g(new yeg.h(), ((l0) this.f140116c).f141733a, (h0) ((g9g.d) this.f140115b).f141631o0.get());
            case 14:
                qbg.l lVar = new qbg.l();
                TravelHotelsCancellationPolicyScreenContract$InputData travelHotelsCancellationPolicyScreenContract$InputData = ((x0) this.f140116c).f141846b;
                g9g.d dVar9 = (g9g.d) this.f140115b;
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a(lVar, travelHotelsCancellationPolicyScreenContract$InputData, (i9g.n) dVar9.p0.get(), (p8g.c) dVar9.g0.get(), new ubg.k());
            case 15:
                qbg.l lVar2 = new qbg.l();
                TravelHotelsCancellationPolicyScreenContract$InputData travelHotelsCancellationPolicyScreenContract$InputData2 = ((x0) this.f140116c).f141846b;
                g9g.d dVar10 = (g9g.d) this.f140115b;
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a(lVar2, travelHotelsCancellationPolicyScreenContract$InputData2, (i9g.n) dVar10.p0.get(), (p8g.c) dVar10.g0.get(), new ubg.k());
            case 16:
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a(((h1) this.f140116c).f141688b, new adg.m(), new fcg.d(), (h0) ((g9g.d) this.f140115b).f141631o0.get());
            case 17:
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a(((h1) this.f140116c).f141688b, new adg.m(), new fcg.d(), (h0) ((g9g.d) this.f140115b).f141631o0.get());
            case 18:
                ga.b bVar4 = (ga.b) this.f140116c;
                ga.a aVar3 = bVar4.f141963b;
                f01.c cVarG = aVar3.f141956b.g();
                thf.d dVarD = aVar3.f141957c.d();
                s.j(dVarD);
                ma.q qVar = new ma.q(cVarG, dVarD);
                ga.a aVar4 = (ga.a) this.f140115b;
                ja.b bVar5 = (ja.b) aVar4.f141961l.get();
                NavigationHubControllerContract$InputData navigationHubControllerContract$InputData = bVar4.f141962a;
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar4.f141958g).c();
                s.j(aVarC2);
                return new u(qVar, bVar5, navigationHubControllerContract$InputData, aVarC2);
            case 19:
                gnf.c cVar4 = (gnf.c) this.f140116c;
                gte.a aVarB5 = cVar4.f144981b.f144973b.b();
                s.j(aVarB5);
                lnf.n nVar2 = new lnf.n(aVarB5);
                PendingTransactionRecallControllerContract$InputData pendingTransactionRecallControllerContract$InputData = cVar4.f144980a;
                gnf.a aVar5 = (gnf.a) this.f140115b;
                mjf.u uVarA = aVar5.e.a();
                s.j(uVarA);
                com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) aVar5.d).c();
                s.j(aVarC3);
                return new lnf.l(nVar2, pendingTransactionRecallControllerContract$InputData, uVarA, aVarC3);
            case 20:
                return new jnf.f(((gnf.d) this.f140116c).f144983a, (sri.m) ((gnf.a) this.f140115b).f144976h.get());
            case 21:
                qp6.h hVar2 = new qp6.h();
                FeedbackCommentContract$InputData feedbackCommentContract$InputData = ((gp6.c) this.f140116c).f145266a;
                dp6.a aVarB6 = ((gp6.e) this.f140115b).f145270a.b();
                s.j(aVarB6);
                return new qp6.g(hVar2, feedbackCommentContract$InputData, aVarB6);
            case 22:
                tp6.h hVar3 = new tp6.h();
                OneClickFeedbackContract$InputData oneClickFeedbackContract$InputData = ((gp6.f) this.f140116c).f145273a;
                dp6.a aVarB7 = ((gp6.e) this.f140115b).f145270a.b();
                s.j(aVarB7);
                return new tp6.g(hVar3, oneClickFeedbackContract$InputData, aVarB7);
            case 23:
                gp8.h hVar4 = (gp8.h) this.f140116c;
                ChallengeEditRewardScreenContract$InputData challengeEditRewardScreenContract$InputData = hVar4.f145306a;
                xp8.n nVar3 = new xp8.n(challengeEditRewardScreenContract$InputData, new u80.o(), hVar4.b());
                gp8.n nVar4 = (gp8.n) this.f140115b;
                wsg.n nVarB = nVar4.f145325b.b();
                hp8.b bVarA5 = nVar4.f145324a.a();
                s.j(bVarA5);
                return new xp8.l(nVar3, challengeEditRewardScreenContract$InputData, nVarB, bVarA5, hVar4.b());
            case 24:
                np8.b bVar6 = ((gp8.i) this.f140116c).f145309a;
                gp8.n nVar5 = (gp8.n) this.f140115b;
                l80.e eVarH = nVar5.f145327g.h();
                s.j(eVarH);
                hp8.b bVarA6 = nVar5.f145324a.a();
                s.j(bVarA6);
                hj8.a aVarA2 = nVar5.f.a();
                s.j(aVarA2);
                gte.a aVarB8 = nVar5.i.b();
                s.j(aVarB8);
                return new com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b(bVar6, eVarH, bVarA6, aVarA2, aVarB8);
            case 25:
                gp8.j jVar = (gp8.j) this.f140116c;
                cq8.q qVar2 = new cq8.q();
                l80.e eVarH2 = jVar.f145313b.f145327g.h();
                s.j(eVarH2);
                cq8.p pVar = new cq8.p(qVar2, eVarH2);
                ChallengesOverviewDetailsScreenContract$InputData challengesOverviewDetailsScreenContract$InputData = jVar.f145312a;
                gp8.n nVar6 = (gp8.n) this.f140115b;
                ang.f fVarE = nVar6.f145328h.e();
                hp8.b bVarA7 = nVar6.f145324a.a();
                s.j(bVarA7);
                return new cq8.m(pVar, challengesOverviewDetailsScreenContract$InputData, fVarE, bVarA7, nVar6.e.a());
            case 26:
                gp8.m mVar3 = (gp8.m) this.f140116c;
                hq8.h hVar5 = mVar3.f145321a;
                qd0.b languageProvider = mVar3.f145322b.f145327g.n();
                s.j(languageProvider);
                iq8.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                hq8.n nVar7 = new hq8.n(hVar5, v80.b.b(languageProvider, false, false, 48), new u80.o());
                hj8.a aVarA3 = ((gp8.n) this.f140115b).f.a();
                s.j(aVarA3);
                return new hq8.m(nVar7, hVar5, aVarA3);
            case 27:
                isc.f fVar2 = ((gsc.d) this.f140116c).f146383a;
                gsc.c cVar5 = (gsc.c) this.f140115b;
                zrc.d dVarA = cVar5.a();
                isc.c cVar6 = new isc.c(new dsc.a(), new nd.k(new msc.a()), new msc.a());
                dsc.a aVar6 = new dsc.a();
                l61.a aVarB9 = cVar5.e.b();
                s.j(aVarB9);
                return new com.revolut.feature.sca_prompt.impl.flow.b(fVar2, dVarA, cVar6, aVar6, aVarB9);
            case 28:
                PerformanceBenchmarkSelectionContract$InputData performanceBenchmarkSelectionContract$InputData = ((gvg.a) this.f140116c).f147156a;
                kvg.k kVar3 = new kvg.k();
                gvg.b bVar7 = (gvg.b) this.f140115b;
                ivg.b bVar8 = (ivg.b) bVar7.f.get();
                ybl.b bVarB = bVar7.d.b();
                s.j(bVarB);
                return new kvg.i(performanceBenchmarkSelectionContract$InputData, kVar3, new zq.a(bVar8, bVarB));
            default:
                return new com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b(((h98.g) this.f140116c).f150191a, ((h98.i) this.f140115b).f150197a.a());
        }
    }
}
