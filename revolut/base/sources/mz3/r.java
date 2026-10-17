package mz3;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.api.models.delayed_credit_check.DelayedCreditCheckResponse;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.CreditPostActivationWaitingFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$Step;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$string;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.WealthMarginBorrowingInterestScreenContract$ModalStep;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210666b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f210665a = i;
        this.f210666b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        n6h.a aVar = ((com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.a) this.f210666b).o;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        WealthMarginBorrowingInterestScreenContract$ModalStep step = (WealthMarginBorrowingInterestScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, WealthMarginBorrowingInterestScreenContract$ModalStep.AnnualInterestRateExplanation.f95460a)) {
            aVar.getClass();
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.trading_margin_overnight_fees_interest_section_interest_title, null, null, 14), new TextLocalisedClause(R$string.trading_margin_overnight_fees_interest_section_interest_explanation, null, null, 14), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_ok, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var = k9.Wealth;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        }
        if (Intrinsics.f(step, WealthMarginBorrowingInterestScreenContract$ModalStep.AccruedFeesMonthlyExplanation.f95459a)) {
            aVar.getClass();
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.trading_margin_overnight_fees_interest_section_accrued_title, null, null, 14), new TextLocalisedClause(R$string.trading_margin_overnight_fees_interest_section_accrued_explanation, null, null, 14), null, null, false, 28);
            aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_ok, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var2 = k9.Wealth;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            return new ActionsBottomSheetController(new dii.a(aVar3, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
        }
        if (!Intrinsics.f(step, WealthMarginBorrowingInterestScreenContract$ModalStep.NextPaymentDateExplanation.f95461a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.getClass();
        lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.trading_margin_overnight_fees_interest_section_payment_date_title, null, null, 14), new TextLocalisedClause(R$string.trading_margin_overnight_fees_interest_section_payment_date_explanation, null, null, 14), null, null, false, 28);
        aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_ok, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var3 = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar4, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.subaccount.impl.ui.add_money.flow.b bVar = (com.revolut.feature.subaccount.impl.ui.add_money.flow.b) this.f210666b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        SubaccountAddMoneyFlowContract$Step step = (SubaccountAddMoneyFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SubaccountAddMoneyFlowContract$Step.MoveMoney) {
            ViewController viewControllerE1 = bVar.e1(new y5i.a(((SubaccountAddMoneyFlowContract$Step.MoveMoney) step).f88987a, null, 14));
            dph.c block = new dph.c(bVar, LazyFlowCoordinator, 19);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof SubaccountAddMoneyFlowContract$Step.VaultAddMoney)) {
            throw new NoWhenBranchMatchedException();
        }
        VaultsKompotFeatureConfig.AddMoney.Config config = VaultsKompotFeatureConfig.AddMoney.Config.a(((SubaccountAddMoneyFlowContract$Step.VaultAddMoney) step).f88989a.f94716a);
        Intrinsics.checkNotNullParameter(config, "config");
        ViewController viewControllerE12 = bVar.e1(new com.revolut.feature.vaults.api.navigation.a(new VaultsKompotFeatureConfig.AddMoney.Destination(config)));
        n45.b block2 = new n45.b(bVar, step, 17);
        Intrinsics.checkNotNullParameter(block2, "block");
        viewControllerE12.H = block2;
        return viewControllerE12;
    }

    private final Object c(Object obj2, Object obj3) {
        lal.a aVar = (lal.a) this.f210666b;
        t7h.d params = (t7h.d) obj2;
        WealthMarginBorrowingInterest marginLimit = (WealthMarginBorrowingInterest) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(marginLimit, "marginLimit");
        ((ne0.j) aVar.f193427c).f(a0.d.s("margin_borrowing_interest_", params.f268698a, "_", params.f268699b), marginLimit);
        return Unit.f186387a;
    }

    private final Object d(Object obj2, Object obj3) {
        n7h.b bVar = (n7h.b) this.f210666b;
        t7h.s params = (t7h.s) obj2;
        WealthMarginStatus marginStatus = (WealthMarginStatus) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(marginStatus, "marginStatus");
        ne0.j jVar = bVar.f213094b;
        n7h.b.Companion.getClass();
        jVar.f(n7h.a.a(params), marginStatus);
        return Unit.f186387a;
    }

    private final Object e(Object obj2, Object obj3) {
        n7h.e eVar = (n7h.e) this.f210666b;
        t7h.o params = (t7h.o) obj2;
        udh.e limit = (udh.e) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(limit, "limit");
        ne0.j jVar = eVar.f213099b;
        n7h.e.Companion.getClass();
        jVar.f(n7h.d.a(params), limit);
        return Unit.f186387a;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a) this.f210666b;
        yki.l FlowCoordinator = (yki.l) obj2;
        CreditPostActivationWaitingFlowContract$Step step = (CreditPostActivationWaitingFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreditPostActivationWaitingFlowContract$Step.Loading) {
            return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.c();
        }
        if (!(step instanceof CreditPostActivationWaitingFlowContract$Step.Waiting)) {
            throw new NoWhenBranchMatchedException();
        }
        DelayedCreditCheckResponse.InProgress inProgress = ((CreditPostActivationWaitingFlowContract$Step.Waiting) step).f67409a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_delayed_credit_check_title_template, zhm.u.c(inProgress.d), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_delayed_credit_check_description_template, zhm.u.c(inProgress.e), null, 12);
        String str = inProgress.f66447c;
        if (str == null) {
            str = "3D362";
        }
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, null, null, null, 30);
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(iy4.a.d(textLocalisedClause, textLocalisedClause2, cdnImageC, null, null, pd.BLACK, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_delayed_credit_check_button_template, zhm.u.c(inProgress.f), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, 7840));
        n84.c block = new n84.c(aVar, 2);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        n8a.o oVar = (n8a.o) this.f210666b;
        AccountId fetchAlias = (AccountId) obj2;
        List data = (List) obj3;
        Intrinsics.checkNotNullParameter(fetchAlias, "fetchAlias");
        Intrinsics.checkNotNullParameter(data, "data");
        oVar.f213342c.f(n8a.o.h(fetchAlias), data);
        return Unit.f186387a;
    }

    private final Object i(Object obj2, Object obj3) {
        n8a.b0 b0Var = (n8a.b0) this.f210666b;
        l8a.j params = (l8a.j) obj2;
        String data = (String) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(data, "data");
        b0Var.f213298b.f(gc0.c.c(params), data);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x04ba  */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 3450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.r.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ r(Object obj2, Object obj3, int i) {
        this.f210665a = i;
        this.f210666b = obj3;
    }
}
