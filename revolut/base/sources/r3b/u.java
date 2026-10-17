package r3b;

import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f251267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f251268x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.home.a f251269y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.retail.cfd.impl.screens.home.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f251269y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f251269y, continuation);
                uVar.f251267w = flowCollector;
                uVar.f251268x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            default:
                u uVar2 = new u(1, this.f251269y, continuation);
                uVar2.f251267w = flowCollector;
                uVar2.f251268x = obj3;
                return uVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f251267w;
                    com.revolut.feature.retail.cfd.impl.screens.home.a aVar2 = this.f251269y;
                    vkm.f fVarF = ((ael.y) aVar2.f82214p).f(5L, aVar2.o.f82212a);
                    this.f251267w = null;
                    this.f251268x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, fVarF, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.retail.cfd.impl.screens.home.a aVar3 = this.f251269y;
                CfdTradingHomeScreenContract$InputData cfdTradingHomeScreenContract$InputData = aVar3.o;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f251267w;
                    t2b.h hVar = aVar3.f82218t;
                    String portfolioId = cfdTradingHomeScreenContract$InputData.f82212a;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Flow flowH = xam.a.h(new qqj.g(hVar, portfolioId, (Continuation) null, 19), hVar.f267536a.b());
                    y yVar = aVar3.f82219w;
                    String portfolioId2 = cfdTradingHomeScreenContract$InputData.f82212a;
                    yVar.getClass();
                    Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                    akg.n nVarV = nim.a.v(u0.m(flowH, boh.f.e(yVar.f251273b.b(), new r10.b(yVar, portfolioId2, 26))), x.f251271a);
                    this.f251267w = null;
                    this.f251268x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
