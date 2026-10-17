package b88;

import b4c.t;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f13130w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f13130w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f13130w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f13130w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f13130w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = list;
                if (list2.isEmpty()) {
                    return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                }
                List<psg.a> list3 = list2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                for (psg.a aVar2 : list3) {
                    arrayList.add(nim.a.v(rd0.e.b(((rnb.i) nVar.f13135q).f(new djb.m(aVar2.f239485b), w4l.h.f294642c)), new j(aVar2, 0)));
                }
                return new ag1.k((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 5);
            default:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.u, new t((Data) hVar.f288433a, (Data) hVar.f288434b, (Data) hVar.f288435c, (Data) hVar.d, 1));
                return Unit.f186387a;
        }
    }
}
