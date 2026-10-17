package p8k;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f234168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yqi.d f234169x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(yqi.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f234169x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f234169x, continuation, 0);
                hVar.f234168w = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f234169x, continuation, 1);
                hVar2.f234168w = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f234169x, continuation, 2);
                hVar3.f234168w = obj2;
                return hVar3;
            default:
                h hVar4 = new h(this.f234169x, continuation, 3);
                hVar4.f234168w = obj2;
                return hVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f234168w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    List list = this.f234169x.f316033b;
                    this.f234168w = null;
                    this.v = 1;
                    if (flowCollector.emit(list, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                FlowCollector flowCollector2 = (FlowCollector) this.f234168w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    List list2 = this.f234169x.f316033b;
                    this.f234168w = null;
                    this.v = 1;
                    if (flowCollector2.emit(list2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                FlowCollector flowCollector3 = (FlowCollector) this.f234168w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    List list3 = this.f234169x.f316033b;
                    this.f234168w = null;
                    this.v = 1;
                    if (flowCollector3.emit(list3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector4 = (FlowCollector) this.f234168w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    List list4 = this.f234169x.f316033b;
                    this.f234168w = null;
                    this.v = 1;
                    if (flowCollector4.emit(list4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
