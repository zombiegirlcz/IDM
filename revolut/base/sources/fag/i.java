package fag;

import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature_travel_hotels_models.property.search.HotelsSelectedDates;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsService f133330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f133331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f133332c;
    public final j9g.o d;
    public final ihm.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f133333g;

    public i(TravelHotelsService api2, ue0.c storage, ne0.j memoryCache, j9g.p mapper, j9g.o smartSearchResultMapper) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(smartSearchResultMapper, "smartSearchResultMapper");
        this.f133330a = api2;
        this.f133331b = storage;
        this.f133332c = memoryCache;
        this.d = smartSearchResultMapper;
        this.e = v0.a.d("create(...)");
        final int i = 4;
        Function2 function2 = new Function2(this) { // from class: fag.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f133312b;

            {
                this.f133312b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object lVar;
                switch (i) {
                    case 0:
                        zfi.c filters = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f133312b.f133332c.f("TRAVEL_HOTELS_AVAILABILITY_FILTERS", filters);
                        return Unit.f186387a;
                    case 1:
                        zfi.c domain = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "filters");
                        ue0.c cVar = this.f133312b.f133331b;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ArrayList<zfi.d> arrayList = domain.f321956a;
                        int i2 = 10;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (zfi.d dVar : arrayList) {
                            String strC = dVar.f321960a.c();
                            String str = dVar.f321961b;
                            zfi.n nVar = dVar.f321962c;
                            arrayList2.add(new z9g.e(strC, str, nVar != null ? nVar.f321982a : null));
                        }
                        ArrayList<zfi.b> arrayList3 = domain.f321957b;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        for (zfi.b bVar : arrayList3) {
                            zfi.m mVarA = bVar.a();
                            if (mVarA instanceof zfi.h) {
                                zfi.h hVar = (zfi.h) mVarA;
                                lVar = new z9g.a(bVar.c(), bVar.b(), new z9g.g(hVar.f321970a, hVar.f321971b));
                            } else if (mVarA instanceof zfi.k) {
                                String strC2 = bVar.c();
                                String strB = bVar.b();
                                zfi.k kVar = (zfi.k) mVarA;
                                String str2 = kVar.f321978a;
                                ArrayList<zfi.n> arrayList5 = kVar.f321979b;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, i2));
                                for (zfi.n nVar2 : arrayList5) {
                                    arrayList6.add(new z9g.j(nVar2.f321982a, nVar2.f321983b, nVar2.f321984c));
                                }
                                lVar = new z9g.b(strC2, strB, new z9g.h(str2, arrayList6));
                            } else if (mVarA instanceof zfi.s) {
                                String strC3 = bVar.c();
                                String strB2 = bVar.b();
                                zfi.s sVar = (zfi.s) mVarA;
                                String str3 = sVar.f321997a;
                                ArrayList<zfi.n> arrayList7 = sVar.f321998b;
                                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, i2));
                                for (zfi.n nVar3 : arrayList7) {
                                    arrayList8.add(new z9g.j(nVar3.f321982a, nVar3.f321983b, nVar3.f321984c));
                                }
                                lVar = new z9g.f(strC3, strB2, new z9g.m(str3, sVar.f321999c, arrayList8));
                            } else {
                                if (!(mVarA instanceof zfi.p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zfi.p pVar = (zfi.p) mVarA;
                                lVar = new z9g.l(bVar.c(), bVar.b(), new z9g.k(pVar.f321988a, pVar.f321989b, mo3.a.p(pVar.f321990c), mo3.a.p(pVar.d)));
                            }
                            arrayList4.add(lVar);
                            i2 = 10;
                        }
                        cVar.G(new z9g.d(arrayList2, arrayList4), "TRAVEL_HOTELS_AVAILABILITY_FILTERS", wim.z.d(kotlin.jvm.internal.o0.b(z9g.d.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        i iVar = this.f133312b;
                        TravelHotelsService travelHotelsService = iVar.f133330a;
                        String str4 = params.f133305a;
                        String str5 = params.f133306b;
                        HotelsSelectedDates hotelsSelectedDates = params.f133307c;
                        dag.c cVar2 = hotelsSelectedDates != null ? new dag.c(hotelsSelectedDates.f98129a.toString(), hotelsSelectedDates.f98130b.toString()) : null;
                        a aVar = params.d;
                        efm.d0<dag.e> smartSearch = travelHotelsService.getSmartSearch(new dag.d(str4, str5, cVar2, aVar != null ? aVar.a() : null));
                        f9g.h hVar2 = new f9g.h(new f2i.x(1, iVar.d, j9g.o.class, "mapToDomain", "mapToDomain(Lcom/revolut/feature/travel/hotels/impl/network/model/search/HotelsSmartSearchResultDto;)Lcom/revolut/feature/travel/hotels/impl/model/search/HotelsSmartSearchResultData;", 0, 9), 9);
                        smartSearch.getClass();
                        ufm.i iVar2 = new ufm.i(smartSearch, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        b params2 = (b) obj2;
                        o9g.a result = (o9g.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f133312b.f133332c.f(i.a(params2), result);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        i iVar3 = this.f133312b;
                        efm.d0<z9g.d> availabilityFilters = iVar3.f133330a.getAvailabilityFilters();
                        f9g.h hVar3 = new f9g.h(new f7l.c(iVar3, 9), 8);
                        availabilityFilters.getClass();
                        ufm.i iVar4 = new ufm.i(availabilityFilters, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        };
        e eVar = new e(this, 3);
        final int i2 = 0;
        Function2 function22 = new Function2(this) { // from class: fag.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f133312b;

            {
                this.f133312b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object lVar;
                switch (i2) {
                    case 0:
                        zfi.c filters = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f133312b.f133332c.f("TRAVEL_HOTELS_AVAILABILITY_FILTERS", filters);
                        return Unit.f186387a;
                    case 1:
                        zfi.c domain = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "filters");
                        ue0.c cVar = this.f133312b.f133331b;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ArrayList<zfi.d> arrayList = domain.f321956a;
                        int i22 = 10;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (zfi.d dVar : arrayList) {
                            String strC = dVar.f321960a.c();
                            String str = dVar.f321961b;
                            zfi.n nVar = dVar.f321962c;
                            arrayList2.add(new z9g.e(strC, str, nVar != null ? nVar.f321982a : null));
                        }
                        ArrayList<zfi.b> arrayList3 = domain.f321957b;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        for (zfi.b bVar : arrayList3) {
                            zfi.m mVarA = bVar.a();
                            if (mVarA instanceof zfi.h) {
                                zfi.h hVar = (zfi.h) mVarA;
                                lVar = new z9g.a(bVar.c(), bVar.b(), new z9g.g(hVar.f321970a, hVar.f321971b));
                            } else if (mVarA instanceof zfi.k) {
                                String strC2 = bVar.c();
                                String strB = bVar.b();
                                zfi.k kVar = (zfi.k) mVarA;
                                String str2 = kVar.f321978a;
                                ArrayList<zfi.n> arrayList5 = kVar.f321979b;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, i22));
                                for (zfi.n nVar2 : arrayList5) {
                                    arrayList6.add(new z9g.j(nVar2.f321982a, nVar2.f321983b, nVar2.f321984c));
                                }
                                lVar = new z9g.b(strC2, strB, new z9g.h(str2, arrayList6));
                            } else if (mVarA instanceof zfi.s) {
                                String strC3 = bVar.c();
                                String strB2 = bVar.b();
                                zfi.s sVar = (zfi.s) mVarA;
                                String str3 = sVar.f321997a;
                                ArrayList<zfi.n> arrayList7 = sVar.f321998b;
                                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, i22));
                                for (zfi.n nVar3 : arrayList7) {
                                    arrayList8.add(new z9g.j(nVar3.f321982a, nVar3.f321983b, nVar3.f321984c));
                                }
                                lVar = new z9g.f(strC3, strB2, new z9g.m(str3, sVar.f321999c, arrayList8));
                            } else {
                                if (!(mVarA instanceof zfi.p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zfi.p pVar = (zfi.p) mVarA;
                                lVar = new z9g.l(bVar.c(), bVar.b(), new z9g.k(pVar.f321988a, pVar.f321989b, mo3.a.p(pVar.f321990c), mo3.a.p(pVar.d)));
                            }
                            arrayList4.add(lVar);
                            i22 = 10;
                        }
                        cVar.G(new z9g.d(arrayList2, arrayList4), "TRAVEL_HOTELS_AVAILABILITY_FILTERS", wim.z.d(kotlin.jvm.internal.o0.b(z9g.d.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        i iVar = this.f133312b;
                        TravelHotelsService travelHotelsService = iVar.f133330a;
                        String str4 = params.f133305a;
                        String str5 = params.f133306b;
                        HotelsSelectedDates hotelsSelectedDates = params.f133307c;
                        dag.c cVar2 = hotelsSelectedDates != null ? new dag.c(hotelsSelectedDates.f98129a.toString(), hotelsSelectedDates.f98130b.toString()) : null;
                        a aVar = params.d;
                        efm.d0<dag.e> smartSearch = travelHotelsService.getSmartSearch(new dag.d(str4, str5, cVar2, aVar != null ? aVar.a() : null));
                        f9g.h hVar2 = new f9g.h(new f2i.x(1, iVar.d, j9g.o.class, "mapToDomain", "mapToDomain(Lcom/revolut/feature/travel/hotels/impl/network/model/search/HotelsSmartSearchResultDto;)Lcom/revolut/feature/travel/hotels/impl/model/search/HotelsSmartSearchResultData;", 0, 9), 9);
                        smartSearch.getClass();
                        ufm.i iVar2 = new ufm.i(smartSearch, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        b params2 = (b) obj2;
                        o9g.a result = (o9g.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f133312b.f133332c.f(i.a(params2), result);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        i iVar3 = this.f133312b;
                        efm.d0<z9g.d> availabilityFilters = iVar3.f133330a.getAvailabilityFilters();
                        f9g.h hVar3 = new f9g.h(new f7l.c(iVar3, 9), 8);
                        availabilityFilters.getClass();
                        ufm.i iVar4 = new ufm.i(availabilityFilters, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        };
        e eVar2 = new e(this, i2);
        final int i3 = 1;
        this.f = new w4l.f(function2, eVar, function22, eVar2, new Function2(this) { // from class: fag.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f133312b;

            {
                this.f133312b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object lVar;
                switch (i3) {
                    case 0:
                        zfi.c filters = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f133312b.f133332c.f("TRAVEL_HOTELS_AVAILABILITY_FILTERS", filters);
                        return Unit.f186387a;
                    case 1:
                        zfi.c domain = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "filters");
                        ue0.c cVar = this.f133312b.f133331b;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ArrayList<zfi.d> arrayList = domain.f321956a;
                        int i22 = 10;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (zfi.d dVar : arrayList) {
                            String strC = dVar.f321960a.c();
                            String str = dVar.f321961b;
                            zfi.n nVar = dVar.f321962c;
                            arrayList2.add(new z9g.e(strC, str, nVar != null ? nVar.f321982a : null));
                        }
                        ArrayList<zfi.b> arrayList3 = domain.f321957b;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        for (zfi.b bVar : arrayList3) {
                            zfi.m mVarA = bVar.a();
                            if (mVarA instanceof zfi.h) {
                                zfi.h hVar = (zfi.h) mVarA;
                                lVar = new z9g.a(bVar.c(), bVar.b(), new z9g.g(hVar.f321970a, hVar.f321971b));
                            } else if (mVarA instanceof zfi.k) {
                                String strC2 = bVar.c();
                                String strB = bVar.b();
                                zfi.k kVar = (zfi.k) mVarA;
                                String str2 = kVar.f321978a;
                                ArrayList<zfi.n> arrayList5 = kVar.f321979b;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, i22));
                                for (zfi.n nVar2 : arrayList5) {
                                    arrayList6.add(new z9g.j(nVar2.f321982a, nVar2.f321983b, nVar2.f321984c));
                                }
                                lVar = new z9g.b(strC2, strB, new z9g.h(str2, arrayList6));
                            } else if (mVarA instanceof zfi.s) {
                                String strC3 = bVar.c();
                                String strB2 = bVar.b();
                                zfi.s sVar = (zfi.s) mVarA;
                                String str3 = sVar.f321997a;
                                ArrayList<zfi.n> arrayList7 = sVar.f321998b;
                                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, i22));
                                for (zfi.n nVar3 : arrayList7) {
                                    arrayList8.add(new z9g.j(nVar3.f321982a, nVar3.f321983b, nVar3.f321984c));
                                }
                                lVar = new z9g.f(strC3, strB2, new z9g.m(str3, sVar.f321999c, arrayList8));
                            } else {
                                if (!(mVarA instanceof zfi.p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zfi.p pVar = (zfi.p) mVarA;
                                lVar = new z9g.l(bVar.c(), bVar.b(), new z9g.k(pVar.f321988a, pVar.f321989b, mo3.a.p(pVar.f321990c), mo3.a.p(pVar.d)));
                            }
                            arrayList4.add(lVar);
                            i22 = 10;
                        }
                        cVar.G(new z9g.d(arrayList2, arrayList4), "TRAVEL_HOTELS_AVAILABILITY_FILTERS", wim.z.d(kotlin.jvm.internal.o0.b(z9g.d.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        i iVar = this.f133312b;
                        TravelHotelsService travelHotelsService = iVar.f133330a;
                        String str4 = params.f133305a;
                        String str5 = params.f133306b;
                        HotelsSelectedDates hotelsSelectedDates = params.f133307c;
                        dag.c cVar2 = hotelsSelectedDates != null ? new dag.c(hotelsSelectedDates.f98129a.toString(), hotelsSelectedDates.f98130b.toString()) : null;
                        a aVar = params.d;
                        efm.d0<dag.e> smartSearch = travelHotelsService.getSmartSearch(new dag.d(str4, str5, cVar2, aVar != null ? aVar.a() : null));
                        f9g.h hVar2 = new f9g.h(new f2i.x(1, iVar.d, j9g.o.class, "mapToDomain", "mapToDomain(Lcom/revolut/feature/travel/hotels/impl/network/model/search/HotelsSmartSearchResultDto;)Lcom/revolut/feature/travel/hotels/impl/model/search/HotelsSmartSearchResultData;", 0, 9), 9);
                        smartSearch.getClass();
                        ufm.i iVar2 = new ufm.i(smartSearch, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        b params2 = (b) obj2;
                        o9g.a result = (o9g.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f133312b.f133332c.f(i.a(params2), result);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        i iVar3 = this.f133312b;
                        efm.d0<z9g.d> availabilityFilters = iVar3.f133330a.getAvailabilityFilters();
                        f9g.h hVar3 = new f9g.h(new f7l.c(iVar3, 9), 8);
                        availabilityFilters.getClass();
                        ufm.i iVar4 = new ufm.i(availabilityFilters, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 2;
        final int i6 = 3;
        this.f133333g = new w4l.f(new Function2(this) { // from class: fag.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f133312b;

            {
                this.f133312b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object lVar;
                switch (i5) {
                    case 0:
                        zfi.c filters = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f133312b.f133332c.f("TRAVEL_HOTELS_AVAILABILITY_FILTERS", filters);
                        return Unit.f186387a;
                    case 1:
                        zfi.c domain = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "filters");
                        ue0.c cVar = this.f133312b.f133331b;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ArrayList<zfi.d> arrayList = domain.f321956a;
                        int i22 = 10;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (zfi.d dVar : arrayList) {
                            String strC = dVar.f321960a.c();
                            String str = dVar.f321961b;
                            zfi.n nVar = dVar.f321962c;
                            arrayList2.add(new z9g.e(strC, str, nVar != null ? nVar.f321982a : null));
                        }
                        ArrayList<zfi.b> arrayList3 = domain.f321957b;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        for (zfi.b bVar : arrayList3) {
                            zfi.m mVarA = bVar.a();
                            if (mVarA instanceof zfi.h) {
                                zfi.h hVar = (zfi.h) mVarA;
                                lVar = new z9g.a(bVar.c(), bVar.b(), new z9g.g(hVar.f321970a, hVar.f321971b));
                            } else if (mVarA instanceof zfi.k) {
                                String strC2 = bVar.c();
                                String strB = bVar.b();
                                zfi.k kVar = (zfi.k) mVarA;
                                String str2 = kVar.f321978a;
                                ArrayList<zfi.n> arrayList5 = kVar.f321979b;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, i22));
                                for (zfi.n nVar2 : arrayList5) {
                                    arrayList6.add(new z9g.j(nVar2.f321982a, nVar2.f321983b, nVar2.f321984c));
                                }
                                lVar = new z9g.b(strC2, strB, new z9g.h(str2, arrayList6));
                            } else if (mVarA instanceof zfi.s) {
                                String strC3 = bVar.c();
                                String strB2 = bVar.b();
                                zfi.s sVar = (zfi.s) mVarA;
                                String str3 = sVar.f321997a;
                                ArrayList<zfi.n> arrayList7 = sVar.f321998b;
                                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, i22));
                                for (zfi.n nVar3 : arrayList7) {
                                    arrayList8.add(new z9g.j(nVar3.f321982a, nVar3.f321983b, nVar3.f321984c));
                                }
                                lVar = new z9g.f(strC3, strB2, new z9g.m(str3, sVar.f321999c, arrayList8));
                            } else {
                                if (!(mVarA instanceof zfi.p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zfi.p pVar = (zfi.p) mVarA;
                                lVar = new z9g.l(bVar.c(), bVar.b(), new z9g.k(pVar.f321988a, pVar.f321989b, mo3.a.p(pVar.f321990c), mo3.a.p(pVar.d)));
                            }
                            arrayList4.add(lVar);
                            i22 = 10;
                        }
                        cVar.G(new z9g.d(arrayList2, arrayList4), "TRAVEL_HOTELS_AVAILABILITY_FILTERS", wim.z.d(kotlin.jvm.internal.o0.b(z9g.d.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        i iVar = this.f133312b;
                        TravelHotelsService travelHotelsService = iVar.f133330a;
                        String str4 = params.f133305a;
                        String str5 = params.f133306b;
                        HotelsSelectedDates hotelsSelectedDates = params.f133307c;
                        dag.c cVar2 = hotelsSelectedDates != null ? new dag.c(hotelsSelectedDates.f98129a.toString(), hotelsSelectedDates.f98130b.toString()) : null;
                        a aVar = params.d;
                        efm.d0<dag.e> smartSearch = travelHotelsService.getSmartSearch(new dag.d(str4, str5, cVar2, aVar != null ? aVar.a() : null));
                        f9g.h hVar2 = new f9g.h(new f2i.x(1, iVar.d, j9g.o.class, "mapToDomain", "mapToDomain(Lcom/revolut/feature/travel/hotels/impl/network/model/search/HotelsSmartSearchResultDto;)Lcom/revolut/feature/travel/hotels/impl/model/search/HotelsSmartSearchResultData;", 0, 9), 9);
                        smartSearch.getClass();
                        ufm.i iVar2 = new ufm.i(smartSearch, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        b params2 = (b) obj2;
                        o9g.a result = (o9g.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f133312b.f133332c.f(i.a(params2), result);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        i iVar3 = this.f133312b;
                        efm.d0<z9g.d> availabilityFilters = iVar3.f133330a.getAvailabilityFilters();
                        f9g.h hVar3 = new f9g.h(new f7l.c(iVar3, 9), 8);
                        availabilityFilters.getClass();
                        ufm.i iVar4 = new ufm.i(availabilityFilters, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, new e(this, 1), new Function2(this) { // from class: fag.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f133312b;

            {
                this.f133312b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object lVar;
                switch (i6) {
                    case 0:
                        zfi.c filters = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f133312b.f133332c.f("TRAVEL_HOTELS_AVAILABILITY_FILTERS", filters);
                        return Unit.f186387a;
                    case 1:
                        zfi.c domain = (zfi.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "filters");
                        ue0.c cVar = this.f133312b.f133331b;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ArrayList<zfi.d> arrayList = domain.f321956a;
                        int i22 = 10;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (zfi.d dVar : arrayList) {
                            String strC = dVar.f321960a.c();
                            String str = dVar.f321961b;
                            zfi.n nVar = dVar.f321962c;
                            arrayList2.add(new z9g.e(strC, str, nVar != null ? nVar.f321982a : null));
                        }
                        ArrayList<zfi.b> arrayList3 = domain.f321957b;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        for (zfi.b bVar : arrayList3) {
                            zfi.m mVarA = bVar.a();
                            if (mVarA instanceof zfi.h) {
                                zfi.h hVar = (zfi.h) mVarA;
                                lVar = new z9g.a(bVar.c(), bVar.b(), new z9g.g(hVar.f321970a, hVar.f321971b));
                            } else if (mVarA instanceof zfi.k) {
                                String strC2 = bVar.c();
                                String strB = bVar.b();
                                zfi.k kVar = (zfi.k) mVarA;
                                String str2 = kVar.f321978a;
                                ArrayList<zfi.n> arrayList5 = kVar.f321979b;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, i22));
                                for (zfi.n nVar2 : arrayList5) {
                                    arrayList6.add(new z9g.j(nVar2.f321982a, nVar2.f321983b, nVar2.f321984c));
                                }
                                lVar = new z9g.b(strC2, strB, new z9g.h(str2, arrayList6));
                            } else if (mVarA instanceof zfi.s) {
                                String strC3 = bVar.c();
                                String strB2 = bVar.b();
                                zfi.s sVar = (zfi.s) mVarA;
                                String str3 = sVar.f321997a;
                                ArrayList<zfi.n> arrayList7 = sVar.f321998b;
                                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, i22));
                                for (zfi.n nVar3 : arrayList7) {
                                    arrayList8.add(new z9g.j(nVar3.f321982a, nVar3.f321983b, nVar3.f321984c));
                                }
                                lVar = new z9g.f(strC3, strB2, new z9g.m(str3, sVar.f321999c, arrayList8));
                            } else {
                                if (!(mVarA instanceof zfi.p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zfi.p pVar = (zfi.p) mVarA;
                                lVar = new z9g.l(bVar.c(), bVar.b(), new z9g.k(pVar.f321988a, pVar.f321989b, mo3.a.p(pVar.f321990c), mo3.a.p(pVar.d)));
                            }
                            arrayList4.add(lVar);
                            i22 = 10;
                        }
                        cVar.G(new z9g.d(arrayList2, arrayList4), "TRAVEL_HOTELS_AVAILABILITY_FILTERS", wim.z.d(kotlin.jvm.internal.o0.b(z9g.d.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        i iVar = this.f133312b;
                        TravelHotelsService travelHotelsService = iVar.f133330a;
                        String str4 = params.f133305a;
                        String str5 = params.f133306b;
                        HotelsSelectedDates hotelsSelectedDates = params.f133307c;
                        dag.c cVar2 = hotelsSelectedDates != null ? new dag.c(hotelsSelectedDates.f98129a.toString(), hotelsSelectedDates.f98130b.toString()) : null;
                        a aVar = params.d;
                        efm.d0<dag.e> smartSearch = travelHotelsService.getSmartSearch(new dag.d(str4, str5, cVar2, aVar != null ? aVar.a() : null));
                        f9g.h hVar2 = new f9g.h(new f2i.x(1, iVar.d, j9g.o.class, "mapToDomain", "mapToDomain(Lcom/revolut/feature/travel/hotels/impl/network/model/search/HotelsSmartSearchResultDto;)Lcom/revolut/feature/travel/hotels/impl/model/search/HotelsSmartSearchResultData;", 0, 9), 9);
                        smartSearch.getClass();
                        ufm.i iVar2 = new ufm.i(smartSearch, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        b params2 = (b) obj2;
                        o9g.a result = (o9g.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f133312b.f133332c.f(i.a(params2), result);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        i iVar3 = this.f133312b;
                        efm.d0<z9g.d> availabilityFilters = iVar3.f133330a.getAvailabilityFilters();
                        f9g.h hVar3 = new f9g.h(new f7l.c(iVar3, 9), 8);
                        availabilityFilters.getClass();
                        ufm.i iVar4 = new ufm.i(availabilityFilters, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String a(b bVar) {
        String str = bVar.f133305a;
        String str2 = bVar.f133306b;
        HotelsSelectedDates hotelsSelectedDates = bVar.f133307c;
        LocalDate localDate = hotelsSelectedDates != null ? hotelsSelectedDates.f98129a : null;
        LocalDate localDate2 = hotelsSelectedDates != null ? hotelsSelectedDates.f98130b : null;
        a aVar = bVar.d;
        String strA = aVar != null ? aVar.a() : null;
        StringBuilder sbM = v0.a.m("TRAVEL_HOTELS_SMART_SEARCH-", str, "-", str2, "-");
        sbM.append(localDate);
        sbM.append("-");
        sbM.append(localDate2);
        sbM.append("-");
        sbM.append(strA);
        return sbM.toString();
    }
}
