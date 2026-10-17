package h8d;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import wf0.a0;
import wf0.e0;
import wf0.g0;
import wf0.k0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f150006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f150007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f150008y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, v vVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f150008y = vVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f150008y, continuation);
                sVar.f150006w = flowCollector;
                sVar.f150007x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(1, this.f150008y, continuation);
                sVar2.f150006w = flowCollector;
                sVar2.f150007x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        Flow flowC;
        Flow gVar2;
        Flow flowE;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f150006w;
                    o oVar = (o) this.f150007x;
                    boolean z = oVar.f150000b;
                    String query = oVar.f149999a;
                    if (z || (!oVar.d && query.length() <= 2)) {
                        gVar = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    } else {
                        a0 a0Var = this.f150008y.f150011p;
                        a0Var.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        if (d0.W(query)) {
                            flowC = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                        } else {
                            g0 g0Var = (g0) a0Var.f296867c;
                            g0Var.getClass();
                            Intrinsics.checkNotNullParameter(query, "query");
                            flowC = g0Var.d.c(new e0(query), true);
                        }
                        gVar = t1.E(flowC);
                    }
                    this.f150006w = null;
                    this.f150007x = null;
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
                    FlowCollector flowCollector2 = this.f150006w;
                    o oVar2 = (o) this.f150007x;
                    ghk.x xVar = new ghk.x(oVar2, 6);
                    v vVar = this.f150008y;
                    vVar.x2(xVar);
                    boolean z3 = oVar2.d;
                    String query2 = oVar2.f149999a;
                    int i3 = 2;
                    Continuation continuation = null;
                    if (z3 || query2.length() > 2) {
                        a0 a0Var2 = vVar.f150011p;
                        boolean z4 = oVar2.f150000b;
                        vVar.f150014s.getClass();
                        k0 faqTreeMode = k0.Pigeon;
                        a0Var2.getClass();
                        Intrinsics.checkNotNullParameter(query2, "query");
                        Intrinsics.checkNotNullParameter(faqTreeMode, "faqTreeMode");
                        if (d0.W(query2)) {
                            gVar2 = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                        } else {
                            Integer num = z4 ? 3 : null;
                            g0 g0Var2 = (g0) a0Var2.f296867c;
                            g0Var2.getClass();
                            Intrinsics.checkNotNullParameter(query2, "query");
                            gVar2 = vkm.q.Q(!d0.W(query2) ? xam.a.h(new tk9.i(i3, 22, continuation), g0Var2.e.c(new wf0.d0(query2, num, g0Var2.f296887b.a()), true)) : new go.g(zi0.c.P(ig0.b.f161069a, false, null, 3), 2), new mki.d(continuation, a0Var2, query2, faqTreeMode, 29));
                        }
                        flowE = t1.E(gVar2);
                    } else {
                        flowE = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    }
                    this.f150006w = null;
                    this.f150007x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = flowE.collect(new g23.e0(flowCollector2, oVar2, 17), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
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
