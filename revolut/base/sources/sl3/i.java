package sl3;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreen;
import d9.t0;
import io.reactivex.exceptions.CompositeException;
import ip0.cs;
import ip0.nb0;
import ip0.p10;
import ip0.pb0;
import ip0.t10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import snf.g0;
import snf.y;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264112a;

    public /* synthetic */ i(int i) {
        this.f264112a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVar;
        CompositeException compositeException = null;
        int i = 0;
        switch (this.f264112a) {
            case 0:
                ml3.i it8 = (ml3.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return pu7.a.G(it8);
            case 1:
                ql3.d dto = (ql3.d) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return hx7.l.D(dto);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                Map map = (Map) pair.f186386b;
                List<ml3.o> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (ml3.o oVar : list2) {
                    arrayList.add(pyd.c.e0(oVar, (ml3.p) map.get(oVar.f206609a)));
                }
                return zi0.c.P(arrayList, false, null, 3);
            case 3:
                List extras = (List) obj2;
                Intrinsics.checkNotNullParameter(extras, "extras");
                List list3 = extras;
                int iB = q0.b(w.t(list3, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj3 : list3) {
                    linkedHashMap.put(((ml3.p) obj3).c(), obj3);
                }
                return linkedHashMap;
            case 4:
                List extras2 = (List) obj2;
                Intrinsics.checkNotNullParameter(extras2, "extras");
                List list4 = extras2;
                int iB2 = q0.b(w.t(list4, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj4 : list4) {
                    linkedHashMap2.put(((ml3.p) obj4).c(), obj4);
                }
                return linkedHashMap2;
            case 5:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list5 = (List) pair2.f186385a;
                Map map2 = (Map) pair2.f186386b;
                Intrinsics.h(list5);
                List<ml3.o> list6 = list5;
                ArrayList arrayList2 = new ArrayList(w.t(list6, 10));
                for (ml3.o oVar2 : list6) {
                    arrayList2.add(pyd.c.e0(oVar2, (ml3.p) map2.get(oVar2.c())));
                }
                return arrayList2;
            case 6:
                List entityList = (List) obj2;
                Intrinsics.checkNotNullParameter(entityList, "entityList");
                List list7 = entityList;
                ArrayList arrayList3 = new ArrayList(w.t(list7, 10));
                Iterator it9 = list7.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(qk.d.D((ml3.u) it9.next()));
                }
                return arrayList3;
            case 7:
                List entityList2 = (List) obj2;
                Intrinsics.checkNotNullParameter(entityList2, "entityList");
                List list8 = entityList2;
                ArrayList arrayList4 = new ArrayList(w.t(list8, 10));
                Iterator it10 = list8.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(qk.d.D((ml3.u) it10.next()));
                }
                return zi0.c.P(arrayList4, false, null, 3);
            case 8:
                yvh.b autoInvest = (yvh.b) obj2;
                Intrinsics.checkNotNullParameter(autoInvest, "autoInvest");
                return Boolean.valueOf(autoInvest.f317177b && autoInvest.e != yvh.h.CURRENT_POCKET);
            case 9:
                List productData = (List) obj2;
                Intrinsics.checkNotNullParameter(productData, "productData");
                List<SavingsProductData> list9 = productData;
                if ((list9 instanceof Collection) && list9.isEmpty()) {
                    i = 1;
                } else {
                    for (SavingsProductData savingsProductData : list9) {
                        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
                        if (!ocd.a.c(savingsProductData)) {
                        }
                    }
                    i = 1;
                }
                return Boolean.valueOf(i ^ 1);
            case 10:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.FALSE;
            case 11:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return t0.w((m2k.e) d0.b0(it11));
            case 12:
                ty0.a it12 = (ty0.a) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj5 = it12.d;
                if (obj5 instanceof EsimDescriptorValue) {
                    return (EsimDescriptorValue) obj5;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 14:
                smd.j update = (smd.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                smd.h hVar = (smd.h) update.f264423a.getContent();
                if (hVar == null) {
                    return update;
                }
                List list10 = hVar.f264418b;
                int iB3 = q0.b(w.t(list10, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3 >= 16 ? iB3 : 16);
                for (Object obj6 : list10) {
                    linkedHashMap3.put(((smd.g) obj6).f264414a.getId(), obj6);
                }
                List<smd.g> list11 = hVar.f264419c;
                ArrayList<smd.g> arrayList5 = new ArrayList(w.t(list11, 10));
                for (smd.g gVarA : list11) {
                    dj0.d dVar2 = gVarA.d;
                    if (dVar2 != null) {
                        gVarA = smd.g.a(gVarA, new dj0.d(0L, dVar2.f115083b));
                    }
                    arrayList5.add(gVarA);
                }
                Map mapI2 = update.f264424b;
                for (smd.g gVar : arrayList5) {
                    smd.g gVar2 = (smd.g) linkedHashMap3.get(gVar.f264414a.getId());
                    if (gVar2 != null && (dVar = gVar.d) != null) {
                        mapI2 = smd.u.I2(gVar2, new smd.a(dVar), mapI2);
                    }
                }
                return smd.j.c(update, Data.copy$default(update.f264423a, smd.h.a(hVar, null, arrayList5, 11), null, false, 6, null), mapI2, 4);
            case 15:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                while (i < 3) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("CATEGORY_BUDGETS_LOADING_ROW:", i), false, 0, false, 30));
                    i++;
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return new smd.l(arrayListP, smd.d.f264410a, f0.f322471a);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return snc.g.f264506a;
            case 17:
                snd.b it13 = (snd.b) obj2;
                KProperty[] kPropertyArr2 = AnalyticsDashboardController.f87528r0;
                Intrinsics.checkNotNullParameter(it13, "it");
                snd.a aVar = (snd.a) it13.f264521a.getContent();
                if (aVar != null) {
                    return aVar.f264515a;
                }
                return null;
            case 18:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list12 = (List) pair3.f186385a;
                Map map3 = (Map) pair3.f186386b;
                List list13 = list12;
                ArrayList arrayList6 = new ArrayList();
                Iterator it14 = list13.iterator();
                while (it14.hasNext()) {
                    fo3.c cVar = (fo3.c) ((Pair) it14.next()).f186385a;
                    String str = cVar.f136801a;
                    if (!map3.containsKey(cVar.f136805h)) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList6.add(str);
                    }
                }
                Set setI1 = d0.i1(arrayList6);
                ArrayList arrayList7 = new ArrayList();
                Iterator it15 = list13.iterator();
                while (it15.hasNext()) {
                    a0.x((List) ((Pair) it15.next()).f186386b, arrayList7);
                }
                int iB4 = q0.b(w.t(arrayList7, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB4 >= 16 ? iB4 : 16);
                for (Object obj7 : arrayList7) {
                    linkedHashMap4.put(((io3.d) obj7).f163145a, obj7);
                }
                return new g0(setI1, map3, linkedHashMap4);
            case 19:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return q0.c(new Pair(user.f116408a, new snf.a0(do3.q.y(user), true)));
            case 20:
                List identities = (List) obj2;
                Intrinsics.checkNotNullParameter(identities, "identities");
                List<zlg.c> list14 = identities;
                int iB5 = q0.b(w.t(list14, 10));
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iB5 >= 16 ? iB5 : 16);
                for (zlg.c cVar2 : list14) {
                    do3.e eVar = cVar2.f323250a;
                    Address address = eVar.e;
                    if (address == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Intrinsics.checkNotNullParameter(address, "<this>");
                    linkedHashMap5.put(eVar.f116395a, new snf.a0(nz8.d.g(address), cVar2.f323252c));
                }
                return linkedHashMap5;
            case 21:
                Set delistedPockets = (Set) obj2;
                Intrinsics.checkNotNullParameter(delistedPockets, "delistedPockets");
                return delistedPockets;
            case 22:
                Throwable it16 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Data(null, it16, false, 5, null);
            case 23:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                Data data = (Data) pair4.f186385a;
                Data data2 = (Data) pair4.f186386b;
                y yVar = new y((snf.b) data.getContent(), (snf.b) data2.getContent());
                if (!data.getLoading() && !data2.getLoading()) {
                    z = false;
                }
                Throwable[] elements = {data.getError(), data2.getError()};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                if (((ArrayList) listL).isEmpty()) {
                    listL = null;
                }
                if (listL != null) {
                    Throwable[] thArr = (Throwable[]) listL.toArray(new Throwable[0]);
                    compositeException = new CompositeException((Throwable[]) Arrays.copyOf(thArr, thArr.length));
                }
                return new Data(yVar, compositeException, z);
            case 24:
                return snk.f.a((snk.f) obj2, null, false, 3);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                t10 t10Var = new t10("PLAIN_TEXT_LOADING_LIST_ID", p10.f165755a);
                cs csVar = new cs("LARGE_ACTION_BTN_LOADING_LIST_ID");
                yp0.b.r(csVar, 0, 0, 0, 0, 15);
                return new sob.f(v.k(t10Var, csVar));
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 27:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 28:
                sog.a it17 = (sog.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f264824a.f297794a;
            default:
                return Boolean.valueOf(((Integer) obj2).intValue() >= 0);
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f264112a = i;
    }
}
