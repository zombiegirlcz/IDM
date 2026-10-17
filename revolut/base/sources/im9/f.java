package im9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jq9.m;
import jq9.n;
import jq9.p;
import jq9.v;
import jq9.w;
import jq9.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f162323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f162324x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(c cVar, i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162323w = cVar;
        this.f162324x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f162323w, this.f162324x, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f162323w, this.f162324x, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayListE0;
        int i = this.u;
        c cVar = this.f162323w;
        i iVar = this.f162324x;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Map map = (Map) pair.f186385a;
                List list = (List) pair.f186386b;
                Iterable iterable = (List) map.get(d3a.a.REVOLUT);
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable iterable2 = (List) map.get(d3a.a.ACCOUNTS);
                if (iterable2 == null) {
                    iterable2 = f0.f322471a;
                }
                Iterable iterable3 = (List) map.get(d3a.a.CARDS);
                if (iterable3 == null) {
                    iterable3 = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    zm3.a aVar2 = ((y) obj3).f177526a;
                    Intrinsics.i(aVar2, "null cannot be cast to non-null type com.revolut.feature.contacts.models.RevolutContact.Remote");
                    if (i.a(iVar, list, ((zm3.j) aVar2).f)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : iterable2) {
                    if (i.a(iVar, list, ((v) obj4).f177523a.f132329a)) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : iterable3) {
                    if (i.a(iVar, list, ((w) obj5).f177524a.f81495a.f81490a)) {
                        arrayList3.add(obj5);
                    }
                }
                int i2 = e.f162322a[cVar.ordinal()];
                if (i2 == 1) {
                    arrayListE0 = d0.E0(arrayList3, d0.E0(arrayList2, arrayList));
                } else if (i2 == 2) {
                    arrayListE0 = arrayList;
                } else if (i2 == 3) {
                    arrayListE0 = arrayList2;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayListE0 = arrayList3;
                }
                return new b(arrayListE0, arrayList.size(), arrayList2.size(), arrayList3.size());
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list2 = (List) pair2.f186385a;
                List list3 = (List) pair2.f186386b;
                List list4 = list2;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : list4) {
                    jq9.k kVar = (jq9.k) obj6;
                    if ((kVar instanceof p) && (((p) kVar).f177514b instanceof zm3.j)) {
                        arrayList4.add(obj6);
                    }
                }
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(new y(((p) it8.next()).f177514b));
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj7 : arrayList5) {
                    zm3.a aVar4 = ((y) obj7).f177526a;
                    Intrinsics.i(aVar4, "null cannot be cast to non-null type com.revolut.feature.contacts.models.RevolutContact.Remote");
                    if (i.a(iVar, list3, ((zm3.j) aVar4).f)) {
                        arrayList6.add(obj7);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : list4) {
                    if (obj8 instanceof m) {
                        arrayList7.add(obj8);
                    }
                }
                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                Iterator it9 = arrayList7.iterator();
                while (it9.hasNext()) {
                    arrayList8.add(new v(((m) it9.next()).f177508b));
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj9 : arrayList8) {
                    if (i.a(iVar, list3, ((v) obj9).f177523a.f132329a)) {
                        arrayList9.add(obj9);
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                for (Object obj10 : list4) {
                    if (obj10 instanceof n) {
                        arrayList10.add(obj10);
                    }
                }
                ArrayList arrayList11 = new ArrayList(zhm.w.t(arrayList10, 10));
                Iterator it10 = arrayList10.iterator();
                while (it10.hasNext()) {
                    arrayList11.add(new w(((n) it10.next()).f177510b));
                }
                ArrayList arrayList12 = new ArrayList();
                for (Object obj11 : arrayList11) {
                    if (i.a(iVar, list3, ((w) obj11).f177524a.f81495a.f81490a)) {
                        arrayList12.add(obj11);
                    }
                }
                int i3 = g.f162325a[cVar.ordinal()];
                if (i3 == 1) {
                    return d0.E0(arrayList12, d0.E0(arrayList9, arrayList6));
                }
                if (i3 == 2) {
                    return arrayList6;
                }
                if (i3 == 3) {
                    return arrayList9;
                }
                if (i3 == 4) {
                    return arrayList12;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
