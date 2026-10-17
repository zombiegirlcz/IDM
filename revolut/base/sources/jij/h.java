package jij;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreen;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayScreen;
import com.revolut.feature.flexible.staking.consent.impl.screen.FlexibleStakingConsentScreenController;
import com.revolut.feature.pay_later.impl.ui.accountdetails.PayLaterAccountDetailsScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.DatePickerController;
import com.revolut.feature.wealth.ui.impl.currencychanger.screen.CurrencyChangerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.EsimPlanSelectionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreen;
import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import com.revolut.trading.orders.ui.details.InvestOrderDetailsScreen;
import com.revolut.trading.orders.ui.details.InvestOrderDetailsScreenRedesigned;
import ip0.vd;
import jnb.p;
import jsl.p0;
import jt1.z;
import jta.v;
import ju4.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f174585w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g1j.b bVar, com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar2, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.v = bVar;
        this.f174585w = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h((EsimPlanSelectionScreen) this.f174585w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h((jil.a) this.f174585w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h((jj3.e) this.f174585w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            case 3:
                h hVar4 = new h((PayLaterAccountDetailsScreen) this.f174585w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
            case 4:
                h hVar5 = new h((com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a) this.f174585w, continuation, 4);
                hVar5.v = obj2;
                return hVar5;
            case 5:
                h hVar6 = new h((com.revolut.feature.credit.autopay.ui.screen.amount.input.b) this.f174585w, continuation, 5);
                hVar6.v = obj2;
                return hVar6;
            case 6:
                return new h((g1j.b) this.v, (com.revolut.feature.credit.autopay.ui.screen.amount.input.b) this.f174585w, continuation);
            case 7:
                h hVar7 = new h((jk7.k) this.f174585w, continuation, 7);
                hVar7.v = obj2;
                return hVar7;
            case 8:
                h hVar8 = new h((CurrencyChangerScreen) this.f174585w, continuation, 8);
                hVar8.v = obj2;
                return hVar8;
            case 9:
                h hVar9 = new h((PlanDowngradeFeesAndTermsScreen) this.f174585w, continuation, 9);
                hVar9.v = obj2;
                return hVar9;
            case 10:
                h hVar10 = new h((jm8.b) this.f174585w, continuation, 10);
                hVar10.v = obj2;
                return hVar10;
            case 11:
                h hVar11 = new h((p) this.f174585w, continuation, 11);
                hVar11.v = obj2;
                return hVar11;
            case 12:
                h hVar12 = new h((EsimNonRefundableBottomSheetScreen) this.f174585w, continuation, 12);
                hVar12.v = obj2;
                return hVar12;
            case 13:
                h hVar13 = new h((com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) this.f174585w, continuation, 13);
                hVar13.v = obj2;
                return hVar13;
            case 14:
                h hVar14 = new h((DatePickerController) this.f174585w, continuation, 14);
                hVar14.v = obj2;
                return hVar14;
            case 15:
                h hVar15 = new h((jpl.d) this.f174585w, continuation, 15);
                hVar15.v = obj2;
                return hVar15;
            case 16:
                h hVar16 = new h((CreditCardCashbackDetailsScreen) this.f174585w, continuation, 16);
                hVar16.v = obj2;
                return hVar16;
            case 17:
                h hVar17 = new h((FlexibleStakingConsentScreenController) this.f174585w, continuation, 17);
                hVar17.v = obj2;
                return hVar17;
            case 18:
                h hVar18 = new h((jq6.k) this.f174585w, continuation, 18);
                hVar18.v = obj2;
                return hVar18;
            case 19:
                h hVar19 = new h((com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) this.f174585w, continuation, 19);
                hVar19.v = obj2;
                return hVar19;
            case 20:
                h hVar20 = new h((CreditCardEditPostPurchaseInstalmentTermScreen) this.f174585w, continuation, 20);
                hVar20.v = obj2;
                return hVar20;
            case 21:
                h hVar21 = new h((com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) this.f174585w, continuation, 21);
                hVar21.v = obj2;
                return hVar21;
            case 22:
                h hVar22 = new h((BaseInvestOrderDetailsScreen) this.f174585w, continuation, 22);
                hVar22.v = obj2;
                return hVar22;
            case 23:
                h hVar23 = new h((InvestOrderDetailsScreen) this.f174585w, continuation, 23);
                hVar23.v = obj2;
                return hVar23;
            case 24:
                h hVar24 = new h((InvestOrderDetailsScreenRedesigned) this.f174585w, continuation, 24);
                hVar24.v = obj2;
                return hVar24;
            case 25:
                h hVar25 = new h((z) this.f174585w, continuation, 25);
                hVar25.v = obj2;
                return hVar25;
            case 26:
                h hVar26 = new h((jt4.i) this.f174585w, continuation, 26);
                hVar26.v = obj2;
                return hVar26;
            case 27:
                h hVar27 = new h((v) this.f174585w, continuation, 27);
                hVar27.v = obj2;
                return hVar27;
            case 28:
                h hVar28 = new h((CreditCardPseRepayScreen) this.f174585w, continuation, 28);
                hVar28.v = obj2;
                return hVar28;
            default:
                h hVar29 = new h((q) this.f174585w, continuation, 29);
                hVar29.v = obj2;
                return hVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((dil.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((jj3.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((h) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((h) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((h) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((h) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((h) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((h) create((p0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((h) create((ndf.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((h) create((ndf.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((h) create((jt1.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((h) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x08ec  */
    /* JADX WARN: Type inference failed for: r2v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jij.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f174585w = obj2;
    }
}
