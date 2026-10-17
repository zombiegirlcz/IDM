package xoh;

import aqd.o1;
import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a f307855w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307855w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f307855w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            default:
                v vVar2 = new v(this.f307855w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair;
        switch (this.u) {
            case 0:
                com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar = this.f307855w;
                y yVar = aVar.f96172t;
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!list.isEmpty()) {
                    ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page = ((j) ((j2) yVar.f22677a).getValue()).f307838b;
                    Map map = ((j) ((j2) yVar.f22677a).getValue()).d;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(hx7.b.G((zel.f) it8.next()));
                    }
                    if (arrayList.contains(screenerAllFiltersFlowContract$Page)) {
                        pair = new Pair(screenerAllFiltersFlowContract$Page, map);
                    } else {
                        Object objB0 = d0.b0(arrayList);
                        LinkedHashMap linkedHashMapZ = r0.z(map);
                        linkedHashMapZ.remove(screenerAllFiltersFlowContract$Page);
                        pair = new Pair(objB0, linkedHashMapZ);
                    }
                    aVar.H2(yVar, new wg9.p(aVar, arrayList, (ScreenerAllFiltersFlowContract$Page) pair.f186385a, (Map) pair.f186386b, 11));
                }
                break;
            default:
                Map map2 = (Map) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar4 = this.f307855w;
                aVar4.H2(aVar4.f96172t, new o1(map2, 22));
                break;
        }
        return Unit.f186387a;
    }
}
