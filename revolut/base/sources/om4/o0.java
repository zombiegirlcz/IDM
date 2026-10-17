package om4;

import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import com.revolut.feature.credit.card.models.CreditCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226652a;

    public /* synthetic */ o0(int i) {
        this.f226652a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        il4.c cVar;
        Object obj3;
        Object next;
        Object actionRequired;
        yw4.a selected;
        cl4.k kVar;
        switch (this.f226652a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.FALSE;
            case 1:
                return ((Boolean) obj2).booleanValue() ? zhm.u.c(u0.c(fs3.b.SECURED_CREDIT_CARD)) : zhm.f0.f322471a;
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.FALSE;
            case 3:
                return ((Boolean) obj2).booleanValue() ? zhm.u.c(u0.c(fs3.b.CREDIT_BUILDER_CARD)) : zhm.f0.f322471a;
            case 4:
                ol4.a it10 = (ol4.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 5:
                vm4.b it11 = (vm4.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it11);
            case 6:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.h hVar = od0.i.Companion;
                vm4.b bVar = new vm4.b(zhm.f0.f322471a);
                hVar.getClass();
                return od0.h.a(bVar);
            case 7:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return zhm.f0.f322471a;
            case 8:
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 9:
                List content = (List) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                ArrayList arrayList = new ArrayList();
                Iterator it15 = content.iterator();
                while (it15.hasNext()) {
                    ql4.u uVar = (ql4.u) ((od0.i) it15.next()).f224257a;
                    if (uVar != null) {
                        arrayList.add(uVar);
                    }
                }
                return arrayList;
            case 10:
                Pair it16 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f186385a + "=" + it16.f186386b;
            case 11:
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 12:
                Throwable it18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 13:
                return pr4.f.f238932a;
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                il4.g gVar = (il4.g) pair.f186386b;
                il4.a aVar = gVar.f162081a;
                il4.d dVar = gVar.f162082b;
                if (aVar == null && dVar == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                long j2 = 0;
                if (dVar != null && (cVar = dVar.f162069a) != null && cVar.d.compareTo(cVar.e) >= 0) {
                    j2 = cVar.f.f115082a;
                }
                dj0.d.Companion.getClass();
                dj0.d dVarE = dj0.d.e;
                int i = 0;
                for (Object obj4 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarE = i == 0 ? io3.h.e((io3.d) obj4) : pyd.c.O(dVarE, io3.h.e((io3.d) obj4));
                    i = i2;
                }
                dj0.d dVarO = pyd.c.O(dVarE, dj0.d.c(io3.h.e((io3.d) zhm.d0.b0(list)), j2, null, 2));
                od0.i.Companion.getClass();
                return od0.h.a(dVarO);
            case 15:
                yw4.p it19 = (yw4.p) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.d;
            case 16:
                Throwable it20 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.FALSE;
            case 17:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new ux4.b(zhm.f0.f322471a);
            case 18:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new ux4.b(zhm.d0.E0(((ux4.b) pair2.f186386b).f283864a, ((ux4.b) pair2.f186385a).f283864a));
            case 19:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list2 = (List) pair3.f186386b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    io3.d dVar2 = (io3.d) obj5;
                    if (dVar2.e == io3.l.CREDIT && dVar2.f163149h == io3.i.INTERNAL) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 20:
                List cashbackPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(cashbackPockets, "cashbackPockets");
                List list3 = cashbackPockets;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it22 = list3.iterator();
                while (it22.hasNext()) {
                    arrayList3.add(((il4.h) it22.next()).f162083a);
                }
                return arrayList3;
            case 21:
                List it23 = (List) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : it23) {
                    if (((CreditCard) obj6).u == yw4.l.FULL_ACCESS) {
                        arrayList4.add(obj6);
                    }
                }
                return arrayList4;
            case 22:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                List list4 = (List) pair4.f186385a;
                Map map = (Map) pair4.f186386b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                Iterator it24 = linkedHashMap.entrySet().iterator();
                while (it24.hasNext()) {
                    yw4.h hVar2 = (yw4.h) ((Map.Entry) it24.next()).getKey();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj7 : list4) {
                        yw4.q qVar = ((yw4.p) obj7).e;
                        qVar.getClass();
                        if (qVar == yw4.q.ACTIVE || qVar == yw4.q.DEACTIVATING || qVar == yw4.q.LATE || qVar == yw4.q.TERMINATED) {
                            arrayList6.add(obj7);
                        }
                    }
                    boolean z = false;
                    if (!arrayList6.isEmpty()) {
                        Iterator it25 = arrayList6.iterator();
                        while (true) {
                            if (!it25.hasNext()) {
                            }
                            if (((yw4.p) it25.next()).i == hVar2) {
                                z = true;
                            }
                            break;
                        }
                    }
                    arrayList5.add(new yw4.i(z, hVar2));
                }
                return zhm.d0.i1(zhm.d0.O0(arrayList5));
            case 23:
                List it26 = (List) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return zhm.r0.t(it26);
            case 24:
                List list5 = (List) obj2;
                Intrinsics.checkNotNullParameter(list5, "list");
                od0.h hVar3 = od0.i.Companion;
                Iterator it27 = list5.iterator();
                while (true) {
                    obj3 = null;
                    if (it27.hasNext()) {
                        next = it27.next();
                        if (((bb5.c) next).f14164b == ft3.j1.CREDIT_CARD_LIMIT_INCREASE) {
                        }
                    } else {
                        next = null;
                    }
                }
                bb5.c cVar2 = (bb5.c) next;
                if (cVar2 != null) {
                    String str = cVar2.d;
                    int i3 = z2.f226767a[cVar2.f.ordinal()];
                    if (i3 == 1) {
                        actionRequired = new CreditLimitIncreaseStatus.ActionRequired(str);
                    } else if (i3 == 2) {
                        actionRequired = new CreditLimitIncreaseStatus.Waiting(str);
                    } else if (i3 == 3) {
                        actionRequired = new CreditLimitIncreaseStatus.InProgress(str);
                    } else if (i3 == 4) {
                        actionRequired = new CreditLimitIncreaseStatus.Offer(str);
                    } else if (i3 != 5) {
                        obj3 = CreditLimitIncreaseStatus.Unavailable.f68729a;
                    } else {
                        actionRequired = new CreditLimitIncreaseStatus.Terminated(str);
                    }
                    obj3 = actionRequired;
                }
                hVar3.getClass();
                return od0.h.a(obj3);
            case 25:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                String str2 = (String) pair5.f186385a;
                ll4.o oVar = (ll4.o) pair5.f186386b;
                yw4.a[] aVarArrValues = yw4.a.values();
                int length = aVarArrValues.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        selected = aVarArrValues[i5];
                        if (!kotlin.text.a0.z(selected.name(), str2, true)) {
                            i5++;
                        }
                    } else {
                        selected = null;
                    }
                }
                if (selected == null) {
                    selected = yw4.a.UNKNOWN;
                }
                if (selected == yw4.a.UNSELECTED) {
                    return oVar.f196525a;
                }
                List options = oVar.f196525a.f317316b;
                Intrinsics.checkNotNullParameter(selected, "selected");
                Intrinsics.checkNotNullParameter(options, "options");
                return new yw4.b(selected, options);
            case 26:
                Throwable it28 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                return new yw4.b(yw4.a.UNKNOWN, zhm.f0.f322471a);
            case 27:
                yoj.a aVar2 = (yoj.a) obj2;
                return wp5.y.s(aVar2, "it", aVar2);
            case 28:
                Pair pair6 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair6, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair6.f186385a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair6.f186386b).booleanValue();
                ft3.j1 j1Var = ft3.j1.CREDIT_CARD;
                if (!zBooleanValue) {
                    j1Var = null;
                }
                ft3.j1[] elements = {j1Var, zBooleanValue2 ? ft3.j1.FAMILY_CREDIT_CARD : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            default:
                od0.i productDetails = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                cl4.m mVar = (cl4.m) productDetails.f224257a;
                String str3 = (mVar == null || (kVar = mVar.f24955b) == null) ? null : kVar.f24951b.f24945b;
                return str3 != null ? new cl4.c(str3) : cl4.b.f24931a;
        }
    }

    public /* synthetic */ o0(u0 u0Var, int i) {
        this.f226652a = i;
    }
}
