package q6g;

import com.revolut.data.model.Data;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kii.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f242591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f242592x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f242592x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f242592x, continuation, 0);
                bVar.f242591w = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f242592x, continuation, 1);
                bVar2.f242591w = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f242591w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    List listB = ((ik3.c) this.f242592x.f242594b).b();
                    wi0.a aVar2 = wi0.b.Companion;
                    ArrayList arrayList = new ArrayList(w.t(listB, 10));
                    Iterator it8 = listB.iterator();
                    while (it8.hasNext()) {
                        e.B(aVar2, (String) it8.next(), arrayList);
                    }
                    Data dataP = zi0.c.P(arrayList, false, null, 3);
                    this.f242591w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f242591w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    Data dataP2 = zi0.c.P(((ik3.c) this.f242592x.f242594b).g(), false, null, 3);
                    this.f242591w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
