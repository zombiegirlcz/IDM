package auj;

import ard.t;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f9850w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9850w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f9850w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f9850w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((d0j.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aim.o oVarA;
        List list;
        Object[] objArr = 0;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = (List) data.getContent();
                boolean z = false;
                if (list2 != null) {
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it8 = list3.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                if (((d0j.q) it8.next()).f110425a) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                boolean z3 = z;
                List list4 = (List) data.getContent();
                if (list4 != null) {
                    aim.o oVar = new aim.o();
                    Iterator it9 = list4.iterator();
                    while (it9.hasNext()) {
                        Iterator it10 = ((d0j.q) it9.next()).f110426b.iterator();
                        while (it10.hasNext()) {
                            oVar.add(((d0j.h) it10.next()).f110400b);
                        }
                    }
                    oVarA = y0.a(oVar);
                } else {
                    oVarA = null;
                }
                n nVar = this.f9850w;
                nVar.H2(nVar.f9854r, new t(oVarA, nVar, data, z3, 1));
                LinkedHashSet linkedHashSet = nVar.f9856t;
                if (!nVar.J2() && (list = (List) data.getContent()) != null) {
                    ArrayList<d0j.h> arrayList = new ArrayList();
                    Iterator it11 = list.iterator();
                    while (it11.hasNext()) {
                        a0.x(((d0j.q) it11.next()).f110426b, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (d0j.h hVar : arrayList) {
                        d0j.n nVar2 = hVar.d;
                        String str = hVar.f110399a;
                        mtj.a aVar2 = (nVar2 != d0j.n.COMPLETED || hVar.f110404j || linkedHashSet.contains(str)) ? null : new mtj.a(hVar.f110400b, str, null);
                        if (aVar2 != null) {
                            arrayList2.add(aVar2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        Iterator it12 = arrayList2.iterator();
                        while (it12.hasNext()) {
                            arrayList3.add(((mtj.a) it12.next()).f208867b);
                        }
                        linkedHashSet.addAll(arrayList3);
                        nVar.l2(new ald.l(nVar, arrayList2, objArr == true ? 1 : 0, 28), new yi5.b(26));
                    }
                }
                break;
            default:
                d0j.h hVar2 = (d0j.h) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar3 = this.f9850w;
                nVar3.f9855s = Intrinsics.f(nVar3.f9855s, hVar2.f110400b) ? null : nVar3.f9855s;
                nVar3.H2(nVar3.f9854r, new as9.a(hVar2, nVar3, 8));
                break;
        }
        return Unit.f186387a;
    }
}
