package rnb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f255560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f255561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f255562y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Continuation continuation, m mVar, String str, int i) {
        super(3, continuation);
        this.u = i;
        this.f255562y = mVar;
        this.z = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                j jVar = new j(continuation, this.f255562y, this.z, 0);
                jVar.f255560w = flowCollector;
                jVar.f255561x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            default:
                j jVar2 = new j(continuation, this.f255562y, this.z, 1);
                jVar2.f255560w = flowCollector;
                jVar2.f255561x = obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowI;
        Flow flowI2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f255560w;
                    if (((Boolean) this.f255561x).booleanValue()) {
                        flowI = nim.a.v(rd0.e.b(((yua.q) this.f255562y.f255567b).q(this.z)), l.f);
                    } else {
                        flowI = zi0.c.i(djb.i.f115280a);
                    }
                    this.f255560w = null;
                    this.f255561x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowI, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f255560w;
                    if (((Boolean) this.f255561x).booleanValue()) {
                        m mVar = this.f255562y;
                        djb.n nVar = mVar.f255566a;
                        w4l.h hVar = w4l.h.f294642c;
                        String str = this.z;
                        flowI2 = boh.f.e(rd0.e.b(((i) nVar).b(str, hVar)), new nyb.q(mVar, str, 18));
                    } else {
                        flowI2 = zi0.c.i(djb.s.f115286a);
                    }
                    this.f255560w = null;
                    this.f255561x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowI2, this) == aVar2) {
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
