package ybh;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f312344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f312345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b f312346y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i, com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f312346y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                r0 r0Var = new r0(0, this.f312346y, continuation);
                r0Var.f312344w = flowCollector;
                r0Var.f312345x = obj3;
                return r0Var.invokeSuspend(Unit.f186387a);
            default:
                r0 r0Var2 = new r0(1, this.f312346y, continuation);
                r0Var2.f312344w = flowCollector;
                r0Var2.f312345x = obj3;
                return r0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f312344w;
                    Pair pair = (Pair) this.f312345x;
                    dj0.d dVar = (dj0.d) pair.f186385a;
                    m1h.h hVar = (m1h.h) pair.f186386b;
                    com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar = this.f312346y;
                    Flow flowE = boh.f.e(new y5j.e(bVar.u.c3(), 8), new a9j.n(bVar, 18, hVar, dVar));
                    this.f312344w = null;
                    this.f312345x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = flowE.collect(new vch.u0(flowCollector, dVar, 1), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                    FlowCollector flowCollector2 = this.f312344w;
                    Pair pair2 = (Pair) this.f312345x;
                    dj0.d dVar2 = (dj0.d) pair2.f186385a;
                    go.g gVar = new go.g((Data) pair2.f186386b, 2);
                    com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar2 = this.f312346y;
                    akg.n nVarV = nim.a.v(zh9.u0.i(gVar, new y5j.e(bVar2.u.c3(), 9), bVar2.f95595x.e(bVar2.o.f95583a)), new xnd.c(bVar2, dVar2, 2));
                    this.f312344w = null;
                    this.f312345x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect2 = nVarV.collect(new n4d.o0(flowCollector2, pair2, 1), this);
                    if (objCollect2 != aVar2) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar2) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar2) {
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
