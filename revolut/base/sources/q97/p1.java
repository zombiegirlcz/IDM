package q97;

import androidx.camera.camera2.config.UseCaseGraphContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.apm.bizum.impl.ui.BizumFlow;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.additionalinfo.AdditionalInfoDialogScreen;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsController;
import com.revolut.feature.donations.impl.ui.kompot.flow.root.DonationsFlow;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentController;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreen;
import com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.PlanComparisonFlow;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreen;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreen;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlow;
import com.revolut.feature.transfer.core.impl.ui.reason.summary.ReasonForTransferSummaryScreen;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$Step;
import com.revolut.feature.transport.impl.ui.TransportFlow;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreen;
import com.revolut.feature.trusted_merchants.impl.ui.trusted_merchants.TrustedMerchantsActivity;
import com.revolut.feature.workflow.engine.rfi.impl.ui.text.TextQuestionScreen;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.WealthNewsFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.PartnerConsentRequestFlow;
import ip0.go0;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class p1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f243768b;

    public /* synthetic */ p1(Object obj2, int i) {
        this.f243767a = i;
        this.f243768b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v148, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RevPoints revPoints;
        t6c.e eVar;
        t6c.e eVar2;
        int i = this.f243767a;
        Object obj2 = this.f243768b;
        switch (i) {
            case 0:
                return ((xq3.u) ((c0) obj2).f243661c).a(mif.a.m(ft3.d1.Companion, ft3.j1.OVERDRAFT, null));
            case 1:
                return ((s1) obj2).f243784c.a(mif.a.m(ft3.d1.Companion, ft3.j1.BUY_NOW_PAY_LATER, null));
            case 2:
                q9c.r rVar = (q9c.r) obj2;
                t6c.n nVar = rVar.f243874a.f268307b;
                if (nVar == null) {
                    return null;
                }
                long j2 = nVar.f268303a;
                t6c.f fVar = rVar.f243875b;
                dj0.d dVar = (fVar == null || (eVar2 = fVar.f268292b) == null) ? null : eVar2.f268288a;
                t6c.i iVar = nVar.f268304b;
                BigDecimal bigDecimal = iVar != null ? iVar.f268298b : null;
                if (fVar != null && (eVar = fVar.f268292b) != null && (revPoints = eVar.f268290c) != null) {
                    revPoints = revPoints;
                } else if (iVar != null) {
                    RevPoints revPoints2 = new RevPoints(iVar.f268297a);
                    revPoints = revPoints2;
                } else {
                    revPoints = null;
                }
                return new s6c.p(j2, dVar, bigDecimal, revPoints);
            case 3:
                int i2 = AdditionalInfoDialogScreen.T;
                return (qb2.b) ((nb2.a) ((AdditionalInfoDialogScreen) obj2).Q.getValue()).f213958c.get();
            case 4:
                return (qb6.a) ((pa6.n) ((DonationsFlow) obj2).P.getValue()).d.get();
            case 5:
                ((qcg.c) obj2).f244781a.getClass();
                return go0.PROGRESSIVE_BLUR;
            case 6:
                return (qef.a) ((jef.g) ((TransactionRecogniserFlow) obj2).P.getValue()).d.get();
            case 7:
                return Boolean.valueOf(((qej.e) obj2).f245188a.getPackageManager().hasSystemFeature("android.hardware.telephony.euicc"));
            case 8:
                KProperty[] kPropertyArr = TravelMilesAccountRegistrationScreen.c0;
                ufg.y yVar = (ufg.y) ((TravelMilesAccountRegistrationScreen) obj2).Z.getValue();
                switch (yVar.f279805a) {
                    case 0:
                        return (qgg.o) yVar.e.get();
                    default:
                        return (qgg.o) yVar.e.get();
                }
            case 9:
                KProperty[] kPropertyArr2 = TravelMilesTransferBreakdownScreen.T;
                ufg.i0 i0Var = (ufg.i0) ((TravelMilesTransferBreakdownScreen) obj2).R.getValue();
                switch (i0Var.f279744a) {
                    case 0:
                        return (qig.c) i0Var.e.get();
                    default:
                        return (qig.c) i0Var.e.get();
                }
            case 10:
                TrustedMerchantsActivity trustedMerchantsActivity = (TrustedMerchantsActivity) obj2;
                return new z4l.j(7, zhm.v.k((ListSubheaderDelegate) trustedMerchantsActivity.f94443w0.getValue(), (RowDelegate) trustedMerchantsActivity.f94444x0.getValue(), (FullScreenStateDelegate) trustedMerchantsActivity.y0.getValue(), (RowLoadingDelegate) trustedMerchantsActivity.z0.getValue(), (ListSubheaderLoadingDelegate) trustedMerchantsActivity.A0.getValue()), false);
            case 11:
                return (qm7.a) ((ql7.s) ((ClaimsFlow) obj2).P.getValue()).f247461j.get();
            case 12:
                ((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.b) obj2).G2(a.C0504a.f75446a);
                return Unit.f186387a;
            case 13:
                int i3 = JuniorRewardDetailsDialogScreen.U;
                return (qm8.c) ((nm8.c) ((JuniorRewardDetailsDialogScreen) obj2).T.getValue()).f.get();
            case 14:
                KProperty[] kPropertyArr3 = PayInStoreScreen.f79044d0;
                return (qn9.l) ((kn9.c) ((PayInStoreScreen) obj2).Y.getValue()).d.get();
            case 15:
                int i5 = FeedbackCommentController.V;
                return (qp6.a) ((gp6.c) ((FeedbackCommentController) obj2).S.getValue()).f145267b.get();
            case 16:
                KProperty[] kPropertyArr4 = ReservationScreen.g0;
                return (qp7.q) ((ql7.g1) ((ReservationScreen) obj2).Y.getValue()).f247312g.get();
            case 17:
                int i6 = CreditCardsController.W;
                return (qq4.e) ((jm4.d3) ((CreditCardsController) obj2).T.getValue()).f176040c.get();
            case 18:
                KProperty[] kPropertyArr5 = ReasonForTransferSummaryScreen.f92212b0;
                return (qqf.l) ((lpf.e) ((ReasonForTransferSummaryScreen) obj2).X.getValue()).f199021c.get();
            case 19:
                return (qs1.a) ((ms1.l) ((BizumFlow) obj2).P.getValue()).e.get();
            case 20:
                gsd.c cVar = (gsd.c) obj2;
                tsj.g gVar = (tsj.g) cVar.f146392b;
                return boh.f.e(zh9.u0.i(gVar.f(w4l.i.f294643c), gVar.g(w4l.h.f294642c), rd0.e.b(((wsg.n) cVar.d).J(AccountId.Personal.f51414a, w4l.j.f294644c))), new qgf.o(cVar, 27));
            case 21:
                yki.a aVar = ((com.revolut.feature.transfer_reasons.impl.flow.a) obj2).v;
                if (Intrinsics.f(aVar.d(), TransferReasonsFlowContract$Step.Initial.f92339a)) {
                    oki.h.D2(aVar);
                }
                return Unit.f186387a;
            case 22:
                return (qu7.a) ((lu7.u) ((PlanComparisonFlow) obj2).Q.getValue()).d.get();
            case 23:
                int i21 = TextQuestionScreen.U;
                return (quh.c) ((euh.f) ((ruh.a) ((TextQuestionScreen) obj2).R.getValue())).d.get();
            case 24:
                return (qvf.b) ((hvf.m) ((TransportFlow) obj2).P.getValue()).f155931b.get();
            case 25:
                ((qwf.z) obj2).x2(new qwd.o(10));
                return Unit.f186387a;
            case 26:
                return UseCaseGraphContext._graph$lambda$0((UseCaseGraphContext) obj2);
            case 27:
                return (r0k.a) ((l0k.h) ((WealthNewsFlow) obj2).P.getValue()).e.get();
            case 28:
                return (r0l.c) ((kyk.o) ((PartnerConsentRequestFlow) obj2).P.getValue()).e.get();
            default:
                return w02.a.a(((r12.g) obj2).f250885c.D2());
        }
    }
}
