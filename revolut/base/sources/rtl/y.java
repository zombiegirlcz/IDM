package rtl;

import afj.x0;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.compose.foundation.text.input.internal.InputMethodManagerImpl;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.SaleScreen;
import com.revolut.feature.apm.core.api.ApmToggles$Qvik;
import com.revolut.feature.card_screen.impl.prompts.CardPromptFlow;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreen;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet.SplitBillLinkBottomSheetController;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.checkout.RevPointsGiftcardCheckoutScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.related.RevPointsRelatedTransactionsBottomSheetController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.SharedAlertsFlow;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreen;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlow;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$Input;
import com.revolut.retail.feature.esim.impl.ui.flows.subscription.EsimSubscriptionFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlow;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.beneficiary_details.BeneficiaryDetailsController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityFlow;
import jm4.p4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f257346b;

    public /* synthetic */ y(Object obj2, int i) {
        this.f257345a = i;
        this.f257346b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v105, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v145, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v98, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f257345a;
        int i2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        rfm.h hVar = rfm.h.f253943a;
        Object obj2 = this.f257346b;
        switch (i) {
            case 0:
                return nim.a.w(osg.b.g(((c0) obj2).d, w4l.i.f294643c, io3.l.CURRENT, io3.k.ACTIVE, io3.i.INTERNAL, null, null, null, 112), new rsl.c(21)).replay(1).e();
            case 1:
                return (ru7.a) ((lu7.f) ((CoverageFlow) obj2).P.getValue()).d.get();
            case 2:
                int i3 = RevPointsGiftcardCheckoutScreen.Y;
                return (rwb.d) ((iwb.c) ((RevPointsGiftcardCheckoutScreen) obj2).W.getValue()).e.get();
            case 3:
                int i5 = MaskedTextInputEditText.f59117y;
                ihm.f fVarD = v0.a.d("create(...)");
                ((MaskedTextInputEditText) obj2).f59121l = new y(fVarD, 4);
                return fVarD;
            case 4:
                int i6 = MaskedTextInputEditText.f59117y;
                Unit unit = Unit.f186387a;
                ((ihm.f) obj2).onNext(unit);
                return unit;
            case 5:
                KProperty[] kPropertyArr = DirectDebitAccountDetailsScreen.c0;
                return (ry4.h) ((p4) ((DirectDebitAccountDetailsScreen) obj2).X.getValue()).f176256c.get();
            case 6:
                com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar = (com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) obj2;
                aVar.l2(new rm6.c(aVar, new rik.e(aVar, objArr2 == true ? 1 : 0, 10), objArr == true ? 1 : 0, 27), new rze.j(aVar, i2));
                return Unit.f186387a;
            case 7:
                return (rzk.a) ((kyk.f) ((KycDetailsNationalityFlow) obj2).Q.getValue()).e.get();
            case 8:
                return CapturePipelineImpl.useCaseCameraState_delegate$lambda$0((CapturePipelineImpl) obj2);
            case 9:
                int i21 = RevPointsRelatedTransactionsBottomSheetController.V;
                return (s0c.b) ((zxb.u) ((RevPointsRelatedTransactionsBottomSheetController) obj2).S.getValue()).f326282c.get();
            case 10:
                KProperty[] kPropertyArr2 = WealthNewsOverviewFlow.X;
                return (s0k.d) ((l0k.i) ((WealthNewsOverviewFlow) obj2).U.getValue()).d.get();
            case 11:
                return InputMethodManagerImpl.imm_delegate$lambda$0((InputMethodManagerImpl) obj2);
            case 12:
                return LegacyTextInputMethodRequest.baseInputConnection_delegate$lambda$0((LegacyTextInputMethodRequest) obj2);
            case 13:
                return Boolean.valueOf(((jte.d) ((s12.q) obj2).f259053a).c(ApmToggles$Qvik.f61802c));
            case 14:
                int i22 = SplitBillLinkBottomSheetController.U;
                return (s1a.g) ((j1a.e) ((SplitBillLinkBottomSheetController) obj2).S.getValue()).f170296b.get();
            case 15:
                KProperty[] kPropertyArr3 = TravelExperiencesCancellationScreen.f93021h0;
                z0g.z zVar = (z0g.z) ((TravelExperiencesCancellationScreen) obj2).f93025e0.getValue();
                switch (zVar.f318472a) {
                    case 0:
                        return (s1g.h) zVar.k.get();
                    default:
                        return (s1g.h) zVar.k.get();
                }
            case 16:
                KProperty[] kPropertyArr4 = PaymentOptionsScreen.c0;
                return (s1k.h) ((q1k.c) ((PaymentOptionsScreen) obj2).Z.getValue()).f241462c.get();
            case 17:
                KProperty[] kPropertyArr5 = TravelExperiencesOptionsV2Screen.i0;
                return (s2g.o) ((z0g.k) ((TravelExperiencesOptionsV2Screen) obj2).g0.getValue()).f318396j.get();
            case 18:
                return te0.w.g(((s2g.j) ((s2g.w) obj2).t2()).f259312b);
            case 19:
                s2i.h hVar2 = (s2i.h) obj2;
                return ((x0i.g) hVar2.f259357c).a(((ExchangeOrder) ((s2i.k) hVar2.f259356b).w0().get()).getF72134a().f72137a);
            case 20:
                KProperty[] kPropertyArr6 = TravelExperiencesVisitorInformationScreen.c0;
                return (s3g.f) ((z0g.r) ((TravelExperiencesVisitorInformationScreen) obj2).f93171a0.getValue()).e.get();
            case 21:
                int i32 = BeneficiaryDetailsController.T;
                return (s4k.a) ((p2k.l) ((BeneficiaryDetailsController) obj2).Q.getValue()).f232393c.get();
            case 22:
                return (s83.a) ((t83.b) ((CardPromptFlow) obj2).P.getValue()).d.get();
            case 23:
                lk0.g gVar = (lk0.g) ((sa6.i) obj2).f261324b.f();
                if (gVar == null) {
                    Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                    return hVar;
                }
                rfm.u uVarG = efm.k.g(gVar);
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                return uVarG;
            case 24:
                RecurringTransferManagementFlow recurringTransferManagementFlow = (RecurringTransferManagementFlow) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(recurringTransferManagementFlow.m2()).a().get(z9h.d.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                }
                z9h.d dVar = ((z9h.d) ((tah.a) aVar3.b())).f320410w;
                RecurringTransferManagementFlowContract$Input recurringTransferManagementFlowContract$Input = (RecurringTransferManagementFlowContract$Input) recurringTransferManagementFlow.G;
                recurringTransferManagementFlowContract$Input.getClass();
                return new z9h.j(dVar, recurringTransferManagementFlowContract$Input);
            case 25:
                lk0.g gVar2 = (lk0.g) ((sdg.a) obj2).f261873b.f();
                if (gVar2 == null) {
                    Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                    return hVar;
                }
                rfm.u uVarG2 = efm.k.g(gVar2);
                Intrinsics.checkNotNullExpressionValue(uVarG2, "just(...)");
                return uVarG2;
            case 26:
                SaleScreen saleScreen = (SaleScreen) obj2;
                KProperty[] kPropertyArr7 = SaleScreen.P;
                qji.b bVarQ2 = saleScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.di.SaleScreenInjector");
                ld1.m mVar = (ld1.m) bVarQ2;
                return new ld1.u(mVar.f193969a, mVar.f193970b, saleScreen);
            case 27:
                return (sed.a) ((ned.g) ((ted.a) ((SharedAlertsFlow) obj2).P.getValue())).d.get();
            case 28:
                return (sgj.a) ((x0) ((EsimSubscriptionFlow) obj2).P.getValue()).d.get();
            default:
                oki.h.D2(((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a) obj2).f103152q);
                return Unit.f186387a;
        }
    }
}
