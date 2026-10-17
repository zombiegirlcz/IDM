package oa2;

import afj.u0;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.p2;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreenContract$InputData;
import com.revolut.feature.apm.payid.impl.screen.createpayid.aliases.AliasesScreen;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreen;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreenContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlow;
import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlowContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesController;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesScreenContract$InputData;
import com.revolut.feature.crypto.onboarding.impl.ui.eligibility.CryptoOnboardingWorkflowFlow;
import com.revolut.feature.donations.impl.ui.kompot.flow.recurring.CharityRecurringDonationFlow;
import com.revolut.feature.donations.impl.ui.kompot.flow.recurring.CharityRecurringDonationFlowContract$InputData;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.CreateSecretPhraseFlow;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.CreateSecretPhraseFlowContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreenContract$InputData;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutContract$InputData;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutController;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreen;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlowContract$FlowInput;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.with_result_navigation.AddMoneyWithResultNavigationFlow;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreenContract$InputData;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.models.SimBindingEvidence;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.ConnectedClientDisconnectBottomSheet;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.ConnectedClientDisconnectBottomSheetContract$InputData;
import dw3.j9;
import dw3.u6;
import g9g.t;
import java.util.Set;
import jm4.a3;
import jm4.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kr9.u;
import ld1.w;
import mb3.p;
import mb3.r;
import nh2.o;
import nh2.y;
import nk7.n;
import ojk.q;
import okl.l0;
import ppd.c1;
import ppd.d1;
import qgk.i0;
import qgk.n1;
import ql7.e1;
import ql7.k0;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f223503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f223504c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f223502a = i;
        this.f223503b = obj2;
        this.f223504c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r3v51 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f223502a;
        Object obj2 = this.f223504c;
        Object obj3 = this.f223503b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AliasesScreen.Q;
                qji.b bVarU2 = ((AliasesScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.createpayid.aliases.di.AliasesScreenInjector");
                ea2.f fVar = (ea2.f) bVarU2;
                return new ea2.b(fVar.f124065a, fVar.f124066b, (f) obj2);
            case 1:
                CharityRecurringDonationFlowContract$InputData charityRecurringDonationFlowContract$InputData = (CharityRecurringDonationFlowContract$InputData) obj2;
                phm.a aVar = (phm.a) ue0.e.j(((CharityRecurringDonationFlow) obj3).m2()).a().get(pa6.m.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( != 0) {
                    return new pa6.e(((pa6.m) b()).G, charityRecurringDonationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
            case 2:
                CreateSecretPhraseFlowContract$InputData createSecretPhraseFlowContract$InputData = (CreateSecretPhraseFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((CreateSecretPhraseFlow) obj3).m2()).a().get(ta7.d.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 != null) {
                    return new ta7.c(((ta7.d) aVar3.b()).f269122g, createSecretPhraseFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ta7.d.class, " is not found"));
            case 3:
                TravelHotelsCampaignsHubScreenContract$InputData travelHotelsCampaignsHubScreenContract$InputData = (TravelHotelsCampaignsHubScreenContract$InputData) obj2;
                TravelHotelsCampaignsHubScreen.Companion aVar4 = TravelHotelsCampaignsHubScreen.INSTANCE;
                qji.b bVarU22 = ((TravelHotelsCampaignsHubScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.di.TravelHotelsCampaignsHubScreenInjector");
                t tVar = (t) bVarU22;
                g9g.d dVar = tVar.f141813b;
                t tVar2 = tVar.f141814c;
                travelHotelsCampaignsHubScreenContract$InputData.getClass();
                return new g9g.j(dVar, tVar2, travelHotelsCampaignsHubScreenContract$InputData);
            case 4:
                CashTopUpLocationsMapScreenContract$InputData cashTopUpLocationsMapScreenContract$InputData = (CashTopUpLocationsMapScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = CashTopUpLocationsMapScreen.f65677a0;
                phm.a aVar5 = (phm.a) ue0.e.j(((CashTopUpLocationsMapScreen) obj3).m2()).a().get(bb3.a.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 != null) {
                    return new r(((p) aVar6.b()).i, cashTopUpLocationsMapScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
            case 5:
                PromotedMerchantCheckoutContract$InputData promotedMerchantCheckoutContract$InputData = (PromotedMerchantCheckoutContract$InputData) obj2;
                int i2 = PromotedMerchantCheckoutController.U;
                phm.a aVar7 = (phm.a) ue0.e.j(((PromotedMerchantCheckoutController) obj3).m2()).a().get(jcc.e.class);
                b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar8 != null) {
                    return new jcc.a(((jcc.e) aVar8.b()).f172773j, promotedMerchantCheckoutContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", jcc.e.class, " is not found"));
            case 6:
                CashbackProductScreen cashbackProductScreen = (CashbackProductScreen) obj3;
                KProperty[] kPropertyArr3 = CashbackProductScreen.i0;
                qji.b bVarQ2 = cashbackProductScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.di.CashbackProductScreenInjector");
                yc3.h hVar = (yc3.h) bVarQ2;
                return new yc3.c(hVar.f312486b, hVar.f312487c, cashbackProductScreen, (CashbackProductScreenContract$InputData) obj2);
            case 7:
                KProperty[] kPropertyArr4 = EditCustomProductScreen.S;
                qji.b bVarU23 = ((EditCustomProductScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.di.EditCustomCartItemScreenInjector");
                w wVar = (w) bVarU23;
                return new ld1.i(wVar.f194006a, wVar.f194007b, (EditCustomProductScreenContract$InputData) obj2);
            case 8:
                ConfirmationScreenContract$InputData confirmationScreenContract$InputData = (ConfirmationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = ConfirmationScreen.S;
                qji.b bVarU24 = ((ConfirmationScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.di.ConfirmationScreenInjector");
                if2.k kVar = (if2.k) bVarU24;
                if2.f fVar2 = kVar.f160880b;
                if2.k kVar2 = kVar.f160881c;
                confirmationScreenContract$InputData.getClass();
                return new if2.a(fVar2, kVar2, confirmationScreenContract$InputData);
            case 9:
                KProperty[] kPropertyArr6 = EsimSetupOptionsScreen.W;
                qji.b bVarU25 = ((EsimSetupOptionsScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.di.EsimSetupOptionsScreenInjector");
                afj.m mVar = (afj.m) bVarU25;
                return new u0(mVar.f4337b, mVar.f4338c, (EsimSetupOptionsScreenContract$InputData) obj2);
            case 10:
                ((oi0.b) obj3).d.k(new xg0.f((Set) obj2, xg0.d.Success));
                return Unit.f186387a;
            case 11:
                WeroRegistrationFlowContract$InputData weroRegistrationFlowContract$InputData = (WeroRegistrationFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(((WeroRegistrationFlow) obj3).m2()).a().get(nh2.h.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 != null) {
                    return new y(((o) ((nh2.h) aVar10.b())).f215326t, weroRegistrationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
            case 12:
                RequestConsentScreen requestConsentScreen = (RequestConsentScreen) obj3;
                KProperty[] kPropertyArr7 = RequestConsentScreen.f68455b0;
                qji.b bVarQ22 = requestConsentScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.di.RequestConsentScreenComponentInjector");
                u6 u6Var = (u6) bVarQ22;
                return new j9(u6Var.f119925c, u6Var.d, requestConsentScreen, (RequestConsentScreenContract$InputData) obj2);
            case 13:
                oi5.c cVar = (oi5.c) obj2;
                phm.a aVar11 = (phm.a) ue0.e.j(((CryptoOnboardingWorkflowFlow) obj3).m2()).a().get(ei5.d.class);
                b60.a aVar12 = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar12 != null) {
                    return new ei5.e(((ei5.d) aVar12.b()).f126430n, cVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", ei5.d.class, " is not found"));
            case 14:
                ((hli.c) ((hli.a) obj3)).b();
                oii.a aVar13 = (oii.a) ((kye.e) obj2).f190729b;
                if (aVar13 != null) {
                    aVar13.g();
                }
                return Unit.f186387a;
            case 15:
                ShopsAdsPersonalizedOffersOptInScreenContract$InputData shopsAdsPersonalizedOffersOptInScreenContract$InputData = (ShopsAdsPersonalizedOffersOptInScreenContract$InputData) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(((ShopsAdsPersonalizedOffersOptInScreen) obj3).m2()).a().get(did.d.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new did.c(((did.d) aVar15.b()).f115008y, shopsAdsPersonalizedOffersOptInScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
            case 16:
                q qVar = (q) obj3;
                qVar.l2(new ojk.p(qVar, (String) obj2, , 0), new yi5.b(26));
                return Unit.f186387a;
            case 17:
                PricingPlanBEDrivenScreen pricingPlanBEDrivenScreen = (PricingPlanBEDrivenScreen) obj3;
                PricingPlanBEDrivenScreenContract$InputData pricingPlanBEDrivenScreenContract$InputData = (PricingPlanBEDrivenScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = PricingPlanBEDrivenScreen.j0;
                phm.a aVar16 = (phm.a) ue0.e.j(pricingPlanBEDrivenScreen.m2()).a().get(i0.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new n1(((i0) aVar17.b()).X, pricingPlanBEDrivenScreenContract$InputData, pricingPlanBEDrivenScreen, pricingPlanBEDrivenScreen);
                }
                throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
            case 18:
                CFACInsuranceDocumentsScreenContract$InputData cFACInsuranceDocumentsScreenContract$InputData = (CFACInsuranceDocumentsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = CFACInsuranceDocumentsScreen.U;
                qji.b bVarQ23 = ((CFACInsuranceDocumentsScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.documents.di.CFACInsuranceDocumentsScreenInjector");
                nk7.r rVar = (nk7.r) bVarQ23;
                nk7.q qVar2 = rVar.f216721b;
                nk7.r rVar2 = rVar.f216722c;
                cFACInsuranceDocumentsScreenContract$InputData.getClass();
                return new n(qVar2, rVar2, cFACInsuranceDocumentsScreenContract$InputData);
            case 19:
                com.revolut.sso.impl.ui.auth.n nVar = (com.revolut.sso.impl.ui.auth.n) obj3;
                String str = (String) obj2;
                qki.d dVar2 = nVar.m0;
                if (((j2) dVar2.f22677a).getValue() instanceof AuthenticationFlowContract$State) {
                    nVar.H2(dVar2, new l0(nVar, 3));
                    nVar.h3(new SimBindingEvidence(str, "-1"));
                    return Unit.f186387a;
                }
                AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) nVar.l0.d();
                String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
                p0 p0Var = o0.f186429a;
                throw new IllegalStateException(m72.b.q(okl.m.p((j2) dVar2.f22677a, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
            case 20:
                okl.f fVar3 = (okl.f) obj2;
                if (!(((j2) ((com.revolut.sso.impl.ui.auth.n) obj3).m0.f22677a).getValue() instanceof AuthenticationFlowContract$State.OperationBoundAuthentication)) {
                    hx7.e.n(new RevolutSSOException.IllegalState("Bio signature enrolment is expected to be done only in reauthentication"));
                }
                fVar3.invoke();
                return Unit.f186387a;
            case 21:
                ProofOfDrivingNumberFlowContract$InputData proofOfDrivingNumberFlowContract$InputData = (ProofOfDrivingNumberFlowContract$InputData) obj2;
                phm.a aVar18 = (phm.a) ue0.e.j(((ProofOfDrivingNumberFlow) obj3).m2()).a().get(fl7.a.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new e1(((k0) aVar19.b()).f247359n, proofOfDrivingNumberFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
            case 22:
                TripsListController.Companion aVar20 = TripsListController.INSTANCE;
                qji.b bVarU26 = ((TripsListController) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.di.TripsListScreenInjector");
                c1 c1Var = (c1) bVarU26;
                return new d1(c1Var.f238386b, c1Var.f238387c, (TripsListContract$InputData) obj2);
            case 23:
                op0.i iVar = (op0.i) obj2;
                if (((AvatarWidgetDelegate.Model) obj3).i != null && !iVar.f227299r.isAnimating()) {
                    iVar.f227299r.playAnimation();
                }
                return Unit.f186387a;
            case 24:
                ErrorWidgetDelegate.Model model = (ErrorWidgetDelegate.Model) obj2;
                ((ErrorWidgetDelegate) obj3).r(model, new q0(model.f55100b, model));
                return Unit.f186387a;
            case 25:
                PaymentLinkWidgetDelegate.Model model2 = (PaymentLinkWidgetDelegate.Model) obj2;
                ((PaymentLinkWidgetDelegate) obj3).r(model2, new p2(model2.f55201b, model2));
                return Unit.f186387a;
            case 26:
                int i3 = ConnectedClientDisconnectBottomSheet.T;
                qji.b bVarU27 = ((ConnectedClientDisconnectBottomSheet) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.di.ConnectedClientDisconnectBottomSheetInjector");
                mjl.f fVar4 = (mjl.f) bVarU27;
                return new mjl.g(fVar4.f206080c, fVar4.d, (ConnectedClientDisconnectBottomSheetContract$InputData) obj2);
            case 27:
                AddMoneyFlowContract$FlowInput addMoneyFlowContract$FlowInput = (AddMoneyFlowContract$FlowInput) obj2;
                phm.a aVar21 = (phm.a) ue0.e.j(((AddMoneyWithResultNavigationFlow) obj3).m2()).a().get(fpg.c.class);
                b60.a aVar22 = aVar21 != null ? (b60.a) aVar21.get() : null;
                if (aVar22 != null) {
                    return new wpg.e(((wpg.l) aVar22.b()).F, addMoneyFlowContract$FlowInput);
                }
                throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
            case 28:
                CreditCardDocumentsRatesScreenContract$InputData creditCardDocumentsRatesScreenContract$InputData = (CreditCardDocumentsRatesScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = CreditCardDocumentsRatesController.T;
                phm.a aVar23 = (phm.a) ue0.e.j(((CreditCardDocumentsRatesController) obj3).m2()).a().get(a3.class);
                b60.a aVar24 = aVar23 != null ? (b60.a) aVar23.get() : null;
                if (aVar24 != null) {
                    return new w0(((a3) aVar24.b()).Y, creditCardDocumentsRatesScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            default:
                GroupChatMembersScreen groupChatMembersScreen = (GroupChatMembersScreen) obj3;
                GroupChatMembersScreenContract$InputData groupChatMembersScreenContract$InputData = (GroupChatMembersScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = GroupChatMembersScreen.f79369e0;
                phm.a aVar25 = (phm.a) ue0.e.j(groupChatMembersScreen.m2()).a().get(kr9.l.class);
                b60.a aVar26 = aVar25 != null ? (b60.a) aVar25.get() : null;
                if (aVar26 != null) {
                    return new u(((kr9.l) aVar26.b()).F, groupChatMembersScreen, groupChatMembersScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kr9.l.class, " is not found"));
        }
    }
}
