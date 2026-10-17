package fu6;

import au6.v;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f138099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f138100x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a f138101y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f138101y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f138101y, continuation);
                pVar.f138099w = flowCollector;
                pVar.f138100x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            case 1:
                p pVar2 = new p(1, this.f138101y, continuation);
                pVar2.f138099w = flowCollector;
                pVar2.f138100x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
            default:
                p pVar3 = new p(2, this.f138101y, continuation);
                pVar3.f138099w = flowCollector;
                pVar3.f138100x = obj3;
                return pVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f138099w;
                    com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar2 = this.f138101y;
                    b9k.f fVar = aVar2.o;
                    String str = aVar2.f73675r.f73668a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    v vVar = (v) fVar.f;
                    vVar.getClass();
                    Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = vVar.f9641m.b(new AcquiringOrder$Id(str), loadingStrategy);
                    this.f138099w = null;
                    this.f138100x = null;
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
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f138099w;
                    com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar4 = this.f138101y;
                    b9k.f fVar2 = aVar4.o;
                    String str2 = aVar4.f73675r.f73668a;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                    w4l.i loadingStrategy2 = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    Flow flowE = boh.f.e(fVar2.s(str2, loadingStrategy2), new eq4.g(fVar2, 20));
                    this.f138099w = null;
                    this.f138100x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowE, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f138099w;
                    com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar6 = this.f138101y;
                    b9k.f fVar3 = aVar6.o;
                    String str3 = aVar6.f73675r.f73668a;
                    fVar3.getClass();
                    Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                    w4l.i loadingStrategy3 = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    v vVar2 = (v) fVar3.f;
                    vVar2.getClass();
                    Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Flow flowE2 = boh.f.e(vVar2.f9642n.b(new AcquiringOrder$Id(str3), loadingStrategy3), new a26.p(aVar6, 29));
                    this.f138099w = null;
                    this.f138100x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowE2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
