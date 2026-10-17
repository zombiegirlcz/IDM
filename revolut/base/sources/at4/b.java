package at4;

import android.content.Context;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.video.Recording;
import au.f0;
import au0.v2;
import aw.c0;
import aw.j0;
import b4b.p;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreenContract$InputData;
import com.revolut.core.backend_flow.impl.ui.card_photo.BackendFlowCardPhotoFlow;
import com.revolut.core.backend_flow.impl.ui.card_photo.BackendFlowCardPhotoFlowContract$InputData;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.CardPersonalisationEmojiPickerController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.CardPersonalisationEmojiPickerControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsControllerContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.settings.flow.CreditCardSettingsFlow;
import com.revolut.feature.credit.card.impl.ui.settings.flow.CreditCardSettingsFlowContract$InputData;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreenContract$InputData;
import com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlow;
import com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.update_name_screen.UpdateNameScreen;
import com.revolut.feature.junior.isa.impl.ui.update_name_screen.UpdateNameScreenContract$InputData;
import com.revolut.feature.paynow.impl.screens.amount.PayNowAmountScreen;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeBreakdownControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.breakdown.RevPointsSpareChangeBreakdownController;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardController;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardControllerContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.annual_fee.screen.AnnualFeeScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreenContract$InputData;
import com.revolut.feature.trading.impl.ui.holdings.information.section.info.HoldingsInformationSectionInfoController;
import com.revolut.feature.trading.impl.ui.holdings.information.section.info.HoldingsInformationSectionInfoControllerContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.discount.TravelExperiencesPointsDiscountInfoScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.discount.TravelExperiencesPointsDiscountInfoScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.AsftFlightDatePickerScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.AsftFlightDatePickerScreenContract$InputData;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlowContract$ModalStep;
import dw3.g8;
import dw3.t4;
import eyd.b0;
import java.util.concurrent.atomic.AtomicReference;
import jm4.a2;
import jm4.a3;
import jm4.j2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ku5.l;
import lti.k;
import lu7.f;
import lu7.g;
import lu7.v;
import m2b.m;
import mx0.tb;
import oki.h;
import qve.z;
import ue0.e;
import vtc.o;
import vtc.u;
import x13.q;
import x13.t;
import x98.r;
import z0g.n;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8997c;

    public /* synthetic */ b(CreditCardRepayBoletoFlowContract$Step creditCardRepayBoletoFlowContract$Step, com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.a aVar, yki.b bVar) {
        this.f8995a = 3;
        this.f8996b = creditCardRepayBoletoFlowContract$Step;
        this.f8997c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f8995a;
        Object obj2 = this.f8997c;
        Object obj3 = this.f8996b;
        switch (i) {
            case 0:
                CreditCardRepayFutureInstalmentsFlowContract$InputData creditCardRepayFutureInstalmentsFlowContract$InputData = (CreditCardRepayFutureInstalmentsFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) e.j(((CreditCardRepayFutureInstalmentsFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new a2(((a3) aVar.b()).Y, creditCardRepayFutureInstalmentsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 1:
                com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a aVar3 = (com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a) obj3;
                f0 f0Var = (f0) obj2;
                yt.a aVar4 = aVar3.f50633p;
                BiometricVerificationNfcV2ConsolidatedScreenContract$InputData biometricVerificationNfcV2ConsolidatedScreenContract$InputData = aVar3.o;
                return mra.d.b(aVar3, new au.d(aVar4, true, biometricVerificationNfcV2ConsolidatedScreenContract$InputData.f50628a, biometricVerificationNfcV2ConsolidatedScreenContract$InputData.e), f0Var, null, false, 12);
            case 2:
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) obj3;
                screenContentRecyclerView.setNavbarMaskState(((v2) obj2).getNavbarMaskState());
                screenContentRecyclerView.f98529g.a();
                return Unit.f186387a;
            case 3:
                yki.b bVar = (yki.b) obj2;
                if (((CreditCardRepayBoletoFlowContract$Step.BoletoDetails) ((CreditCardRepayBoletoFlowContract$Step) obj3)).f69557c) {
                    h.D2(bVar);
                }
                return Unit.f186387a;
            case 4:
                CreditCardSettingsFlowContract$InputData creditCardSettingsFlowContract$InputData = (CreditCardSettingsFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) e.j(((CreditCardSettingsFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new j2(((a3) aVar.b()).Y, creditCardSettingsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 5:
                KProperty[] kPropertyArr = FiltersByTypeScreen.c0;
                qji.b bVarQ2 = ((FiltersByTypeScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.di.FiltersByTypeScreenInjector");
                l lVar = (l) bVarQ2;
                return new ku5.h(lVar.f189719b, lVar.f189720c, (FiltersByTypeScreenContract$InputData) obj2);
            case 6:
                KProperty[] kPropertyArr2 = CoverageListScreen.f76084d0;
                qji.b bVarQ22 = ((CoverageListScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.di.CoverageListScreenInjector");
                f fVar = (f) bVarQ22;
                return new g(fVar.f200092b, fVar.f200093c, (CoverageListScreenContract$InputData) obj2);
            case 7:
                KProperty[] kPropertyArr3 = LostCardController.Q;
                qji.b bVarU2 = ((LostCardController) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.lost_card.di.LostCardControllerInjector");
                u uVar = (u) bVarU2;
                return new o(uVar.f292082b, uVar.f292083c, (LostCardControllerContract$InputData) obj2);
            case 8:
                AsftFlightDatePickerScreen asftFlightDatePickerScreen = (AsftFlightDatePickerScreen) obj3;
                KProperty[] kPropertyArr4 = AsftFlightDatePickerScreen.Q;
                qji.b bVarU22 = asftFlightDatePickerScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.di.AsftFlightDatePickerScreenInjector");
                k kVar = (k) bVarU22;
                return new lti.e(kVar.f199922a, kVar.f199923b, asftFlightDatePickerScreen, (AsftFlightDatePickerScreenContract$InputData) obj2);
            case 9:
                aw.u uVar2 = (aw.u) obj2;
                ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
                yw.e resolution = ((yw.h) obj3).f();
                Intrinsics.checkNotNullParameter(builder, "<this>");
                Intrinsics.checkNotNullParameter(resolution, "resolution");
                ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionStrategy(new ResolutionStrategy(yv.d.b(resolution), 1)).setAspectRatioStrategy(AspectRatioStrategy.RATIO_16_9_FALLBACK_AUTO_STRATEGY).build();
                Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "build(...)");
                ImageAnalysis.Builder resolutionSelector = builder.setResolutionSelector(resolutionSelectorBuild);
                Intrinsics.checkNotNullExpressionValue(resolutionSelector, "setResolutionSelector(...)");
                ImageAnalysis imageAnalysisBuild = resolutionSelector.setBackpressureStrategy(0).setOutputImageRotationEnabled(true).setOutputImageFormat(1).build();
                imageAnalysisBuild.setAnalyzer(uVar2.f10211b, uVar2.f10210a);
                return imageAnalysisBuild;
            case 10:
                j0 j0Var = (j0) obj2;
                return new cw.a((Context) obj3, j0Var.f10171a, j0Var.f10173c, new aqe.a(j0Var, 20));
            case 11:
                c0 c0Var = (c0) obj3;
                j0 j0Var2 = (j0) obj2;
                c0Var.d = true;
                Recording recording = c0Var.f10145c;
                if (recording != null) {
                    recording.stop();
                }
                c0Var.f10145c = null;
                AtomicReference atomicReference = j0Var2.f;
                while (true) {
                    if (atomicReference.compareAndSet(c0Var, null)) {
                        c0Var.a();
                    } else if (atomicReference.get() != c0Var) {
                    }
                }
                return Unit.f186387a;
            case 12:
                KProperty[] kPropertyArr5 = PlanComparisonScreen.T;
                qji.b bVarQ23 = ((PlanComparisonScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.di.PlanComparisonScreenInjector");
                lu7.u uVar3 = (lu7.u) bVarQ23;
                return new v(uVar3.f200179b, uVar3.f200180c, (PlanComparisonScreenContract$InputData) obj2);
            case 13:
                tb tbVar = (tb) obj3;
                tbVar.d(((ActionFooterView) obj2).getHeight() - tbVar.b());
                return Unit.f186387a;
            case 14:
                IndiaStoredMethodDetailsScreenContract$InputData indiaStoredMethodDetailsScreenContract$InputData = (IndiaStoredMethodDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = IndiaStoredMethodDetailsScreen.P;
                phm.a aVar6 = (phm.a) e.j(((IndiaStoredMethodDetailsScreen) obj3).m2()).a().get(z.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new qve.h(((qve.k) aVar.b()).X, indiaStoredMethodDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
            case 15:
                AnnualFeeScreen annualFeeScreen = (AnnualFeeScreen) obj3;
                azd.e eVar = (azd.e) obj2;
                KProperty[] kPropertyArr7 = AnnualFeeScreen.P;
                phm.a aVar7 = (phm.a) e.j(annualFeeScreen.m2()).a().get(b0.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                }
                Object objB = aVar.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.annual_fee.screen.di.AnnualFeeScreenInjector");
                return new eyd.g(((b0) objB).o, annualFeeScreen, eVar);
            case 16:
                RevPointsSpareChangeBreakdownControllerApi$InputData revPointsSpareChangeBreakdownControllerApi$InputData = (RevPointsSpareChangeBreakdownControllerApi$InputData) obj2;
                int i2 = RevPointsSpareChangeBreakdownController.V;
                phm.a aVar8 = (phm.a) e.j(((RevPointsSpareChangeBreakdownController) obj3).m2()).a().get(w1c.a.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                }
                w1c.a aVar9 = ((w1c.a) aVar.b()).f293821h;
                revPointsSpareChangeBreakdownControllerApi$InputData.getClass();
                return new w1c.b(aVar9, revPointsSpareChangeBreakdownControllerApi$InputData);
            case 17:
                com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.a aVar10 = (com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.a) obj3;
                if (Intrinsics.f(aVar10.f99523p, ((SavingsDisclaimersFlowContract$ModalStep) obj2).getClass().getName())) {
                    h.D2(aVar10.f99524q);
                }
                return Unit.f186387a;
            case 18:
                int i3 = CardPersonalisationEmojiPickerController.V;
                qji.b bVarU23 = ((CardPersonalisationEmojiPickerController) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.di.CardPersonalisationEmojiPickerControllerInjector");
                q qVar = (q) bVarU23;
                return new t(qVar.f302174c, qVar.d, (CardPersonalisationEmojiPickerControllerContract$InputData) obj2);
            case 19:
                TravelExperiencesPointsDiscountInfoScreenContract$InputData travelExperiencesPointsDiscountInfoScreenContract$InputData = (TravelExperiencesPointsDiscountInfoScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = TravelExperiencesPointsDiscountInfoScreen.P;
                phm.a aVar11 = (phm.a) e.j(((TravelExperiencesPointsDiscountInfoScreen) obj3).m2()).a().get(z0g.b.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new n(((z0g.b) aVar.b()).B, travelExperiencesPointsDiscountInfoScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", z0g.b.class, " is not found"));
            case 20:
                CfdOrderFormController cfdOrderFormController = (CfdOrderFormController) obj3;
                KProperty[] kPropertyArr9 = CfdOrderFormController.X;
                qji.b bVarU24 = cfdOrderFormController.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.order.v2.di.CfdOrderFormControllerComponent.Injector");
                m mVar = (m) bVarU24;
                m2b.v vVar = mVar.f201852b;
                m mVar2 = mVar.f201853c;
                zjh.c cVar = cfdOrderFormController.T;
                cVar.getClass();
                return new m2b.n(vVar, mVar2, cfdOrderFormController, (p) obj2, cVar);
            case 21:
                KProperty[] kPropertyArr10 = HoldingsInformationSectionInfoController.Q;
                qji.b bVarU25 = ((HoldingsInformationSectionInfoController) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.trading.impl.ui.holdings.information.section.info.di.HoldingsInformationSectionInfoControllerInjector");
                c4f.f fVar2 = (c4f.f) bVarU25;
                return new c4f.g(fVar2.f21210a, fVar2.f21211b, (HoldingsInformationSectionInfoControllerContract$InputData) obj2);
            case 22:
                b7a.e eVar2 = (b7a.e) obj2;
                PayNowAmountScreen.a aVar12 = PayNowAmountScreen.Companion;
                phm.a aVar13 = (phm.a) e.j(((PayNowAmountScreen) obj3).m2()).a().get(t6a.b.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new t6a.a(((t6a.b) aVar.b()).e, eVar2);
                }
                throw new IllegalStateException(a0.d.q("Api ", t6a.b.class, " is not found"));
            case 23:
                FaqArticleScreen faqArticleScreen = (FaqArticleScreen) obj3;
                KProperty[] kPropertyArr11 = FaqArticleScreen.m0;
                qji.b bVarQ24 = faqArticleScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.article.di.FaqArticleScreenInjector");
                r7d.t tVar = (r7d.t) ((v7d.a) bVarQ24);
                return new r7d.f(tVar.f252174b, tVar.f252175c, faqArticleScreen, (FaqArticleScreenContract$InputData) obj2);
            case 24:
                DebtDetailsController debtDetailsController = (DebtDetailsController) obj3;
                DebtDetailsController.a aVar14 = DebtDetailsController.Companion;
                qji.b bVarU26 = debtDetailsController.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.di.DebtV2DetailsScreenInjector");
                t4 t4Var = (t4) bVarU26;
                return new g8(t4Var.f119833c, t4Var.d, debtDetailsController, (DebtDetailsControllerContract$InputData) obj2);
            case 25:
                KProperty[] kPropertyArr12 = CardTroubleshooterScreen.f86318e0;
                qji.b bVarQ25 = ((CardTroubleshooterScreen) obj3).Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.di.CardTroubleshooterScreenInjector");
                r7d.t tVar2 = (r7d.t) ((v7d.a) bVarQ25);
                return new r7d.c(tVar2.f252174b, tVar2.f252175c, (CardTroubleshooterScreenContract$InputData) obj2);
            case 26:
                BackendFlowCardPhotoFlow backendFlowCardPhotoFlow = (BackendFlowCardPhotoFlow) obj3;
                BackendFlow backendFlow = (BackendFlow) obj2;
                phm.a aVar15 = (phm.a) e.j(backendFlowCardPhotoFlow.m2()).a().get(fa0.k.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", fa0.k.class, " is not found"));
                }
                fa0.k kVar2 = ((fa0.k) aVar.b()).f133106j;
                BackendFlowCardPhotoFlowContract$InputData backendFlowCardPhotoFlowContract$InputData = backendFlowCardPhotoFlow.K;
                backendFlowCardPhotoFlowContract$InputData.getClass();
                backendFlow.getClass();
                return new fa0.c(kVar2, backendFlowCardPhotoFlowContract$InputData, backendFlow);
            case 27:
                BiometricAuthenticationFlowContract$InputData biometricAuthenticationFlowContract$InputData = (BiometricAuthenticationFlowContract$InputData) obj2;
                phm.a aVar16 = (phm.a) e.j(((BiometricAuthenticationFlow) obj3).m2()).a().get(ta7.d.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar != null) {
                    return new ta7.b(((ta7.d) aVar.b()).f269122g, biometricAuthenticationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ta7.d.class, " is not found"));
            case 28:
                UpdateNameScreenContract$InputData updateNameScreenContract$InputData = (UpdateNameScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = UpdateNameScreen.R;
                phm.a aVar17 = (phm.a) e.j(((UpdateNameScreen) obj3).m2()).a().get(x98.o.class);
                aVar = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar != null) {
                    return new r(((x98.o) aVar.b()).f303638q, updateNameScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
            default:
                KProperty[] kPropertyArr14 = TravelHotelsAmendmentConfirmationScreen.Z;
                qji.b bVarU27 = ((TravelHotelsAmendmentConfirmationScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.di.TravelHotelsAmendmentConfirmationScreenInjector");
                g9g.g gVar = (g9g.g) bVarU27;
                return new g9g.c(gVar.f141671b, gVar.f141672c, (TravelHotelsAmendmentConfirmationScreenContract$InputData) obj2);
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f8995a = i;
        this.f8996b = obj2;
        this.f8997c = obj3;
    }
}
