package om4;

import android.content.Intent;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import onk.f;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class l3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226634a;

    public /* synthetic */ l3(int i) {
        this.f226634a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        mn2.a aVar;
        switch (this.f226634a) {
            case 0:
                yoj.a aVar2 = (yoj.a) obj2;
                return wp5.y.s(aVar2, "it", aVar2);
            case 1:
                it3.i it8 = (it3.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.b());
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 3:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                List list = facilities;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (((yw4.p) it9.next()).f317331l == yw4.l.FULL_ACCESS) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 5:
                List facilities2 = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities2, "facilities");
                List list2 = facilities2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList.add(((yw4.p) it10.next()).f317325a);
                }
                return arrayList;
            case 6:
                yw4.p facility = (yw4.p) obj2;
                Intrinsics.checkNotNullParameter(facility, "facility");
                int i = u3.f226715a[facility.f317331l.ordinal()];
                boolean z3 = true;
                if (i == 1) {
                    z3 = false;
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z3);
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 8:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                ArrayList arrayList2 = new ArrayList();
                Iterator it11 = groups.iterator();
                while (it11.hasNext()) {
                    zhm.a0.x(((k1j.b) it11.next()).f180284c, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (obj3 instanceof BalanceWrapper.PocketBalanceWrapper) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 9:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return Boolean.valueOf(!((List) rVar.f314201a).isEmpty() && ((Boolean) rVar.f314202b).booleanValue() && ((Boolean) rVar.f314203c).booleanValue());
            case 10:
                yw4.p it12 = (yw4.p) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f317326b;
            case 11:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new e4((b9e.c) pair.f186385a, (k71.q) pair.f186386b);
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 13:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                yw4.p pVar = (yw4.p) zhm.d0.d0(it13);
                return Boolean.valueOf((pVar != null ? pVar.f317331l : null) == yw4.l.SPEND_ONLY);
            case 14:
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : (List) obj2) {
                    fo3.c cVar = (fo3.c) ((Pair) obj4).f186385a;
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    if (cVar.f136802b == fo3.e.ACTIVE) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it14 = arrayList4.iterator();
                while (it14.hasNext()) {
                    arrayList5.add(((fo3.c) ((Pair) it14.next()).f186385a).f136801a);
                }
                return arrayList5;
            case 15:
                return Boolean.FALSE;
            case 16:
                hm8.b it15 = (hm8.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                int i2 = om8.a.f226772a[it15.f153538a.ordinal()];
                if (i2 == 1) {
                    return hm8.e.f153541a;
                }
                if (i2 == 2 || i2 == 3) {
                    return hm8.c.f153539a;
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                au8.a state = (au8.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(state == au8.a.PENDING);
            case 18:
                kpi.a result = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Intent intent = result.f188248c;
                if (intent != null) {
                    Serializable serializableExtra = intent.getSerializableExtra("EXTRAS_PURPOSE_OF_ACCOUNT");
                    obj = (List) (serializableExtra instanceof List ? serializableExtra : null);
                }
                return obj == null ? zhm.f0.f322471a : obj;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return yp0.b.g(klh.c.b(), omh.g.a(null), null, 0, 0, 126);
            case 20:
                List commodities = (List) obj2;
                Intrinsics.checkNotNullParameter(commodities, "commodities");
                List list3 = commodities;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it16 = list3.iterator();
                while (it16.hasNext()) {
                    arrayList6.add(new p5d.b(((jih.a) it16.next()).f174489a.f306286a, "commodity", null));
                }
                return new omh.c(arrayList6, commodities);
            case 21:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar2.f314201a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) rVar2.f314202b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) rVar2.f314203c).booleanValue();
                if (zBooleanValue) {
                    aVar = mn2.a.CASS;
                } else if (zBooleanValue2) {
                    aVar = mn2.a.OVERSTAP;
                } else {
                    if (!zBooleanValue3) {
                        return new kn2.a(0);
                    }
                    aVar = mn2.a.MOBILITY;
                }
                mn2.a aVar3 = aVar;
                return new kn2.a(aVar3, aVar3, aVar3, aVar3, aVar3, (aVar3 == mn2.a.CASS || aVar3 == mn2.a.OVERSTAP) ? aVar3 : null);
            case 22:
                List devices = (List) obj2;
                Intrinsics.checkNotNullParameter(devices, "devices");
                List list4 = devices;
                boolean z4 = false;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it17 = list4.iterator();
                    while (true) {
                        if (it17.hasNext()) {
                            if (((in8.a) it17.next()).f162681b == in8.b.ACTIVE) {
                                z4 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f.a.f226959a;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ojk.g0.c();
            case 25:
                oo2.i update = (oo2.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return oo2.i.a(update, new Data(null, null, true, 3, null), null, 55);
            case 26:
                oo2.i update2 = (oo2.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return oo2.i.a(update2, null, update2.f != null ? Boolean.valueOf(!r0.booleanValue()) : null, 31);
            case 27:
                Function0 defaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                return new oo2.n((List) defaultLoadingItems.invoke(), null, null);
            case 28:
                ood.a update3 = (ood.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ood.a.a(update3, null, null, null, !update3.d, false, null, 55);
            default:
                ood.a update4 = (ood.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ood.a.a(update4, null, null, null, false, !update4.e, null, 47);
        }
    }

    public /* synthetic */ l3(Object obj2, int i) {
        this.f226634a = i;
    }
}
