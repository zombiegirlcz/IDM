package lea;

import afj.k0;
import afj.l0;
import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreen;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreenContract$InputData;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesController;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesControllerContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlow;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment.OpenBankingBrPaymentScreen;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlow;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_list.BenefitListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_list.BenefitListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.manage.ManagePolicyScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.manage.ManagePolicyScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreenContract$InputData;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsCreateNavigationFlow$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlow;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.create.PaymentsGroupsCreateFlow;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.MultiIbanFlow;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.MultiIbanFlowContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreen;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.TravelRemoveWidgetFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.TravelRemoveWidgetFlowContract$InputData;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallController;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallControllerContract$InputData;
import com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData;
import com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.ReasonForTransferFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreenContract$InputData;
import dmc.z;
import jg5.f;
import jg5.g;
import jm4.e4;
import jm4.f4;
import jm4.i0;
import jm4.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kr.f0;
import kr.q0;
import kr.s0;
import kr.t0;
import kr.x0;
import kr.z2;
import kr9.l;
import lf9.j;
import lf9.k;
import lf9.m;
import lpf.i;
import lpf.y;
import lr.p;
import lt0.v;
import nk7.q;
import nk7.r;
import oda.h;
import oda.o;
import oi9.n;
import or0.u;
import ppd.b0;
import ppd.y0;
import ql7.o0;
import ufg.t;
import xf6.p2;
import xf6.t2;
import xf6.u2;
import xf6.w2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f194521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f194522c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f194520a = i;
        this.f194521b = obj2;
        this.f194522c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f194520a;
        Object obj2 = this.f194522c;
        Object obj3 = this.f194521b;
        switch (i) {
            case 0:
                MultiIbanFlowContract$InputData multiIbanFlowContract$InputData = (MultiIbanFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((MultiIbanFlow) obj3).m2()).a().get(o.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new h(((o) aVar.b()).P, multiIbanFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 1:
                CryptoFeaturesController cryptoFeaturesController = (CryptoFeaturesController) obj3;
                CryptoFeaturesControllerContract$InputData cryptoFeaturesControllerContract$InputData = (CryptoFeaturesControllerContract$InputData) obj2;
                KProperty[] kPropertyArr = CryptoFeaturesController.R;
                phm.a aVar3 = (phm.a) ue0.e.j(cryptoFeaturesController.m2()).a().get(g.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new f(((g) aVar.b()).f, cryptoFeaturesController, cryptoFeaturesControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
            case 2:
                TravelMilesRecommendedFlightsFlowContract$InputData travelMilesRecommendedFlightsFlowContract$InputData = (TravelMilesRecommendedFlightsFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((TravelMilesRecommendedFlightsFlow) obj3).m2()).a().get(ffg.a.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new t(((ufg.g) aVar.b()).A, travelMilesRecommendedFlightsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
            case 3:
                FormReviewScreenContract$InputData formReviewScreenContract$InputData = (FormReviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = FormReviewScreen.U;
                qji.b bVarU2 = ((FormReviewScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.di.FormReviewScreenInjector");
                j jVar = (j) bVarU2;
                m mVar = jVar.f194723b;
                j jVar2 = jVar.f194724c;
                formReviewScreenContract$InputData.getClass();
                return new k(mVar, jVar2, formReviewScreenContract$InputData);
            case 4:
                OpenBankingAuthAccountsAuFlowContract$InputData openBankingAuthAccountsAuFlowContract$InputData = (OpenBankingAuthAccountsAuFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((OpenBankingAuthAccountsAuFlow) obj3).m2()).a().get(w2.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new p2(((w2) aVar.b()).J, openBankingAuthAccountsAuFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", w2.class, " is not found"));
            case 5:
                CFACInsuranceFlowContract$InputData cFACInsuranceFlowContract$InputData = (CFACInsuranceFlowContract$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((CFACInsuranceFlow) obj3).m2()).a().get(nk7.a.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new r(((q) aVar.b()).f216719h, cFACInsuranceFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nk7.a.class, " is not found"));
            case 6:
                KProperty[] kPropertyArr3 = SelectAmountTypeScreen.f68614b0;
                qji.b bVarQ2 = ((SelectAmountTypeScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.amount.select_type.di.SelectAmountTypeScreenInjector");
                i0 i0Var = (i0) bVarQ2;
                return new n3(i0Var.f176114b, i0Var.f176115c, (SelectAmountTypeScreenContract$InputData) obj2);
            case 7:
                OpenBankingBrPaymentScreen.a aVar7 = OpenBankingBrPaymentScreen.Companion;
                qji.b bVarU22 = ((OpenBankingBrPaymentScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment.di.OpenBankingBrPaymentScreenInjector");
                u2 u2Var = (u2) bVarU22;
                return new t2(u2Var.f305110b, u2Var.f305111c, (lk6.j) obj2);
            case 8:
                CFACInsuranceDetailsScreenContract$InputData cFACInsuranceDetailsScreenContract$InputData = (CFACInsuranceDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = CFACInsuranceDetailsScreen.c0;
                qji.b bVarQ22 = ((CFACInsuranceDetailsScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.details.di.CFACInsuranceDetailsScreenInjector");
                r rVar = (r) bVarQ22;
                q qVar = rVar.f216721b;
                r rVar2 = rVar.f216722c;
                cFACInsuranceDetailsScreenContract$InputData.getClass();
                return new nk7.m(qVar, rVar2, cFACInsuranceDetailsScreenContract$InputData);
            case 9:
                PayLaterRepaymentDetailsScreen payLaterRepaymentDetailsScreen = (PayLaterRepaymentDetailsScreen) obj3;
                PayLaterRepaymentDetailsScreenContract$InputData payLaterRepaymentDetailsScreenContract$InputData = (PayLaterRepaymentDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = PayLaterRepaymentDetailsScreen.f78910k0;
                phm.a aVar8 = (phm.a) ue0.e.j(payLaterRepaymentDetailsScreen.m2()).a().get(oi9.f.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new n(((oi9.f) aVar.b()).v, payLaterRepaymentDetailsScreen, payLaterRepaymentDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", oi9.f.class, " is not found"));
            case 10:
                View view = (View) obj3;
                View view2 = (View) obj2;
                if (view != null) {
                    view.setAlpha(1.0f);
                }
                if (view != null) {
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                }
                if (view2 != null) {
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
                return Unit.f186387a;
            case 11:
                lmb.n nVar = (lmb.n) obj2;
                if (((Ref$ObjectRef) obj3).f186409a == null) {
                    nVar.invoke();
                }
                return Unit.f186387a;
            case 12:
                KProperty[] kPropertyArr6 = EsimMobilePlanPortingCancellationScreen.U;
                qji.b bVarU23 = ((EsimMobilePlanPortingCancellationScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.di.EsimMobilePlanPortingCancellationScreenInjector");
                k0 k0Var = (k0) bVarU23;
                return new l0(k0Var.f4310b, k0Var.f4311c, (EsimMobilePlanPortingCancellationScreenContract$InputData) obj2);
            case 13:
                KProperty[] kPropertyArr7 = BenefitListScreen.f75512a0;
                qji.b bVarQ23 = ((BenefitListScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_list.di.BenefitListScreenInjector");
                ql7.n nVar2 = (ql7.n) bVarQ23;
                return new ql7.g(nVar2.f247399b, nVar2.f247400c, (BenefitListScreenContract$InputData) obj2);
            case 14:
                RiskMetricsScreen riskMetricsScreen = (RiskMetricsScreen) obj3;
                RiskMetricsScreenContract$InputData riskMetricsScreenContract$InputData = (RiskMetricsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = RiskMetricsScreen.f85193a0;
                qji.b bVarQ24 = riskMetricsScreen.Q2();
                mnc.b bVar = bVarQ24 instanceof mnc.b ? (mnc.b) bVarQ24 : null;
                if (bVar == null) {
                    phm.a aVar9 = (phm.a) ue0.e.j(riskMetricsScreen.m2()).a().get(dmc.r.class);
                    aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                    if (aVar == null) {
                        throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                    }
                    bVar = (mnc.b) aVar.b();
                }
                return (z) ((mnc.a) bVar.b().S(riskMetricsScreen)).j0(riskMetricsScreenContract$InputData).mo3800build();
            case 15:
                PendingTransactionRecallControllerContract$InputData pendingTransactionRecallControllerContract$InputData = (PendingTransactionRecallControllerContract$InputData) obj2;
                KProperty[] kPropertyArr9 = PendingTransactionRecallController.R;
                phm.a aVar10 = (phm.a) ue0.e.j(((PendingTransactionRecallController) obj3).m2()).a().get(gnf.a.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new gnf.c(((gnf.a) aVar.b()).f, pendingTransactionRecallControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", gnf.a.class, " is not found"));
            case 16:
                EditCycleScreenContract$InputData editCycleScreenContract$InputData = (EditCycleScreenContract$InputData) obj2;
                phm.a aVar11 = (phm.a) ue0.e.j(((EditCycleScreen) obj3).m2()).a().get(ppd.n.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new b0(((ppd.n) aVar.b()).L0, editCycleScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
            case 17:
                pp5.d dVar = (pp5.d) obj2;
                if (!((Ref$BooleanRef) obj3).f186407a) {
                    dVar.invoke(null);
                }
                return Unit.f186387a;
            case 18:
                ManagePolicyScreen managePolicyScreen = (ManagePolicyScreen) obj3;
                KProperty[] kPropertyArr10 = ManagePolicyScreen.c0;
                qji.b bVarQ25 = managePolicyScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.manage.di.ManagePolicyScreenInjector");
                ql7.o oVar = (ql7.o) bVarQ25;
                return new o0(oVar.f247408b, oVar.f247409c, managePolicyScreen, (ManagePolicyScreenContract$InputData) obj2);
            case 19:
                ReasonForTransferInputData reasonForTransferInputData = (ReasonForTransferInputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(((ReasonForTransferFlow) obj3).m2()).a().get(wof.a.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new lpf.d(((i) ((y) aVar.b())).o, reasonForTransferInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
            case 20:
                return ((p) obj3).e.c(f0.Companion.serializer(), ((s0) obj2).f188575b);
            case 21:
                return ((p) obj3).e.c(z2.Companion.serializer(), ((x0) obj2).f188606b);
            case 22:
                return ((p) obj3).e.c(kr.o.INSTANCE.serializer(), ((q0) obj2).f188560b);
            case 23:
                return ((p) obj3).e.c(kr.o0.Companion.serializer(), ((t0) obj2).f188582b);
            case 24:
                CreditCardChooseInstalmentsScreen creditCardChooseInstalmentsScreen = (CreditCardChooseInstalmentsScreen) obj3;
                CreditCardChooseInstalmentsScreenContract$InputData creditCardChooseInstalmentsScreenContract$InputData = (CreditCardChooseInstalmentsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = CreditCardChooseInstalmentsScreen.U;
                qji.b bVarU24 = creditCardChooseInstalmentsScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.di.CreditCardChooseInstalmentsScreenInjector");
                e4 e4Var = (e4) ((ms4.a) bVarU24).b().mo3808a(creditCardChooseInstalmentsScreen);
                switch (e4Var.f176062a) {
                    case 0:
                        e4Var.d = creditCardChooseInstalmentsScreenContract$InputData;
                        break;
                    default:
                        e4Var.d = creditCardChooseInstalmentsScreenContract$InputData;
                        break;
                }
                return (f4) e4Var.mo3783build();
            case 25:
                GroupChatFlowContract$InputData groupChatFlowContract$InputData = (GroupChatFlowContract$InputData) obj2;
                phm.a aVar13 = (phm.a) ue0.e.j(((GroupChatFlow) obj3).m2()).a().get(l.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new kr9.a(((l) aVar.b()).F, groupChatFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 26:
                MultiTargetFanChartView multiTargetFanChartView = (MultiTargetFanChartView) obj3;
                MultiTargetFanChartView.Companion companion = MultiTargetFanChartView.INSTANCE;
                v vVar = new v((Context) obj2, u.k(multiTargetFanChartView).b0());
                ihm.f subject = multiTargetFanChartView.pointSelectionPublishSubject;
                Intrinsics.checkNotNullParameter(subject, "subject");
                vVar.z = subject;
                return zhm.u.c(vVar);
            case 27:
                PaymentsGroupsCreateNavigationFlow$InputData paymentsGroupsCreateNavigationFlow$InputData = (PaymentsGroupsCreateNavigationFlow$InputData) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(((PaymentsGroupsCreateFlow) obj3).m2()).a().get(l.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new kr9.k(((l) aVar.b()).F, paymentsGroupsCreateNavigationFlow$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 28:
                TravelRemoveWidgetFlowContract$InputData travelRemoveWidgetFlowContract$InputData = (TravelRemoveWidgetFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((TravelRemoveWidgetFlow) obj3).m2()).a().get(ppd.n.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new y0(((ppd.n) aVar.b()).L0, travelRemoveWidgetFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
            default:
                yki.b bVar2 = (yki.b) obj3;
                com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.a aVar16 = (com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.a) obj2;
                if (bVar2.d() == null) {
                    aVar16.getClass();
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    bVar2.n();
                }
                return Unit.f186387a;
        }
    }
}
