package m9d;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1 f203735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203736x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(g1 g1Var, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f203735w = g1Var;
        this.f203736x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p0 p0Var = new p0(this.f203735w, continuation);
                p0Var.f203736x = obj2;
                return p0Var;
            default:
                return new p0(this.f203735w, this.f203736x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f203736x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                g1 g1Var = this.f203735w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f203736x = flowCollector;
                    this.v = 1;
                    obj2 = g1Var.B2(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    Data data = new Data(new Integer(0), null, false, 6, null);
                    this.f203736x = null;
                    this.v = 2;
                    if (flowCollector.emit(data, this) == aVar) {
                        return aVar;
                    }
                } else {
                    vkm.d dVarB = rd0.e.b(nim.a.w(((v20.f0) g1Var.v.f211647a).f285392p.f(new v20.m(null), true), new n1j.t(24)));
                    this.f203736x = null;
                    this.v = 3;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    g1 g1Var2 = this.f203735w;
                    lai.d dVar = new lai.d(g1Var2, this.f203736x, null, 26);
                    this.v = 1;
                    if (g1Var2.p2(this, dVar) == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(g1 g1Var, Continuation continuation) {
        super(2, continuation);
        this.f203735w = g1Var;
    }
}
