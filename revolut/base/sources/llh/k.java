package llh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lk7.m;
import vkm.q;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthAccount.TaxAdvantageWealthAccount f196824w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f196824w = taxAdvantageWealthAccount;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f196824w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TradingAccount tradingAccount;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = this.f196824w;
        if (i == 0) {
            o.b(obj2);
            ybl.k kVar = this.v.f196827c;
            String f95253a = taxAdvantageWealthAccount.getF95253a();
            Intrinsics.h(f95253a);
            jhi.b bVarG = mo3.a.g(zi0.c.w(rd0.e.n(ybl.k.d(kVar, f95253a), h0.f322473a)), null, new m(11), 1);
            this.u = 1;
            obj2 = q.z(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        od0.i iVar = (od0.i) obj2;
        if (iVar == null || (tradingAccount = (TradingAccount) iVar.g()) == null) {
            throw new IllegalStateException(p.a.p("Account with id ", taxAdvantageWealthAccount.getF95253a(), " not found when trying to launch onboarding for TAA account."));
        }
        return new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount);
    }
}
