package h3b;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceController;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceControllerContract$InputData;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CfdCashBalanceController f149080w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CfdCashBalanceController cfdCashBalanceController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149080w = cfdCashBalanceController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f149080w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f149080w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        rp0.t tVar;
        int i = this.u;
        CfdCashBalanceController cfdCashBalanceController = this.f149080w;
        switch (i) {
            case 0:
                h action = (h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVar = (v) cfdCashBalanceController.R2();
                CfdCashBalanceControllerContract$InputData cfdCashBalanceControllerContract$InputData = vVar.o;
                Intrinsics.checkNotNullParameter(action, "action");
                int i2 = t.f149100a[action.ordinal()];
                if (i2 == 1) {
                    vVar.C1(u0.b(b3f.b.b(vVar.u, new TransferSubjectId.Portfolio(cfdCashBalanceControllerContract$InputData.f82204a.f183148a.f183146b), WealthAccountType.MARGIN, null, null, 12)));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jte.d dVar = (jte.d) vVar.v;
                    if (dVar.c(FeatureWealthApi$Toggles.InvestWithdrawToMoveMoney.f95164c) && dVar.c(FeatureWealthApi$Toggles.CfdMoveMoney.f95155c)) {
                        vVar.C1(((ale.b) vVar.f149107w).a(cfdCashBalanceControllerContract$InputData.f82204a, com.revolut.shared.feature.move_money.api.navigation.a.SOURCE));
                    } else {
                        kel.b bVar = cfdCashBalanceControllerContract$InputData.f82204a;
                        vVar.C1(new CfdTradingFeatureConfig.Withdraw.Destination(bVar.f183148a.f183146b, yoj.b.f(bVar)));
                    }
                }
                return Unit.f186387a;
            default:
                m balancesField = (m) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVar2 = (v) cfdCashBalanceController.R2();
                vVar2.getClass();
                Intrinsics.checkNotNullParameter(balancesField, "balancesField");
                vVar2.f149103q.getClass();
                Intrinsics.checkNotNullParameter(balancesField, "balancesField");
                int i3 = w.f149109a[balancesField.ordinal()];
                if (i3 == 1) {
                    tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_account_value_title, null, null, 14), new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_account_value_description, null, null, 14), null, 28);
                } else if (i3 == 2) {
                    tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_pnl_title, null, null, 14), new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_pnl_description, null, null, 14), null, 28);
                } else if (i3 == 3) {
                    tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_margin_reserved_title, null, null, 14), new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_margin_reserved_description, null, null, 14), null, 28);
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_available_to_invest_title, null, null, 14), new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_available_to_invest_description, null, null, 14), null, 28);
                }
                rp0.t tVar2 = tVar;
                List listC = zhm.u.c(new LargeActionButtonDelegate.Model("balances-field-info-dialog-got-it", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_trading_common_action_got_it, null, null, 14), false, null, null, l.f149087a, null, 744));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                vVar2.f149104r.x(new rp0.y(listC, tVar2, rp0.l.WINDOW, null, null, null, 1016));
                return Unit.f186387a;
        }
    }
}
