package com.revolut.feature.wealth.ui.impl.cash_balance;

import ael.q0;
import aii.u;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.isa.api.navigation.JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor;
import com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.feature.wealth.api.declaration.WithdrawFeatureConfig;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.CashBalanceInfoDialogInputData;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$ModalStep;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import d1h.e;
import eh3.s;
import ej9.t;
import fsl.m;
import hih.b;
import i7d.j;
import i7d.o;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pih.i;
import vkm.j2;
import ybl.k;
import ybl.l;
import z8h.g;
import zhm.h0;
import zjh.b0;
import zjh.n;
import zjh.p;
import zjh.q;
import zjh.v;
import zjh.w;
import zjh.x;
import zjh.z;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements p {

    @NotNull
    public static final w Companion = new w();
    public final w5h.b A;
    public final o7.b B;
    public final gte.a C;
    public final e D;
    public final o E;
    public final CashHoldingsSelectorFlowFactory F;
    public final tzg.h G;
    public final y H;
    public final com.revolut.kompot.navigable.vc.modal.a I;
    public final CashBalanceControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f95967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f95968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wzg.a f95969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f95970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f95971t;
    public final h1h.b u;
    public final bbh.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zgh.b f95972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y5h.b f95973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u5h.b f95974y;
    public final aah.h z;

    public b(b0 stateMapper, CashBalanceControllerContract$InputData inputData, k tradingAccountsInteractor, l tradingConfigInteractor, wzg.a cashHoldingsInteractor, g wealthCombinedBuyingPowerInteractor, m investOrdersWidgetProvider, h1h.b transactionsWidgetControllerModelExtension, bbh.c transactionsListDisclaimersResolver, zgh.b wealthTaxAdvantageLimitWidgetControllerModel, y5h.b wealthGiaMarginOnboardingWidgetControllerModel, u5h.b wealthMarginBorrowingInterestRateWidgetControllerModel, aah.h wealthDisclaimersControllerModelExtension, w5h.b wealthMarginStatusWidgetModelExtension, o7.b remoteDisclaimerScopesResolver, gte.a featureToggleInteractor, e wealthRemoteDisclaimersControllerModelExtension, o helpWidgetControllerModelExtension, CashHoldingsSelectorFlowFactory cashHoldingsSelectorFlowFactory, tzg.h investWithdrawToMoveMoneyChecker) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(wealthCombinedBuyingPowerInteractor, "wealthCombinedBuyingPowerInteractor");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(transactionsListDisclaimersResolver, "transactionsListDisclaimersResolver");
        Intrinsics.checkNotNullParameter(wealthTaxAdvantageLimitWidgetControllerModel, "wealthTaxAdvantageLimitWidgetControllerModel");
        Intrinsics.checkNotNullParameter(wealthGiaMarginOnboardingWidgetControllerModel, "wealthGiaMarginOnboardingWidgetControllerModel");
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingInterestRateWidgetControllerModel, "wealthMarginBorrowingInterestRateWidgetControllerModel");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthMarginStatusWidgetModelExtension, "wealthMarginStatusWidgetModelExtension");
        Intrinsics.checkNotNullParameter(remoteDisclaimerScopesResolver, "remoteDisclaimerScopesResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersControllerModelExtension, "wealthRemoteDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(cashHoldingsSelectorFlowFactory, "cashHoldingsSelectorFlowFactory");
        Intrinsics.checkNotNullParameter(investWithdrawToMoveMoneyChecker, "investWithdrawToMoveMoneyChecker");
        this.o = inputData;
        this.f95967p = tradingAccountsInteractor;
        this.f95968q = tradingConfigInteractor;
        this.f95969r = cashHoldingsInteractor;
        this.f95970s = wealthCombinedBuyingPowerInteractor;
        this.f95971t = investOrdersWidgetProvider;
        this.u = transactionsWidgetControllerModelExtension;
        this.v = transactionsListDisclaimersResolver;
        this.f95972w = wealthTaxAdvantageLimitWidgetControllerModel;
        this.f95973x = wealthGiaMarginOnboardingWidgetControllerModel;
        this.f95974y = wealthMarginBorrowingInterestRateWidgetControllerModel;
        this.z = wealthDisclaimersControllerModelExtension;
        this.A = wealthMarginStatusWidgetModelExtension;
        this.B = remoteDisclaimerScopesResolver;
        this.C = featureToggleInteractor;
        this.D = wealthRemoteDisclaimersControllerModelExtension;
        this.E = helpWidgetControllerModelExtension;
        this.F = cashHoldingsSelectorFlowFactory;
        this.G = investWithdrawToMoveMoneyChecker;
        this.H = d.b(this, new q(0), stateMapper, null, false, 12);
        this.I = hx7.e.a(this, new Function2() { // from class: com.revolut.feature.wealth.ui.impl.cash_balance.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CashBalanceControllerContract$ModalStep step = (CashBalanceControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof CashBalanceControllerContract$ModalStep.AvailableToWithdrawDialog;
                b bVar = this.f95966a;
                if (z) {
                    CashBalanceControllerContract$ModalStep.AvailableToWithdrawDialog availableToWithdrawDialog = (CashBalanceControllerContract$ModalStep.AvailableToWithdrawDialog) step;
                    return bVar.e1(new qih.b(availableToWithdrawDialog.f95953a, availableToWithdrawDialog.f95954b, availableToWithdrawDialog.f95955c));
                }
                if (step instanceof CashBalanceControllerContract$ModalStep.JisaAvailableToWithdrawDialog) {
                    return bVar.e1(new JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor(((CashBalanceControllerContract$ModalStep.JisaAvailableToWithdrawDialog) step).f95959a, t98.e.WITHDRAW));
                }
                if (step instanceof CashBalanceControllerContract$ModalStep.UnsettledDialog) {
                    if (((jte.d) bVar.C).c(FeatureWealthApi$Toggles.InvestUnsettledOrdersImprovements.f95163c)) {
                        CashBalanceControllerContract$ModalStep.UnsettledDialog unsettledDialog = (CashBalanceControllerContract$ModalStep.UnsettledDialog) step;
                        return bVar.e1(new i(new UnsettledDialogInputData(unsettledDialog.f95961a, unsettledDialog.f95963c)));
                    }
                    CashBalanceControllerContract$ModalStep.UnsettledDialog unsettledDialog2 = (CashBalanceControllerContract$ModalStep.UnsettledDialog) step;
                    return bVar.e1(new qih.d(unsettledDialog2.f95961a, unsettledDialog2.f95962b));
                }
                if (step instanceof CashBalanceControllerContract$ModalStep.CashHoldingsSelectorDialog) {
                    CashHoldingsSelectorFlowFactory cashHoldingsSelectorFlowFactory2 = bVar.F;
                    CashBalanceControllerContract$ModalStep.CashHoldingsSelectorDialog step2 = (CashBalanceControllerContract$ModalStep.CashHoldingsSelectorDialog) step;
                    CashBalanceControllerContract$InputData inputData2 = bVar.o;
                    cashHoldingsSelectorFlowFactory2.getClass();
                    Intrinsics.checkNotNullParameter(step2, "step");
                    Intrinsics.checkNotNullParameter(inputData2, "inputData");
                    return new CashHoldingsSelectorFlow(step2.f95957a, inputData2, step2.f95958b);
                }
                if (!(step instanceof CashBalanceControllerContract$ModalStep.CashBalanceInfoDialog)) {
                    if (step instanceof CashBalanceControllerContract$ModalStep.KompotDescriptor) {
                        return bVar.e1(((CashBalanceControllerContract$ModalStep.KompotDescriptor) step).f95960a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = bVar.e1(new pih.a(((CashBalanceControllerContract$ModalStep.CashBalanceInfoDialog) step).f95956a));
                v block = new v(bVar, 1);
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            }
        });
    }

    public final void I2(n nVar) {
        CashBalanceInfoDialogInputData marginBorrowingLimitInfoDialog;
        boolean z = nVar instanceof zjh.l;
        y yVar = this.H;
        if (z) {
            zjh.l lVar = (zjh.l) nVar;
            kel.b bVar = lVar.f322841a;
            TradingAccount tradingAccount = lVar.f322842b;
            Data data = ((q) ((j2) yVar.f22677a).getValue()).f322846c;
            marginBorrowingLimitInfoDialog = new CashBalanceInfoDialogInputData.Specific(bVar, tradingAccount, data != null ? (TradingLegalEntityInformation) data.getContent() : null);
        } else if (nVar instanceof zjh.k) {
            List list = ((zjh.k) nVar).f322840a;
            Data data2 = ((q) ((j2) yVar.f22677a).getValue()).f322846c;
            marginBorrowingLimitInfoDialog = new CashBalanceInfoDialogInputData.Consolidated(list, data2 != null ? (TradingLegalEntityInformation) data2.getContent() : null);
        } else {
            if (!(nVar instanceof zjh.m)) {
                throw new NoWhenBranchMatchedException();
            }
            marginBorrowingLimitInfoDialog = new CashBalanceInfoDialogInputData.MarginBorrowingLimitInfoDialog(((zjh.m) nVar).f322843a);
        }
        h.v2(this.I, new CashBalanceControllerContract$ModalStep.CashBalanceInfoDialog(marginBorrowingLimitInfoDialog), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void J2(kel.b bVar) {
        C1(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(new StartUpPocket.InvestCashHolding(bVar.f183150c), com.revolut.shared.feature.move_money.api.navigation.a.SOURCE, 4), (Set) null, 6), null));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.I;
    }

    public final void K2(zjh.o oVar, String str, kel.b bVar) {
        u destination;
        kel.a aVar = bVar.f183148a;
        TransferSubjectId.CashHolding transferSubjectId = new TransferSubjectId.CashHolding(str, aVar.f183145a, aVar.e, bVar.f183150c);
        WealthAccountType product = ydh.a.a(this.o.f95951a);
        int i = x.f322861a[oVar.ordinal()];
        if (i == 1) {
            j0h.a mode = j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT;
            Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(mode, "mode");
            destination = new AddMoneyFeatureConfig.CompositeAddMoney.Destination(new AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithTransferSubjectIdAndWealthAccountType((KompotDestination) null, mode, 0L, transferSubjectId, product));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            xi0.a aVar2 = xi0.b.Companion;
            String str2 = bVar.f183148a.e;
            aVar2.getClass();
            destination = new WithdrawFeatureConfig.Destination(transferSubjectId, product, xi0.a.a(str2));
        }
        C1(destination);
    }

    public final void L2(kel.b bVar, TradingAccount tradingAccount, TradingLegalEntityInformation tradingLegalEntityInformation) {
        FlowStep availableToWithdrawDialog;
        JuniorIsaAccountOwnership custodian;
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) {
            TradingAccount.TaxAdvantage.JIsa jIsa = (TradingAccount.TaxAdvantage.JIsa) tradingAccount;
            if (jIsa instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                custodian = new JuniorIsaAccountOwnership.Custodian(((TradingAccount.TaxAdvantage.JIsa.Custodian) jIsa).f105237n.f105176b);
            } else {
                if (!(jIsa instanceof TradingAccount.TaxAdvantage.JIsa.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                custodian = JuniorIsaAccountOwnership.Personal.f76736a;
            }
            availableToWithdrawDialog = new CashBalanceControllerContract$ModalStep.JisaAvailableToWithdrawDialog(custodian);
        } else {
            availableToWithdrawDialog = new CashBalanceControllerContract$ModalStep.AvailableToWithdrawDialog(bVar, tradingAccount, tradingLegalEntityInformation);
        }
        h.v2(this.I, availableToWithdrawDialog, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        k4l.d dVar;
        CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData = this.o;
        String str = cashBalanceControllerContract$InputData.f95952b;
        String portfolioId = cashBalanceControllerContract$InputData.f95952b;
        q0 q0Var = (q0) this.f95967p;
        w4l.h hVar = w4l.h.f294642c;
        akg.n nVarV = nim.a.v(vkm.q.q(q0Var.o(str, hVar)), new v(this, 0));
        h0 h0Var = h0.f322473a;
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.n(nVarV, h0Var), null, new zjh.y(12, this, continuation), 3);
        TradingAccountType tradingAccountType = cashBalanceControllerContract$InputData.f95951a;
        Intrinsics.checkNotNullParameter(tradingAccountType, "<this>");
        TradingAccountType.Gia gia = TradingAccountType.Gia.f105270a;
        boolean zF = Intrinsics.f(tradingAccountType, gia);
        TradingAccountType.Taa taa2 = TradingAccountType.Taa.f105275a;
        if (zF) {
            yji.l.b1(this, nim.a.v(uzg.a.b(this.f95970s, portfolioId, n9l.b.SEC_10, 4), new zii.c(18)), null, new zjh.y(10, this, continuation), 3);
        } else {
            if (!Intrinsics.f(tradingAccountType, TradingAccountType.Margin.f105271a) && !Intrinsics.f(tradingAccountType, TradingAccountType.MoneyMarketFunds.f105272a) && !Intrinsics.f(tradingAccountType, TradingAccountType.PaperTrading.f105273a) && !Intrinsics.f(tradingAccountType, TradingAccountType.Robo.f105274a) && !Intrinsics.f(tradingAccountType, taa2) && !Intrinsics.f(tradingAccountType, TradingAccountType.Unknown.f105276a)) {
                throw new NoWhenBranchMatchedException();
            }
            yji.l.b1(this, nim.a.v(wzg.a.c(this.f95969r, portfolioId, n9l.b.SEC_3, hVar), new zii.c(19)), null, new zjh.y(11, this, continuation), 3);
        }
        if (Intrinsics.f(tradingAccountType, gia)) {
            dVar = k4l.d.STOCKS;
        } else {
            if (!Intrinsics.f(tradingAccountType, taa2)) {
                throw new IllegalStateException(tradingAccountType + " isn't supported in CashBalance");
            }
            dVar = k4l.d.TAA;
        }
        yji.l.b1(this, ((fsl.w) this.f95971t).a(new InvestOrdersParams.OrdersAll(dVar, (Boolean) null, Intrinsics.f(tradingAccountType, taa2) ? portfolioId : null, 10)), null, new zjh.y(4, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(this.v.a(portfolioId), new z(0, this, continuation)), null, new zjh.y(6, this, continuation), 3);
        yji.l.b1(this, this.f95972w.c3(), null, new zjh.y(2, this, continuation), 3);
        yji.l.b1(this, (j2) ((x6h.d) this.f95973x).o.f22677a, null, new zjh.y(0, this, continuation), 3);
        yji.l.b1(this, (j2) ((w6h.e) this.A).o.f22677a, null, new zjh.y(9, this, continuation), 3);
        yji.l.b1(this, (j2) ((p6h.c) this.f95974y).f233312n.f22677a, null, new zjh.y(3, this, continuation), 3);
        yji.l.b1(this, rd0.e.n(l.d(this.f95968q), h0Var), null, new zjh.y(5, this, continuation), 3);
        if (((jte.d) this.C).c(FeatureWealthApi$Toggles.WealthOrdersAndTransactionsRemoteDisclaimers.f95171c)) {
            o7.b bVar = this.B;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            yji.l.b1(this, vkm.q.Q(mo3.a.f(nim.a.v(((q0) ((k) bVar.f222639b)).o(portfolioId, w4l.h.f294642c), new ej6.x(27)), new s(bVar, 11), new ec8.q(bVar, 6), new t(16)), new z(1, this, continuation)), null, new zjh.y(7, this, continuation), 3);
        } else {
            yji.l.b1(this, nim.a.v(this.z.f2828l.w0(), new zii.c(17)), null, new zjh.y(8, this, continuation), 3);
        }
        yji.l.b1(this, this.E.Z2(new j("cash-balance", new TextLocalisedClause(R.string.contact_us, null, null, 14), i7d.d.f159267a)), null, new zjh.y(1, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.H;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof hih.c;
        b.C0876b c0876b = b.C0876b.f152604a;
        if (!z) {
            return event instanceof b.a ? c0876b : super.o2(event);
        }
        h.v2(this.I, new CashBalanceControllerContract$ModalStep.KompotDescriptor(((hih.c) event).f152605b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return c0876b;
    }
}
