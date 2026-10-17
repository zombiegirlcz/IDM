package txf;

import android.os.Parcelable;
import androidx.room.util.DBUtil;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.common.impl.network.TravelService;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.feature_travel_hotels_models.location.Country;
import com.revolut.feature_travel_hotels_models.property.Address;
import com.revolut.feature_travel_hotels_models.property.Distance;
import com.revolut.feature_travel_hotels_models.property.HotelsInventoryProviderLogos;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.HotelsPositionToSearchLocationCentre;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyAdditionalInformation;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyAttributes;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyAvailability;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyAvailabilityDates;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCancellationOptions;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckInDetails;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckInInfo;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckOutDetails;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyContactDetails;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyFeesDescription;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReview;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewContent;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewSource;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestsReviews;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyHostDetails;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyLocation;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyPaymentOptions;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyRatings;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyRelativeLocation;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertySpace;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyType;
import com.revolut.feature_travel_hotels_models.property.Image;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.PointsRewardRate;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.feature_travel_hotels_models.property.PropertyDescription;
import com.revolut.feature_travel_hotels_models.property.Window;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import yei.t;
import yei.u;
import yei.v;
import yei.x;
import yei.y;
import yei.z;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelService f275415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f275416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wxf.j f275417c;
    public final w4l.f d;

    public s(TravelService travelService, ne0.d memoryCache, wxf.j tripDao) {
        Intrinsics.checkNotNullParameter(travelService, "travelService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(tripDao, "tripDao");
        this.f275415a = travelService;
        this.f275416b = memoryCache;
        this.f275417c = tripDao;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: txf.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f275412b;

            {
                this.f275412b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51) {
                /*
                    Method dump skipped, instruction units count: 1982
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: txf.p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        Function1 function1 = new Function1(this) { // from class: txf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f275414b;

            {
                this.f275414b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v6 */
            /* JADX WARN: Type inference failed for: r12v7 */
            /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Enum] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r26v3, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r27v0 */
            /* JADX WARN: Type inference failed for: r27v1, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyCancellationOptions] */
            /* JADX WARN: Type inference failed for: r27v2 */
            /* JADX WARN: Type inference failed for: r29v0 */
            /* JADX WARN: Type inference failed for: r29v1, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r29v2 */
            /* JADX WARN: Type inference failed for: r2v30, types: [zhm.f0] */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r30v0 */
            /* JADX WARN: Type inference failed for: r30v1, types: [com.revolut.feature_travel_hotels_models.property.HotelsPositionToSearchLocationCentre] */
            /* JADX WARN: Type inference failed for: r30v2 */
            /* JADX WARN: Type inference failed for: r31v2, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckInDetails] */
            /* JADX WARN: Type inference failed for: r32v2 */
            /* JADX WARN: Type inference failed for: r32v3, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckOutDetails] */
            /* JADX WARN: Type inference failed for: r32v4 */
            /* JADX WARN: Type inference failed for: r33v2 */
            /* JADX WARN: Type inference failed for: r33v3, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyContactDetails] */
            /* JADX WARN: Type inference failed for: r33v4 */
            /* JADX WARN: Type inference failed for: r34v1 */
            /* JADX WARN: Type inference failed for: r34v2, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyAttributes] */
            /* JADX WARN: Type inference failed for: r34v3 */
            /* JADX WARN: Type inference failed for: r35v2 */
            /* JADX WARN: Type inference failed for: r35v3, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyAdditionalInformation] */
            /* JADX WARN: Type inference failed for: r35v4 */
            /* JADX WARN: Type inference failed for: r36v1 */
            /* JADX WARN: Type inference failed for: r36v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r36v3 */
            /* JADX WARN: Type inference failed for: r37v0 */
            /* JADX WARN: Type inference failed for: r37v1, types: [com.revolut.feature_travel_hotels_models.property.Distance] */
            /* JADX WARN: Type inference failed for: r37v3 */
            /* JADX WARN: Type inference failed for: r37v4, types: [fgi.a] */
            /* JADX WARN: Type inference failed for: r37v5 */
            /* JADX WARN: Type inference failed for: r37v7 */
            /* JADX WARN: Type inference failed for: r38v1 */
            /* JADX WARN: Type inference failed for: r38v2, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyHostDetails] */
            /* JADX WARN: Type inference failed for: r38v8 */
            /* JADX WARN: Type inference failed for: r3v11, types: [fgi.a[]] */
            /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r42v5 */
            /* JADX WARN: Type inference failed for: r42v6, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r42v7 */
            /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                LocalDate localDate;
                List list;
                ArrayList arrayList;
                HotelsPropertyType hotelsPropertyType;
                ArrayList arrayList2;
                yei.m mVar;
                String str2;
                LocalDate localDate2;
                HotelsPropertyRatings hotelsPropertyRatings;
                HotelsPropertyAvailability hotelsPropertyAvailability;
                HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions;
                Pricing pricing;
                HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions2;
                ?? hotelsPropertyCancellationOptions;
                ?? r292;
                ?? hotelsPositionToSearchLocationCentre;
                Parcelable hotelsPropertyCheckInDetails;
                ?? hotelsPropertyCheckOutDetails;
                ?? hotelsPropertyContactDetails;
                ?? hotelsPropertyAttributes;
                ?? hotelsPropertyAdditionalInformation;
                ?? r362;
                ?? r372;
                ?? hotelsPropertyHostDetails;
                ArrayList arrayList3;
                ?? r122;
                HotelsPropertyCashback hotelsPropertyCashback;
                ArrayList arrayList4;
                PointsRewardRate pointsRewardRate;
                ?? r42;
                PointsRewardRate pointsRewardRate2;
                HotelsPropertyAvailabilityDates hotelsPropertyAvailabilityDates;
                List listH;
                ArrayList arrayList5;
                String str3;
                LocalDate localDate3;
                HotelsInventoryProviderLogos hotelsInventoryProviderLogos;
                HotelsPropertyGuestReviewContent hotelsPropertyGuestReviewContent;
                ufi.g gVar;
                ?? arrayList6;
                Iterator it8;
                Iterator it9;
                ufi.i iVar;
                Iterator it10;
                ffi.a aVar;
                jxf.c cVar;
                int i2 = i;
                s sVar = this.f275414b;
                switch (i2) {
                    case 0:
                        o it11 = (o) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (jxf.b) sVar.f275416b.get("TRAVEL_NEXT_TRIP_WITH_RECOMMENDATIONS_CACHE_KEY");
                    default:
                        o params = (o) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        wxf.j jVar = sVar.f275417c;
                        sxf.d dVar = (sxf.d) d0.d0((List) DBUtil.performBlocking(jVar.f300946a, true, true, new wwa.a(jVar, params.f275409a.f306286a, 7)));
                        if (dVar == null) {
                            return null;
                        }
                        sxf.b bVar = dVar.f266483a;
                        Intrinsics.checkNotNullParameter(dVar, "<this>");
                        String str4 = bVar.f266479a;
                        LocalDate localDate4 = bVar.f266481c;
                        LocalDate localDate5 = bVar.d;
                        Integer num = bVar.e;
                        List list2 = dVar.f266484b;
                        ArrayList arrayList7 = new ArrayList(w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            sxf.a aVar2 = (sxf.a) it12.next();
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            String str5 = aVar2.f266476a;
                            String str6 = aVar2.f266478c;
                            String str7 = aVar2.d;
                            ffi.a[] aVarArrValues = ffi.a.values();
                            int length = aVarArrValues.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    aVar = aVarArrValues[i3];
                                    it10 = it12;
                                    if (!a0.z(aVar.name(), str7, true)) {
                                        i3++;
                                        it12 = it10;
                                    }
                                } else {
                                    it10 = it12;
                                    aVar = null;
                                }
                            }
                            if (aVar == null) {
                                aVar = ffi.a.UNKNOWN;
                            }
                            ffi.a aVar3 = aVar;
                            String str8 = aVar2.e;
                            jxf.c[] cVarArrValues = jxf.c.values();
                            int length2 = cVarArrValues.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length2) {
                                    cVar = cVarArrValues[i5];
                                    jxf.c[] cVarArr = cVarArrValues;
                                    if (!a0.z(cVar.name(), str8, true)) {
                                        i5++;
                                        cVarArrValues = cVarArr;
                                    }
                                } else {
                                    cVar = null;
                                }
                            }
                            if (cVar == null) {
                                cVar = jxf.c.UNKNOWN;
                            }
                            arrayList7.add(new jxf.d(str5, str6, aVar3, cVar));
                            it12 = it10;
                        }
                        sxf.c cVar2 = bVar.f;
                        Intrinsics.checkNotNullParameter(cVar2, "<this>");
                        List properties = cVar2.getProperties();
                        if (properties != null) {
                            List list3 = properties;
                            ArrayList arrayList8 = new ArrayList(w.t(list3, 10));
                            Iterator it13 = list3.iterator();
                            while (it13.hasNext()) {
                                yei.m mVar2 = (yei.m) it13.next();
                                Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                String strM = mVar2.m();
                                String strQ = mVar2.q();
                                List listI = mVar2.i();
                                if (listI != null) {
                                    List list4 = listI;
                                    ArrayList arrayList9 = new ArrayList(w.t(list4, 10));
                                    Iterator it14 = list4.iterator();
                                    while (it14.hasNext()) {
                                        xei.l lVar = (xei.l) it14.next();
                                        Intrinsics.checkNotNullParameter(lVar, "<this>");
                                        String category = lVar.getCategory();
                                        ufi.i[] iVarArrValues = ufi.i.values();
                                        int length3 = iVarArrValues.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < length3) {
                                                iVar = iVarArrValues[i6];
                                                it8 = it14;
                                                it9 = it13;
                                                if (!a0.z(iVar.name(), category, true)) {
                                                    i6++;
                                                    it14 = it8;
                                                    it13 = it9;
                                                }
                                            } else {
                                                it8 = it14;
                                                it9 = it13;
                                                iVar = null;
                                            }
                                        }
                                        if (iVar == null) {
                                            iVar = ufi.i.UNKNOWN;
                                        }
                                        arrayList9.add(new PropertyDescription(iVar, lVar.getPlainText()));
                                        it14 = it8;
                                        it13 = it9;
                                    }
                                    arrayList = arrayList9;
                                } else {
                                    arrayList = null;
                                }
                                Iterator it15 = it13;
                                z zVarU = mVar2.u();
                                if (zVarU != null) {
                                    Intrinsics.checkNotNullParameter(zVarU, "<this>");
                                    String id10 = zVarU.getId();
                                    String name = zVarU.getName();
                                    String type = zVarU.getType();
                                    if (type == null || (gVar = (ufi.g) u1.v(type, lfi.a.f194931c)) == null) {
                                        gVar = ufi.g.UNKNOWN;
                                    }
                                    ufi.g gVar2 = gVar;
                                    Integer totalProperties = zVarU.getTotalProperties();
                                    String imageUrl = zVarU.getImageUrl();
                                    List categories = zVarU.getCategories();
                                    if (categories != null) {
                                        arrayList6 = new ArrayList();
                                        Iterator it16 = categories.iterator();
                                        while (it16.hasNext()) {
                                            egi.a aVar4 = (egi.a) u1.v((String) it16.next(), lfi.a.i);
                                            if (aVar4 != null) {
                                                arrayList6.add(aVar4);
                                            }
                                        }
                                    } else {
                                        arrayList6 = f0.f322471a;
                                    }
                                    hotelsPropertyType = new HotelsPropertyType(id10, name, gVar2, totalProperties, imageUrl, arrayList6);
                                } else {
                                    hotelsPropertyType = null;
                                }
                                List<xei.e> listN = mVar2.n();
                                ArrayList arrayList10 = new ArrayList(w.t(listN, 10));
                                for (xei.e eVar : listN) {
                                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                                    arrayList10.add(new Image(eVar.b(), (ufi.e) u1.u(eVar.c(), lfi.a.f194929a), eVar.d(), eVar.a()));
                                }
                                Integer numW = mVar2.w();
                                yei.w wVarX = mVar2.x();
                                if (wVarX != null) {
                                    Intrinsics.checkNotNullParameter(wVarX, "<this>");
                                    Double stars = wVarX.getStars();
                                    yei.s guestReviews = wVarX.getGuestReviews();
                                    Intrinsics.checkNotNullParameter(guestReviews, "<this>");
                                    int count = guestReviews.getCount();
                                    List scores = guestReviews.getScores();
                                    ArrayList arrayList11 = new ArrayList(w.t(scores, 10));
                                    Iterator it17 = scores.iterator();
                                    while (it17.hasNext()) {
                                        arrayList11.add(v04.b.x((yei.q) it17.next()));
                                    }
                                    List reviews = guestReviews.getReviews();
                                    if (reviews != null) {
                                        List list5 = reviews;
                                        arrayList2 = arrayList10;
                                        arrayList5 = new ArrayList(w.t(list5, 10));
                                        Iterator it18 = list5.iterator();
                                        while (it18.hasNext()) {
                                            yei.p pVar = (yei.p) it18.next();
                                            Intrinsics.checkNotNullParameter(pVar, "<this>");
                                            int rank = pVar.getRank();
                                            long dateTimeMillis = pVar.getDateTimeMillis();
                                            List scores2 = pVar.getScores();
                                            Iterator it19 = it18;
                                            yei.m mVar3 = mVar2;
                                            ArrayList arrayList12 = new ArrayList(w.t(scores2, 10));
                                            Iterator it20 = scores2.iterator();
                                            while (it20.hasNext()) {
                                                arrayList12.add(v04.b.x((yei.q) it20.next()));
                                            }
                                            String displayName = pVar.getDisplayName();
                                            yei.r source = pVar.getSource();
                                            Intrinsics.checkNotNullParameter(source, "<this>");
                                            ufi.d dVar2 = (ufi.d) u1.u(source.getType(), lfi.a.f194932g);
                                            String name2 = source.getName();
                                            yei.b logos = source.getLogos();
                                            if (logos != null) {
                                                Intrinsics.checkNotNullParameter(logos, "<this>");
                                                str3 = str4;
                                                localDate3 = localDate4;
                                                hotelsInventoryProviderLogos = new HotelsInventoryProviderLogos(logos.getColour(), logos.getLight());
                                            } else {
                                                str3 = str4;
                                                localDate3 = localDate4;
                                                hotelsInventoryProviderLogos = null;
                                            }
                                            HotelsPropertyGuestReviewSource hotelsPropertyGuestReviewSource = new HotelsPropertyGuestReviewSource(dVar2, name2, hotelsInventoryProviderLogos);
                                            yei.o content = pVar.getContent();
                                            if (content != null) {
                                                Intrinsics.checkNotNullParameter(content, "<this>");
                                                hotelsPropertyGuestReviewContent = new HotelsPropertyGuestReviewContent(content.getPlainText());
                                            } else {
                                                hotelsPropertyGuestReviewContent = null;
                                            }
                                            arrayList5.add(new HotelsPropertyGuestReview(rank, dateTimeMillis, arrayList12, displayName, hotelsPropertyGuestReviewSource, hotelsPropertyGuestReviewContent));
                                            it18 = it19;
                                            mVar2 = mVar3;
                                            str4 = str3;
                                            localDate4 = localDate3;
                                        }
                                    } else {
                                        arrayList2 = arrayList10;
                                        arrayList5 = null;
                                    }
                                    mVar = mVar2;
                                    str2 = str4;
                                    localDate2 = localDate4;
                                    hotelsPropertyRatings = new HotelsPropertyRatings(stars, new HotelsPropertyGuestsReviews(arrayList11, count, arrayList5));
                                } else {
                                    arrayList2 = arrayList10;
                                    mVar = mVar2;
                                    str2 = str4;
                                    localDate2 = localDate4;
                                    hotelsPropertyRatings = null;
                                }
                                yei.g gVarC = mVar.c();
                                if (gVarC != null) {
                                    Intrinsics.checkNotNullParameter(gVarC, "<this>");
                                    boolean isAvailable = gVarC.getIsAvailable();
                                    yei.f dates = gVarC.getDates();
                                    if (dates != null) {
                                        Intrinsics.checkNotNullParameter(dates, "<this>");
                                        Instant instantOfEpochMilli = Instant.ofEpochMilli(dates.getCheckInTimeMillis());
                                        ZoneOffset zoneOffset = ZoneOffset.UTC;
                                        LocalDate localDate6 = instantOfEpochMilli.atZone(zoneOffset).toLocalDate();
                                        Intrinsics.checkNotNullExpressionValue(localDate6, "toLocalDate(...)");
                                        LocalDate localDate7 = Instant.ofEpochMilli(dates.getCheckOutTimeMillis()).atZone(zoneOffset).toLocalDate();
                                        Intrinsics.checkNotNullExpressionValue(localDate7, "toLocalDate(...)");
                                        hotelsPropertyAvailabilityDates = new HotelsPropertyAvailabilityDates(localDate6, localDate7);
                                    } else {
                                        hotelsPropertyAvailabilityDates = null;
                                    }
                                    Integer nights = gVarC.getNights();
                                    String occupancy = gVarC.getOccupancy();
                                    if (occupancy == null || (listH = l9.l.H(occupancy)) == null) {
                                        listH = f0.f322471a;
                                    }
                                    hotelsPropertyAvailability = new HotelsPropertyAvailability(isAvailable, hotelsPropertyAvailabilityDates, nights, listH);
                                } else {
                                    hotelsPropertyAvailability = null;
                                }
                                xei.k kVarT = mVar.t();
                                if (kVarT != null) {
                                    Intrinsics.checkNotNullParameter(kVarT, "<this>");
                                    cgi.e eVar2 = (cgi.e) u1.u(kVarT.i(), lfi.a.f194934j);
                                    Boolean boolJ = kVarT.j();
                                    OverallPrice overallPriceY = v04.b.y(kVarT.c());
                                    xei.g gVarG = kVarT.g();
                                    OverallPrice overallPriceY2 = gVarG != null ? v04.b.y(gVarG) : null;
                                    xei.a aVarA = kVarT.a();
                                    if (aVarA != null) {
                                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                                        hotelsPropertyCashback = new HotelsPropertyCashback(aVarA.getPercentage(), boh.f.u(aVarA.getAmount()));
                                    } else {
                                        hotelsPropertyCashback = null;
                                    }
                                    List listD = kVarT.d();
                                    if (listD != null) {
                                        List list6 = listD;
                                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                                        Iterator it21 = list6.iterator();
                                        while (it21.hasNext()) {
                                            arrayList13.add(v04.b.w((xei.h) it21.next()));
                                        }
                                        arrayList4 = arrayList13;
                                    } else {
                                        arrayList4 = null;
                                    }
                                    String strE = kVarT.e();
                                    RevPoints revPointsD = strE != null ? qvb.a.d(strE) : null;
                                    xei.h hVarH = kVarT.h();
                                    HotelsPointsRedeemOption hotelsPointsRedeemOptionW = hVarH != null ? v04.b.w(hVarH) : null;
                                    xei.i iVarF = kVarT.f();
                                    if (iVarF != null) {
                                        Intrinsics.checkNotNullParameter(iVarF, "<this>");
                                        try {
                                            RevPoints revPointsD2 = qvb.a.d(iVarF.c());
                                            dj0.d dVarV = hx7.a.v(iVarF.b());
                                            String strA = iVarF.a();
                                            pointsRewardRate2 = new PointsRewardRate(revPointsD2, dVarV, strA != null ? Double.valueOf(Double.parseDouble(strA)) : null);
                                            hotelsPropertyPaymentOptions = null;
                                        } catch (Throwable th10) {
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            hotelsPropertyPaymentOptions = null;
                                            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                                            pointsRewardRate2 = null;
                                        }
                                        pointsRewardRate = pointsRewardRate2;
                                    } else {
                                        hotelsPropertyPaymentOptions = null;
                                        pointsRewardRate = null;
                                    }
                                    List listB = kVarT.b();
                                    if (listB != null) {
                                        List list7 = listB;
                                        ArrayList arrayList14 = new ArrayList(w.t(list7, 10));
                                        Iterator it22 = list7.iterator();
                                        while (it22.hasNext()) {
                                            arrayList14.add(pu7.a.L((String) it22.next()));
                                        }
                                        r42 = arrayList14;
                                    } else {
                                        r42 = hotelsPropertyPaymentOptions;
                                    }
                                    pricing = new Pricing(eVar2, boolJ, overallPriceY, overallPriceY2, hotelsPropertyCashback, arrayList4, revPointsD, hotelsPointsRedeemOptionW, pointsRewardRate, r42);
                                } else {
                                    hotelsPropertyPaymentOptions = null;
                                    pricing = null;
                                }
                                v vVarR = mVar.r();
                                if (vVarR != null) {
                                    Intrinsics.checkNotNullParameter(vVarR, "<this>");
                                    hotelsPropertyPaymentOptions2 = new HotelsPropertyPaymentOptions(vVarR.getPayNow(), vVarR.getPayLater());
                                } else {
                                    hotelsPropertyPaymentOptions2 = hotelsPropertyPaymentOptions;
                                }
                                yei.h hVarE = mVar.e();
                                if (hVarE != null) {
                                    Intrinsics.checkNotNullParameter(hVarE, "<this>");
                                    hotelsPropertyCancellationOptions = new HotelsPropertyCancellationOptions(hVarE.getFreeCancellation());
                                } else {
                                    hotelsPropertyCancellationOptions = hotelsPropertyPaymentOptions;
                                }
                                u uVarO = mVar.o();
                                Intrinsics.checkNotNullParameter(uVarO, "<this>");
                                xei.b bVarB = uVarO.b();
                                Intrinsics.checkNotNullParameter(bVarB, "<this>");
                                double dB = bVarB.b();
                                double dC = bVarB.c();
                                xei.d dVarA = bVarB.a();
                                Coordinates coordinates = new Coordinates(dB, dC, dVarA != null ? v04.b.v(dVarA) : hotelsPropertyPaymentOptions);
                                xei.c cVarC = uVarO.c();
                                Intrinsics.checkNotNullParameter(cVarC, "<this>");
                                Country country = new Country(cVarC.getCode(), cVarC.getName());
                                yei.a aVarA2 = uVarO.a();
                                Intrinsics.checkNotNullParameter(aVarA2, "<this>");
                                HotelsPropertyLocation hotelsPropertyLocation = new HotelsPropertyLocation(coordinates, country, new Address(aVarA2.f(), aVarA2.g(), aVarA2.e(), aVarA2.a(), aVarA2.b(), aVarA2.d(), aVarA2.c()));
                                List listY = mVar.y();
                                if (listY != null) {
                                    List<x> list8 = listY;
                                    ArrayList arrayList15 = new ArrayList(w.t(list8, 10));
                                    for (x xVar : list8) {
                                        Intrinsics.checkNotNullParameter(xVar, "<this>");
                                        arrayList15.add(new HotelsPropertyRelativeLocation((ufi.j) u1.u(xVar.getType(), lfi.a.f), v04.b.v(xVar.getDistance())));
                                    }
                                    r292 = arrayList15;
                                } else {
                                    r292 = hotelsPropertyPaymentOptions;
                                }
                                yei.c cVarS = mVar.s();
                                if (cVarS != null) {
                                    Intrinsics.checkNotNullParameter(cVarS, "<this>");
                                    hotelsPositionToSearchLocationCentre = new HotelsPositionToSearchLocationCentre(v04.b.v(cVarS.a()), cVarS.b(), cVarS.c());
                                } else {
                                    hotelsPositionToSearchLocationCentre = hotelsPropertyPaymentOptions;
                                }
                                yei.i iVarF2 = mVar.f();
                                if (iVarF2 != null) {
                                    Intrinsics.checkNotNullParameter(iVarF2, "<this>");
                                    Window windowZ = v04.b.z(iVarF2.getWindow());
                                    yei.j information = iVarF2.getInformation();
                                    Intrinsics.checkNotNullParameter(information, "<this>");
                                    hotelsPropertyCheckInDetails = new HotelsPropertyCheckInDetails(windowZ, iVarF2.getMinimumAge(), new HotelsPropertyCheckInInfo(information.getGeneral(), information.getAdditional()));
                                } else {
                                    hotelsPropertyCheckInDetails = hotelsPropertyPaymentOptions;
                                }
                                yei.k kVarG = mVar.g();
                                if (kVarG != null) {
                                    Intrinsics.checkNotNullParameter(kVarG, "<this>");
                                    hotelsPropertyCheckOutDetails = new HotelsPropertyCheckOutDetails(v04.b.z(kVarG.getWindow()));
                                } else {
                                    hotelsPropertyCheckOutDetails = hotelsPropertyPaymentOptions;
                                }
                                yei.l lVarH = mVar.h();
                                if (lVarH != null) {
                                    Intrinsics.checkNotNullParameter(lVarH, "<this>");
                                    hotelsPropertyContactDetails = new HotelsPropertyContactDetails(lVarH.getPhone());
                                } else {
                                    hotelsPropertyContactDetails = hotelsPropertyPaymentOptions;
                                }
                                yei.e eVarB = mVar.b();
                                if (eVarB != null) {
                                    Intrinsics.checkNotNullParameter(eVarB, "<this>");
                                    hotelsPropertyAttributes = new HotelsPropertyAttributes(eVarB.getAddedToFavorites());
                                } else {
                                    hotelsPropertyAttributes = hotelsPropertyPaymentOptions;
                                }
                                yei.d dVarA2 = mVar.a();
                                if (dVarA2 != null) {
                                    Intrinsics.checkNotNullParameter(dVarA2, "<this>");
                                    yei.n feesDescription = dVarA2.getFeesDescription();
                                    Intrinsics.checkNotNullParameter(feesDescription, "<this>");
                                    hotelsPropertyAdditionalInformation = new HotelsPropertyAdditionalInformation(new HotelsPropertyFeesDescription(feesDescription.getMandatory()));
                                } else {
                                    hotelsPropertyAdditionalInformation = hotelsPropertyPaymentOptions;
                                }
                                List listD2 = mVar.d();
                                if (listD2 != null) {
                                    List<wei.a> list9 = listD2;
                                    ArrayList arrayList16 = new ArrayList(w.t(list9, 10));
                                    for (wei.a aVar5 : list9) {
                                        Intrinsics.checkNotNullParameter(aVar5, "<this>");
                                        String strC = aVar5.c();
                                        String strD = aVar5.d();
                                        DateTime dateTimeWithTimeAtStartOfDay = new DateTime(aVar5.g()).withTimeAtStartOfDay();
                                        Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                                        arrayList16.add(new TravelHotelsCampaign(strC, strD, dateTimeWithTimeAtStartOfDay, jli.b.k(new DateTime(aVar5.b())), aVar5.e(), aVar5.a(), aVar5.f()));
                                    }
                                    r362 = arrayList16;
                                } else {
                                    r362 = hotelsPropertyPaymentOptions;
                                }
                                String strV = mVar.v();
                                if (strV != null) {
                                    ?? Values = fgi.a.values();
                                    int length4 = Values.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length4) {
                                            r122 = Values[i21];
                                            if (!a0.z(r122.name(), strV, true)) {
                                                i21++;
                                            }
                                        } else {
                                            r122 = hotelsPropertyPaymentOptions;
                                        }
                                    }
                                    r372 = r122;
                                } else {
                                    r372 = hotelsPropertyPaymentOptions;
                                }
                                t tVarK = mVar.k();
                                if (tVarK != null) {
                                    Intrinsics.checkNotNullParameter(tVarK, "<this>");
                                    hotelsPropertyHostDetails = new HotelsPropertyHostDetails(tVarK.c(), tVarK.d(), tVarK.a(), tVarK.b(), tVarK.e());
                                } else {
                                    hotelsPropertyHostDetails = hotelsPropertyPaymentOptions;
                                }
                                List listA = mVar.A();
                                if (listA != null) {
                                    List<y> list10 = listA;
                                    ArrayList arrayList17 = new ArrayList(w.t(list10, 10));
                                    for (y yVar : list10) {
                                        Intrinsics.checkNotNullParameter(yVar, "<this>");
                                        arrayList17.add(new HotelsPropertySpace((ufi.f) u1.u(yVar.c(), lfi.a.f194933h), yVar.a(), yVar.b()));
                                    }
                                    arrayList3 = arrayList17;
                                } else {
                                    arrayList3 = null;
                                }
                                String strZ = mVar.z();
                                List listL = mVar.l();
                                xei.d dVarJ = mVar.j();
                                Distance distanceV = dVarJ != null ? v04.b.v(dVarJ) : null;
                                String strP = mVar.p();
                                arrayList8.add(new HotelsProperty(strM, strQ, arrayList, hotelsPropertyType, arrayList2, numW, hotelsPropertyRatings, hotelsPropertyAvailability, pricing, hotelsPropertyPaymentOptions2, hotelsPropertyCancellationOptions, hotelsPropertyLocation, r292, hotelsPositionToSearchLocationCentre, hotelsPropertyCheckInDetails, hotelsPropertyCheckOutDetails, hotelsPropertyContactDetails, hotelsPropertyAttributes, hotelsPropertyAdditionalInformation, r362, r372, hotelsPropertyHostDetails, arrayList3, strZ, listL, distanceV, strP != null ? ufi.h.valueOf(strP) : null, null));
                                it13 = it15;
                                str4 = str2;
                                localDate4 = localDate2;
                            }
                            str = str4;
                            localDate = localDate4;
                            list = arrayList8;
                        } else {
                            str = str4;
                            localDate = localDate4;
                            list = f0.f322471a;
                        }
                        return new jxf.b(str, localDate, localDate5, num, arrayList7, new jxf.e(list));
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: txf.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f275412b;

            {
                this.f275412b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51) {
                /*
                    Method dump skipped, instruction units count: 1982
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: txf.p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        Function1 function12 = new Function1(this) { // from class: txf.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f275414b;

            {
                this.f275414b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v6 */
            /* JADX WARN: Type inference failed for: r12v7 */
            /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Enum] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r26v3, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r27v0 */
            /* JADX WARN: Type inference failed for: r27v1, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyCancellationOptions] */
            /* JADX WARN: Type inference failed for: r27v2 */
            /* JADX WARN: Type inference failed for: r29v0 */
            /* JADX WARN: Type inference failed for: r29v1, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r29v2 */
            /* JADX WARN: Type inference failed for: r2v30, types: [zhm.f0] */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r30v0 */
            /* JADX WARN: Type inference failed for: r30v1, types: [com.revolut.feature_travel_hotels_models.property.HotelsPositionToSearchLocationCentre] */
            /* JADX WARN: Type inference failed for: r30v2 */
            /* JADX WARN: Type inference failed for: r31v2, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckInDetails] */
            /* JADX WARN: Type inference failed for: r32v2 */
            /* JADX WARN: Type inference failed for: r32v3, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckOutDetails] */
            /* JADX WARN: Type inference failed for: r32v4 */
            /* JADX WARN: Type inference failed for: r33v2 */
            /* JADX WARN: Type inference failed for: r33v3, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyContactDetails] */
            /* JADX WARN: Type inference failed for: r33v4 */
            /* JADX WARN: Type inference failed for: r34v1 */
            /* JADX WARN: Type inference failed for: r34v2, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyAttributes] */
            /* JADX WARN: Type inference failed for: r34v3 */
            /* JADX WARN: Type inference failed for: r35v2 */
            /* JADX WARN: Type inference failed for: r35v3, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyAdditionalInformation] */
            /* JADX WARN: Type inference failed for: r35v4 */
            /* JADX WARN: Type inference failed for: r36v1 */
            /* JADX WARN: Type inference failed for: r36v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r36v3 */
            /* JADX WARN: Type inference failed for: r37v0 */
            /* JADX WARN: Type inference failed for: r37v1, types: [com.revolut.feature_travel_hotels_models.property.Distance] */
            /* JADX WARN: Type inference failed for: r37v3 */
            /* JADX WARN: Type inference failed for: r37v4, types: [fgi.a] */
            /* JADX WARN: Type inference failed for: r37v5 */
            /* JADX WARN: Type inference failed for: r37v7 */
            /* JADX WARN: Type inference failed for: r38v1 */
            /* JADX WARN: Type inference failed for: r38v2, types: [com.revolut.feature_travel_hotels_models.property.HotelsPropertyHostDetails] */
            /* JADX WARN: Type inference failed for: r38v8 */
            /* JADX WARN: Type inference failed for: r3v11, types: [fgi.a[]] */
            /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r42v5 */
            /* JADX WARN: Type inference failed for: r42v6, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r42v7 */
            /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                LocalDate localDate;
                List list;
                ArrayList arrayList;
                HotelsPropertyType hotelsPropertyType;
                ArrayList arrayList2;
                yei.m mVar;
                String str2;
                LocalDate localDate2;
                HotelsPropertyRatings hotelsPropertyRatings;
                HotelsPropertyAvailability hotelsPropertyAvailability;
                HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions;
                Pricing pricing;
                HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions2;
                ?? hotelsPropertyCancellationOptions;
                ?? r292;
                ?? hotelsPositionToSearchLocationCentre;
                Parcelable hotelsPropertyCheckInDetails;
                ?? hotelsPropertyCheckOutDetails;
                ?? hotelsPropertyContactDetails;
                ?? hotelsPropertyAttributes;
                ?? hotelsPropertyAdditionalInformation;
                ?? r362;
                ?? r372;
                ?? hotelsPropertyHostDetails;
                ArrayList arrayList3;
                ?? r122;
                HotelsPropertyCashback hotelsPropertyCashback;
                ArrayList arrayList4;
                PointsRewardRate pointsRewardRate;
                ?? r42;
                PointsRewardRate pointsRewardRate2;
                HotelsPropertyAvailabilityDates hotelsPropertyAvailabilityDates;
                List listH;
                ArrayList arrayList5;
                String str3;
                LocalDate localDate3;
                HotelsInventoryProviderLogos hotelsInventoryProviderLogos;
                HotelsPropertyGuestReviewContent hotelsPropertyGuestReviewContent;
                ufi.g gVar;
                ?? arrayList6;
                Iterator it8;
                Iterator it9;
                ufi.i iVar;
                Iterator it10;
                ffi.a aVar;
                jxf.c cVar;
                int i22 = i2;
                s sVar = this.f275414b;
                switch (i22) {
                    case 0:
                        o it11 = (o) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (jxf.b) sVar.f275416b.get("TRAVEL_NEXT_TRIP_WITH_RECOMMENDATIONS_CACHE_KEY");
                    default:
                        o params = (o) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        wxf.j jVar = sVar.f275417c;
                        sxf.d dVar = (sxf.d) d0.d0((List) DBUtil.performBlocking(jVar.f300946a, true, true, new wwa.a(jVar, params.f275409a.f306286a, 7)));
                        if (dVar == null) {
                            return null;
                        }
                        sxf.b bVar = dVar.f266483a;
                        Intrinsics.checkNotNullParameter(dVar, "<this>");
                        String str4 = bVar.f266479a;
                        LocalDate localDate4 = bVar.f266481c;
                        LocalDate localDate5 = bVar.d;
                        Integer num = bVar.e;
                        List list2 = dVar.f266484b;
                        ArrayList arrayList7 = new ArrayList(w.t(list2, 10));
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            sxf.a aVar2 = (sxf.a) it12.next();
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            String str5 = aVar2.f266476a;
                            String str6 = aVar2.f266478c;
                            String str7 = aVar2.d;
                            ffi.a[] aVarArrValues = ffi.a.values();
                            int length = aVarArrValues.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    aVar = aVarArrValues[i3];
                                    it10 = it12;
                                    if (!a0.z(aVar.name(), str7, true)) {
                                        i3++;
                                        it12 = it10;
                                    }
                                } else {
                                    it10 = it12;
                                    aVar = null;
                                }
                            }
                            if (aVar == null) {
                                aVar = ffi.a.UNKNOWN;
                            }
                            ffi.a aVar3 = aVar;
                            String str8 = aVar2.e;
                            jxf.c[] cVarArrValues = jxf.c.values();
                            int length2 = cVarArrValues.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length2) {
                                    cVar = cVarArrValues[i5];
                                    jxf.c[] cVarArr = cVarArrValues;
                                    if (!a0.z(cVar.name(), str8, true)) {
                                        i5++;
                                        cVarArrValues = cVarArr;
                                    }
                                } else {
                                    cVar = null;
                                }
                            }
                            if (cVar == null) {
                                cVar = jxf.c.UNKNOWN;
                            }
                            arrayList7.add(new jxf.d(str5, str6, aVar3, cVar));
                            it12 = it10;
                        }
                        sxf.c cVar2 = bVar.f;
                        Intrinsics.checkNotNullParameter(cVar2, "<this>");
                        List properties = cVar2.getProperties();
                        if (properties != null) {
                            List list3 = properties;
                            ArrayList arrayList8 = new ArrayList(w.t(list3, 10));
                            Iterator it13 = list3.iterator();
                            while (it13.hasNext()) {
                                yei.m mVar2 = (yei.m) it13.next();
                                Intrinsics.checkNotNullParameter(mVar2, "<this>");
                                String strM = mVar2.m();
                                String strQ = mVar2.q();
                                List listI = mVar2.i();
                                if (listI != null) {
                                    List list4 = listI;
                                    ArrayList arrayList9 = new ArrayList(w.t(list4, 10));
                                    Iterator it14 = list4.iterator();
                                    while (it14.hasNext()) {
                                        xei.l lVar = (xei.l) it14.next();
                                        Intrinsics.checkNotNullParameter(lVar, "<this>");
                                        String category = lVar.getCategory();
                                        ufi.i[] iVarArrValues = ufi.i.values();
                                        int length3 = iVarArrValues.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < length3) {
                                                iVar = iVarArrValues[i6];
                                                it8 = it14;
                                                it9 = it13;
                                                if (!a0.z(iVar.name(), category, true)) {
                                                    i6++;
                                                    it14 = it8;
                                                    it13 = it9;
                                                }
                                            } else {
                                                it8 = it14;
                                                it9 = it13;
                                                iVar = null;
                                            }
                                        }
                                        if (iVar == null) {
                                            iVar = ufi.i.UNKNOWN;
                                        }
                                        arrayList9.add(new PropertyDescription(iVar, lVar.getPlainText()));
                                        it14 = it8;
                                        it13 = it9;
                                    }
                                    arrayList = arrayList9;
                                } else {
                                    arrayList = null;
                                }
                                Iterator it15 = it13;
                                z zVarU = mVar2.u();
                                if (zVarU != null) {
                                    Intrinsics.checkNotNullParameter(zVarU, "<this>");
                                    String id10 = zVarU.getId();
                                    String name = zVarU.getName();
                                    String type = zVarU.getType();
                                    if (type == null || (gVar = (ufi.g) u1.v(type, lfi.a.f194931c)) == null) {
                                        gVar = ufi.g.UNKNOWN;
                                    }
                                    ufi.g gVar2 = gVar;
                                    Integer totalProperties = zVarU.getTotalProperties();
                                    String imageUrl = zVarU.getImageUrl();
                                    List categories = zVarU.getCategories();
                                    if (categories != null) {
                                        arrayList6 = new ArrayList();
                                        Iterator it16 = categories.iterator();
                                        while (it16.hasNext()) {
                                            egi.a aVar4 = (egi.a) u1.v((String) it16.next(), lfi.a.i);
                                            if (aVar4 != null) {
                                                arrayList6.add(aVar4);
                                            }
                                        }
                                    } else {
                                        arrayList6 = f0.f322471a;
                                    }
                                    hotelsPropertyType = new HotelsPropertyType(id10, name, gVar2, totalProperties, imageUrl, arrayList6);
                                } else {
                                    hotelsPropertyType = null;
                                }
                                List<xei.e> listN = mVar2.n();
                                ArrayList arrayList10 = new ArrayList(w.t(listN, 10));
                                for (xei.e eVar : listN) {
                                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                                    arrayList10.add(new Image(eVar.b(), (ufi.e) u1.u(eVar.c(), lfi.a.f194929a), eVar.d(), eVar.a()));
                                }
                                Integer numW = mVar2.w();
                                yei.w wVarX = mVar2.x();
                                if (wVarX != null) {
                                    Intrinsics.checkNotNullParameter(wVarX, "<this>");
                                    Double stars = wVarX.getStars();
                                    yei.s guestReviews = wVarX.getGuestReviews();
                                    Intrinsics.checkNotNullParameter(guestReviews, "<this>");
                                    int count = guestReviews.getCount();
                                    List scores = guestReviews.getScores();
                                    ArrayList arrayList11 = new ArrayList(w.t(scores, 10));
                                    Iterator it17 = scores.iterator();
                                    while (it17.hasNext()) {
                                        arrayList11.add(v04.b.x((yei.q) it17.next()));
                                    }
                                    List reviews = guestReviews.getReviews();
                                    if (reviews != null) {
                                        List list5 = reviews;
                                        arrayList2 = arrayList10;
                                        arrayList5 = new ArrayList(w.t(list5, 10));
                                        Iterator it18 = list5.iterator();
                                        while (it18.hasNext()) {
                                            yei.p pVar = (yei.p) it18.next();
                                            Intrinsics.checkNotNullParameter(pVar, "<this>");
                                            int rank = pVar.getRank();
                                            long dateTimeMillis = pVar.getDateTimeMillis();
                                            List scores2 = pVar.getScores();
                                            Iterator it19 = it18;
                                            yei.m mVar3 = mVar2;
                                            ArrayList arrayList12 = new ArrayList(w.t(scores2, 10));
                                            Iterator it20 = scores2.iterator();
                                            while (it20.hasNext()) {
                                                arrayList12.add(v04.b.x((yei.q) it20.next()));
                                            }
                                            String displayName = pVar.getDisplayName();
                                            yei.r source = pVar.getSource();
                                            Intrinsics.checkNotNullParameter(source, "<this>");
                                            ufi.d dVar2 = (ufi.d) u1.u(source.getType(), lfi.a.f194932g);
                                            String name2 = source.getName();
                                            yei.b logos = source.getLogos();
                                            if (logos != null) {
                                                Intrinsics.checkNotNullParameter(logos, "<this>");
                                                str3 = str4;
                                                localDate3 = localDate4;
                                                hotelsInventoryProviderLogos = new HotelsInventoryProviderLogos(logos.getColour(), logos.getLight());
                                            } else {
                                                str3 = str4;
                                                localDate3 = localDate4;
                                                hotelsInventoryProviderLogos = null;
                                            }
                                            HotelsPropertyGuestReviewSource hotelsPropertyGuestReviewSource = new HotelsPropertyGuestReviewSource(dVar2, name2, hotelsInventoryProviderLogos);
                                            yei.o content = pVar.getContent();
                                            if (content != null) {
                                                Intrinsics.checkNotNullParameter(content, "<this>");
                                                hotelsPropertyGuestReviewContent = new HotelsPropertyGuestReviewContent(content.getPlainText());
                                            } else {
                                                hotelsPropertyGuestReviewContent = null;
                                            }
                                            arrayList5.add(new HotelsPropertyGuestReview(rank, dateTimeMillis, arrayList12, displayName, hotelsPropertyGuestReviewSource, hotelsPropertyGuestReviewContent));
                                            it18 = it19;
                                            mVar2 = mVar3;
                                            str4 = str3;
                                            localDate4 = localDate3;
                                        }
                                    } else {
                                        arrayList2 = arrayList10;
                                        arrayList5 = null;
                                    }
                                    mVar = mVar2;
                                    str2 = str4;
                                    localDate2 = localDate4;
                                    hotelsPropertyRatings = new HotelsPropertyRatings(stars, new HotelsPropertyGuestsReviews(arrayList11, count, arrayList5));
                                } else {
                                    arrayList2 = arrayList10;
                                    mVar = mVar2;
                                    str2 = str4;
                                    localDate2 = localDate4;
                                    hotelsPropertyRatings = null;
                                }
                                yei.g gVarC = mVar.c();
                                if (gVarC != null) {
                                    Intrinsics.checkNotNullParameter(gVarC, "<this>");
                                    boolean isAvailable = gVarC.getIsAvailable();
                                    yei.f dates = gVarC.getDates();
                                    if (dates != null) {
                                        Intrinsics.checkNotNullParameter(dates, "<this>");
                                        Instant instantOfEpochMilli = Instant.ofEpochMilli(dates.getCheckInTimeMillis());
                                        ZoneOffset zoneOffset = ZoneOffset.UTC;
                                        LocalDate localDate6 = instantOfEpochMilli.atZone(zoneOffset).toLocalDate();
                                        Intrinsics.checkNotNullExpressionValue(localDate6, "toLocalDate(...)");
                                        LocalDate localDate7 = Instant.ofEpochMilli(dates.getCheckOutTimeMillis()).atZone(zoneOffset).toLocalDate();
                                        Intrinsics.checkNotNullExpressionValue(localDate7, "toLocalDate(...)");
                                        hotelsPropertyAvailabilityDates = new HotelsPropertyAvailabilityDates(localDate6, localDate7);
                                    } else {
                                        hotelsPropertyAvailabilityDates = null;
                                    }
                                    Integer nights = gVarC.getNights();
                                    String occupancy = gVarC.getOccupancy();
                                    if (occupancy == null || (listH = l9.l.H(occupancy)) == null) {
                                        listH = f0.f322471a;
                                    }
                                    hotelsPropertyAvailability = new HotelsPropertyAvailability(isAvailable, hotelsPropertyAvailabilityDates, nights, listH);
                                } else {
                                    hotelsPropertyAvailability = null;
                                }
                                xei.k kVarT = mVar.t();
                                if (kVarT != null) {
                                    Intrinsics.checkNotNullParameter(kVarT, "<this>");
                                    cgi.e eVar2 = (cgi.e) u1.u(kVarT.i(), lfi.a.f194934j);
                                    Boolean boolJ = kVarT.j();
                                    OverallPrice overallPriceY = v04.b.y(kVarT.c());
                                    xei.g gVarG = kVarT.g();
                                    OverallPrice overallPriceY2 = gVarG != null ? v04.b.y(gVarG) : null;
                                    xei.a aVarA = kVarT.a();
                                    if (aVarA != null) {
                                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                                        hotelsPropertyCashback = new HotelsPropertyCashback(aVarA.getPercentage(), boh.f.u(aVarA.getAmount()));
                                    } else {
                                        hotelsPropertyCashback = null;
                                    }
                                    List listD = kVarT.d();
                                    if (listD != null) {
                                        List list6 = listD;
                                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                                        Iterator it21 = list6.iterator();
                                        while (it21.hasNext()) {
                                            arrayList13.add(v04.b.w((xei.h) it21.next()));
                                        }
                                        arrayList4 = arrayList13;
                                    } else {
                                        arrayList4 = null;
                                    }
                                    String strE = kVarT.e();
                                    RevPoints revPointsD = strE != null ? qvb.a.d(strE) : null;
                                    xei.h hVarH = kVarT.h();
                                    HotelsPointsRedeemOption hotelsPointsRedeemOptionW = hVarH != null ? v04.b.w(hVarH) : null;
                                    xei.i iVarF = kVarT.f();
                                    if (iVarF != null) {
                                        Intrinsics.checkNotNullParameter(iVarF, "<this>");
                                        try {
                                            RevPoints revPointsD2 = qvb.a.d(iVarF.c());
                                            dj0.d dVarV = hx7.a.v(iVarF.b());
                                            String strA = iVarF.a();
                                            pointsRewardRate2 = new PointsRewardRate(revPointsD2, dVarV, strA != null ? Double.valueOf(Double.parseDouble(strA)) : null);
                                            hotelsPropertyPaymentOptions = null;
                                        } catch (Throwable th10) {
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            hotelsPropertyPaymentOptions = null;
                                            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                                            pointsRewardRate2 = null;
                                        }
                                        pointsRewardRate = pointsRewardRate2;
                                    } else {
                                        hotelsPropertyPaymentOptions = null;
                                        pointsRewardRate = null;
                                    }
                                    List listB = kVarT.b();
                                    if (listB != null) {
                                        List list7 = listB;
                                        ArrayList arrayList14 = new ArrayList(w.t(list7, 10));
                                        Iterator it22 = list7.iterator();
                                        while (it22.hasNext()) {
                                            arrayList14.add(pu7.a.L((String) it22.next()));
                                        }
                                        r42 = arrayList14;
                                    } else {
                                        r42 = hotelsPropertyPaymentOptions;
                                    }
                                    pricing = new Pricing(eVar2, boolJ, overallPriceY, overallPriceY2, hotelsPropertyCashback, arrayList4, revPointsD, hotelsPointsRedeemOptionW, pointsRewardRate, r42);
                                } else {
                                    hotelsPropertyPaymentOptions = null;
                                    pricing = null;
                                }
                                v vVarR = mVar.r();
                                if (vVarR != null) {
                                    Intrinsics.checkNotNullParameter(vVarR, "<this>");
                                    hotelsPropertyPaymentOptions2 = new HotelsPropertyPaymentOptions(vVarR.getPayNow(), vVarR.getPayLater());
                                } else {
                                    hotelsPropertyPaymentOptions2 = hotelsPropertyPaymentOptions;
                                }
                                yei.h hVarE = mVar.e();
                                if (hVarE != null) {
                                    Intrinsics.checkNotNullParameter(hVarE, "<this>");
                                    hotelsPropertyCancellationOptions = new HotelsPropertyCancellationOptions(hVarE.getFreeCancellation());
                                } else {
                                    hotelsPropertyCancellationOptions = hotelsPropertyPaymentOptions;
                                }
                                u uVarO = mVar.o();
                                Intrinsics.checkNotNullParameter(uVarO, "<this>");
                                xei.b bVarB = uVarO.b();
                                Intrinsics.checkNotNullParameter(bVarB, "<this>");
                                double dB = bVarB.b();
                                double dC = bVarB.c();
                                xei.d dVarA = bVarB.a();
                                Coordinates coordinates = new Coordinates(dB, dC, dVarA != null ? v04.b.v(dVarA) : hotelsPropertyPaymentOptions);
                                xei.c cVarC = uVarO.c();
                                Intrinsics.checkNotNullParameter(cVarC, "<this>");
                                Country country = new Country(cVarC.getCode(), cVarC.getName());
                                yei.a aVarA2 = uVarO.a();
                                Intrinsics.checkNotNullParameter(aVarA2, "<this>");
                                HotelsPropertyLocation hotelsPropertyLocation = new HotelsPropertyLocation(coordinates, country, new Address(aVarA2.f(), aVarA2.g(), aVarA2.e(), aVarA2.a(), aVarA2.b(), aVarA2.d(), aVarA2.c()));
                                List listY = mVar.y();
                                if (listY != null) {
                                    List<x> list8 = listY;
                                    ArrayList arrayList15 = new ArrayList(w.t(list8, 10));
                                    for (x xVar : list8) {
                                        Intrinsics.checkNotNullParameter(xVar, "<this>");
                                        arrayList15.add(new HotelsPropertyRelativeLocation((ufi.j) u1.u(xVar.getType(), lfi.a.f), v04.b.v(xVar.getDistance())));
                                    }
                                    r292 = arrayList15;
                                } else {
                                    r292 = hotelsPropertyPaymentOptions;
                                }
                                yei.c cVarS = mVar.s();
                                if (cVarS != null) {
                                    Intrinsics.checkNotNullParameter(cVarS, "<this>");
                                    hotelsPositionToSearchLocationCentre = new HotelsPositionToSearchLocationCentre(v04.b.v(cVarS.a()), cVarS.b(), cVarS.c());
                                } else {
                                    hotelsPositionToSearchLocationCentre = hotelsPropertyPaymentOptions;
                                }
                                yei.i iVarF2 = mVar.f();
                                if (iVarF2 != null) {
                                    Intrinsics.checkNotNullParameter(iVarF2, "<this>");
                                    Window windowZ = v04.b.z(iVarF2.getWindow());
                                    yei.j information = iVarF2.getInformation();
                                    Intrinsics.checkNotNullParameter(information, "<this>");
                                    hotelsPropertyCheckInDetails = new HotelsPropertyCheckInDetails(windowZ, iVarF2.getMinimumAge(), new HotelsPropertyCheckInInfo(information.getGeneral(), information.getAdditional()));
                                } else {
                                    hotelsPropertyCheckInDetails = hotelsPropertyPaymentOptions;
                                }
                                yei.k kVarG = mVar.g();
                                if (kVarG != null) {
                                    Intrinsics.checkNotNullParameter(kVarG, "<this>");
                                    hotelsPropertyCheckOutDetails = new HotelsPropertyCheckOutDetails(v04.b.z(kVarG.getWindow()));
                                } else {
                                    hotelsPropertyCheckOutDetails = hotelsPropertyPaymentOptions;
                                }
                                yei.l lVarH = mVar.h();
                                if (lVarH != null) {
                                    Intrinsics.checkNotNullParameter(lVarH, "<this>");
                                    hotelsPropertyContactDetails = new HotelsPropertyContactDetails(lVarH.getPhone());
                                } else {
                                    hotelsPropertyContactDetails = hotelsPropertyPaymentOptions;
                                }
                                yei.e eVarB = mVar.b();
                                if (eVarB != null) {
                                    Intrinsics.checkNotNullParameter(eVarB, "<this>");
                                    hotelsPropertyAttributes = new HotelsPropertyAttributes(eVarB.getAddedToFavorites());
                                } else {
                                    hotelsPropertyAttributes = hotelsPropertyPaymentOptions;
                                }
                                yei.d dVarA2 = mVar.a();
                                if (dVarA2 != null) {
                                    Intrinsics.checkNotNullParameter(dVarA2, "<this>");
                                    yei.n feesDescription = dVarA2.getFeesDescription();
                                    Intrinsics.checkNotNullParameter(feesDescription, "<this>");
                                    hotelsPropertyAdditionalInformation = new HotelsPropertyAdditionalInformation(new HotelsPropertyFeesDescription(feesDescription.getMandatory()));
                                } else {
                                    hotelsPropertyAdditionalInformation = hotelsPropertyPaymentOptions;
                                }
                                List listD2 = mVar.d();
                                if (listD2 != null) {
                                    List<wei.a> list9 = listD2;
                                    ArrayList arrayList16 = new ArrayList(w.t(list9, 10));
                                    for (wei.a aVar5 : list9) {
                                        Intrinsics.checkNotNullParameter(aVar5, "<this>");
                                        String strC = aVar5.c();
                                        String strD = aVar5.d();
                                        DateTime dateTimeWithTimeAtStartOfDay = new DateTime(aVar5.g()).withTimeAtStartOfDay();
                                        Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                                        arrayList16.add(new TravelHotelsCampaign(strC, strD, dateTimeWithTimeAtStartOfDay, jli.b.k(new DateTime(aVar5.b())), aVar5.e(), aVar5.a(), aVar5.f()));
                                    }
                                    r362 = arrayList16;
                                } else {
                                    r362 = hotelsPropertyPaymentOptions;
                                }
                                String strV = mVar.v();
                                if (strV != null) {
                                    ?? Values = fgi.a.values();
                                    int length4 = Values.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length4) {
                                            r122 = Values[i21];
                                            if (!a0.z(r122.name(), strV, true)) {
                                                i21++;
                                            }
                                        } else {
                                            r122 = hotelsPropertyPaymentOptions;
                                        }
                                    }
                                    r372 = r122;
                                } else {
                                    r372 = hotelsPropertyPaymentOptions;
                                }
                                t tVarK = mVar.k();
                                if (tVarK != null) {
                                    Intrinsics.checkNotNullParameter(tVarK, "<this>");
                                    hotelsPropertyHostDetails = new HotelsPropertyHostDetails(tVarK.c(), tVarK.d(), tVarK.a(), tVarK.b(), tVarK.e());
                                } else {
                                    hotelsPropertyHostDetails = hotelsPropertyPaymentOptions;
                                }
                                List listA = mVar.A();
                                if (listA != null) {
                                    List<y> list10 = listA;
                                    ArrayList arrayList17 = new ArrayList(w.t(list10, 10));
                                    for (y yVar : list10) {
                                        Intrinsics.checkNotNullParameter(yVar, "<this>");
                                        arrayList17.add(new HotelsPropertySpace((ufi.f) u1.u(yVar.c(), lfi.a.f194933h), yVar.a(), yVar.b()));
                                    }
                                    arrayList3 = arrayList17;
                                } else {
                                    arrayList3 = null;
                                }
                                String strZ = mVar.z();
                                List listL = mVar.l();
                                xei.d dVarJ = mVar.j();
                                Distance distanceV = dVarJ != null ? v04.b.v(dVarJ) : null;
                                String strP = mVar.p();
                                arrayList8.add(new HotelsProperty(strM, strQ, arrayList, hotelsPropertyType, arrayList2, numW, hotelsPropertyRatings, hotelsPropertyAvailability, pricing, hotelsPropertyPaymentOptions2, hotelsPropertyCancellationOptions, hotelsPropertyLocation, r292, hotelsPositionToSearchLocationCentre, hotelsPropertyCheckInDetails, hotelsPropertyCheckOutDetails, hotelsPropertyContactDetails, hotelsPropertyAttributes, hotelsPropertyAdditionalInformation, r362, r372, hotelsPropertyHostDetails, arrayList3, strZ, listL, distanceV, strP != null ? ufi.h.valueOf(strP) : null, null));
                                it13 = it15;
                                str4 = str2;
                                localDate4 = localDate2;
                            }
                            str = str4;
                            localDate = localDate4;
                            list = arrayList8;
                        } else {
                            str = str4;
                            localDate = localDate4;
                            list = f0.f322471a;
                        }
                        return new jxf.b(str, localDate, localDate5, num, arrayList7, new jxf.e(list));
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: txf.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f275412b;

            {
                this.f275412b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51) {
                /*
                    Method dump skipped, instruction units count: 1982
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: txf.p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
