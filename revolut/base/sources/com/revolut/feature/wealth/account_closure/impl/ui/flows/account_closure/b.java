package com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackOptions;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import ghl.c;
import gug.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vrl.g;
import ybl.d;
import ybl.i;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements gug.b {

    @NotNull
    public static final e Companion = new e();
    public final AccountClosureFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ktg.a f94919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f94920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f94921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f94922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f94923t;
    public final bvg.a u;
    public final qki.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.i f94924w;

    public b(AccountClosureFlowContract$InputData inputData, ktg.a accountClosureInteractor, k tradingAccountsInteractor, i productAvailabilityInteractor, d portfolioInteractor, g investOrdersInteractor, bvg.a accountClosureStatusDialogFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountClosureInteractor, "accountClosureInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(productAvailabilityInteractor, "productAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(accountClosureStatusDialogFactory, "accountClosureStatusDialogFactory");
        this.o = inputData;
        this.f94919p = accountClosureInteractor;
        this.f94920q = tradingAccountsInteractor;
        this.f94921r = productAvailabilityInteractor;
        this.f94922s = portfolioInteractor;
        this.f94923t = investOrdersInteractor;
        this.u = accountClosureStatusDialogFactory;
        this.v = hx7.e.b(this, new AccountClosureFlowContract$FlowState(null, null, null));
        this.f94924w = d8l.d.a(this, new c(this, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b r11, java.lang.String r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b.I2(com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b, java.lang.String, gim.c):java.lang.Object");
    }

    public final void J2(AccountClosureFlowContract$Step accountClosureFlowContract$Step) {
        boolean z = accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.ConsentPromptAndPreconditionsCheck;
        yki.i iVar = this.f94924w;
        if (z || (accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.TradingProductConsentPromptAndPreconditionsCheck) || (accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.NegativeBalance)) {
            h.w2(iVar, accountClosureFlowContract$Step, ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (!(accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.TradingAccountConsent) && !(accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.PrivateMarketsConsent) && !(accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.Feedback) && !(accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.FeedbackCompetitor) && !(accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.FeatureRating) && !(accountClosureFlowContract$Step instanceof AccountClosureFlowContract$Step.UpcomingDividends)) {
            throw new NoWhenBranchMatchedException();
        }
        h.u2(this, iVar, accountClosureFlowContract$Step, null, 6);
    }

    public final AccountClosureFeedbackOptions K2() {
        AccountClosureFeedbackOptions accountClosureFeedbackOptions = ((AccountClosureFlowContract$FlowState) ((j2) this.v.f22677a).getValue()).f94896a;
        if (accountClosureFeedbackOptions != null) {
            return accountClosureFeedbackOptions;
        }
        throw new IllegalStateException("Feedback options not present");
    }

    @Override // yki.j
    public final void M0() {
        AccountClosureFlowContract$Step negativeBalance;
        AccountClosureFlowContract$InputData accountClosureFlowContract$InputData = this.o;
        if (accountClosureFlowContract$InputData instanceof AccountClosureFlowContract$InputData.CloseAccountInputData) {
            negativeBalance = new AccountClosureFlowContract$Step.ConsentPromptAndPreconditionsCheck(((AccountClosureFlowContract$InputData.CloseAccountInputData) accountClosureFlowContract$InputData).f94899a);
        } else if (accountClosureFlowContract$InputData instanceof AccountClosureFlowContract$InputData.CloseTradingProductInputData) {
            AccountClosureFlowContract$InputData.CloseTradingProductInputData closeTradingProductInputData = (AccountClosureFlowContract$InputData.CloseTradingProductInputData) accountClosureFlowContract$InputData;
            negativeBalance = new AccountClosureFlowContract$Step.TradingProductConsentPromptAndPreconditionsCheck(closeTradingProductInputData.f94900a, closeTradingProductInputData.f94901b, closeTradingProductInputData.f94902c);
        } else {
            if (!(accountClosureFlowContract$InputData instanceof AccountClosureFlowContract$InputData.NegativeBalanceInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            negativeBalance = new AccountClosureFlowContract$Step.NegativeBalance(((AccountClosureFlowContract$InputData.NegativeBalanceInputData) accountClosureFlowContract$InputData).f94903a);
        }
        J2(negativeBalance);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94924w;
    }
}
