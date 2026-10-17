package m0g;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAdditionalInformation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAgeBand;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAvailabilityDate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAvailabilityDates;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLogistics;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLogisticsLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePickup;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePickupLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceTourSnapshotItem;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceVisitors;
import com.revolut.feature.travel.experiences.impl.network.experience.TravelExperiencesService;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.feature.travel.experiences.models.TravelExperienceRatings;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import com.revolut.feature.travel.experiences.models.TravelExperiencesSummary;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.youTransactor.uCube.rpc.Constants;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import myf.a0;
import myf.b0;
import myf.c0;
import myf.l;
import myf.m;
import myf.p;
import myf.u;
import ne0.j;
import ofm.q;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import qzf.f0;
import qzf.g0;
import qzf.o;
import rzf.h;
import rzf.k;
import rzf.n;
import rzf.r;
import rzf.s;
import rzf.t;
import rzf.v;
import rzf.x;
import rzf.y;
import rzf.z;
import x3g.i;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesService f201147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f201148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f201149c;
    public final ue0.c d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f201150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f201151h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f201152j;
    public final w4l.f k;

    public g(TravelExperiencesService service, j memoryCache, j timeBasedCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(timeBasedCache, "timeBasedCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f201147a = service;
        this.f201148b = memoryCache;
        this.f201149c = timeBasedCache;
        this.d = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i2 = 4;
        Function1 function1 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i3 = i2;
                g gVar = this.f201143b;
                switch (i3) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length) {
                                    uVar = uVarArrValues[i5];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i5++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 < length2) {
                                                    pVar2 = pVarArrValues[i6];
                                                    int i21 = length2;
                                                    int i22 = i6;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i6 = i22 + 1;
                                                        length2 = i21;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i3 = 13;
        Function2 function22 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i5 = 12;
        Function1 function12 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i32 = i5;
                g gVar = this.f201143b;
                switch (i32) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i59 = 0;
                            while (true) {
                                if (i59 < length) {
                                    uVar = uVarArrValues[i59];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i59++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 < length2) {
                                                    pVar2 = pVarArrValues[i6];
                                                    int i21 = length2;
                                                    int i22 = i6;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i6 = i22 + 1;
                                                        length2 = i21;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i6 = 19;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 20;
        Function2 function23 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i22 = 13;
        Function1 function13 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i32 = i22;
                g gVar = this.f201143b;
                switch (i32) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i59 = 0;
                            while (true) {
                                if (i59 < length) {
                                    uVar = uVarArrValues[i59];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i59++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i66 = 0;
                                            while (true) {
                                                if (i66 < length2) {
                                                    pVar2 = pVarArrValues[i66];
                                                    int i212 = length2;
                                                    int i222 = i66;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i66 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i32 = 21;
        Function2 function24 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i33 = 14;
        Function1 function14 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i33;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i59 = 0;
                            while (true) {
                                if (i59 < length) {
                                    uVar = uVarArrValues[i59];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i59++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i66 = 0;
                                            while (true) {
                                                if (i66 < length2) {
                                                    pVar2 = pVarArrValues[i66];
                                                    int i212 = length2;
                                                    int i222 = i66;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i66 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i43 = 22;
        this.f = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i59 = 1;
        Function2 function25 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i66 = 0;
        Function1 function15 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i66;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i74 = 2;
        this.f201150g = new w4l.f(function25, function15, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i92 = 3;
        Function2 function26 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i96 = 1;
        Function1 function16 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i96;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i99 = 4;
        Function2 function27 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i100 = 2;
        Function1 function17 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i100;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i101 = 5;
        this.f201151h = new w4l.f(function26, function16, function27, function17, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i102 = 6;
        Function2 function28 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i103 = 3;
        Function1 function18 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i103;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i104 = 7;
        Function2 function29 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i105 = 5;
        Function1 function19 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i105;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i106 = 8;
        new w4l.f(function28, function18, function29, function19, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i107 = 9;
        final int i108 = 6;
        final int i109 = 10;
        final int i110 = 7;
        final int i111 = 11;
        this.i = new w4l.f(new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i108;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        }, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i110;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        }, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i112 = 12;
        Function2 function210 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i113 = 8;
        Function1 function110 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i113;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i114 = 14;
        Function2 function211 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i115 = 9;
        Function1 function111 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i115;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i116 = 15;
        this.f201152j = new w4l.f(function210, function110, function211, function111, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i117 = 16;
        Function2 function212 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i118 = 10;
        Function1 function112 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i118;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i119 = 17;
        Function2 function213 = new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i120 = 11;
        Function1 function113 = new Function1(this) { // from class: m0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201143b;

            {
                this.f201143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TravelExperienceRatings travelExperienceRatings;
                TravelExperienceRatings travelExperienceRatings2;
                ArrayList arrayList;
                ArrayList arrayList2;
                TravelExperienceLogistics travelExperienceLogistics;
                h hVar;
                ArrayList arrayList3;
                ArrayList arrayList4;
                TravelExperienceVisitors travelExperienceVisitors;
                m mVar;
                b0 b0Var;
                u uVar;
                ArrayList arrayList5;
                TravelExperienceVisitors travelExperienceVisitors2;
                p pVar;
                p pVar2;
                TravelExperiencePickup travelExperiencePickup;
                int i322 = i120;
                g gVar = this.f201143b;
                switch (i322) {
                    case 0:
                        oyf.b params = (oyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0g.a) gVar.f201149c.get(params);
                    case 1:
                        f topExperiencesRequest = (f) obj2;
                        Intrinsics.checkNotNullParameter(topExperiencesRequest, "topExperiencesRequest");
                        return (i) v7.r("CACHE_KEY_TOP_EXPERIENCES", topExperiencesRequest.a(), gVar.f201148b);
                    case 2:
                        f request = (f) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ue0.c cVar = gVar.d;
                        String strQ = j6.a.q("CACHE_KEY_TOP_EXPERIENCES", request.a());
                        Type type = TypeToken.get(z.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        z zVar = (z) cVar.T2(strQ, type);
                        if (zVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        String next = zVar.getNext();
                        List<y> experiences = zVar.getExperiences();
                        ArrayList arrayList6 = new ArrayList(w.t(experiences, 10));
                        for (y yVar : experiences) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String id10 = yVar.getId();
                            String name = yVar.getName();
                            List images = yVar.getImages();
                            String description = yVar.getDescription();
                            rzf.u ratings = yVar.getRatings();
                            if (ratings != null) {
                                Object obj3 = zyf.f.f326460a;
                                Intrinsics.checkNotNullParameter(ratings, "<this>");
                                travelExperienceRatings = new TravelExperienceRatings(ratings.getCount(), ratings.getAverageScore());
                            } else {
                                travelExperienceRatings = null;
                            }
                            arrayList6.add(new TravelExperiencesSummary(id10, name, images, description, travelExperienceRatings, cp5.c.H(yVar.getStartingPrice()), vyf.b.a(yVar.getCancellationPolicy())));
                        }
                        return new i(next, arrayList6);
                    case 3:
                        ((Integer) obj2).intValue();
                        return (List) gVar.f201148b.get("CACHE_KEY_CATEGORIES_POPULAR");
                    case 4:
                        a0 params2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (myf.a) v7.r("CACHE_KEY_EXPERIENCE-", params2.f210462a, gVar.f201148b);
                    case 5:
                        ((Integer) obj2).getClass();
                        Type type2 = TypeToken.getParameterized(List.class, f0.class).getType();
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.h(type2);
                        return (List) cVar2.T2("CACHE_KEY_CATEGORIES_POPULAR", type2);
                    case 6:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) gVar.f201148b.get("CACHE_KEY_DESTINATIONS_POPULAR");
                    case 7:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type3 = TypeToken.getParameterized(List.class, g0.class).getType();
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.h(type3);
                        return (List) cVar3.T2("CACHE_KEY_DESTINATIONS_POPULAR", type3);
                    case 8:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (qzf.u) gVar.f201148b.get(g.a(params3));
                    case 9:
                        l params4 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        ue0.c cVar4 = gVar.d;
                        String strA = g.a(params4);
                        Type type4 = TypeToken.get(qzf.u.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        return (qzf.u) cVar4.T2(strA, type4);
                    case 10:
                        myf.z params5 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (myf.i) gVar.f201148b.get(g.b(params5));
                    case 11:
                        myf.z params6 = (myf.z) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        ue0.c cVar5 = gVar.d;
                        String strB = g.b(params6);
                        Type type5 = TypeToken.get(o.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        o oVar = (o) cVar5.T2(strB, type5);
                        if (oVar != null) {
                            return n14.e.I(oVar);
                        }
                        return null;
                    case 12:
                        a0 params7 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        ue0.c cVar6 = gVar.d;
                        String strQ2 = j6.a.q("CACHE_KEY_EXPERIENCE-", params7.f210462a);
                        Type type6 = TypeToken.get(h.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                        h hVar2 = (h) cVar6.T2(strQ2, type6);
                        if (hVar2 == null) {
                            return null;
                        }
                        Object obj4 = zyf.f.f326460a;
                        Intrinsics.checkNotNullParameter(hVar2, "<this>");
                        String id11 = hVar2.getId();
                        String name2 = hVar2.getName();
                        List images2 = hVar2.getImages();
                        rzf.u ratings2 = hVar2.getRatings();
                        if (ratings2 != null) {
                            Intrinsics.checkNotNullParameter(ratings2, "<this>");
                            travelExperienceRatings2 = new TravelExperienceRatings(ratings2.getCount(), ratings2.getAverageScore());
                        } else {
                            travelExperienceRatings2 = null;
                        }
                        x visitors = hVar2.getVisitors();
                        Intrinsics.checkNotNullParameter(visitors, "<this>");
                        int minCount = visitors.getMinCount();
                        int maxCount = visitors.getMaxCount();
                        List<rzf.c> ageBands = visitors.getAgeBands();
                        ArrayList arrayList7 = new ArrayList(w.t(ageBands, 10));
                        for (rzf.c cVar7 : ageBands) {
                            Intrinsics.checkNotNullParameter(cVar7, "<this>");
                            arrayList7.add(new TravelExperienceAgeBand((myf.b) u1.t(cVar7.getType(), myf.b.ADULT, zyf.f.f326460a), cVar7.getName(), cVar7.getMinAge(), cVar7.getMaxAge(), cVar7.getMinCount(), cVar7.getMaxCount()));
                        }
                        TravelExperienceVisitors travelExperienceVisitors3 = new TravelExperienceVisitors(arrayList7, minCount, maxCount, visitors.getAdultRequired());
                        TravelExperiencesPricing travelExperiencesPricingH = cp5.c.H(hVar2.getStartingPrice());
                        List<rzf.a> additionalInformation = hVar2.getAdditionalInformation();
                        ArrayList arrayList8 = new ArrayList(w.t(additionalInformation, 10));
                        for (rzf.a aVar : additionalInformation) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList8.add(new TravelExperienceAdditionalInformation(aVar.getType(), aVar.getLabel()));
                        }
                        List includedFeatures = hVar2.getIncludedFeatures();
                        if (includedFeatures != null) {
                            List list = includedFeatures;
                            ArrayList arrayList9 = new ArrayList(w.t(list, 10));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                arrayList9.add(zyf.b.b((rzf.j) it10.next()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List excludedFeatures = hVar2.getExcludedFeatures();
                        if (excludedFeatures != null) {
                            List list2 = excludedFeatures;
                            ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                            Iterator it11 = list2.iterator();
                            while (it11.hasNext()) {
                                arrayList10.add(zyf.b.b((rzf.j) it11.next()));
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        String description2 = hVar2.getDescription();
                        List<rzf.w> tourSnapshot = hVar2.getTourSnapshot();
                        ArrayList arrayList11 = new ArrayList(w.t(tourSnapshot, 10));
                        for (rzf.w wVar : tourSnapshot) {
                            Object obj5 = zyf.g.f326461a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            arrayList11.add(new TravelExperienceTourSnapshotItem((c0) u1.u(wVar.getCategory(), zyf.g.f326461a), wVar.getLabel()));
                        }
                        TravelExperienceCancellationPolicy.Experience experienceA = vyf.b.a(hVar2.getCancellationPolicy());
                        List languages = hVar2.getLanguages();
                        ArrayList arrayList12 = new ArrayList(w.t(languages, 10));
                        Iterator it12 = languages.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(zyf.d.b((rzf.o) it12.next()));
                        }
                        List<rzf.p> locations = hVar2.getLocations();
                        ArrayList arrayList13 = new ArrayList(w.t(locations, 10));
                        for (rzf.p pVar3 : locations) {
                            Intrinsics.checkNotNullParameter(pVar3, "<this>");
                            String id12 = pVar3.getId();
                            String name3 = pVar3.getName();
                            rzf.b address = pVar3.getAddress();
                            arrayList13.add(new TravelExperienceLocation(id12, name3, address != null ? q.T(address) : null));
                        }
                        rzf.q logistics = hVar2.getLogistics();
                        if (logistics != null) {
                            Object obj6 = zyf.e.f326459a;
                            Intrinsics.checkNotNullParameter(logistics, "<this>");
                            List<r> start = logistics.getStart();
                            ArrayList arrayList14 = new ArrayList(w.t(start, 10));
                            for (r rVar : start) {
                                Intrinsics.checkNotNullParameter(rVar, "<this>");
                                arrayList14.add(new TravelExperienceLogisticsLocation(rVar.getLocationId(), rVar.getDescription()));
                            }
                            List<r> end2 = logistics.getEnd();
                            ArrayList arrayList15 = new ArrayList(w.t(end2, 10));
                            for (r rVar2 : end2) {
                                Intrinsics.checkNotNullParameter(rVar2, "<this>");
                                arrayList15.add(new TravelExperienceLogisticsLocation(rVar2.getLocationId(), rVar2.getDescription()));
                            }
                            s pickup = logistics.getPickup();
                            if (pickup != null) {
                                Intrinsics.checkNotNullParameter(pickup, "<this>");
                                List<t> locations2 = pickup.getLocations();
                                ArrayList arrayList16 = new ArrayList(w.t(locations2, 10));
                                for (t tVar : locations2) {
                                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                                    arrayList16.add(new TravelExperiencePickupLocation(tVar.getLocationId(), (myf.w) u1.u(tVar.getType(), zyf.e.f326459a)));
                                }
                                travelExperiencePickup = new TravelExperiencePickup(pickup.getAdditionalPickupInfo(), arrayList16, pickup.getAllowCustomPickup());
                            } else {
                                travelExperiencePickup = null;
                            }
                            travelExperienceLogistics = new TravelExperienceLogistics(arrayList14, arrayList15, travelExperiencePickup);
                        } else {
                            travelExperienceLogistics = null;
                        }
                        rzf.l itinerary = hVar2.getItinerary();
                        if (itinerary != null) {
                            Intrinsics.checkNotNullParameter(itinerary, "<this>");
                            String type7 = itinerary.getType();
                            u[] uVarArrValues = u.values();
                            int length = uVarArrValues.length;
                            int i592 = 0;
                            while (true) {
                                if (i592 < length) {
                                    uVar = uVarArrValues[i592];
                                    if (!kotlin.text.a0.z(uVar.name(), type7, true)) {
                                        i592++;
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                uVar = u.UNKNOWN;
                            }
                            List days = itinerary.getDays();
                            ArrayList arrayList17 = new ArrayList(w.t(days, 10));
                            Iterator it13 = days.iterator();
                            while (it13.hasNext()) {
                                k kVar = (k) it13.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                List<n> routes = kVar.getRoutes();
                                ArrayList arrayList18 = new ArrayList(w.t(routes, 10));
                                for (n nVar : routes) {
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String title = nVar.getTitle();
                                    List items = nVar.getItems();
                                    Iterator it14 = it13;
                                    ArrayList arrayList19 = new ArrayList(w.t(items, 10));
                                    Iterator it15 = items.iterator();
                                    while (it15.hasNext()) {
                                        rzf.m mVar2 = (rzf.m) it15.next();
                                        Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                        rzf.p location = mVar2.getLocation();
                                        Intrinsics.checkNotNullParameter(location, "<this>");
                                        Iterator it16 = it15;
                                        h hVar3 = hVar2;
                                        String id13 = location.getId();
                                        ArrayList arrayList20 = arrayList8;
                                        String name4 = location.getName();
                                        rzf.b address2 = location.getAddress();
                                        TravelExperienceLocation travelExperienceLocation = new TravelExperienceLocation(id13, name4, address2 != null ? q.T(address2) : null);
                                        String description3 = mVar2.getDescription();
                                        myf.s sVarT = n14.k.t(mVar2.getMinDuration(), mVar2.getMaxDuration());
                                        String admissionIncluded = mVar2.getAdmissionIncluded();
                                        if (admissionIncluded != null) {
                                            p[] pVarArrValues = p.values();
                                            arrayList5 = arrayList11;
                                            int length2 = pVarArrValues.length;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            int i662 = 0;
                                            while (true) {
                                                if (i662 < length2) {
                                                    pVar2 = pVarArrValues[i662];
                                                    int i212 = length2;
                                                    int i222 = i662;
                                                    if (!kotlin.text.a0.z(pVar2.name(), admissionIncluded, true)) {
                                                        i662 = i222 + 1;
                                                        length2 = i212;
                                                    }
                                                } else {
                                                    pVar2 = null;
                                                }
                                            }
                                            pVar = pVar2;
                                        } else {
                                            arrayList5 = arrayList11;
                                            travelExperienceVisitors2 = travelExperienceVisitors3;
                                            pVar = null;
                                        }
                                        arrayList19.add(new myf.o(travelExperienceLocation, description3, sVarT, pVar));
                                        it15 = it16;
                                        hVar2 = hVar3;
                                        arrayList8 = arrayList20;
                                        arrayList11 = arrayList5;
                                        travelExperienceVisitors3 = travelExperienceVisitors2;
                                    }
                                    arrayList18.add(new myf.t(title, arrayList19));
                                    it13 = it14;
                                }
                                arrayList17.add(new myf.n(arrayList18));
                                it13 = it13;
                            }
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = new m(uVar, arrayList17);
                        } else {
                            hVar = hVar2;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList11;
                            travelExperienceVisitors = travelExperienceVisitors3;
                            mVar = null;
                        }
                        v supplier = hVar.getSupplier();
                        if (supplier != null) {
                            Intrinsics.checkNotNullParameter(supplier, "<this>");
                            b0Var = new b0(supplier.getName(), supplier.getReference());
                        } else {
                            b0Var = null;
                        }
                        return new myf.a(id11, name2, images2, travelExperienceRatings2, travelExperienceVisitors, travelExperiencesPricingH, arrayList3, arrayList, arrayList2, description2, arrayList4, experienceA, arrayList12, arrayList13, travelExperienceLogistics, mVar, b0Var);
                    case 13:
                        myf.c params8 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        return (TravelExperienceAvailabilityDates) v7.r("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params8.f210466a, gVar.f201148b);
                    default:
                        myf.c params9 = (myf.c) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        ue0.c cVar8 = gVar.d;
                        String strQ3 = j6.a.q("CACHE_KEY_EXPERIENCE_AVAILABILITY_DATES-", params9.f210466a);
                        Type type8 = TypeToken.get(rzf.e.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                        rzf.e eVar = (rzf.e) cVar8.T2(strQ3, type8);
                        if (eVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        List<rzf.d> availableDates = eVar.getAvailableDates();
                        ArrayList arrayList21 = new ArrayList(w.t(availableDates, 10));
                        for (rzf.d dVar : availableDates) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(dVar.getDate()).withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                            arrayList21.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                        }
                        return new TravelExperienceAvailabilityDates(arrayList21);
                }
            }
        };
        final int i121 = 18;
        this.k = new w4l.f(function212, function112, function213, function113, new Function2(this) { // from class: m0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f201141b;

            {
                this.f201141b = this;
            }

            /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 rzf.y, still in use, count: 2, list:
                  (r7v23 rzf.y) from 0x07d0: MOVE (r44v1 rzf.y) = (r7v23 rzf.y)
                  (r7v23 rzf.y) from 0x07c6: MOVE (r44v3 rzf.y) = (r7v23 rzf.y)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 2646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m0g.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(l lVar) {
        String strConcat;
        String str = lVar.f210479a.f306286a;
        String str2 = lVar.f210480b;
        if (str2 == null || (strConcat = "_".concat(str2)) == null) {
            m70.a.c(t0.f186434a);
            strConcat = "";
        }
        return p.a.p("CACHE_KEY_FILTERS_", str, strConcat);
    }

    public static String b(myf.z zVar) {
        String strK;
        Integer num = zVar.f210495a;
        Coordinates coordinates = zVar.f210496b;
        if (coordinates == null || (strK = g4i.a.K(coordinates)) == null) {
            m70.a.c(t0.f186434a);
            strK = "";
        }
        return "CACHE_KEY_RECOMMENDED_CATEGORIES_" + num + "_" + strK;
    }
}
