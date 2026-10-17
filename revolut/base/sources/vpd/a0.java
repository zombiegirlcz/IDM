package vpd;

import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.a1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a f291150b;

    public /* synthetic */ a0(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar, int i) {
        this.f291149a = i;
        this.f291150b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        switch (this.f291149a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar = this.f291150b;
                return nim.a.v(aVar.f87733q.b(list, zhm.f0.f322471a, aVar.o.f87719b), new uyh.w(aVar, 21, list, list2));
            default:
                g0i.a outputData = (g0i.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar2 = this.f291150b;
                cli.y yVar = aVar2.v;
                c cVar = (c) ((d) ((j2) yVar.f22677a).getValue()).f291156a.getContent();
                if (cVar != null) {
                    l lVar = ((d) ((j2) yVar.f22677a).getValue()).f291157b;
                    j jVar = lVar instanceof j ? (j) lVar : null;
                    if (jVar != null) {
                        ArrayList arrayList = cVar.f291153b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (obj4 instanceof IncomeSorterDestinationInfo.Crypto.CryptoPocket) {
                                arrayList2.add(obj4);
                            }
                        }
                        List<xi0.b> list3 = outputData.f139494a;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        for (xi0.b bVar : list3) {
                            int size = arrayList2.size();
                            int i = 0;
                            while (true) {
                                if (i < size) {
                                    obj3 = arrayList2.get(i);
                                    if (!Intrinsics.f(((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj3).f87459a, bVar)) {
                                        i++;
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            IncomeSorterDestinationInfo.Crypto.CryptoPocket cryptoPocket = (IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj3;
                            if (cryptoPocket == null) {
                                cryptoPocket = new IncomeSorterDestinationInfo.Crypto.CryptoPocket(new dj0.d(0L, bVar), null, bVar, zld.a.ACTIVE);
                            }
                            arrayList3.add(cryptoPocket);
                        }
                        Set set = jVar.f291169a;
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : set) {
                            if (((IncomeSorterDestinationInfo) obj5) instanceof IncomeSorterDestinationInfo.Crypto.CryptoPocket) {
                                arrayList4.add(obj5);
                            } else {
                                arrayList5.add(obj5);
                            }
                        }
                        aVar2.H2(yVar, new uyh.w(cVar, arrayList3, jVar, a1.l(zhm.d0.i1(arrayList5), arrayList3)));
                    }
                }
                return Unit.f186387a;
        }
    }
}
