package aie;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f5248w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f5249x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.spaces.i f5250y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f5250y = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                t tVar = new t(0, this.f5250y, continuation);
                tVar.f5248w = flowCollector;
                tVar.f5249x = obj3;
                return tVar.invokeSuspend(Unit.f186387a);
            default:
                t tVar2 = new t(1, this.f5250y, continuation);
                tVar2.f5248w = flowCollector;
                tVar2.f5249x = obj3;
                return tVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f5248w;
                    List list = (List) this.f5249x;
                    com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar = this.f5250y;
                    Flow flowG = !com.revolut.feature.tab.accounts.impl.ui.spaces.i.J2(iVar, list).isEmpty() ? iVar.u.g() : new go.g(f0.f322471a, 2);
                    this.f5248w = null;
                    this.f5249x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowG, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f5248w;
                    vkm.y yVarJ = this.f5250y.z.j((md6.c) this.f5249x);
                    this.f5248w = null;
                    this.f5249x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, yVarJ, this) == aVar2) {
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
