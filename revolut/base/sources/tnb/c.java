package tnb;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ djb.k f272371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, djb.k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f272371w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f272371w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ejb.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        ejb.b bVar = (ejb.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar2 = this.v;
        djb.u uVar = gVar2.f272378b;
        List list = bVar.f126837b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((SavingsAccountDetails) it8.next()).f86460a);
        }
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarB = rd0.e.b(((rnb.x) uVar).a(arrayList, hVar));
        cxe.u uVarA = gVar2.f272379c.a(w4l.j.f294644c);
        cxe.u uVarE = ((d89.g) gVar2.d).e(z79.b.OTHER);
        djb.k kVar = this.f272371w;
        if (kVar instanceof djb.l) {
            gVar = nim.a.v(gVar2.f.b(hVar), new aob.e(kVar, 1));
        } else {
            od0.i.Companion.getClass();
            gVar = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
        }
        return nim.a.u(new a9h.a((Continuation) null, gVar2, kVar, bVar, 29), u0.m(u0.i(dVarB, uVarA, uVarE), gVar));
    }
}
