package qa9;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f243978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f243979x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f243979x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f243979x, continuation, 0);
                cVar.f243978w = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f243979x, continuation, 1);
                cVar2.f243978w = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f243978w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    d dVar = this.f243979x;
                    ArrayList arrayListC = ((o8b.c) dVar.f243981b).c(((ik3.c) dVar.f243980a).c(), true);
                    ArrayList arrayList = new ArrayList(zhm.w.t(arrayListC, 10));
                    Iterator it8 = arrayListC.iterator();
                    while (it8.hasNext()) {
                        kii.e.B(wi0.b.Companion, ((r8b.a) it8.next()).f252402a, arrayList);
                    }
                    Data dataP = zi0.c.P(arrayList, false, null, 3);
                    this.f243978w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar) {
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
                FlowCollector flowCollector2 = (FlowCollector) this.f243978w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    o8b.c cVar = (o8b.c) this.f243979x.f243981b;
                    ArrayList arrayListC2 = cVar.c(cVar.f(), false);
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListC2, 10));
                    Iterator it9 = arrayListC2.iterator();
                    while (it9.hasNext()) {
                        kii.e.B(wi0.b.Companion, ((r8b.a) it9.next()).f252402a, arrayList2);
                    }
                    Data dataP2 = zi0.c.P(arrayList2, false, null, 3);
                    this.f243978w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP2, this) == aVar2) {
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
