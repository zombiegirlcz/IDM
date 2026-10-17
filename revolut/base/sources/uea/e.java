package uea;

import aw0.n6;
import com.revolut.feature.apm.breb.impl.ui.area.BrebAreaScreen;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.limitsdialog.CryptoSendLimitsDialogController;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.access_details.AccessDetailsScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.upsell.FreelancerCashbackUpsellScreen;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreen;
import com.revolut.feature.junior_profile.impl.ui.junior_account_simple_picker.JuniorAccountSimplePickerController;
import com.revolut.feature.kyc.impl.common.screen.consent.KycConsentScreen;
import com.revolut.feature.pay_later.impl.ui.selectplan.PayLaterSelectPlanScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.AutoEarnRewardsController;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.income_insurance_claim_bottom_sheet.IncomeInsuranceClaimBottomSheetController;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreen;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareController;
import com.revolut.feature.staking.impl.earndialog.flexible.FlexibleEarnRatesDialogController;
import com.revolut.feature.wealth.ui.impl.documents.InvestDocumentsScreen;
import com.revolut.feature.workflow.engine.product_closures.modal.CloseProductScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.EsimGiftRecipientSelectionScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreen;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheet;
import fmc.z;
import gim.i;
import ha3.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kr6.a;
import mii.q;
import nii.n1;
import oki.h;
import ud3.n;
import ueg.p0;
import uod.g;
import uv6.l;
import uw2.k;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((f) this.v, continuation, 0);
            case 1:
                return new e((IncomeInsuranceClaimBottomSheetController) this.v, continuation, 1);
            case 2:
                return new e((com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) this.v, continuation, 2);
            case 3:
                return new e((EsimGiftRecipientSelectionScreen) this.v, continuation, 3);
            case 4:
                return new e((AccessDetailsScreen) this.v, continuation, 4);
            case 5:
                return new e((uid.d) this.v, continuation, 5);
            case 6:
                return new e((JuniorAccountSimplePickerController) this.v, continuation, 6);
            case 7:
                return new e((PayLaterSelectPlanScreen) this.v, continuation, 7);
            case 8:
                return new e((InvestDocumentsScreen) this.v, continuation, 8);
            case 9:
                return new e((com.revolut.feature.apm.aani.impl.ui.c) this.v, continuation, 9);
            case 10:
                return new e((AccountsToApplyChangesBottomSheet) this.v, continuation, 10);
            case 11:
                return new e((ThemeCustomisationController) this.v, continuation, 11);
            case 12:
                return new e((BudgetOverviewController) this.v, continuation, 12);
            case 13:
                return new e((PlanOfferPromptScreen) this.v, continuation, 13);
            case 14:
                return new e((AutoEarnRewardsController) this.v, continuation, 14);
            case 15:
                return new e((PenContributionScreen) this.v, continuation, 15);
            case 16:
                return new e((TripsShareController) this.v, continuation, 16);
            case 17:
                return new e((g) this.v, continuation, 17);
            case 18:
                return new e((com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c) this.v, continuation, 18);
            case 19:
                return new e((CryptoSendLimitsDialogController) this.v, continuation, 19);
            case 20:
                return new e((DocumentListScreen) this.v, continuation, 20);
            case 21:
                return new e((CloseProductScreen) this.v, continuation, 21);
            case 22:
                return new e((FreelancerAcquiringPaymentDetailsScreen) this.v, continuation, 22);
            case 23:
                return new e((KycConsentScreen) this.v, continuation, 23);
            case 24:
                return new e((FlexibleEarnRatesDialogController) this.v, continuation, 24);
            case 25:
                return new e((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) this.v, continuation, 25);
            case 26:
                return new e((BrebAreaScreen) this.v, continuation, 26);
            case 27:
                return new e((FreelancerCashbackUpsellScreen) this.v, continuation, 27);
            case 28:
                return new e((GooglePayMultipleOtpVerificationController) this.v, continuation, 28);
            default:
                return new e((uw2.g) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v89, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 24;
        aii.q qVar = aii.q.f5292a;
        int i3 = 8;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return j6.a.k(Boolean.TYPE, ((f) obj3).d, "SWITCH_ACCOUNT_BANNER_STORAGE_KEY");
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ugb.f fVar = (ugb.f) ((IncomeInsuranceClaimBottomSheetController) obj3).T.getValue();
                if (((ugb.a) ((j2) fVar.f279995q.f22677a).getValue()).f279990a.size() == ugb.b.a().size()) {
                    fVar.l2(new u83.f(fVar, continuation, i3), new n(fVar, 18));
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) obj3).C2(qVar);
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) ((uhj.f) ((EsimGiftRecipientSelectionScreen) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ui6.e) ((AccessDetailsScreen) obj3).P.getValue()).B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                uid.d dVar = (uid.d) obj3;
                dVar.H2(dVar.o, new p0(i2));
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((uj8.i) ((uj8.b) ((JuniorAccountSimplePickerController) obj3).R.getValue())).B2();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PayLaterSelectPlanScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((InvestDocumentsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.D2(((com.revolut.feature.apm.aani.impl.ui.c) obj3).v);
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ull.g gVar = (ull.g) ((ull.e) ((AccountsToApplyChangesBottomSheet) obj3).S.getValue());
                ull.b bVar = (ull.b) ((j2) gVar.o.f22677a).getValue();
                if (bVar.f281051c.isEmpty()) {
                    RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Can't continue without selected accounts");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
                } else {
                    gVar.C2(new ull.d(bVar.f281051c));
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) ((ThemeCustomisationController) obj3).d()).K2();
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((BudgetOverviewController) obj3).R2().B2();
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a) ((PlanOfferPromptScreen) obj3).R2()).C2(umk.h.f281325a);
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AutoEarnRewardsController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PenContributionScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) ((TripsShareController) obj3).N.getValue()).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar2 = (g) obj3;
                ArrayList arrayListB = gVar2.f281633p.b(false);
                z zVar = gVar2.f281635r;
                TripsShareContract$InputData tripsShareContract$InputData = gVar2.o;
                List listD1 = d0.d1(tripsShareContract$InputData.f87639a);
                Set set = tripsShareContract$InputData.f;
                zVar.getClass();
                gVar2.H2(gVar2.f281636s, new abf.n(arrayListB, z.b(listD1, set), 27));
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.D2(((com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c) obj3).A);
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                uq5.f fVar2 = (uq5.f) ((uq5.e) ((CryptoSendLimitsDialogController) obj3).R.getValue());
                fVar2.f282108p.getClass();
                fVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.what-are-the-limits-on-crypto-withdrawal", 2))));
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((DocumentListScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                uth.c cVar = (uth.c) ((CloseProductScreen) obj3).S.getValue();
                cVar.getClass();
                cVar.l2(new u83.f(cVar, continuation, i2), new yi5.b(26));
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a) ((FreelancerAcquiringPaymentDetailsScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((uu8.d) ((KycConsentScreen) obj3).P.getValue()).C2(ns8.a.f218760a);
                return Unit.f186387a;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((uud.f) ((FlexibleEarnRatesDialogController) obj3).T.getValue()).C2(qVar);
                return Unit.f186387a;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.D2(((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) obj3).f107026w);
                return Unit.f186387a;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((uv1.d0) ((BrebAreaScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) ((uv6.f) ((FreelancerCashbackUpsellScreen) obj3).M.getValue())).C2(a.C1068a.f188661a);
                return Unit.f186387a;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                uw2.g gVar3 = (uw2.g) ((uw2.i) ((GooglePayMultipleOtpVerificationController) obj3).O.getValue());
                ((x) gVar3.f283528p).f.e();
                gVar3.C2(k.a.f283536a);
                return Unit.f186387a;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                uw2.g gVar4 = (uw2.g) obj3;
                return yji.l.a1(gVar4, rd0.e.b(nim.a.w(l93.f.k(gVar4.f283528p, null, null, false, 15), new uw2.d(gVar4, 1))), null, null, new up2.q(gVar4, continuation, i3), 3);
        }
    }
}
