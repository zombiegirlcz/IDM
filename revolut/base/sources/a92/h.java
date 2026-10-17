package a92;

import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import knd.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import v0f.p;
import vkm.q;
import vkm.t;
import vkm.v1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f2302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f2303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f2304y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Continuation continuation, i iVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f2304y = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(continuation, this.f2304y, 0);
                hVar.f2302w = flowCollector;
                hVar.f2303x = obj3;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(continuation, this.f2304y, 1);
                hVar2.f2302w = flowCollector;
                hVar2.f2303x = obj3;
                return hVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow pVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f2302w;
                    g0 g0VarA = this.f2304y.o.a();
                    this.f2302w = null;
                    this.f2303x = null;
                    this.v = 1;
                    if (q.u(flowCollector, g0VarA, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f2302w;
                    List list = (List) this.f2303x;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (c92.a.a((MultibancoWithdrawalCode) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                    Continuation continuation = null;
                    if (arrayList.isEmpty()) {
                        pVar = new p(new Long[0], 8);
                    } else {
                        i iVar = this.f2304y;
                        y62.b bVar = iVar.f2305p;
                        Iterator it8 = arrayList.iterator();
                        if (!it8.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Long l2 = new Long(((MultibancoWithdrawalCode) it8.next()).a());
                        while (it8.hasNext()) {
                            Long l3 = new Long(((MultibancoWithdrawalCode) it8.next()).a());
                            if (l2.compareTo(l3) > 0) {
                                l2 = l3;
                            }
                        }
                        long jLongValue = l2.longValue();
                        bVar.getClass();
                        pVar = new t(new v1(new jvf.e(jLongValue, bVar, continuation, 2)), new a09.p(iVar, continuation, 4));
                    }
                    this.f2302w = null;
                    this.f2303x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, pVar, this) == aVar2) {
                        return aVar2;
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
