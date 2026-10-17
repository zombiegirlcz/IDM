package hbf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f150684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f150685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a f150686y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f150686y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w wVar = new w(0, this.f150686y, continuation);
                wVar.f150684w = flowCollector;
                wVar.f150685x = obj3;
                return wVar.invokeSuspend(Unit.f186387a);
            default:
                w wVar2 = new w(1, this.f150686y, continuation);
                wVar2.f150684w = flowCollector;
                wVar2.f150685x = obj3;
                return wVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f150684w;
                    akg.n nVarD = ybl.l.d(this.f150686y.f91657r);
                    this.f150684w = null;
                    this.f150685x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarD, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f150684w;
                    w4l.k kVar = (w4l.k) this.f150685x;
                    com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar3 = this.f150686y;
                    vkm.d dVarA = aVar3.f91655p.a(aVar3.o.f91653a, kVar);
                    this.f150684w = null;
                    this.f150685x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarA, this) == aVar2) {
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
