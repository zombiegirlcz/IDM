package uf0;

import gim.i;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f279493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f279494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f279495y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Set set, Function3 function3, Continuation continuation) {
        super(3, continuation);
        this.f279494x = set;
        this.f279495y = (i) function3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        c cVar = new c(this.f279494x, this.f279495y, (Continuation) obj4);
        cVar.v = (FlowCollector) obj2;
        cVar.f279493w = (Throwable) obj3;
        return cVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        Throwable th10 = this.f279493w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, this.f279494x);
            this.v = null;
            this.f279493w = null;
            this.u = 1;
            if (this.f279495y.invoke(flowCollector, th10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
