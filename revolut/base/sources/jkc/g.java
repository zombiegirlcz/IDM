package jkc;

import com.revolut.feature.apm.core.code.ui.ApmCodeController;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.bottom_sheet.limit_exceeded.CryptoSendLimitExceededBottomSheetController;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.driving_score_guide.DrivingScoreGuideScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.profile_account.ProfileAccountScreen;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsScreen;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreen;
import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.refund.TransferReasonsIsRefundScreen;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlow;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerScreen;
import com.revolut.otp.input.flow.code.OtpCodeInputScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentController;
import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import gim.i;
import jni.s;
import jsl.u0;
import jta.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((h) this.v, continuation, 0);
            case 1:
                return new g((jj2.a) this.v, continuation, 1);
            case 2:
                return new g((BenefitDetailsScreen) this.v, continuation, 2);
            case 3:
                return new g((ProductDocumentsScreen) this.v, continuation, 3);
            case 4:
                return new g((OtpCodeInputScreen) this.v, continuation, 4);
            case 5:
                return new g((s) this.v, continuation, 5);
            case 6:
                return new g((CrossBorderInstitutionsScreen) this.v, continuation, 6);
            case 7:
                return new g((ProfileAccountScreen) this.v, continuation, 7);
            case 8:
                return new g((CreditCardCashbackDetailsScreen) this.v, continuation, 8);
            case 9:
                return new g((CryptoSendLimitExceededBottomSheetController) this.v, continuation, 9);
            case 10:
                return new g((DrivingScoreGuideScreen) this.v, continuation, 10);
            case 11:
                return new g((com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a) this.v, continuation, 11);
            case 12:
                return new g((com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) this.v, continuation, 12);
            case 13:
                return new g((BaseInvestOrderDetailsScreen) this.v, continuation, 13);
            case 14:
                return new g((u0) this.v, continuation, 14);
            case 15:
                return new g((v) this.v, continuation, 15);
            case 16:
                return new g((TransferReasonsIsRefundScreen) this.v, continuation, 16);
            case 17:
                return new g((CreditCardPseRepayScreen) this.v, continuation, 17);
            case 18:
                return new g((AsftPassAvailableSoonScreen) this.v, continuation, 18);
            case 19:
                return new g((IndexMarketSentimentController) this.v, continuation, 19);
            case 20:
                return new g((SecurityHubScreen) this.v, continuation, 20);
            case 21:
                return new g((com.revolut.feature.security_hub.impl.ui.security_hub.c) this.v, continuation, 21);
            case 22:
                return new g((TravelItineraryEditDatesScreen) this.v, continuation, 22);
            case 23:
                return new g((ApmCodeController) this.v, continuation, 23);
            case 24:
                return new g((jyb.c) this.v, continuation, 24);
            case 25:
                return new g((AccountPickerScreen) this.v, continuation, 25);
            case 26:
                return new g((k0d.b) this.v, continuation, 26);
            case 27:
                return new g((k0g.c) this.v, continuation, 27);
            case 28:
                return new g((StockLendingTransactionDetailsScreen) this.v, continuation, 28);
            default:
                return new g((TravelExperiencesTabsFlow) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 24:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                break;
        }
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d8  */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v78, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jkc.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
