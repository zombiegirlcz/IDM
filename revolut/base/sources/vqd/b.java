package vqd;

import androidx.camera.camera2.pipe.compat.ActiveCamera;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.entry.MultibancoExternalEnrollmentEntryScreen;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.entry.MultibancoExternalEnrollmentEntryScreenContract$InputData;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlow;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlowContract$InputData;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreen;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.revpoints.CreditCardRevPointsMigrationBottomDialogScreen;
import com.revolut.feature.credit.card.impl.ui.revpoints.CreditCardRevPointsMigrationBottomDialogScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.CreditCardTransactionsFlow;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.CreditCardTransactionsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.LoanDirectDebitFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.LoanDirectDebitRootFlow;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.LoanDocumentSectionController;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.LoanDocumentSectionControllerContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlowContract$InputData;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreen;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreenContract$InputData;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlow;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.trusted.GroupChatTrustedScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.trusted.GroupChatTrustedScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.ContactsSyncOnboardingDescriptor$LaunchMode;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.OnboardingContactSyncFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$ModalStep;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.flow.SharedFaqLazyFlow;
import com.revolut.feature.shared.help_centre.impl.faq.flow.SharedFaqLazyFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow.RevIQFlow;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$Step;
import com.revolut.feature.staking.impl.stakingdetails.v2.StakingDetailsController;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreen;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlow;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$InputData;
import com.revolut.feature.widgets.impl.ui.screen.catalgoue.WidgetCatalogueScreen;
import com.revolut.feature.widgets.impl.ui.screen.catalgoue.WidgetsCatalogueScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreenContract$InputData;
import hvf.q;
import i72.o;
import jm4.a3;
import jm4.g2;
import jm4.k3;
import jm4.z2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kr9.g;
import lu7.s;
import p2k.h0;
import p2k.z;
import ppd.n;
import ppd.o0;
import qsh.f;
import r7d.u;
import s3a.k;
import s3a.r;
import u45.p;
import ue0.e;
import us2.h;
import us2.j;
import vtc.t;
import vtc.w;
import vtc.x;
import wpg.l;
import wpg.m;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f291386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f291387c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f291385a = i;
        this.f291386b = obj2;
        this.f291387c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f291385a;
        Object obj2 = this.f291387c;
        Object obj3 = this.f291386b;
        switch (i) {
            case 0:
                d dVar = (d) obj2;
                phm.a aVar2 = (phm.a) e.j(((RevIQFlow) obj3).m2()).a().get(n.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new o0(((n) aVar.b()).L0, dVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
            case 1:
                WithdrawMoneyFlowContract$InputData withdrawMoneyFlowContract$InputData = (WithdrawMoneyFlowContract$InputData) obj2;
                phm.a aVar3 = (phm.a) e.j(((WithdrawMoneyFlow) obj3).m2()).a().get(fpg.c.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new m(((l) aVar.b()).F, withdrawMoneyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
            case 2:
                vr0.d dVar2 = (vr0.d) obj3;
                Image image = (Image) obj2;
                dVar2.k.remove(image);
                dVar2.f291458l.add(image);
                return Unit.f186387a;
            case 3:
                InstalmentFlowContract$InputData instalmentFlowContract$InputData = (InstalmentFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) e.j(((InstalmentFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new k3(((a3) aVar.b()).Y, instalmentFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 4:
                ReferralWithIncentiveFlowContract$InputData referralWithIncentiveFlowContract$InputData = (ReferralWithIncentiveFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) e.j(((ReferralWithIncentiveFlow) obj3).m2()).a().get(j.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new h(((j) aVar.b()).f, referralWithIncentiveFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
            case 5:
                KProperty[] kPropertyArr = GroupChatTrustedScreen.f79393b0;
                qji.b bVarQ2 = ((GroupChatTrustedScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.payments.groups.impl.ui_chat.trusted.di.GroupChatTrustedScreenInjector");
                g gVar = (g) bVarQ2;
                return new kr9.d(gVar.f188742b, gVar.f188743c, (GroupChatTrustedScreenContract$InputData) obj2);
            case 6:
                return vse.a.a((TicketDetails) obj3, (Function1) obj2);
            case 7:
                KProperty[] kPropertyArr2 = TransferReasonsDeclarationActionsScreen.Q;
                qji.b bVarU2 = ((TransferReasonsDeclarationActionsScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.actions.di.TransferReasonsDeclarationActionsScreenInjector");
                nsf.d dVar3 = (nsf.d) bVarU2;
                return new nsf.c(dVar3.f218811b, dVar3.f218812c, (TransferReasonsDeclarationActionsScreenContract$InputData) obj2);
            case 8:
                WidgetCatalogueScreen widgetCatalogueScreen = (WidgetCatalogueScreen) obj3;
                WidgetsCatalogueScreenContract$InputData widgetsCatalogueScreenContract$InputData = (WidgetsCatalogueScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = WidgetCatalogueScreen.f96382a0;
                qji.b bVarQ22 = widgetCatalogueScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.widgets.impl.ui.screen.catalgoue.di.WidgetCatalogueScreenInjector");
                qsh.e eVar = (qsh.e) ((wsh.a) bVarQ22).c().S(widgetCatalogueScreen);
                switch (eVar.f248851a) {
                    case 0:
                        eVar.f248853c = widgetsCatalogueScreenContract$InputData;
                        break;
                    default:
                        eVar.f248853c = widgetsCatalogueScreenContract$InputData;
                        break;
                }
                return (f) eVar.mo3800build();
            case 9:
                CreditCardRevPointsMigrationBottomDialogScreenContract$InputData creditCardRevPointsMigrationBottomDialogScreenContract$InputData = (CreditCardRevPointsMigrationBottomDialogScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = CreditCardRevPointsMigrationBottomDialogScreen.Q;
                phm.a aVar6 = (phm.a) e.j(((CreditCardRevPointsMigrationBottomDialogScreen) obj3).m2()).a().get(a3.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new g2(((a3) aVar.b()).Y, creditCardRevPointsMigrationBottomDialogScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 10:
                InsuranceDetailsFlowContract$InputData insuranceDetailsFlowContract$InputData = (InsuranceDetailsFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) e.j(((InsuranceDetailsFlow) obj3).m2()).a().get(s.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new lu7.m(((s) aVar.b()).o, insuranceDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
            case 11:
                LinkedWalletsScreenContract$InputData linkedWalletsScreenContract$InputData = (LinkedWalletsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = LinkedWalletsScreen.P;
                phm.a aVar8 = (phm.a) e.j(((LinkedWalletsScreen) obj3).m2()).a().get(t.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new vtc.l(((t) aVar.b()).M, linkedWalletsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
            case 12:
                com.revolut.feature.staking.impl.flow.stake.v2.a aVar9 = (com.revolut.feature.staking.impl.flow.stake.v2.a) obj3;
                oki.h.t2(aVar9, aVar9.f88137r, (StakingControllerContract$Step) obj2, false, null, false, 12);
                return Unit.f186387a;
            case 13:
                ((vv.d) obj3).f292427c.getLifecycle().removeObserver((androidx.core.view.b) obj2);
                return Unit.f186387a;
            case 14:
                CreditCardTransactionsFlowContract$InputData creditCardTransactionsFlowContract$InputData = (CreditCardTransactionsFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) e.j(((CreditCardTransactionsFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new z2(((a3) aVar.b()).Y, creditCardTransactionsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 15:
                KProperty[] kPropertyArr6 = SetTrustedLocationScreen.P;
                qji.b bVarU22 = ((SetTrustedLocationScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.di.SetTrustedLocationScreenInjector");
                x xVar = (x) bVarU22;
                return new w(xVar.f292093b, xVar.f292094c, (SetTrustedLocationScreenContract$InputData) obj2);
            case 16:
                ExtendTicketScreenContract$InputData extendTicketScreenContract$InputData = (ExtendTicketScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = ExtendTicketScreen.S;
                phm.a aVar11 = (phm.a) e.j(((ExtendTicketScreen) obj3).m2()).a().get(q.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new hvf.g(((q) aVar.b()).k, extendTicketScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
            case 17:
                InsuranceProductSummaryScreenContract$InputData insuranceProductSummaryScreenContract$InputData = (InsuranceProductSummaryScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = InsuranceProductSummaryScreen.P;
                phm.a aVar12 = (phm.a) e.j(((InsuranceProductSummaryScreen) obj3).m2()).a().get(qw7.e.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new qw7.g(((qw7.e) aVar.b()).f249809l, insuranceProductSummaryScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", qw7.e.class, " is not found"));
            case 18:
                StakingProduct stakingProduct = (StakingProduct) obj2;
                KProperty[] kPropertyArr9 = StakingDetailsController.T;
                phm.a aVar13 = (phm.a) e.j(((StakingDetailsController) obj3).m2()).a().get(qud.c.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", qud.c.class, " is not found"));
                }
                qud.c cVar = ((qud.c) aVar.b()).f249379y;
                stakingProduct.getClass();
                return new qud.f(cVar, stakingProduct);
            case 19:
                CardLabelScreenContract$InputData cardLabelScreenContract$InputData = (CardLabelScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = CardLabelScreen.f64758b0;
                qji.b bVarQ23 = ((CardLabelScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.card_label.ui.screen.card_label_screen.di.CardLabelScreenInjector");
                iwh.e eVar2 = (iwh.e) ((kwh.a) bVarQ23);
                iwh.c cVar2 = eVar2.f169098b;
                iwh.e eVar3 = eVar2.f169099c;
                cardLabelScreenContract$InputData.getClass();
                return new iwh.f(cVar2, eVar3, cardLabelScreenContract$InputData);
            case 20:
                NationalitiesScreen nationalitiesScreen = (NationalitiesScreen) obj3;
                KProperty[] kPropertyArr11 = NationalitiesScreen.f104198h0;
                qji.b bVarQ24 = nationalitiesScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.di.NationalitiesScreenComponent.NationalitiesScreenInjector");
                kyk.f fVar = (kyk.f) bVarQ24;
                return new kyk.j(fVar.f190939c, fVar.d, nationalitiesScreen, (NationalitiesScreenContract$InputData) obj2);
            case 21:
                return ActiveCamera.wakelock$lambda$0((Function1) obj3, (ActiveCamera) obj2);
            case 22:
                ContactsSyncOnboardingDescriptor$LaunchMode contactsSyncOnboardingDescriptor$LaunchMode = (ContactsSyncOnboardingDescriptor$LaunchMode) obj2;
                phm.a aVar14 = (phm.a) e.j(((OnboardingContactSyncFlow) obj3).m2()).a().get(r.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                }
                k kVar = ((k) ((r) aVar.b())).g0;
                contactsSyncOnboardingDescriptor$LaunchMode.getClass();
                return new s3a.d(kVar, contactsSyncOnboardingDescriptor$LaunchMode);
            case 23:
                RemittanceInputData remittanceInputData = (RemittanceInputData) obj2;
                phm.a aVar15 = (phm.a) e.j(((RemittanceFlow) obj3).m2()).a().get(h0.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", h0.class, " is not found"));
                }
                p2k.x xVar2 = ((p2k.x) aVar.b()).K;
                remittanceInputData.getClass();
                return new z(xVar2, remittanceInputData);
            case 24:
                JointDeeplinkFlowContract$InputData jointDeeplinkFlowContract$InputData = (JointDeeplinkFlowContract$InputData) obj2;
                phm.a aVar16 = (phm.a) e.j(((JointDeeplinkFlow) obj3).m2()).a().get(e48.g.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar != null) {
                    return new e48.l(((e48.g) aVar.b()).z, jointDeeplinkFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
            case 25:
                LoanDirectDebitFlowContract$InputData loanDirectDebitFlowContract$InputData = (LoanDirectDebitFlowContract$InputData) obj2;
                phm.a aVar17 = (phm.a) e.j(((LoanDirectDebitRootFlow) obj3).m2()).a().get(u45.h.class);
                aVar = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar != null) {
                    return new p(((u45.h) aVar.b()).B, loanDirectDebitFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 26:
                KProperty[] kPropertyArr12 = LoanDocumentSectionController.Q;
                qji.b bVarU23 = ((LoanDocumentSectionController) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.di.LoanDocumentSectionControllerInjector");
                u45.r rVar = (u45.r) bVarU23;
                return new u45.q(rVar.f277205b, rVar.f277206c, (LoanDocumentSectionControllerContract$InputData.PaymentReceipts) obj2);
            case 27:
                MultibancoExternalEnrollmentEntryScreen multibancoExternalEnrollmentEntryScreen = (MultibancoExternalEnrollmentEntryScreen) obj3;
                MultibancoExternalEnrollmentEntryScreenContract$InputData multibancoExternalEnrollmentEntryScreenContract$InputData = (MultibancoExternalEnrollmentEntryScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = MultibancoExternalEnrollmentEntryScreen.S;
                phm.a aVar18 = (phm.a) e.j(multibancoExternalEnrollmentEntryScreen.m2()).a().get(i72.m.class);
                aVar = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                }
                i72.m mVar = ((i72.m) aVar.b()).A;
                multibancoExternalEnrollmentEntryScreen.m2().getClass();
                return new o(mVar, multibancoExternalEnrollmentEntryScreenContract$InputData);
            case 28:
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar3 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) obj3;
                CobrandedCardsValueReminderScreenContract$ModalStep.DowngradeConfirmation downgradeConfirmation = (CobrandedCardsValueReminderScreenContract$ModalStep.DowngradeConfirmation) ((CobrandedCardsValueReminderScreenContract$ModalStep) obj2);
                cVar3.l2(new sxe.g((Object) cVar3, (Object) downgradeConfirmation.f82616a, (Object) downgradeConfirmation.f82617b, (String) null, (Continuation) null, 28), new w7b.p(cVar3, 0));
                return Unit.f186387a;
            default:
                SharedFaqLazyFlowContract$InputData sharedFaqLazyFlowContract$InputData = (SharedFaqLazyFlowContract$InputData) obj2;
                phm.a aVar19 = (phm.a) e.j(((SharedFaqLazyFlow) obj3).m2()).a().get(r7d.l.class);
                aVar = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar != null) {
                    return new u(((r7d.l) aVar.b()).f252135l, sharedFaqLazyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r7d.l.class, " is not found"));
        }
    }
}
