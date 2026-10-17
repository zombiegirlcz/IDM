package f7l;

import a9g.x1;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_travel_hotels_models.cashback.CashbackDetails;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavoriteDestination;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavoriteProperty;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavorites;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import com.revolut.feature_travel_hotels_models.property.Address;
import com.revolut.feature_travel_hotels_models.property.Description;
import com.revolut.feature_travel_hotels_models.property.HotelsInventoryProviderLogos;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import fag.q;
import ip0.gu;
import ip0.pb0;
import j7l.m;
import j7l.n;
import j9g.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import r9g.l;
import t7h.s;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132648a;

    public /* synthetic */ c(int i) {
        this.f132648a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v44, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v19, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        fgi.a aVar;
        HotelsInventoryProviderLogos hotelsInventoryProviderLogos;
        fgi.c cVar;
        arrayList = 0;
        ?? arrayList2 = 0;
        switch (this.f132648a) {
            case 0:
                m it8 = (m) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                List<n> listC = it8.getPredefinedReasons();
                ArrayList arrayList3 = new ArrayList(w.t(listC, 10));
                for (n nVar : listC) {
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    arrayList3.add(new c7l.c(nVar.getCode(), nVar.getValue()));
                }
                boolean zA = it8.getCustomReasonAllowed();
                String strB = it8.getHint();
                if (strB == null) {
                    strB = "";
                }
                return new c7l.d(strB, arrayList3, zA);
            case 1:
                Intrinsics.checkNotNullParameter((s) obj2, "it");
                return Boolean.TRUE;
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return null;
            case 3:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return (List) loadingItems.invoke();
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC2 = u.c(new pb0("TRANSACTION_LOADING_ITEM_ID"));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                List listK = v.k(new gu("ACTIONS_LOADING_ITEM_ID", 0, 0, 30), new pb0("ACTIONS_LOADING_ITEM_ID"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return d0.E0(listK, listC2);
            case 6:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e = true;
                return Unit.f186387a;
            case 7:
                HotelsPropertyRoomOccupancy it9 = (HotelsPropertyRoomOccupancy) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return v04.b.N(it9);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                InputTextDelegate.Model model = new InputTextDelegate.Model("LOADING_1", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model model2 = new InputTextDelegate.Model("LOADING_2", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model model3 = new InputTextDelegate.Model("LOADING_3", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                return new fa8.h(v.k(model, model2, model3), false);
            case 9:
                z9g.d filters = (z9g.d) obj2;
                Intrinsics.checkNotNullParameter(filters, "filters");
                return p.a(filters);
            case 10:
                q it10 = (q) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f133362b;
            case 11:
                afi.a it11 = (afi.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it11);
            case 12:
                q it12 = (q) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.h hVar = od0.i.Companion;
                afi.a aVar2 = it12.f133362b;
                hVar.getClass();
                return od0.h.a(aVar2);
            case 13:
                sfi.a response = (sfi.a) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List properties = response.getProperties();
                ArrayList arrayList4 = new ArrayList(w.t(properties, 10));
                Iterator it13 = properties.iterator();
                while (it13.hasNext()) {
                    arrayList4.add(ue8.c.Z((sfi.b) it13.next()));
                }
                return arrayList4;
            case 14:
                w9g.a promotionsDto = (w9g.a) obj2;
                Intrinsics.checkNotNullParameter(promotionsDto, "promotionsDto");
                Intrinsics.checkNotNullParameter(promotionsDto, "<this>");
                List promotions = promotionsDto.getPromotions();
                ArrayList arrayList5 = new ArrayList(w.t(promotions, 10));
                Iterator it14 = promotions.iterator();
                while (it14.hasNext()) {
                    arrayList5.add(kfi.a.a((qfi.a) it14.next()));
                }
                return new tfi.b(arrayList5, promotionsDto.getIsThirdPartyPromoEnabled());
            case 15:
                List searches = (List) obj2;
                Intrinsics.checkNotNullParameter(searches, "searches");
                List<x1> list = searches;
                ArrayList arrayList6 = new ArrayList(w.t(list, 10));
                for (x1 x1Var : list) {
                    Intrinsics.checkNotNullParameter(x1Var, "<this>");
                    arrayList6.add(new ffi.d(x1Var.f2629a, x1Var.f2630b));
                }
                return arrayList6;
            case 16:
                List cashbackDetailsList = (List) obj2;
                Intrinsics.checkNotNullParameter(cashbackDetailsList, "cashbackDetailsList");
                List<t9g.a> list2 = cashbackDetailsList;
                ArrayList arrayList7 = new ArrayList(w.t(list2, 10));
                for (t9g.a aVar3 : list2) {
                    Object obj3 = j9g.a.f172322a;
                    Intrinsics.checkNotNullParameter(aVar3, "<this>");
                    arrayList7.add(new CashbackDetails((vei.a) u1.t(aVar3.getPricingPlanCode(), vei.a.STANDARD, j9g.a.f172322a), aVar3.getPercentage()));
                }
                return arrayList7;
            case 17:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 18:
                List list3 = (List) obj2;
                Intrinsics.checkNotNullParameter(list3, "list");
                List list4 = list3;
                ArrayList arrayList8 = new ArrayList(w.t(list4, 10));
                Iterator it15 = list4.iterator();
                while (it15.hasNext()) {
                    arrayList8.add(v04.b.u((pfi.a) it15.next()));
                }
                return arrayList8;
            case 19:
                l status = (l) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                return j9g.g.a(status);
            case 20:
                List propertyDtoList = (List) obj2;
                Intrinsics.checkNotNullParameter(propertyDtoList, "propertyDtoList");
                List<x9g.e> list5 = propertyDtoList;
                ArrayList arrayList9 = new ArrayList(w.t(list5, 10));
                for (x9g.e eVar : list5) {
                    Object obj4 = j9g.i.f172333a;
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    String strC = eVar.getTitle();
                    agi.a aVar4 = (agi.a) u1.u(eVar.getIcon(), j9g.i.f172333a);
                    ofi.h hVarA = eVar.getDescriptionDto();
                    Object obj5 = lfi.a.f194929a;
                    Intrinsics.checkNotNullParameter(hVarA, "<this>");
                    arrayList9.add(new agi.b(strC, aVar4, new Description(hVarA.getPlainText())));
                }
                return arrayList9;
            case 21:
                List list6 = (List) obj2;
                Intrinsics.checkNotNullParameter(list6, "list");
                List list7 = list6;
                ArrayList arrayList10 = new ArrayList(w.t(list7, 10));
                Iterator it16 = list7.iterator();
                while (it16.hasNext()) {
                    arrayList10.add(c8g.a.I((nfi.a) it16.next()));
                }
                return arrayList10;
            case 22:
                r9g.i details = (r9g.i) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                return j9g.e.d(details);
            case 23:
                rfi.n propertyDetailsDto = (rfi.n) obj2;
                Intrinsics.checkNotNullParameter(propertyDetailsDto, "propertyDetailsDto");
                return lfi.a.d(propertyDetailsDto, null);
            case 24:
                List propertyTypeCategories = (List) obj2;
                Intrinsics.checkNotNullParameter(propertyTypeCategories, "propertyTypeCategories");
                List<aag.a> list8 = propertyTypeCategories;
                ArrayList arrayList11 = new ArrayList(w.t(list8, 10));
                for (aag.a aVar5 : list8) {
                    Object obj6 = j9g.l.f172338a;
                    Intrinsics.checkNotNullParameter(aVar5, "<this>");
                    arrayList11.add(new egi.b((egi.a) u1.u(aVar5.getId(), j9g.l.f172338a), aVar5.getName(), aVar5.getDescription(), aVar5.getImage(), aVar5.getDisplayOrderRank()));
                }
                return arrayList11;
            case 25:
                List facilityDtoList = (List) obj2;
                Intrinsics.checkNotNullParameter(facilityDtoList, "facilityDtoList");
                List list9 = facilityDtoList;
                ArrayList arrayList12 = new ArrayList(w.t(list9, 10));
                Iterator it17 = list9.iterator();
                while (it17.hasNext()) {
                    arrayList12.add(j9g.d.a((ofi.e) it17.next()));
                }
                return arrayList12;
            case 26:
                y9g.b hotelsAvailabilityResponseDto = (y9g.b) obj2;
                Intrinsics.checkNotNullParameter(hotelsAvailabilityResponseDto, "hotelsAvailabilityResponseDto");
                y9g.a aVarA = hotelsAvailabilityResponseDto.getPaginationTokens();
                String nextToken = aVarA != null ? aVarA.getNextToken() : null;
                qfi.a aVarB = hotelsAvailabilityResponseDto.getPromotion();
                TravelHotelsPromotion travelHotelsPromotionA = aVarB != null ? kfi.a.a(aVarB) : null;
                List listC3 = hotelsAvailabilityResponseDto.getProperties();
                if (listC3 != null) {
                    List list10 = listC3;
                    arrayList = new ArrayList(w.t(list10, 10));
                    Iterator it18 = list10.iterator();
                    while (it18.hasNext()) {
                        arrayList.add(lfi.a.d((rfi.n) it18.next(), travelHotelsPromotionA));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                return new eag.a(nextToken, arrayList);
            case 27:
                List inventoryProviders = (List) obj2;
                Intrinsics.checkNotNullParameter(inventoryProviders, "inventoryProviders");
                List<bag.b> list11 = inventoryProviders;
                ArrayList arrayList13 = new ArrayList(w.t(list11, 10));
                for (bag.b bVar : list11) {
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    String strD = bVar.getId();
                    fgi.a[] aVarArrValues = fgi.a.values();
                    int length = aVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            aVar = aVarArrValues[i];
                            if (!a0.z(aVar.name(), strD, true)) {
                                i++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        aVar = fgi.a.UNKNOWN;
                    }
                    fgi.a aVar6 = aVar;
                    String strF = bVar.getName();
                    Address addressA = lfi.a.a(bVar.getAddress());
                    String strC2 = bVar.getEmail();
                    String strG = bVar.getPhone();
                    String strH = bVar.getTermsAndConditionsUrl();
                    rfi.c cVarE = bVar.getLogos();
                    if (cVarE != null) {
                        Intrinsics.checkNotNullParameter(cVarE, "<this>");
                        hotelsInventoryProviderLogos = new HotelsInventoryProviderLogos(cVarE.getColour(), cVarE.getLight());
                    } else {
                        hotelsInventoryProviderLogos = null;
                    }
                    bag.a aVarB2 = bVar.getDisclaimers();
                    if (aVarB2 != null) {
                        Intrinsics.checkNotNullParameter(aVarB2, "<this>");
                        cVar = new fgi.c(aVarB2.getPrivateHost(), aVarB2.getProfessionalHost());
                    } else {
                        cVar = null;
                    }
                    arrayList13.add(new fgi.b(aVar6, strF, hotelsInventoryProviderLogos, addressA, strC2, strG, strH, cVar));
                }
                return arrayList13;
            case 28:
                List list12 = (List) obj2;
                Intrinsics.checkNotNullParameter(list12, "list");
                List list13 = list12;
                ArrayList arrayList14 = new ArrayList(w.t(list13, 10));
                Iterator it19 = list13.iterator();
                while (it19.hasNext()) {
                    arrayList14.add(j9g.b.b((u9g.a) it19.next()));
                }
                return arrayList14;
            default:
                x9g.c favoritesListDto = (x9g.c) obj2;
                Intrinsics.checkNotNullParameter(favoritesListDto, "favoritesListDto");
                Intrinsics.checkNotNullParameter(favoritesListDto, "<this>");
                List<rfi.n> listB = favoritesListDto.getProperties();
                ArrayList arrayList15 = new ArrayList(w.t(listB, 10));
                for (rfi.n nVar2 : listB) {
                    arrayList15.add(new HotelsFavoriteProperty(lfi.a.d(nVar2, null), nVar2.getDestinationId()));
                }
                List listA = favoritesListDto.getDestinations();
                if (listA != null) {
                    if (listA.isEmpty()) {
                        listA = null;
                    }
                    if (listA != null) {
                        List<x9g.a> list14 = listA;
                        arrayList2 = new ArrayList(w.t(list14, 10));
                        for (x9g.a aVar7 : list14) {
                            Intrinsics.checkNotNullParameter(aVar7, "<this>");
                            arrayList2.add(new HotelsFavoriteDestination(aVar7.getId(), aVar7.getName(), aVar7.getImageUri()));
                        }
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = f0.f322471a;
                }
                return new HotelsFavorites(arrayList15, arrayList2);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f132648a = i;
    }
}
