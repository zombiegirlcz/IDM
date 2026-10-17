package ti9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.r0;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.w;
import zhm.z0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f271452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f271452w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f271452w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f271452w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((zh9.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 23;
        g gVar = this.f271452w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) pair.f186385a;
                zh9.i iVar = (zh9.i) pair.f186386b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((r0) it8.next()).f322327b);
                }
                Set setI1 = d0.i1(arrayList);
                zh9.h hVar = iVar.f;
                LinkedHashSet linkedHashSetL = a1.l(setI1, z0.h(hVar != null ? hVar.f322267a : null));
                if (linkedHashSetL.isEmpty()) {
                    ux4.b.Companion.getClass();
                    return new go.g(zi0.c.P(ux4.b.f283863b, false, null, 3), 2);
                }
                ArrayList arrayList2 = new ArrayList(w.t(linkedHashSetL, 10));
                Iterator it9 = linkedHashSetL.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(gVar.g((String) it9.next()));
                }
                return nim.a.v(u0.k(arrayList2), new tfh.a(i2));
            default:
                zh9.i iVar2 = (zh9.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return nim.a.v(nim.a.v(rd0.e.b(osg.b.g(gVar.f271457b, w4l.h.f294642c, io3.l.INSTALMENT, null, null, null, null, null, 124)), new te8.a(iVar2.f322280a, 6)), new td1.f(iVar2, i2));
        }
    }
}
