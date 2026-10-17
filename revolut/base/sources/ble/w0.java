package ble;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends gim.i implements Function3 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f16607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f16608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ gim.i f16609y;
    public FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(Continuation continuation, Function1 function1) {
        super(3, continuation);
        this.f16609y = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w0 w0Var = new w0(continuation, (Function1) this.f16609y);
                w0Var.f16607w = flowCollector;
                w0Var.f16608x = obj3;
                return w0Var.invokeSuspend(Unit.f186387a);
            default:
                w0 w0Var2 = new w0((Function2) this.f16609y, continuation);
                w0Var2.f16607w = flowCollector;
                w0Var2.f16608x = obj3;
                return w0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                if (i == 0) {
                    yhm.o.b(obj2);
                    flowCollector = this.f16607w;
                    this.f16607w = null;
                    this.f16608x = null;
                    this.z = flowCollector;
                    this.v = 1;
                    obj2 = this.f16609y.invoke(this);
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
                    flowCollector = this.z;
                    yhm.o.b(obj2);
                }
                Flow[] flowArr = (Flow[]) zhm.d0.d1((Iterable) obj2).toArray(new Flow[0]);
                this.f16607w = null;
                this.f16608x = null;
                this.z = null;
                this.v = 2;
                vkm.q.w(flowCollector);
                Object objG = mif.e0.g(this, new ag1.i(flowArr, 7), new ag1.j(3, 6, continuation), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    objG = Unit.f186387a;
                }
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    objG = Unit.f186387a;
                }
                if (objG == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    flowCollector2 = this.f16607w;
                    io3.d dVar = (io3.d) this.f16608x;
                    xi0.a aVar3 = xi0.b.Companion;
                    String str = dVar.f163147c;
                    aVar3.getClass();
                    xi0.b bVarA = xi0.a.a(str);
                    this.f16607w = null;
                    this.f16608x = null;
                    this.z = flowCollector2;
                    this.v = 1;
                    obj2 = this.f16609y.invoke(bVarA, this);
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
                    flowCollector2 = this.z;
                    yhm.o.b(obj2);
                }
                go.g gVar = ((Boolean) obj2).booleanValue() ? new go.g(new Data(hzi.e.f157193a, null, false, 6, null), 2) : new go.g(zi0.c.P(hzi.f.f157194a, false, null, 3), 2);
                this.f16607w = null;
                this.f16608x = null;
                this.z = null;
                this.v = 2;
                if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.f16609y = (gim.i) function2;
    }
}
