package com.revolut.feature.credit.loan.impl.ui.autopay.flow;

import ang.f;
import com.revolut.core.ui_kit.delegates.cd;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.AutoPayExternalAccountFlow;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.AutoPayExternalAccountFlowContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$PaymentUiStyle;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$ScreenConfig;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.autopay.model.LoanAutoPayDataRequest;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import s20.c;
import s55.d;
import u55.b;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements s55.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LoanAutopayFlowContract$InputData f70321t;
    public final wj4.a u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f70322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final uj4.a f70323x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LoanAutopayFlowContract$Step f70324y;
    public final LoanAutopayFlowContract$State z;

    public a(LoanAutopayFlowContract$InputData flowInput, wj4.a autoPayStatusDialogFactory, b confirmAutoPayMethodInteractor, f userInteractor, uj4.a autoPayExternalAccountFlowProvider) {
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        Intrinsics.checkNotNullParameter(autoPayStatusDialogFactory, "autoPayStatusDialogFactory");
        Intrinsics.checkNotNullParameter(confirmAutoPayMethodInteractor, "confirmAutoPayMethodInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(autoPayExternalAccountFlowProvider, "autoPayExternalAccountFlowProvider");
        this.f70321t = flowInput;
        this.u = autoPayStatusDialogFactory;
        this.v = confirmAutoPayMethodInteractor;
        this.f70322w = userInteractor;
        this.f70323x = autoPayExternalAccountFlowProvider;
        this.f70324y = flowInput.f70314b ? LoanAutopayFlowContract$Step.AutoPayPrompt.f70318a : LoanAutopayFlowContract$Step.SelectPaymentMethod.f70320a;
        this.z = new LoanAutopayFlowContract$State(null, null);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, mo3.a.g(nim.a.v(e.b(this.f70322w.k(false)), new s4b.e(16)), null, new c(20), 1), null, null, new d(this, null), 3);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        LoanAutopayFlowContract$Step step = (LoanAutopayFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof LoanAutopayFlowContract$Step.AutoPayPrompt;
        LoanAutopayFlowContract$InputData loanAutopayFlowContract$InputData = this.f70321t;
        if (z) {
            loanAutopayFlowContract$InputData.getClass();
            FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(iy4.a.a(new TextLocalisedClause(R$string.credit_loan_autopay_prompt_title, null, null, 14), new TextLocalisedClause(R$string.credit_loan_autopay_prompt_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D103", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), xc.VERTICAL, LargeActionButton.ButtonStyle.f58725a, LargeActionButton.ButtonStyle.f58726b, cd.PRIMARY, new TextLocalisedClause(R$string.credit_loan_autopay_prompt_setup_button, null, null, 14), (489368 & 4096) != 0 ? null : null, (489368 & 65536) == 0));
            s55.b block = new s55.b(this, 2);
            Intrinsics.checkNotNullParameter(block, "block");
            fullScreenPromptScreen.H = block;
            return fullScreenPromptScreen;
        }
        if (step instanceof LoanAutopayFlowContract$Step.SelectPaymentMethod) {
            SelectAutopayMethodScreen selectAutopayMethodScreen = new SelectAutopayMethodScreen(new SelectAutopayMethodContract$InputData(true, null));
            s55.b bVar = new s55.b(this, 3);
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            selectAutopayMethodScreen.H = bVar;
            return selectAutopayMethodScreen;
        }
        if (step instanceof LoanAutopayFlowContract$Step.AddExternalAccount) {
            this.f70323x.getClass();
            AutoPayExternalAccountFlow autoPayExternalAccountFlow = new AutoPayExternalAccountFlow(new AutoPayExternalAccountFlowContract$InputData(null));
            s55.b bVar2 = new s55.b(this, 0);
            Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
            autoPayExternalAccountFlow.J = bVar2;
            return autoPayExternalAccountFlow;
        }
        if (!(step instanceof LoanAutopayFlowContract$Step.ConfirmAutopay)) {
            throw new NoWhenBranchMatchedException();
        }
        AccountDetails.LinkedAccount linkedAccount = ((LoanAutopayFlowContract$State) A2().f98429a).f70315a;
        RepaymentSource externalAccount = linkedAccount == null ? RepaymentSource.RevolutWallet.f68559a : new RepaymentSource.ExternalAccount(linkedAccount);
        LoanAutoPayDataRequest loanAutoPayDataRequest = new LoanAutoPayDataRequest(externalAccount, loanAutopayFlowContract$InputData.f70313a);
        wi0.b bVar3 = ((LoanAutopayFlowContract$State) A2().f98429a).f70316b;
        wi0.b.Companion.getClass();
        ConfirmAutopayScreen confirmAutopayScreen = new ConfirmAutopayScreen(new ConfirmAutopayContract$InputData.LoanManagement(loanAutoPayDataRequest, null, ConfirmAutopayContract$PaymentUiStyle.Default.f68631a, new ConfirmAutopayContract$ScreenConfig(null, null, (Intrinsics.f(bVar3, wi0.b.f297770q3) && (externalAccount instanceof RepaymentSource.RevolutWallet)) ? new TextLocalisedClause(R$string.credit_autopay_ach_confirm_payment_details_footer, null, null, 14) : null, null, 11)));
        s55.b block2 = new s55.b(this, 1);
        Intrinsics.checkNotNullParameter(block2, "block");
        confirmAutopayScreen.H = block2;
        return confirmAutopayScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.z;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f70324y;
    }
}
