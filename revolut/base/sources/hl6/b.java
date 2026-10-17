package hl6;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreen;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreenContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreenContract$InputData;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import com.revolut.feature.apm.breb.impl.ui.new_contact.BrebNewContactScreen;
import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreen;
import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_account_info.AdditionalCardsCardholderAccountInfoScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_account_info.AdditionalCardsCardholderAccountInfoScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlow;
import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlowContract$InputData;
import com.revolut.feature.credit.direct.debit.set_account.DirectDebitSetAccountScreen;
import com.revolut.feature.credit.direct.debit.set_account.DirectDebitSetAccountScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreenContract$Input;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlow;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.rejection_reason.RejectionReasonScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.rejection_reason.RejectionReasonScreenContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.transfer.ChallengesReviewTransferController;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreen;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreenContract$InputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsController;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreen;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreenContract$InputData;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlow;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.backend_reason.AccountClosureBackendReasonScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.backend_reason.AccountClosureBackendReasonScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlow;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.revoke_access.ConnectedAppRevokeAccessBottomSheet;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.revoke_access.ConnectedAppRevokeAccessBottomSheetContract$InputData;
import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlow;
import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlowContract$InputData;
import hu1.e0;
import i0e.b0;
import jm4.a3;
import jm4.g3;
import jm4.r2;
import jm4.x3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.m0;
import ljl.q0;
import ljl.v0;
import ql7.b1;
import ql7.f1;
import ql7.k1;
import vkm.j2;
import xf6.h0;
import xf6.i2;
import xf6.x2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f152986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f152987c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f152985a = i;
        this.f152986b = obj2;
        this.f152987c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        Object value;
        StatementPeriodType statementPeriodTypeA;
        StatementPeriod statementPeriod;
        int i = this.f152985a;
        Object obj2 = this.f152987c;
        Object obj3 = this.f152986b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = ClientsListScreen.R;
                qji.b bVarU2 = ((ClientsListScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.di.ClientsListScreenInjector");
                x2 x2Var = (x2) bVarU2;
                return new i2(x2Var.f305161a, x2Var.f305162b, new il6.a(), (ClientsListScreenContract$Input) obj2);
            case 1:
                QrConsentFlow qrConsentFlow = (QrConsentFlow) obj3;
                return new m0(((q0) kli.a.n(qrConsentFlow.m2())).E, qrConsentFlow, (QrConsentFlowContract$InputData) obj2);
            case 2:
                PennyTopUpFlowContract$InputData pennyTopUpFlowContract$InputData = (PennyTopUpFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((PennyTopUpFlow) obj3).m2()).a().get(je6.g.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new h0(((xf6.t) aVar.b()).B, pennyTopUpFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
            case 3:
                CoparentsSettingsScreen coparentsSettingsScreen = (CoparentsSettingsScreen) obj3;
                CoparentsSettingsScreenContract$InputData coparentsSettingsScreenContract$InputData = (CoparentsSettingsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = CoparentsSettingsScreen.f77295d0;
                phm.a aVar3 = (phm.a) ue0.e.j(coparentsSettingsScreen.m2()).a().get(mn8.o.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                }
                mn8.o oVar = ((mn8.o) ((io8.a) aVar.b())).f207476w;
                coparentsSettingsScreenContract$InputData.getClass();
                return new mn8.c(oVar, coparentsSettingsScreen, coparentsSettingsScreenContract$InputData);
            case 4:
                AdditionalCardsCardholderAccountInfoScreenContract$InputData additionalCardsCardholderAccountInfoScreenContract$InputData = (AdditionalCardsCardholderAccountInfoScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = AdditionalCardsCardholderAccountInfoScreen.S;
                phm.a aVar4 = (phm.a) ue0.e.j(((AdditionalCardsCardholderAccountInfoScreen) obj3).m2()).a().get(a3.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new jm4.u(((a3) aVar.b()).Y, additionalCardsCardholderAccountInfoScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 5:
                int i2 = ConnectedAppRevokeAccessBottomSheet.T;
                qji.b bVarU22 = ((ConnectedAppRevokeAccessBottomSheet) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.revoke_access.di.ConnectedAppRevokeAccessBottomSheetInjector");
                mjl.c cVar = (mjl.c) bVarU22;
                return new mjl.e(cVar.f206073c, cVar.d, (ConnectedAppRevokeAccessBottomSheetContract$InputData) obj2);
            case 6:
                KProperty[] kPropertyArr4 = AllFormsScreen.Q;
                qji.b bVarU23 = ((AllFormsScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.di.AllFormsScreenInjector");
                aq1.d dVar = (aq1.d) bVarU23;
                return new aq1.a(dVar.f8236a, dVar.f8237b, (AllFormsScreenContract$InputData) obj2);
            case 7:
                CreditApplicationCloseScreen creditApplicationCloseScreen = (CreditApplicationCloseScreen) obj3;
                qji.b bVarQ2 = creditApplicationCloseScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.application.close.ui.screen.di.CreditApplicationCloseScreenInjector");
                return (iq3.c) ((iq3.b) ((iq3.d) bVarQ2).q().V((CreditApplicationCloseScreenContract$InputData) obj2).S(creditApplicationCloseScreen)).mo3800build();
            case 8:
                PolicyDetailsScreen policyDetailsScreen = (PolicyDetailsScreen) obj3;
                KProperty[] kPropertyArr5 = PolicyDetailsScreen.f0;
                qji.b bVarQ22 = policyDetailsScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.details.di.PolicyDetailsScreenInjector");
                ql7.o oVar2 = (ql7.o) bVarQ22;
                return new b1(oVar2.f247408b, oVar2.f247409c, policyDetailsScreen, (PolicyDetailsScreenContract$InputData) obj2);
            case 9:
                KProperty[] kPropertyArr6 = ChallengesReviewTransferController.R;
                qji.b bVarU24 = ((ChallengesReviewTransferController) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.transfer.di.ChallengesReviewTransferControllerComponent.Injector");
                gp8.k kVar = (gp8.k) bVarU24;
                return new gp8.m(kVar.f145316b, kVar.f145317c, (hq8.h) obj2);
            case 10:
                hq9.i iVar = (hq9.i) obj2;
                KProperty[] kPropertyArr7 = ViewSplitItemsController.T;
                phm.a aVar5 = (phm.a) ue0.e.j(((ViewSplitItemsController) obj3).m2()).a().get(gp9.a.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new gp9.j(((gp9.d) ((gp9.a) aVar.b())).f145365r, iVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
            case 11:
                return new v0(((q0) kli.a.n(((SignInWithRevolutIdFlow) obj3).m2())).E, (SignInWithRevolutIdFlowContract$InputData) obj2);
            case 12:
                KProperty[] kPropertyArr8 = RejectionReasonScreen.P;
                qji.b bVarU25 = ((RejectionReasonScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.rejection_reason.di.RejectionReasonScreenInjector");
                k1 k1Var = (k1) bVarU25;
                return new f1(k1Var.f247369b, k1Var.f247370c, (RejectionReasonScreenContract$InputData) obj2);
            case 13:
                EditCardOwnerScreenContract$InputData editCardOwnerScreenContract$InputData = (EditCardOwnerScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = EditCardOwnerScreen.Q;
                phm.a aVar6 = (phm.a) ue0.e.j(((EditCardOwnerScreen) obj3).m2()).a().get(vpa.a.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new jqa.d(((jqa.e) ((jqa.s) aVar.b())).O, editCardOwnerScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
            case 14:
                hsh.d dVar2 = (hsh.d) obj3;
                csh.k kVar2 = (csh.k) obj2;
                return dVar2.d.shouldUseSharedService() ? new gsh.c(dVar2.f155060b, kVar2.h()) : kVar2.a();
            case 15:
                ms0.x xVarB = TrendView.B((Context) obj2);
                ((TrendView) obj3).addView(xVarB);
                return xVarB;
            case 16:
                PaymentsGroupsBillsEditFlowContract$InputData paymentsGroupsBillsEditFlowContract$InputData = (PaymentsGroupsBillsEditFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((PaymentsGroupsBillsEditFlow) obj3).m2()).a().get(kr9.l.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new kr9.h(((kr9.l) aVar.b()).F, paymentsGroupsBillsEditFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kr9.l.class, " is not found"));
            case 17:
                BlikCodeScreen blikCodeScreen = (BlikCodeScreen) obj3;
                KProperty[] kPropertyArr10 = BlikCodeScreen.f61658n0;
                qji.b bVarQ23 = blikCodeScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.apm.blik.impl.ui.code.di.BlikCodeScreenInjector");
                cu1.o oVar3 = (cu1.o) ((mu1.a) bVarQ23);
                return new cu1.l(oVar3.f108769b, oVar3.f108770c, new ari.a(), blikCodeScreen, (BlikCodeScreenContract$InputData) obj2);
            case 18:
                e0 e0Var = (e0) obj3;
                BridgeDestination bridgeDestinationA = ((u12.a) e0Var.f155514r).a(obj2);
                if (bridgeDestinationA == null || e0Var.C1(bridgeDestinationA) == null) {
                    e0.y2(obj2);
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
            case 19:
                AccountClosureBackendReasonScreenContract$InputData accountClosureBackendReasonScreenContract$InputData = (AccountClosureBackendReasonScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = AccountClosureBackendReasonScreen.P;
                phm.a aVar8 = (phm.a) ue0.e.j(((AccountClosureBackendReasonScreen) obj3).m2()).a().get(ztg.n.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new ztg.a(((ztg.n) aVar.b()).f325156n, accountClosureBackendReasonScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ztg.n.class, " is not found"));
            case 20:
                BrebTransferNavigation$InputData.NewContact newContact = (BrebTransferNavigation$InputData.NewContact) obj2;
                KProperty[] kPropertyArr12 = BrebNewContactScreen.Q;
                qji.b bVarU26 = ((BrebNewContactScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.new_contact.di.BrebNewContactScreenInjector");
                nv1.s sVar = (nv1.s) bVarU26;
                nv1.g gVar = sVar.f219446b;
                nv1.s sVar2 = sVar.f219447c;
                newContact.getClass();
                return new nv1.m(gVar, sVar2, newContact);
            case 21:
                CreditCardStatementFinancingFlowContract$InputData creditCardStatementFinancingFlowContract$InputData = (CreditCardStatementFinancingFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(((CreditCardStatementFinancingFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new r2(((a3) aVar.b()).Y, creditCardStatementFinancingFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 22:
                com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar3 = (com.revolut.feature.topup_screen.impl.flow.topup_methods.d) obj3;
                oki.h.t2(dVar3, dVar3.D, new TopupMethodsFlowContract$Step.AddNewCardDetails((String) obj2, null), true, null, false, 12);
                return Unit.f186387a;
            case 23:
                KProperty[] kPropertyArr13 = DirectDebitSetAccountScreen.R;
                qji.b bVarU27 = ((DirectDebitSetAccountScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.set_account.di.SetAccountScreenInjector");
                x3 x3Var = (x3) bVarU27;
                return new g3(x3Var.f176438b, x3Var.f176439c, (DirectDebitSetAccountScreenContract$InputData) obj2);
            case 24:
                return ((com.google.firebase.messaging.t) obj3).f(new hw9.a((hz7.b) obj2, 14));
            case 25:
                return ((com.google.firebase.messaging.t) obj3).f(new hw9.a((du8.b) obj2, 15));
            case 26:
                CardDeferredCvvFlow cardDeferredCvvFlow = (CardDeferredCvvFlow) obj3;
                FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = (FacadeCardTopupFlowDescriptor$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(cardDeferredCvvFlow.m2()).a().get(ove.t.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                }
                ove.t tVar = ((ove.t) aVar.b()).H;
                facadeCardTopupFlowDescriptor$InputData.getClass();
                return new ove.h(tVar, cardDeferredCvvFlow, facadeCardTopupFlowDescriptor$InputData);
            case 27:
                CourseOverviewScreen courseOverviewScreen = (CourseOverviewScreen) obj3;
                CourseOverviewScreenContract$InputData courseOverviewScreenContract$InputData = (CourseOverviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr14 = CourseOverviewScreen.f77977d0;
                phm.a aVar11 = (phm.a) ue0.e.j(courseOverviewScreen.m2()).a().get(f09.e.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new f09.c(((f09.e) aVar.b()).f131060c, courseOverviewScreen, courseOverviewScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f09.e.class, " is not found"));
            case 28:
                i0e.q qVar = (i0e.q) obj3;
                b0 b0Var = (b0) obj2;
                j2 j2Var = qVar.f157387t;
                do {
                    value = j2Var.getValue();
                    i0e.n updateUserActionState = (i0e.n) j2Var.getValue();
                    Intrinsics.checkNotNullParameter(updateUserActionState, "$this$updateUserActionState");
                    statementPeriodTypeA = i0e.x.a(b0Var);
                    statementPeriod = (StatementPeriod) qVar.f157383p.getValue();
                    updateUserActionState.getClass();
                } while (!j2Var.h(value, new i0e.n(statementPeriodTypeA, statementPeriod)));
                return Unit.f186387a;
            default:
                zzj.f fVar = ((i0k.g) obj3).f157422c;
                ((o0k.c) obj2).getClass();
                return fVar.f(Integer.MAX_VALUE);
        }
    }
}
