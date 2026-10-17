package ni1;

import com.google.protobuf.b4;
import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.address.common.api.navigation.SelectAddressControllerDescriptor$InputData;
import com.revolut.feature.address.common.impl.flow.screen.select.SelectAddressScreen;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListRootFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.funds_confirmation.OpenBankingFundsConfirmationFlow;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview.UsPlaidWebViewScreen;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.feature.feedback.impl.ui.flow.one_click.OneClickFeedbackFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.CarConfirmationScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.CarConfirmationScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.overdue_payment.OverduePaymentScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.overdue_payment.OverduePaymentScreenContract$InputData;
import com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet.PayeesConfirmationBottomSheetScreen;
import com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet.PayeesConfirmationBottomSheetScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionScreen;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreen;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreen;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreenContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlow;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlowContract$FlowInput;
import com.revolut.feature.view.image.impl.flow.ViewImageFlow;
import com.revolut.feature.view.image.impl.flow.ViewImageFlowContract$InputData;
import com.revolut.feature.wealth_protection.sso.impl.ui.WealthProtectionSsoFlow;
import com.revolut.feature.wealth_protection.sso.impl.ui.WealthProtectionSsoFlowContract$InputData;
import com.revolut.kompot.common.bottom_sheet.status.StatusSheetController;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.edit_cycle.AnalyticsEditCycleScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.edit_cycle.AnalyticsEditCycleScreenContract$InputData;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlow;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$InputData;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$Step;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import com.revolut.tracking.v3.SettingsFeaturesContext;
import com.revolut.tracking.v3.SettingsUnlockContext;
import dw3.c1;
import dw3.g7;
import dw3.v6;
import grl.fc;
import grl.hc;
import ine.u;
import ine.v;
import ix0.h1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import jm4.b1;
import jm4.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kr9.t;
import nii.q1;
import no.e0;
import ql7.o;
import ql7.q;
import vc.s;
import xf6.r0;
import xf6.w2;
import xf6.y2;
import zhm.q0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f215618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f215619c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f215617a = i;
        this.f215618b = obj2;
        this.f215619c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f215617a;
        Object obj2 = this.f215619c;
        Object obj3 = this.f215618b;
        switch (i) {
            case 0:
                SelectAddressScreen selectAddressScreen = (SelectAddressScreen) obj3;
                sh1.l lVar = (sh1.l) obj2;
                KProperty[] kPropertyArr = SelectAddressScreen.V;
                phm.a aVar = (phm.a) ue0.e.j(selectAddressScreen.m2()).a().get(oh1.c.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", oh1.c.class, " is not found"));
                }
                yh1.e eVar = ((yh1.e) aVar2.b()).e;
                SelectAddressControllerDescriptor$InputData selectAddressControllerDescriptor$InputData = selectAddressScreen.K;
                selectAddressControllerDescriptor$InputData.getClass();
                lVar.getClass();
                return new yh1.i(eVar, selectAddressControllerDescriptor$InputData, lVar);
            case 1:
                SpousalConsentInitiatorPopupScreen spousalConsentInitiatorPopupScreen = (SpousalConsentInitiatorPopupScreen) obj3;
                SpousalConsentInitiatorPopupScreenContract$InputData spousalConsentInitiatorPopupScreenContract$InputData = (SpousalConsentInitiatorPopupScreenContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(spousalConsentInitiatorPopupScreen.m2()).a().get(dw3.e.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return new v6(((c1) ((dw3.e) aVar4.b())).m0, spousalConsentInitiatorPopupScreen, spousalConsentInitiatorPopupScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
            case 2:
                ni6.c cVar = (ni6.c) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((OpenBankingFundsConfirmationFlow) obj3).m2()).a().get(w2.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 != null) {
                    return new y2(((w2) aVar6.b()).J, cVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", w2.class, " is not found"));
            case 3:
                q1 q1Var = (q1) obj3;
                StatusSheetController statusSheetController = (StatusSheetController) obj2;
                if (Intrinsics.f(q1Var.d, statusSheetController)) {
                    q1Var.d = null;
                    q1Var.e = statusSheetController;
                    h1.b(new k0.b(q1Var, statusSheetController, 21));
                }
                return Unit.f186387a;
            case 4:
                WaitingListFlowContract$InputData waitingListFlowContract$InputData = (WaitingListFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((WaitingListRootFlow) obj3).m2()).a().get(dw3.e.class);
                b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar8 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                }
                Object objB = aVar8.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                return new g7(((c1) ((dw3.e) objB)).m0, waitingListFlowContract$InputData);
            case 5:
                KProperty[] kPropertyArr2 = PayeesConfirmationBottomSheetScreen.P;
                qji.b bVarU2 = ((PayeesConfirmationBottomSheetScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet.di.PayeesConfirmationBottomSheetScreenInjector");
                hm9.e eVar2 = (hm9.e) bVarU2;
                return new hm9.c(eVar2.f153557b, eVar2.f153558c, (PayeesConfirmationBottomSheetScreenContract$InputData) obj2);
            case 6:
                SavingsCurrencySelectionScreen savingsCurrencySelectionScreen = (SavingsCurrencySelectionScreen) obj3;
                KProperty[] kPropertyArr3 = SavingsCurrencySelectionScreen.W;
                qji.b bVarU22 = savingsCurrencySelectionScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.di.SavingsCurrencySelectionScreenInjector");
                rlb.g gVar = (rlb.g) bVarU22;
                return new rlb.f(gVar.f254990b, gVar.f254991c, savingsCurrencySelectionScreen, (SavingsCurrencySelectionContract$InputData) obj2);
            case 7:
                ContactsChooserScreen contactsChooserScreen = (ContactsChooserScreen) obj3;
                bn3.a aVar9 = (bn3.a) obj2;
                ContactsChooserScreen.Companion aVar10 = ContactsChooserScreen.INSTANCE;
                phm.a aVar11 = (phm.a) ue0.e.j(contactsChooserScreen.m2()).a().get(an3.a.class);
                b60.a aVar12 = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar12 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", an3.a.class, " is not found"));
                }
                in3.e eVar3 = ((in3.e) aVar12.b()).i;
                ContactsChooserInputData contactsChooserInputData = contactsChooserScreen.K;
                contactsChooserInputData.getClass();
                aVar9.getClass();
                return new in3.g(eVar3, contactsChooserScreen, contactsChooserInputData, aVar9);
            case 8:
                PendingTransactionScreen pendingTransactionScreen = (PendingTransactionScreen) obj3;
                KProperty[] kPropertyArr4 = PendingTransactionScreen.c0;
                qji.b bVarQ2 = pendingTransactionScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.transactions.impl.ui.pending.screen.di.PendingTransactionScreenInjector");
                gnf.b bVar = (gnf.b) bVarQ2;
                return new gnf.e(bVar.f144978b, bVar.f144979c, pendingTransactionScreen, (PendingTransactionScreenContract$InputData) obj2);
            case 9:
                return new AnalyticsContext(m72.b.h("dynamic_delivery_lifecycle", com.bumptech.glide.c.g(new e0((gh0.d) obj3, (xg0.g) obj2, 0)), AnalyticsContext.INSTANCE));
            case 10:
                return new AnalyticsContext(m72.b.h("crypto_certificate_issue", com.bumptech.glide.c.g(new e0((eo.b) obj3, (eo.e) obj2, 1)), AnalyticsContext.INSTANCE));
            case 11:
                return new AnalyticsContext(m72.b.h("device_fingerprint_data", com.bumptech.glide.c.g(new nc1.j((Map) obj2, (com.revolut.analytics.tracking.v3.f) obj3, 29)), AnalyticsContext.INSTANCE));
            case 12:
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                SettingsUnlockContext.a aVarNewBuilder = SettingsUnlockContext.newBuilder();
                aVarNewBuilder.c();
                ((SettingsUnlockContext) aVarNewBuilder.f49761b).setMethod((fc) obj3);
                aVarNewBuilder.c();
                ((SettingsUnlockContext) aVarNewBuilder.f49761b).setOutcome((hc) obj2);
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            case 13:
                Map map = (Map) obj2;
                AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                SettingsFeaturesContext.a aVarNewBuilder2 = SettingsFeaturesContext.newBuilder();
                f3 f3VarNewBuilder = h3.newBuilder();
                TreeMap treeMapE = q0.e((Map) obj3);
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(treeMapE.size()));
                for (Map.Entry entry : treeMapE.entrySet()) {
                    Object key = entry.getKey();
                    b4 b4VarNewBuilder = d4.newBuilder();
                    b4VarNewBuilder.h((String) entry.getValue());
                    linkedHashMap.put(key, (d4) b4VarNewBuilder.a());
                }
                f3VarNewBuilder.h(linkedHashMap);
                h3 h3Var = (h3) f3VarNewBuilder.a();
                aVarNewBuilder2.c();
                ((SettingsFeaturesContext) aVarNewBuilder2.f49761b).setAppliedFeatureFlags(h3Var);
                f3 f3VarNewBuilder2 = h3.newBuilder();
                TreeMap treeMapE2 = q0.e(map);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(treeMapE2.size()));
                for (Map.Entry entry2 : treeMapE2.entrySet()) {
                    Object key2 = entry2.getKey();
                    b4 b4VarNewBuilder2 = d4.newBuilder();
                    b4VarNewBuilder2.h((String) entry2.getValue());
                    linkedHashMap2.put(key2, (d4) b4VarNewBuilder2.a());
                }
                f3VarNewBuilder2.h(linkedHashMap2);
                h3 h3Var2 = (h3) f3VarNewBuilder2.a();
                aVarNewBuilder2.c();
                ((SettingsFeaturesContext) aVarNewBuilder2.f49761b).setReceivedFeatureFlags(h3Var2);
                w0 w0VarA2 = aVarNewBuilder2.a();
                companion2.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2));
            case 14:
                qji.b bVarU23 = ((UsPlaidWebViewScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview.di.UsPlaidWebViewScreenInjector");
                xf6.q0 q0Var = (xf6.q0) bVarU23;
                return new r0(q0Var.f304997b, q0Var.f304998c, (no6.c) obj2);
            case 15:
                CarConfirmationScreen carConfirmationScreen = (CarConfirmationScreen) obj3;
                KProperty[] kPropertyArr5 = CarConfirmationScreen.f75547e0;
                qji.b bVarQ22 = carConfirmationScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.di.CarConfirmationScreenInjector");
                q qVar = (q) bVarQ22;
                return new ql7.k(qVar.f247430a, qVar.f247431b, carConfirmationScreen, (CarConfirmationScreenContract$InputData) obj2);
            case 16:
                TaxResidencyPrefetchDataScreen taxResidencyPrefetchDataScreen = (TaxResidencyPrefetchDataScreen) obj3;
                TaxResidencyPrefetchDataScreenContract$InputData taxResidencyPrefetchDataScreenContract$InputData = (TaxResidencyPrefetchDataScreenContract$InputData) obj2;
                qji.b bVarQ23 = taxResidencyPrefetchDataScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.prefetch.di.TaxResidencyPrefetchDataScreenInjector");
                u uVar = (u) ((ooe.a) bVarQ23).b().S(taxResidencyPrefetchDataScreen);
                switch (uVar.f162907a) {
                    case 0:
                        uVar.d = taxResidencyPrefetchDataScreenContract$InputData;
                        break;
                    default:
                        uVar.d = taxResidencyPrefetchDataScreenContract$InputData;
                        break;
                }
                return (v) uVar.mo3800build();
            case 17:
                ChangePhoneFlow changePhoneFlow = (ChangePhoneFlow) obj3;
                return new ljl.h(((ljl.q0) kli.a.n(changePhoneFlow.m2())).E, changePhoneFlow, (ChangePhoneFlowContract$InputData) obj2);
            case 18:
                com.revolut.sso.impl.ui.phone.change_flow.b bVar2 = (com.revolut.sso.impl.ui.phone.change_flow.b) obj3;
                oki.h.t2(bVar2, bVar2.f106661y, new ChangePhoneFlowContract$Step.CreateNewPhone(bVar2.f106655q.f106640a, (EnterPhoneScreenContract$InputData.Mode.Create.PhoneData) obj2), false, null, false, 12);
                return Unit.f186387a;
            case 19:
                com.revolut.sso.impl.ui.phone.change_flow.b bVar3 = (com.revolut.sso.impl.ui.phone.change_flow.b) obj3;
                String str = (String) obj2;
                oki.h.t2(bVar3, bVar3.f106661y, new ChangePhoneFlowContract$Step.CreateNewPhone(bVar3.f106655q.f106640a, str != null ? new EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.FullNumber(str) : null), false, null, false, 12);
                return Unit.f186387a;
            case 20:
                OneClickFeedbackFlowContract$InputData oneClickFeedbackFlowContract$InputData = (OneClickFeedbackFlowContract$InputData) obj2;
                phm.a aVar13 = (phm.a) ue0.e.j(((OneClickFeedbackFlow) obj3).m2()).a().get(gp6.e.class);
                b60.a aVar14 = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar14 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", gp6.e.class, " is not found"));
                }
                gp6.e eVar4 = ((gp6.e) aVar14.b()).d;
                oneClickFeedbackFlowContract$InputData.getClass();
                return new gp6.g(eVar4, oneClickFeedbackFlowContract$InputData);
            case 21:
                Function0 function0 = (Function0) obj2;
                ((npi.c) obj3).k = null;
                if (function0 == null) {
                    return null;
                }
                function0.invoke();
                return Unit.f186387a;
            case 22:
                KProperty[] kPropertyArr6 = OverduePaymentScreen.f75661a0;
                qji.b bVarQ24 = ((OverduePaymentScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.overdue_payment.di.OverduePaymentScreenInjector");
                o oVar = (o) bVarQ24;
                return new ql7.w0(oVar.f247408b, oVar.f247409c, (OverduePaymentScreenContract$InputData) obj2);
            case 23:
                ReasonForTransferGoodsScreen reasonForTransferGoodsScreen = (ReasonForTransferGoodsScreen) obj3;
                ReasonForTransferGoodsScreenContract$InputData reasonForTransferGoodsScreenContract$InputData = (ReasonForTransferGoodsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = ReasonForTransferGoodsScreen.f92209b0;
                qji.b bVarQ25 = reasonForTransferGoodsScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.transfer.core.impl.ui.reason.goods.di.ReasonForTransferGoodsScreenInjector");
                lpf.u uVar2 = (lpf.u) ((oqf.a) bVarQ25).b().S(reasonForTransferGoodsScreen);
                switch (uVar2.f199088a) {
                    case 0:
                        uVar2.d = reasonForTransferGoodsScreenContract$InputData;
                        break;
                    default:
                        uVar2.d = reasonForTransferGoodsScreenContract$InputData;
                        break;
                }
                return (lpf.v) uVar2.mo3800build();
            case 24:
                AddMoneyFlowContract$FlowInput addMoneyFlowContract$FlowInput = (AddMoneyFlowContract$FlowInput) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((AddMoneyFlow) obj3).m2()).a().get(fpg.c.class);
                b60.a aVar16 = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar16 != null) {
                    return new wpg.c(((wpg.l) aVar16.b()).F, addMoneyFlowContract$FlowInput);
                }
                throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
            case 25:
                ViewImageFlowContract$InputData viewImageFlowContract$InputData = (ViewImageFlowContract$InputData) obj2;
                phm.a aVar17 = (phm.a) ue0.e.j(((ViewImageFlow) obj3).m2()).a().get(grg.a.class);
                b60.a aVar18 = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar18 != null) {
                    return new mrg.d(((mrg.c) aVar18.b()).f208127c, viewImageFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", grg.a.class, " is not found"));
            case 26:
                WealthProtectionSsoFlowContract$InputData wealthProtectionSsoFlowContract$InputData = (WealthProtectionSsoFlowContract$InputData) obj2;
                phm.a aVar19 = (phm.a) ue0.e.j(((WealthProtectionSsoFlow) obj3).m2()).a().get(krh.c.class);
                b60.a aVar20 = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar20 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", krh.c.class, " is not found"));
                }
                kgm.i iVarA = ((krh.c) aVar20.b()).a();
                iVarA.getClass();
                iVarA.f184024c = wealthProtectionSsoFlowContract$InputData;
                s.h((WealthProtectionSsoFlowContract$InputData) iVarA.f184024c, WealthProtectionSsoFlowContract$InputData.class);
                return new krh.b((krh.a) iVarA.f184023b, (WealthProtectionSsoFlowContract$InputData) iVarA.f184024c);
            case 27:
                AnalyticsEditCycleScreen.Companion aVar21 = AnalyticsEditCycleScreen.INSTANCE;
                qji.b bVarQ26 = ((AnalyticsEditCycleScreen) obj3).Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.retail.feature.impl.budgeting.ui.rev10.edit_cycle.di.AnalyticsEditCycleScreenInjector");
                erj.k kVar = (erj.k) bVarQ26;
                return new erj.g(kVar.f128715b, kVar.f128716c, (AnalyticsEditCycleScreenContract$InputData) obj2);
            case 28:
                KProperty[] kPropertyArr8 = CreditCardAnticipationConfirmationScreen.R;
                qji.b bVarU24 = ((CreditCardAnticipationConfirmationScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.di.CreditCardAnticipationConfirmationScreenInjector");
                b1 b1Var = (b1) bVarU24;
                return new h0(b1Var.f175998b, b1Var.f175999c, (CreditCardAnticipationConfirmationScreenContract$InputData) obj2);
            default:
                GroupTransactionsScreenContract$InputData groupTransactionsScreenContract$InputData = (GroupTransactionsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = GroupTransactionsScreen.S;
                phm.a aVar22 = (phm.a) ue0.e.j(((GroupTransactionsScreen) obj3).m2()).a().get(kr9.l.class);
                b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar23 != null) {
                    return new t(((kr9.l) aVar23.b()).F, groupTransactionsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kr9.l.class, " is not found"));
        }
    }
}
