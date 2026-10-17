package rea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f253566b;

    public /* synthetic */ f(g gVar, int i) {
        this.f253565a = i;
        this.f253566b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        eda.d dVar;
        int i;
        eda.d dVar2;
        yoj.d dVar3;
        int i2;
        int i3;
        switch (this.f253565a) {
            case 0:
                vf0.h values = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(values, "values");
                e7l.f fVar = (e7l.f) values.f288433a;
                List list = (List) values.f288434b;
                List list2 = (List) values.f288435c;
                yoj.f fVar2 = (yoj.f) values.d;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashSet linkedHashSet = fVar.M;
                ArrayList arrayList = new ArrayList(w.t(linkedHashSet, 10));
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it8.next(), arrayList);
                }
                linkedHashMap.put(eda.c.FIAT, g.b(arrayList, list));
                eda.c cVar = eda.c.CRYPTO;
                yoj.a aVarI = hx7.l.i(fVar2, yoj.c.CRYPTO);
                int i5 = 0;
                if (aVarI == null || (dVar3 = aVarI.f315683b) == yoj.d.DISABLED || dVar3 == yoj.d.INACTIVE) {
                    dVar = eda.d.DISABLED;
                } else if (dVar3 == yoj.d.LOCKED || dVar3 == yoj.d.PENDING) {
                    dVar = eda.d.CAN_BE_ADDED;
                } else {
                    List list3 = list;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it9 = list3.iterator();
                        i2 = 0;
                        while (it9.hasNext()) {
                            if (r6.b.B(xi0.b.Companion, ((io3.d) it9.next()).f163147c) && (i2 = i2 + 1) < 0) {
                                v.r();
                                throw null;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        i3 = 0;
                    } else {
                        Iterator it10 = arrayList.iterator();
                        i3 = 0;
                        while (it10.hasNext()) {
                            if (cp5.d.z((xi0.b) it10.next()) && (i3 = i3 + 1) < 0) {
                                v.r();
                                throw null;
                            }
                        }
                    }
                    dVar = i2 < i3 ? eda.d.CAN_BE_ADDED : eda.d.ALL_ADDED;
                }
                linkedHashMap.put(cVar, dVar);
                linkedHashMap.put(eda.c.EXTERNAL, this.f253566b.e.a("ACCOUNT.linked_account") ? eda.d.CAN_BE_ADDED : eda.d.DISABLED);
                eda.c cVar2 = eda.c.COMMODITY;
                if (yoj.b.k(hx7.l.i(fVar2, yoj.c.COMMODITIES))) {
                    List<io3.d> list4 = list;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                        for (io3.d dVar4 : list4) {
                            xi0.a aVar = xi0.b.Companion;
                            String str = dVar4.f163147c;
                            aVar.getClass();
                            if (cp5.d.y(xi0.a.a(str)) && (i = i + 1) < 0) {
                                v.r();
                                throw null;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it11 = arrayList.iterator();
                        while (it11.hasNext()) {
                            if (cp5.d.y((xi0.b) it11.next()) && (i5 = i5 + 1) < 0) {
                                v.r();
                                throw null;
                            }
                        }
                    }
                    dVar2 = (i5 == 0 || i < i5) ? eda.d.CAN_BE_ADDED : eda.d.ALL_ADDED;
                } else {
                    dVar2 = eda.d.DISABLED;
                }
                linkedHashMap.put(cVar2, dVar2);
                linkedHashMap.put(eda.c.MERCHANT, g.b(arrayList, list2));
                return new eda.b(linkedHashMap);
            default:
                Pair values2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(values2, "values");
                List list5 = (List) values2.f186385a;
                List list6 = (List) values2.f186386b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                eda.c cVar3 = eda.c.FIAT;
                this.f253566b.getClass();
                linkedHashMap2.put(cVar3, g.b(list5, list6));
                eda.c cVar4 = eda.c.CRYPTO;
                eda.d dVar5 = eda.d.DISABLED;
                linkedHashMap2.put(cVar4, dVar5);
                linkedHashMap2.put(eda.c.EXTERNAL, dVar5);
                linkedHashMap2.put(eda.c.COMMODITY, dVar5);
                linkedHashMap2.put(eda.c.MERCHANT, dVar5);
                return new eda.b(linkedHashMap2);
        }
    }
}
