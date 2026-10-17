package oji;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nvk.v;
import yhm.o;
import ymk.x;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f225785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Flow f225786x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Continuation continuation, Flow flow) {
        super(2, continuation);
        this.u = i;
        this.f225786x = flow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(0, continuation, this.f225786x);
                cVar.f225785w = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(1, continuation, this.f225786x);
                cVar2.f225785w = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(2, continuation, this.f225786x);
                cVar3.f225785w = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(3, continuation, this.f225786x);
                cVar4.f225785w = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(4, continuation, this.f225786x);
                cVar5.f225785w = obj2;
                return cVar5;
            default:
                c cVar6 = new c(5, continuation, this.f225786x);
                cVar6.f225785w = obj2;
                return cVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f225785w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    v vVar = new v(flowCollector, p.a.w(obj2), 9);
                    this.f225785w = null;
                    this.v = 1;
                    if (this.f225786x.collect(vVar, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    cua.b bVar = new cua.b((ProducerScope) this.f225785w, 5);
                    this.v = 1;
                    if (this.f225786x.collect(bVar, this) == aVar2) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    cua.b bVar2 = new cua.b((ProducerScope) this.f225785w, 6);
                    this.v = 1;
                    if (this.f225786x.collect(bVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    cua.b bVar3 = new cua.b((ProducerScope) this.f225785w, 7);
                    this.v = 1;
                    if (this.f225786x.collect(bVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    x xVar = new x((FlowCollector) this.f225785w, 15);
                    this.f225785w = null;
                    this.v = 1;
                    if (this.f225786x.collect(xVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    x xVar2 = new x((FlowCollector) this.f225785w, 16);
                    this.f225785w = null;
                    this.v = 1;
                    if (this.f225786x.collect(xVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
