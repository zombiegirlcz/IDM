package vge;

import aw0.n6;
import com.revolut.biometric_verification.common.impl.selfie.intro.BiometricVerificationSelfieIntroScreen;
import com.revolut.chat.domain.model.draft.SelectedUploadDraft;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.alipay.impl.ui.qr.AlipayPlusQrFlow;
import com.revolut.feature.credit.card.impl.ui.revpoints.CreditCardRevPointsMigrationBottomDialogScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreen;
import com.revolut.feature.insurance_home.impl.data.model.FooterButton;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitScreen;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gif.TransferPersonalisationGifSelector;
import com.revolut.feature.retail.savings.impl.creation.presentation.info.tiered_limits.TieredLimitsInfoScreen;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorController;
import com.revolut.feature.settings.preview.displayAmount.DisplayAmountToggleController;
import com.revolut.feature.tax_residency.impl.exemption.ui.main.TaxExemptionScreen;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreen;
import com.revolut.feature.widgets.impl.ui.screen.catalgoue.WidgetCatalogueScreen;
import com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.BalanceBreakdownBottomSheetController;
import com.revolut.otp.input.flow.push.bottom_dialog.OtpPushBottomSheet;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.AirportSavedLoungesScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreen;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class z1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z1((c2) this.v, continuation, 0);
            case 1:
                return new z1((com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.v, continuation, 1);
            case 2:
                return new z1((vj1.b) this.v, continuation, 2);
            case 3:
                return new z1((com.revolut.feature.product.onboarding.flow.a) this.v, continuation, 3);
            case 4:
                return new z1((AlipayPlusQrFlow) this.v, continuation, 4);
            case 5:
                return new z1((CFACClaimsListScreen) this.v, continuation, 5);
            case 6:
                return new z1((InvestDocumentsDetailsScreen) this.v, continuation, 6);
            case 7:
                return new z1((TieredLimitsInfoScreen) this.v, continuation, 7);
            case 8:
                return new z1((TaxExemptionScreen) this.v, continuation, 8);
            case 9:
                return new z1((OtpPushBottomSheet) this.v, continuation, 9);
            case 10:
                return new z1((okl.d) this.v, continuation, 10);
            case 11:
                return new z1((JuniorSecurityAndPrivacyController) this.v, continuation, 11);
            case 12:
                return new z1((BiometricVerificationSelfieIntroScreen) this.v, continuation, 12);
            case 13:
                return new z1((DeviceDeliveryScreen) this.v, continuation, 13);
            case 14:
                return new z1((CfdClosePositionsSelectorController) this.v, continuation, 14);
            case 15:
                return new z1((WidgetCatalogueScreen) this.v, continuation, 15);
            case 16:
                return new z1((CreditCardRevPointsMigrationBottomDialogScreen) this.v, continuation, 16);
            case 17:
                return new z1((vu5.h) this.v, continuation, 17);
            case 18:
                return new z1((com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a) this.v, continuation, 18);
            case 19:
                return new z1((InsuranceProductSummaryScreen) this.v, continuation, 19);
            case 20:
                return new z1((PaymentProfileFlow) this.v, continuation, 20);
            case 21:
                return new z1((vyb.b) this.v, continuation, 21);
            case 22:
                return new z1((BalanceBreakdownBottomSheetController) this.v, continuation, 22);
            case 23:
                return new z1((AirportSavedLoungesScreen) this.v, continuation, 23);
            case 24:
                return new z1((NationalitiesScreen) this.v, continuation, 24);
            case 25:
                return new z1((RecurringPaymentsManageSplitScreen) this.v, continuation, 25);
            case 26:
                return new z1((x30.b) this.v, continuation, 26);
            case 27:
                return new z1((TransferPersonalisationGifSelector) this.v, continuation, 27);
            case 28:
                return new z1((DisplayAmountToggleController) this.v, continuation, 28);
            default:
                return new z1((com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((z1) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((z1) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((z1) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((z1) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((z1) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((z1) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((z1) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((z1) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((z1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((z1) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z1) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v53, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((c2) obj3).d();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar3 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) obj3;
                aVar3.H2(aVar3.J, new vdl.a(aVar3, 27));
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uj1.d dVar = (uj1.d) j6.a.k(uj1.d.class, ((vj1.b) obj3).f289631c, "ADVISED_COMPONENTS_KEY");
                if (dVar != null) {
                }
                break;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.product.onboarding.flow.a) obj3).C2(vja.l.f289673a);
                break;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.alipay.impl.ui.qr.a) ((AlipayPlusQrFlow) obj3).e3()).I2(vk1.b.f289846a);
                break;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CFACClaimsListScreen) obj3).m2().onBackPressed();
                break;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((InvestDocumentsDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TieredLimitsInfoScreen) obj3).m2().onBackPressed();
                break;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TaxExemptionScreen) obj3).m2().onBackPressed();
                break;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vni.f fVar = (vni.f) ((OtpPushBottomSheet) obj3).T.getValue();
                fVar.C2(new vni.c(((vni.b) ((vkm.j2) fVar.f290818q.f22677a).getValue()).f290812a));
                break;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((okl.d) obj3).invoke(vnl.j.f290826a);
                break;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((JuniorSecurityAndPrivacyController) obj3).m2().onBackPressed();
                break;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BiometricVerificationSelfieIntroScreen) obj3).m2().onBackPressed();
                break;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((DeviceDeliveryScreen) obj3).m2().onBackPressed();
                break;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vrb.l) ((vrb.b) ((CfdClosePositionsSelectorController) obj3).T.getValue())).B2();
                break;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((WidgetCatalogueScreen) obj3).m2().onBackPressed();
                break;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vu4.e) ((CreditCardRevPointsMigrationBottomDialogScreen) obj3).P.getValue()).B2();
                break;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((vu5.h) obj3).f292263s);
                break;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vw7.e eVar = (vw7.e) ((vw7.c) ((InsuranceProductSummaryScreen) obj3).O.getValue());
                FooterButton footerButton = eVar.o.f76223a.d.f76171a;
                FooterButton.Action action = footerButton != null ? footerButton.f76175b : null;
                if (action instanceof FooterButton.Action.PlanUpgrade) {
                    eVar.C1(zh9.u0.c(new PricingPlanFeatureConfig.DashboardByPlans(null, zhm.u.c(((FooterButton.Action.PlanUpgrade) action).f76177b), null, null, false, xfa.b.INSURANCE_HOME, 189)));
                } else {
                    eVar.B2();
                }
                break;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PaymentProfileFlow) obj3).m2().onBackPressed();
                break;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vyb.b) obj3).C2(aii.q.f5292a);
                break;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BalanceBreakdownBottomSheetController) obj3).T.C2(vyh.b.f293325a);
                break;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AirportSavedLoungesScreen) obj3).m2().onBackPressed();
                break;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((NationalitiesScreen) obj3).m2().onBackPressed();
                break;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RecurringPaymentsManageSplitScreen) obj3).m2().onBackPressed();
                break;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x30.b bVar = (x30.b) obj3;
                List list = bVar.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (new File(((SelectedUploadDraft) obj4).f51101a).exists()) {
                        arrayList.add(obj4);
                    }
                }
                x30.c cVar = bVar.e;
                break;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                TransferPersonalisationGifSelector transferPersonalisationGifSelector = (TransferPersonalisationGifSelector) obj3;
                KProperty[] kPropertyArr = TransferPersonalisationGifSelector.V;
                InputText gifSelectorSearchInput = transferPersonalisationGifSelector.d3().f;
                Intrinsics.checkNotNullExpressionValue(gifSelectorSearchInput, "gifSelectorSearchInput");
                gifSelectorSearchInput.setVisibility(0);
                UIKitImageView gifSelectorCloseSearchButton = transferPersonalisationGifSelector.d3().f191724c;
                Intrinsics.checkNotNullExpressionValue(gifSelectorCloseSearchButton, "gifSelectorCloseSearchButton");
                gifSelectorCloseSearchButton.setVisibility(0);
                transferPersonalisationGifSelector.d3().f.C0(true);
                w2a.s sVarE3 = transferPersonalisationGifSelector.e3();
                sVarE3.H2(sVarE3.f294007r, new w29.a(2));
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((DisplayAmountToggleController) obj3).m2().onBackPressed();
                break;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a) obj3).I2();
                break;
        }
        return Unit.f186387a;
    }
}
