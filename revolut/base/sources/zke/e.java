package zke;

import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xzg.o0;
import zf5.n;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f322943b;

    public /* synthetic */ e(g gVar, int i) {
        this.f322942a = i;
        this.f322943b = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        Flow flowA;
        switch (this.f322942a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                TradingAccounts tradingAccounts = (TradingAccounts) pair.f186385a;
                WealthAccount.Commodities commodities = (WealthAccount.Commodities) pair.f186386b;
                List list = tradingAccounts.f105278a;
                ArrayList<TradingAccount> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((TradingAccount) obj3).getD() != cfl.b.TERMINATED) {
                        arrayList.add(obj3);
                    }
                }
                g gVar = this.f322943b;
                gVar.getClass();
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (TradingAccount tradingAccount : arrayList) {
                    if (tradingAccount instanceof TradingAccount.GIA) {
                        flowA = gVar.f322945a.a(tradingAccount);
                    } else if (tradingAccount instanceof TradingAccount.Margin) {
                        flowA = gVar.d.a(tradingAccount);
                    } else if (tradingAccount instanceof TradingAccount.Robo.Regular) {
                        flowA = nim.a.v(gVar.f322947c.a(tradingAccount), new n(gVar, (TradingAccount.Robo.Regular) tradingAccount, 13));
                    } else if ((tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea)) {
                        flowA = gVar.f322946b.a(tradingAccount);
                    } else {
                        if (!(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowA = zi0.c.i(f0.f322471a);
                    }
                    arrayList2.add(nim.a.A(flowA, new f(3)));
                }
                o0 o0Var = commodities.f95230a;
                ArrayList arrayListF0 = d0.F0(zi0.c.i((o0Var == o0.ACTIVE || o0Var == o0.SUSPENDED) ? u.c(new WealthAction.Documents()) : f0.f322471a), arrayList2);
                akg.n nVarV = nim.a.v((Flow) gVar.f322950j.getValue(), new e(gVar, 3));
                jte.d dVar = (jte.d) gVar.e;
                boolean z3 = false;
                go.g gVar2 = new go.g(zi0.c.P(v.l(dVar.c(WealthUiApi$Toggles.InvestReferralCampaign.f95860c) ? new WealthAction.InviteFriends(true, null) : null), false, null, 3), 2);
                boolean zC = dVar.c(FeatureWealthApi$Toggles.JointInvestStocksTransfer.f95165c);
                List<TradingAccount> list2 = tradingAccounts.f105278a;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = false;
                } else {
                    for (TradingAccount tradingAccount2 : list2) {
                        Intrinsics.checkNotNullParameter(tradingAccount2, "<this>");
                        if (com.revolut.shared.feature.wealth.models.trading_accounts.d.j(tradingAccount2.z()) && (zC || !com.revolut.shared.feature.wealth.models.trading_accounts.d.c(tradingAccount2))) {
                            z = true;
                        }
                    }
                    z = false;
                }
                List<TradingAccountAvailableToOnboard> list3 = tradingAccounts.f105279b;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard : list3) {
                        Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
                        if (com.revolut.shared.feature.wealth.models.trading_accounts.d.j(tradingAccountAvailableToOnboard.f105268g) && (zC || !com.revolut.shared.feature.wealth.models.trading_accounts.b.e(tradingAccountAvailableToOnboard))) {
                            z3 = true;
                        }
                    }
                }
                return u0.k(d0.F0(nim.a.v(u0.m(nim.a.v(u0.m(nVarV, zi0.c.i((z || z3) ? u.c(new WealthAction.TransferInvestments(true, null)) : f0.f322471a)), new f(5)), gVar2), new zii.c(29)), arrayListF0));
            case 1:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return d0.E0((List) this.f322943b.k.getValue(), w.u(it8));
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return (List) this.f322943b.k.getValue();
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                this.f322943b.getClass();
                return v.l(zBooleanValue ? new WealthAction.TradingAddOns(null, true, true) : null);
        }
    }
}
