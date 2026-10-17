package le3;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t5;
import zhm.d0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f194489b;

    public /* synthetic */ q(s sVar, int i) {
        this.f194488a = i;
        this.f194489b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        efm.r rVarJust;
        switch (this.f194488a) {
            case 0:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                if (groups.isEmpty()) {
                    efm.r rVarJust2 = efm.r.just(new Data(r0.g(), null, false, 6, null));
                    Intrinsics.h(rVarJust2);
                    return rVarJust2;
                }
                List list = groups;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((mr9.a) this.f194489b.f194494c).f(((PaymentGroup) it8.next()).f79285a, false));
                }
                return nim.a.w(mif.a.l(arrayList), new b(20));
            case 1:
                List groups2 = (List) obj2;
                Intrinsics.checkNotNullParameter(groups2, "groups");
                if (groups2.isEmpty()) {
                    efm.r rVarJust3 = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.h(rVarJust3);
                    return rVarJust3;
                }
                List list2 = groups2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((mr9.a) this.f194489b.f194494c).h(((PaymentGroup) it9.next()).f79285a, false));
                }
                return nim.a.w(mif.a.l(arrayList2), new b(21));
            default:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list3 = (List) rVar.f314201a;
                List list4 = (List) rVar.f314202b;
                Map map = (Map) rVar.f314203c;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it10 = list4.iterator();
                while (it10.hasNext()) {
                    for (v61.d dVar : ((v61.h) it10.next()).f286291g) {
                        String str = dVar.f;
                        if (str != null) {
                            linkedHashSet.add(str);
                        }
                        String str2 = dVar.e;
                        if (str2 != null) {
                            linkedHashSet2.add(str2);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it11 = list3.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        Iterator it12 = arrayList3.iterator();
                        while (true) {
                            if (it12.hasNext()) {
                                next = it12.next();
                                if (((a3) next).k.f115082a > 0) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        s sVar = this.f194489b;
                        if (next != null) {
                            rVarJust = nim.a.w((efm.r) sVar.f.getValue(), new jeg.i(6, arrayList3));
                        } else {
                            rVarJust = efm.r.just(zi0.c.P(arrayList3, false, null, 3));
                            Intrinsics.h(rVarJust);
                        }
                        return nim.a.w(rVarJust, new d3g.y(sVar, list4, map));
                    }
                    Object next2 = it11.next();
                    a3 a3Var = (a3) next2;
                    long j2 = a3Var.k.f115082a;
                    String str3 = a3Var.f272581b;
                    t5 t5Var = a3Var.X;
                    String str4 = t5Var != null ? t5Var.f273087a : null;
                    if (j2 <= 0 || (!linkedHashSet.contains(str3) && !d0.T(linkedHashSet2, str4))) {
                        arrayList3.add(next2);
                    }
                }
                break;
        }
    }
}
