package raf;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingOnboardingFeatureConfig.TradingAccountOrType f252835w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f252835w = tradingAccountOrType;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f252835w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType = this.f252835w;
        n nVar = this.v;
        k kVar = new k(nVar, tradingAccountOrType, null);
        this.u = 1;
        Object objP2 = nVar.p2(this, kVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
