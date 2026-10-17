package x8j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f303424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f303425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g0 f303426y;
    public final /* synthetic */ xi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(g0 g0Var, xi0.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303426y = g0Var;
        this.z = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f303426y, this.z, continuation, 0);
                c0Var.f303425x = obj2;
                return c0Var;
            default:
                c0 c0Var2 = new c0(this.f303426y, this.z, continuation, 1);
                c0Var2.f303425x = obj2;
                return c0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f303425x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f303424w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    o8j.b bVar = this.f303426y.z;
                    this.f303425x = null;
                    this.v = flowCollector;
                    this.f303424w = 1;
                    bVar.getClass();
                    obj2 = Boolean.TRUE;
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector = this.v;
                    yhm.o.b(obj2);
                }
                this.f303425x = null;
                this.v = null;
                this.f303424w = 2;
                if (flowCollector.emit(obj2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f303425x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f303424w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    kpj.f fVar = this.f303426y.A;
                    this.f303425x = null;
                    this.v = flowCollector2;
                    this.f303424w = 1;
                    fVar.getClass();
                    obj2 = Boolean.TRUE;
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector2 = this.v;
                    yhm.o.b(obj2);
                }
                this.f303425x = null;
                this.v = null;
                this.f303424w = 2;
                if (flowCollector2.emit(obj2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
