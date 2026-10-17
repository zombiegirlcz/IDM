package nsh;

import androidx.content.NavBackStackEntry;
import androidx.content.NavController;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.feature.apm.multibanco.impl.ui.MultibancoFlow;
import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlow;
import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlowContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.GooglePayConfirmationFlow;
import com.revolut.feature.card_add_to_googlepay.impl.verification.GooglePayConfirmationFlowContract$InputData;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$Step;
import com.revolut.feature.card_screen.impl.kompot.subscriptions_list.SubscriptionsListController;
import com.revolut.feature.card_screen.impl.kompot.subscriptions_list.SubscriptionsListControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryController;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryControllerContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreen;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreen;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayRootFlow;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedsettlementprompt.LoanRefinancedSettlementPromptScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedsettlementprompt.LoanRefinancedSettlementPromptScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeControllerContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.receive.flow.DeFiReceiveFlow;
import com.revolut.feature.defi.remittances.impl.ui.receive.flow.DeFiReceiveFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesScreen;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$InputData;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreen;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.RevPointsExclusiveStoreProductFlow;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreen;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlowContract$InputData;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.AssetDetailsFlowContract$ResolvedDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsControllerContract$InputData;
import com.revolut.retail.feature.trading_onboarding.api.navigation.PartnerGivingConsentDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.PartnerGivingConsentFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.PartnerGivingConsentFlowContract$InputData;
import cwi.h0;
import cwi.y;
import dw3.c2;
import dw3.d2;
import dw3.t0;
import dw3.v0;
import ffk.t;
import h93.j0;
import jm4.m1;
import jm4.o1;
import jm4.o2;
import jm4.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kyk.q;
import kyk.v;
import njj.n0;
import p7c.x;
import p8a.d0;
import p8a.s;
import u45.a0;
import u45.e0;
import us6.r1;
import us6.s1;
import vtc.g0;
import vtc.u;
import z0g.f0;
import z0g.m0;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f218871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f218872c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f218870a = i;
        this.f218871b = obj2;
        this.f218872c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r6v44 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strJ0;
        Flow gVar;
        int i = this.f218870a;
        int i2 = 1;
        Object obj2 = this.f218872c;
        Object obj3 = this.f218871b;
        switch (i) {
            case 0:
                o oVar = (o) obj3;
                oVar.V2(new n0(oVar, (a) obj2, , 17), new yi5.b(29));
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr = CreditCardLimitHistoryController.S;
                qji.b bVarU2 = ((CreditCardLimitHistoryController) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.di.CreditCardLimitHistoryControllerInjector");
                o1 o1Var = (o1) bVarU2;
                return new m1(o1Var.f176227b, o1Var.f176228c, (CreditCardLimitHistoryControllerContract$InputData) obj2);
            case 2:
                com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar = (com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a) obj3;
                AssetDetailsDestination assetDetailsDestination = (AssetDetailsDestination) obj2;
                oki.h.u2(aVar, aVar.v, new AssetDetailsFlowContract$ResolvedDestination.CfdDetails(new CfdDetailsControllerContract$InputData(assetDetailsDestination.f103736a, assetDetailsDestination.f103738c, assetDetailsDestination.f)), null, 6);
                return Unit.f186387a;
            case 3:
                KProperty[] kPropertyArr2 = CreditCardStatementExportScreen.U;
                qji.b bVarU22 = ((CreditCardStatementExportScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement.export.di.CreditCardStatementExportScreenInjector");
                z0 z0Var = (z0) bVarU22;
                return new o2(z0Var.f176463b, z0Var.f176464c, (CreditCardStatementExportScreenContract$InputData) obj2);
            case 4:
                ExclusiveStoreInputData exclusiveStoreInputData = (ExclusiveStoreInputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((RevPointsExclusiveStoreProductFlow) obj3).m2()).a().get(kvb.b.class);
                 = aVar2 != null ? (b60.a) aVar2.get() : 0;
                if ( == 0) {
                    throw new IllegalStateException(a0.d.q("Api ", kvb.b.class, " is not found"));
                }
                kvb.b bVar = ((kvb.b) b()).f190066m;
                exclusiveStoreInputData.getClass();
                return new kvb.d(bVar, exclusiveStoreInputData);
            case 5:
                com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar3 = (com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a) obj2;
                if (!((Ref$BooleanRef) obj3).f186407a) {
                    oki.h.D2(aVar3.u);
                }
                return Unit.f186387a;
            case 6:
                GooglePayConfirmationFlowContract$InputData googlePayConfirmationFlowContract$InputData = (GooglePayConfirmationFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((GooglePayConfirmationFlow) obj3).m2()).a().get(fw2.d.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 != null) {
                    return new fw2.h(((fw2.d) aVar5.b()).f138530n, googlePayConfirmationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fw2.d.class, " is not found"));
            case 7:
                WealthProtectionScreen wealthProtectionScreen = (WealthProtectionScreen) obj3;
                KProperty[] kPropertyArr3 = WealthProtectionScreen.U;
                qji.b bVarU23 = wealthProtectionScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.wealth_protection.di.WealthProtectionScreenInjector");
                u uVar = (u) bVarU23;
                return new g0(uVar.f292082b, uVar.f292083c, wealthProtectionScreen, (WealthProtectionScreenContract$InputData) obj2);
            case 8:
                AirportLoungeCheckoutFlowContract$InputData airportLoungeCheckoutFlowContract$InputData = (AirportLoungeCheckoutFlowContract$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((AirportLoungeCheckoutFlow) obj3).m2()).a().get(ovi.a.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 != null) {
                    return new y(((h0) aVar7.b()).f109711y, airportLoungeCheckoutFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ovi.a.class, " is not found"));
            case 9:
                com.revolut.feature.card_design.impl.card_design.d dVar = (com.revolut.feature.card_design.impl.card_design.d) obj3;
                CardDesignFlowContract$Step cardDesignFlowContract$Step = (CardDesignFlowContract$Step) obj2;
                ay2.h hVar = dVar.u;
                CardDesignFlowContract$InputData cardDesignFlowContract$InputData = dVar.o;
                pi3.h hVarC = cardDesignFlowContract$InputData.getF64615a();
                t tVar = hVar.f11039c;
                vkm.d dVarB = hVarC != null ? rd0.e.b(nim.a.w(tVar.n(), new auj.o(hVarC, 20))) : rd0.e.b(tVar.q());
                AccountId accountId = cardDesignFlowContract$InputData.getF();
                AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
                if (joint == null || (strJ0 = joint.f51413b) == null) {
                    strJ0 = cardDesignFlowContract$InputData.getE();
                }
                if (strJ0 != null) {
                    od0.i.Companion.getClass();
                    gVar = new go.g(new Data(od0.h.a(strJ0), null, false, 6, null), 2);
                } else if (cardDesignFlowContract$InputData.getF64622m() == j0.FAMILY) {
                    gVar = nim.a.v(dVar.z.a(), new nuc.n(27));
                } else {
                    od0.i.Companion.getClass();
                    gVar = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                }
                return xam.a.h(new com.revolut.feature.card_design.impl.card_design.a(dVar, cardDesignFlowContract$Step, null), u0.m(dVarB, gVar));
            case 10:
                return ((com.google.firebase.messaging.t) obj3).g(new nx7.h((nx7.n) obj2, i2));
            case 11:
                DirectDebitAccountConfirmationScreen directDebitAccountConfirmationScreen = (DirectDebitAccountConfirmationScreen) obj3;
                DirectDebitAccountConfirmationScreenContract$InputData directDebitAccountConfirmationScreenContract$InputData = (DirectDebitAccountConfirmationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = DirectDebitAccountConfirmationScreen.f69862e0;
                qji.b bVarQ2 = directDebitAccountConfirmationScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.account_confirmation.di.DirectDebitAccountConfirmationScreenInjector");
                c2 c2Var = (c2) ((oy4.a) bVarQ2).j().S(directDebitAccountConfirmationScreen);
                switch (c2Var.f118493a) {
                    case 0:
                        c2Var.f118495c = directDebitAccountConfirmationScreenContract$InputData;
                        break;
                    case 1:
                        c2Var.f118495c = directDebitAccountConfirmationScreenContract$InputData;
                        break;
                    default:
                        c2Var.f118495c = directDebitAccountConfirmationScreenContract$InputData;
                        break;
                }
                return (d2) c2Var.mo3800build();
            case 12:
                FreelancerPaymentProcessingFeesScreen freelancerPaymentProcessingFeesScreen = (FreelancerPaymentProcessingFeesScreen) obj3;
                FreelancerPaymentProcessingFeesContract$InputData freelancerPaymentProcessingFeesContract$InputData = (FreelancerPaymentProcessingFeesContract$InputData) obj2;
                KProperty[] kPropertyArr5 = FreelancerPaymentProcessingFeesScreen.f74054b0;
                qji.b bVarQ22 = freelancerPaymentProcessingFeesScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.di.FreelancerPaymentProcessingFeesScreenInjector");
                r1 r1Var = (r1) ((p07.a) bVarQ22).c().S(freelancerPaymentProcessingFeesScreen);
                switch (r1Var.f282734a) {
                    case 0:
                        r1Var.d = freelancerPaymentProcessingFeesContract$InputData;
                        break;
                    case 1:
                        r1Var.d = freelancerPaymentProcessingFeesContract$InputData;
                        break;
                    default:
                        r1Var.d = freelancerPaymentProcessingFeesContract$InputData;
                        break;
                }
                return (s1) r1Var.mo3800build();
            case 13:
                PartnerGivingConsentFlowContract$InputData partnerGivingConsentFlowContract$InputData = (PartnerGivingConsentFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((PartnerGivingConsentFlow) obj3).m2()).a().get(kyk.y.class);
                b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar9 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", kyk.y.class, " is not found"));
                }
                v vVar = ((v) ((kyk.y) aVar9.b())).A;
                PartnerGivingConsentDestination.Configuration configuration = partnerGivingConsentFlowContract$InputData.f104248a;
                configuration.getClass();
                return new q(vVar, configuration);
            case 14:
                SplitBillsFlow splitBillsFlow = (SplitBillsFlow) obj3;
                SplitBillsFlowContract$InputData splitBillsFlowContract$InputData = (SplitBillsFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(splitBillsFlow.m2()).a().get(v0a.b.class);
                b60.a aVar11 = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar11 != null) {
                    return new j1a.j(((j1a.i) aVar11.b()).f170313p, splitBillsFlow, splitBillsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
            case 15:
                TravelExperiencesItineraryScreen travelExperiencesItineraryScreen = (TravelExperiencesItineraryScreen) obj3;
                TravelExperiencesItineraryScreenContract$InputData travelExperiencesItineraryScreenContract$InputData = (TravelExperiencesItineraryScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = TravelExperiencesItineraryScreen.P;
                qji.b bVarU24 = travelExperiencesItineraryScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.di.TravelExperiencesItineraryScreenInjector");
                f0 f0Var = (f0) ((p2g.a) bVarU24).j().mo3808a(travelExperiencesItineraryScreen);
                switch (f0Var.f318361a) {
                    case 0:
                        f0Var.d = travelExperiencesItineraryScreenContract$InputData;
                        break;
                    default:
                        f0Var.d = travelExperiencesItineraryScreenContract$InputData;
                        break;
                }
                return (z0g.g0) f0Var.mo3783build();
            case 16:
                TravelExperiencesDatesSelectionScreen travelExperiencesDatesSelectionScreen = (TravelExperiencesDatesSelectionScreen) obj3;
                TravelExperiencesDatesSelectionScreenContract$InputData travelExperiencesDatesSelectionScreenContract$InputData = (TravelExperiencesDatesSelectionScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = TravelExperiencesDatesSelectionScreen.S;
                qji.b bVarQ23 = travelExperiencesDatesSelectionScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.di.TravelExperiencesDatesSelectionInjector");
                m0 m0Var = (m0) ((p3g.a) bVarQ23).s().S(travelExperiencesDatesSelectionScreen);
                switch (m0Var.f318412a) {
                    case 0:
                        m0Var.d = travelExperiencesDatesSelectionScreenContract$InputData;
                        break;
                    case 1:
                        m0Var.d = travelExperiencesDatesSelectionScreenContract$InputData;
                        break;
                    default:
                        m0Var.d = travelExperiencesDatesSelectionScreenContract$InputData;
                        break;
                }
                return (z0g.n0) m0Var.mo3800build();
            case 17:
                CreditAddressSearchScreen creditAddressSearchScreen = (CreditAddressSearchScreen) obj3;
                KProperty[] kPropertyArr8 = CreditAddressSearchScreen.c0;
                qji.b bVarQ24 = creditAddressSearchScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.di.CreditAddressSearchScreenInjector");
                t0 t0Var = (t0) bVarQ24;
                return new v0(t0Var.f119809c, t0Var.d, creditAddressSearchScreen, (CreditAddressSearchScreenContract$InputData) obj2);
            case 18:
                return NavController.NavControllerNavigatorState.markTransitionComplete$lambda$1((NavController.NavControllerNavigatorState) obj3, (NavBackStackEntry) obj2);
            case 19:
                DeFiReceiveFlowContract$InputData deFiReceiveFlowContract$InputData = (DeFiReceiveFlowContract$InputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(((DeFiReceiveFlow) obj3).m2()).a().get(g56.l.class);
                b60.a aVar13 = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar13 != null) {
                    return new g56.b(((g56.d) ((g56.l) aVar13.b())).f140644q, deFiReceiveFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", g56.l.class, " is not found"));
            case 20:
                ((Ref$BooleanRef) obj3).f186407a = true;
                ((o5g.i) obj2).J2();
                return Unit.f186387a;
            case 21:
                LoanChangeRepaymentDayFlowContract$InputData loanChangeRepaymentDayFlowContract$InputData = (LoanChangeRepaymentDayFlowContract$InputData) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(((LoanChangeRepaymentDayRootFlow) obj3).m2()).a().get(u45.h.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                }
                Object objB = aVar15.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.di.LoanChangeRepaymentDayFlowInjector");
                return new u45.l(((u45.h) objB).B, loanChangeRepaymentDayFlowContract$InputData);
            case 22:
                MultibancoFlowInputData multibancoFlowInputData = (MultibancoFlowInputData) obj2;
                phm.a aVar16 = (phm.a) ue0.e.j(((MultibancoFlow) obj3).m2()).a().get(i72.m.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                }
                i72.m mVar = ((i72.m) aVar17.b()).A;
                multibancoFlowInputData.getClass();
                return new i72.q(mVar, multibancoFlowInputData);
            case 23:
                LoanRefinancedSettlementPromptScreenContract$InputData loanRefinancedSettlementPromptScreenContract$InputData = (LoanRefinancedSettlementPromptScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = LoanRefinancedSettlementPromptScreen.f70481b0;
                phm.a aVar18 = (phm.a) ue0.e.j(((LoanRefinancedSettlementPromptScreen) obj3).m2()).a().get(u45.h.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new a0(((u45.h) aVar19.b()).B, loanRefinancedSettlementPromptScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 24:
                BillAccountDetailScreen billAccountDetailScreen = (BillAccountDetailScreen) obj3;
                BillAccountDetailScreenContract$InputData billAccountDetailScreenContract$InputData = (BillAccountDetailScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = BillAccountDetailScreen.f0;
                phm.a aVar20 = (phm.a) ue0.e.j(billAccountDetailScreen.m2()).a().get(r6e.o.class);
                b60.a aVar21 = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar21 != null) {
                    return new r6e.c(((r6e.o) aVar21.b()).K, billAccountDetailScreen, billAccountDetailScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r6e.o.class, " is not found"));
            case 25:
                MultibancoRegistrationFlowContract$InputData multibancoRegistrationFlowContract$InputData = (MultibancoRegistrationFlowContract$InputData) obj2;
                phm.a aVar22 = (phm.a) ue0.e.j(((MultibancoRegistrationFlow) obj3).m2()).a().get(i72.m.class);
                b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar23 != null) {
                    return new i72.v(((i72.m) aVar23.b()).A, multibancoRegistrationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
            case 26:
                KProperty[] kPropertyArr11 = SubscriptionsListController.S;
                qji.b bVarU25 = ((SubscriptionsListController) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.subscriptions_list.di.SubscriptionsListControllerInjector");
                o73.f fVar = (o73.f) bVarU25;
                return new o73.l(fVar.f222672c, fVar.d, (SubscriptionsListControllerContract$InputData) obj2);
            case 27:
                KProperty[] kPropertyArr12 = LoanRepaymentTypeController.R;
                return new e0(czi.c.o(((LoanRepaymentTypeController) obj3).m2()).B, (LoanRepaymentTypeControllerContract$InputData) obj2);
            case 28:
                MutableStateFlow mutableStateFlow = (MutableStateFlow) obj2;
                PixAuthorisationRequestScreen.Companion aVar24 = PixAuthorisationRequestScreen.INSTANCE;
                qji.b bVarU26 = ((PixAuthorisationRequestScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.di.PixAuthorisationRequestScreenInjector");
                s sVar = (s) bVarU26;
                d0 d0Var = sVar.f234079b;
                s sVar2 = sVar.f234080c;
                mutableStateFlow.getClass();
                return new p8a.t(d0Var, sVar2, mutableStateFlow);
            default:
                RevolutPaySummaryScreen revolutPaySummaryScreen = (RevolutPaySummaryScreen) obj3;
                KProperty[] kPropertyArr13 = RevolutPaySummaryScreen.f84518b0;
                qji.b bVarU27 = revolutPaySummaryScreen.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.summary_screen.di.RevolutPaySummaryScreenInjector");
                x xVar = (x) bVarU27;
                return new p7c.u(xVar.f233742b, xVar.f233743c, revolutPaySummaryScreen, (RevolutPaySummaryScreenContract$InputData) obj2);
        }
    }
}
