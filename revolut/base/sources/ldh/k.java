package ldh;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nel.n;
import nel.q0;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingAccountType f194120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TradingOnboardingFeatureConfig.TradingAccountOrType f194121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q0 f194122y;
    public final /* synthetic */ bfl.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, TradingAccountType tradingAccountType, TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType, q0 q0Var, bfl.g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f194120w = tradingAccountType;
        this.f194121x = tradingAccountOrType;
        this.f194122y = q0Var;
        this.z = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f194120w, this.f194121x, this.f194122y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        k kVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m mVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = mVar.f194128n;
            n nVar = this.f194122y.d;
            this.u = 1;
            kVar = this;
            obj2 = fVar.a(this.f194120w, this.f194121x, nVar, this.z, kVar);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        kVar = this;
        j jVar = new j(mVar, (d) obj2, null, 0);
        p0 p0Var = p0.f264001a;
        tkm.e eVar = zkm.o.f323119a.e;
        kVar.u = 2;
        Object objJ = e0.J(eVar, jVar, this);
        return objJ == aVar ? aVar : objJ;
    }
}
