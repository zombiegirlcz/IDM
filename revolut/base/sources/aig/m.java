package aig;

import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.f1;
import vkm.q0;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f5268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f5269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.home.e f5270y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f5270y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(0, this.f5270y, continuation);
                mVar.f5268w = flowCollector;
                mVar.f5269x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m(1, this.f5270y, continuation);
                mVar2.f5268w = flowCollector;
                mVar2.f5269x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
            default:
                m mVar3 = new m(2, this.f5270y, continuation);
                mVar3.f5268w = flowCollector;
                mVar3.f5269x = obj3;
                return mVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f5268w;
                    q0 q0VarN = rd0.e.n(this.f5270y.o.p(u2f.j.MILES), h0.f322473a);
                    this.f5268w = null;
                    this.f5269x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, q0VarN, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f5268w;
                    q0 q0VarN2 = rd0.e.n(this.f5270y.f94351p.i(u2f.j.MILES), h0.f322473a);
                    this.f5268w = null;
                    this.f5269x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, q0VarN2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f5268w;
                    y yVarD = rd0.e.d(rd0.e.b(this.f5270y.f94352q.c(new RevPointsTransactionPageParams(3, null, null, null, f1.MILES, null, null, null, null, 494))), h0.f322473a);
                    this.f5268w = null;
                    this.f5269x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, yVarD, this) == aVar3) {
                        return aVar3;
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
