package eq8;

import android.view.WindowManager;
import com.feature.user.details.impl.ui.flow.UserDetailsFlow;
import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$InputData;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlow;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsController;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsScreenContract$InputData;
import com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData;
import com.revolut.feature.card_payment_method.impl.flows.link_card.flow.LinkCardFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreen;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreen;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlow;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreen;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreen;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreen;
import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreenContract$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.RevPointsSpareChangeFullBannerGridController;
import com.revolut.feature.revolutpay.impl.ui.nativetopup.RevolutPayTopUpScreen;
import com.revolut.feature.revolutpay.impl.ui.nativetopup.RevolutPayTopUpScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet.TotalWealthTypeSelectorContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet.TotalWealthTypeSelectorController;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.MerchantRedirectFlow;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.MerchantRedirectFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlow;
import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlow;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlowContract$InputData;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveController;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreenContract$InputData;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreen;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreenContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlow;
import java.util.List;
import jm4.a3;
import jm4.d1;
import jm4.s0;
import jm4.w2;
import jm4.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ppd.u0;
import ppd.v0;
import us6.g1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f128368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f128369c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, Function0 function0) {
        this.f128367a = 3;
        this.f128368b = dVar;
        this.f128369c = (kotlin.jvm.internal.q) function0;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f128367a;
        Object obj2 = this.f128369c;
        Object obj3 = this.f128368b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = ChallengesOverviewListScreen.V;
                qji.b bVarU2 = ((ChallengesOverviewListScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.di.ChallengesOverviewListScreenComponent.Injector");
                gp8.k kVar = (gp8.k) bVarU2;
                return new gp8.l(kVar.f145316b, kVar.f145317c, (ChallengesOverviewListScreenContract$InputData) obj2);
            case 1:
                AdditionalInformationFlowContract$InputData additionalInformationFlowContract$InputData = (AdditionalInformationFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((AdditionalInformationFlow) obj3).m2()).a().get(wof.a.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new lpf.b(((lpf.i) ((lpf.y) aVar.b())).o, additionalInformationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
            case 2:
                pr.q qVarQ = pu7.a.q(((BiometricVerificationLauncherFlow) obj3).m2());
                Intrinsics.i(qVarQ, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.flow.launcher.di.BiometricVerificationLauncherFlowInjector");
                return new pr.v(qVarQ.f238875l, (BiometricVerificationFlowProvider$InputData) obj2);
            case 3:
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = (com.revolut.biometric_verification.impl.ui.flow.launcher.d) obj3;
                dVar.f50485s.getClass();
                yji.l.a1(dVar, dVar.V2(ds.a.c()), null, null, new chf.a((kotlin.jvm.internal.q) obj2, dVar, null), 3);
                return Unit.f186387a;
            case 4:
                CreditCardInstalmentHubFlowContract$InputData creditCardInstalmentHubFlowContract$InputData = (CreditCardInstalmentHubFlowContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((CreditCardInstalmentHubFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new d1(((a3) aVar.b()).Y, creditCardInstalmentHubFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 5:
                CardRecipientDetailsScreenContract$InputData cardRecipientDetailsScreenContract$InputData = (CardRecipientDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = CardRecipientDetailsScreen.U;
                phm.a aVar4 = (phm.a) ue0.e.j(((CardRecipientDetailsScreen) obj3).m2()).a().get(vpa.a.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new jqa.c(((jqa.e) ((jqa.s) aVar.b())).O, cardRecipientDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
            case 6:
                MerchantRedirectFlowContract$InputData merchantRedirectFlowContract$InputData = (MerchantRedirectFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((MerchantRedirectFlow) obj3).m2()).a().get(yre.e.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new yre.d(((yre.e) aVar.b()).u, merchantRedirectFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", yre.e.class, " is not found"));
            case 7:
                SetOverallBudgetScreen setOverallBudgetScreen = (SetOverallBudgetScreen) obj3;
                KProperty[] kPropertyArr3 = SetOverallBudgetScreen.g0;
                qji.b bVarQ2 = setOverallBudgetScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.di.SetOverallBudgetScreenInjector");
                erj.k kVar2 = (erj.k) bVarQ2;
                return new erj.m(kVar2.f128715b, kVar2.f128716c, setOverallBudgetScreen, (SetOverallBudgetScreenContract$InputData) obj2);
            case 8:
                KProperty[] kPropertyArr4 = TotalWealthTypeSelectorController.Q;
                qji.b bVarU22 = ((TotalWealthTypeSelectorController) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet.di.TotalWealthTypeSelectorComponentScreenInjector");
                u0 u0Var = (u0) bVarU22;
                return new v0(u0Var.f238558b, u0Var.f238559c, (TotalWealthTypeSelectorContract$InputData) obj2);
            case 9:
                KProperty[] kPropertyArr5 = CreditCardChoosePaymentsScreen.S;
                qji.b bVarU23 = ((CreditCardChoosePaymentsScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.choose_payments.di.CreditCardChoosePaymentsScreenInjector");
                z1 z1Var = (z1) bVarU23;
                return new s0(z1Var.f176466b, z1Var.f176467c, (CreditCardChoosePaymentsScreenContract$InputData) obj2);
            case 10:
                RewardsHubDirectRewardScreen rewardsHubDirectRewardScreen = (RewardsHubDirectRewardScreen) obj3;
                RewardsHubDirectRewardScreenContract$InputData rewardsHubDirectRewardScreenContract$InputData = (RewardsHubDirectRewardScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = RewardsHubDirectRewardScreen.S;
                qji.b bVarU24 = rewardsHubDirectRewardScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.di.RewardsHubDirectRewardScreenInjector");
                rtj.h hVar = (rtj.h) bVarU24;
                rtj.g gVar = hVar.f257290b;
                rtj.h hVar2 = hVar.f257291c;
                rewardsHubDirectRewardScreenContract$InputData.getClass();
                return new rtj.e(gVar, hVar2, rewardsHubDirectRewardScreen, rewardsHubDirectRewardScreenContract$InputData);
            case 11:
                CreditCardStatementScreen creditCardStatementScreen = (CreditCardStatementScreen) obj3;
                CreditCardStatementScreenContract$InputData creditCardStatementScreenContract$InputData = (CreditCardStatementScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = CreditCardStatementScreen.j0;
                phm.a aVar6 = (phm.a) ue0.e.j(creditCardStatementScreen.m2()).a().get(a3.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new w2(((a3) aVar.b()).Y, creditCardStatementScreen, creditCardStatementScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 12:
                ev4.q qVar = (ev4.q) obj3;
                ll4.d0 breakdown = (ll4.d0) obj2;
                sv4.a aVar7 = qVar.f129730t;
                xi0.b currency = qVar.A2().f129707b;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                Intrinsics.checkNotNullParameter(currency, "currency");
                ll4.z zVar = breakdown.e;
                Long l2 = zVar.d;
                CellDetailsDelegate.Model model = l2 != null ? new CellDetailsDelegate.Model("id_cell_purchase_rate", new TextLocalisedClause(R$string.credit_statement_purchase_rate, null, null, 14), new MoneyClause(new dj0.d(l2.longValue(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
                Long l3 = zVar.e;
                CellDetailsDelegate.Model model2 = l3 != null ? new CellDetailsDelegate.Model("id_cell_cash_balance", new TextLocalisedClause(R$string.credit_statement_cash_balance, null, null, 14), new MoneyClause(new dj0.d(l3.longValue(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
                Long l4 = zVar.f196565a;
                CellDetailsDelegate.Model model3 = l4 != null ? new CellDetailsDelegate.Model("id_cell_transfer_balance", new TextLocalisedClause(R$string.credit_statement_transfer_balance, null, null, 14), new MoneyClause(new dj0.d(l4.longValue(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
                Long l5 = zVar.f196567c;
                CellDetailsDelegate.Model[] elements = {model, model2, model3, l5 != null ? new CellDetailsDelegate.Model("id_cell_interest_on_interest", new TextLocalisedClause(R$string.credit_statement_interest_on_interest_fees, null, null, 14), new MoneyClause(new dj0.d(l5.longValue(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null, new CellDetailsDelegate.Model("id_cell_total_interest", new TextLocalisedClause(R$string.credit_statement_total_interest, null, null, 14), new MoneyClause(new dj0.d(zVar.a(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.credit_statement_interest_breakdown, null, null, 14), null, null, 30);
                yp0.b.k(listL, 0, R$attr.uikit_dp24, 0, 0, 29);
                qVar.f129727q.x(new rp0.y(listL, tVar, rp0.l.WINDOW, null, null, null, 1016));
                return Unit.f186387a;
            case 13:
                AllPolicyDocumentsScreen allPolicyDocumentsScreen = (AllPolicyDocumentsScreen) obj3;
                KProperty[] kPropertyArr8 = AllPolicyDocumentsScreen.f76093b0;
                qji.b bVarQ22 = allPolicyDocumentsScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.di.AllPolicyDocumentsScreenInjector");
                return (lu7.b0) ((fv7.a) ((fv7.b) bVarQ22).b().S(allPolicyDocumentsScreen)).d((AllPolicyDocumentsScreenContract$InputData) obj2).mo3800build();
            case 14:
                AsftTimeSlotPickerScreen asftTimeSlotPickerScreen = (AsftTimeSlotPickerScreen) obj3;
                KProperty[] kPropertyArr9 = AsftTimeSlotPickerScreen.R;
                qji.b bVarU25 = asftTimeSlotPickerScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.di.AsftTimeSlotPickerScreenInjector");
                lti.k kVar3 = (lti.k) bVarU25;
                return new lti.r(kVar3.f199922a, kVar3.f199923b, asftTimeSlotPickerScreen, (AsftTimeSlotPickerScreenContract$InputData) obj2);
            case 15:
                ExternalCardDetailsFlowContract$InputData externalCardDetailsFlowContract$InputData = (ExternalCardDetailsFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((ExternalCardDetailsFlow) obj3).m2()).a().get(qve.z.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new qve.e(((qve.k) aVar.b()).X, externalCardDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", qve.z.class, " is not found"));
            case 16:
                AutoInvestMoveScreenContract$InputData autoInvestMoveScreenContract$InputData = (AutoInvestMoveScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = AutoInvestMoveController.R;
                phm.a aVar9 = (phm.a) ue0.e.j(((AutoInvestMoveController) obj3).m2()).a().get(dwh.c.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new dwh.b(((dwh.c) aVar.b()).f120404j, autoInvestMoveScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", dwh.c.class, " is not found"));
            case 17:
                KProperty[] kPropertyArr11 = JuniorUpgradeScreen.f101760a0;
                qji.b bVarQ23 = ((JuniorUpgradeScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.di.JuniorUpgradeScreenInjector");
                yxj.b bVar = (yxj.b) bVarQ23;
                return new yxj.d(bVar.f317707b, bVar.f317708c, (JuniorUpgradeScreenContract$InputData) obj2);
            case 18:
                KProperty[] kPropertyArr12 = RevPointsChallengesHomeScreen.U;
                qji.b bVarU26 = ((RevPointsChallengesHomeScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.challenges.home.di.RevPointsChallengesHomeScreenInjector");
                zxb.m mVar = (zxb.m) bVarU26;
                return new zxb.h(mVar.f326220b, mVar.f326221c, (RevPointsChallengesHomeScreenContract$InputData) obj2);
            case 19:
                FreelancerWebsiteFlowContract$InputData freelancerWebsiteFlowContract$InputData = (FreelancerWebsiteFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(((FreelancerWebsiteFlow) obj3).m2()).a().get(us6.q.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new g1(((us6.q) aVar.b()).Q, freelancerWebsiteFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
            case 20:
                RevPointsWrappedCardsScreen revPointsWrappedCardsScreen = (RevPointsWrappedCardsScreen) obj3;
                KProperty[] kPropertyArr13 = RevPointsWrappedCardsScreen.V;
                qji.b bVarU27 = revPointsWrappedCardsScreen.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.wrapped.cards.di.RevPointsWrappedCardsScreenInjector");
                zxb.d0 d0Var = (zxb.d0) bVarU27;
                return new zxb.c0(d0Var.f326115b, d0Var.f326116c, revPointsWrappedCardsScreen, (RevPointsWrappedCardsScreenContract$InputData) obj2);
            case 21:
                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar11 = (com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a) obj3;
                f23.c0 c0Var = aVar11.f65106r;
                OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = aVar11.o;
                f23.m0 m0VarA = c0Var.a(orderNewCardFlowContract$InputData, false);
                return mra.d.b(aVar11, new f23.r(m0VarA.f131398a, m0VarA.f131399b, null, zhm.u.c(orderNewCardFlowContract$InputData.f65090a), m0VarA.f131400c, true, false), (cli.n) obj2, null, false, 12);
            case 22:
                RevPointsSpareChangeFullBannerGridControllerApi$InputData revPointsSpareChangeFullBannerGridControllerApi$InputData = (RevPointsSpareChangeFullBannerGridControllerApi$InputData) obj2;
                KProperty[] kPropertyArr14 = RevPointsSpareChangeFullBannerGridController.U;
                phm.a aVar12 = (phm.a) ue0.e.j(((RevPointsSpareChangeFullBannerGridController) obj3).m2()).a().get(w1c.a.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                }
                w1c.a aVar13 = ((w1c.a) aVar.b()).f293821h;
                revPointsSpareChangeFullBannerGridControllerApi$InputData.getClass();
                return new w1c.e(aVar13, revPointsSpareChangeFullBannerGridControllerApi$InputData);
            case 23:
                KProperty[] kPropertyArr15 = DeliveryMethodsController.T;
                qji.b bVarU28 = ((DeliveryMethodsController) obj3).U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.di.DeliveryMethodsScreenInjector");
                x13.q qVar2 = (x13.q) bVarU28;
                return new x13.x(qVar2.f302174c, qVar2.d, (DeliveryMethodsScreenContract$InputData) obj2);
            case 24:
                LinkCardFlow linkCardFlow = (LinkCardFlow) obj3;
                LinkCardFlowInputData linkCardFlowInputData = (LinkCardFlowInputData) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(linkCardFlow.m2()).a().get(c43.h.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", c43.h.class, " is not found"));
                }
                c43.h hVar3 = ((c43.h) aVar.b()).f21028w;
                linkCardFlowInputData.getClass();
                return new c43.l(hVar3, linkCardFlow, linkCardFlowInputData);
            case 25:
                ((WindowManager) ((f5l.h) obj3).f132369b.getValue()).removeScreenRecordingCallback((f5l.g) obj2);
                return Unit.f186387a;
            case 26:
                RevolutPayTopUpScreenContract$InputData revolutPayTopUpScreenContract$InputData = (RevolutPayTopUpScreenContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((RevolutPayTopUpScreen) obj3).m2()).a().get(p7c.r.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new p7c.v(((p7c.r) aVar.b()).D, revolutPayTopUpScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", p7c.r.class, " is not found"));
            case 27:
                KProperty[] kPropertyArr16 = UpcomingTransactionTroubleshooterScreen.j0;
                qji.b bVarQ24 = ((UpcomingTransactionTroubleshooterScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.di.UpcomingTransactionTroubleshooterScreenInjector");
                r7d.t tVar2 = (r7d.t) ((v7d.a) bVarQ24);
                return new r7d.z(tVar2.f252174b, tVar2.f252175c, (UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment) obj2);
            case 28:
                PeerToPeerTransferFlow peerToPeerTransferFlow = (PeerToPeerTransferFlow) obj3;
                PeerToPeerTransferInputData peerToPeerTransferInputData = (PeerToPeerTransferInputData) obj2;
                phm.a aVar16 = (phm.a) ue0.e.j(peerToPeerTransferFlow.m2()).a().get(q8k.e.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", q8k.e.class, " is not found"));
                }
                v8k.c cVar = ((v8k.c) aVar.b()).W;
                peerToPeerTransferInputData.getClass();
                return new v8k.g(cVar, peerToPeerTransferFlow, peerToPeerTransferInputData);
            default:
                UserDetailsFlow userDetailsFlow = (UserDetailsFlow) obj3;
                UserDetailsFlowContract$InputData userDetailsFlowContract$InputData = (UserDetailsFlowContract$InputData) obj2;
                phm.a aVar17 = (phm.a) ue0.e.j(userDetailsFlow.m2()).a().get(va.a.class);
                aVar = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar != null) {
                    return new va.c(((va.a) aVar.b()).f287091q, userDetailsFlow, userDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", va.a.class, " is not found"));
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f128367a = i;
        this.f128368b = obj2;
        this.f128369c = obj3;
    }
}
