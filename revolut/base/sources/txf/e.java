package txf;

import com.revolut.feature.travel.common.impl.network.TravelService;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.oc;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tx0.o1;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelService f275390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f275391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wxf.a f275392c;
    public final w4l.f d;

    public e(TravelService travelService, ne0.d memoryCache, wxf.a bookingDao) {
        Intrinsics.checkNotNullParameter(travelService, "travelService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(bookingDao, "bookingDao");
        this.f275390a = travelService;
        this.f275391b = memoryCache;
        this.f275392c = bookingDao;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: txf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275387b;

            {
                this.f275387b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String strName;
                LocalDate localDate;
                oxf.a aVar;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hxf.c request = (hxf.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        TravelService travelService2 = this.f275387b.f275390a;
                        hxf.d dVar = request.f156590a;
                        String strK0 = null;
                        if (dVar != null) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            strName = dVar.name();
                        } else {
                            strName = null;
                        }
                        Integer num = request.f156591b;
                        LocalDate localDate2 = request.f156592c;
                        String string = localDate2 != null ? localDate2.toString() : null;
                        List list = request.d;
                        if (list != null) {
                            Intrinsics.checkNotNullParameter(list, "<this>");
                            strK0 = d0.k0(list, ",", null, null, 0, new oc(4), 30);
                        }
                        efm.d0<List<nxf.b>> bookings = travelService2.getBookings(strName, num, string, strK0);
                        o1 o1Var = new o1(new tx.f(7), 22);
                        bookings.getClass();
                        ufm.i iVar = new ufm.i(bookings, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        hxf.c request2 = (hxf.c) obj2;
                        List listOfBookings = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(listOfBookings, "listOfBookings");
                        this.f275387b.f275391b.f("KEY_TRAVEL_BOOKINGS_" + i2b.a.a(request2), listOfBookings);
                        break;
                    default:
                        wxf.a aVar2 = this.f275387b.f275392c;
                        hxf.c request3 = (hxf.c) obj2;
                        List listOfBookings2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(listOfBookings2, "listOfBookings");
                        List list2 = request3.d;
                        hxf.d dVar2 = request3.f156590a;
                        List list3 = listOfBookings2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            hxf.a aVar3 = (hxf.a) it8.next();
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str = aVar3.f156582a;
                            String str2 = aVar3.f156583b;
                            String str3 = aVar3.f156584c;
                            String strName2 = aVar3.d.name();
                            LocalDate localDate3 = aVar3.e;
                            hxf.d dVar3 = aVar3.f;
                            String strName3 = dVar3 != null ? dVar3.name() : null;
                            LocalTime localTime = aVar3.f156585g;
                            Iterator it9 = it8;
                            LocalDate localDate4 = aVar3.f156586h;
                            hxf.b bVar = aVar3.i;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                aVar = new oxf.a(bVar.f156587a, bVar.f156588b, bVar.f156589c, bVar.d, bVar.e, bVar.f);
                                localDate = localDate4;
                            } else {
                                localDate = localDate4;
                                aVar = null;
                            }
                            arrayList.add(new oxf.b(str, str2, str3, strName2, localDate3, strName3, localTime, localDate, aVar));
                            it8 = it9;
                        }
                        oxf.b[] bVarArr = (oxf.b[]) arrayList.toArray(new oxf.b[0]);
                        if (!ue0.e.n(list2) && dVar2 != null) {
                            List<hxf.e> list4 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                            for (hxf.e eVar : list4) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                arrayList2.add(eVar.name());
                            }
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            aVar2.k(arrayList2, dVar2.name(), (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else if (!ue0.e.n(list2)) {
                            List<hxf.e> list5 = list2;
                            ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
                            for (hxf.e eVar2 : list5) {
                                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                arrayList3.add(eVar2.name());
                            }
                            aVar2.l(arrayList3, (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else if (dVar2 != null) {
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            aVar2.j(dVar2.name(), (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else {
                            aVar2.m((oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: txf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275389b;

            {
                this.f275389b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List listE;
                hxf.b bVar;
                switch (i) {
                    case 0:
                        hxf.c request = (hxf.c) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (List) v1.c.s("KEY_TRAVEL_BOOKINGS_", i2b.a.a(request), this.f275389b.f275391b);
                    default:
                        wxf.a aVar = this.f275389b.f275392c;
                        hxf.c cVar = (hxf.c) obj2;
                        Intrinsics.checkNotNullParameter(cVar, "<destruct>");
                        hxf.d dVar = cVar.f156590a;
                        Integer num = cVar.f156591b;
                        LocalDate localDate = cVar.f156592c;
                        List list = cVar.d;
                        if (!ue0.e.n(list) && dVar != null) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            String strName = dVar.name();
                            List<hxf.e> list2 = list;
                            ArrayList arrayList = new ArrayList(w.t(list2, 10));
                            for (hxf.e eVar : list2) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                arrayList.add(eVar.name());
                            }
                            listE = aVar.g(strName, arrayList);
                        } else if (!ue0.e.n(list)) {
                            List<hxf.e> list3 = list;
                            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                            for (hxf.e eVar2 : list3) {
                                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                arrayList2.add(eVar2.name());
                            }
                            listE = aVar.h(arrayList2);
                        } else if (dVar != null) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            listE = aVar.f(dVar.name());
                        } else {
                            listE = aVar.e();
                        }
                        List<oxf.b> list4 = listE;
                        ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                        for (oxf.b bVar2 : list4) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            String str = bVar2.f230805a;
                            String str2 = bVar2.f230806b;
                            String str3 = bVar2.f230807c;
                            hxf.e eVarValueOf = hxf.e.valueOf(bVar2.d);
                            LocalDate localDate2 = bVar2.e;
                            String str4 = bVar2.f;
                            hxf.d dVarValueOf = str4 != null ? hxf.d.valueOf(str4) : null;
                            LocalTime localTime = bVar2.f230808g;
                            LocalDate localDate3 = bVar2.f230809h;
                            oxf.a aVar2 = bVar2.i;
                            if (aVar2 != null) {
                                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                bVar = new hxf.b(aVar2.getStreetLine1(), aVar2.getStreetLine2(), aVar2.getRegion(), aVar2.getCity(), aVar2.getCountry(), aVar2.getPostcode());
                            } else {
                                bVar = null;
                            }
                            arrayList3.add(new hxf.a(str, str2, str3, eVarValueOf, localDate2, dVarValueOf, localTime, localDate3, bVar));
                        }
                        if (localDate != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                if (!ifk.b.g((hxf.a) obj3).isBefore(localDate)) {
                                    arrayList4.add(obj3);
                                }
                            }
                            arrayList3 = arrayList4;
                        }
                        return num != null ? d0.V0(d0.P0(arrayList3, new d()), num.intValue()) : arrayList3;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: txf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275387b;

            {
                this.f275387b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String strName;
                LocalDate localDate;
                oxf.a aVar;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hxf.c request = (hxf.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        TravelService travelService2 = this.f275387b.f275390a;
                        hxf.d dVar = request.f156590a;
                        String strK0 = null;
                        if (dVar != null) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            strName = dVar.name();
                        } else {
                            strName = null;
                        }
                        Integer num = request.f156591b;
                        LocalDate localDate2 = request.f156592c;
                        String string = localDate2 != null ? localDate2.toString() : null;
                        List list = request.d;
                        if (list != null) {
                            Intrinsics.checkNotNullParameter(list, "<this>");
                            strK0 = d0.k0(list, ",", null, null, 0, new oc(4), 30);
                        }
                        efm.d0<List<nxf.b>> bookings = travelService2.getBookings(strName, num, string, strK0);
                        o1 o1Var = new o1(new tx.f(7), 22);
                        bookings.getClass();
                        ufm.i iVar = new ufm.i(bookings, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        hxf.c request2 = (hxf.c) obj2;
                        List listOfBookings = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(listOfBookings, "listOfBookings");
                        this.f275387b.f275391b.f("KEY_TRAVEL_BOOKINGS_" + i2b.a.a(request2), listOfBookings);
                        break;
                    default:
                        wxf.a aVar2 = this.f275387b.f275392c;
                        hxf.c request3 = (hxf.c) obj2;
                        List listOfBookings2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(listOfBookings2, "listOfBookings");
                        List list2 = request3.d;
                        hxf.d dVar2 = request3.f156590a;
                        List list3 = listOfBookings2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            hxf.a aVar3 = (hxf.a) it8.next();
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str = aVar3.f156582a;
                            String str2 = aVar3.f156583b;
                            String str3 = aVar3.f156584c;
                            String strName2 = aVar3.d.name();
                            LocalDate localDate3 = aVar3.e;
                            hxf.d dVar3 = aVar3.f;
                            String strName3 = dVar3 != null ? dVar3.name() : null;
                            LocalTime localTime = aVar3.f156585g;
                            Iterator it9 = it8;
                            LocalDate localDate4 = aVar3.f156586h;
                            hxf.b bVar = aVar3.i;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                aVar = new oxf.a(bVar.f156587a, bVar.f156588b, bVar.f156589c, bVar.d, bVar.e, bVar.f);
                                localDate = localDate4;
                            } else {
                                localDate = localDate4;
                                aVar = null;
                            }
                            arrayList.add(new oxf.b(str, str2, str3, strName2, localDate3, strName3, localTime, localDate, aVar));
                            it8 = it9;
                        }
                        oxf.b[] bVarArr = (oxf.b[]) arrayList.toArray(new oxf.b[0]);
                        if (!ue0.e.n(list2) && dVar2 != null) {
                            List<hxf.e> list4 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                            for (hxf.e eVar : list4) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                arrayList2.add(eVar.name());
                            }
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            aVar2.k(arrayList2, dVar2.name(), (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else if (!ue0.e.n(list2)) {
                            List<hxf.e> list5 = list2;
                            ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
                            for (hxf.e eVar2 : list5) {
                                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                arrayList3.add(eVar2.name());
                            }
                            aVar2.l(arrayList3, (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else if (dVar2 != null) {
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            aVar2.j(dVar2.name(), (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else {
                            aVar2.m((oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: txf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275389b;

            {
                this.f275389b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List listE;
                hxf.b bVar;
                switch (i2) {
                    case 0:
                        hxf.c request = (hxf.c) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (List) v1.c.s("KEY_TRAVEL_BOOKINGS_", i2b.a.a(request), this.f275389b.f275391b);
                    default:
                        wxf.a aVar = this.f275389b.f275392c;
                        hxf.c cVar = (hxf.c) obj2;
                        Intrinsics.checkNotNullParameter(cVar, "<destruct>");
                        hxf.d dVar = cVar.f156590a;
                        Integer num = cVar.f156591b;
                        LocalDate localDate = cVar.f156592c;
                        List list = cVar.d;
                        if (!ue0.e.n(list) && dVar != null) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            String strName = dVar.name();
                            List<hxf.e> list2 = list;
                            ArrayList arrayList = new ArrayList(w.t(list2, 10));
                            for (hxf.e eVar : list2) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                arrayList.add(eVar.name());
                            }
                            listE = aVar.g(strName, arrayList);
                        } else if (!ue0.e.n(list)) {
                            List<hxf.e> list3 = list;
                            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                            for (hxf.e eVar2 : list3) {
                                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                arrayList2.add(eVar2.name());
                            }
                            listE = aVar.h(arrayList2);
                        } else if (dVar != null) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            listE = aVar.f(dVar.name());
                        } else {
                            listE = aVar.e();
                        }
                        List<oxf.b> list4 = listE;
                        ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                        for (oxf.b bVar2 : list4) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            String str = bVar2.f230805a;
                            String str2 = bVar2.f230806b;
                            String str3 = bVar2.f230807c;
                            hxf.e eVarValueOf = hxf.e.valueOf(bVar2.d);
                            LocalDate localDate2 = bVar2.e;
                            String str4 = bVar2.f;
                            hxf.d dVarValueOf = str4 != null ? hxf.d.valueOf(str4) : null;
                            LocalTime localTime = bVar2.f230808g;
                            LocalDate localDate3 = bVar2.f230809h;
                            oxf.a aVar2 = bVar2.i;
                            if (aVar2 != null) {
                                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                bVar = new hxf.b(aVar2.getStreetLine1(), aVar2.getStreetLine2(), aVar2.getRegion(), aVar2.getCity(), aVar2.getCountry(), aVar2.getPostcode());
                            } else {
                                bVar = null;
                            }
                            arrayList3.add(new hxf.a(str, str2, str3, eVarValueOf, localDate2, dVarValueOf, localTime, localDate3, bVar));
                        }
                        if (localDate != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                if (!ifk.b.g((hxf.a) obj3).isBefore(localDate)) {
                                    arrayList4.add(obj3);
                                }
                            }
                            arrayList3 = arrayList4;
                        }
                        return num != null ? d0.V0(d0.P0(arrayList3, new d()), num.intValue()) : arrayList3;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: txf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275387b;

            {
                this.f275387b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String strName;
                LocalDate localDate;
                oxf.a aVar;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hxf.c request = (hxf.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        TravelService travelService2 = this.f275387b.f275390a;
                        hxf.d dVar = request.f156590a;
                        String strK0 = null;
                        if (dVar != null) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            strName = dVar.name();
                        } else {
                            strName = null;
                        }
                        Integer num = request.f156591b;
                        LocalDate localDate2 = request.f156592c;
                        String string = localDate2 != null ? localDate2.toString() : null;
                        List list = request.d;
                        if (list != null) {
                            Intrinsics.checkNotNullParameter(list, "<this>");
                            strK0 = d0.k0(list, ",", null, null, 0, new oc(4), 30);
                        }
                        efm.d0<List<nxf.b>> bookings = travelService2.getBookings(strName, num, string, strK0);
                        o1 o1Var = new o1(new tx.f(7), 22);
                        bookings.getClass();
                        ufm.i iVar = new ufm.i(bookings, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        hxf.c request2 = (hxf.c) obj2;
                        List listOfBookings = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(listOfBookings, "listOfBookings");
                        this.f275387b.f275391b.f("KEY_TRAVEL_BOOKINGS_" + i2b.a.a(request2), listOfBookings);
                        break;
                    default:
                        wxf.a aVar2 = this.f275387b.f275392c;
                        hxf.c request3 = (hxf.c) obj2;
                        List listOfBookings2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(listOfBookings2, "listOfBookings");
                        List list2 = request3.d;
                        hxf.d dVar2 = request3.f156590a;
                        List list3 = listOfBookings2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            hxf.a aVar3 = (hxf.a) it8.next();
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str = aVar3.f156582a;
                            String str2 = aVar3.f156583b;
                            String str3 = aVar3.f156584c;
                            String strName2 = aVar3.d.name();
                            LocalDate localDate3 = aVar3.e;
                            hxf.d dVar3 = aVar3.f;
                            String strName3 = dVar3 != null ? dVar3.name() : null;
                            LocalTime localTime = aVar3.f156585g;
                            Iterator it9 = it8;
                            LocalDate localDate4 = aVar3.f156586h;
                            hxf.b bVar = aVar3.i;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                aVar = new oxf.a(bVar.f156587a, bVar.f156588b, bVar.f156589c, bVar.d, bVar.e, bVar.f);
                                localDate = localDate4;
                            } else {
                                localDate = localDate4;
                                aVar = null;
                            }
                            arrayList.add(new oxf.b(str, str2, str3, strName2, localDate3, strName3, localTime, localDate, aVar));
                            it8 = it9;
                        }
                        oxf.b[] bVarArr = (oxf.b[]) arrayList.toArray(new oxf.b[0]);
                        if (!ue0.e.n(list2) && dVar2 != null) {
                            List<hxf.e> list4 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                            for (hxf.e eVar : list4) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                arrayList2.add(eVar.name());
                            }
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            aVar2.k(arrayList2, dVar2.name(), (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else if (!ue0.e.n(list2)) {
                            List<hxf.e> list5 = list2;
                            ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
                            for (hxf.e eVar2 : list5) {
                                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                                arrayList3.add(eVar2.name());
                            }
                            aVar2.l(arrayList3, (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else if (dVar2 != null) {
                            Intrinsics.checkNotNullParameter(dVar2, "<this>");
                            aVar2.j(dVar2.name(), (oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        } else {
                            aVar2.m((oxf.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
