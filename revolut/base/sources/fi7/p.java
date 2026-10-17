package fi7;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f135338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f135339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.instruments.trend.collections.impl.ui.collection.a f135340y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f135340y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f135340y, continuation);
                pVar.f135338w = flowCollector;
                pVar.f135339x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            default:
                p pVar2 = new p(1, this.f135340y, continuation);
                pVar2.f135338w = flowCollector;
                pVar2.f135339x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f135338w;
                    yhm.r rVar = (yhm.r) this.f135339x;
                    w4l.k kVar = (w4l.k) rVar.f314201a;
                    ph7.c cVar = (ph7.c) rVar.f314202b;
                    Map map = (Map) rVar.f314203c;
                    com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar2 = this.f135340y;
                    akg.n nVarN = aVar2.f74916t.N(aVar2.f74915s.f135330a, cVar, map, null, kVar);
                    this.f135338w = null;
                    this.f135339x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarN, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f135338w;
                    Map selectedFilters = (Map) this.f135339x;
                    com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar4 = this.f135340y;
                    hi7.b bVar = aVar4.f74912p;
                    InstrumentsTrendCollectionId collectionId = aVar4.f74915s.f135330a;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                    Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
                    akg.n nVarV = nim.a.v(bVar.f152529a.w0(), new g31.e(collectionId, 24, bVar, selectedFilters));
                    this.f135338w = null;
                    this.f135339x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar3) {
                        return aVar3;
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
