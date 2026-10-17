package pe2;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label.EditLabelScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label.EditLabelScreenContract$InputData;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreen;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlow;
import com.revolut.feature.external_accounts.impl.ui.link.screens.accounts_to_link.AccountsToLinkScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.intro.IntroController;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.intro.IntroControllerContract$InputData;
import com.revolut.feature.payees.impl.ui.payees_list.PayeesListScreen;
import com.revolut.feature.payees.impl.ui.payees_list.PayeesListScreenContract$InputData;
import com.revolut.feature.payinstore.impl.ui.flow.PayInStoreFlow;
import com.revolut.feature.payinstore.impl.ui.flow.PayInStoreFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreenContract$InputData;
import com.revolut.feature.pockets.impl.details_v2.qr.AccountQrCodeScreen;
import com.revolut.feature.pockets.impl.details_v2.qr.AccountQrCodeScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreen;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionScreen;
import com.revolut.feature.rewards.api.navigation.RewardsFeatureConfig;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreen;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$InputData;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlow;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlowContract$ChecklistFlowInputData;
import com.revolut.feature.view.image.core.BaseViewImageContract$InputData;
import com.revolut.feature.view.image.impl.ui.PreviewImageScreen;
import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresController;
import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresControllerContract$Input;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlow;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlowContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlow;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import hha.w0;
import java.util.HashMap;
import jm4.a0;
import jm4.a3;
import jm4.b1;
import jm4.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import mkh.s;
import mkh.u;
import oda.o;
import oi9.w;
import phk.q;
import pjl.t0;
import pjl.z0;
import pmk.v;
import ql7.h0;
import ql7.h1;
import ql7.i1;
import ufg.j0;
import ufg.l0;
import xf6.r2;
import xf6.w2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f235318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f235319c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f235317a = i;
        this.f235318b = obj2;
        this.f235319c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r6v48 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f235317a;
        int i2 = 12;
        int i3 = 26;
        int i5 = 0;
        Object obj2 = this.f235319c;
        Object obj3 = this.f235318b;
        switch (i) {
            case 0:
                SwishHomeAreaScreenContract$InputData swishHomeAreaScreenContract$InputData = (SwishHomeAreaScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = SwishHomeAreaScreen.R;
                phm.a aVar = (phm.a) ue0.e.j(((SwishHomeAreaScreen) obj3).m2()).a().get(he2.c.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( != 0) {
                    return new he2.g(((he2.c) b()).f151532h, swishHomeAreaScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", he2.c.class, " is not found"));
            case 1:
                AccountQrCodeScreenContract$InputData accountQrCodeScreenContract$InputData = (AccountQrCodeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = AccountQrCodeScreen.f80879e0;
                phm.a aVar2 = (phm.a) ue0.e.j(((AccountQrCodeScreen) obj3).m2()).a().get(o.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 != null) {
                    return new oda.e(((o) ((qea.a) aVar3.b())).P, accountQrCodeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 2:
                PodNomineesFlowContract$InputData podNomineesFlowContract$InputData = (PodNomineesFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((PodNomineesFlow) obj3).m2()).a().get(kek.c.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 != null) {
                    return new kek.d(((kek.c) aVar5.b()).f183119m, podNomineesFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kek.c.class, " is not found"));
            case 3:
                pgk.k kVar = (pgk.k) obj3;
                jf0.c cVar = (jf0.c) obj2;
                HashMap map = cVar.d;
                xfa.b bVarA = pgk.l.a(cVar);
                if (bVarA == null) {
                    bVarA = xfa.b.PLAN_CHANGE_DEEPLINK;
                }
                String str = (String) map.get("preselectedPlan");
                w0 w0VarG = str != null ? cp5.d.G(w0.Companion, str) : null;
                PlanSelection planTier = w0VarG != null ? new PlanSelection.PlanTier(w0VarG) : PlanSelection.Default.f103355a;
                PlanChangeSuccessActionStrategy.CardOrderIfNeeded cardOrderIfNeeded = new PlanChangeSuccessActionStrategy.CardOrderIfNeeded(kVar.e.d());
                return Boolean.parseBoolean((String) map.get("modal")) ? new FeatureCommand(new KompotOverlayFeatureConfig(new InternalPricingPlanFeatureConfig.InternalPlanChange.Destination(bVarA, planTier, cardOrderIfNeeded), yhi.b.POPUP, (Integer) , i2)) : new FeatureCommand(new InternalPricingPlanFeatureConfig.InternalPlanChange(bVarA, planTier, cardOrderIfNeeded));
            case 4:
                return new FeatureCommand(new RewardsFeatureConfig.RewardDetails((String) obj3, pgk.k.c((jf0.c) obj2), 24));
            case 5:
                w0 w0Var = (w0) obj3;
                String str2 = (String) ((jf0.c) obj2).d.get("_sm_pa_token");
                if (str2 == null || d0.W(str2)) {
                    str2 = null;
                }
                return new FeatureCommand(new KompotOverlayFeatureConfig(new InternalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination(w0Var, str2), yhi.b.BOTTOM_DIALOG, (Integer) , i2));
            case 6:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar6 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a) obj3;
                aVar6.l2(new q(aVar6, (String) obj2, , i5), new yi5.b(i3));
                return Unit.f186387a;
            case 7:
                pi6.k kVar2 = (pi6.k) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((OpenBankingAuthPaymentFlow) obj3).m2()).a().get(w2.class);
                b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar8 != null) {
                    return new r2(((w2) aVar8.b()).J, kVar2);
                }
                throw new IllegalStateException(a0.d.q("Api ", w2.class, " is not found"));
            case 8:
                TravelMilesTransferScreen travelMilesTransferScreen = (TravelMilesTransferScreen) obj3;
                TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData = (TravelMilesTransferScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = TravelMilesTransferScreen.T;
                qji.b bVarU2 = travelMilesTransferScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.transfer.di.TravelMilesTransferScreenInjector");
                j0 j0Var = (j0) ((sig.a) bVarU2).j().mo3808a(travelMilesTransferScreen);
                switch (j0Var.f279750a) {
                    case 0:
                        j0Var.d = travelMilesTransferScreenContract$InputData;
                        break;
                    default:
                        j0Var.d = travelMilesTransferScreenContract$InputData;
                        break;
                }
                return (l0) j0Var.mo3783build();
            case 9:
                ((z0) obj3).f236876h.removeOnAccountsUpdatedListener((t0) obj2);
                return Unit.f186387a;
            case 10:
                qji.b bVarU22 = ((IntroController) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.right_to_cancel.intro.di.IntroControllerInjector");
                w wVar = (w) bVarU22;
                return new oi9.c(wVar.f225579b, wVar.f225580c, (IntroControllerContract$InputData) obj2);
            case 11:
                DisclosuresControllerContract$Input disclosuresControllerContract$Input = (DisclosuresControllerContract$Input) obj2;
                KProperty[] kPropertyArr4 = DisclosuresController.Q;
                phm.a aVar9 = (phm.a) ue0.e.j(((DisclosuresController) obj3).m2()).a().get(vhh.a.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 != null) {
                    return new mkh.g(((s) ((u) aVar10.b())).l0, disclosuresControllerContract$Input);
                }
                throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
            case 12:
                KProperty[] kPropertyArr5 = PayeesListScreen.Q;
                qji.b bVarU23 = ((PayeesListScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.payees_list.di.PayeesListScreenInjector");
                hm9.e eVar = (hm9.e) bVarU23;
                return new hm9.f(eVar.f153557b, eVar.f153558c, (PayeesListScreenContract$InputData) obj2);
            case 13:
                SavingsProductSelectionScreen savingsProductSelectionScreen = (SavingsProductSelectionScreen) obj3;
                KProperty[] kPropertyArr6 = SavingsProductSelectionScreen.Y;
                qji.b bVarU24 = savingsProductSelectionScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.di.SavingsProductSelectionScreenInjector");
                rlb.g gVar = (rlb.g) bVarU24;
                return new rlb.j(gVar.f254990b, gVar.f254991c, savingsProductSelectionScreen, (SavingsProductSelectionContract$InputData) obj2);
            case 14:
                ChecklistFlowContract$ChecklistFlowInputData checklistFlowContract$ChecklistFlowInputData = (ChecklistFlowContract$ChecklistFlowInputData) obj2;
                phm.a aVar11 = (phm.a) ue0.e.j(((ChecklistFlow) obj3).m2()).a().get(kmg.d.class);
                b60.a aVar12 = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar12 != null) {
                    return new kmg.b(((kmg.d) aVar12.b()).f185875h, checklistFlowContract$ChecklistFlowInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kmg.d.class, " is not found"));
            case 15:
                v vVar = (v) obj3;
                vVar.l2(new pmk.u(vVar, (String) obj2, , i5), new yi5.b(i3));
                return Unit.f186387a;
            case 16:
                pn6.g gVar2 = (pn6.g) obj2;
                KProperty[] kPropertyArr7 = AccountsToLinkScreen.R;
                phm.a aVar13 = (phm.a) ue0.e.j(((AccountsToLinkScreen) obj3).m2()).a().get(xf6.e.class);
                b60.a aVar14 = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar14 != null) {
                    return new xf6.f(((xf6.e) aVar14.b()).d, gVar2);
                }
                throw new IllegalStateException(a0.d.q("Api ", xf6.e.class, " is not found"));
            case 17:
                PayInStoreFlowContract$InputData payInStoreFlowContract$InputData = (PayInStoreFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((PayInStoreFlow) obj3).m2()).a().get(kn9.a.class);
                b60.a aVar16 = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar16 != null) {
                    return new kn9.b(((kn9.a) aVar16.b()).f186037h, payInStoreFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kn9.a.class, " is not found"));
            case 18:
                KProperty[] kPropertyArr8 = EditLabelScreen.Q;
                qji.b bVarU25 = ((EditLabelScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label.di.EditLabelScreenInjector");
                return new ao1.h((EditLabelScreenContract$InputData) obj2);
            case 19:
                EstimatedCarValuePickerScreen estimatedCarValuePickerScreen = (EstimatedCarValuePickerScreen) obj3;
                KProperty[] kPropertyArr9 = EstimatedCarValuePickerScreen.f75552b0;
                qji.b bVarQ2 = estimatedCarValuePickerScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.di.EstimatedCarValuePickerScreenInjector");
                ql7.q qVar = (ql7.q) bVarQ2;
                return new h0(qVar.f247430a, qVar.f247431b, estimatedCarValuePickerScreen, (EstimatedCarValuePickerScreenContract$InputData) obj2);
            case 20:
                KProperty[] kPropertyArr10 = RationalesScreen.c0;
                qji.b bVarQ22 = ((RationalesScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.rationales.di.RationalesScreenInjector");
                ine.l lVar = (ine.l) bVarQ22;
                return new ine.h(lVar.f162868b, lVar.f162869c, (RationalesScreenContract$InputData) obj2);
            case 21:
                AdditionalCardsManagementScreen additionalCardsManagementScreen = (AdditionalCardsManagementScreen) obj3;
                KProperty[] kPropertyArr11 = AdditionalCardsManagementScreen.U;
                qji.b bVarU26 = additionalCardsManagementScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.management.di.AdditionalCardsManagementScreenInjector");
                z zVar = (z) bVarU26;
                return new a0(zVar.f176460b, zVar.f176461c, additionalCardsManagementScreen, (AdditionalCardsManagementScreenContract$InputData) obj2);
            case 22:
                Drawable colorDrawable = (Drawable) obj3;
                ppi.c cVar2 = (ppi.c) obj2;
                if (colorDrawable instanceof ColorDrawable) {
                    colorDrawable = new ColorDrawable(((ColorDrawable) colorDrawable).getColor());
                }
                BaseDelegatesActivity baseDelegatesActivity = cVar2.f238607h;
                baseDelegatesActivity.getWindow().setBackgroundDrawable(colorDrawable);
                baseDelegatesActivity.setTranslucent(false);
                cVar2.f238611n.invoke();
                return Unit.f186387a;
            case 23:
                SmartDrivingScreen smartDrivingScreen = (SmartDrivingScreen) obj3;
                KProperty[] kPropertyArr12 = SmartDrivingScreen.f75663d0;
                qji.b bVarQ23 = smartDrivingScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.di.SmartDrivingScreenInjector");
                h1 h1Var = (h1) bVarQ23;
                return new i1(h1Var.f247322b, h1Var.f247323c, smartDrivingScreen, (SmartDrivingScreenContract$InputData) obj2);
            case 24:
                AdditionalFieldsScreenContract$InputData additionalFieldsScreenContract$InputData = (AdditionalFieldsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = AdditionalFieldsScreen.Q;
                phm.a aVar17 = (phm.a) ue0.e.j(((AdditionalFieldsScreen) obj3).m2()).a().get(vpa.a.class);
                b60.a aVar18 = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar18 != null) {
                    return new jqa.a(((jqa.e) ((jqa.s) aVar18.b())).O, additionalFieldsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
            case 25:
                BankListScreenContract$InputData bankListScreenContract$InputData = (BankListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr14 = BankListScreen.R;
                qji.b bVarU27 = ((BankListScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.di.BankListScreenInjector");
                zpc.l lVar2 = (zpc.l) bVarU27;
                zpc.k kVar3 = lVar2.f324270b;
                zpc.l lVar3 = lVar2.f324271c;
                bankListScreenContract$InputData.getClass();
                return new zpc.b(kVar3, lVar3, bankListScreenContract$InputData);
            case 26:
                BaseViewImageContract$InputData baseViewImageContract$InputData = (BaseViewImageContract$InputData) obj2;
                int i6 = PreviewImageScreen.S;
                qji.b bVarQ24 = ((PreviewImageScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.view.image.impl.ui.di.PreviewImageScreenInjector");
                mrg.d dVar = (mrg.d) bVarQ24;
                mrg.c cVar3 = dVar.f208129b;
                mrg.d dVar2 = dVar.f208130c;
                baseViewImageContract$InputData.getClass();
                return new mrg.b(cVar3, dVar2, baseViewImageContract$InputData);
            case 27:
                BudgetingFlowContract$InputData budgetingFlowContract$InputData = (BudgetingFlowContract$InputData) obj2;
                phm.a aVar19 = (phm.a) ue0.e.j(((BudgetingFlow) obj3).m2()).a().get(erj.h.class);
                b60.a aVar20 = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar20 != null) {
                    return new erj.i(((erj.h) aVar20.b()).u, budgetingFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", erj.h.class, " is not found"));
            case 28:
                CreditCardInstalmentAnticipationFlowContract$InputData creditCardInstalmentAnticipationFlowContract$InputData = (CreditCardInstalmentAnticipationFlowContract$InputData) obj2;
                phm.a aVar21 = (phm.a) ue0.e.j(((CreditCardInstalmentAnticipationFlow) obj3).m2()).a().get(a3.class);
                b60.a aVar22 = aVar21 != null ? (b60.a) aVar21.get() : null;
                if (aVar22 != null) {
                    return new b1(((a3) aVar22.b()).Y, creditCardInstalmentAnticipationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            default:
                GroupChatSettingsScreen groupChatSettingsScreen = (GroupChatSettingsScreen) obj3;
                GroupChatSettingsScreenContract$InputData groupChatSettingsScreenContract$InputData = (GroupChatSettingsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr15 = GroupChatSettingsScreen.f79374a0;
                phm.a aVar23 = (phm.a) ue0.e.j(groupChatSettingsScreen.m2()).a().get(kr9.l.class);
                b60.a aVar24 = aVar23 != null ? (b60.a) aVar23.get() : null;
                if (aVar24 != null) {
                    return new kr9.c(((kr9.l) aVar24.b()).F, groupChatSettingsScreen, groupChatSettingsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kr9.l.class, " is not found"));
        }
    }

    public /* synthetic */ c(String str, pgk.k kVar, jf0.c cVar) {
        this.f235317a = 4;
        this.f235318b = str;
        this.f235319c = cVar;
    }

    public /* synthetic */ c(pgk.k kVar, w0 w0Var, jf0.c cVar) {
        this.f235317a = 5;
        this.f235318b = w0Var;
        this.f235319c = cVar;
    }
}
