package kye;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190855a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj0.d f190856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f190857c;

    public /* synthetic */ v1(dj0.d dVar, List list) {
        this.f190856b = dVar;
        this.f190857c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean boolValueOf;
        Object next;
        switch (this.f190855a) {
            case 0:
                m mVar = (m) obj2;
                List list = this.f190857c;
                if (list != null) {
                    int size = list.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            aue.a aVar = (aue.a) list.get(i);
                            dj0.d dVar = this.f190856b;
                            if (!Intrinsics.f(dVar.f115083b, aVar.e.f115083b) || dVar.f115082a <= aVar.e.f115082a) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    boolValueOf = null;
                }
                return m.a(mVar, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, boolValueOf, null, null, null, null, -1, 61);
            default:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                xi0.b bVar = this.f190856b.f115083b;
                List list2 = this.f190857c;
                Intrinsics.h(list2);
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    List<BalanceWrapper> list3 = ((k1j.b) it8.next()).f180284c;
                    ArrayList arrayList2 = new ArrayList();
                    for (BalanceWrapper balanceWrapper : list3) {
                        xi0.b f99406c = balanceWrapper.getF99406c();
                        dj0.d f = null;
                        if (Intrinsics.f(f99406c, bVar)) {
                            Long l2 = balanceWrapper.f99405b;
                            if (l2 != null) {
                                f = new dj0.d(l2.longValue(), f99406c);
                            }
                        } else {
                            Iterator it9 = rates.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    next = it9.next();
                                    if (Intrinsics.f(((qta.c) next).f249046a, f99406c)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            qta.c cVar = (qta.c) next;
                            if (cVar != null) {
                                f = m1j.a.a(balanceWrapper, ofm.q.f0(cVar)).getF();
                            }
                        }
                        if (f != null) {
                            arrayList2.add(f);
                        }
                    }
                    zhm.a0.x(arrayList2, arrayList);
                }
                return zhm.d0.P0(arrayList, new vtf.c());
        }
    }

    public /* synthetic */ v1(List list, dj0.d dVar) {
        this.f190857c = list;
        this.f190856b = dVar;
    }
}
