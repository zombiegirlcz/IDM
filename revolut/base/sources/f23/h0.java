package f23;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f131370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f131371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l0 f131372y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(l0 l0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f131372y = l0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h0 h0Var = new h0(this.f131372y, continuation, 0);
                h0Var.f131371x = obj2;
                return h0Var;
            default:
                h0 h0Var2 = new h0(this.f131372y, continuation, 1);
                h0Var2.f131371x = obj2;
                return h0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h0) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f131371x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f131370w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarC = ((ji5.e) this.f131372y.f131392h).c();
                    this.f131371x = null;
                    this.v = flowCollector;
                    this.f131370w = 1;
                    obj2 = nim.a.b(d0VarC, this);
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
                this.f131371x = null;
                this.v = null;
                this.f131370w = 2;
                if (flowCollector.emit(obj2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f131371x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f131370w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarD = ((ti9.g) this.f131372y.f131389b).d();
                    this.f131371x = null;
                    this.v = flowCollector2;
                    this.f131370w = 1;
                    obj2 = nim.a.b(d0VarD, this);
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
                this.f131371x = null;
                this.v = null;
                this.f131370w = 2;
                if (flowCollector2.emit(obj2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
