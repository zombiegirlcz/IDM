package pt4;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.stackedchart.StackedChartWithHeaderAndLegendView;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreen;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreenContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.settings.deregister.DeregisterDialogContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.settings.deregister.DeregisterDialogController;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.additionalinfo.AdditionalInfoDialogScreen;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.additionalinfo.AdditionalInfoDialogScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationController;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationScreenContract$InputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreen;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceController;
import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlow;
import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlowContract$InputData;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreen;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.flow.root.DonationsFlow;
import com.revolut.feature.donations.impl.ui.kompot.flow.root.DonationsFlowContract$InputData;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$InputData;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameScreen;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlow;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreen;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreenContract$InputData;
import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlow;
import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlowContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlow;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$InputData;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$InputData;
import com.revolut.feature.shared.branding.api.PaymentLinkPreviewScreenProvider$InputData;
import com.revolut.feature.shared.branding.impl.ui.preview.PaymentLinkPreviewScreen;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlowContract$InputData;
import com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.WealthAssetTypeNewsFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.WealthAssetTypeNewsFlowContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptsScreen;
import cwi.h0;
import dw3.e2;
import dw3.f2;
import dw3.u2;
import jm4.a3;
import jm4.o1;
import jm4.q1;
import jm4.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import kr9.l;
import kr9.s;
import kyk.m;
import kyk.v;
import kyk.y;
import mb3.p;
import pa6.n;
import pth.w;
import q43.o0;
import skm.a2;
import u45.g0;
import vtc.f0;
import vtc.t;
import vtc.x;
import x13.q;
import z52.k;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f239607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f239608c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f239606a = i;
        this.f239607b = obj2;
        this.f239608c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        o6d.f fVar;
        int i = this.f239606a;
        Object obj2 = this.f239608c;
        Object obj3 = this.f239607b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = CreditCardLimitIncreasePreferenceController.S;
                qji.b bVarU2 = ((CreditCardLimitIncreasePreferenceController) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.di.CreditCardLimitIncreasePreferenceInjector");
                o1 o1Var = (o1) bVarU2;
                return new q1(o1Var.f176227b, o1Var.f176228c, (CreditCardLimitIncreasePreferenceContract$InputData) obj2);
            case 1:
                GroupSettingsNameContract$InputData groupSettingsNameContract$InputData = (GroupSettingsNameContract$InputData) obj2;
                KProperty[] kPropertyArr2 = GroupSettingsNameScreen.f0;
                phm.a aVar2 = (phm.a) ue0.e.j(((GroupSettingsNameScreen) obj3).m2()).a().get(l.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new s(((l) aVar.b()).F, groupSettingsNameContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 2:
                MainContainerFlow mainContainerFlow = (MainContainerFlow) obj3;
                MainContainerFlowContract$InputData mainContainerFlowContract$InputData = (MainContainerFlowContract$InputData) obj2;
                KProperty[] kPropertyArr3 = MainContainerFlow.T;
                phm.a aVar3 = (phm.a) ue0.e.j(mainContainerFlow.m2()).a().get(dtb.a.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", dtb.a.class, " is not found"));
                }
                mtb.d dVar = ((mtb.d) aVar.b()).d;
                mainContainerFlowContract$InputData.getClass();
                return new mtb.b(dVar, mainContainerFlow, mainContainerFlowContract$InputData);
            case 3:
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar4 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) obj3;
                WorkflowConfiguration.Workflow workflow = (WorkflowConfiguration.Workflow) obj2;
                a2 a2Var = aVar4.H;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                aVar4.H = aVar4.l2(new w(aVar4, workflow, null), new pj3.b(aVar4, workflow, 29));
                return Unit.f186387a;
            case 4:
                return StackedChartWithHeaderAndLegendView.a((Context) obj3, (StackedChartWithHeaderAndLegendView) obj2);
            case 5:
                CreditCardStatementFlowContract$InputData creditCardStatementFlowContract$InputData = (CreditCardStatementFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((CreditCardStatementFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new t2(((a3) aVar.b()).Y, creditCardStatementFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 6:
                RevPointsExclusiveStoreProductStatusScreenContract$InputData revPointsExclusiveStoreProductStatusScreenContract$InputData = (RevPointsExclusiveStoreProductStatusScreenContract$InputData) obj2;
                int i2 = RevPointsExclusiveStoreProductStatusScreen.U;
                phm.a aVar6 = (phm.a) ue0.e.j(((RevPointsExclusiveStoreProductStatusScreen) obj3).m2()).a().get(kvb.b.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new kvb.e(((kvb.b) aVar.b()).f190066m, revPointsExclusiveStoreProductStatusScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kvb.b.class, " is not found"));
            case 7:
                StreetModeFlowContract$InputData streetModeFlowContract$InputData = (StreetModeFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((StreetModeFlow) obj3).m2()).a().get(t.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new x(((t) aVar.b()).M, streetModeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
            case 8:
                WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen = (WealthProtectionLimitChangeScreen) obj3;
                WealthProtectionLimitChangeScreenContract$InputData wealthProtectionLimitChangeScreenContract$InputData = (WealthProtectionLimitChangeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = WealthProtectionLimitChangeScreen.T;
                phm.a aVar8 = (phm.a) ue0.e.j(wealthProtectionLimitChangeScreen.m2()).a().get(t.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new f0(((t) aVar.b()).M, wealthProtectionLimitChangeScreen, wealthProtectionLimitChangeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
            case 9:
                AirportLoungeSearchFlowContract$InputData airportLoungeSearchFlowContract$InputData = (AirportLoungeSearchFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(((AirportLoungeSearchFlow) obj3).m2()).a().get(ovi.a.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new cwi.f0(((h0) aVar.b()).f109711y, airportLoungeSearchFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ovi.a.class, " is not found"));
            case 10:
                DirectDebitAccountDetailsScreen directDebitAccountDetailsScreen = (DirectDebitAccountDetailsScreen) obj3;
                DirectDebitAccountDetailsScreenContract$InputData directDebitAccountDetailsScreenContract$InputData = (DirectDebitAccountDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = DirectDebitAccountDetailsScreen.c0;
                qji.b bVarQ2 = directDebitAccountDetailsScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.account_details.di.DirectDebitAccountDetailsScreenInjector");
                e2 e2Var = (e2) ((qy4.a) bVarQ2).s().S(directDebitAccountDetailsScreen);
                switch (e2Var.f118624a) {
                    case 0:
                        e2Var.f118626c = directDebitAccountDetailsScreenContract$InputData;
                        break;
                    case 1:
                        e2Var.f118626c = directDebitAccountDetailsScreenContract$InputData;
                        break;
                    case 2:
                        e2Var.f118626c = directDebitAccountDetailsScreenContract$InputData;
                        break;
                    default:
                        e2Var.f118626c = directDebitAccountDetailsScreenContract$InputData;
                        break;
                }
                return (f2) e2Var.mo3800build();
            case 11:
                com.revolut.feature.rev_points.impl.ui.opt_in.flow.a aVar10 = (com.revolut.feature.rev_points.impl.ui.opt_in.flow.a) obj2;
                if (!((Ref$BooleanRef) obj3).f186407a) {
                    aVar10.C2(new hub.b(null, true));
                }
                return Unit.f186387a;
            case 12:
                LessonScreen lessonScreen = (LessonScreen) obj3;
                LessonScreenContract$InputData lessonScreenContract$InputData = (LessonScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = LessonScreen.c0;
                phm.a aVar11 = (phm.a) ue0.e.j(lessonScreen.m2()).a().get(f09.e.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new f09.f(((f09.e) aVar.b()).f131060c, lessonScreen, lessonScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f09.e.class, " is not found"));
            case 13:
                WealthAssetTypeNewsFlowContract$InputData wealthAssetTypeNewsFlowContract$InputData = (WealthAssetTypeNewsFlowContract$InputData) obj2;
                KProperty[] kPropertyArr7 = WealthAssetTypeNewsFlow.U;
                phm.a aVar12 = (phm.a) ue0.e.j(((WealthAssetTypeNewsFlow) obj3).m2()).a().get(l0k.c.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new l0k.e(((l0k.c) aVar.b()).o, wealthAssetTypeNewsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l0k.c.class, " is not found"));
            case 14:
                PartnerConsentPromptScreenContract$InputData partnerConsentPromptScreenContract$InputData = (PartnerConsentPromptScreenContract$InputData) obj2;
                phm.a aVar13 = (phm.a) ue0.e.j(((PartnerConsentPromptsScreen) obj3).m2()).a().get(y.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                }
                v vVar = ((v) ((y) aVar.b())).A;
                q0l.a aVar14 = partnerConsentPromptScreenContract$InputData.f104258a;
                aVar14.getClass();
                return new m(vVar, aVar14);
            case 15:
                CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController = (CardDeliveryAddressVerificationController) obj3;
                KProperty[] kPropertyArr8 = CardDeliveryAddressVerificationController.W;
                qji.b bVarU22 = cardDeliveryAddressVerificationController.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.di.CardDeliveryAddressVerificationScreenInjector");
                q qVar = (q) bVarU22;
                return new x13.l(qVar.f302174c, qVar.d, cardDeliveryAddressVerificationController, (CardDeliveryAddressVerificationScreenContract$InputData) obj2);
            case 16:
                KProperty[] kPropertyArr9 = TravelExperienceLocationPickerScreen.f0;
                qji.b bVarQ22 = ((TravelExperienceLocationPickerScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.di.TravelExperienceLocationPickerScreenInjector");
                z0g.f fVar2 = (z0g.f) bVarQ22;
                return new z0g.a(fVar2.f318359b, fVar2.f318360c, (TravelExperienceLocationPickerScreenContract$InputData) obj2);
            case 17:
                QrDetailsScreen qrDetailsScreen = (QrDetailsScreen) obj3;
                QrDetailsScreenContract$InputData qrDetailsScreenContract$InputData = (QrDetailsScreenContract$InputData) obj2;
                qji.b bVarU23 = qrDetailsScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.di.QrDetailsScreenInjector");
                p12.h hVar = (p12.h) ((r32.a) bVarU23).c().mo3808a(qrDetailsScreen);
                switch (hVar.f231674a) {
                    case 0:
                        hVar.d = qrDetailsScreenContract$InputData;
                        break;
                    default:
                        hVar.d = qrDetailsScreenContract$InputData;
                        break;
                }
                return (p12.i) hVar.mo3783build();
            case 18:
                IppShopFlow ippShopFlow = (IppShopFlow) obj3;
                IppShopFlowContract$InputData ippShopFlowContract$InputData = (IppShopFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(ippShopFlow.m2()).a().get(m3c.j.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new m3c.e(((m3c.j) aVar.b()).f, ippShopFlow, ippShopFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", m3c.j.class, " is not found"));
            case 19:
                KProperty[] kPropertyArr10 = TravelExperiencesVisitorsSelectionScreen.f93166e0;
                qji.b bVarQ23 = ((TravelExperiencesVisitorsSelectionScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.di.TravelExperiencesVisitorsSelectionInjector");
                z0g.f fVar3 = (z0g.f) bVarQ23;
                return new z0g.t(fVar3.f318359b, fVar3.f318360c, (TravelExperiencesVisitorsSelectionScreenContract$InputData) obj2);
            case 20:
                SelectorScreen selectorScreen = (SelectorScreen) obj3;
                SelectPaymentMethodInputData selectPaymentMethodInputData = (SelectPaymentMethodInputData) obj2;
                KProperty[] kPropertyArr11 = SelectorScreen.f65290n0;
                phm.a aVar16 = (phm.a) ue0.e.j(selectorScreen.m2()).a().get(c43.h.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", c43.h.class, " is not found"));
                }
                c43.h hVar2 = ((c43.h) aVar.b()).f21028w;
                ScreenContentRecyclerView cardPaymentMethodSelectorRecyclerView = selectorScreen.h3().d;
                Intrinsics.checkNotNullExpressionValue(cardPaymentMethodSelectorRecyclerView, "cardPaymentMethodSelectorRecyclerView");
                selectPaymentMethodInputData.getClass();
                return new c43.m(hVar2, selectorScreen, cardPaymentMethodSelectorRecyclerView, selectPaymentMethodInputData);
            case 21:
                ((o0) obj3).C1(new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.CardSubscriptionList((String) obj2, b9e.d.None)));
                return Unit.f186387a;
            case 22:
                int i3 = DeregisterDialogController.U;
                qji.b bVarU24 = ((DeregisterDialogController) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.apm.iris.impl.ui.settings.deregister.di.DeregisterDialogControllerInjector");
                z52.m mVar = (z52.m) bVarU24;
                return new k(mVar.f319454b, mVar.f319455c, (DeregisterDialogContract$InputData) obj2);
            case 23:
                LoanConfirmNewRepaymentDayScreen loanConfirmNewRepaymentDayScreen = (LoanConfirmNewRepaymentDayScreen) obj3;
                LoanConfirmNewRepaymentDayScreenContract$InputData loanConfirmNewRepaymentDayScreenContract$InputData = (LoanConfirmNewRepaymentDayScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = LoanConfirmNewRepaymentDayScreen.f70398d0;
                phm.a aVar17 = (phm.a) ue0.e.j(loanConfirmNewRepaymentDayScreen.m2()).a().get(u45.h.class);
                aVar = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar != null) {
                    return new u45.m(((u45.h) aVar.b()).B, loanConfirmNewRepaymentDayScreen, loanConfirmNewRepaymentDayScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 24:
                PaymentLinkPreviewScreen paymentLinkPreviewScreen = (PaymentLinkPreviewScreen) obj3;
                PaymentLinkPreviewScreenProvider$InputData paymentLinkPreviewScreenProvider$InputData = (PaymentLinkPreviewScreenProvider$InputData) obj2;
                KProperty[] kPropertyArr13 = PaymentLinkPreviewScreen.f86072a0;
                try {
                    phm.a aVar18 = (phm.a) ue0.e.j(paymentLinkPreviewScreen.m2()).a().get(i6d.c.class);
                    aVar = aVar18 != null ? (b60.a) aVar18.get() : null;
                } catch (Exception unused) {
                    Object objC = o6d.b.Companion.c();
                    Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.feature.shared.branding.impl.di.BrandingSharedComponent");
                    fVar = (o6d.f) objC;
                }
                if (aVar != null) {
                    fVar = (o6d.f) aVar.b();
                    return new o6d.h(fVar.d, paymentLinkPreviewScreenProvider$InputData);
                }
                throw new IllegalStateException("Api " + i6d.c.class + " is not found");
            case 25:
                LoanSelectAutopayScreen loanSelectAutopayScreen = (LoanSelectAutopayScreen) obj3;
                LoanSelectAutopayScreenContract$InputData loanSelectAutopayScreenContract$InputData = (LoanSelectAutopayScreenContract$InputData) obj2;
                KProperty[] kPropertyArr14 = LoanSelectAutopayScreen.f70582e0;
                phm.a aVar19 = (phm.a) ue0.e.j(loanSelectAutopayScreen.m2()).a().get(u45.h.class);
                aVar = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar != null) {
                    return new g0(((u45.h) aVar.b()).B, loanSelectAutopayScreen, loanSelectAutopayScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 26:
                CheckEmailInboxScreen checkEmailInboxScreen = (CheckEmailInboxScreen) obj3;
                qji.b bVarU25 = checkEmailInboxScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.di.CheckEmailInboxScreenInjector");
                u2 u2Var = (u2) bVarU25;
                return new dw3.f0(u2Var.f119889c, u2Var.d, checkEmailInboxScreen, (CheckEmailInboxScreenContract$InputData) obj2);
            case 27:
                AdditionalInfoDialogScreenContract$InputData additionalInfoDialogScreenContract$InputData = (AdditionalInfoDialogScreenContract$InputData) obj2;
                int i5 = AdditionalInfoDialogScreen.T;
                phm.a aVar20 = (phm.a) ue0.e.j(((AdditionalInfoDialogScreen) obj3).m2()).a().get(nb2.b.class);
                aVar = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar != null) {
                    return new nb2.a(((nb2.b) aVar.b()).f213966m, additionalInfoDialogScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nb2.b.class, " is not found"));
            case 28:
                CashTopUpAmountScreen cashTopUpAmountScreen = (CashTopUpAmountScreen) obj3;
                CashTopUpAmountScreenContract$InputData.CreateBarcodeData createBarcodeData = (CashTopUpAmountScreenContract$InputData.CreateBarcodeData) obj2;
                KProperty[] kPropertyArr15 = CashTopUpAmountScreen.f0;
                phm.a aVar21 = (phm.a) ue0.e.j(cashTopUpAmountScreen.m2()).a().get(bb3.a.class);
                aVar = aVar21 != null ? (b60.a) aVar21.get() : null;
                if (aVar != null) {
                    return new mb3.j(((p) aVar.b()).i, cashTopUpAmountScreen, createBarcodeData);
                }
                throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
            default:
                DonationsFlowContract$InputData donationsFlowContract$InputData = (DonationsFlowContract$InputData) obj2;
                phm.a aVar22 = (phm.a) ue0.e.j(((DonationsFlow) obj3).m2()).a().get(pa6.m.class);
                aVar = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar != null) {
                    return new n(((pa6.m) aVar.b()).G, donationsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
        }
    }
}
