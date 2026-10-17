package ag8;

import gim.i;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yhm.r;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f4800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f4801x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Continuation continuation, e eVar, String str, int i) {
        super(2, continuation);
        this.u = i;
        this.f4800w = eVar;
        this.f4801x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(continuation, this.f4800w, this.f4801x, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(continuation, this.f4800w, this.f4801x, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) pair.f186385a;
                Object obj3 = pair.f186386b;
                Object obj4 = rVar.f314201a;
                Object obj5 = rVar.f314202b;
                lf8.c cVar = (lf8.c) rVar.f314203c;
                Map map = (Map) obj5;
                List list = (List) obj4;
                kc8.a aVar2 = kc8.a.PHYSICAL;
                Map mapG = r0.g();
                return e.a(this.f4800w, this.f4801x, list, map, cVar, aVar2, mapG, (Map) obj3);
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar2 = (r) pair2.f186385a;
                Pair pair3 = (Pair) pair2.f186386b;
                Object obj6 = rVar2.f314201a;
                Object obj7 = rVar2.f314202b;
                Object obj8 = rVar2.f314203c;
                Object obj9 = pair3.f186385a;
                Map map2 = (Map) pair3.f186386b;
                lf8.c cVar2 = (lf8.c) obj8;
                Map map3 = (Map) obj7;
                List list2 = (List) obj6;
                String str = this.f4801x;
                kc8.a aVar4 = kc8.a.VIRTUAL;
                return e.a(this.f4800w, str, list2, map3, cVar2, aVar4, (Map) obj9, map2);
        }
    }
}
