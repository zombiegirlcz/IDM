package fs8;

import ag1.k;
import f9g.l;
import g6e.d;
import gim.i;
import h6e.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import s6e.z;
import yhm.o;
import zhm.d0;
import zhm.r0;
import zhm.w;
import zi0.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ zq.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zq.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (list.isEmpty()) {
            return c.i(r0.g());
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (String str : list2) {
            arrayList.add(nim.a.v(((z) ((d) this.v.f324335b)).w(new g(str), w4l.i.f294643c), new l(str, 20)));
        }
        return new k((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 18);
    }
}
