package i9e;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f159664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f159665c;

    public /* synthetic */ b(Object obj2, ArrayList arrayList, xi0.b bVar, int i) {
        this.f159663a = i;
        this.f159664b = arrayList;
        this.f159665c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List<n9l.a> rates = (List) obj2;
        switch (this.f159663a) {
            case 0:
                Intrinsics.checkNotNullParameter(rates, "rates");
                List<n9l.a> list = rates;
                int iB = q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (n9l.a aVar : list) {
                    linkedHashMap.put(aVar.f213661a.f306286a, Double.valueOf(aVar.f213663c));
                }
                ArrayList arrayList = this.f159664b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    xi0.b bVar = this.f159665c;
                    if (!zHasNext) {
                        return new dj0.d((long) d0.R0(arrayList2), bVar).a();
                    }
                    String str = ((dj0.d) it8.next()).f115083b.f306286a;
                    Object obj3 = linkedHashMap.get(str);
                    arrayList2.add(Double.valueOf(r1.f115082a * (obj3 != null ? ((Number) obj3).doubleValue() : Intrinsics.f(str, bVar.f306286a) ? 1.0d : 0.0d)));
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(rates, "instrumentTickers");
                List list2 = rates;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(((InstrumentTicker) it9.next()).e.f115083b);
                }
                Set setI1 = d0.i1(d0.E0(this.f159664b, arrayList3));
                ArrayList arrayList4 = new ArrayList();
                Iterator it10 = setI1.iterator();
                while (true) {
                    boolean zHasNext2 = it10.hasNext();
                    xi0.b bVar2 = this.f159665c;
                    if (!zHasNext2) {
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                        Iterator it11 = arrayList4.iterator();
                        while (it11.hasNext()) {
                            v1.c.A(arrayList5, (xi0.b) it11.next(), bVar2);
                        }
                        return arrayList5;
                    }
                    Object next = it10.next();
                    if (!Intrinsics.f((xi0.b) next, bVar2)) {
                        arrayList4.add(next);
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(rates, "exchangeRates");
                ArrayList<dj0.d> arrayList6 = this.f159664b;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                for (dj0.d dVar : arrayList6) {
                    xi0.b bVar3 = dVar.f115083b;
                    xi0.b bVar4 = this.f159665c;
                    if (!Intrinsics.f(bVar3, bVar4)) {
                        for (n9l.a aVar2 : rates) {
                            if (Intrinsics.f(aVar2.f213661a, dVar.f115083b)) {
                                dVar = new dj0.d(pyd.c.I(dVar, new BigDecimal(String.valueOf(aVar2.f213663c)), bVar4), bVar4);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    arrayList7.add(dVar);
                }
                return arrayList7;
        }
    }

    public /* synthetic */ b(ArrayList arrayList, xi0.b bVar) {
        this.f159663a = 2;
        this.f159664b = arrayList;
        this.f159665c = bVar;
    }
}
