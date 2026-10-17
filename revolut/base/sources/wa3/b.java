package wa3;

import h93.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ie.a f295797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f295798c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ b(ie.a aVar, boolean z, boolean z3, int i) {
        this.f295796a = i;
        this.f295797b = aVar;
        this.f295798c = z;
        this.d = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair;
        Iterator it8;
        List list;
        boolean z;
        switch (this.f295796a) {
            case 0:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                f0 card = (f0) hVar.f288433a;
                yt8.c cVar = (yt8.c) hVar.f288434b;
                List pendingOrders = (List) hVar.f288435c;
                boolean zBooleanValue = ((Boolean) hVar.d).booleanValue();
                xa3.b bVar = (xa3.b) this.f295797b.d;
                Intrinsics.h(card);
                yt8.i kyc2 = cVar.f316662a;
                Intrinsics.checkNotNullParameter(card, "card");
                Intrinsics.checkNotNullParameter(kyc2, "kyc");
                Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
                return zi0.c.P(xa3.b.b(bVar, card, kyc2, pendingOrders, this.d, this.f295798c, false, zBooleanValue, 16), false, null, 3);
            default:
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                List cards = (List) hVar2.f288433a;
                yt8.c cVar2 = (yt8.c) hVar2.f288434b;
                List pendingOrders2 = (List) hVar2.f288435c;
                boolean zBooleanValue2 = ((Boolean) hVar2.d).booleanValue();
                xa3.b bVar2 = (xa3.b) this.f295797b.d;
                yt8.i kyc3 = cVar2.f316662a;
                Intrinsics.checkNotNullParameter(cards, "cards");
                Intrinsics.checkNotNullParameter(kyc3, "kyc");
                Intrinsics.checkNotNullParameter(pendingOrders2, "pendingOrders");
                if (cards.isEmpty()) {
                    zhm.f0 f0Var = zhm.f0.f322471a;
                    return new ra3.b(f0Var, f0Var, f0Var, f0Var);
                }
                List<f0> list2 = cards;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((f0) obj3).f150112c) {
                        arrayList.add(obj3);
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                if (this.d) {
                    zhm.f0 f0Var2 = zhm.f0.f322471a;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        if (xa3.b.a((f0) obj4)) {
                            arrayList3.add(obj4);
                        }
                    }
                    pair = new Pair(f0Var2, arrayList3);
                } else {
                    pair = new Pair(arrayList, arrayList2);
                }
                List list3 = (List) pair.f186385a;
                List list4 = (List) pair.f186386b;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list3) {
                    if (((f0) obj5).d) {
                        arrayList4.add(obj5);
                    } else {
                        arrayList5.add(obj5);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj6 : list4) {
                    h93.g gVar = ((f0) obj6).k.f150132a;
                    if (gVar == h93.g.DELIVERED || gVar == h93.g.NONE) {
                        arrayList7.add(obj6);
                    } else {
                        arrayList6.add(obj6);
                    }
                }
                int i = 10;
                ArrayList arrayList8 = new ArrayList(w.t(arrayList6, 10));
                Iterator it9 = arrayList6.iterator();
                while (true) {
                    boolean zHasNext = it9.hasNext();
                    boolean z3 = this.f295798c;
                    if (!zHasNext) {
                        int i2 = i;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList4, i2));
                        Iterator it10 = arrayList4.iterator();
                        while (it10.hasNext()) {
                            arrayList9.add(xa3.b.b(bVar2, (f0) it10.next(), kyc3, pendingOrders2, z3, false, false, zBooleanValue2, 24));
                        }
                        ArrayList arrayList10 = new ArrayList(w.t(arrayList5, i2));
                        Iterator it11 = arrayList5.iterator();
                        while (it11.hasNext()) {
                            arrayList10.add(xa3.b.b(bVar2, (f0) it11.next(), kyc3, pendingOrders2, z3, false, false, zBooleanValue2, 24));
                        }
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList7, i2));
                        Iterator it12 = arrayList7.iterator();
                        while (it12.hasNext()) {
                            arrayList11.add(xa3.b.b(bVar2, (f0) it12.next(), kyc3, pendingOrders2, z3, false, false, zBooleanValue2, 24));
                        }
                        return new ra3.b(arrayList8, arrayList9, arrayList10, arrayList11);
                    }
                    f0 f0Var3 = (f0) it9.next();
                    h93.h hVar3 = f0Var3.k;
                    h93.f fVar = hVar3.f150137j;
                    LocalDate localDate = fVar != null ? fVar.f150109b : hVar3.i;
                    if (hVar3.f150132a == h93.g.DELIVERED || localDate == null || ((list2 instanceof Collection) && list2.isEmpty())) {
                        it8 = it9;
                        list = list2;
                        z = false;
                    } else {
                        for (f0 f0Var4 : list2) {
                            it8 = it9;
                            h93.h hVar4 = f0Var4.k;
                            list = list2;
                            h93.f fVar2 = hVar4.f150137j;
                            LocalDate localDate2 = fVar2 != null ? fVar2.f150109b : hVar4.i;
                            if (Intrinsics.f(f0Var3.f150110a, f0Var4.f150110a) || localDate2 == null || localDate2.getYear() != localDate.getYear() || localDate2.getDayOfYear() != localDate.getDayOfYear()) {
                                it9 = it8;
                                list2 = list;
                            } else {
                                z = true;
                            }
                        }
                        it8 = it9;
                        list = list2;
                        z = false;
                    }
                    arrayList8.add(xa3.b.b(bVar2, f0Var3, kyc3, pendingOrders2, z3, false, z, zBooleanValue2, 8));
                    i = 10;
                    it9 = it8;
                    list2 = list;
                }
                break;
        }
    }
}
