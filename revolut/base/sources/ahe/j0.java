package ahe;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.u1;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f5006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w0 f5007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(w0 w0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5007x = w0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j0 j0Var = new j0(this.f5007x, continuation, 0);
                j0Var.f5006w = obj2;
                return j0Var;
            default:
                j0 j0Var2 = new j0(this.f5007x, continuation, 1);
                j0Var2.f5006w = obj2;
                return j0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j0) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f5006w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                w0 w0Var = this.f5007x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f5006w = flowCollector;
                    this.v = 1;
                    if (w0.a(w0Var, this) == aVar) {
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
                    yhm.o.b(obj2);
                }
                u1 u1VarH = vkm.q.h(w0Var.f5052s);
                this.f5006w = null;
                this.v = 2;
                vkm.q.w(flowCollector);
                Object objCollect = u1VarH.f290128a.collect(new eg.n0(flowCollector, 7), this);
                if (objCollect != aVar) {
                    objCollect = Unit.f186387a;
                }
                if (objCollect != aVar) {
                    objCollect = Unit.f186387a;
                }
                if (objCollect == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f5006w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Data data = (Data) this.f5007x.f5052s.getValue();
                    if (data != null) {
                        this.f5006w = null;
                        this.v = 1;
                        if (flowCollector2.emit(data, this) == aVar2) {
                            return aVar2;
                        }
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
