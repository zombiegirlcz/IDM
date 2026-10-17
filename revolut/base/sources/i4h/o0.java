package i4h;

import com.revolut.data.model.Data;
import com.revolut.rxdata.core.CompositeException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f158463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f158464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f158465y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i, Continuation continuation, Function1 function1) {
        super(3, continuation);
        this.u = i;
        this.f158465y = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o0 o0Var = new o0(0, continuation, this.f158465y);
                o0Var.f158463w = flowCollector;
                o0Var.f158464x = obj3;
                return o0Var.invokeSuspend(Unit.f186387a);
            case 1:
                o0 o0Var2 = new o0(1, continuation, this.f158465y);
                o0Var2.f158463w = flowCollector;
                o0Var2.f158464x = obj3;
                return o0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                o0 o0Var3 = new o0(2, continuation, this.f158465y);
                o0Var3.f158463w = flowCollector;
                o0Var3.f158464x = obj3;
                return o0Var3.invokeSuspend(Unit.f186387a);
            default:
                o0 o0Var4 = new o0(3, continuation, this.f158465y);
                o0Var4.f158463w = flowCollector;
                o0Var4.f158464x = obj3;
                return o0Var4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow b0Var;
        Flow gVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f158463w;
                    Flow flow = (Flow) this.f158465y.invoke((String) this.f158464x);
                    this.f158463w = null;
                    this.f158464x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flow, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f158463w;
                    Data data = (Data) this.f158464x;
                    Object content = data.getContent();
                    if (content != null) {
                        try {
                            gVar = (Flow) this.f158465y.invoke(content);
                        } catch (Throwable th10) {
                            gVar = new go.g(new Data(null, th10, false, 1, null), 2);
                        }
                        b0Var = new b8d.b0(gVar, data, 1);
                    } else {
                        b0Var = new go.g(new Data(null, data.getError(), data.getLoading(), 1, null), 2);
                    }
                    this.f158463w = null;
                    this.f158464x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, b0Var, this) == aVar2) {
                        return aVar2;
                    }
                    break;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f158463w;
                    Data data2 = (Data) this.f158464x;
                    Object content2 = data2.getContent();
                    if (content2 != null) {
                        try {
                            gVar2 = new b8d.b0((Flow) this.f158465y.invoke(content2), data2, 2);
                        } catch (Throwable th11) {
                            Throwable error = data2.getError();
                            gVar2 = new go.g(new Data(null, error != null ? new CompositeException(zhm.v.k(error, th11)) : error == null ? th11 : error, data2.getLoading(), 1, null), 2);
                        }
                    } else {
                        gVar2 = new go.g(new Data(null, data2.getError(), data2.getLoading(), 1, null), 2);
                    }
                    this.f158463w = null;
                    this.f158464x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar2, this) == aVar3) {
                        return aVar3;
                    }
                    break;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f158463w;
                    String str = (String) this.f158464x;
                    Flow gVar3 = str != null ? (Flow) this.f158465y.invoke(str) : new go.g(zhm.f0.f322471a, 2);
                    this.f158463w = null;
                    this.f158464x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, gVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
