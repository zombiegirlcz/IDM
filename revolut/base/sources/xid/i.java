package xid;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import wg9.p;
import xid.d;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r5v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        Double d;
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Data data = (Data) pair.f186385a;
        Data data2 = (Data) pair.f186386b;
        l lVar = this.v;
        y yVar = lVar.f306340s;
        Double d5 = ((c) ((j2) yVar.f22677a).getValue()).d;
        fvb.a aVar2 = (fvb.a) data.getContent();
        if (aVar2 != null) {
            ArrayList arrayList2 = aVar2.i;
            arrayList = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList.add(new Double(((RevPoints) it8.next()).J()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        if (d5 != null || (d5 = lVar.o.f87146b) != null) {
            d = d5;
        } else if (((Collection) arrayList).isEmpty()) {
            d = null;
        } else {
            d5 = (Double) d0.b0(arrayList);
            d = d5;
        }
        fvb.a aVar3 = (fvb.a) ((c) ((j2) yVar.f22677a).getValue()).f306323b.getContent();
        fvb.c cVar = aVar3 != null ? aVar3.f138410j : null;
        fvb.c cVar2 = fvb.c.WON;
        boolean z = cVar == cVar2;
        lVar.H2(yVar, new p(data, data2, d, (Object) arrayList, 9));
        if (!z) {
            fvb.a aVar4 = (fvb.a) data.getContent();
            if ((aVar4 != null ? aVar4.f138410j : null) == cVar2) {
                lVar.C2(d.b.f306326a);
            }
        }
        return Unit.f186387a;
    }
}
