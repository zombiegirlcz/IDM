package hwi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f156246b;

    public /* synthetic */ p0(v0 v0Var, int i) {
        this.f156245a = i;
        this.f156246b = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f156245a) {
            case 0:
                s0 param = (s0) obj2;
                Intrinsics.checkNotNullParameter(param, "param");
                return (List) this.f156246b.f156262b.get(v0.b(param));
            case 1:
                s0 param2 = (s0) obj2;
                Intrinsics.checkNotNullParameter(param2, "param");
                List list = (List) this.f156246b.f156263c.T2(v0.b(param2), v0.f156259j);
                if (list != null) {
                    return ksj.b.h(list);
                }
                return null;
            case 2:
                r0 param3 = (r0) obj2;
                Intrinsics.checkNotNullParameter(param3, "param");
                return (svi.c) this.f156246b.f156262b.get(v0.a(param3));
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List<svi.a> list2 = (List) pair.f186385a;
                List list3 = (List) pair.f186386b;
                this.f156246b.getClass();
                ArrayList arrayList = new ArrayList();
                for (svi.a aVar : list2) {
                    Iterator it8 = list3.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((iwi.k) next).getAirportId(), aVar.f265868a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    iwi.k kVar = (iwi.k) next;
                    Pair pair2 = kVar != null ? new Pair(aVar, kVar) : null;
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                List listP0 = zhm.d0.P0(arrayList, new u0());
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listP0, 10));
                Iterator it9 = listP0.iterator();
                while (it9.hasNext()) {
                    arrayList2.add((svi.a) ((Pair) it9.next()).f186385a);
                }
                return arrayList2;
            case 4:
                r0 param4 = (r0) obj2;
                Intrinsics.checkNotNullParameter(param4, "param");
                iwi.b bVar = (iwi.b) this.f156246b.f156263c.T2(v0.a(param4), v0.k);
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                String id10 = bVar.getId();
                String name = bVar.getName();
                String terminal = bVar.getTerminal();
                String travelType = bVar.getTravelType();
                String inspection = bVar.getInspection();
                List imagesUrls = bVar.getImagesUrls();
                String airportName = bVar.getAirportName();
                String locationGuide = bVar.getLocationGuide();
                String additionalInfo = bVar.getAdditionalInfo();
                List<iwi.d> facilities = bVar.getFacilities();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(facilities, 10));
                for (iwi.d dVar : facilities) {
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    arrayList3.add(new svi.d(dVar.getName(), dVar.getType()));
                    bVar = bVar;
                }
                return new svi.c(id10, name, terminal, travelType, inspection, airportName, locationGuide, additionalInfo, imagesUrls, arrayList3, jwi.b.e(bVar.getOpeningHours()));
            case 5:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (List) this.f156246b.f156262b.get("CACHE_KEY_AIRPORTS");
            default:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List list4 = (List) this.f156246b.f156263c.T2("CACHE_KEY_AIRPORTS", v0.i);
                if (list4 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(list4, "<this>");
                List<iwi.a> list5 = list4;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                for (iwi.a aVar2 : list5) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    arrayList4.add(new svi.a(aVar2.getId(), aVar2.getIataCode(), aVar2.getName(), aVar2.getCityName(), aVar2.getCountryName(), aVar2.getCountryCode(), aVar2.getLatitude(), aVar2.getLongitude()));
                }
                return arrayList4;
        }
    }
}
