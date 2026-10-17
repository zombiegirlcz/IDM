package zu8;

import android.content.Context;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.input_document_id.InputDocumentIdFlowContract$InputData;
import com.revolut.feature.kyc.impl.hyperverge.videoconference.HypervergeVideoKycFlowContract$InputData;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$InputData;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlowContract$InputData;
import com.revolut.feature.kyc.impl.web_id.flow.WebIdFlowContract$InputData;
import com.revolut.feature.rev_points.api.navigation.RevPointsEarnOptionsScreenApi$InputData;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.personalisation_targeting_onboarding.RevPointsPersonalisationTargetingOnboardingScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsControllerContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.related.RevPointsRelatedTransactionsBottomSheetControllerContract$InputData;
import com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.RevPointsTrophyRoomBottomSheetScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.RevPointsTrophyRoomDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.wrapped.flow.RevPointsWrappedFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f325345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xki.e f325346c;

    public /* synthetic */ r(Object obj2, xki.e eVar, int i) {
        this.f325344a = i;
        this.f325345b = obj2;
        this.f325346c = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f325344a) {
            case 0:
                HypervergeVideoKycFlowContract$InputData hypervergeVideoKycFlowContract$InputData = ((s) this.f325346c).f325350a;
                y80.a aVarR = ((c0) this.f325345b).f325244m.r();
                vc.s.j(aVarR);
                return new com.revolut.feature.kyc.impl.hyperverge.videoconference.a(hypervergeVideoKycFlowContract$InputData, aVarR);
            case 1:
                IdnowVideoIdentFlowContract$InputData idnowVideoIdentFlowContract$InputData = ((v) this.f325346c).f325404a;
                y80.a aVarR2 = ((c0) this.f325345b).f325244m.r();
                vc.s.j(aVarR2);
                return new com.revolut.feature.kyc.impl.idnow.video_ident.flow.a(idnowVideoIdentFlowContract$InputData, aVarR2);
            case 2:
                InputDocumentIdFlowContract$InputData inputDocumentIdFlowContract$InputData = ((a0) this.f325346c).f325226a;
                jvh.a aVarA = ((c0) this.f325345b).k.a();
                vc.s.j(aVarA);
                return new com.revolut.feature.kyc.impl.flow.input_document_id.a(inputDocumentIdFlowContract$InputData, aVarA);
            case 3:
                OnDemandFeatureInstallFlowContract$InputData onDemandFeatureInstallFlowContract$InputData = ((f0) this.f325346c).f325272a;
                c0 c0Var = (c0) this.f325345b;
                z70.a aVarF = c0Var.f325244m.f();
                vc.s.j(aVarF);
                xg0.a aVarA2 = c0Var.f325247q.a();
                vc.s.j(aVarA2);
                return new com.revolut.feature.kyc.impl.ondemand.a(onDemandFeatureInstallFlowContract$InputData, aVarF, aVarA2, new tw8.a());
            case 4:
                ProofOfAddressFlowContract$InputData proofOfAddressFlowContract$InputData = ((g0) this.f325346c).f325276a;
                f80.a aVarX = ((c0) this.f325345b).f325244m.x();
                vc.s.j(aVarX);
                return new com.revolut.feature.kyc.impl.flow.addressverification.a(proofOfAddressFlowContract$InputData, aVarX, new nv8.a());
            case 5:
                WebIdFlowContract$InputData webIdFlowContract$InputData = ((j0) this.f325346c).f325300a;
                l70.e eVar = ((c0) this.f325345b).f325244m;
                y80.a aVarR3 = eVar.r();
                vc.s.j(aVarR3);
                s70.a aVarM = eVar.m();
                vc.s.j(aVarM);
                return new com.revolut.feature.kyc.impl.web_id.flow.a(webIdFlowContract$InputData, aVarR3, aVarM, new nx8.a());
            case 6:
                zxb.e eVar2 = (zxb.e) this.f325345b;
                eub.a aVarA3 = eVar2.f.a();
                vc.s.j(aVarA3);
                LifestyleRevPointsOptInController$InputData lifestyleRevPointsOptInController$InputData = ((zxb.a) this.f325346c).f326097a;
                gte.a aVarB = eVar2.f326124g.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.rev_points.impl.ui.opt_in.flow.a(aVarA3, lifestyleRevPointsOptInController$InputData, aVarB, eVar2.k.b());
            case 7:
                RevPointsAdventRewardsFlowContract$InputData revPointsAdventRewardsFlowContract$InputData = ((zxb.c) this.f325346c).f326107a;
                zja.a aVarA4 = ((ika.b) ((zxb.e) this.f325345b).R).a();
                vc.s.j(aVarA4);
                return new com.revolut.feature.rev_points.impl.ui.advent.flow.b(revPointsAdventRewardsFlowContract$InputData, aVarA4);
            case 8:
                zxb.f fVar = (zxb.f) this.f325346c;
                znc.l lVar = new znc.l(new azb.h(zxb.y0.w(fVar.f326142b.f326121c)), new azb.f(), new azb.e(new nd7.d(new nd7.c())));
                RevPointsBottomSheetScreenContract$InputData revPointsBottomSheetScreenContract$InputData = fVar.f326141a;
                zxb.e eVar3 = (zxb.e) this.f325345b;
                nyb.k kVarC = eVar3.f.c();
                vc.s.j(kVarC);
                q06.l lVarA = eVar3.f326132r.a();
                vc.s.j(lVarA);
                return new zyb.h(lVar, revPointsBottomSheetScreenContract$InputData, kVarC, lVarA);
            case 9:
                zxb.h hVar = (zxb.h) this.f325346c;
                ezb.p pVar = new ezb.p(new gzb.c(new pyb.d()), new gzb.e());
                RevPointsChallengesHomeScreenContract$InputData revPointsChallengesHomeScreenContract$InputData = hVar.f326155a;
                zxb.e eVar4 = (zxb.e) this.f325345b;
                nyb.k kVarC2 = eVar4.f.c();
                vc.s.j(kVarC2);
                gzb.a aVar = new gzb.a();
                pyb.c cVar = new pyb.c(eVar4.e());
                pyb.a aVar2 = new pyb.a();
                q06.l lVarA2 = eVar4.f326132r.a();
                vc.s.j(lVarA2);
                return new com.revolut.feature.rev_points.impl.ui.challenges.home.b(pVar, revPointsChallengesHomeScreenContract$InputData, kVarC2, aVar, cVar, aVar2, lVarA2);
            case 10:
                zxb.i iVar = (zxb.i) this.f325346c;
                RevPointsEarnOptionsScreenApi$InputData revPointsEarnOptionsScreenApi$InputData = iVar.f326162a;
                kzb.k kVar = new kzb.k(revPointsEarnOptionsScreenApi$InputData, zxb.y0.w(iVar.f326163b.f326121c), new ozb.e());
                zxb.e eVar5 = (zxb.e) this.f325345b;
                nyb.k kVarC3 = eVar5.f.c();
                vc.s.j(kVarC3);
                q06.l lVarA3 = eVar5.f326132r.a();
                vc.s.j(lVarA3);
                return new kzb.h(kVar, revPointsEarnOptionsScreenApi$InputData, kVarC3, lVarA3);
            case 11:
                l80.e eVarH = ((zxb.l) this.f325346c).f326216a.f326128m.h();
                vc.s.j(eVarH);
                wzb.k kVar2 = new wzb.k(eVarH);
                zxb.e eVar6 = (zxb.e) this.f325345b;
                zxb.k0 k0Var = eVar6.f;
                nyb.k kVarC4 = k0Var.c();
                vc.s.j(kVarC4);
                nyb.m0 m0VarG = k0Var.g();
                vc.s.j(m0VarG);
                wub.a aVarA5 = eVar6.i.a();
                vc.s.j(aVarA5);
                return new com.revolut.feature.rev_points.impl.ui.points_expiry.home.a(kVar2, kVarC4, m0VarG, aVarA5);
            case 12:
                RevPointsFlowContract$InputData revPointsFlowContract$InputData = ((zxb.m) this.f325346c).f326219a;
                zxb.e eVar7 = (zxb.e) this.f325345b;
                pyb.c cVar2 = new pyb.c(eVar7.e());
                pyb.a aVar3 = new pyb.a();
                nyb.m0 m0VarG2 = eVar7.f.g();
                vc.s.j(m0VarG2);
                return new com.revolut.feature.rev_points.impl.ui.c(revPointsFlowContract$InputData, cVar2, aVar3, m0VarG2);
            case 13:
                zxb.n nVar = (zxb.n) this.f325346c;
                Context context = nVar.f326226b.f326121c;
                nzb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                i3g.k kVar3 = new i3g.k(new mzb.c(new c90.c(context)));
                RevPointsLearnScreenContract$InputData revPointsLearnScreenContract$InputData = nVar.f326225a;
                zxb.e eVar8 = (zxb.e) this.f325345b;
                nyb.k kVarC5 = eVar8.f.c();
                vc.s.j(kVarC5);
                q06.l lVarA4 = eVar8.f326132r.a();
                vc.s.j(lVarA4);
                return new mzb.k(kVar3, revPointsLearnScreenContract$InputData, kVarC5, lVarA4);
            case 14:
                zxb.p pVar2 = (zxb.p) this.f325346c;
                tzb.k kVar4 = new tzb.k(zxb.y0.w(pVar2.f326238b.f326121c), new ozb.e());
                RevPointsPersonalisationTargetingOnboardingScreenContract$InputData revPointsPersonalisationTargetingOnboardingScreenContract$InputData = pVar2.f326237a;
                zxb.e eVar9 = (zxb.e) this.f325345b;
                q06.l lVarA5 = eVar9.f326132r.a();
                vc.s.j(lVarA5);
                nyb.e0 e0Var = (nyb.e0) eVar9.f.T.get();
                vc.s.j(e0Var);
                return new tzb.i(kVar4, revPointsPersonalisationTargetingOnboardingScreenContract$InputData, lVarA5, e0Var);
            case 15:
                zxb.r rVar = (zxb.r) this.f325346c;
                zzb.v vVar = new zzb.v(new b0c.e(new ozb.e()), new b0c.c(), new b0c.b());
                RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData = rVar.f326249a;
                zxb.e eVar10 = (zxb.e) this.f325345b;
                nyb.c0 c0Var2 = (nyb.c0) eVar10.f.f326208r0.get();
                vc.s.j(c0Var2);
                q06.l lVarA6 = eVar10.f326132r.a();
                vc.s.j(lVarA6);
                return new zzb.t(vVar, revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData, c0Var2, lVarA6);
            case 16:
                zxb.u uVar = (zxb.u) this.f325346c;
                RevPointsRelatedTransactionsBottomSheetControllerContract$InputData revPointsRelatedTransactionsBottomSheetControllerContract$InputData = uVar.f326280a;
                s0c.f fVar2 = new s0c.f(revPointsRelatedTransactionsBottomSheetControllerContract$InputData, (fub.k) uVar.f326281b.W.get());
                zxb.e eVar11 = (zxb.e) this.f325345b;
                nyb.m0 m0VarG3 = eVar11.f.g();
                vc.s.j(m0VarG3);
                nhf.a aVarA6 = eVar11.f326129n.a();
                vc.s.j(aVarA6);
                return new s0c.e(fVar2, revPointsRelatedTransactionsBottomSheetControllerContract$InputData, m0VarG3, aVarA6, (pyb.l) eVar11.g0.get(), eVar11.f326130p.a());
            case 17:
                zxb.w wVar = (zxb.w) this.f325346c;
                t0c.g gVar = new t0c.g(zxb.y0.w(wVar.f326305b.f326121c), new ozb.e());
                RevPointsTrophyRoomBottomSheetScreenContract$InputData revPointsTrophyRoomBottomSheetScreenContract$InputData = wVar.f326304a;
                zxb.e eVar12 = (zxb.e) this.f325345b;
                q06.l lVarA7 = eVar12.f326132r.a();
                vc.s.j(lVarA7);
                u29.d dVar = (u29.d) ((t29.h) eVar12.T).f267499m.get();
                vc.s.j(dVar);
                return new t0c.e(gVar, revPointsTrophyRoomBottomSheetScreenContract$InputData, lVarA7, dVar);
            case 18:
                zxb.x xVar = (zxb.x) this.f325346c;
                qee.s sVar = new qee.s(new x0c.e(), new x0c.d(zxb.y0.w(xVar.f326309b.f326121c)), new x0c.a());
                RevPointsTrophyRoomDetailsScreenContract$InputData revPointsTrophyRoomDetailsScreenContract$InputData = xVar.f326308a;
                zxb.e eVar13 = (zxb.e) this.f325345b;
                u29.d dVar2 = (u29.d) ((t29.h) eVar13.T).f267499m.get();
                vc.s.j(dVar2);
                ffk.t tVarF = eVar13.f326125h.f();
                vc.s.j(tVarF);
                return new com.revolut.feature.rev_points.impl.ui.trophy_room.details.c(sVar, revPointsTrophyRoomDetailsScreenContract$InputData, dVar2, tVarF);
            case 19:
                zxb.a0 a0Var = (zxb.a0) this.f325346c;
                d1c.a aVar4 = new d1c.a();
                Context context2 = a0Var.f326099a.f326121c;
                ac4.g gVar2 = new ac4.g(aVar4, new d1c.h(zxb.y0.w(context2)), new d1c.l(zxb.y0.w(context2)));
                zxb.e eVar14 = (zxb.e) this.f325345b;
                u29.d dVar3 = (u29.d) ((t29.h) eVar14.T).f267499m.get();
                vc.s.j(dVar3);
                nyb.k kVarC6 = eVar14.f.c();
                vc.s.j(kVarC6);
                ffk.t tVarF2 = eVar14.f326125h.f();
                vc.s.j(tVarF2);
                return new com.revolut.feature.rev_points.impl.ui.trophy_room.home.b(gVar2, dVar3, kVarC6, tVarF2);
            case 20:
                RevPointsWrappedFlowContract$InputData revPointsWrappedFlowContract$InputData = ((zxb.d0) this.f325346c).f326114a;
                q06.l lVarA8 = ((zxb.e) this.f325345b).f326132r.a();
                vc.s.j(lVarA8);
                return new com.revolut.feature.rev_points.impl.ui.wrapped.flow.a(revPointsWrappedFlowContract$InputData, lVarA8);
            case 21:
                zxb.f0 f0Var = (zxb.f0) this.f325346c;
                TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = f0Var.f326144a;
                eub.l lVar2 = f0Var.f326145b;
                zxb.e eVar15 = (zxb.e) this.f325345b;
                fub.k kVar5 = (fub.k) eVar15.W.get();
                nhf.a aVarA7 = eVar15.f326129n.a();
                vc.s.j(aVarA7);
                return new com.revolut.feature.rev_points.impl.ui.transactions.flow.c(transactionDetailsPagerFlowContract$InputData, lVar2, kVar5, aVarA7, new p0c.h());
            case 22:
                RevPointsTermsReviewInputData revPointsTermsReviewInputData = ((zxb.p0) this.f325346c).f326240a;
                pre.c cVarA = ((zxb.o0) this.f325345b).f326234a.a();
                vc.s.j(cVarA);
                return new com.revolut.feature.rev_points.impl.ui.terms_review.flow.a(revPointsTermsReviewInputData, cVarA);
            case 23:
                RevPointsReadTermsControllerContract$InputData revPointsReadTermsControllerContract$InputData = ((zxb.r0) this.f325346c).f326253b;
                l0c.x xVar2 = new l0c.x(revPointsReadTermsControllerContract$InputData, new l0c.a());
                zxb.o0 o0Var = (zxb.o0) this.f325345b;
                pre.c cVarA2 = o0Var.f326234a.a();
                vc.s.j(cVarA2);
                return new l0c.u(revPointsReadTermsControllerContract$InputData, xVar2, cVarA2, ((nj0.d) o0Var.f326235b).j(), o0Var.f326236c.e());
            default:
                RevPointsReadTermsControllerContract$InputData revPointsReadTermsControllerContract$InputData2 = ((zxb.r0) this.f325346c).f326253b;
                l0c.x xVar3 = new l0c.x(revPointsReadTermsControllerContract$InputData2, new l0c.a());
                zxb.o0 o0Var2 = (zxb.o0) this.f325345b;
                pre.c cVarA3 = o0Var2.f326234a.a();
                vc.s.j(cVarA3);
                return new l0c.u(revPointsReadTermsControllerContract$InputData2, xVar3, cVarA3, ((nj0.d) o0Var2.f326235b).j(), o0Var2.f326236c.e());
        }
    }
}
