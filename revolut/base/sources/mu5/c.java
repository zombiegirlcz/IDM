package mu5;

import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f208967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f208968c;
    public final /* synthetic */ xi0.b d;

    public /* synthetic */ c(f fVar, List list, xi0.b bVar, int i) {
        this.f208966a = i;
        this.f208967b = fVar;
        this.f208968c = list;
        this.d = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f208966a) {
            case 0:
                f fVar = this.f208967b;
                usc.a aVar = fVar.e;
                List pocketBalances = (List) obj2;
                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                List<io3.g> list = pocketBalances;
                for (io3.g gVar : list) {
                    dj0.d balance = gVar.e;
                    if (balance != null || (balance = gVar.f163164b) != null) {
                        String pocketId = gVar.f163163a.f163145a;
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        ((ne0.d) aVar.f282889b).f(pocketId, balance);
                    }
                }
                List list2 = this.f208968c;
                ArrayList<io3.d> arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (f.f208972g.contains(((io3.d) obj3).f)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (io3.d dVar : arrayList) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(dVar.f163145a, ((io3.g) next).f163163a.f163145a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    io3.g gVar2 = (io3.g) next;
                    if (gVar2 != null) {
                        arrayList2.add(gVar2);
                    }
                }
                Iterator it9 = arrayList2.iterator();
                long j2 = 0;
                while (it9.hasNext()) {
                    String pocketId2 = ((io3.g) it9.next()).f163163a.f163145a;
                    Intrinsics.checkNotNullParameter(pocketId2, "pocketId");
                    dj0.d dVar2 = (dj0.d) ((ne0.d) aVar.f282889b).get(pocketId2);
                    j2 += dVar2 != null ? dVar2.f115082a : 0L;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList2) {
                    xi0.b bVar = z92.f.j(((io3.g) obj4).f163163a).f115083b;
                    Object arrayList3 = linkedHashMap.get(bVar);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(bVar, arrayList3);
                    }
                    ((List) arrayList3).add(obj4);
                }
                lim.q qVarQ = d0.Q(linkedHashMap.values());
                xi0.b bVar2 = this.d;
                return new PocketBalancesWithSum(y.J(y.x(qVarQ, new mt9.c(fVar, bVar2, 4))), new dj0.d(j2, bVar2));
            default:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                f fVar2 = this.f208967b;
                wsg.n nVar = fVar2.d;
                List list3 = this.f208968c;
                xi0.b bVar3 = this.d;
                efm.d0 d0VarB = nVar.B(list3, bVar3, rates, true);
                msb.e eVar = new msb.e(7, new c(fVar2, list3, bVar3, 0));
                d0VarB.getClass();
                efm.r rVarX = new ufm.i(d0VarB, eVar, 1).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rVarX;
        }
    }
}
