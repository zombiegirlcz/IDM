package nuh;

import com.revolut.feature.apm.core.ui.impl.ui.qr.details.QrDetailsFlow;
import com.revolut.feature.apm.core.ui.impl.ui.transactions_list.area.ApmTransactionAreaListScreen;
import com.revolut.feature.card_management.impl.ui.kompot.replace.reason.CardReplaceReasonPickerController;
import com.revolut.feature.card_screen.impl.kompot.subscriptions_list.SubscriptionsListController;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.InsuranceScreen;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeController;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreen;
import com.revolut.feature.onboarding.impl.onboarding.contractual_documentation.screen.ContractualDocsController;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreen;
import com.revolut.feature.retail.cfd.impl.screens.settings.CfdSettingsController;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier.SelectTrackingCarrierScreen;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlow;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin_details.TravelFlightsCheckInDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import o29.m;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a) this.v, continuation, 0);
            case 1:
                return new j((CfacCoverageSelectionScreen) this.v, continuation, 1);
            case 2:
                return new j((StockFinancialsStatementsController) this.v, continuation, 2);
            case 3:
                return new j((TransportLocationChooserScreen) this.v, continuation, 3);
            case 4:
                return new j((com.revolut.feature.referrals.impl.personalized_tracking.a) this.v, continuation, 4);
            case 5:
                return new j((DirectDebitAccountConfirmationScreen) this.v, continuation, 5);
            case 6:
                return new j((MandateTopupFlow) this.v, continuation, 6);
            case 7:
                return new j((CardReplaceReasonPickerController) this.v, continuation, 7);
            case 8:
                return new j((FreelancerSaleDetailsScreen) this.v, continuation, 8);
            case 9:
                return new j((com.revolut.feature.payments.splitbill.impl.ui_new.e) this.v, continuation, 9);
            case 10:
                return new j((m) this.v, continuation, 10);
            case 11:
                return new j((TravelExperiencesItineraryScreen) this.v, continuation, 11);
            case 12:
                return new j((QrDetailsFlow) this.v, continuation, 12);
            case 13:
                return new j((o3d.e) this.v, continuation, 13);
            case 14:
                return new j((ApmTransactionAreaListScreen) this.v, continuation, 14);
            case 15:
                return new j((CreditAddressSearchScreen) this.v, continuation, 15);
            case 16:
                return new j((CfdSettingsController) this.v, continuation, 16);
            case 17:
                return new j((InvestmentsController) this.v, continuation, 17);
            case 18:
                return new j((TravelFlightsCheckInDetailsScreen) this.v, continuation, 18);
            case 19:
                return new j((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.b) this.v, continuation, 19);
            case 20:
                return new j((CobrandedCardsPlanHubRewardSelectionScreen) this.v, continuation, 20);
            case 21:
                return new j((SubscriptionsListController) this.v, continuation, 21);
            case 22:
                return new j((LoanRepaymentTypeController) this.v, continuation, 22);
            case 23:
                return new j((ContractualDocsController) this.v, continuation, 23);
            case 24:
                return new j((EvidenceTypeSelectionScreen) this.v, continuation, 24);
            case 25:
                return new j((ob8.a) this.v, continuation, 25);
            case 26:
                return new j((PixQrCodeAddressScreen) this.v, continuation, 26);
            case 27:
                return new j((SelectTrackingCarrierScreen) this.v, continuation, 27);
            case 28:
                return new j((TravelHotelsCampaignsHubScreen) this.v, continuation, 28);
            default:
                return new j((InsuranceScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v143, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nuh.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
