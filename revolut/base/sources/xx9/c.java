package xx9;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.ca;
import tof.i7;
import tof.u9;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f309412b;

    public /* synthetic */ c(m mVar, int i) {
        this.f309411a = i;
        this.f309412b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarE;
        efm.r rVarE2;
        int i;
        efm.r rVarG;
        efm.r rVarG2;
        efm.r rVarE3;
        int i2 = this.f309411a;
        m mVar = this.f309412b;
        switch (i2) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                h hVar = (h) rVar.f314202b;
                Map map = (Map) rVar.f314203c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list) {
                    nx9.a aVar = ((nx9.b) obj3).d;
                    Object arrayList = linkedHashMap.get(aVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(aVar, arrayList);
                    }
                    ((List) arrayList).add(obj3);
                }
                List list2 = (List) linkedHashMap.get(nx9.a.TRANSACTION);
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                List list3 = (List) linkedHashMap.get(nx9.a.PAYMENT_LINK);
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                List list4 = (List) linkedHashMap.get(nx9.a.MONEY_REQUEST);
                if (list4 == null) {
                    list4 = f0.f322471a;
                }
                List list5 = (List) linkedHashMap.get(nx9.a.MESSAGE);
                if (list5 == null) {
                    list5 = f0.f322471a;
                }
                List list6 = (List) linkedHashMap.get(nx9.a.GROUP_BILL);
                if (list6 == null) {
                    list6 = f0.f322471a;
                }
                List list7 = (List) linkedHashMap.get(nx9.a.GROUP_SETTLEMENT);
                if (list7 == null) {
                    list7 = f0.f322471a;
                }
                int i3 = 2;
                if (list4.isEmpty()) {
                    rVarE = efm.r.just(f0.f322471a);
                    Intrinsics.checkNotNullExpressionValue(rVarE, "just(...)");
                } else {
                    rVarE = ue0.e.E(m70.a.g(((u6k.h) mVar.d).d(false), new e(i3), null, 2), f0.f322471a);
                }
                int i5 = 5;
                if (list3.isEmpty()) {
                    rVarE2 = efm.r.just(f0.f322471a);
                    Intrinsics.checkNotNullExpressionValue(rVarE2, "just(...)");
                } else {
                    rVarE2 = ue0.e.E(m70.a.g(((k61.i) mVar.f).g(false), new e(i5), null, 2), f0.f322471a);
                }
                if (list2.isEmpty()) {
                    rVarG = efm.r.just(f0.f322471a);
                    Intrinsics.checkNotNullExpressionValue(rVarG, "just(...)");
                    i = 1;
                } else {
                    List list8 = list2;
                    i = 1;
                    ArrayList arrayList2 = new ArrayList(w.t(list8, 10));
                    Iterator it8 = list8.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((nx9.b) it8.next()).f220485c);
                    }
                    ca caVar = new ca(d0.i1(arrayList2));
                    com.revolut.domain.interactors.transactions.a aVar2 = mVar.e;
                    i7.c cVar = i7.Companion;
                    i7[] i7VarArr = {caVar, new u9(false)};
                    cVar.getClass();
                    rVarG = m70.a.g(com.revolut.domain.interactors.transactions.a.d(aVar2, i7.c.a(i7VarArr), null, null, null, null, 30), new e(10), null, 2);
                }
                if (list5.isEmpty()) {
                    rVarG2 = efm.r.just(f0.f322471a);
                    Intrinsics.checkNotNullExpressionValue(rVarG2, "just(...)");
                } else {
                    px9.c cVar2 = mVar.f309433c;
                    int i6 = i;
                    sfm.b bVar = new sfm.b(new rfm.m(new rfm.j(cVar2.f240586b.f(false), new pva.c(11, new px0.a(7)), 0), new pva.c(12, new px0.a(8)), i6), new pva.c(13, new pth.l(cVar2, 13)), i6);
                    Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                    rVarG2 = m70.a.g(bVar, new e(3), null, 2);
                }
                if (list6.isEmpty() && list7.isEmpty()) {
                    mq9.e.Companion.getClass();
                    rVarE3 = efm.r.just(mq9.e.e);
                    Intrinsics.checkNotNullExpressionValue(rVarE3, "just(...)");
                } else {
                    lr9.j jVar = (lr9.j) mVar.f309432b.f124861b;
                    mq9.a observeMode = mq9.a.LOCAL;
                    Intrinsics.checkNotNullParameter(observeMode, "observeMode");
                    efm.r rVarDistinctUntilChanged = te0.w.l(jVar.c(0L), jVar.b(observeMode)).map(new lr9.b(10, new loc.a(12))).distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                    efm.d0 d0VarFirstOrError = jVar.c(0L).firstOrError();
                    lr9.b bVar2 = new lr9.b(7, new lk4.g(observeMode, 20));
                    d0VarFirstOrError.getClass();
                    efm.r rVarX = new ufm.i(d0VarFirstOrError, bVar2, 1).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    efm.r rVarDistinctUntilChanged2 = rVarDistinctUntilChanged.startWith((efm.w) rVarX).distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                    efm.r rVarOnErrorReturn = ue0.e.H(rVarDistinctUntilChanged2, h0.f322473a, new loc.a(17)).onErrorReturn(new pva.c(7, new px0.a(3)));
                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
                    efm.r rVarG3 = m70.a.g(rVarOnErrorReturn, new e(4), null, 2);
                    mq9.e.Companion.getClass();
                    rVarE3 = ue0.e.E(rVarG3, mq9.e.e);
                }
                efm.r map2 = te0.w.o(rVarE, rVarE2, rVarG, rVarG2, rVarE3).map(new d(1, new xub.e(26)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return map2.map(new d(4, new xwd.o(list, mVar, hVar, map))).map(new d(5, new xub.e(mVar, 28))).map(new d(6, new xub.e(29)));
            case 1:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                return enabled.booleanValue() ? aa6.c.a(mVar.f309438m, false) : te0.w.h(new Data(f0.f322471a, null, false, 6, null));
            case 2:
                Boolean enabled2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled2, "enabled");
                return enabled2.booleanValue() ? mVar.k.e(false, ho5.a.NONE, false) : te0.w.h(new Data(f0.f322471a, null, false, 6, null));
            default:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                List<Object> list9 = (List) rVar2.f314201a;
                List list10 = (List) rVar2.f314202b;
                Set set = (Set) rVar2.f314203c;
                ArrayList arrayList3 = new ArrayList();
                for (Object objA : list9) {
                    if (objA instanceof zm3.l) {
                        objA = mVar.a((zm3.l) objA, set);
                    }
                    if (objA != null) {
                        arrayList3.add(objA);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it9 = list10.iterator();
                while (it9.hasNext()) {
                    zm3.l lVarA = mVar.a((zm3.l) it9.next(), set);
                    if (lVarA != null) {
                        arrayList4.add(lVarA);
                    }
                }
                return new i(arrayList3, arrayList4);
        }
    }
}
