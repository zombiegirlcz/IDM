package a5g;

import akg.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import vkm.q;
import vkm.v1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f1387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a f1389y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f1389y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                j jVar = new j(0, this.f1389y, continuation);
                jVar.f1387w = flowCollector;
                jVar.f1388x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            default:
                j jVar2 = new j(1, this.f1389y, continuation);
                jVar2.f1387w = flowCollector;
                jVar2.f1388x = obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow v1Var;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f1387w;
                    w4l.k kVar = (w4l.k) this.f1388x;
                    com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a aVar2 = this.f1389y;
                    n nVarA = aVar2.o.a(((e) ((j2) aVar2.f93281r.f22677a).getValue()).f1380a, kVar);
                    this.f1387w = null;
                    this.f1388x = null;
                    this.v = 1;
                    if (q.u(flowCollector, nVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f1387w;
                    if (((l7g.q) this.f1388x) == l7g.q.PENDING) {
                        com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a aVar4 = this.f1389y;
                        b4g.f fVar = aVar4.o;
                        String bookingId = ((e) ((j2) aVar4.f93281r.f22677a).getValue()).f1380a;
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        v1Var = new v1(new a1a.c(fVar, bookingId, (Continuation) null));
                    } else {
                        v1Var = vkm.i.f290039a;
                    }
                    this.f1387w = null;
                    this.f1388x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, v1Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
