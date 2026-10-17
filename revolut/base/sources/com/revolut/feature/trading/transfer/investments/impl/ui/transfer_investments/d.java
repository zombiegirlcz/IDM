package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.trading.transfer.investments.api.TransferInvestmentsApi$Toggles;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.TransferInvestmentsFlowContract$Step;
import com.revolut.retail.common.ui.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import o9f.i;
import oki.h;
import org.jetbrains.annotations.NotNull;
import paf.e;
import paf.f;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends h implements paf.b {

    @NotNull
    public static final e Companion = new e();
    public final paf.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qaf.b f91621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f91622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f91623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f91624s;

    public d(paf.c inputData, qaf.b productArticleProvider, gte.a featureToggleInteractor, i transferOutFlowInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleProvider, "productArticleProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transferOutFlowInteractor, "transferOutFlowInteractor");
        this.o = inputData;
        this.f91621p = productArticleProvider;
        this.f91622q = featureToggleInteractor;
        this.f91623r = transferOutFlowInteractor;
        p5f.c cVar = new p5f.c(this, 8);
        this.f91624s = cp5.d.a(this, TransferInvestmentsFlowContract$Step.NewTransferAccountSelector.f91614a, f0.f322471a, cVar);
    }

    public static final void I2(d dVar, TradingAccount tradingAccount, boolean z) throws Throwable {
        yki.a aVar = dVar.f91624s;
        int i = f.f234555a[dVar.o.f234552a.ordinal()];
        if (i == 1) {
            h.t2(dVar, aVar, new TransferInvestmentsFlowContract$Step.NewTransferInvestmentsTypeSelection(tradingAccount), z, null, false, 12);
        } else if (i == 2) {
            h.t2(dVar, aVar, new TransferInvestmentsFlowContract$Step.TransferInFlow(tradingAccount), z, null, false, 12);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.K2(tradingAccount, z);
        }
    }

    public final PromptMarketingScreen J2(int i, int i2) {
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("NEW_TRANSFER_OUT_PROMPT_LIST_ID", new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D158", null, null, null, 30)), null, null, new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
        paf.d block = new paf.d(this, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    public final void K2(TradingAccount tradingAccount, boolean z) throws Throwable {
        boolean z3 = tradingAccount instanceof TradingAccount.GIA;
        yki.a aVar = this.f91624s;
        if (z3) {
            if (((jte.d) this.f91622q).c(TransferInvestmentsApi$Toggles.PortfolioTransferOut.f91497c)) {
                h.t2(this, aVar, new TransferInvestmentsFlowContract$Step.TransferOutFlow(tradingAccount), z, null, false, 12);
                return;
            } else {
                l2(new paf.h(this, (TradingAccount.GIA) tradingAccount, null), new yi5.b(26));
                return;
            }
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
            h.t2(this, aVar, TransferInvestmentsFlowContract$Step.NewIsaTransferOut.f91612a, z, null, false, 12);
            return;
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
            h.t2(this, aVar, TransferInvestmentsFlowContract$Step.NewPersonalJisaTransferOut.f91613a, z, null, false, 12);
            return;
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
            h.t2(this, aVar, TransferInvestmentsFlowContract$Step.NewCustodianJisaTransferOut.f91611a, z, null, false, 12);
            return;
        }
        if (!(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
        hx7.e.n(new IllegalStateException("Transfer out is not supported for " + tradingAccount.W()));
        L2();
    }

    public final void L2() {
        X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91624s;
    }
}
