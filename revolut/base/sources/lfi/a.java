package lfi;

import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.feature_travel_hotels_models.location.Country;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
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
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewScore;
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
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.feature_travel_hotels_models.property.PropertyDescription;
import com.revolut.feature_travel_hotels_models.property.Window;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import l9.l;
import le.u1;
import ofi.k;
import ofi.o;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import rfi.b0;
import rfi.h;
import rfi.m;
import rfi.n;
import rfi.p;
import rfi.q;
import rfi.r;
import rfi.s;
import rfi.t;
import rfi.u;
import rfi.v;
import rfi.x;
import rfi.y;
import rfi.z;
import ufi.b;
import ufi.c;
import ufi.d;
import ufi.e;
import ufi.f;
import ufi.g;
import ufi.i;
import ufi.j;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f194929a = r0.k(new Pair("BANNER", e.BANNER), new Pair("ROOM", e.ROOM), new Pair("PROPERTY", e.PROPERTY));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f194930b = r0.k(new Pair("m", ufi.a.METER), new Pair("km", ufi.a.KILOMETER));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f194931c = r0.k(new Pair("HOLIDAY_RENTAL", g.HOLIDAY_RENTAL), new Pair("HOTEL", g.HOTEL), new Pair("GUEST_HOUSE", g.GUEST_HOUSE), new Pair("RESORT", g.RESORT), new Pair("ALL_INCLUSIVE", g.ALL_INCLUSIVE), new Pair("HOSTEL", g.HOSTEL), new Pair("INN", g.INN), new Pair("CRUISE", g.CRUISE), new Pair("MOTEL", g.MOTEL), new Pair("CAMPING", g.CAMPING), new Pair("TOWN_HOUSE", g.TOWN_HOUSE), new Pair("UNKNOWN", g.UNKNOWN));
    public static final Object d = r0.k(new Pair("CLEANLINESS", c.CLEANLINESS), new Pair("SERVICE", c.SERVICE), new Pair("COMFORT", c.COMFORT), new Pair("CONDITION", c.CONDITION), new Pair("LOCATION", c.LOCATION), new Pair("NEIGHBORHOOD", c.NEIGHBORHOOD), new Pair("QUALITY", c.QUALITY), new Pair("VALUE", c.VALUE), new Pair("AMENITIES", c.AMENITIES), new Pair("OVERALL", c.OVERALL));
    public static final Object e = r0.k(new Pair("EXTRA_PERSON_FEE", b.EXTRA_PERSON_FEE), new Pair("TAX_AND_SERVICE_FEE", b.TAX_AND_SERVICE_FEE), new Pair("PROPERTY_FEE", b.PROPERTY_FEE), new Pair("MANDATORY_EXTRA_TAX_AND_FEE", b.MANDATORY_EXTRA_TAX_AND_FEE), new Pair("REFUNDABLE_DAMAGE_DEPOSIT", b.REFUNDABLE_DAMAGE_DEPOSIT), new Pair("TRAVELER_SERVICE_FEE", b.TRAVELLER_SERVICE_FEE));
    public static final Map f = q0.c(new Pair("CITY_CENTER", j.CITY_CENTER));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f194932g = q0.c(new Pair("PARTNER", d.PARTNER));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f194933h = r0.k(new Pair("BEDROOM", f.BEDROOM), new Pair("BATHROOM", f.BATHROOM));
    public static final Object i = r0.k(new Pair("HOME", egi.a.HOME), new Pair("HOTEL", egi.a.HOTEL), new Pair("GUESTHOUSE", egi.a.GUESTHOUSE));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f194934j = r0.k(new Pair("PAY_NOW", cgi.e.PAY_NOW), new Pair("PAY_LATER", cgi.e.PAY_LATER));

    public static final Address a(rfi.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Address(aVar.getStreetLine1(), aVar.getStreetLine2(), aVar.getRegion(), aVar.getCity(), aVar.getCountry(), aVar.getPostcode(), aVar.getCountryName());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final Distance b(rfi.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new Distance(bVar.getValue(), (ufi.a) u1.u(bVar.getUnit(), f194930b));
    }

    public static final HotelsPointsRedeemOption c(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String token = kVar.getToken();
        RevPoints revPointsD = qvb.a.d(kVar.getPoints());
        dj0.d dVarO = mo3.a.o(kVar.getDiscount());
        String pointsReward = kVar.getPointsReward();
        return new HotelsPointsRedeemOption(revPointsD, pointsReward != null ? qvb.a.d(pointsReward) : null, dVarO, token, kVar.getQuoteToken());
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Map] */
    public static final HotelsProperty d(n nVar, TravelHotelsPromotion travelHotelsPromotion) {
        ArrayList arrayList;
        HotelsPropertyAvailability hotelsPropertyAvailability;
        HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions;
        HotelsPropertyCancellationOptions hotelsPropertyCancellationOptions;
        String str;
        ArrayList arrayList2;
        String str2;
        HotelsPositionToSearchLocationCentre hotelsPositionToSearchLocationCentre;
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails;
        HotelsPropertyCheckInDetails hotelsPropertyCheckInDetails;
        HotelsPropertyContactDetails hotelsPropertyContactDetails;
        HotelsPropertyContactDetails hotelsPropertyContactDetails2;
        HotelsPropertyAttributes hotelsPropertyAttributes;
        HotelsPropertyAttributes hotelsPropertyAttributes2;
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails2;
        HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation;
        HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        fgi.a aVar;
        HotelsPropertyHostDetails hotelsPropertyHostDetails;
        ArrayList arrayList6;
        HotelsPropertyAvailabilityDates hotelsPropertyAvailabilityDates;
        List listH;
        i iVar;
        String str3 = "<this>";
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        String id10 = nVar.getId();
        String name = nVar.getName();
        List descriptions = nVar.getDescriptions();
        if (descriptions != null) {
            List<o> list = descriptions;
            ArrayList arrayList7 = new ArrayList(w.t(list, 10));
            for (o oVar : list) {
                Intrinsics.checkNotNullParameter(oVar, "<this>");
                String category = oVar.getCategory();
                i[] iVarArrValues = i.values();
                int length = iVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        iVar = null;
                        break;
                    }
                    iVar = iVarArrValues[i2];
                    if (a0.z(iVar.name(), category, true)) {
                        break;
                    }
                    i2++;
                }
                if (iVar == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PropertyDescriptionDto", j6.a.q("Unknown property description category: ", oVar.getCategory()), null, h0Var);
                    iVar = i.UNKNOWN;
                }
                arrayList7.add(new PropertyDescription(iVar, oVar.getPlainText()));
            }
            arrayList = arrayList7;
        } else {
            arrayList = null;
        }
        HotelsPropertyType hotelsPropertyTypeJ = j(nVar.getPropertyType());
        List images = nVar.getImages();
        ArrayList arrayList8 = new ArrayList(w.t(images, 10));
        Iterator it8 = images.iterator();
        while (it8.hasNext()) {
            arrayList8.add(k((ofi.i) it8.next()));
        }
        Integer numValueOf = Integer.valueOf(nVar.getRank());
        x ratings = nVar.getRatings();
        Intrinsics.checkNotNullParameter(ratings, "<this>");
        HotelsPropertyRatings hotelsPropertyRatings = new HotelsPropertyRatings(ratings.getStars(), h(ratings.getGuestReviews()));
        h availability = nVar.getAvailability();
        if (availability != null) {
            Intrinsics.checkNotNullParameter(availability, "<this>");
            boolean isAvailable = availability.getIsAvailable();
            rfi.g dates = availability.getDates();
            if (dates != null) {
                Intrinsics.checkNotNullParameter(dates, "<this>");
                LocalDate localDate = LocalDate.parse(dates.getCheckIn());
                Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                LocalDate localDate2 = LocalDate.parse(dates.getCheckOut());
                Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
                hotelsPropertyAvailabilityDates = new HotelsPropertyAvailabilityDates(localDate, localDate2);
            } else {
                hotelsPropertyAvailabilityDates = null;
            }
            Integer nights = availability.getNights();
            String occupancy = availability.getOccupancy();
            if (occupancy == null || (listH = l.H(occupancy)) == null) {
                listH = f0.f322471a;
            }
            hotelsPropertyAvailability = new HotelsPropertyAvailability(isAvailable, hotelsPropertyAvailabilityDates, nights, listH);
        } else {
            hotelsPropertyAvailability = null;
        }
        ofi.n pricing = nVar.getPricing();
        Pricing pricingO = pricing != null ? o(pricing) : null;
        rfi.w paymentOptions = nVar.getPaymentOptions();
        if (paymentOptions != null) {
            Intrinsics.checkNotNullParameter(paymentOptions, "<this>");
            hotelsPropertyPaymentOptions = new HotelsPropertyPaymentOptions(paymentOptions.getPayNow(), paymentOptions.getPayLater());
        } else {
            hotelsPropertyPaymentOptions = null;
        }
        rfi.i cancellationOptions = nVar.getCancellationOptions();
        if (cancellationOptions != null) {
            Intrinsics.checkNotNullParameter(cancellationOptions, "<this>");
            hotelsPropertyCancellationOptions = new HotelsPropertyCancellationOptions(cancellationOptions.getFreeCancellation());
        } else {
            hotelsPropertyCancellationOptions = null;
        }
        HotelsPropertyLocation hotelsPropertyLocationI = i(nVar.getLocation());
        List relativeLocation = nVar.getRelativeLocation();
        if (relativeLocation != null) {
            List list2 = relativeLocation;
            str = id10;
            ArrayList arrayList9 = new ArrayList(w.t(list2, 10));
            for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it9) {
                y yVar = (y) it9.next();
                Intrinsics.checkNotNullParameter(yVar, "<this>");
                arrayList9.add(new HotelsPropertyRelativeLocation((j) u1.u(yVar.getType(), f), b(yVar.getDistance())));
            }
            arrayList2 = arrayList9;
        } else {
            str = id10;
            arrayList2 = null;
        }
        rfi.d positionToSearchLocationCentre = nVar.getPositionToSearchLocationCentre();
        if (positionToSearchLocationCentre != null) {
            Intrinsics.checkNotNullParameter(positionToSearchLocationCentre, "<this>");
            str2 = name;
            hotelsPositionToSearchLocationCentre = new HotelsPositionToSearchLocationCentre(b(positionToSearchLocationCentre.getDistance()), positionToSearchLocationCentre.getPropertyLocation(), positionToSearchLocationCentre.getShowDistance());
        } else {
            str2 = name;
            hotelsPositionToSearchLocationCentre = null;
        }
        rfi.j checkInDetails = nVar.getCheckInDetails();
        HotelsPropertyCheckInDetails hotelsPropertyCheckInDetailsF = checkInDetails != null ? f(checkInDetails) : null;
        rfi.l checkOutDetails = nVar.getCheckOutDetails();
        if (checkOutDetails != null) {
            Intrinsics.checkNotNullParameter(checkOutDetails, "<this>");
            hotelsPropertyCheckOutDetails = new HotelsPropertyCheckOutDetails(p(checkOutDetails.getWindow()));
        } else {
            hotelsPropertyCheckOutDetails = null;
        }
        m contactDetails = nVar.getContactDetails();
        if (contactDetails != null) {
            Intrinsics.checkNotNullParameter(contactDetails, "<this>");
            hotelsPropertyCheckInDetails = hotelsPropertyCheckInDetailsF;
            hotelsPropertyContactDetails = new HotelsPropertyContactDetails(contactDetails.getPhone());
        } else {
            hotelsPropertyCheckInDetails = hotelsPropertyCheckInDetailsF;
            hotelsPropertyContactDetails = null;
        }
        rfi.f attributes = nVar.getAttributes();
        if (attributes != null) {
            Intrinsics.checkNotNullParameter(attributes, "<this>");
            hotelsPropertyContactDetails2 = hotelsPropertyContactDetails;
            hotelsPropertyAttributes = new HotelsPropertyAttributes(attributes.getAddedToFavorites());
        } else {
            hotelsPropertyContactDetails2 = hotelsPropertyContactDetails;
            hotelsPropertyAttributes = null;
        }
        rfi.e additionalInformation = nVar.getAdditionalInformation();
        if (additionalInformation != null) {
            Intrinsics.checkNotNullParameter(additionalInformation, "<this>");
            hotelsPropertyAttributes2 = hotelsPropertyAttributes;
            rfi.o feesDescription = additionalInformation.getFeesDescription();
            Intrinsics.checkNotNullParameter(feesDescription, "<this>");
            hotelsPropertyCheckOutDetails2 = hotelsPropertyCheckOutDetails;
            hotelsPropertyAdditionalInformation = new HotelsPropertyAdditionalInformation(new HotelsPropertyFeesDescription(feesDescription.getMandatory()));
        } else {
            hotelsPropertyAttributes2 = hotelsPropertyAttributes;
            hotelsPropertyCheckOutDetails2 = hotelsPropertyCheckOutDetails;
            hotelsPropertyAdditionalInformation = null;
        }
        List campaigns = nVar.getCampaigns();
        if (campaigns != null) {
            List list3 = campaigns;
            hotelsPropertyAdditionalInformation2 = hotelsPropertyAdditionalInformation;
            arrayList3 = arrayList;
            arrayList4 = new ArrayList(w.t(list3, 10));
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                arrayList4.add(c8g.a.I((nfi.a) it10.next()));
            }
        } else {
            hotelsPropertyAdditionalInformation2 = hotelsPropertyAdditionalInformation;
            arrayList3 = arrayList;
            arrayList4 = null;
        }
        String providerId = nVar.getProviderId();
        if (providerId != null) {
            fgi.a[] aVarArrValues = fgi.a.values();
            int length2 = aVarArrValues.length;
            int i3 = 0;
            while (i3 < length2) {
                aVar = aVarArrValues[i3];
                int i5 = i3;
                arrayList5 = arrayList4;
                if (a0.z(aVar.name(), providerId, true)) {
                    break;
                }
                i3 = i5 + 1;
                arrayList4 = arrayList5;
            }
            arrayList5 = arrayList4;
            aVar = null;
        } else {
            arrayList5 = arrayList4;
            aVar = null;
        }
        u hostDetails = nVar.getHostDetails();
        if (hostDetails != null) {
            Intrinsics.checkNotNullParameter(hostDetails, "<this>");
            hotelsPropertyHostDetails = new HotelsPropertyHostDetails(hostDetails.getName(), hostDetails.getRegistrationNumber(), hostDetails.getImage(), hostDetails.getLanguages(), hostDetails.getIsPrivate());
        } else {
            hotelsPropertyHostDetails = null;
        }
        List spaces = nVar.getSpaces();
        if (spaces != null) {
            List list4 = spaces;
            arrayList6 = new ArrayList(w.t(list4, 10));
            Iterator it11 = list4.iterator();
            while (it11.hasNext()) {
                z zVar = (z) it11.next();
                Intrinsics.checkNotNullParameter(zVar, str3);
                arrayList6.add(new HotelsPropertySpace((f) u1.u(zVar.getType(), f194933h), zVar.getDescription(), zVar.getQuantity()));
                str3 = str3;
                it11 = it11;
                hotelsPropertyTypeJ = hotelsPropertyTypeJ;
                pricingO = pricingO;
            }
        } else {
            arrayList6 = null;
        }
        HotelsPropertyType hotelsPropertyType = hotelsPropertyTypeJ;
        Pricing pricing2 = pricingO;
        String str4 = str;
        HotelsPropertyAdditionalInformation hotelsPropertyAdditionalInformation3 = hotelsPropertyAdditionalInformation2;
        String rentalAgreementUrl = nVar.getRentalAgreementUrl();
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails3 = hotelsPropertyCheckOutDetails2;
        List houseRules = nVar.getHouseRules();
        rfi.b distanceToLocation = nVar.getDistanceToLocation();
        Distance distanceB = distanceToLocation != null ? b(distanceToLocation) : null;
        String matchType = nVar.getMatchType();
        ufi.h hVarValueOf = matchType != null ? ufi.h.valueOf(matchType) : null;
        qfi.a promotion = nVar.getPromotion();
        return new HotelsProperty(str4, str2, arrayList3, hotelsPropertyType, arrayList8, numValueOf, hotelsPropertyRatings, hotelsPropertyAvailability, pricing2, hotelsPropertyPaymentOptions, hotelsPropertyCancellationOptions, hotelsPropertyLocationI, arrayList2, hotelsPositionToSearchLocationCentre, hotelsPropertyCheckInDetails, hotelsPropertyCheckOutDetails3, hotelsPropertyContactDetails2, hotelsPropertyAttributes2, hotelsPropertyAdditionalInformation3, arrayList5, aVar, hotelsPropertyHostDetails, arrayList6, rentalAgreementUrl, houseRules, distanceB, hVarValueOf, promotion != null ? kfi.a.a(promotion) : travelHotelsPromotion);
    }

    public static final HotelsPropertyCashback e(ofi.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new HotelsPropertyCashback(dVar.getPercentage(), mo3.a.o(dVar.getAmount()));
    }

    public static final HotelsPropertyCheckInDetails f(rfi.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Window windowP = p(jVar.getWindow());
        rfi.k information = jVar.getInformation();
        Intrinsics.checkNotNullParameter(information, "<this>");
        return new HotelsPropertyCheckInDetails(windowP, jVar.getMinimumAge(), new HotelsPropertyCheckInInfo(information.getGeneral(), information.getAdditional()));
    }

    public static final HotelsPropertyGuestReviewScore g(r rVar) {
        c cVar;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        double value = rVar.getValue();
        double value10Scale = rVar.getValue10Scale();
        String title = rVar.getTitle();
        String name = rVar.getName();
        String category = rVar.getCategory();
        c[] cVarArrValues = c.values();
        int length = cVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i2];
            if (a0.z(cVar.name(), category, true)) {
                break;
            }
            i2++;
        }
        if (cVar == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "HotelsPropertyGuestReviewScoreDto", j6.a.q("Unknown review category: ", rVar.getCategory()), null, h0Var);
            cVar = c.UNKNOWN;
        }
        return new HotelsPropertyGuestReviewScore(value, value10Scale, title, name, cVar);
    }

    public static final HotelsPropertyGuestsReviews h(t tVar) {
        ArrayList arrayList;
        Iterator it8;
        HotelsInventoryProviderLogos hotelsInventoryProviderLogos;
        HotelsPropertyGuestReviewContent hotelsPropertyGuestReviewContent;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        int count = tVar.getCount();
        List scores = tVar.getScores();
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(w.t(scores, 10));
        Iterator it9 = scores.iterator();
        while (it9.hasNext()) {
            arrayList2.add(g((r) it9.next()));
        }
        List reviews = tVar.getReviews();
        if (reviews != null) {
            List list = reviews;
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                q qVar = (q) it10.next();
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                int rank = qVar.getRank();
                long millis = new DateTime(qVar.getDate(), DateTimeZone.UTC).getMillis();
                List scores2 = qVar.getScores();
                ArrayList arrayList4 = new ArrayList(w.t(scores2, i2));
                Iterator it11 = scores2.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(g((r) it11.next()));
                }
                String displayName = qVar.getDisplayName();
                s source = qVar.getSource();
                Intrinsics.checkNotNullParameter(source, "<this>");
                d dVar = (d) u1.u(source.getType(), f194932g);
                String name = source.getName();
                rfi.c logos = source.getLogos();
                if (logos != null) {
                    Intrinsics.checkNotNullParameter(logos, "<this>");
                    it8 = it10;
                    hotelsInventoryProviderLogos = new HotelsInventoryProviderLogos(logos.getColour(), logos.getLight());
                } else {
                    it8 = it10;
                    hotelsInventoryProviderLogos = null;
                }
                HotelsPropertyGuestReviewSource hotelsPropertyGuestReviewSource = new HotelsPropertyGuestReviewSource(dVar, name, hotelsInventoryProviderLogos);
                p content = qVar.getContent();
                if (content != null) {
                    Intrinsics.checkNotNullParameter(content, "<this>");
                    hotelsPropertyGuestReviewContent = new HotelsPropertyGuestReviewContent(content.getPlainText());
                } else {
                    hotelsPropertyGuestReviewContent = null;
                }
                arrayList3.add(new HotelsPropertyGuestReview(rank, millis, arrayList4, displayName, hotelsPropertyGuestReviewSource, hotelsPropertyGuestReviewContent));
                it10 = it8;
                i2 = 10;
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return new HotelsPropertyGuestsReviews(arrayList2, count, arrayList);
    }

    public static final HotelsPropertyLocation i(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        ofi.f coordinates = vVar.getCoordinates();
        Intrinsics.checkNotNullParameter(coordinates, "<this>");
        double latitude = coordinates.getLatitude();
        double longitude = coordinates.getLongitude();
        rfi.b accuracyRadius = coordinates.getAccuracyRadius();
        Coordinates coordinates2 = new Coordinates(latitude, longitude, accuracyRadius != null ? b(accuracyRadius) : null);
        ofi.g country = vVar.getCountry();
        Intrinsics.checkNotNullParameter(country, "<this>");
        return new HotelsPropertyLocation(coordinates2, new Country(country.getCode(), country.getName()), a(vVar.getAddress()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    public static final HotelsPropertyType j(rfi.a0 a0Var) {
        g gVar;
        ?? arrayList;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        String id10 = a0Var.getId();
        String name = a0Var.getName();
        String type = a0Var.getType();
        if (type == null || (gVar = (g) u1.v(type, f194931c)) == null) {
            gVar = g.UNKNOWN;
        }
        g gVar2 = gVar;
        Integer totalProperties = a0Var.getTotalProperties();
        String imageUrl = a0Var.getImageUrl();
        List categories = a0Var.getCategories();
        if (categories != null) {
            arrayList = new ArrayList();
            Iterator it8 = categories.iterator();
            while (it8.hasNext()) {
                egi.a aVar = (egi.a) u1.v((String) it8.next(), i);
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new HotelsPropertyType(id10, name, gVar2, totalProperties, imageUrl, arrayList);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final Image k(ofi.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new Image(iVar.getRank(), (e) u1.u(iVar.getType(), f194929a), iVar.getUrl(), iVar.getDescription());
    }

    public static final OverallPrice l(ofi.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        dj0.d dVarO = mo3.a.o(jVar.getBasePrice());
        dj0.d dVarO2 = mo3.a.o(jVar.getInclusivePrice());
        jo3.a strikethroughPrice = jVar.getStrikethroughPrice();
        dj0.d dVarO3 = strikethroughPrice != null ? mo3.a.o(strikethroughPrice) : null;
        List fees = jVar.getFees();
        ArrayList arrayList = new ArrayList(w.t(fees, 10));
        Iterator it8 = fees.iterator();
        while (it8.hasNext()) {
            arrayList.add(n((ofi.m) it8.next()));
        }
        jo3.a cardOnFile = jVar.getCardOnFile();
        return new OverallPrice(dVarO, dVarO2, dVarO3, arrayList, cardOnFile != null ? mo3.a.o(cardOnFile) : null);
    }

    public static final PointsRewardRate m(ofi.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        RevPoints revPointsD = qvb.a.d(lVar.getPointsReward());
        dj0.d dVarO = mo3.a.o(lVar.getCashAmount());
        String booster = lVar.getBooster();
        return new PointsRewardRate(revPointsD, dVarO, booster != null ? Double.valueOf(Double.parseDouble(booster)) : null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final PriceFee n(ofi.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new PriceFee((b) u1.u(mVar.getType(), e), mVar.getDescription(), mVar.getIncludedInPrice(), mo3.a.o(mVar.getValue()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final Pricing o(ofi.n nVar) {
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        RevPoints revPointsD;
        int i3;
        HotelsPointsRedeemOption hotelsPointsRedeemOptionC;
        ofi.l pointsRewardRate;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        cgi.e eVar = (cgi.e) u1.u(nVar.getType(), f194934j);
        Boolean isBestPrice = nVar.getIsBestPrice();
        OverallPrice overallPriceL = l(nVar.getOverallPriceDto());
        ofi.j priceInRequestedCurrency = nVar.getPriceInRequestedCurrency();
        ArrayList arrayList3 = null;
        OverallPrice overallPriceL2 = priceInRequestedCurrency != null ? l(priceInRequestedCurrency) : null;
        ofi.d cashback = nVar.getCashback();
        HotelsPropertyCashback hotelsPropertyCashbackE = cashback != null ? e(cashback) : null;
        List pointsRedeemOptions = nVar.getPointsRedeemOptions();
        if (pointsRedeemOptions != null) {
            List list = pointsRedeemOptions;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(c((k) it8.next()));
            }
        } else {
            arrayList = null;
        }
        String pointsReward = nVar.getPointsReward();
        if (pointsReward != null) {
            i2 = 10;
            arrayList2 = arrayList;
            revPointsD = qvb.a.d(pointsReward);
        } else {
            i2 = 10;
            arrayList2 = arrayList;
            revPointsD = null;
        }
        k redeemedPoints = nVar.getRedeemedPoints();
        if (redeemedPoints != null) {
            i3 = i2;
            hotelsPointsRedeemOptionC = c(redeemedPoints);
        } else {
            i3 = i2;
            hotelsPointsRedeemOptionC = null;
        }
        try {
            pointsRewardRate = nVar.getPointsRewardRate();
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        }
        PointsRewardRate pointsRewardRateM = pointsRewardRate != null ? m(pointsRewardRate) : null;
        List discounts = nVar.getDiscounts();
        if (discounts != null) {
            List list2 = discounts;
            arrayList3 = new ArrayList(w.t(list2, i3));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList3.add(pu7.a.L((String) it9.next()));
            }
        }
        return new Pricing(eVar, isBestPrice, overallPriceL, overallPriceL2, hotelsPropertyCashbackE, arrayList2, revPointsD, hotelsPointsRedeemOptionC, pointsRewardRateM, arrayList3);
    }

    public static final Window p(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        String start = b0Var.getStart();
        LocalTime localTime = start != null ? new LocalTime(start) : null;
        String end2 = b0Var.getEnd();
        return new Window(localTime, end2 != null ? new LocalTime(end2) : null);
    }
}
