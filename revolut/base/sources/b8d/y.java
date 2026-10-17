package b8d;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import v20.d1;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f13199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.article.c f13201y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f13201y = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f13201y, continuation);
                yVar.f13199w = flowCollector;
                yVar.f13200x = obj3;
                return yVar.invokeSuspend(Unit.f186387a);
            default:
                y yVar2 = new y(1, this.f13201y, continuation);
                yVar2.f13199w = flowCollector;
                yVar2.f13200x = obj3;
                return yVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f13199w;
                    Data data = (Data) this.f13200x;
                    aj0.c cVar = (aj0.c) data.getContent();
                    if (cVar != null) {
                        String str = cVar.f5343g;
                        kge.d dVar = this.f13201y.f86236p;
                        gVar = new b0(xam.a.h(new m30.k(dVar, str, null), ((rf3.j) dVar.f183975c).a()), data, 0);
                    } else {
                        gVar = new go.g(new Pair(data, new Data(d1.a.f285360a, null, false, 6, null)), 2);
                    }
                    this.f13199w = null;
                    this.f13200x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f13199w;
                    com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar2 = this.f13201y;
                    wkm.l lVarD = ((hg0.m) cVar2.f86241w).d(cVar2.f86243y);
                    this.f13199w = null;
                    this.f13200x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, lVarD, this) == aVar2) {
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
