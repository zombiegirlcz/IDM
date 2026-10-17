package raf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function1 {
    public n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f252836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f252837x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(RowDelegate.Model model, n nVar, Continuation continuation) {
        super(1, continuation);
        this.f252836w = model;
        this.f252837x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.f252836w, this.f252837x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.f252836w.u;
            boolean z = obj3 instanceof c;
            n nVar2 = this.f252837x;
            if (z) {
                TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = ((c) obj3).f252825a;
                if (com.revolut.shared.feature.wealth.models.trading_accounts.b.d(tradingAccountAvailableToOnboard.f)) {
                    ba8.f fVar = nVar2.f252840r;
                    this.u = nVar2;
                    this.v = 1;
                    obj2 = fVar.b(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    nVar = nVar2;
                } else {
                    TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType withTradingAccountType = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType(tradingAccountAvailableToOnboard.d);
                    nVar2.getClass();
                    nVar2.n2(new l(nVar2, withTradingAccountType, null), new whi.b(6));
                }
            } else if (obj3 instanceof d) {
                TradingAccount tradingAccount = ((d) obj3).f252826a;
                if (com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount)) {
                    nVar2.C2(new f(tradingAccount));
                } else {
                    TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount withTradingAccount = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount);
                    nVar2.getClass();
                    nVar2.n2(new l(nVar2, withTradingAccount, null), new whi.b(6));
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nVar = this.u;
        yhm.o.b(obj2);
        nVar.C1(u0.b((NaviCommand) obj2));
        return Unit.f186387a;
    }
}
