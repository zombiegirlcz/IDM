package chf;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.s9;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f24207w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24207w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f24207w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f24207w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((fo3.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        c cVar = this.f24207w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((IncomeSorter) it8.next()).f99162c);
                }
                return xam.a.h(new a(cVar, list, continuation, i2), rd0.e.b(whf.b.a(cVar.f24209b, te0.w.h(new s9(d0.i1(arrayList))), null, null, null, 14)));
            default:
                fo3.c cVar2 = (fo3.c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return xam.a.h(new b(cVar, continuation, i2), ((etj.o) cVar.f24208a).m(cVar2.f136801a, hzi.c.RECURRING, hzi.b.ACTIVE));
        }
    }
}
