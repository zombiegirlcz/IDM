package la8;

import aw0.n6;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items.CategoryItemsScreen;
import com.revolut.feature.apm.bills.billers.impl.ui.search.BillerSearchScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.SelectLoanController;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesController;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_list.BenefitListScreen;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.public_experiments.PublicExperimentsScreen;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.modal_sheet.ModalInfoSheetScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreen;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallController;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities.TravelHotelsPropertyAmenitiesScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.close_connections_bottom_sheet.CloseConnectionsBottomSheet;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreen;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.PlanGiftingSendConfirmationScreen;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.MilestoneRewardsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.PlanSwitchToAnnualScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import lae.n;
import lfg.o;
import ll7.e0;
import mii.q;
import nii.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h((com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) this.v, continuation, 0);
            case 1:
                return new h((n) this.v, continuation, 1);
            case 2:
                return new h((laj.d) this.v, continuation, 2);
            case 3:
                return new h((com.revolut.core.backend_flow.impl.ui.form_screen.a) this.v, continuation, 3);
            case 4:
                return new h((OrderDetailsScreen) this.v, continuation, 4);
            case 5:
                return new h((PlanGiftingSendConfirmationScreen) this.v, continuation, 5);
            case 6:
                return new h((SelectLoanController) this.v, continuation, 6);
            case 7:
                return new h((TravelHotelsPropertyAmenitiesScreen) this.v, continuation, 7);
            case 8:
                return new h((MilestoneRewardsScreen) this.v, continuation, 8);
            case 9:
                return new h((CategoryItemsScreen) this.v, continuation, 9);
            case 10:
                return new h((com.revolut.feature.apm.upi.impl.flow.b) this.v, continuation, 10);
            case 11:
                return new h((o) this.v, continuation, 11);
            case 12:
                return new h((CryptoFeaturesController) this.v, continuation, 12);
            case 13:
                return new h((aah.g) this.v, continuation, 13);
            case 14:
                return new h((TravelMilesFlightLocationPickerScreen) this.v, continuation, 14);
            case 15:
                return new h((EsimPlanDurationPickerBottomSheetScreen) this.v, continuation, 15);
            case 16:
                return new h((PayLaterRepaymentDetailsScreen) this.v, continuation, 16);
            case 17:
                return new h((ConsentDetailsScreen) this.v, continuation, 17);
            case 18:
                return new h((e0) this.v, continuation, 18);
            case 19:
                return new h((ModalInfoSheetScreen) this.v, continuation, 19);
            case 20:
                return new h((com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.v, continuation, 20);
            case 21:
                return new h((BillerSearchScreen) this.v, continuation, 21);
            case 22:
                return new h((BenefitListScreen) this.v, continuation, 22);
            case 23:
                return new h((lnb.b) this.v, continuation, 23);
            case 24:
                return new h((RiskMetricsScreen) this.v, continuation, 24);
            case 25:
                return new h((PendingTransactionRecallController) this.v, continuation, 25);
            case 26:
                return new h((com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) this.v, continuation, 26);
            case 27:
                return new h((PlanSwitchToAnnualScreen) this.v, continuation, 27);
            case 28:
                return new h((PublicExperimentsScreen) this.v, continuation, 28);
            default:
                return new h((CloseConnectionsBottomSheet) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((h) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((h) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((h) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v89, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la8.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
