package gkf;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.api.PaymentsToggles$RecurringSplit;
import dp4.z0;
import g4b.a0;
import klf.z2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import vkm.q;
import yhm.o;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f144382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f144383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f144384y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Continuation continuation, l lVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f144384y = lVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(continuation, this.f144384y, 0);
                iVar.f144382w = flowCollector;
                iVar.f144383x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(continuation, this.f144384y, 1);
                iVar2.f144382w = flowCollector;
                iVar2.f144383x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow gVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f144382w;
                    Continuation continuation = null;
                    if (((Boolean) this.f144383x).booleanValue()) {
                        l lVar = this.f144384y;
                        SharedFlow sharedFlowD = lVar.f144387a.d();
                        a0 a0Var = new a0(lVar.f144388b.a(), 8);
                        SharedFlow sharedFlow = (SharedFlow) lVar.e.f185540g.getValue();
                        wkm.l lVarQ = q.Q(((cw9.d) lVar.d).c(), new i(continuation, lVar, 1));
                        Flow flowJ = lVar.f144387a.j();
                        a aVar2 = lVar.f144390g;
                        z2 z2Var = aVar2.f144375a;
                        gVar = ta6.a.e(sharedFlowD, a0Var, sharedFlow, lVarQ, new t38.e(flowJ, 24, rd0.e.n(((jte.d) aVar2.f144376b).c(PaymentsToggles$RecurringSplit.f79160c) ? q.Q(q.q(new t38.e((SharedFlow) z2Var.i.getValue(), 24, z2Var.a(), new z0(3, 23, continuation))), new g6f.l(continuation, aVar2, 8)) : new go.g(new Data(a2a.b.f715a, null, false, 6, null), 2), h0.f322473a), new z0(3, 24, continuation)), new g23.i(lVar, continuation, 1));
                    } else {
                        gVar = new go.g(f0.f322471a, 2);
                    }
                    this.f144382w = null;
                    this.f144383x = null;
                    this.v = 1;
                    if (q.u(flowCollector, gVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f144382w;
                    if (((Boolean) this.f144383x).booleanValue()) {
                        l lVar2 = this.f144384y;
                        gVar2 = new ghk.a0(rd0.e.b(lVar2.f144389c.a()), lVar2, 1);
                    } else {
                        gVar2 = new go.g(null, 2);
                    }
                    this.f144382w = null;
                    this.f144383x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, gVar2, this) == aVar3) {
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
