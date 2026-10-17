package vpk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f291257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f291258c;

    public /* synthetic */ q(v vVar, Set set, int i) {
        this.f291256a = i;
        this.f291257b = vVar;
        this.f291258c = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List rates = (List) obj2;
        switch (this.f291256a) {
            case 0:
                Intrinsics.checkNotNullParameter(rates, "rates");
                this.f291257b.getClass();
                List list = rates;
                int iB = q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list) {
                    linkedHashMap.put(((qta.c) obj3).f249050h, obj3);
                }
                Set set = this.f291258c;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    qta.c cVar = (qta.c) linkedHashMap.get((Pair) it8.next());
                    if (cVar == null || Intrinsics.f(cVar.a(), w.a())) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
                return arrayList;
            case 1:
                Intrinsics.checkNotNullParameter(rates, "ratesDto");
                List list2 = rates;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(v13.d.K((rpk.a) it9.next()));
                }
                this.f291257b.getClass();
                int size = arrayList2.size();
                Set set2 = this.f291258c;
                if (size != set2.size()) {
                    int iB2 = q0.b(zhm.w.t(arrayList2, 10));
                    if (iB2 < 16) {
                        iB2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                    for (Object obj4 : arrayList2) {
                        qta.a aVar = (qta.a) obj4;
                        linkedHashMap2.put(new Pair(aVar.f249039a, aVar.f249040b), obj4);
                    }
                    Set<Pair> set3 = set2;
                    arrayList2 = new ArrayList(zhm.w.t(set3, 10));
                    for (Pair pair : set3) {
                        qta.a aVar2 = (qta.a) linkedHashMap2.get(pair);
                        if (aVar2 == null) {
                            aVar2 = new qta.a((xi0.b) pair.f186385a, (xi0.b) pair.f186386b, w.a(), w.a(), w.a(), null);
                        }
                        arrayList2.add(aVar2);
                    }
                }
                return arrayList2;
            default:
                Intrinsics.checkNotNullParameter(rates, "rates");
                this.f291257b.getClass();
                List list3 = rates;
                int iB3 = q0.b(zhm.w.t(list3, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3);
                for (Object obj5 : list3) {
                    linkedHashMap3.put(((qta.a) obj5).f249042g, obj5);
                }
                Set set4 = this.f291258c;
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = set4.iterator();
                while (it10.hasNext()) {
                    qta.a aVar3 = (qta.a) linkedHashMap3.get((Pair) it10.next());
                    if (aVar3 == null || Intrinsics.f(aVar3.a(), w.a()) || Intrinsics.f(aVar3.b(), w.a()) || Intrinsics.f(aVar3.c(), w.a())) {
                        aVar3 = null;
                    }
                    if (aVar3 != null) {
                        arrayList3.add(aVar3);
                    }
                }
                return arrayList3;
        }
    }
}
