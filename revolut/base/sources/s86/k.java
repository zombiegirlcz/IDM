package s86;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f260911b;

    public /* synthetic */ k(Data data, int i) {
        this.f260910a = i;
        this.f260911b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        List list;
        dj0.d dVar;
        Object next;
        switch (this.f260910a) {
            case 0:
                Data device = this.f260911b;
                Intrinsics.h(device);
                ((f) obj2).getClass();
                Intrinsics.checkNotNullParameter(device, "device");
                return new f(device);
            case 1:
                ((s8f.d) obj2).getClass();
                Data topHoldingsAssets = this.f260911b;
                Intrinsics.checkNotNullParameter(topHoldingsAssets, "topHoldingsAssets");
                return new s8f.d(topHoldingsAssets);
            case 2:
                ((s9b.g) obj2).getClass();
                Data data2 = this.f260911b;
                Intrinsics.checkNotNullParameter(data2, "data");
                return new s9b.g(data2);
            case 3:
                Data data3 = this.f260911b;
                Intrinsics.h(data3);
                return sd3.f.a((sd3.f) obj2, data3, null, 6);
            case 4:
                Data data4 = this.f260911b;
                Intrinsics.h(data4);
                return sdg.g.a((sdg.g) obj2, data4, null, null, null, 14);
            case 5:
                Data data5 = this.f260911b;
                Intrinsics.h(data5);
                return sdg.g.a((sdg.g) obj2, null, data5, null, null, 13);
            case 6:
                Data data6 = this.f260911b;
                sec.b bVar = (sec.b) obj2;
                try {
                    Object content = data6.getContent();
                    data = new Data(content != null ? ((DeliveryMethods) content).f84735b : null, data6.getError(), data6.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data6.getLoading());
                }
                return sec.b.a(bVar, data, null, 6);
            case 7:
                ((sek.i) obj2).getClass();
                Data podNominees = this.f260911b;
                Intrinsics.checkNotNullParameter(podNominees, "podNominees");
                return new sek.i(podNominees);
            case 8:
                Data planSubscription = this.f260911b;
                Intrinsics.h(planSubscription);
                ((sjk.b) obj2).getClass();
                Intrinsics.checkNotNullParameter(planSubscription, "planSubscription");
                return new sjk.b(planSubscription);
            case 9:
                Data currency = this.f260911b;
                Intrinsics.h(currency);
                ((sk4.a) obj2).getClass();
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new sk4.a(currency);
            case 10:
                ((sl2.i) obj2).getClass();
                Data restrictions = this.f260911b;
                Intrinsics.checkNotNullParameter(restrictions, "restrictions");
                return new sl2.i(restrictions);
            case 11:
                return sm6.j.a((sm6.j) obj2, this.f260911b, null, 2);
            case 12:
                smd.j jVar = (smd.j) obj2;
                Data data7 = this.f260911b;
                smd.h hVar = (smd.h) data7.getContent();
                if (hVar == null) {
                    return smd.j.c(jVar, Data.copy$default(data7, jVar.f264423a.getContent(), null, false, 6, null), null, 6);
                }
                List list2 = hVar.f264418b;
                Map map = jVar.f264425c;
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    String str = (String) entry.getKey();
                    smd.g gVar = (smd.g) entry.getValue();
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((smd.g) next).f264414a.getId(), str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    smd.g gVar2 = (smd.g) next;
                    if (gVar2 != null) {
                        gVar = gVar2;
                    }
                    linkedHashMap.put(key, gVar);
                }
                Collection collectionValues = linkedHashMap.values();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    linkedHashSet.add(((smd.g) it9.next()).f264414a.getId());
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (!linkedHashSet.contains(((smd.g) obj3).f264414a.getId())) {
                        arrayList.add(obj3);
                    }
                }
                smd.h hVarA = smd.h.a(hVar, d0.E0(arrayList, list2), null, 13);
                List list3 = hVarA.f264419c;
                List<smd.g> list4 = hVarA.f264418b;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it10 = list4.iterator();
                while (it10.hasNext()) {
                    linkedHashSet2.add(((smd.g) it10.next()).f264414a.getId());
                }
                Map map2 = jVar.f264424b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (linkedHashSet2.contains((String) entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                smd.h hVar2 = (smd.h) jVar.f264423a.getContent();
                List<smd.g> list5 = list3;
                int iB = q0.b(w.t(list5, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
                for (smd.g gVar3 : list5) {
                    linkedHashMap3.put(gVar3.f264414a.getId(), gVar3.d);
                }
                ArrayList arrayList2 = new ArrayList();
                for (smd.g gVar4 : list4) {
                    smd.c cVar = (smd.c) linkedHashMap2.get(gVar4.f264414a.getId());
                    if (cVar instanceof smd.a) {
                        dVar = ((smd.a) cVar).f264408a;
                    } else if (cVar instanceof smd.b) {
                        dVar = null;
                    } else {
                        if (cVar != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = (dj0.d) linkedHashMap3.get(gVar4.f264414a.getId());
                    }
                    smd.g gVarA = dVar != null ? smd.g.a(gVar4, dVar) : null;
                    if (gVarA != null) {
                        arrayList2.add(gVarA);
                    }
                }
                int iB2 = q0.b(w.t(arrayList2, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj4 : arrayList2) {
                    linkedHashMap4.put(((smd.g) obj4).f264414a.getId(), obj4);
                }
                aim.e eVarB = u.b();
                if (hVar2 != null && (list = hVar2.f264419c) != null) {
                    Iterator it11 = list.iterator();
                    while (it11.hasNext()) {
                        eVarB.add(((smd.g) it11.next()).f264414a.getId());
                    }
                }
                Iterator it12 = list5.iterator();
                while (it12.hasNext()) {
                    eVarB.add(((smd.g) it12.next()).f264414a.getId());
                }
                Iterator it13 = list4.iterator();
                while (it13.hasNext()) {
                    eVarB.add(((smd.g) it13.next()).f264414a.getId());
                }
                List listU = d0.U(u.a(eVarB));
                ArrayList arrayList3 = new ArrayList();
                Iterator it14 = listU.iterator();
                while (it14.hasNext()) {
                    smd.g gVar5 = (smd.g) linkedHashMap4.get((String) it14.next());
                    if (gVar5 != null) {
                        arrayList3.add(gVar5);
                    }
                }
                return smd.j.a(Data.copy$default(data7, smd.h.a(hVarA, null, arrayList3, 11), null, false, 6, null), linkedHashMap2, linkedHashMap);
            case 13:
                snc.e eVar = (snc.e) obj2;
                Data data8 = eVar.f264504b;
                eVar.getClass();
                return new snc.e(this.f260911b, data8);
            case 14:
                snc.e eVar2 = (snc.e) obj2;
                Data data9 = eVar2.f264503a;
                eVar2.getClass();
                return new snc.e(data9, this.f260911b);
            case 15:
                return snd.b.a((snd.b) obj2, this.f260911b, null, 2);
            case 16:
                ((sob.d) obj2).getClass();
                Data statistics = this.f260911b;
                Intrinsics.checkNotNullParameter(statistics, "statistics");
                return new sob.d(statistics);
            case 17:
                return sqd.a.a((sqd.a) obj2, this.f260911b, false, null, 6);
            case 18:
                ((ss4.l) obj2).getClass();
                Data content2 = this.f260911b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new ss4.l(content2);
            case 19:
                ((su4.i) obj2).getClass();
                Data content3 = this.f260911b;
                Intrinsics.checkNotNullParameter(content3, "content");
                return new su4.i(content3);
            case 20:
                return sui.h.a((sui.h) obj2, this.f260911b, null, null, 6);
            case 21:
                return sui.h.a((sui.h) obj2, null, null, this.f260911b, 3);
            case 22:
                return sui.h.a((sui.h) obj2, null, this.f260911b, null, 5);
            case 23:
                Data data10 = this.f260911b;
                Intrinsics.h(data10);
                return sw2.j.a((sw2.j) obj2, data10, null, 30);
            case 24:
                ((sw6.e) obj2).getClass();
                Data pluginDetails = this.f260911b;
                Intrinsics.checkNotNullParameter(pluginDetails, "pluginDetails");
                return new sw6.e(pluginDetails);
            case 25:
                ((swb.e) obj2).getClass();
                Data userVoucherListData = this.f260911b;
                Intrinsics.checkNotNullParameter(userVoucherListData, "userVoucherListData");
                return new swb.e(userVoucherListData);
            case 26:
                sy6.f fVar = (sy6.f) obj2;
                Data invoiceSettings = this.f260911b;
                Intrinsics.h(invoiceSettings);
                FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) invoiceSettings.getContent();
                sr6.a aVar = freelancerInvoiceSettings != null ? freelancerInvoiceSettings.f73404b : null;
                FreelancerInvoiceSettings freelancerInvoiceSettings2 = (FreelancerInvoiceSettings) invoiceSettings.getContent();
                sr6.a aVar2 = freelancerInvoiceSettings2 != null ? freelancerInvoiceSettings2.f73405c : null;
                FreelancerInvoiceSettings freelancerInvoiceSettings3 = (FreelancerInvoiceSettings) invoiceSettings.getContent();
                sr6.b bVar2 = freelancerInvoiceSettings3 != null ? freelancerInvoiceSettings3.d : null;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
                return new sy6.f(invoiceSettings, aVar, aVar2, bVar2);
            case 27:
                return szb.c.a((szb.c) obj2, this.f260911b, false, null, false, null, false, 62);
            case 28:
                return szb.c.a((szb.c) obj2, null, false, this.f260911b, false, null, false, 59);
            default:
                return szb.c.a((szb.c) obj2, null, false, null, false, this.f260911b, false, 47);
        }
    }

    public /* synthetic */ k(Data data, smd.u uVar) {
        this.f260910a = 12;
        this.f260911b = data;
    }
}
