package fag;

import androidx.room.util.DBUtil;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoffRequest;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoffSearchParameters;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.feature_travel_hotels_models.property.search.EmptyLocation;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();
    public final w4l.f A;
    public final w4l.f B;
    public final ReentrantReadWriteLock C;
    public final w4l.f D;
    public final w4l.f E;
    public final ReentrantReadWriteLock F;
    public final w4l.f G;
    public final w4l.f H;
    public final w4l.f I;
    public final w4l.f J;
    public final w4l.f K;
    public final w4l.f L;
    public final w4l.f M;
    public final w4l.f N;
    public final ihm.f O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsService f133374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f133375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8g.l f133376c;
    public final z8g.b d;
    public final z8g.r e;
    public final z8g.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z8g.d f133377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z8g.f f133378h;
    public final z8g.p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z8g.j f133379j;
    public final l80.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gag.d f133380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gag.d f133381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ue0.c f133382n;
    public final i90.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gag.c f133383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p8g.c f133384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.b f133385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ReentrantReadWriteLock f133386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.b f133387t;
    public final ReentrantReadWriteLock u;
    public final v60.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w4l.f f133388w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w4l.f f133389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w4l.f f133390y;
    public final w4l.f z;

    public t0(TravelHotelsService api2, ne0.j memoryCache, z8g.l locationDao, z8g.b bookingsDao, z8g.r hotelsRecentLocationSearchesDao, z8g.s hotelsRecentPropertySearchesDao, z8g.d campaignsDao, z8g.f hotelsDropoffDao, z8g.p hotelsPropertyTypeCategoryDao, z8g.j hotelsInventoryProviderDao, l80.e dateProvider, gag.d guestsReviewsPagedCache, gag.d propertiesAvailabilityPagedCache, ue0.c storage, i90.b uuidGenerator, gag.c hotelsPropertyBookingEventBus, q9g.e travelHotelsQueryBuilder, p8g.c hotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(locationDao, "locationDao");
        Intrinsics.checkNotNullParameter(bookingsDao, "bookingsDao");
        Intrinsics.checkNotNullParameter(hotelsRecentLocationSearchesDao, "hotelsRecentLocationSearchesDao");
        Intrinsics.checkNotNullParameter(hotelsRecentPropertySearchesDao, "hotelsRecentPropertySearchesDao");
        Intrinsics.checkNotNullParameter(campaignsDao, "campaignsDao");
        Intrinsics.checkNotNullParameter(hotelsDropoffDao, "hotelsDropoffDao");
        Intrinsics.checkNotNullParameter(hotelsPropertyTypeCategoryDao, "hotelsPropertyTypeCategoryDao");
        Intrinsics.checkNotNullParameter(hotelsInventoryProviderDao, "hotelsInventoryProviderDao");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(guestsReviewsPagedCache, "guestsReviewsPagedCache");
        Intrinsics.checkNotNullParameter(propertiesAvailabilityPagedCache, "propertiesAvailabilityPagedCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(hotelsPropertyBookingEventBus, "hotelsPropertyBookingEventBus");
        Intrinsics.checkNotNullParameter(travelHotelsQueryBuilder, "travelHotelsQueryBuilder");
        Intrinsics.checkNotNullParameter(hotelsFeatureInteractor, "hotelsFeatureInteractor");
        this.f133374a = api2;
        this.f133375b = memoryCache;
        this.f133376c = locationDao;
        this.d = bookingsDao;
        this.e = hotelsRecentLocationSearchesDao;
        this.f = hotelsRecentPropertySearchesDao;
        this.f133377g = campaignsDao;
        this.f133378h = hotelsDropoffDao;
        this.i = hotelsPropertyTypeCategoryDao;
        this.f133379j = hotelsInventoryProviderDao;
        this.k = dateProvider;
        this.f133380l = guestsReviewsPagedCache;
        this.f133381m = propertiesAvailabilityPagedCache;
        this.f133382n = storage;
        this.o = uuidGenerator;
        this.f133383p = hotelsPropertyBookingEventBus;
        this.f133384q = hotelsFeatureInteractor;
        this.f133385r = j6.a.h("create(...)");
        this.f133386s = new ReentrantReadWriteLock();
        this.f133387t = j6.a.h("create(...)");
        this.u = new ReentrantReadWriteLock();
        this.v = new v60.i();
        final int i = 0;
        final int i2 = 13;
        final int i3 = 11;
        this.f133388w = new w4l.f(new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 22), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 1), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 18;
        final int i6 = 28;
        final int i21 = 29;
        new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 13), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 15), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 1;
        final int i32 = 2;
        final int i33 = 3;
        this.f133389x = new w4l.f(new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 18), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 19), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 4;
        final int i59 = 5;
        final int i66 = 6;
        this.f133390y = new w4l.f(new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 20), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 21), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i74 = 7;
        final int i92 = 8;
        final int i96 = 9;
        this.z = new w4l.f(new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 23), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 24), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i96) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i99 = 10;
        final int i100 = 11;
        this.A = new w4l.f(new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i99) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 25), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i100) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i101 = 12;
        final int i102 = 14;
        final int i103 = 0;
        this.B = new w4l.f(new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i101) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 26), new Function2(this) { // from class: fag.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133369b;

            {
                this.f133369b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i102) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<bag.b>> inventoryProviders = this.f133369b.f133374a.getInventoryProviders();
                        m0 m0Var = new m0(new f7l.c(27), 0);
                        inventoryProviders.getClass();
                        ufm.i iVar = new ufm.i(inventoryProviders, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<u9g.a>> dropoffs = this.f133369b.f133374a.getDropoffs(num);
                        m0 m0Var2 = new m0(new f7l.c(28), 4);
                        dropoffs.getClass();
                        ufm.i iVar2 = new ufm.i(dropoffs, m0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        ((Integer) obj2).intValue();
                        List dropoffs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs2, "dropoffs");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS", dropoffs2);
                        break;
                    case 3:
                        ((Integer) obj2).getClass();
                        List dropoffs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(dropoffs3, "dropoffs");
                        z8g.f fVar = this.f133369b.f133378h;
                        List list = dropoffs3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(j9g.b.c((TravelHotelsDropoff) it8.next()));
                        }
                        DBUtil.performBlocking(fVar.f320095a, false, true, new z8g.e(fVar, arrayList, 0));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<u9g.a> dropoffById = this.f133369b.f133374a.getDropoffById(id10);
                        m0 m0Var3 = new m0(new o0(3), 6);
                        dropoffById.getClass();
                        ufm.i iVar3 = new ufm.i(dropoffById, m0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        String id11 = (String) obj2;
                        TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                        this.f133369b.f133375b.f("CACHE_KEY_DROPOFFS-" + id11, dropoff);
                        break;
                    case 6:
                        TravelHotelsDropoff dropoff2 = (TravelHotelsDropoff) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(dropoff2, "dropoff");
                        z8g.f fVar2 = this.f133369b.f133378h;
                        a9g.t tVarC = j9g.b.c(dropoff2);
                        fVar2.getClass();
                        DBUtil.performBlocking(fVar2.f320095a, false, true, new z1.c(fVar2, tVarC, 27));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        efm.d0<List<nfi.a>> campaigns = this.f133369b.f133374a.getCampaigns();
                        f9g.h hVar = new f9g.h(new f7l.c(21), 23);
                        campaigns.getClass();
                        ufm.i iVar4 = new ufm.i(campaigns, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        List campaigns2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns2, "campaigns");
                        this.f133369b.f133375b.f("CACHE_KEY_CAMPAIGNS", campaigns2);
                        break;
                    case 9:
                        List campaigns3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(campaigns3, "campaigns");
                        z8g.d dVar = this.f133369b.f133377g;
                        List<TravelHotelsCampaign> list2 = campaigns3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TravelHotelsCampaign travelHotelsCampaign : list2) {
                            Intrinsics.checkNotNullParameter(travelHotelsCampaign, "<this>");
                            String str = travelHotelsCampaign.f97892a;
                            String str2 = travelHotelsCampaign.f97893b;
                            String string = travelHotelsCampaign.f97894c.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsCampaign.d.toString("YYYY-MM-dd");
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new a9g.o(str, travelHotelsCampaign.f97895g, str2, string, string2, travelHotelsCampaign.e, travelHotelsCampaign.f));
                        }
                        DBUtil.performBlocking(dVar.f320090a, false, true, new z8g.c(dVar, arrayList2, 0));
                        break;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        efm.d0<List<s9g.a>> campaignLocations = this.f133369b.f133374a.getCampaignLocations(campaignId);
                        m0 m0Var4 = new m0(new f9g.l(campaignId, 5), 11);
                        campaignLocations.getClass();
                        ufm.i iVar5 = new ufm.i(campaignLocations, m0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        break;
                    case 11:
                        String campaignId2 = (String) obj2;
                        List campaignLocations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.checkNotNullParameter(campaignLocations2, "campaignLocations");
                        ehe.n.z("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId2, this.f133369b.f133375b, campaignLocations2);
                        break;
                    case 12:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        efm.d0<List<pfi.a>> popularLocations = this.f133369b.f133374a.getPopularLocations(zBooleanValue ? "2" : null);
                        f9g.h hVar2 = new f9g.h(new f7l.c(18), 20);
                        popularLocations.getClass();
                        ufm.i iVar6 = new ufm.i(popularLocations, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 13:
                        List inventoryProviders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(inventoryProviders2, "inventoryProviders");
                        this.f133369b.f133375b.f("CACHE_KEY_INVENTORY_PROVIDERS", inventoryProviders2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List locations = (List) obj3;
                        Intrinsics.checkNotNullParameter(locations, "locations");
                        this.f133369b.f133375b.f("CACHE_KEY_POPULAR_HOTELS_LOCATIONS", locations);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, 27), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        this.C = new ReentrantReadWriteLock();
        final int i104 = 1;
        final int i105 = 2;
        final int i106 = 3;
        this.D = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 0), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, 232);
        new w4l.f(new f5g.l(21), new f7l.c(this, 17), new f5g.l(this, 22), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i107 = 4;
        final int i108 = 5;
        this.E = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 2), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        this.F = new ReentrantReadWriteLock();
        final int i109 = 6;
        final int i110 = 7;
        this.G = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 3), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i111 = 8;
        final int i112 = 9;
        this.H = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 4), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i113 = 10;
        final int i114 = 12;
        this.I = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 5), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i115 = 13;
        final int i116 = 14;
        this.J = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 6), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i117 = 15;
        final int i118 = 16;
        this.K = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 7), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i119 = 17;
        final int i120 = 19;
        final int i121 = 20;
        this.L = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 8), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 9), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i122 = 21;
        final int i123 = 22;
        final int i124 = 23;
        new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 10), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 11), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i125 = 24;
        final int i126 = 25;
        this.M = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 12), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i127 = 26;
        final int i128 = 27;
        this.N = new w4l.f(new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new l0(this, 14), new Function2(this) { // from class: fag.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f133341b;

            {
                this.f133341b = this;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:167:0x073b  */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fag.k0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        this.O = v0.a.d("create(...)");
    }

    public static String g(cgi.c cVar) {
        return "CACHE_KEY_HOTELS_PROPERTY_ROOMS-" + cVar.f23989a + "-" + cVar.f23990b + "-" + cVar.f23991c + "-" + cVar.d;
    }

    public final dgi.c a() {
        ReentrantReadWriteLock.ReadLock lock = this.f133386s.readLock();
        lock.lock();
        try {
            dgi.c cVarB = (dgi.c) this.f133375b.get("CACHE_KEY_SEARCH_PARAMS");
            if (cVarB == null) {
                cVarB = b();
            }
            return cVarB;
        } finally {
            lock.unlock();
        }
    }

    public final dgi.c b() {
        l80.f fVar = (l80.f) this.k;
        LocalDate localDateE = fVar.e();
        LocalDate localDatePlusDays = fVar.e().plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        return new dgi.c(EmptyLocation.f98126b, localDateE, localDatePlusDays, zhm.u.c(new HotelsPropertyRoomOccupancy(2, zhm.f0.f322471a)), null, null, null, false, null, null, new zfi.a(0), null, null);
    }

    public final void c(pei.a event) {
        this.v.onNext(event);
        gag.c cVar = this.f133383p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        cVar.f142174a.k(event);
    }

    public final ihm.b d() {
        if (this.f133375b.contains("CACHE_KEY_SEARCH_PARAMS")) {
            dgi.c cVarA = a();
            LocalDate localDate = cVarA.f114672b;
            l80.f fVar = (l80.f) this.k;
            if (localDate.isBefore(fVar.e())) {
                LocalDate localDateE = fVar.e();
                LocalDate localDatePlusDays = fVar.e().plusDays(1L);
                Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
                e(dgi.c.a(cVarA, null, localDateE, localDatePlusDays, null, null, null, null, false, null, null, null, null, null, 4194297));
            }
        } else {
            e(b());
        }
        return this.f133385r;
    }

    /* JADX WARN: Finally extract failed */
    public final void e(dgi.c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f133386s;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f133375b.f("CACHE_KEY_SEARCH_PARAMS", cVar);
            Unit unit = Unit.f186387a;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            this.f133385r.onNext(cVar);
        } catch (Throwable th10) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th10;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final pfm.a f(TravelHotelsDropoffRequest dropoff) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
        Object obj2 = j9g.b.f172323a;
        Intrinsics.checkNotNullParameter(dropoff, "<this>");
        String strG = u1.g(dropoff.f97920a, j9g.b.f172323a);
        String str = dropoff.f97921b;
        String str2 = dropoff.f97922c;
        String str3 = dropoff.d;
        String str4 = dropoff.e;
        List list = dropoff.f;
        if (list != null) {
            List<TravelHotelsRoomsInformation> list2 = list;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (TravelHotelsRoomsInformation travelHotelsRoomsInformation : list2) {
                Intrinsics.checkNotNullParameter(travelHotelsRoomsInformation, "<this>");
                arrayList2.add(new u9g.c(travelHotelsRoomsInformation.f97938a, travelHotelsRoomsInformation.f97939b, travelHotelsRoomsInformation.f97940c, travelHotelsRoomsInformation.d));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        TravelHotelsDropoffSearchParameters travelHotelsDropoffSearchParameters = dropoff.f97923g;
        Intrinsics.checkNotNullParameter(travelHotelsDropoffSearchParameters, "<this>");
        String str5 = travelHotelsDropoffSearchParameters.f97924a;
        ffi.a aVar = travelHotelsDropoffSearchParameters.f97925b;
        String strName = aVar != null ? aVar.name() : null;
        String string = travelHotelsDropoffSearchParameters.f97926c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = travelHotelsDropoffSearchParameters.d.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String str6 = travelHotelsDropoffSearchParameters.e;
        List list3 = travelHotelsDropoffSearchParameters.f;
        String strK0 = list3 != null ? zhm.d0.k0(list3, j9g.b.f172324b, null, null, 0, null, 62) : null;
        List list4 = travelHotelsDropoffSearchParameters.f97927g;
        String strK02 = list4 != null ? zhm.d0.k0(list4, j9g.b.f172324b, null, null, 0, null, 62) : null;
        List list5 = travelHotelsDropoffSearchParameters.f97928h;
        pfm.a aVarE = te0.w.g0(this.f133374a.saveDropoff(new u9g.b(strG, str, str2, str3, str4, arrayList, new u9g.d(str5, strName, string, string2, str6, strK0, strK02, list5 != null ? zhm.d0.k0(list5, j9g.b.f172324b, null, null, 0, null, 62) : null, String.valueOf(travelHotelsDropoffSearchParameters.i), String.valueOf(travelHotelsDropoffSearchParameters.f97929j), String.valueOf(travelHotelsDropoffSearchParameters.k), String.valueOf(travelHotelsDropoffSearchParameters.f97930l), travelHotelsDropoffSearchParameters.f97931m, travelHotelsDropoffSearchParameters.f97932n, travelHotelsDropoffSearchParameters.o, travelHotelsDropoffSearchParameters.f97933p, travelHotelsDropoffSearchParameters.f97934q, travelHotelsDropoffSearchParameters.f97935r, travelHotelsDropoffSearchParameters.f97936s, String.valueOf(travelHotelsDropoffSearchParameters.f97937t))))).e(new pfm.h(new p0(this, 3), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
