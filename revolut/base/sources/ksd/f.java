package ksd;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import do3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import khg.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yhm.r;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f189428w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f189428w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f189428w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f189428w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g gVar = this.f189428w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((RevPointsPocketInfo) it8.next()).e.f115083b);
                }
                return nim.a.v(rd0.e.b(gVar.a(arrayList, bVar)), new c9h.a(list, bVar, 2));
            default:
                r rVar = (r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xi0.b bVar2 = (xi0.b) rVar.f314201a;
                List list3 = (List) rVar.f314202b;
                n nVar = (n) rVar.f314203c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (opg.c.i(nVar.f116408a, ((Subaccount) obj3).getF88959a())) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(((Subaccount) it9.next()).getCurrency());
                }
                return nim.a.v(rd0.e.b(gVar.a(arrayList3, bVar2)), new s(arrayList2, gVar, bVar2));
        }
    }
}
