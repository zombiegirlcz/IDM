package k25;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.models.CreditCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import om4.y3;
import zh9.u0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f180331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w4l.k f180332x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(u uVar, w4l.k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180331w = uVar;
        this.f180332x = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f180331w, this.f180332x, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f180331w, this.f180332x, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowP;
        Flow flowV;
        int i = this.u;
        w4l.k kVar = this.f180332x;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (list.isEmpty()) {
                    return new go.g(new Data(r0.g(), null, false, 6, null), 2);
                }
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (String str : list2) {
                    b bVar = u.Companion;
                    arrayList.add(nim.a.v(n14.k.p(this.f180331w.f180354l.a(str, kVar), new k1g.n(10)), new jb8.a(str, 23)));
                }
                return nim.a.v(u0.k(arrayList), new k1g.n(19));
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list3 = (List) pair.f186385a;
                wi0.b bVar2 = (wi0.b) pair.f186386b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((CreditCard) obj3).u == yw4.l.SPEND_ONLY) {
                        arrayList2.add(obj3);
                    }
                }
                int size = arrayList2.size();
                int size2 = list3.size();
                u uVar = this.f180331w;
                if (size == size2) {
                    b bVar3 = u.Companion;
                    List list4 = list3;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        u uVar2 = uVar;
                        arrayList3.add(u.r(uVar2, (CreditCard) it8.next(), null, yw4.l.SPEND_ONLY, bVar2, f0.f322471a));
                        uVar = uVar2;
                    }
                    return zi0.c.i(arrayList3);
                }
                cxe.u uVarP = n14.k.p(xam.a.h(new g(uVar, kVar, null, 0), nim.a.v(((y3) uVar.f180349b).e(w4l.j.f294644c, true), new k1g.n(14))), new k1g.n(15));
                akg.n nVarO = uVar.o();
                List list5 = list3;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it9 = list5.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(((CreditCard) it9.next()).f69792a);
                }
                Flow flowT = uVar.t(arrayList4, kVar);
                ArrayList<String> arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it10 = list5.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(((CreditCard) it10.next()).f69792a);
                }
                if (arrayList5.isEmpty()) {
                    flowP = new go.g(new Data(r0.g(), null, false, 6, null), 2);
                } else {
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                    for (String str2 : arrayList5) {
                        arrayList6.add(nim.a.v(uVar.p(str2, kVar), new jb8.a(str2, 21)));
                    }
                    flowP = n14.k.p(nim.a.v(u0.k(arrayList6), new k1g.n(7)), new k1g.n(8));
                }
                ArrayList<String> arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it11 = list5.iterator();
                while (it11.hasNext()) {
                    arrayList7.add(((CreditCard) it11.next()).f69792a);
                }
                if (arrayList7.isEmpty()) {
                    flowV = new go.g(new Data(r0.g(), null, false, 6, null), 2);
                } else {
                    ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                    for (String str3 : arrayList7) {
                        arrayList8.add(nim.a.v(n14.k.p(uVar.f180361t.a(str3, wr7.a.CREDIT_CARD, kVar), new k1g.n(18)), new jb8.a(str3, 22)));
                    }
                    flowV = nim.a.v(u0.k(arrayList8), new k1g.n(5));
                }
                return nim.a.u(new im9.h((Continuation) null, list3, uVar, 10), u0.m(u0.i(uVarP, nVarO, flowT), u0.m(flowP, flowV)));
        }
    }
}
