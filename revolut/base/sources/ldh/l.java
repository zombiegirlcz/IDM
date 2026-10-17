package ldh;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nel.q0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingAccountType f194123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TradingOnboardingFeatureConfig.TradingAccountOrType f194124x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q0 f194125y;
    public final /* synthetic */ bfl.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, TradingAccountType tradingAccountType, TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType, q0 q0Var, bfl.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f194123w = tradingAccountType;
        this.f194124x = tradingAccountOrType;
        this.f194125y = q0Var;
        this.z = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f194123w, this.f194124x, this.f194125y, this.z, continuation);
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
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        bfl.g gVar = this.z;
        m mVar = this.v;
        k kVar = new k(mVar, this.f194123w, this.f194124x, this.f194125y, gVar, null);
        this.u = 1;
        Object objY2 = mVar.Y2(this, kVar);
        return objY2 == aVar ? aVar : objY2;
    }
}
