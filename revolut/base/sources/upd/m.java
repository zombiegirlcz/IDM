package upd;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RoboPortfolioInfo f281976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WealthAccount f281977x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, RoboPortfolioInfo roboPortfolioInfo, WealthAccount wealthAccount, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f281976w = roboPortfolioInfo;
        this.f281977x = wealthAccount;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, this.f281976w, this.f281977x, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar = (xi0.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        RoboPortfolioInfo roboPortfolioInfo = this.f281976w;
        boolean zF = Intrinsics.f(bVar, roboPortfolioInfo.f);
        n nVar = this.v;
        return nim.a.v(zF ? nim.a.v(nVar.a(roboPortfolioInfo, bVar), new upc.b(10)) : nim.a.v(u0.m(nVar.a(roboPortfolioInfo, bVar), nVar.a(roboPortfolioInfo, roboPortfolioInfo.f)), new upc.b(11)), new uif.d(roboPortfolioInfo, nVar, this.f281977x));
    }
}
