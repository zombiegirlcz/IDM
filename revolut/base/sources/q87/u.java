package q87;

import com.revolut.feature.global_markets.domain.Market;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f243034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f243035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a f243036y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f243036y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f243036y, continuation);
                uVar.f243034w = flowCollector;
                uVar.f243035x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            default:
                u uVar2 = new u(1, this.f243036y, continuation);
                uVar2.f243034w = flowCollector;
                uVar2.f243035x = obj3;
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
                    FlowCollector flowCollector = this.f243034w;
                    List list = (List) this.f243035x;
                    ybl.b bVar = this.f243036y.f74607w;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((lel.b) it8.next()).f194590b);
                    }
                    jhi.b bVarE = mo3.a.e(com.revolut.data.database.models.openbanking.d.y("MarketDetailsRedesignScreenModel", "observeMainIndexesActive", rd0.e.b(((ael.k) bVar).i(arrayList, n9l.b.SEC_3))), v.f243037a, w.f243038a);
                    this.f243034w = null;
                    this.f243035x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, bVarE, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f243034w;
                    w4l.k loadingStrategy = (w4l.k) this.f243035x;
                    com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar3 = this.f243036y;
                    i4b.f fVar = aVar3.f74605s;
                    Market market = aVar3.o.f74600a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(market, "market");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    prl.e eVar = (prl.e) fVar.f158330b;
                    Intrinsics.checkNotNullParameter(market, "market");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV = nim.a.v(com.revolut.data.database.models.openbanking.d.y("MarketDetailsRedesignScreenModel", "observeRegionDetails", rd0.e.b(((w4l.f) eVar.e).e(market, loadingStrategy))), x.f243039a);
                    this.f243034w = null;
                    this.f243035x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar2) {
                        return aVar2;
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
