package lfg;

import androidx.room.util.DBUtil;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import com.revolut.feature.travel.miles.impl.network.TravelMilesService;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesService f194896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ofg.d f194897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ofg.b f194898c;
    public final ne0.j d;
    public final w4l.f e;
    public final w4l.f f;

    public i(TravelMilesService service, ofg.d airlinesDao, ofg.b airlineDetailsDao, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(airlinesDao, "airlinesDao");
        Intrinsics.checkNotNullParameter(airlineDetailsDao, "airlineDetailsDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f194896a = service;
        this.f194897b = airlinesDao;
        this.f194898c = airlineDetailsDao;
        this.d = memoryCache;
        final int i = 2;
        Function2 function2 = new Function2(this) { // from class: lfg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194883b;

            {
                this.f194883b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i) {
                    case 0:
                        String airlineId = (String) obj2;
                        hfg.e airline = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        Intrinsics.checkNotNullParameter(airline, "airline");
                        this.f194883b.d.f("CACHE_KEY_AIRLINES" + airlineId, airline);
                        return Unit.f186387a;
                    case 1:
                        hfg.e airline2 = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "airlineId");
                        Intrinsics.checkNotNullParameter(airline2, "airline");
                        ofg.b bVar = this.f194883b.f194898c;
                        Intrinsics.checkNotNullParameter(airline2, "<this>");
                        String str = airline2.f151822a;
                        String str2 = airline2.f151823b;
                        String str3 = airline2.f151824c;
                        String str4 = airline2.d;
                        String str5 = airline2.e;
                        String str6 = airline2.f;
                        String str7 = airline2.f151825g;
                        boolean z = airline2.f151826h;
                        String str8 = airline2.i;
                        qfg.f fVarX = zi0.c.X(airline2.f151827j);
                        List list = airline2.k;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((hfg.b0) it8.next()).name());
                        }
                        ArrayList arrayList3 = airline2.f151828l;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(u0.W((TravelMilesRedeemOption) it9.next()));
                        }
                        ArrayList arrayList5 = airline2.f151829m;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            arrayList6.add(u0.W((TravelMilesRedeemOption) it10.next()));
                        }
                        qfg.c cVar = new qfg.c(str, str2, str3, str4, str5, str6, str7, z, str8, fVarX, arrayList2, arrayList4, arrayList6, airline2.f151830n);
                        bVar.getClass();
                        DBUtil.performBlocking(bVar.f224833a, false, true, new ofg.a(bVar, cVar, 1));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List allowedRedemptionTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        List listN = c6d.b.N(allowedRedemptionTypes);
                        if (listN != null) {
                            List list2 = listN;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList.add(((hfg.b0) it11.next()).name());
                            }
                        } else {
                            arrayList = null;
                        }
                        efm.d0<xfg.i> airlines = this.f194883b.f194896a.getAirlines(arrayList);
                        le3.y yVar = new le3.y(new le3.b(26), 10);
                        airlines.getClass();
                        ufm.i iVar = new ufm.i(airlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        List allowedRedemptionTypes2 = (List) obj2;
                        List airlines2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        this.f194883b.d.f(i.a(allowedRedemptionTypes2), airlines2);
                        return Unit.f186387a;
                    case 4:
                        List airlines3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines3, "airlines");
                        ofg.d dVar = this.f194883b.f194897b;
                        List list3 = airlines3;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it12 = list3.iterator();
                        int i2 = 0;
                        while (it12.hasNext()) {
                            Object next = it12.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            TravelMilesAirline travelMilesAirline = (TravelMilesAirline) next;
                            Intrinsics.checkNotNullParameter(travelMilesAirline, "<this>");
                            String str9 = travelMilesAirline.f94088a;
                            String str10 = travelMilesAirline.f94089b;
                            String str11 = travelMilesAirline.f94090c;
                            String str12 = travelMilesAirline.d;
                            String str13 = travelMilesAirline.e;
                            String str14 = travelMilesAirline.f;
                            qfg.f fVarX2 = zi0.c.X(travelMilesAirline.f94091g);
                            boolean z3 = travelMilesAirline.f94092h;
                            List list4 = travelMilesAirline.i;
                            Iterator it13 = it12;
                            ArrayList arrayList8 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it14 = list4.iterator();
                            while (it14.hasNext()) {
                                arrayList8.add(((hfg.b0) it14.next()).name());
                            }
                            arrayList7.add(new qfg.d(str9, str10, str11, str12, str13, str14, z3, i2, arrayList8, travelMilesAirline.f94093j, fVarX2));
                            it12 = it13;
                            i2 = i3;
                        }
                        DBUtil.performBlocking(dVar.f224839a, false, true, new ofg.c(dVar, arrayList7, 0));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String airlineId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        efm.d0<xfg.e> airlineDetails = this.f194883b.f194896a.getAirlineDetails(airlineId2);
                        le3.y yVar2 = new le3.y(new le3.b(27), 11);
                        airlineDetails.getClass();
                        ufm.i iVar2 = new ufm.i(airlineDetails, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: lfg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194878b;

            {
                this.f194878b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean z;
                hfg.b0 b0Var;
                List list;
                TravelMilesAirline travelMilesAirline;
                hfg.b0 b0Var2;
                switch (i) {
                    case 0:
                        String airlineId = (String) obj2;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        return (hfg.e) v7.r("CACHE_KEY_AIRLINES", airlineId, this.f194878b.d);
                    case 1:
                        String airlineId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        ofg.b bVar = this.f194878b.f194898c;
                        qfg.c cVar = (qfg.c) DBUtil.performBlocking(bVar.f224833a, true, false, new ofg.a(bVar, airlineId2, 0));
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        String str = cVar.f245303a;
                        String str2 = cVar.f245304b;
                        String str3 = cVar.f245305c;
                        String str4 = cVar.d;
                        String str5 = cVar.e;
                        String str6 = cVar.f;
                        String str7 = cVar.f245306g;
                        boolean z3 = cVar.f245307h;
                        String str8 = cVar.i;
                        TravelMilesProvider travelMilesProviderQ = zi0.c.Q(cVar.f245308j);
                        List<String> list2 = cVar.k;
                        ArrayList arrayList = new ArrayList();
                        for (String str9 : list2) {
                            hfg.b0[] b0VarArrValues = hfg.b0.values();
                            int length = b0VarArrValues.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    hfg.b0 b0Var3 = b0VarArrValues[i2];
                                    int i3 = length;
                                    int i5 = i2;
                                    z = true;
                                    if (kotlin.text.a0.z(b0Var3.name(), str9, true)) {
                                        b0Var = b0Var3;
                                    } else {
                                        i2 = i5 + 1;
                                        length = i3;
                                    }
                                } else {
                                    z = true;
                                    b0Var = null;
                                }
                            }
                            if (b0Var != null) {
                                arrayList.add(b0Var);
                            }
                        }
                        List list3 = cVar.f245309l;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(u0.L((qfg.k) it8.next()));
                        }
                        List list4 = cVar.f245310m;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it9 = list4.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(u0.L((qfg.k) it9.next()));
                        }
                        return new hfg.e(str, str2, str3, str4, str5, str6, str7, z3, str8, travelMilesProviderQ, arrayList, arrayList2, arrayList3, cVar.f245311n);
                    case 2:
                        List allowedRedemptionTypes = (List) obj2;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        return (List) this.f194878b.d.get(i.a(allowedRedemptionTypes));
                    default:
                        List allowedRedemptionTypes2 = (List) obj2;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        List list5 = allowedRedemptionTypes2;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(((hfg.b0) it10.next()).name());
                        }
                        ofg.d dVar = this.f194878b.f194897b;
                        List<qfg.d> list6 = (List) DBUtil.performBlocking(dVar.f224839a, true, false, new o9h.b(dVar, 20));
                        ArrayList arrayList5 = new ArrayList();
                        for (qfg.d dVar2 : list6) {
                            if (allowedRedemptionTypes2.isEmpty()) {
                                list = allowedRedemptionTypes2;
                            } else {
                                List<String> list7 = dVar2.i;
                                ArrayList redeemTypes = new ArrayList();
                                for (String str10 : list7) {
                                    if (!arrayList4.contains(str10)) {
                                        str10 = null;
                                    }
                                    if (str10 != null) {
                                        redeemTypes.add(str10);
                                    }
                                }
                                if (redeemTypes.isEmpty()) {
                                    list = allowedRedemptionTypes2;
                                    dVar2 = null;
                                } else {
                                    String ref2 = dVar2.f245312a;
                                    String name = dVar2.f245313b;
                                    String programmeName = dVar2.f245314c;
                                    String description = dVar2.d;
                                    String logoUrl = dVar2.e;
                                    String learnMoreUrl = dVar2.f;
                                    boolean z4 = dVar2.f245315g;
                                    int i6 = dVar2.f245316h;
                                    String str11 = dVar2.f245317j;
                                    qfg.f provider = dVar2.k;
                                    list = allowedRedemptionTypes2;
                                    Intrinsics.checkNotNullParameter(ref2, "ref");
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    Intrinsics.checkNotNullParameter(programmeName, "programmeName");
                                    Intrinsics.checkNotNullParameter(description, "description");
                                    Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                                    Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
                                    Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
                                    Intrinsics.checkNotNullParameter(provider, "provider");
                                    dVar2 = new qfg.d(ref2, name, programmeName, description, logoUrl, learnMoreUrl, z4, i6, redeemTypes, str11, provider);
                                }
                            }
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                String str12 = dVar2.f245312a;
                                String str13 = dVar2.f245313b;
                                String str14 = dVar2.f245314c;
                                String str15 = dVar2.d;
                                String str16 = dVar2.e;
                                String str17 = dVar2.f;
                                TravelMilesProvider travelMilesProviderQ2 = zi0.c.Q(dVar2.k);
                                boolean z6 = dVar2.f245315g;
                                List list8 = dVar2.i;
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it11 = list8.iterator();
                                while (it11.hasNext()) {
                                    String str18 = (String) it11.next();
                                    boolean z11 = z6;
                                    hfg.b0[] b0VarArrValues2 = hfg.b0.values();
                                    Iterator it12 = it11;
                                    int length2 = b0VarArrValues2.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length2) {
                                            hfg.b0 b0Var4 = b0VarArrValues2[i21];
                                            int i22 = i21;
                                            int i32 = length2;
                                            if (kotlin.text.a0.z(b0Var4.name(), str18, true)) {
                                                b0Var2 = b0Var4;
                                            } else {
                                                i21 = i22 + 1;
                                                length2 = i32;
                                            }
                                        } else {
                                            b0Var2 = null;
                                        }
                                    }
                                    if (b0Var2 != null) {
                                        arrayList6.add(b0Var2);
                                    }
                                    z6 = z11;
                                    it11 = it12;
                                }
                                travelMilesAirline = new TravelMilesAirline(str12, str13, str14, str15, str16, str17, travelMilesProviderQ2, z6, arrayList6, dVar2.f245317j);
                            } else {
                                travelMilesAirline = null;
                            }
                            if (travelMilesAirline != null) {
                                arrayList5.add(travelMilesAirline);
                            }
                            allowedRedemptionTypes2 = list;
                        }
                        return c6d.b.N(arrayList5);
                }
            }
        };
        final int i2 = 3;
        Function2 function22 = new Function2(this) { // from class: lfg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194883b;

            {
                this.f194883b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i2) {
                    case 0:
                        String airlineId = (String) obj2;
                        hfg.e airline = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        Intrinsics.checkNotNullParameter(airline, "airline");
                        this.f194883b.d.f("CACHE_KEY_AIRLINES" + airlineId, airline);
                        return Unit.f186387a;
                    case 1:
                        hfg.e airline2 = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "airlineId");
                        Intrinsics.checkNotNullParameter(airline2, "airline");
                        ofg.b bVar = this.f194883b.f194898c;
                        Intrinsics.checkNotNullParameter(airline2, "<this>");
                        String str = airline2.f151822a;
                        String str2 = airline2.f151823b;
                        String str3 = airline2.f151824c;
                        String str4 = airline2.d;
                        String str5 = airline2.e;
                        String str6 = airline2.f;
                        String str7 = airline2.f151825g;
                        boolean z = airline2.f151826h;
                        String str8 = airline2.i;
                        qfg.f fVarX = zi0.c.X(airline2.f151827j);
                        List list = airline2.k;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((hfg.b0) it8.next()).name());
                        }
                        ArrayList arrayList3 = airline2.f151828l;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(u0.W((TravelMilesRedeemOption) it9.next()));
                        }
                        ArrayList arrayList5 = airline2.f151829m;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            arrayList6.add(u0.W((TravelMilesRedeemOption) it10.next()));
                        }
                        qfg.c cVar = new qfg.c(str, str2, str3, str4, str5, str6, str7, z, str8, fVarX, arrayList2, arrayList4, arrayList6, airline2.f151830n);
                        bVar.getClass();
                        DBUtil.performBlocking(bVar.f224833a, false, true, new ofg.a(bVar, cVar, 1));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List allowedRedemptionTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        List listN = c6d.b.N(allowedRedemptionTypes);
                        if (listN != null) {
                            List list2 = listN;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList.add(((hfg.b0) it11.next()).name());
                            }
                        } else {
                            arrayList = null;
                        }
                        efm.d0<xfg.i> airlines = this.f194883b.f194896a.getAirlines(arrayList);
                        le3.y yVar = new le3.y(new le3.b(26), 10);
                        airlines.getClass();
                        ufm.i iVar = new ufm.i(airlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        List allowedRedemptionTypes2 = (List) obj2;
                        List airlines2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        this.f194883b.d.f(i.a(allowedRedemptionTypes2), airlines2);
                        return Unit.f186387a;
                    case 4:
                        List airlines3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines3, "airlines");
                        ofg.d dVar = this.f194883b.f194897b;
                        List list3 = airlines3;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it12 = list3.iterator();
                        int i22 = 0;
                        while (it12.hasNext()) {
                            Object next = it12.next();
                            int i3 = i22 + 1;
                            if (i22 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            TravelMilesAirline travelMilesAirline = (TravelMilesAirline) next;
                            Intrinsics.checkNotNullParameter(travelMilesAirline, "<this>");
                            String str9 = travelMilesAirline.f94088a;
                            String str10 = travelMilesAirline.f94089b;
                            String str11 = travelMilesAirline.f94090c;
                            String str12 = travelMilesAirline.d;
                            String str13 = travelMilesAirline.e;
                            String str14 = travelMilesAirline.f;
                            qfg.f fVarX2 = zi0.c.X(travelMilesAirline.f94091g);
                            boolean z3 = travelMilesAirline.f94092h;
                            List list4 = travelMilesAirline.i;
                            Iterator it13 = it12;
                            ArrayList arrayList8 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it14 = list4.iterator();
                            while (it14.hasNext()) {
                                arrayList8.add(((hfg.b0) it14.next()).name());
                            }
                            arrayList7.add(new qfg.d(str9, str10, str11, str12, str13, str14, z3, i22, arrayList8, travelMilesAirline.f94093j, fVarX2));
                            it12 = it13;
                            i22 = i3;
                        }
                        DBUtil.performBlocking(dVar.f224839a, false, true, new ofg.c(dVar, arrayList7, 0));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String airlineId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        efm.d0<xfg.e> airlineDetails = this.f194883b.f194896a.getAirlineDetails(airlineId2);
                        le3.y yVar2 = new le3.y(new le3.b(27), 11);
                        airlineDetails.getClass();
                        ufm.i iVar2 = new ufm.i(airlineDetails, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: lfg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194878b;

            {
                this.f194878b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean z;
                hfg.b0 b0Var;
                List list;
                TravelMilesAirline travelMilesAirline;
                hfg.b0 b0Var2;
                switch (i2) {
                    case 0:
                        String airlineId = (String) obj2;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        return (hfg.e) v7.r("CACHE_KEY_AIRLINES", airlineId, this.f194878b.d);
                    case 1:
                        String airlineId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        ofg.b bVar = this.f194878b.f194898c;
                        qfg.c cVar = (qfg.c) DBUtil.performBlocking(bVar.f224833a, true, false, new ofg.a(bVar, airlineId2, 0));
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        String str = cVar.f245303a;
                        String str2 = cVar.f245304b;
                        String str3 = cVar.f245305c;
                        String str4 = cVar.d;
                        String str5 = cVar.e;
                        String str6 = cVar.f;
                        String str7 = cVar.f245306g;
                        boolean z3 = cVar.f245307h;
                        String str8 = cVar.i;
                        TravelMilesProvider travelMilesProviderQ = zi0.c.Q(cVar.f245308j);
                        List<String> list2 = cVar.k;
                        ArrayList arrayList = new ArrayList();
                        for (String str9 : list2) {
                            hfg.b0[] b0VarArrValues = hfg.b0.values();
                            int length = b0VarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    hfg.b0 b0Var3 = b0VarArrValues[i22];
                                    int i3 = length;
                                    int i5 = i22;
                                    z = true;
                                    if (kotlin.text.a0.z(b0Var3.name(), str9, true)) {
                                        b0Var = b0Var3;
                                    } else {
                                        i22 = i5 + 1;
                                        length = i3;
                                    }
                                } else {
                                    z = true;
                                    b0Var = null;
                                }
                            }
                            if (b0Var != null) {
                                arrayList.add(b0Var);
                            }
                        }
                        List list3 = cVar.f245309l;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(u0.L((qfg.k) it8.next()));
                        }
                        List list4 = cVar.f245310m;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it9 = list4.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(u0.L((qfg.k) it9.next()));
                        }
                        return new hfg.e(str, str2, str3, str4, str5, str6, str7, z3, str8, travelMilesProviderQ, arrayList, arrayList2, arrayList3, cVar.f245311n);
                    case 2:
                        List allowedRedemptionTypes = (List) obj2;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        return (List) this.f194878b.d.get(i.a(allowedRedemptionTypes));
                    default:
                        List allowedRedemptionTypes2 = (List) obj2;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        List list5 = allowedRedemptionTypes2;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(((hfg.b0) it10.next()).name());
                        }
                        ofg.d dVar = this.f194878b.f194897b;
                        List<qfg.d> list6 = (List) DBUtil.performBlocking(dVar.f224839a, true, false, new o9h.b(dVar, 20));
                        ArrayList arrayList5 = new ArrayList();
                        for (qfg.d dVar2 : list6) {
                            if (allowedRedemptionTypes2.isEmpty()) {
                                list = allowedRedemptionTypes2;
                            } else {
                                List<String> list7 = dVar2.i;
                                ArrayList redeemTypes = new ArrayList();
                                for (String str10 : list7) {
                                    if (!arrayList4.contains(str10)) {
                                        str10 = null;
                                    }
                                    if (str10 != null) {
                                        redeemTypes.add(str10);
                                    }
                                }
                                if (redeemTypes.isEmpty()) {
                                    list = allowedRedemptionTypes2;
                                    dVar2 = null;
                                } else {
                                    String ref2 = dVar2.f245312a;
                                    String name = dVar2.f245313b;
                                    String programmeName = dVar2.f245314c;
                                    String description = dVar2.d;
                                    String logoUrl = dVar2.e;
                                    String learnMoreUrl = dVar2.f;
                                    boolean z4 = dVar2.f245315g;
                                    int i6 = dVar2.f245316h;
                                    String str11 = dVar2.f245317j;
                                    qfg.f provider = dVar2.k;
                                    list = allowedRedemptionTypes2;
                                    Intrinsics.checkNotNullParameter(ref2, "ref");
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    Intrinsics.checkNotNullParameter(programmeName, "programmeName");
                                    Intrinsics.checkNotNullParameter(description, "description");
                                    Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                                    Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
                                    Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
                                    Intrinsics.checkNotNullParameter(provider, "provider");
                                    dVar2 = new qfg.d(ref2, name, programmeName, description, logoUrl, learnMoreUrl, z4, i6, redeemTypes, str11, provider);
                                }
                            }
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                String str12 = dVar2.f245312a;
                                String str13 = dVar2.f245313b;
                                String str14 = dVar2.f245314c;
                                String str15 = dVar2.d;
                                String str16 = dVar2.e;
                                String str17 = dVar2.f;
                                TravelMilesProvider travelMilesProviderQ2 = zi0.c.Q(dVar2.k);
                                boolean z6 = dVar2.f245315g;
                                List list8 = dVar2.i;
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it11 = list8.iterator();
                                while (it11.hasNext()) {
                                    String str18 = (String) it11.next();
                                    boolean z11 = z6;
                                    hfg.b0[] b0VarArrValues2 = hfg.b0.values();
                                    Iterator it12 = it11;
                                    int length2 = b0VarArrValues2.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length2) {
                                            hfg.b0 b0Var4 = b0VarArrValues2[i21];
                                            int i222 = i21;
                                            int i32 = length2;
                                            if (kotlin.text.a0.z(b0Var4.name(), str18, true)) {
                                                b0Var2 = b0Var4;
                                            } else {
                                                i21 = i222 + 1;
                                                length2 = i32;
                                            }
                                        } else {
                                            b0Var2 = null;
                                        }
                                    }
                                    if (b0Var2 != null) {
                                        arrayList6.add(b0Var2);
                                    }
                                    z6 = z11;
                                    it11 = it12;
                                }
                                travelMilesAirline = new TravelMilesAirline(str12, str13, str14, str15, str16, str17, travelMilesProviderQ2, z6, arrayList6, dVar2.f245317j);
                            } else {
                                travelMilesAirline = null;
                            }
                            if (travelMilesAirline != null) {
                                arrayList5.add(travelMilesAirline);
                            }
                            allowedRedemptionTypes2 = list;
                        }
                        return c6d.b.N(arrayList5);
                }
            }
        };
        final int i3 = 4;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: lfg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194883b;

            {
                this.f194883b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i3) {
                    case 0:
                        String airlineId = (String) obj2;
                        hfg.e airline = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        Intrinsics.checkNotNullParameter(airline, "airline");
                        this.f194883b.d.f("CACHE_KEY_AIRLINES" + airlineId, airline);
                        return Unit.f186387a;
                    case 1:
                        hfg.e airline2 = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "airlineId");
                        Intrinsics.checkNotNullParameter(airline2, "airline");
                        ofg.b bVar = this.f194883b.f194898c;
                        Intrinsics.checkNotNullParameter(airline2, "<this>");
                        String str = airline2.f151822a;
                        String str2 = airline2.f151823b;
                        String str3 = airline2.f151824c;
                        String str4 = airline2.d;
                        String str5 = airline2.e;
                        String str6 = airline2.f;
                        String str7 = airline2.f151825g;
                        boolean z = airline2.f151826h;
                        String str8 = airline2.i;
                        qfg.f fVarX = zi0.c.X(airline2.f151827j);
                        List list = airline2.k;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((hfg.b0) it8.next()).name());
                        }
                        ArrayList arrayList3 = airline2.f151828l;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(u0.W((TravelMilesRedeemOption) it9.next()));
                        }
                        ArrayList arrayList5 = airline2.f151829m;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            arrayList6.add(u0.W((TravelMilesRedeemOption) it10.next()));
                        }
                        qfg.c cVar = new qfg.c(str, str2, str3, str4, str5, str6, str7, z, str8, fVarX, arrayList2, arrayList4, arrayList6, airline2.f151830n);
                        bVar.getClass();
                        DBUtil.performBlocking(bVar.f224833a, false, true, new ofg.a(bVar, cVar, 1));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List allowedRedemptionTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        List listN = c6d.b.N(allowedRedemptionTypes);
                        if (listN != null) {
                            List list2 = listN;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList.add(((hfg.b0) it11.next()).name());
                            }
                        } else {
                            arrayList = null;
                        }
                        efm.d0<xfg.i> airlines = this.f194883b.f194896a.getAirlines(arrayList);
                        le3.y yVar = new le3.y(new le3.b(26), 10);
                        airlines.getClass();
                        ufm.i iVar = new ufm.i(airlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        List allowedRedemptionTypes2 = (List) obj2;
                        List airlines2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        this.f194883b.d.f(i.a(allowedRedemptionTypes2), airlines2);
                        return Unit.f186387a;
                    case 4:
                        List airlines3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines3, "airlines");
                        ofg.d dVar = this.f194883b.f194897b;
                        List list3 = airlines3;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it12 = list3.iterator();
                        int i22 = 0;
                        while (it12.hasNext()) {
                            Object next = it12.next();
                            int i32 = i22 + 1;
                            if (i22 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            TravelMilesAirline travelMilesAirline = (TravelMilesAirline) next;
                            Intrinsics.checkNotNullParameter(travelMilesAirline, "<this>");
                            String str9 = travelMilesAirline.f94088a;
                            String str10 = travelMilesAirline.f94089b;
                            String str11 = travelMilesAirline.f94090c;
                            String str12 = travelMilesAirline.d;
                            String str13 = travelMilesAirline.e;
                            String str14 = travelMilesAirline.f;
                            qfg.f fVarX2 = zi0.c.X(travelMilesAirline.f94091g);
                            boolean z3 = travelMilesAirline.f94092h;
                            List list4 = travelMilesAirline.i;
                            Iterator it13 = it12;
                            ArrayList arrayList8 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it14 = list4.iterator();
                            while (it14.hasNext()) {
                                arrayList8.add(((hfg.b0) it14.next()).name());
                            }
                            arrayList7.add(new qfg.d(str9, str10, str11, str12, str13, str14, z3, i22, arrayList8, travelMilesAirline.f94093j, fVarX2));
                            it12 = it13;
                            i22 = i32;
                        }
                        DBUtil.performBlocking(dVar.f224839a, false, true, new ofg.c(dVar, arrayList7, 0));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String airlineId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        efm.d0<xfg.e> airlineDetails = this.f194883b.f194896a.getAirlineDetails(airlineId2);
                        le3.y yVar2 = new le3.y(new le3.b(27), 11);
                        airlineDetails.getClass();
                        ufm.i iVar2 = new ufm.i(airlineDetails, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 5;
        Function2 function23 = new Function2(this) { // from class: lfg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194883b;

            {
                this.f194883b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i5) {
                    case 0:
                        String airlineId = (String) obj2;
                        hfg.e airline = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        Intrinsics.checkNotNullParameter(airline, "airline");
                        this.f194883b.d.f("CACHE_KEY_AIRLINES" + airlineId, airline);
                        return Unit.f186387a;
                    case 1:
                        hfg.e airline2 = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "airlineId");
                        Intrinsics.checkNotNullParameter(airline2, "airline");
                        ofg.b bVar = this.f194883b.f194898c;
                        Intrinsics.checkNotNullParameter(airline2, "<this>");
                        String str = airline2.f151822a;
                        String str2 = airline2.f151823b;
                        String str3 = airline2.f151824c;
                        String str4 = airline2.d;
                        String str5 = airline2.e;
                        String str6 = airline2.f;
                        String str7 = airline2.f151825g;
                        boolean z = airline2.f151826h;
                        String str8 = airline2.i;
                        qfg.f fVarX = zi0.c.X(airline2.f151827j);
                        List list = airline2.k;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((hfg.b0) it8.next()).name());
                        }
                        ArrayList arrayList3 = airline2.f151828l;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(u0.W((TravelMilesRedeemOption) it9.next()));
                        }
                        ArrayList arrayList5 = airline2.f151829m;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            arrayList6.add(u0.W((TravelMilesRedeemOption) it10.next()));
                        }
                        qfg.c cVar = new qfg.c(str, str2, str3, str4, str5, str6, str7, z, str8, fVarX, arrayList2, arrayList4, arrayList6, airline2.f151830n);
                        bVar.getClass();
                        DBUtil.performBlocking(bVar.f224833a, false, true, new ofg.a(bVar, cVar, 1));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List allowedRedemptionTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        List listN = c6d.b.N(allowedRedemptionTypes);
                        if (listN != null) {
                            List list2 = listN;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList.add(((hfg.b0) it11.next()).name());
                            }
                        } else {
                            arrayList = null;
                        }
                        efm.d0<xfg.i> airlines = this.f194883b.f194896a.getAirlines(arrayList);
                        le3.y yVar = new le3.y(new le3.b(26), 10);
                        airlines.getClass();
                        ufm.i iVar = new ufm.i(airlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        List allowedRedemptionTypes2 = (List) obj2;
                        List airlines2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        this.f194883b.d.f(i.a(allowedRedemptionTypes2), airlines2);
                        return Unit.f186387a;
                    case 4:
                        List airlines3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines3, "airlines");
                        ofg.d dVar = this.f194883b.f194897b;
                        List list3 = airlines3;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it12 = list3.iterator();
                        int i22 = 0;
                        while (it12.hasNext()) {
                            Object next = it12.next();
                            int i32 = i22 + 1;
                            if (i22 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            TravelMilesAirline travelMilesAirline = (TravelMilesAirline) next;
                            Intrinsics.checkNotNullParameter(travelMilesAirline, "<this>");
                            String str9 = travelMilesAirline.f94088a;
                            String str10 = travelMilesAirline.f94089b;
                            String str11 = travelMilesAirline.f94090c;
                            String str12 = travelMilesAirline.d;
                            String str13 = travelMilesAirline.e;
                            String str14 = travelMilesAirline.f;
                            qfg.f fVarX2 = zi0.c.X(travelMilesAirline.f94091g);
                            boolean z3 = travelMilesAirline.f94092h;
                            List list4 = travelMilesAirline.i;
                            Iterator it13 = it12;
                            ArrayList arrayList8 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it14 = list4.iterator();
                            while (it14.hasNext()) {
                                arrayList8.add(((hfg.b0) it14.next()).name());
                            }
                            arrayList7.add(new qfg.d(str9, str10, str11, str12, str13, str14, z3, i22, arrayList8, travelMilesAirline.f94093j, fVarX2));
                            it12 = it13;
                            i22 = i32;
                        }
                        DBUtil.performBlocking(dVar.f224839a, false, true, new ofg.c(dVar, arrayList7, 0));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String airlineId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        efm.d0<xfg.e> airlineDetails = this.f194883b.f194896a.getAirlineDetails(airlineId2);
                        le3.y yVar2 = new le3.y(new le3.b(27), 11);
                        airlineDetails.getClass();
                        ufm.i iVar2 = new ufm.i(airlineDetails, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i6 = 0;
        Function1 function13 = new Function1(this) { // from class: lfg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194878b;

            {
                this.f194878b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean z;
                hfg.b0 b0Var;
                List list;
                TravelMilesAirline travelMilesAirline;
                hfg.b0 b0Var2;
                switch (i6) {
                    case 0:
                        String airlineId = (String) obj2;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        return (hfg.e) v7.r("CACHE_KEY_AIRLINES", airlineId, this.f194878b.d);
                    case 1:
                        String airlineId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        ofg.b bVar = this.f194878b.f194898c;
                        qfg.c cVar = (qfg.c) DBUtil.performBlocking(bVar.f224833a, true, false, new ofg.a(bVar, airlineId2, 0));
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        String str = cVar.f245303a;
                        String str2 = cVar.f245304b;
                        String str3 = cVar.f245305c;
                        String str4 = cVar.d;
                        String str5 = cVar.e;
                        String str6 = cVar.f;
                        String str7 = cVar.f245306g;
                        boolean z3 = cVar.f245307h;
                        String str8 = cVar.i;
                        TravelMilesProvider travelMilesProviderQ = zi0.c.Q(cVar.f245308j);
                        List<String> list2 = cVar.k;
                        ArrayList arrayList = new ArrayList();
                        for (String str9 : list2) {
                            hfg.b0[] b0VarArrValues = hfg.b0.values();
                            int length = b0VarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    hfg.b0 b0Var3 = b0VarArrValues[i22];
                                    int i32 = length;
                                    int i59 = i22;
                                    z = true;
                                    if (kotlin.text.a0.z(b0Var3.name(), str9, true)) {
                                        b0Var = b0Var3;
                                    } else {
                                        i22 = i59 + 1;
                                        length = i32;
                                    }
                                } else {
                                    z = true;
                                    b0Var = null;
                                }
                            }
                            if (b0Var != null) {
                                arrayList.add(b0Var);
                            }
                        }
                        List list3 = cVar.f245309l;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(u0.L((qfg.k) it8.next()));
                        }
                        List list4 = cVar.f245310m;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it9 = list4.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(u0.L((qfg.k) it9.next()));
                        }
                        return new hfg.e(str, str2, str3, str4, str5, str6, str7, z3, str8, travelMilesProviderQ, arrayList, arrayList2, arrayList3, cVar.f245311n);
                    case 2:
                        List allowedRedemptionTypes = (List) obj2;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        return (List) this.f194878b.d.get(i.a(allowedRedemptionTypes));
                    default:
                        List allowedRedemptionTypes2 = (List) obj2;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        List list5 = allowedRedemptionTypes2;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(((hfg.b0) it10.next()).name());
                        }
                        ofg.d dVar = this.f194878b.f194897b;
                        List<qfg.d> list6 = (List) DBUtil.performBlocking(dVar.f224839a, true, false, new o9h.b(dVar, 20));
                        ArrayList arrayList5 = new ArrayList();
                        for (qfg.d dVar2 : list6) {
                            if (allowedRedemptionTypes2.isEmpty()) {
                                list = allowedRedemptionTypes2;
                            } else {
                                List<String> list7 = dVar2.i;
                                ArrayList redeemTypes = new ArrayList();
                                for (String str10 : list7) {
                                    if (!arrayList4.contains(str10)) {
                                        str10 = null;
                                    }
                                    if (str10 != null) {
                                        redeemTypes.add(str10);
                                    }
                                }
                                if (redeemTypes.isEmpty()) {
                                    list = allowedRedemptionTypes2;
                                    dVar2 = null;
                                } else {
                                    String ref2 = dVar2.f245312a;
                                    String name = dVar2.f245313b;
                                    String programmeName = dVar2.f245314c;
                                    String description = dVar2.d;
                                    String logoUrl = dVar2.e;
                                    String learnMoreUrl = dVar2.f;
                                    boolean z4 = dVar2.f245315g;
                                    int i66 = dVar2.f245316h;
                                    String str11 = dVar2.f245317j;
                                    qfg.f provider = dVar2.k;
                                    list = allowedRedemptionTypes2;
                                    Intrinsics.checkNotNullParameter(ref2, "ref");
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    Intrinsics.checkNotNullParameter(programmeName, "programmeName");
                                    Intrinsics.checkNotNullParameter(description, "description");
                                    Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                                    Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
                                    Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
                                    Intrinsics.checkNotNullParameter(provider, "provider");
                                    dVar2 = new qfg.d(ref2, name, programmeName, description, logoUrl, learnMoreUrl, z4, i66, redeemTypes, str11, provider);
                                }
                            }
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                String str12 = dVar2.f245312a;
                                String str13 = dVar2.f245313b;
                                String str14 = dVar2.f245314c;
                                String str15 = dVar2.d;
                                String str16 = dVar2.e;
                                String str17 = dVar2.f;
                                TravelMilesProvider travelMilesProviderQ2 = zi0.c.Q(dVar2.k);
                                boolean z6 = dVar2.f245315g;
                                List list8 = dVar2.i;
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it11 = list8.iterator();
                                while (it11.hasNext()) {
                                    String str18 = (String) it11.next();
                                    boolean z11 = z6;
                                    hfg.b0[] b0VarArrValues2 = hfg.b0.values();
                                    Iterator it12 = it11;
                                    int length2 = b0VarArrValues2.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length2) {
                                            hfg.b0 b0Var4 = b0VarArrValues2[i21];
                                            int i222 = i21;
                                            int i322 = length2;
                                            if (kotlin.text.a0.z(b0Var4.name(), str18, true)) {
                                                b0Var2 = b0Var4;
                                            } else {
                                                i21 = i222 + 1;
                                                length2 = i322;
                                            }
                                        } else {
                                            b0Var2 = null;
                                        }
                                    }
                                    if (b0Var2 != null) {
                                        arrayList6.add(b0Var2);
                                    }
                                    z6 = z11;
                                    it11 = it12;
                                }
                                travelMilesAirline = new TravelMilesAirline(str12, str13, str14, str15, str16, str17, travelMilesProviderQ2, z6, arrayList6, dVar2.f245317j);
                            } else {
                                travelMilesAirline = null;
                            }
                            if (travelMilesAirline != null) {
                                arrayList5.add(travelMilesAirline);
                            }
                            allowedRedemptionTypes2 = list;
                        }
                        return c6d.b.N(arrayList5);
                }
            }
        };
        Function2 function24 = new Function2(this) { // from class: lfg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194883b;

            {
                this.f194883b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i6) {
                    case 0:
                        String airlineId = (String) obj2;
                        hfg.e airline = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        Intrinsics.checkNotNullParameter(airline, "airline");
                        this.f194883b.d.f("CACHE_KEY_AIRLINES" + airlineId, airline);
                        return Unit.f186387a;
                    case 1:
                        hfg.e airline2 = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "airlineId");
                        Intrinsics.checkNotNullParameter(airline2, "airline");
                        ofg.b bVar = this.f194883b.f194898c;
                        Intrinsics.checkNotNullParameter(airline2, "<this>");
                        String str = airline2.f151822a;
                        String str2 = airline2.f151823b;
                        String str3 = airline2.f151824c;
                        String str4 = airline2.d;
                        String str5 = airline2.e;
                        String str6 = airline2.f;
                        String str7 = airline2.f151825g;
                        boolean z = airline2.f151826h;
                        String str8 = airline2.i;
                        qfg.f fVarX = zi0.c.X(airline2.f151827j);
                        List list = airline2.k;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((hfg.b0) it8.next()).name());
                        }
                        ArrayList arrayList3 = airline2.f151828l;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(u0.W((TravelMilesRedeemOption) it9.next()));
                        }
                        ArrayList arrayList5 = airline2.f151829m;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            arrayList6.add(u0.W((TravelMilesRedeemOption) it10.next()));
                        }
                        qfg.c cVar = new qfg.c(str, str2, str3, str4, str5, str6, str7, z, str8, fVarX, arrayList2, arrayList4, arrayList6, airline2.f151830n);
                        bVar.getClass();
                        DBUtil.performBlocking(bVar.f224833a, false, true, new ofg.a(bVar, cVar, 1));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List allowedRedemptionTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        List listN = c6d.b.N(allowedRedemptionTypes);
                        if (listN != null) {
                            List list2 = listN;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList.add(((hfg.b0) it11.next()).name());
                            }
                        } else {
                            arrayList = null;
                        }
                        efm.d0<xfg.i> airlines = this.f194883b.f194896a.getAirlines(arrayList);
                        le3.y yVar = new le3.y(new le3.b(26), 10);
                        airlines.getClass();
                        ufm.i iVar = new ufm.i(airlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        List allowedRedemptionTypes2 = (List) obj2;
                        List airlines2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        this.f194883b.d.f(i.a(allowedRedemptionTypes2), airlines2);
                        return Unit.f186387a;
                    case 4:
                        List airlines3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines3, "airlines");
                        ofg.d dVar = this.f194883b.f194897b;
                        List list3 = airlines3;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it12 = list3.iterator();
                        int i22 = 0;
                        while (it12.hasNext()) {
                            Object next = it12.next();
                            int i32 = i22 + 1;
                            if (i22 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            TravelMilesAirline travelMilesAirline = (TravelMilesAirline) next;
                            Intrinsics.checkNotNullParameter(travelMilesAirline, "<this>");
                            String str9 = travelMilesAirline.f94088a;
                            String str10 = travelMilesAirline.f94089b;
                            String str11 = travelMilesAirline.f94090c;
                            String str12 = travelMilesAirline.d;
                            String str13 = travelMilesAirline.e;
                            String str14 = travelMilesAirline.f;
                            qfg.f fVarX2 = zi0.c.X(travelMilesAirline.f94091g);
                            boolean z3 = travelMilesAirline.f94092h;
                            List list4 = travelMilesAirline.i;
                            Iterator it13 = it12;
                            ArrayList arrayList8 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it14 = list4.iterator();
                            while (it14.hasNext()) {
                                arrayList8.add(((hfg.b0) it14.next()).name());
                            }
                            arrayList7.add(new qfg.d(str9, str10, str11, str12, str13, str14, z3, i22, arrayList8, travelMilesAirline.f94093j, fVarX2));
                            it12 = it13;
                            i22 = i32;
                        }
                        DBUtil.performBlocking(dVar.f224839a, false, true, new ofg.c(dVar, arrayList7, 0));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String airlineId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        efm.d0<xfg.e> airlineDetails = this.f194883b.f194896a.getAirlineDetails(airlineId2);
                        le3.y yVar2 = new le3.y(new le3.b(27), 11);
                        airlineDetails.getClass();
                        ufm.i iVar2 = new ufm.i(airlineDetails, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i21 = 1;
        this.f = new w4l.f(function23, function13, function24, new Function1(this) { // from class: lfg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194878b;

            {
                this.f194878b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean z;
                hfg.b0 b0Var;
                List list;
                TravelMilesAirline travelMilesAirline;
                hfg.b0 b0Var2;
                switch (i21) {
                    case 0:
                        String airlineId = (String) obj2;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        return (hfg.e) v7.r("CACHE_KEY_AIRLINES", airlineId, this.f194878b.d);
                    case 1:
                        String airlineId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        ofg.b bVar = this.f194878b.f194898c;
                        qfg.c cVar = (qfg.c) DBUtil.performBlocking(bVar.f224833a, true, false, new ofg.a(bVar, airlineId2, 0));
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        String str = cVar.f245303a;
                        String str2 = cVar.f245304b;
                        String str3 = cVar.f245305c;
                        String str4 = cVar.d;
                        String str5 = cVar.e;
                        String str6 = cVar.f;
                        String str7 = cVar.f245306g;
                        boolean z3 = cVar.f245307h;
                        String str8 = cVar.i;
                        TravelMilesProvider travelMilesProviderQ = zi0.c.Q(cVar.f245308j);
                        List<String> list2 = cVar.k;
                        ArrayList arrayList = new ArrayList();
                        for (String str9 : list2) {
                            hfg.b0[] b0VarArrValues = hfg.b0.values();
                            int length = b0VarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    hfg.b0 b0Var3 = b0VarArrValues[i22];
                                    int i32 = length;
                                    int i59 = i22;
                                    z = true;
                                    if (kotlin.text.a0.z(b0Var3.name(), str9, true)) {
                                        b0Var = b0Var3;
                                    } else {
                                        i22 = i59 + 1;
                                        length = i32;
                                    }
                                } else {
                                    z = true;
                                    b0Var = null;
                                }
                            }
                            if (b0Var != null) {
                                arrayList.add(b0Var);
                            }
                        }
                        List list3 = cVar.f245309l;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(u0.L((qfg.k) it8.next()));
                        }
                        List list4 = cVar.f245310m;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it9 = list4.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(u0.L((qfg.k) it9.next()));
                        }
                        return new hfg.e(str, str2, str3, str4, str5, str6, str7, z3, str8, travelMilesProviderQ, arrayList, arrayList2, arrayList3, cVar.f245311n);
                    case 2:
                        List allowedRedemptionTypes = (List) obj2;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        return (List) this.f194878b.d.get(i.a(allowedRedemptionTypes));
                    default:
                        List allowedRedemptionTypes2 = (List) obj2;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        List list5 = allowedRedemptionTypes2;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(((hfg.b0) it10.next()).name());
                        }
                        ofg.d dVar = this.f194878b.f194897b;
                        List<qfg.d> list6 = (List) DBUtil.performBlocking(dVar.f224839a, true, false, new o9h.b(dVar, 20));
                        ArrayList arrayList5 = new ArrayList();
                        for (qfg.d dVar2 : list6) {
                            if (allowedRedemptionTypes2.isEmpty()) {
                                list = allowedRedemptionTypes2;
                            } else {
                                List<String> list7 = dVar2.i;
                                ArrayList redeemTypes = new ArrayList();
                                for (String str10 : list7) {
                                    if (!arrayList4.contains(str10)) {
                                        str10 = null;
                                    }
                                    if (str10 != null) {
                                        redeemTypes.add(str10);
                                    }
                                }
                                if (redeemTypes.isEmpty()) {
                                    list = allowedRedemptionTypes2;
                                    dVar2 = null;
                                } else {
                                    String ref2 = dVar2.f245312a;
                                    String name = dVar2.f245313b;
                                    String programmeName = dVar2.f245314c;
                                    String description = dVar2.d;
                                    String logoUrl = dVar2.e;
                                    String learnMoreUrl = dVar2.f;
                                    boolean z4 = dVar2.f245315g;
                                    int i66 = dVar2.f245316h;
                                    String str11 = dVar2.f245317j;
                                    qfg.f provider = dVar2.k;
                                    list = allowedRedemptionTypes2;
                                    Intrinsics.checkNotNullParameter(ref2, "ref");
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    Intrinsics.checkNotNullParameter(programmeName, "programmeName");
                                    Intrinsics.checkNotNullParameter(description, "description");
                                    Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                                    Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
                                    Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
                                    Intrinsics.checkNotNullParameter(provider, "provider");
                                    dVar2 = new qfg.d(ref2, name, programmeName, description, logoUrl, learnMoreUrl, z4, i66, redeemTypes, str11, provider);
                                }
                            }
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                String str12 = dVar2.f245312a;
                                String str13 = dVar2.f245313b;
                                String str14 = dVar2.f245314c;
                                String str15 = dVar2.d;
                                String str16 = dVar2.e;
                                String str17 = dVar2.f;
                                TravelMilesProvider travelMilesProviderQ2 = zi0.c.Q(dVar2.k);
                                boolean z6 = dVar2.f245315g;
                                List list8 = dVar2.i;
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it11 = list8.iterator();
                                while (it11.hasNext()) {
                                    String str18 = (String) it11.next();
                                    boolean z11 = z6;
                                    hfg.b0[] b0VarArrValues2 = hfg.b0.values();
                                    Iterator it12 = it11;
                                    int length2 = b0VarArrValues2.length;
                                    int i212 = 0;
                                    while (true) {
                                        if (i212 < length2) {
                                            hfg.b0 b0Var4 = b0VarArrValues2[i212];
                                            int i222 = i212;
                                            int i322 = length2;
                                            if (kotlin.text.a0.z(b0Var4.name(), str18, true)) {
                                                b0Var2 = b0Var4;
                                            } else {
                                                i212 = i222 + 1;
                                                length2 = i322;
                                            }
                                        } else {
                                            b0Var2 = null;
                                        }
                                    }
                                    if (b0Var2 != null) {
                                        arrayList6.add(b0Var2);
                                    }
                                    z6 = z11;
                                    it11 = it12;
                                }
                                travelMilesAirline = new TravelMilesAirline(str12, str13, str14, str15, str16, str17, travelMilesProviderQ2, z6, arrayList6, dVar2.f245317j);
                            } else {
                                travelMilesAirline = null;
                            }
                            if (travelMilesAirline != null) {
                                arrayList5.add(travelMilesAirline);
                            }
                            allowedRedemptionTypes2 = list;
                        }
                        return c6d.b.N(arrayList5);
                }
            }
        }, new Function2(this) { // from class: lfg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f194883b;

            {
                this.f194883b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                switch (i21) {
                    case 0:
                        String airlineId = (String) obj2;
                        hfg.e airline = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
                        Intrinsics.checkNotNullParameter(airline, "airline");
                        this.f194883b.d.f("CACHE_KEY_AIRLINES" + airlineId, airline);
                        return Unit.f186387a;
                    case 1:
                        hfg.e airline2 = (hfg.e) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "airlineId");
                        Intrinsics.checkNotNullParameter(airline2, "airline");
                        ofg.b bVar = this.f194883b.f194898c;
                        Intrinsics.checkNotNullParameter(airline2, "<this>");
                        String str = airline2.f151822a;
                        String str2 = airline2.f151823b;
                        String str3 = airline2.f151824c;
                        String str4 = airline2.d;
                        String str5 = airline2.e;
                        String str6 = airline2.f;
                        String str7 = airline2.f151825g;
                        boolean z = airline2.f151826h;
                        String str8 = airline2.i;
                        qfg.f fVarX = zi0.c.X(airline2.f151827j);
                        List list = airline2.k;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((hfg.b0) it8.next()).name());
                        }
                        ArrayList arrayList3 = airline2.f151828l;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(u0.W((TravelMilesRedeemOption) it9.next()));
                        }
                        ArrayList arrayList5 = airline2.f151829m;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            arrayList6.add(u0.W((TravelMilesRedeemOption) it10.next()));
                        }
                        qfg.c cVar = new qfg.c(str, str2, str3, str4, str5, str6, str7, z, str8, fVarX, arrayList2, arrayList4, arrayList6, airline2.f151830n);
                        bVar.getClass();
                        DBUtil.performBlocking(bVar.f224833a, false, true, new ofg.a(bVar, cVar, 1));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        List allowedRedemptionTypes = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
                        List listN = c6d.b.N(allowedRedemptionTypes);
                        if (listN != null) {
                            List list2 = listN;
                            arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList.add(((hfg.b0) it11.next()).name());
                            }
                        } else {
                            arrayList = null;
                        }
                        efm.d0<xfg.i> airlines = this.f194883b.f194896a.getAirlines(arrayList);
                        le3.y yVar = new le3.y(new le3.b(26), 10);
                        airlines.getClass();
                        ufm.i iVar = new ufm.i(airlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        List allowedRedemptionTypes2 = (List) obj2;
                        List airlines2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(allowedRedemptionTypes2, "allowedRedemptionTypes");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        this.f194883b.d.f(i.a(allowedRedemptionTypes2), airlines2);
                        return Unit.f186387a;
                    case 4:
                        List airlines3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines3, "airlines");
                        ofg.d dVar = this.f194883b.f194897b;
                        List list3 = airlines3;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it12 = list3.iterator();
                        int i22 = 0;
                        while (it12.hasNext()) {
                            Object next = it12.next();
                            int i32 = i22 + 1;
                            if (i22 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            TravelMilesAirline travelMilesAirline = (TravelMilesAirline) next;
                            Intrinsics.checkNotNullParameter(travelMilesAirline, "<this>");
                            String str9 = travelMilesAirline.f94088a;
                            String str10 = travelMilesAirline.f94089b;
                            String str11 = travelMilesAirline.f94090c;
                            String str12 = travelMilesAirline.d;
                            String str13 = travelMilesAirline.e;
                            String str14 = travelMilesAirline.f;
                            qfg.f fVarX2 = zi0.c.X(travelMilesAirline.f94091g);
                            boolean z3 = travelMilesAirline.f94092h;
                            List list4 = travelMilesAirline.i;
                            Iterator it13 = it12;
                            ArrayList arrayList8 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it14 = list4.iterator();
                            while (it14.hasNext()) {
                                arrayList8.add(((hfg.b0) it14.next()).name());
                            }
                            arrayList7.add(new qfg.d(str9, str10, str11, str12, str13, str14, z3, i22, arrayList8, travelMilesAirline.f94093j, fVarX2));
                            it12 = it13;
                            i22 = i32;
                        }
                        DBUtil.performBlocking(dVar.f224839a, false, true, new ofg.c(dVar, arrayList7, 0));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String airlineId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(airlineId2, "airlineId");
                        efm.d0<xfg.e> airlineDetails = this.f194883b.f194896a.getAirlineDetails(airlineId2);
                        le3.y yVar2 = new le3.y(new le3.b(27), 11);
                        airlineDetails.getClass();
                        ufm.i iVar2 = new ufm.i(airlineDetails, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.util.List r7) {
        /*
            java.util.List r7 = c6d.b.N(r7)
            if (r7 == 0) goto L43
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L17:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r7.next()
            hfg.b0 r1 = (hfg.b0) r1
            java.lang.String r1 = r1.name()
            r0.add(r1)
            goto L17
        L2b:
            java.util.List r7 = zhm.d0.O0(r0)
            if (r7 == 0) goto L43
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r5 = 0
            r6 = 62
            java.lang.String r1 = "_"
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r7 = zhm.d0.k0(r0, r1, r2, r3, r4, r5, r6)
            if (r7 == 0) goto L43
            goto L45
        L43:
            java.lang.String r7 = "MILES"
        L45:
            java.lang.String r0 = "CACHE_KEY_AIRLINES_"
            java.lang.String r7 = r0.concat(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lfg.i.a(java.util.List):java.lang.String");
    }
}
