package g85;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.card_reader_settings.CardReaderSettingsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueScreen;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreen;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.other_liabilities.DebtV2OtherLiabilitiesController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerController;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenController;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreen;
import com.revolut.feature.pay_later.impl.ui.planslist.PayLaterPlansListScreen;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreen;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionController;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.lockup_period.FundLockupPeriodScreen;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreen;
import com.revolut.feature.wealth.ui.impl.trade_redesign.popular_commodities.PopularCommoditiesController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreen;
import gc1.q;
import gd3.k;
import gd8.x;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((StrategyPickerController) this.v, continuation, 0);
            case 1:
                return new f((DebtV2OtherLiabilitiesController) this.v, continuation, 1);
            case 2:
                return new f((gb8.b) this.v, continuation, 2);
            case 3:
                return new f((CardReaderSettingsScreen) this.v, continuation, 3);
            case 4:
                return new f((q) this.v, continuation, 4);
            case 5:
                return new f((k) this.v, continuation, 5);
            case 6:
                return new f((gd8.c) this.v, continuation, 6);
            case 7:
                return new f((x) this.v, continuation, 7);
            case 8:
                return new f((CatalogueScreen) this.v, continuation, 8);
            case 9:
                return new f((EarnAssetsPreviewScreenController) this.v, continuation, 9);
            case 10:
                return new f((FundLockupPeriodScreen) this.v, continuation, 10);
            case 11:
                return new f((ChecklistStepDetailsScreen) this.v, continuation, 11);
            case 12:
                return new f((ghl.e) this.v, continuation, 12);
            case 13:
                return new f((SelectSolicitorController) this.v, continuation, 13);
            case 14:
                return new f((gie.e) this.v, continuation, 14);
            case 15:
                return new f((gjh.d) this.v, continuation, 15);
            case 16:
                return new f((PayLaterPlansListScreen) this.v, continuation, 16);
            case 17:
                return new f((CashHoldingFundsExplanationScreen) this.v, continuation, 17);
            case 18:
                return new f((PopularCommoditiesController) this.v, continuation, 18);
            case 19:
                return new f((PlanSavingsAccountsScreen) this.v, continuation, 19);
            case 20:
                return new f((com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b) this.v, continuation, 20);
            case 21:
                return new f((DocumentSelectorScreen) this.v, continuation, 21);
            case 22:
                return new f((CorporateEventDetailsController) this.v, continuation, 22);
            case 23:
                return new f((PaymentBreakdownScreen) this.v, continuation, 23);
            case 24:
                return new f((InterestAndFeesScreen) this.v, continuation, 24);
            case 25:
                return new f((CategoryManagementListController) this.v, continuation, 25);
            case 26:
                return new f((FormsListScreen) this.v, continuation, 26);
            case 27:
                return new f((com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) this.v, continuation, 27);
            case 28:
                return new f((IncomeSorterExecutionController) this.v, continuation, 28);
            default:
                return new f((ReasonForTransferChooserScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0428  */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v104, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g85.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
