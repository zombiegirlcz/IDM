package a82;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import klf.a3;
import knd.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;
import y20.a1;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f2015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f2016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.multibanco.impl.ui.home.area.b f2017y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.apm.multibanco.impl.ui.home.area.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f2017y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f2017y, continuation);
                pVar.f2015w = flowCollector;
                pVar.f2016x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            default:
                p pVar2 = new p(1, this.f2017y, continuation);
                pVar2.f2015w = flowCollector;
                pVar2.f2016x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow pVar;
        switch (this.u) {
            case 0:
                com.revolut.feature.apm.multibanco.impl.ui.home.area.b bVar = this.f2017y;
                z72.e eVar = bVar.f62602p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f2015w;
                    l72.d dVar = (l72.d) eVar.f319857c;
                    dVar.getClass();
                    Continuation continuation = null;
                    vkm.y yVarE = rd0.e.e(new a3i.i(yh5.b.h(new ax9.o(yh5.b.d(vkm.q.Q(new v1(new h0(dVar, continuation, 24)), new a3(continuation, dVar, 20)), rd0.e.b(eVar.e.a(false))), 24), ((u12.c) eVar.f319855a).c(MultibancoContact.class), ((u12.c) eVar.f319855a).f(MoneyRequestChannel.MBWay.f60332b), rd0.e.b(whf.b.a(eVar.d.f242737a, te0.w.h(q72.a.a()), null, 4, null, 10)), nim.a.v(eVar.f319856b.a(), new z55.w(13))), bVar, 2), zhm.h0.f322473a, new q(3, 0, continuation));
                    this.f2015w = null;
                    this.f2016x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarE, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f2015w;
                    Continuation continuation2 = null;
                    if (((Boolean) this.f2016x).booleanValue()) {
                        y62.b bVar2 = this.f2017y.f62608x;
                        bVar2.getClass();
                        pVar = new v1(new a1(bVar2, continuation2, 6));
                    } else {
                        pVar = new v0f.p(new Long[0], 8);
                    }
                    this.f2015w = null;
                    this.f2016x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, pVar, this) == aVar2) {
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
