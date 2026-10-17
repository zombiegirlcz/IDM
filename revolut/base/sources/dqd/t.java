package dqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f116959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f116960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterHomeContract$DestinationValue f116961y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y yVar, IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116960x = yVar;
        this.f116961y = incomeSorterHomeContract$DestinationValue;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f116960x, this.f116961y, continuation, 0);
                tVar.f116959w = obj2;
                return tVar;
            default:
                t tVar2 = new t(this.f116960x, this.f116961y, continuation, 1);
                tVar2.f116959w = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f116959w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    od0.i iVar = (od0.i) this.f116960x.f116970c.get(this.f116961y);
                    aqd.l lVar = iVar != null ? (aqd.l) iVar.f224257a : null;
                    this.f116959w = null;
                    this.v = 1;
                    if (flowCollector.emit(lVar, this) == aVar) {
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
                FlowCollector flowCollector2 = (FlowCollector) this.f116959w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    od0.i iVar2 = (od0.i) this.f116960x.f116970c.get(this.f116961y);
                    aqd.l lVar2 = iVar2 != null ? (aqd.l) iVar2.f224257a : null;
                    this.f116959w = null;
                    this.v = 1;
                    if (flowCollector2.emit(lVar2, this) == aVar2) {
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
