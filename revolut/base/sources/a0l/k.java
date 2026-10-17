package a0l;

import a32.a0;
import a9d.u;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list.WithdrawalCodeListScreen;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.dialog.CashTopupReportAnIssueBottomSheetScreen;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.InputAliasScreen;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlow;
import com.revolut.feature.retail.savings.api.domain.interactors.SavingsDisclaimersClickAction;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection.CardsTroubleshooterSelectionScreen;
import com.revolut.feature.store.impl.ui.deals.StoreDealsScreen;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateController;
import com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result.TransferTrackerEstimationResultScreen;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogController;
import com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.TravelFlightsFareSelectionScreen;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.disclaimer.SavingsDisclaimerScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentController;
import ip0.e8;
import ip0.vd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f440w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f440w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k((NationalIdentifierDocumentController) this.f440w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k((a15.m) this.f440w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k((SavingsDisclaimerScreen) this.f440w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                k kVar4 = new k((a0) this.f440w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
            case 4:
                k kVar5 = new k((CfdWithdrawFlow) this.f440w, continuation, 4);
                kVar5.v = obj2;
                return kVar5;
            case 5:
                k kVar6 = new k((StoreDealsScreen) this.f440w, continuation, 5);
                kVar6.v = obj2;
                return kVar6;
            case 6:
                return new k((a44.d) this.v, (String) this.f440w, continuation, 6);
            case 7:
                k kVar7 = new k((a4h.a) this.f440w, continuation, 7);
                kVar7.v = obj2;
                return kVar7;
            case 8:
                return new k((com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a) this.v, (v44.j) this.f440w, continuation, 8);
            case 9:
                k kVar8 = new k((a5d.i) this.f440w, continuation, 9);
                kVar8.v = obj2;
                return kVar8;
            case 10:
                k kVar9 = new k((a5e.i) this.f440w, continuation, 10);
                kVar9.v = obj2;
                return kVar9;
            case 11:
                k kVar10 = new k((a5i.p) this.f440w, continuation, 11);
                kVar10.v = obj2;
                return kVar10;
            case 12:
                k kVar11 = new k((TravelFlightsFareSelectionScreen) this.f440w, continuation, 12);
                kVar11.v = obj2;
                return kVar11;
            case 13:
                k kVar12 = new k((a72.m) this.f440w, continuation, 13);
                kVar12.v = obj2;
                return kVar12;
            case 14:
                k kVar13 = new k((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) this.f440w, continuation, 14);
                kVar13.v = obj2;
                return kVar13;
            case 15:
                k kVar14 = new k((a7f.b) this.f440w, continuation, 15);
                kVar14.v = obj2;
                return kVar14;
            case 16:
                k kVar15 = new k((a80.h) this.f440w, continuation, 16);
                kVar15.v = obj2;
                return kVar15;
            case 17:
                k kVar16 = new k((WithdrawalCodeListScreen) this.f440w, continuation, 17);
                kVar16.v = obj2;
                return kVar16;
            case 18:
                k kVar17 = new k((a92.i) this.f440w, continuation, 18);
                kVar17.v = obj2;
                return kVar17;
            case 19:
                k kVar18 = new k((InputAliasScreen) this.f440w, continuation, 19);
                kVar18.v = obj2;
                return kVar18;
            case 20:
                k kVar19 = new k((CardsTroubleshooterSelectionScreen) this.f440w, continuation, 20);
                kVar19.v = obj2;
                return kVar19;
            case 21:
                return new k((FaqNodeBase) this.v, (u) this.f440w, continuation, 21);
            case 22:
                k kVar20 = new k((EditSubscriptionEndDateController) this.f440w, continuation, 22);
                kVar20.v = obj2;
                return kVar20;
            case 23:
                k kVar21 = new k((abf.o) this.f440w, continuation, 23);
                kVar21.v = obj2;
                return kVar21;
            case 24:
                k kVar22 = new k((com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.f440w, continuation, 24);
                kVar22.v = obj2;
                return kVar22;
            case 25:
                k kVar23 = new k((CashTopupReportAnIssueBottomSheetScreen) this.f440w, continuation, 25);
                kVar23.v = obj2;
                return kVar23;
            case 26:
                k kVar24 = new k((acd.a) this.f440w, continuation, 26);
                kVar24.v = obj2;
                return kVar24;
            case 27:
                k kVar25 = new k((TotalExchangeFeesDialogController) this.f440w, continuation, 27);
                kVar25.v = obj2;
                return kVar25;
            case 28:
                k kVar26 = new k((adf.h) this.f440w, continuation, 28);
                kVar26.v = obj2;
                return kVar26;
            default:
                k kVar27 = new k((TransferTrackerEstimationResultScreen) this.f440w, continuation, 29);
                kVar27.v = obj2;
                return kVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((SavingsDisclaimersClickAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((a32.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((a3b.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((v2h.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((k) create((a5e.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((k) create((e8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((k) create((tpc.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((k) create((MultibancoWithdrawalCode) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((k) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((k) create((mcd.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((tde.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05bd  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0l.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f440w = obj2;
    }
}
