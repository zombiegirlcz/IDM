package upd;

import com.revolut.feature.subaccount.api.models.Subaccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pcd.x;
import pcd.z;
import tx0.z4;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f281981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f281982x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Continuation continuation, p pVar, xi0.b bVar) {
        super(2, continuation);
        this.f281981w = pVar;
        this.f281982x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(continuation, this.f281981w, this.f281982x);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f281981w, this.f281982x, continuation);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair.f186385a;
                Pair pair2 = (Pair) pair.f186386b;
                Object obj3 = rVar.f314201a;
                Object obj4 = rVar.f314202b;
                Object obj5 = rVar.f314203c;
                Object obj6 = pair2.f186385a;
                List list = (List) pair2.f186386b;
                List list2 = (List) obj6;
                List list3 = (List) obj4;
                String str = ((do3.n) obj3).f116408a;
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : (List) obj5) {
                    Subaccount subaccount = (Subaccount) obj7;
                    if (subaccount instanceof Subaccount.Group) {
                        Iterable iterable = ((Subaccount.Group) subaccount).f88953a.k;
                        if (iterable == null) {
                            iterable = f0.f322471a;
                        }
                        Iterable iterable2 = iterable;
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it8 = iterable2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    x xVar = (x) it8.next();
                                    if (Intrinsics.f(xVar.f234903a, str) && xVar.f234905c == z.ADMIN) {
                                        arrayList.add(obj7);
                                    }
                                }
                            }
                        }
                    }
                }
                List list4 = list;
                ArrayList arrayListE0 = d0.E0(list4, d0.E0(list2, d0.E0(arrayList, list3)));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj8 : arrayListE0) {
                    Subaccount subaccount2 = (Subaccount) obj8;
                    if (lqd.a.d(subaccount2.a(), this.f281982x) && !subaccount2.b()) {
                        arrayList2.add(obj8);
                    }
                }
                return arrayList2;
            default:
                List list5 = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = this.f281981w;
                g6e.d dVar = pVar.f281984b;
                List list6 = list5;
                ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
                Iterator it9 = list6.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(((Subaccount) it9.next()).getF88959a().f234881a);
                }
                return xam.a.h(new z4(pVar, this.f281982x, list5, null, 2), nim.a.A(rd0.e.e(nim.a.A(((s6e.z) dVar).m(d0.i1(arrayList3)), new upc.b(12)), h0.f322473a, new tc6.d(3, 23, null)), new upc.b(13)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f281981w = pVar;
        this.f281982x = bVar;
    }
}
