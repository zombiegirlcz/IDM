package an4;

import aii.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardAutoPayPrompt;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardAutoPaymentHidden;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBackendDrivenEntryPoints;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBalanceOptionsFromHome;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBeDrivenInfoSection;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBeDrivenPromotionalPeriodSection;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardCancellationPlanDowngrade;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardCancellationWithdrawalFlow;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardChallengesWidget;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardCreditLimitCap;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardDebitToInstalment;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardFeeWaiver;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardInstalmentDetailsRedesign;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardInstalments;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardNewHomeHeaderContent;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardStatementFinancingRedesign;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardStatementRevPointsRedemption;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardUseCreditLimitApi;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardWidgetsRedesign;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditScheduledPayment;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$SimpleAutoPay;
import com.revolut.feature.credit.card.api.models.autopay.CreditCardAutopayRequest;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardholderAccountInfoDestination;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardholderRemovedDestination;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardsCancelPendingInvitationDestination;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardsCardholderDetailsDestination;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardBoletoDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardCancellationDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardCashbabackDetailsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardDecreaseLimitDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardDetailsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardInAppStatementDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardInAppStatementDetailsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentCreateFlowDestination$Create;
import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentCreateFlowDestination$CreateWithTransaction;
import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentHubDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentRepayDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardLimitCapDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardLimitHubDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardPostPurchaseInstalmentDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardPrePurchaseInstalmentDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardRevPointsInfoDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardRevPointsLockedDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardSelectDueDateFlowDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardSettingsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardSetupAutoPayDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardStatementBottomSheetDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardStatementDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardStatementDetailsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardStatementFinancingDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination;
import com.revolut.feature.credit.card.api.navigation.FeeWaiverBottomSheetDestination;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDialog$Descriptor;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardOverdueExplainer$Descriptor;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation.AdditionalCardsCardholderCancelInvitationScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation.AdditionalCardsCardholderCancelInvitationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_account_info.AdditionalCardsCardholderAccountInfoScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_account_info.AdditionalCardsCardholderAccountInfoScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_removed.AdditionalCardholderRemovedScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.flow.AdditionalCardsFlow;
import com.revolut.feature.credit.card.impl.ui.additional_cards.flow.AdditionalCardsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsRootFlow;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayRootFlow;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.CreditCardCancellationEntryFlow;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.CreditCardCancellationEntryFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlow;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreen;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlow;
import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.details.flow.CreditCardDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.details.flow.CreditCardDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.direct_debit_selection.CreditCardDirectDebitFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.direct_debit_selection.CreditCardDirectDebitRootFlow;
import com.revolut.feature.credit.card.impl.ui.display_amount_selector.bottom_sheet.CreditCardDisplayAmountBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.fee_waiver.FeeWaiverBottomDialogScreen;
import com.revolut.feature.credit.card.impl.ui.fee_waiver.FeeWaiverBottomDialogScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.items.bottom_sheet.CreditCardBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.limit_hub.flow.CreditCardLimitHubFlow;
import com.revolut.feature.credit.card.impl.ui.limit_hub.flow.CreditCardLimitHubFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.overdue_explainer.CreditCardOverdueExplainerController;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlow;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.revpoints.CreditCardRevPointsMigrationBottomDialogScreen;
import com.revolut.feature.credit.card.impl.ui.revpoints.CreditCardRevPointsMigrationBottomDialogScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.revpoints_locked.CreditCardRevPointsLockedBottomDialogScreen;
import com.revolut.feature.credit.card.impl.ui.revpoints_locked.CreditCardRevPointsLockedBottomDialogScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.flow.CreditCardSettingsFlow;
import com.revolut.feature.credit.card.impl.ui.settings.flow.CreditCardSettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlow;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreen;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlow;
import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_bottom_sheet.CreditCardStatementBottomSheetScreen;
import com.revolut.feature.credit.card.impl.ui.statement_bottom_sheet.CreditCardStatementBottomSheetScreenContract$InputData;
import com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements nte.a, p, b60.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f6555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f6556b;

    public d(ImmutableSet deeplinkGateways, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f6555a = deeplinkGateways;
        this.f6556b = creditCardFeatureInteractor;
    }

    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof CreditCardOverdueExplainer$Descriptor) {
            return ((CreditCardOverdueExplainer$Descriptor) descriptor).a(new CreditCardOverdueExplainerController());
        }
        if (descriptor instanceof zl4.g) {
            zl4.g gVar = (zl4.g) descriptor;
            return gVar.a(new CreditCardDisplayAmountBottomSheetController(gVar.f323183a));
        }
        if (descriptor instanceof CreditCardDialog$Descriptor) {
            CreditCardDialog$Descriptor creditCardDialog$Descriptor = (CreditCardDialog$Descriptor) descriptor;
            return creditCardDialog$Descriptor.a(new CreditCardBottomSheetController(creditCardDialog$Descriptor.f68989a));
        }
        if (descriptor instanceof zl4.a) {
            zl4.a aVar = (zl4.a) descriptor;
            zl4.b bVar = aVar.f323176a;
            return aVar.a(new CollateralMoveMoneyScreen(new CollateralMoveMoneyScreenContract$InputData(bVar.f323177a, bVar.f323178b, bVar.f323179c)));
        }
        if (descriptor instanceof zl4.i) {
            zl4.i iVar = (zl4.i) descriptor;
            return iVar.a(new FeeWaiverBottomDialogScreen(new FeeWaiverBottomDialogScreenContract$InputData(iVar.f323186a, iVar.f323187b, iVar.f323188c, iVar.d, iVar.e)));
        }
        super.c(descriptor);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nhi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aii.x r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof an4.c
            if (r0 == 0) goto L13
            r0 = r7
            an4.c r0 = (an4.c) r0
            int r1 = r0.f6554x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6554x = r1
            goto L1a
        L13:
            an4.c r0 = new an4.c
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6554x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            xl4.a r6 = r0.u
            yhm.o.b(r7)
            goto L55
        L3a:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof xl4.a
            if (r7 == 0) goto L71
            r7 = r6
            xl4.a r7 = (xl4.a) r7
            java.lang.String r2 = r7.f306935a
            yw4.f r3 = yw4.f.IN_APP_STATEMENT
            r0.u = r7
            r0.f6554x = r4
            om4.k0 r7 = r5.f6556b
            java.lang.Object r7 = r7.b(r2, r3, r0)
            if (r7 != r1) goto L55
            goto L78
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L67
            com.revolut.feature.credit.card.api.navigation.CreditCardInAppStatementDestination r7 = new com.revolut.feature.credit.card.api.navigation.CreditCardInAppStatementDestination
            xl4.a r6 = (xl4.a) r6
            java.lang.String r6 = r6.f306935a
            r7.<init>(r6)
            return r7
        L67:
            com.revolut.feature.credit.card.api.navigation.CreditCardStatementDestination r7 = new com.revolut.feature.credit.card.api.navigation.CreditCardStatementDestination
            xl4.a r6 = (xl4.a) r6
            java.lang.String r6 = r6.f306935a
            r7.<init>(r6)
            return r7
        L71:
            r6 = 0
            r0.u = r6
            r0.f6554x = r3
            if (r1 != 0) goto L79
        L78:
            return r1
        L79:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: an4.d.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nte.a
    public final List e() {
        return d0.E0(u.c(CreditApplicationApi$Toggles.BalanceTransferAlwaysEntryPoints.f66179c), v.k(CreditCardApi$Toggles$CreditCardAutoPaymentHidden.f68673c, CreditCardApi$Toggles$CreditCardInstalments.f68685c, CreditCardApi$Toggles$CreditScheduledPayment.f68691c, CreditCardApi$Toggles$CreditCardWidgetsRedesign.f68690c, CreditCardApi$Toggles$SimpleAutoPay.f68692c, CreditCardApi$Toggles$CreditCardFeeWaiver.f68683c, CreditCardApi$Toggles$CreditCardCreditLimitCap.f68681c, CreditCardApi$Toggles$CreditCardCancellationPlanDowngrade.f68678c, CreditCardApi$Toggles$CreditCardStatementRevPointsRedemption.f68688c, CreditCardApi$Toggles$CreditCardChallengesWidget.f68680c, CreditCardApi$Toggles$CreditCardDebitToInstalment.f68682c, CreditCardApi$Toggles$CreditCardStatementFinancingRedesign.f68687c, CreditCardApi$Toggles$CreditCardBackendDrivenEntryPoints.f68674c, CreditCardApi$Toggles$CreditCardBeDrivenPromotionalPeriodSection.f68677c, CreditCardApi$Toggles$CreditCardNewHomeHeaderContent.f68686c, CreditCardApi$Toggles$CreditCardUseCreditLimitApi.f68689c, CreditCardApi$Toggles$CreditCardBeDrivenInfoSection.f68676c, CreditCardApi$Toggles$CreditCardCancellationWithdrawalFlow.f68679c, CreditCardApi$Toggles$CreditCardBalanceOptionsFromHome.f68675c, CreditCardApi$Toggles$CreditCardAutoPayPrompt.f68672c, CreditCardApi$Toggles$CreditCardInstalmentDetailsRedesign.f68684c));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        CreditCardRepayBoletoFlowContract$InputData details;
        InstalmentFlowContract$InputData.CreateWithTransactions.TransactionType debit;
        AutoPayRequest setup;
        mb5.v vVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        CreditCardKompotDestination creditCardKompotDestination = destination instanceof CreditCardKompotDestination ? (CreditCardKompotDestination) destination : null;
        if (creditCardKompotDestination == null) {
            return null;
        }
        if (creditCardKompotDestination instanceof CreditCardDetailsDestination) {
            return new CreditCardDetailsFlow(new CreditCardDetailsFlowContract$InputData(((CreditCardDetailsDestination) creditCardKompotDestination).f68923a));
        }
        if (creditCardKompotDestination instanceof CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination) {
            CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination creditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination = (CreditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination) creditCardKompotDestination;
            String str = creditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination.f68951a;
            CreditCardAutopayRequest creditCardAutopayRequest = creditCardKompotFeatureConfig$DirectDebits$DirectDebitsNavigationDestination.f68952b;
            Intrinsics.checkNotNullParameter(creditCardAutopayRequest, "<this>");
            if (creditCardAutopayRequest instanceof CreditCardAutopayRequest.Update) {
                CreditCardAutopayRequest.Update update = (CreditCardAutopayRequest.Update) creditCardAutopayRequest;
                int i = update.f68699a;
                CreditScheduledAmountType creditScheduledAmountTypeA = qm4.b.a(update.f68700b);
                mb5.u uVarB = qm4.b.b(update.f68701c);
                int i2 = qm4.a.f247774b[update.d.ordinal()];
                if (i2 == 1) {
                    vVar = mb5.v.ACTIVE;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar = mb5.v.INACTIVE;
                }
                setup = new AutoPayRequest.Update(i, creditScheduledAmountTypeA, uVarB, vVar, update.e, null, null);
            } else {
                if (!(creditCardAutopayRequest instanceof CreditCardAutopayRequest.Setup)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardAutopayRequest.Setup setup2 = (CreditCardAutopayRequest.Setup) creditCardAutopayRequest;
                setup = new AutoPayRequest.Setup(setup2.f68696a, qm4.b.a(setup2.f68697b), qm4.b.b(setup2.f68698c), null, null);
            }
            return new CreditCardDirectDebitRootFlow(new CreditCardDirectDebitFlowContract$InputData(str, setup));
        }
        if (creditCardKompotDestination instanceof CreditCardKompotFeatureConfig.AutoPaySettings.AutoPaySettingsDestination) {
            return new CreditCardAutopaySettingsRootFlow(new CreditCardAutopaySettingsFlowContract$InputData(((CreditCardKompotFeatureConfig.AutoPaySettings.AutoPaySettingsDestination) creditCardKompotDestination).f68941a, tp4.a.Back));
        }
        if (creditCardKompotDestination instanceof CreditCardSetupAutoPayDestination) {
            return new CreditCardSetupAutopayRootFlow(new CreditCardSetupAutopayFlowContract$InputData.Create(((CreditCardSetupAutoPayDestination) creditCardKompotDestination).f68974a));
        }
        if (creditCardKompotDestination instanceof CreditCardDescriptionDestination) {
            CreditCardDescriptionDestination.DescriptionConfig descriptionConfig = ((CreditCardDescriptionDestination) creditCardKompotDestination).f68907a;
            if (descriptionConfig instanceof CreditCardDescriptionDestination.DescriptionConfig.Remote) {
                CreditCardDescriptionDestination.DescriptionConfig.Remote remote = (CreditCardDescriptionDestination.DescriptionConfig.Remote) descriptionConfig;
                return new CreditCardBeDrivenDescriptionFlow(new CreditCardBeDrivenDescriptionFlowContract$InputData(remote.f68921a, remote.f68922b));
            }
            if (descriptionConfig instanceof CreditCardDescriptionDestination.DescriptionConfig.Local) {
                return new CreditCardDescriptionScreen(new CreditCardDescriptionScreenContract$InputData.Local((CreditCardDescriptionDestination.DescriptionConfig.Local) descriptionConfig));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (creditCardKompotDestination instanceof CreditCardCashbabackDetailsDestination) {
            return new CreditCardCashbackDetailsScreen(new CreditCardCashbackDetailsScreenContract$InputData(((CreditCardCashbabackDetailsDestination) creditCardKompotDestination).f68904a));
        }
        if (creditCardKompotDestination instanceof CreditCardTopupDestination) {
            CreditCardTopupDestination creditCardTopupDestination = (CreditCardTopupDestination) creditCardKompotDestination;
            return gc0.c.b(new CreditCardRepayFlow(new CreditCardRepayFlowContract$InputData(creditCardTopupDestination.f68981b, creditCardTopupDestination.f68980a)), new b(creditCardTopupDestination, 0));
        }
        if (creditCardKompotDestination instanceof CreditCardDecreaseLimitDestination) {
            return new CreditCardLimitDecreaseFlow(new CreditCardLimitDecreaseFlowContract$InputData(((CreditCardDecreaseLimitDestination) creditCardKompotDestination).f68906a));
        }
        if (creditCardKompotDestination instanceof CreditCardPrePurchaseInstalmentDestination) {
            CreditCardPrePurchaseInstalmentDestination creditCardPrePurchaseInstalmentDestination = (CreditCardPrePurchaseInstalmentDestination) creditCardKompotDestination;
            return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.PrePurchase(creditCardPrePurchaseInstalmentDestination.f68966a, creditCardPrePurchaseInstalmentDestination.f68967b));
        }
        if (creditCardKompotDestination instanceof CreditCardPostPurchaseInstalmentDestination) {
            CreditCardPostPurchaseInstalmentDestination creditCardPostPurchaseInstalmentDestination = (CreditCardPostPurchaseInstalmentDestination) creditCardKompotDestination;
            return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.PostPurchase(creditCardPostPurchaseInstalmentDestination.f68964a, creditCardPostPurchaseInstalmentDestination.f68965b));
        }
        if (creditCardKompotDestination instanceof CreditCardStatementFinancingDestination) {
            CreditCardStatementFinancingDestination creditCardStatementFinancingDestination = (CreditCardStatementFinancingDestination) creditCardKompotDestination;
            return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.StatementFinancing(creditCardStatementFinancingDestination.f68978a, creditCardStatementFinancingDestination.f68979b));
        }
        if (creditCardKompotDestination instanceof CreditCardInstalmentHubDestination) {
            return new CreditCardInstalmentHubFlow(new CreditCardInstalmentHubFlowContract$InputData(((CreditCardInstalmentHubDestination) creditCardKompotDestination).f68934a));
        }
        if (creditCardKompotDestination instanceof CreditCardInstalmentCreateFlowDestination$Create) {
            CreditCardInstalmentCreateFlowDestination$Create creditCardInstalmentCreateFlowDestination$Create = (CreditCardInstalmentCreateFlowDestination$Create) creditCardKompotDestination;
            return new InstalmentFlow(new InstalmentFlowContract$InputData.Create(creditCardInstalmentCreateFlowDestination$Create.f68927a, creditCardInstalmentCreateFlowDestination$Create.f68928b));
        }
        if (creditCardKompotDestination instanceof CreditCardInstalmentCreateFlowDestination$CreateWithTransaction) {
            CreditCardInstalmentCreateFlowDestination$CreateWithTransaction creditCardInstalmentCreateFlowDestination$CreateWithTransaction = (CreditCardInstalmentCreateFlowDestination$CreateWithTransaction) creditCardKompotDestination;
            String str2 = creditCardInstalmentCreateFlowDestination$CreateWithTransaction.f68929a;
            Set set = creditCardInstalmentCreateFlowDestination$CreateWithTransaction.f68930b;
            CreditCardInstalmentCreateFlowDestination$CreateWithTransaction.TransactionType transactionType = creditCardInstalmentCreateFlowDestination$CreateWithTransaction.f68931c;
            if (transactionType instanceof CreditCardInstalmentCreateFlowDestination$CreateWithTransaction.TransactionType.Credit) {
                debit = InstalmentFlowContract$InputData.CreateWithTransactions.TransactionType.Credit.f69327c;
            } else {
                if (!(transactionType instanceof CreditCardInstalmentCreateFlowDestination$CreateWithTransaction.TransactionType.Debit)) {
                    throw new NoWhenBranchMatchedException();
                }
                debit = new InstalmentFlowContract$InputData.CreateWithTransactions.TransactionType.Debit(((CreditCardInstalmentCreateFlowDestination$CreateWithTransaction.TransactionType.Debit) transactionType).f68933a);
            }
            return new InstalmentFlow(new InstalmentFlowContract$InputData.CreateWithTransactions(str2, set, debit));
        }
        if (creditCardKompotDestination instanceof CreditCardStatementDestination) {
            return new CreditCardStatementScreen(new CreditCardStatementScreenContract$InputData(((CreditCardStatementDestination) creditCardKompotDestination).f68976a));
        }
        if (creditCardKompotDestination instanceof CreditCardInAppStatementDestination) {
            return new CreditCardStatementFlow(new CreditCardStatementFlowContract$InputData(((CreditCardInAppStatementDestination) creditCardKompotDestination).f68924a));
        }
        if (creditCardKompotDestination instanceof CreditCardLimitHubDestination) {
            return new CreditCardLimitHubFlow(new CreditCardLimitHubFlowContract$InputData(((CreditCardLimitHubDestination) creditCardKompotDestination).f68963a));
        }
        if (creditCardKompotDestination instanceof CreditCardInAppStatementDetailsDestination) {
            CreditCardInAppStatementDetailsDestination creditCardInAppStatementDetailsDestination = (CreditCardInAppStatementDetailsDestination) creditCardKompotDestination;
            return new CreditCardStatementDetailsFlow(new CreditCardStatementDetailsFlowContract$InputData(creditCardInAppStatementDetailsDestination.f68925a, creditCardInAppStatementDetailsDestination.f68926b));
        }
        if (creditCardKompotDestination instanceof CreditCardInstalmentRepayDestination) {
            CreditCardInstalmentRepayDestination creditCardInstalmentRepayDestination = (CreditCardInstalmentRepayDestination) creditCardKompotDestination;
            return new CreditCardInstalmentRepayFlow(new CreditCardInstalmentRepayFlowContract$InputData(creditCardInstalmentRepayDestination.f68936a, creditCardInstalmentRepayDestination.f68937b, creditCardInstalmentRepayDestination.f68938c, creditCardInstalmentRepayDestination.d));
        }
        if (creditCardKompotDestination instanceof CreditCardStatementDetailsDestination) {
            return new com.revolut.feature.credit.card.impl.ui.statement_details.flow.CreditCardStatementDetailsFlow(new com.revolut.feature.credit.card.impl.ui.statement_details.flow.CreditCardStatementDetailsFlowContract$InputData(((CreditCardStatementDetailsDestination) creditCardKompotDestination).f68977a));
        }
        if (creditCardKompotDestination instanceof AdditionalCardsDestination) {
            return new AdditionalCardsFlow(new AdditionalCardsFlowContract$InputData(((AdditionalCardsDestination) creditCardKompotDestination).f68894a));
        }
        if (creditCardKompotDestination instanceof AdditionalCardsCardholderDetailsDestination) {
            AdditionalCardsCardholderDetailsDestination additionalCardsCardholderDetailsDestination = (AdditionalCardsCardholderDetailsDestination) creditCardKompotDestination;
            return new AdditionalCardsCardholderDetailsFlow(new AdditionalCardsCardholderDetailsFlowContract$InputData(additionalCardsCardholderDetailsDestination.f68891a, additionalCardsCardholderDetailsDestination.f68892b, additionalCardsCardholderDetailsDestination.f68893c));
        }
        if (creditCardKompotDestination instanceof AdditionalCardsCancelPendingInvitationDestination) {
            AdditionalCardsCancelPendingInvitationDestination additionalCardsCancelPendingInvitationDestination = (AdditionalCardsCancelPendingInvitationDestination) creditCardKompotDestination;
            return new AdditionalCardsCardholderCancelInvitationScreen(new AdditionalCardsCardholderCancelInvitationScreenContract$InputData(additionalCardsCancelPendingInvitationDestination.f68888a, additionalCardsCancelPendingInvitationDestination.f68889b, additionalCardsCancelPendingInvitationDestination.f68890c, additionalCardsCancelPendingInvitationDestination.d));
        }
        if (creditCardKompotDestination instanceof AdditionalCardholderAccountInfoDestination) {
            return new AdditionalCardsCardholderAccountInfoScreen(new AdditionalCardsCardholderAccountInfoScreenContract$InputData(((AdditionalCardholderAccountInfoDestination) creditCardKompotDestination).f68886a));
        }
        if (creditCardKompotDestination instanceof AdditionalCardholderRemovedDestination) {
            return new AdditionalCardholderRemovedScreen();
        }
        if (creditCardKompotDestination instanceof CreditCardRevPointsInfoDestination) {
            CreditCardRevPointsInfoDestination creditCardRevPointsInfoDestination = (CreditCardRevPointsInfoDestination) creditCardKompotDestination;
            return new CreditCardRevPointsMigrationBottomDialogScreen(new CreditCardRevPointsMigrationBottomDialogScreenContract$InputData(creditCardRevPointsInfoDestination.f68968a, creditCardRevPointsInfoDestination.f68969b));
        }
        if (creditCardKompotDestination instanceof CreditCardRevPointsLockedDestination) {
            CreditCardRevPointsLockedDestination creditCardRevPointsLockedDestination = (CreditCardRevPointsLockedDestination) creditCardKompotDestination;
            return gc0.c.b(new CreditCardRevPointsLockedBottomDialogScreen(new CreditCardRevPointsLockedBottomDialogScreenContract$InputData(creditCardRevPointsLockedDestination.f68971b, creditCardRevPointsLockedDestination.f68970a)), new aab.b(4));
        }
        if (creditCardKompotDestination instanceof CreditCardStatementBottomSheetDestination) {
            return new CreditCardStatementBottomSheetScreen(new CreditCardStatementBottomSheetScreenContract$InputData(((CreditCardStatementBottomSheetDestination) creditCardKompotDestination).f68975a));
        }
        if (creditCardKompotDestination instanceof CreditCardBoletoDestination) {
            CreditCardBoletoDestination creditCardBoletoDestination = (CreditCardBoletoDestination) creditCardKompotDestination;
            if (creditCardBoletoDestination instanceof CreditCardBoletoDestination.Create) {
                details = new CreditCardRepayBoletoFlowContract$InputData.Create(((CreditCardBoletoDestination.Create) creditCardBoletoDestination).f68896a);
            } else {
                if (!(creditCardBoletoDestination instanceof CreditCardBoletoDestination.Details)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardBoletoDestination.Details details2 = (CreditCardBoletoDestination.Details) creditCardBoletoDestination;
                details = new CreditCardRepayBoletoFlowContract$InputData.Details(details2.f68897a, details2.f68898b);
            }
            return new CreditCardRepayBoletoFlow(details);
        }
        if (creditCardKompotDestination instanceof CreditCardKompotFeatureConfig.CollateralMoveMoneyDestination) {
            CreditCardKompotFeatureConfig.CollateralMoveMoneyDestination collateralMoveMoneyDestination = (CreditCardKompotFeatureConfig.CollateralMoveMoneyDestination) creditCardKompotDestination;
            return new CollateralMoveMoneyScreen(new CollateralMoveMoneyScreenContract$InputData(collateralMoveMoneyDestination.f68943a, collateralMoveMoneyDestination.f68944b, collateralMoveMoneyDestination.f68945c));
        }
        if (creditCardKompotDestination instanceof CreditCardCancellationDestination) {
            CreditCardCancellationDestination creditCardCancellationDestination = (CreditCardCancellationDestination) creditCardKompotDestination;
            return new CreditCardCancellationEntryFlow(new CreditCardCancellationEntryFlowContract$InputData(creditCardCancellationDestination.f68899a, creditCardCancellationDestination.f68900b));
        }
        if (creditCardKompotDestination instanceof CreditCardKompotFeatureConfig.CreditCardAccruedInterestsDestination) {
            CreditCardKompotFeatureConfig.CreditCardAccruedInterestsDestination creditCardAccruedInterestsDestination = (CreditCardKompotFeatureConfig.CreditCardAccruedInterestsDestination) creditCardKompotDestination;
            return new CreditCardAccruedInterestsScreen(new CreditCardAccruedInterestsScreenContract$InputData(creditCardAccruedInterestsDestination.f68946a, creditCardAccruedInterestsDestination.f68947b, creditCardAccruedInterestsDestination.f68948c));
        }
        if (creditCardKompotDestination instanceof CreditCardSettingsDestination) {
            return new CreditCardSettingsFlow(new CreditCardSettingsFlowContract$InputData(((CreditCardSettingsDestination) creditCardKompotDestination).f68973a));
        }
        if (creditCardKompotDestination instanceof CreditCardSelectDueDateFlowDestination) {
            return new CreditCardSelectDueDateFlow(new CreditCardSelectDueDateFlowContract$InputData(((CreditCardSelectDueDateFlowDestination) creditCardKompotDestination).f68972a));
        }
        if (creditCardKompotDestination instanceof FeeWaiverBottomSheetDestination) {
            FeeWaiverBottomSheetDestination feeWaiverBottomSheetDestination = (FeeWaiverBottomSheetDestination) creditCardKompotDestination;
            return new FeeWaiverBottomDialogScreen(new FeeWaiverBottomDialogScreenContract$InputData(feeWaiverBottomSheetDestination.f68983a, feeWaiverBottomSheetDestination.f68984b, feeWaiverBottomSheetDestination.f68985c, feeWaiverBottomSheetDestination.d, feeWaiverBottomSheetDestination.e));
        }
        if (!(creditCardKompotDestination instanceof CreditCardLimitCapDestination)) {
            throw new NoWhenBranchMatchedException();
        }
        CreditCardLimitCapDestination creditCardLimitCapDestination = (CreditCardLimitCapDestination) creditCardKompotDestination;
        return new CreditLimitCapChangeScreen(new CreditLimitCapChangeScreenContract$InputData(creditCardLimitCapDestination.f68960a, creditCardLimitCapDestination.f68961b));
    }

    @Override // aii.p
    public final Set h() {
        return this.f6555a;
    }
}
