package p2c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f232220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f232221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a f232222y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f232222y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f232222y, continuation);
                sVar.f232220w = flowCollector;
                sVar.f232221x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(1, this.f232222y, continuation);
                sVar2.f232220w = flowCollector;
                sVar2.f232221x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f232220w;
                    vkm.d dVarB = rd0.e.b(this.f232222y.f84182p.j(false));
                    this.f232220w = null;
                    this.f232221x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f232220w;
                    vkm.d dVarB2 = rd0.e.b(xvh.c.c(this.f232222y.o, null, w4l.h.f294642c, 1));
                    this.f232220w = null;
                    this.f232221x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
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
