package j9g;

import a9g.b1;
import a9g.b2;
import a9g.c2;
import a9g.d1;
import a9g.d2;
import a9g.e1;
import a9g.e2;
import a9g.f1;
import a9g.f2;
import a9g.h1;
import a9g.j1;
import a9g.j2;
import a9g.k1;
import a9g.l1;
import a9g.l2;
import a9g.m1;
import a9g.p1;
import a9g.q1;
import a9g.t0;
import a9g.u0;
import a9g.v0;
import a9g.w0;
import a9g.y0;
import a9g.y1;
import a9g.z0;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefund;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefundBreakdown;
import com.revolut.feature_travel_hotels_models.booking.details.PointsMonetaryValue;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.feature_travel_hotels_models.location.Country;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyBrief;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckInDetails;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckInInfo;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCheckOutDetails;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyContactDetails;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyLocation;
import com.revolut.feature_travel_hotels_models.property.Image;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.feature_travel_hotels_models.property.Window;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountAndNightsPenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountAndPercentagePenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.CancelPenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.NightsCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.NoCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.NoRefundPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.PercentageCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import com.revolut.feature_travel_hotels_models.property.room.CancellationWindow;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import org.joda.time.DateTime;
import r9g.h0;
import r9g.v;
import yhm.m;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f172327a = r0.k(new Pair("PENDING", tei.b.PENDING), new Pair("PROCESSING_BOOKING", tei.b.PROCESSING_BOOKING), new Pair("PROCESSING_PAYMENT", tei.b.PROCESSING_PAYMENT), new Pair("PROCESSING_CANCELLATION", tei.b.PROCESSING_CANCELLATION), new Pair("CONFIRMED", tei.b.CONFIRMED), new Pair("CANCELLED", tei.b.CANCELLED), new Pair("FAILED", tei.b.FAILED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f172328b = r0.k(new Pair("PENDING", rei.j.PENDING), new Pair("CONFIRMED", rei.j.CONFIRMED), new Pair("CANCELLED", rei.j.CANCELLED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f172329c = r0.k(new Pair("WALLET", rei.h.WALLET), new Pair("CARD", rei.h.CARD));
    public static final Object d = r0.k(new Pair("BEFORE", cgi.b.BEFORE), new Pair("WINDOW", cgi.b.WINDOW), new Pair("AFTER", cgi.b.AFTER), new Pair("ANYTIME", cgi.b.ANYTIME));
    public static final Object e = r0.k(new Pair("NOT_INITIATED", rei.r.NOT_INITIATED), new Pair("PENDING", rei.r.PENDING), new Pair("COMPLETED", rei.r.COMPLETED));

    public static final HotelsPointsRedeemOption a(d2 d2Var) {
        Intrinsics.checkNotNullParameter(d2Var, "<this>");
        String token = d2Var.getToken();
        RevPoints revPointsD = qvb.a.d(d2Var.getPoints());
        dj0.d dVarV = hx7.a.v(d2Var.getDiscount());
        String pointsReward = d2Var.getPointsReward();
        return new HotelsPointsRedeemOption(revPointsD, pointsReward != null ? qvb.a.d(pointsReward) : null, dVarV, token, d2Var.getQuoteToken());
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    public static final OverallPrice b(b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        dj0.d dVarV = hx7.a.v(b2Var.getBasePrice());
        dj0.d dVarV2 = hx7.a.v(b2Var.getInclusivePrice());
        jo3.b strikethroughPrice = b2Var.getStrikethroughPrice();
        dj0.d dVarV3 = strikethroughPrice != null ? hx7.a.v(strikethroughPrice) : null;
        List<e2> fees = b2Var.getFees();
        ArrayList arrayList = new ArrayList(w.t(fees, 10));
        for (e2 e2Var : fees) {
            Intrinsics.checkNotNullParameter(e2Var, "<this>");
            arrayList.add(new PriceFee((ufi.b) u1.u(e2Var.getType(), lfi.a.e), e2Var.getDescription(), e2Var.getIncludedInPrice(), hx7.a.v(e2Var.getValue())));
        }
        jo3.b cardOnFile = b2Var.getCardOnFile();
        return new OverallPrice(dVarV, dVarV2, dVarV3, arrayList, cardOnFile != null ? hx7.a.v(cardOnFile) : null);
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, java.util.Map] */
    public static final rei.g c(v0 v0Var) {
        HotelsPropertyContactDetails hotelsPropertyContactDetails;
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails;
        tei.b bVar;
        fgi.a aVar;
        HotelsPropertyCashback hotelsPropertyCashback;
        ArrayList arrayList;
        rei.b bVar2;
        rei.s sVar;
        rei.f fVar;
        rei.c cVar;
        qei.m mVar;
        rei.f fVar2;
        Iterator it8;
        rei.o oVar;
        b1 b1Var;
        rei.n nVar;
        rei.m mVar2;
        CancellationRefund cancellationRefund;
        ArrayList arrayList2;
        PointsMonetaryValue pointsMonetaryValue;
        PointsMonetaryValue pointsMonetaryValue2;
        Iterator it9;
        DateTime dateTime;
        HotelsPropertyBrief hotelsPropertyBrief;
        rei.b bVar3;
        rei.d dVar;
        rei.d dVar2;
        CancelPenalties percentageCancellationPenalty;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        String str = v0Var.f2595a;
        tei.b bVar4 = (tei.b) u1.t(v0Var.f2596b, tei.b.PENDING, f172327a);
        String str2 = v0Var.f2597c;
        d1 d1Var = v0Var.d;
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        e1 name = d1Var.getName();
        Intrinsics.checkNotNullParameter(name, "<this>");
        rei.q qVar = new rei.q(new rei.u(name.f2480a, name.f2481b), d1Var.getEmail(), d1Var.getPhone());
        u0 u0Var = v0Var.e;
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        LocalDate localDate = LocalDate.parse(u0Var.getCheckIn());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        LocalDate localDate2 = LocalDate.parse(u0Var.getCheckOut());
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        rei.e eVar = new rei.e(localDate, localDate2);
        f1 f1Var = v0Var.f;
        Object obj2 = h.f172332a;
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        String id10 = f1Var.getId();
        String name2 = f1Var.getName();
        List images = f1Var.getImages();
        ArrayList arrayList3 = new ArrayList(w.t(images, 10));
        Iterator it10 = images.iterator();
        while (it10.hasNext()) {
            arrayList3.add(h.b((y1) it10.next()));
        }
        p1 location = f1Var.getLocation();
        Intrinsics.checkNotNullParameter(location, "<this>");
        Coordinates coordinatesO = ta6.a.O(location.getCoordinates());
        a9g.k country = location.getCountry();
        Intrinsics.checkNotNullParameter(country, "<this>");
        HotelsPropertyLocation hotelsPropertyLocation = new HotelsPropertyLocation(coordinatesO, new Country(country.getCode(), country.getName()), h.a(location.getAddress()));
        j1 checkInDetails = f1Var.getCheckInDetails();
        Intrinsics.checkNotNullParameter(checkInDetails, "<this>");
        Window windowW = tz4.d.w(checkInDetails.getWindow());
        k1 information = checkInDetails.getInformation();
        Intrinsics.checkNotNullParameter(information, "<this>");
        HotelsPropertyCheckInDetails hotelsPropertyCheckInDetails = new HotelsPropertyCheckInDetails(windowW, checkInDetails.getMinimumAge(), new HotelsPropertyCheckInInfo(information.getGeneral(), information.getAdditional()));
        l1 checkOutDetails = f1Var.getCheckOutDetails();
        Intrinsics.checkNotNullParameter(checkOutDetails, "<this>");
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails2 = new HotelsPropertyCheckOutDetails(tz4.d.w(checkOutDetails.getWindow()));
        m1 contactDetails = f1Var.getContactDetails();
        if (contactDetails != null) {
            Intrinsics.checkNotNullParameter(contactDetails, "<this>");
            hotelsPropertyContactDetails = new HotelsPropertyContactDetails(contactDetails.getPhone());
        } else {
            hotelsPropertyContactDetails = null;
        }
        String providerId = f1Var.getProviderId();
        if (providerId != null) {
            fgi.a[] aVarArrValues = fgi.a.values();
            hotelsPropertyCheckOutDetails = hotelsPropertyCheckOutDetails2;
            int length = aVarArrValues.length;
            bVar = bVar4;
            int i = 0;
            while (i < length) {
                aVar = aVarArrValues[i];
                int i2 = length;
                int i3 = i;
                if (a0.z(aVar.name(), providerId, true)) {
                    break;
                }
                i = i3 + 1;
                length = i2;
            }
        } else {
            hotelsPropertyCheckOutDetails = hotelsPropertyCheckOutDetails2;
            bVar = bVar4;
        }
        aVar = null;
        HotelsPropertyBrief hotelsPropertyBrief2 = new HotelsPropertyBrief(id10, name2, arrayList3, hotelsPropertyLocation, hotelsPropertyCheckInDetails, hotelsPropertyCheckOutDetails, hotelsPropertyContactDetails, aVar);
        w0 w0Var = v0Var.f2600j;
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        rei.i iVar = new rei.i((rei.h) u1.u(w0Var.getMode(), f172329c), w0Var.getPocketId(), w0Var.getCardId());
        f2 f2Var = v0Var.f2598g;
        Intrinsics.checkNotNullParameter(f2Var, "<this>");
        cgi.e eVar2 = (cgi.e) u1.u(f2Var.getType(), j.f172335b);
        Boolean isBestPrice = f2Var.getIsBestPrice();
        OverallPrice overallPriceB = b(f2Var.getOverallPrice());
        b2 priceInRequestedCurrency = f2Var.getPriceInRequestedCurrency();
        OverallPrice overallPriceB2 = priceInRequestedCurrency != null ? b(priceInRequestedCurrency) : null;
        a9g.h cashback = f2Var.getCashback();
        if (cashback != null) {
            Intrinsics.checkNotNullParameter(cashback, "<this>");
            hotelsPropertyCashback = new HotelsPropertyCashback(cashback.getPercentage(), hx7.a.v(cashback.getValue()));
        } else {
            hotelsPropertyCashback = null;
        }
        List pointsRedeemOptions = f2Var.getPointsRedeemOptions();
        if (pointsRedeemOptions != null) {
            List list = pointsRedeemOptions;
            ArrayList arrayList4 = new ArrayList(w.t(list, 10));
            Iterator it11 = list.iterator();
            while (it11.hasNext()) {
                arrayList4.add(a((d2) it11.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        String pointsReward = f2Var.getPointsReward();
        RevPoints revPointsD = pointsReward != null ? qvb.a.d(pointsReward) : null;
        d2 redeemedPoints = f2Var.getRedeemedPoints();
        Pricing pricing = new Pricing(eVar2, isBestPrice, overallPriceB, overallPriceB2, hotelsPropertyCashback, arrayList, revPointsD, redeemedPoints != null ? a(redeemedPoints) : null, null, null);
        a9g.r rVar = v0Var.f2599h;
        if (rVar != null) {
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            a9g.q contactDetails2 = rVar.getContactDetails();
            Intrinsics.checkNotNullParameter(contactDetails2, "<this>");
            bVar2 = new rei.b(new rei.a(contactDetails2.getPhone(), contactDetails2.getEmail()), rVar.getMessage());
        } else {
            bVar2 = null;
        }
        List list2 = v0Var.i;
        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
        Iterator it12 = list2.iterator();
        while (it12.hasNext()) {
            z0 z0Var = (z0) it12.next();
            Intrinsics.checkNotNullParameter(z0Var, "<this>");
            String id11 = z0Var.getId();
            String roomId = z0Var.getRoomId();
            t0 confirmationIds = z0Var.getConfirmationIds();
            Intrinsics.checkNotNullParameter(confirmationIds, "<this>");
            rei.d dVar3 = new rei.d(confirmationIds.getPartner(), confirmationIds.getProperty());
            t0 itineraryIds = z0Var.getItineraryIds();
            Intrinsics.checkNotNullParameter(itineraryIds, "<this>");
            rei.d dVar4 = new rei.d(itineraryIds.getPartner(), itineraryIds.getProperty());
            rei.j jVar = (rei.j) u1.u(z0Var.getStatus(), f172328b);
            a9g.d cancellation = z0Var.getCancellation();
            Intrinsics.checkNotNullParameter(cancellation, "<this>");
            boolean z = cancellation.f2459a;
            boolean freeCancellation = cancellation.getFreeCancellation();
            Iterator it13 = it12;
            List windows = cancellation.getWindows();
            String str3 = str2;
            rei.q qVar2 = qVar;
            ArrayList arrayList6 = new ArrayList(w.t(windows, 10));
            Iterator it14 = windows.iterator();
            while (it14.hasNext()) {
                a9g.g gVar = (a9g.g) it14.next();
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                String start = gVar.getStart();
                DateTime dateTime2 = start != null ? DateTime.parse(start) : null;
                String end2 = gVar.getEnd();
                if (end2 != null) {
                    DateTime dateTime3 = DateTime.parse(end2);
                    it9 = it14;
                    dateTime = dateTime3;
                } else {
                    it9 = it14;
                    dateTime = null;
                }
                rei.e eVar3 = eVar;
                cgi.b bVar5 = (cgi.b) u1.u(gVar.getType(), d);
                a9g.c penalties = gVar.getPenalties();
                Intrinsics.checkNotNullParameter(penalties, "<this>");
                if (penalties.getAmount() != null && penalties.getNights() == null && penalties.getPercentage() == null) {
                    hotelsPropertyBrief = hotelsPropertyBrief2;
                    percentageCancellationPenalty = new AmountCancellationPenalty(hx7.a.v(penalties.getAmount()));
                    bVar3 = bVar2;
                } else {
                    hotelsPropertyBrief = hotelsPropertyBrief2;
                    if (penalties.getAmount() == null || penalties.getNights() == null || penalties.getPercentage() != null) {
                        bVar3 = bVar2;
                        jo3.b amount = penalties.getAmount();
                        NoRefundPenalty noRefundPenalty = NoRefundPenalty.f98083a;
                        if (amount != null && penalties.getNights() == null && penalties.getPercentage() != null && Intrinsics.b(penalties.getPercentage(), 100.0d)) {
                            dVar = dVar3;
                            dVar2 = dVar4;
                        } else if (penalties.getAmount() == null && penalties.getNights() != null && penalties.getPercentage() == null) {
                            percentageCancellationPenalty = new NightsCancellationPenalty(penalties.getNights().intValue());
                        } else {
                            if (penalties.getAmount() != null || penalties.getNights() != null || penalties.getPercentage() == null || Intrinsics.b(penalties.getPercentage(), 100.0d)) {
                                dVar = dVar3;
                                dVar2 = dVar4;
                                if (penalties.getAmount() != null || penalties.getNights() != null || penalties.getPercentage() == null || !Intrinsics.b(penalties.getPercentage(), 100.0d)) {
                                    percentageCancellationPenalty = NoCancellationPenalty.f98082a;
                                }
                            } else {
                                dVar = dVar3;
                                dVar2 = dVar4;
                                percentageCancellationPenalty = new PercentageCancellationPenalty(penalties.getPercentage().doubleValue());
                            }
                            arrayList6.add(new CancellationWindow(dateTime2, dateTime, bVar5, percentageCancellationPenalty));
                            dVar3 = dVar;
                            it14 = it9;
                            dVar4 = dVar2;
                            eVar = eVar3;
                            hotelsPropertyBrief2 = hotelsPropertyBrief;
                            bVar2 = bVar3;
                        }
                        percentageCancellationPenalty = noRefundPenalty;
                        arrayList6.add(new CancellationWindow(dateTime2, dateTime, bVar5, percentageCancellationPenalty));
                        dVar3 = dVar;
                        it14 = it9;
                        dVar4 = dVar2;
                        eVar = eVar3;
                        hotelsPropertyBrief2 = hotelsPropertyBrief;
                        bVar2 = bVar3;
                    } else {
                        bVar3 = bVar2;
                        percentageCancellationPenalty = new AmountAndNightsPenalties(penalties.getNights().intValue(), hx7.a.v(penalties.getAmount()));
                    }
                }
                dVar = dVar3;
                dVar2 = dVar4;
                arrayList6.add(new CancellationWindow(dateTime2, dateTime, bVar5, percentageCancellationPenalty));
                dVar3 = dVar;
                it14 = it9;
                dVar4 = dVar2;
                eVar = eVar3;
                hotelsPropertyBrief2 = hotelsPropertyBrief;
                bVar2 = bVar3;
            }
            rei.e eVar4 = eVar;
            HotelsPropertyBrief hotelsPropertyBrief3 = hotelsPropertyBrief2;
            rei.b bVar6 = bVar2;
            rei.d dVar5 = dVar3;
            rei.d dVar6 = dVar4;
            CancellationPolicy cancellationPolicy = new CancellationPolicy(arrayList6, z, freeCancellation);
            a9g.f cancellationRefund2 = z0Var.getCancellationRefund();
            if (cancellationRefund2 != null) {
                Intrinsics.checkNotNullParameter(cancellationRefund2, "<this>");
                jo3.b netRefund = cancellationRefund2.getNetRefund();
                dj0.d dVarV = netRefund != null ? hx7.a.v(netRefund) : null;
                a9g.e breakdown = cancellationRefund2.getBreakdown();
                Intrinsics.checkNotNullParameter(breakdown, "<this>");
                jo3.b originalRefund = breakdown.getOriginalRefund();
                dj0.d dVarV2 = originalRefund != null ? hx7.a.v(originalRefund) : null;
                jo3.b cancellationFee = breakdown.getCancellationFee();
                dj0.d dVarV3 = cancellationFee != null ? hx7.a.v(cancellationFee) : null;
                jo3.b cashbackReversal = breakdown.getCashbackReversal();
                dj0.d dVarV4 = cashbackReversal != null ? hx7.a.v(cashbackReversal) : null;
                jo3.b monetaryRefund = breakdown.getMonetaryRefund();
                dj0.d dVarV5 = monetaryRefund != null ? hx7.a.v(monetaryRefund) : null;
                c2 pointsRefund = breakdown.getPointsRefund();
                if (pointsRefund != null) {
                    Intrinsics.checkNotNullParameter(pointsRefund, "<this>");
                    pointsMonetaryValue = new PointsMonetaryValue(qvb.a.d(pointsRefund.getPoints()), hx7.a.v(pointsRefund.getMonetaryValue()));
                } else {
                    pointsMonetaryValue = null;
                }
                jo3.b cancellationMonetaryFee = breakdown.getCancellationMonetaryFee();
                dj0.d dVarV6 = cancellationMonetaryFee != null ? hx7.a.v(cancellationMonetaryFee) : null;
                c2 cancellationPointsFee = breakdown.getCancellationPointsFee();
                if (cancellationPointsFee != null) {
                    Intrinsics.checkNotNullParameter(cancellationPointsFee, "<this>");
                    pointsMonetaryValue2 = new PointsMonetaryValue(qvb.a.d(cancellationPointsFee.getPoints()), hx7.a.v(cancellationPointsFee.getMonetaryValue()));
                } else {
                    pointsMonetaryValue2 = null;
                }
                String pointsRewardReversal = breakdown.getPointsRewardReversal();
                cancellationRefund = new CancellationRefund(dVarV, new CancellationRefundBreakdown(dVarV2, dVarV3, dVarV4, dVarV5, pointsMonetaryValue, dVarV6, pointsMonetaryValue2, pointsRewardReversal != null ? qvb.a.d(pointsRewardReversal) : null));
            } else {
                cancellationRefund = null;
            }
            q1 bedConfiguration = z0Var.getBedConfiguration();
            Intrinsics.checkNotNullParameter(bedConfiguration, "<this>");
            rei.t tVar = new rei.t(bedConfiguration.getId(), bedConfiguration.getDescription());
            j2 occupancy = z0Var.getOccupancy();
            Intrinsics.checkNotNullParameter(occupancy, "<this>");
            RoomOccupancy roomOccupancy = new RoomOccupancy(occupancy.getAdults(), occupancy.getChildrenAge());
            e1 guestName = z0Var.getGuestName();
            Intrinsics.checkNotNullParameter(guestName, "<this>");
            rei.u uVar = new rei.u(guestName.f2480a, guestName.f2481b);
            String specialRequest = z0Var.getSpecialRequest();
            String propertyMessageLink = z0Var.getPropertyMessageLink();
            y0 roomDetails = z0Var.getRoomDetails();
            Intrinsics.checkNotNullParameter(roomDetails, "<this>");
            String id12 = roomDetails.getId();
            String name3 = roomDetails.getName();
            List images2 = roomDetails.getImages();
            ArrayList arrayList7 = new ArrayList(w.t(images2, 10));
            Iterator it15 = images2.iterator();
            while (it15.hasNext()) {
                arrayList7.add(h.b((y1) it15.next()));
            }
            rei.l lVar = new rei.l(id12, name3, arrayList7);
            List rateAmenities = z0Var.getRateAmenities();
            if (rateAmenities != null) {
                List<a9g.p> list3 = rateAmenities;
                ArrayList arrayList8 = new ArrayList(w.t(list3, 10));
                for (a9g.p pVar : list3) {
                    Object obj3 = d.f172325a;
                    Intrinsics.checkNotNullParameter(pVar, "<this>");
                    rei.l lVar2 = lVar;
                    oei.b bVar7 = (oei.b) u1.t(pVar.getCategory(), oei.b.UNDEFINED, d.f172326b);
                    List amenities = pVar.getAmenities();
                    CancellationPolicy cancellationPolicy2 = cancellationPolicy;
                    ArrayList arrayList9 = new ArrayList(w.t(amenities, 10));
                    for (Iterator it16 = amenities.iterator(); it16.hasNext(); it16 = it16) {
                        a9g.n nVar2 = (a9g.n) it16.next();
                        Intrinsics.checkNotNullParameter(nVar2, "<this>");
                        arrayList9.add(new HotelsAmenity(nVar2.getId(), (oei.a) u1.u(nVar2.getType(), d.f172325a), nVar2.getDescription(), nVar2.getValue(), nVar2.getRank()));
                    }
                    arrayList8.add(new HotelsCategorisedAmenities(bVar7, arrayList9));
                    cancellationPolicy = cancellationPolicy2;
                    lVar = lVar2;
                }
                arrayList2 = arrayList8;
            } else {
                arrayList2 = null;
            }
            arrayList5.add(new rei.k(id11, roomId, dVar5, dVar6, jVar, cancellationPolicy, cancellationRefund, tVar, roomOccupancy, uVar, specialRequest, propertyMessageLink, lVar, arrayList2));
            it12 = it13;
            str2 = str3;
            qVar = qVar2;
            eVar = eVar4;
            hotelsPropertyBrief2 = hotelsPropertyBrief3;
            bVar2 = bVar6;
        }
        String str4 = str2;
        rei.q qVar3 = qVar;
        rei.e eVar5 = eVar;
        HotelsPropertyBrief hotelsPropertyBrief4 = hotelsPropertyBrief2;
        rei.b bVar8 = bVar2;
        h1 h1Var = v0Var.k;
        if (h1Var != null) {
            Intrinsics.checkNotNullParameter(h1Var, "<this>");
            sVar = new rei.s((rei.r) u1.t(h1Var.getStatus(), rei.r.NOT_INITIATED, e));
        } else {
            sVar = null;
        }
        String str5 = v0Var.f2601l;
        DateTime dateTime4 = str5 != null ? new DateTime(str5) : null;
        Iterable iterable = v0Var.f2602m;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList10 = new ArrayList(w.t(iterable2, 10));
        Iterator it17 = iterable2.iterator();
        while (it17.hasNext()) {
            b1 b1Var2 = (b1) it17.next();
            Intrinsics.checkNotNullParameter(b1Var2, "<this>");
            String type = b1Var2.getType();
            rei.o[] oVarArrValues = rei.o.values();
            int length2 = oVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    it8 = it17;
                    oVar = null;
                    break;
                }
                oVar = oVarArrValues[i5];
                it8 = it17;
                if (a0.z(oVar.name(), type, true)) {
                    break;
                }
                i5++;
                it17 = it8;
            }
            if (oVar == null) {
                oVar = rei.o.UNKNOWN;
            }
            String source = b1Var2.getSource();
            rei.n[] nVarArrValues = rei.n.values();
            int length3 = nVarArrValues.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length3) {
                    b1Var = b1Var2;
                    nVar = null;
                    break;
                }
                nVar = nVarArrValues[i6];
                b1Var = b1Var2;
                if (a0.z(nVar.name(), source, true)) {
                    break;
                }
                i6++;
                b1Var2 = b1Var;
            }
            if (nVar == null) {
                nVar = rei.n.UNKNOWN;
            }
            String idType = b1Var.getIdType();
            rei.m[] mVarArrValues = rei.m.values();
            int length4 = mVarArrValues.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length4) {
                    mVar2 = null;
                    break;
                }
                mVar2 = mVarArrValues[i21];
                rei.m[] mVarArr = mVarArrValues;
                if (a0.z(mVar2.name(), idType, true)) {
                    break;
                }
                i21++;
                mVarArrValues = mVarArr;
            }
            if (mVar2 == null) {
                mVar2 = rei.m.UNKNOWN;
            }
            arrayList10.add(new rei.p(oVar, nVar, mVar2, b1Var.getId()));
            it17 = it8;
        }
        String str6 = v0Var.f2603n;
        if (str6 != null) {
            rei.f[] fVarArrValues = rei.f.values();
            int length5 = fVarArrValues.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length5) {
                    fVar2 = null;
                    break;
                }
                fVar2 = fVarArrValues[i22];
                if (a0.z(fVar2.name(), str6, true)) {
                    break;
                }
                i22++;
            }
            fVar = fVar2;
        } else {
            fVar = null;
        }
        a9g.r0 r0Var = v0Var.o;
        if (r0Var != null) {
            Intrinsics.checkNotNullParameter(r0Var, "<this>");
            String id13 = r0Var.getId();
            String status = r0Var.getStatus();
            qei.m[] mVarArrValues2 = qei.m.values();
            int length6 = mVarArrValues2.length;
            int i32 = 0;
            while (true) {
                if (i32 >= length6) {
                    mVar = null;
                    break;
                }
                qei.m mVar3 = mVarArrValues2[i32];
                if (a0.z(mVar3.name(), status, true)) {
                    mVar = mVar3;
                    break;
                }
                i32++;
            }
            if (mVar == null) {
                mVar = qei.m.UNKNOWN;
            }
            LocalDate localDate3 = LocalDate.parse(r0Var.getCheckIn());
            Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
            LocalDate localDate4 = LocalDate.parse(r0Var.getCheckOut());
            Intrinsics.checkNotNullExpressionValue(localDate4, "parse(...)");
            cVar = new rei.c(id13, mVar, localDate3, localDate4);
        } else {
            cVar = null;
        }
        return new rei.g(str, bVar, str4, qVar3, eVar5, hotelsPropertyBrief4, pricing, bVar8, arrayList5, iVar, sVar, dateTime4, arrayList10, fVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    public static final rei.g d(r9g.i iVar) {
        x9g.b bVar;
        HotelsPropertyContactDetails hotelsPropertyContactDetails;
        HotelsPropertyContactDetails hotelsPropertyContactDetails2;
        fgi.a aVar;
        rei.b bVar2;
        rei.s sVar;
        rei.f fVar;
        r9g.f fVar2;
        rei.f fVar3;
        Pricing pricing;
        rei.o oVar;
        r9g.q qVar;
        rei.n nVar;
        rei.m mVar;
        tei.b bVar3;
        String str;
        CancellationRefund cancellationRefund;
        ArrayList arrayList;
        PointsMonetaryValue pointsMonetaryValue;
        PointsMonetaryValue pointsMonetaryValue2;
        Object objA;
        RevPoints revPoints;
        fgi.a aVar2;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String id10 = iVar.getId();
        tei.b bVar4 = (tei.b) u1.t(iVar.getStatus(), tei.b.FAILED, f172327a);
        String bookingReference = iVar.getBookingReference();
        r9g.r traveller = iVar.getTraveller();
        Intrinsics.checkNotNullParameter(traveller, "<this>");
        h0 name = traveller.getName();
        Intrinsics.checkNotNullParameter(name, "<this>");
        rei.q qVar2 = new rei.q(new rei.u(name.getFirst(), name.getLast()), traveller.getEmail(), traveller.getPhone());
        r9g.h dates = iVar.getDates();
        Intrinsics.checkNotNullParameter(dates, "<this>");
        LocalDate localDate = LocalDate.parse(dates.getCheckIn());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        LocalDate localDate2 = LocalDate.parse(dates.getCheckOut());
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        rei.e eVar = new rei.e(localDate, localDate2);
        x9g.b property = iVar.getProperty();
        Object obj2 = h.f172332a;
        Intrinsics.checkNotNullParameter(property, "<this>");
        String id11 = property.getId();
        String name2 = property.getName();
        List images = property.getImages();
        ArrayList arrayList2 = new ArrayList(w.t(images, 10));
        Iterator it8 = images.iterator();
        while (it8.hasNext()) {
            arrayList2.add(lfi.a.k((ofi.i) it8.next()));
        }
        HotelsPropertyLocation hotelsPropertyLocationI = lfi.a.i(property.getLocation());
        HotelsPropertyCheckInDetails hotelsPropertyCheckInDetailsF = lfi.a.f(property.getCheckInDetails());
        rfi.l checkOutDetails = property.getCheckOutDetails();
        Intrinsics.checkNotNullParameter(checkOutDetails, "<this>");
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails = new HotelsPropertyCheckOutDetails(lfi.a.p(checkOutDetails.getWindow()));
        rfi.m contactDetails = property.getContactDetails();
        Object cVar = null;
        if (contactDetails != null) {
            Intrinsics.checkNotNullParameter(contactDetails, "<this>");
            bVar = property;
            hotelsPropertyContactDetails = new HotelsPropertyContactDetails(contactDetails.getPhone());
        } else {
            bVar = property;
            hotelsPropertyContactDetails = null;
        }
        String providerId = bVar.getProviderId();
        if (providerId != null) {
            fgi.a[] aVarArrValues = fgi.a.values();
            hotelsPropertyContactDetails2 = hotelsPropertyContactDetails;
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArrValues[i];
                int i2 = length;
                int i3 = i;
                if (a0.z(aVar2.name(), providerId, true)) {
                    break;
                }
                i = i3 + 1;
                length = i2;
            }
            aVar = aVar2;
        } else {
            hotelsPropertyContactDetails2 = hotelsPropertyContactDetails;
            aVar = null;
        }
        HotelsPropertyBrief hotelsPropertyBrief = new HotelsPropertyBrief(id11, name2, arrayList2, hotelsPropertyLocationI, hotelsPropertyCheckInDetailsF, hotelsPropertyCheckOutDetails, hotelsPropertyContactDetails2, aVar);
        Pricing pricingO = lfi.a.o(iVar.getPricing());
        r9g.e checkInInstruction = iVar.getCheckInInstruction();
        if (checkInInstruction != null) {
            Intrinsics.checkNotNullParameter(checkInInstruction, "<this>");
            r9g.d contactDetails2 = checkInInstruction.getContactDetails();
            Intrinsics.checkNotNullParameter(contactDetails2, "<this>");
            bVar2 = new rei.b(new rei.a(contactDetails2.getPhone(), contactDetails2.getEmail()), checkInInstruction.getMessage());
        } else {
            bVar2 = null;
        }
        List<r9g.n> rooms = iVar.getRooms();
        rei.b bVar5 = bVar2;
        ArrayList arrayList3 = new ArrayList(w.t(rooms, 10));
        for (r9g.n nVar2 : rooms) {
            Intrinsics.checkNotNullParameter(nVar2, "<this>");
            String id12 = nVar2.getId();
            String roomId = nVar2.getRoomId();
            r9g.g confirmationIds = nVar2.getConfirmationIds();
            Intrinsics.checkNotNullParameter(confirmationIds, "<this>");
            rei.d dVar = new rei.d(confirmationIds.getPartner(), confirmationIds.getProperty());
            r9g.g itineraryIds = nVar2.getItineraryIds();
            Intrinsics.checkNotNullParameter(itineraryIds, "<this>");
            String str2 = id10;
            rei.d dVar2 = new rei.d(itineraryIds.getPartner(), itineraryIds.getProperty());
            rei.j jVar = (rei.j) u1.t(nVar2.getStatus(), rei.j.CANCELLED, f172328b);
            CancellationPolicy cancellationPolicyA = j.a(nVar2.getCancellation());
            r9g.c cancellationRefund2 = nVar2.getCancellationRefund();
            if (cancellationRefund2 != null) {
                Intrinsics.checkNotNullParameter(cancellationRefund2, "<this>");
                jo3.a netRefund = cancellationRefund2.getNetRefund();
                dj0.d dVarO = netRefund != null ? mo3.a.o(netRefund) : null;
                r9g.b breakdown = cancellationRefund2.getBreakdown();
                Intrinsics.checkNotNullParameter(breakdown, "<this>");
                jo3.a originalRefund = breakdown.getOriginalRefund();
                dj0.d dVarO2 = originalRefund != null ? mo3.a.o(originalRefund) : null;
                jo3.a cancellationFee = breakdown.getCancellationFee();
                dj0.d dVarO3 = cancellationFee != null ? mo3.a.o(cancellationFee) : null;
                jo3.a cashbackReversal = breakdown.getCashbackReversal();
                dj0.d dVarO4 = cashbackReversal != null ? mo3.a.o(cashbackReversal) : null;
                jo3.a monetaryRefund = breakdown.getMonetaryRefund();
                dj0.d dVarO5 = monetaryRefund != null ? mo3.a.o(monetaryRefund) : null;
                v pointsRefund = breakdown.getPointsRefund();
                if (pointsRefund != null) {
                    Intrinsics.checkNotNullParameter(pointsRefund, "<this>");
                    bVar3 = bVar4;
                    str = bookingReference;
                    pointsMonetaryValue = new PointsMonetaryValue(qvb.a.d(pointsRefund.getPoints()), mo3.a.o(pointsRefund.getMonetaryValue()));
                } else {
                    bVar3 = bVar4;
                    str = bookingReference;
                    pointsMonetaryValue = null;
                }
                jo3.a cancellationMonetaryFee = breakdown.getCancellationMonetaryFee();
                dj0.d dVarO6 = cancellationMonetaryFee != null ? mo3.a.o(cancellationMonetaryFee) : null;
                v cancellationPointsFee = breakdown.getCancellationPointsFee();
                if (cancellationPointsFee != null) {
                    Intrinsics.checkNotNullParameter(cancellationPointsFee, "<this>");
                    pointsMonetaryValue2 = new PointsMonetaryValue(qvb.a.d(cancellationPointsFee.getPoints()), mo3.a.o(cancellationPointsFee.getMonetaryValue()));
                } else {
                    pointsMonetaryValue2 = null;
                }
                String pointsRewardReversal = breakdown.getPointsRewardReversal();
                if (pointsRewardReversal != null) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = qvb.a.d(pointsRewardReversal);
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    revPoints = (RevPoints) objA;
                } else {
                    revPoints = null;
                }
                cancellationRefund = new CancellationRefund(dVarO, new CancellationRefundBreakdown(dVarO2, dVarO3, dVarO4, dVarO5, pointsMonetaryValue, dVarO6, pointsMonetaryValue2, revPoints));
            } else {
                bVar3 = bVar4;
                str = bookingReference;
                cancellationRefund = null;
            }
            r9g.t bedConfiguration = nVar2.getBedConfiguration();
            Intrinsics.checkNotNullParameter(bedConfiguration, "<this>");
            rei.t tVar = new rei.t(bedConfiguration.getId(), bedConfiguration.getDescription());
            RoomOccupancy roomOccupancyC = j.c(nVar2.getOccupancy());
            h0 guestName = nVar2.getGuestName();
            Intrinsics.checkNotNullParameter(guestName, "<this>");
            rei.u uVar = new rei.u(guestName.getFirst(), guestName.getLast());
            String specialRequest = nVar2.getSpecialRequest();
            String propertyMessageLink = nVar2.getPropertyMessageLink();
            r9g.m roomDetails = nVar2.getRoomDetails();
            Intrinsics.checkNotNullParameter(roomDetails, "<this>");
            String id13 = roomDetails.getId();
            String name3 = roomDetails.getName();
            List images2 = roomDetails.getImages();
            rei.q qVar3 = qVar2;
            ArrayList arrayList4 = new ArrayList(w.t(images2, 10));
            Iterator it9 = images2.iterator();
            while (it9.hasNext()) {
                arrayList4.add(lfi.a.k((ofi.i) it9.next()));
            }
            rei.l lVar = new rei.l(id13, name3, arrayList4);
            List rateAmenities = nVar2.getRateAmenities();
            if (rateAmenities != null) {
                List list = rateAmenities;
                ArrayList arrayList5 = new ArrayList(w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(d.a((ofi.e) it10.next()));
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            arrayList3.add(new rei.k(id12, roomId, dVar, dVar2, jVar, cancellationPolicyA, cancellationRefund, tVar, roomOccupancyC, uVar, specialRequest, propertyMessageLink, lVar, arrayList));
            qVar2 = qVar3;
            id10 = str2;
            bVar4 = bVar3;
            bookingReference = str;
        }
        String str3 = id10;
        tei.b bVar6 = bVar4;
        String str4 = bookingReference;
        rei.q qVar4 = qVar2;
        r9g.j payment = iVar.getPayment();
        Intrinsics.checkNotNullParameter(payment, "<this>");
        Pricing pricing2 = pricingO;
        rei.i iVar2 = new rei.i((rei.h) u1.t(payment.getMode(), rei.h.WALLET, f172329c), payment.getPocketId(), payment.getCardId());
        r9g.s cashback = iVar.getCashback();
        if (cashback != null) {
            Intrinsics.checkNotNullParameter(cashback, "<this>");
            sVar = new rei.s((rei.r) u1.t(cashback.getStatus(), rei.r.NOT_INITIATED, e));
        } else {
            sVar = null;
        }
        String createdDate = iVar.getCreatedDate();
        DateTime dateTime = createdDate != null ? new DateTime(createdDate) : null;
        List transactions = iVar.getTransactions();
        if (transactions == null) {
            transactions = f0.f322471a;
        }
        List list2 = transactions;
        ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
        Iterator it11 = list2.iterator();
        while (it11.hasNext()) {
            r9g.q qVar5 = (r9g.q) it11.next();
            Intrinsics.checkNotNullParameter(qVar5, "<this>");
            String type = qVar5.getType();
            rei.o[] oVarArrValues = rei.o.values();
            int length2 = oVarArrValues.length;
            Iterator it12 = it11;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    pricing = pricing2;
                    oVar = null;
                    break;
                }
                oVar = oVarArrValues[i5];
                int i6 = i5;
                pricing = pricing2;
                if (a0.z(oVar.name(), type, true)) {
                    break;
                }
                i5 = i6 + 1;
                pricing2 = pricing;
            }
            if (oVar == null) {
                oVar = rei.o.UNKNOWN;
            }
            rei.o oVar2 = oVar;
            String source = qVar5.getSource();
            rei.n[] nVarArrValues = rei.n.values();
            int length3 = nVarArrValues.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length3) {
                    qVar = qVar5;
                    nVar = null;
                    break;
                }
                nVar = nVarArrValues[i21];
                qVar = qVar5;
                rei.n[] nVarArr = nVarArrValues;
                if (a0.z(nVar.name(), source, true)) {
                    break;
                }
                i21++;
                qVar5 = qVar;
                nVarArrValues = nVarArr;
            }
            if (nVar == null) {
                nVar = rei.n.UNKNOWN;
            }
            rei.n nVar3 = nVar;
            String idType = qVar.getIdType();
            rei.m[] mVarArrValues = rei.m.values();
            int length4 = mVarArrValues.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length4) {
                    mVar = null;
                    break;
                }
                mVar = mVarArrValues[i22];
                rei.m[] mVarArr = mVarArrValues;
                int i32 = length4;
                if (a0.z(mVar.name(), idType, true)) {
                    break;
                }
                i22++;
                mVarArrValues = mVarArr;
                length4 = i32;
            }
            if (mVar == null) {
                mVar = rei.m.UNKNOWN;
            }
            arrayList6.add(new rei.p(oVar2, nVar3, mVar, qVar.getId()));
            it11 = it12;
            pricing2 = pricing;
        }
        Pricing pricing3 = pricing2;
        String hardAmendmentEligibility = iVar.getHardAmendmentEligibility();
        if (hardAmendmentEligibility != null) {
            rei.f[] fVarArrValues = rei.f.values();
            int length5 = fVarArrValues.length;
            int i33 = 0;
            while (true) {
                if (i33 >= length5) {
                    fVar3 = null;
                    break;
                }
                fVar3 = fVarArrValues[i33];
                rei.f[] fVarArr = fVarArrValues;
                if (a0.z(fVar3.name(), hardAmendmentEligibility, true)) {
                    break;
                }
                i33++;
                fVarArrValues = fVarArr;
            }
            fVar = fVar3;
        } else {
            fVar = null;
        }
        r9g.f amendment = iVar.getAmendment();
        if (amendment != null) {
            Intrinsics.checkNotNullParameter(amendment, "<this>");
            String id14 = amendment.getId();
            String status = amendment.getStatus();
            qei.m[] mVarArrValues2 = qei.m.values();
            int length6 = mVarArrValues2.length;
            int i43 = 0;
            while (true) {
                if (i43 >= length6) {
                    fVar2 = amendment;
                    break;
                }
                qei.m mVar2 = mVarArrValues2[i43];
                fVar2 = amendment;
                qei.m[] mVarArr2 = mVarArrValues2;
                if (a0.z(mVar2.name(), status, true)) {
                    cVar = mVar2;
                    break;
                }
                i43++;
                amendment = fVar2;
                mVarArrValues2 = mVarArr2;
            }
            if (cVar == null) {
                cVar = qei.m.UNKNOWN;
            }
            LocalDate localDate3 = LocalDate.parse(fVar2.getCheckIn());
            Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
            LocalDate localDate4 = LocalDate.parse(fVar2.getCheckOut());
            Intrinsics.checkNotNullExpressionValue(localDate4, "parse(...)");
            cVar = new rei.c(id14, cVar, localDate3, localDate4);
        }
        return new rei.g(str3, bVar6, str4, qVar4, eVar, hotelsPropertyBrief, pricing3, bVar5, arrayList3, iVar2, sVar, dateTime, arrayList6, fVar, cVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
    public static final v0 e(rei.g gVar) {
        String str;
        String str2;
        a9g.h hVar;
        ArrayList arrayList;
        a9g.r rVar;
        m1 m1Var;
        h1 h1Var;
        a9g.r0 r0Var;
        a9g.f fVar;
        ArrayList arrayList2;
        c2 c2Var;
        c2 c2Var2;
        t0 t0Var;
        t0 t0Var2;
        String str3;
        rei.k kVar;
        String str4;
        a9g.c cVar;
        rei.g gVar2 = gVar;
        String str5 = "<this>";
        Intrinsics.checkNotNullParameter(gVar2, "<this>");
        String str6 = gVar2.f253604a;
        String strG = u1.g(gVar2.f253605b, f172327a);
        String str7 = gVar2.f253606c;
        rei.q qVar = gVar2.d;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        rei.u uVar = qVar.f253631a;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        d1 d1Var = new d1(new e1(uVar.f253637a, uVar.f253638b), qVar.f253632b, qVar.f253633c);
        rei.e eVar = gVar2.e;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String string = eVar.f253602a.toString();
        String str8 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = eVar.f253603b.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        u0 u0Var = new u0(string, string2);
        Pricing pricing = gVar2.f253607g;
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        String strG2 = u1.g(pricing.f98066a, j.f172335b);
        Boolean bool = pricing.f98067b;
        b2 b2VarF = f(pricing.f98068c);
        OverallPrice overallPrice = pricing.d;
        b2 b2VarF2 = overallPrice != null ? f(overallPrice) : null;
        HotelsPropertyCashback hotelsPropertyCashback = pricing.e;
        if (hotelsPropertyCashback != null) {
            Intrinsics.checkNotNullParameter(hotelsPropertyCashback, "<this>");
            str = str6;
            str2 = strG;
            hVar = new a9g.h(hotelsPropertyCashback.f98012b, hx7.a.A(hotelsPropertyCashback.f98011a));
        } else {
            str = str6;
            str2 = strG;
            hVar = null;
        }
        List list = pricing.f;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(g((HotelsPointsRedeemOption) it8.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        RevPoints revPoints = pricing.f98069g;
        String strW = revPoints != null ? revPoints.W() : null;
        HotelsPointsRedeemOption hotelsPointsRedeemOption = pricing.f98070h;
        f2 f2Var = new f2(strG2, bool, b2VarF, b2VarF2, hVar, arrayList, strW, hotelsPointsRedeemOption != null ? g(hotelsPointsRedeemOption) : null);
        rei.b bVar = gVar2.f253608h;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            rei.a aVar = bVar.f253595a;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            rVar = new a9g.r(new a9g.q(aVar.f253593a, aVar.f253594b), bVar.f253596b);
        } else {
            rVar = null;
        }
        ArrayList arrayList4 = gVar2.i;
        f2 f2Var2 = f2Var;
        ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            rei.k kVar2 = (rei.k) it9.next();
            Intrinsics.checkNotNullParameter(kVar2, str5);
            String str9 = kVar2.f253616a;
            String str10 = kVar2.f253617b;
            rei.d dVar = kVar2.f253618c;
            Intrinsics.checkNotNullParameter(dVar, str5);
            t0 t0Var3 = new t0(dVar.f253600a, dVar.f253601b);
            rei.d dVar2 = kVar2.d;
            Intrinsics.checkNotNullParameter(dVar2, str5);
            Iterator it10 = it9;
            t0 t0Var4 = new t0(dVar2.f253600a, dVar2.f253601b);
            String strG3 = u1.g(kVar2.e, f172328b);
            CancellationPolicy cancellationPolicy = kVar2.f;
            Intrinsics.checkNotNullParameter(cancellationPolicy, str5);
            boolean z = cancellationPolicy.f98092a;
            f2 f2Var3 = f2Var2;
            boolean z3 = cancellationPolicy.f98093b;
            ArrayList arrayList6 = cancellationPolicy.f98094c;
            String str11 = str7;
            d1 d1Var2 = d1Var;
            u0 u0Var2 = u0Var;
            ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                CancellationWindow cancellationWindow = (CancellationWindow) it11.next();
                Intrinsics.checkNotNullParameter(cancellationWindow, str5);
                Iterator it12 = it11;
                DateTime dateTime = cancellationWindow.f98095a;
                String string3 = dateTime != null ? dateTime.toString() : null;
                a9g.r rVar2 = rVar;
                DateTime dateTime2 = cancellationWindow.f98096b;
                String string4 = dateTime2 != null ? dateTime2.toString() : null;
                String str12 = str9;
                String str13 = str10;
                String strG4 = u1.g(cancellationWindow.f98097c, d);
                CancelPenalties cancelPenalties = cancellationWindow.d;
                Intrinsics.checkNotNullParameter(cancelPenalties, str5);
                if (cancelPenalties instanceof AmountCancellationPenalty) {
                    t0Var = t0Var4;
                    t0Var2 = t0Var3;
                    cVar = new a9g.c(hx7.a.A(((AmountCancellationPenalty) cancelPenalties).f98080a), null, null, 6);
                } else {
                    t0Var = t0Var4;
                    t0Var2 = t0Var3;
                    if (cancelPenalties instanceof NightsCancellationPenalty) {
                        cVar = new a9g.c(null, null, Integer.valueOf(((NightsCancellationPenalty) cancelPenalties).f98081a), 3);
                    } else if (cancelPenalties instanceof PercentageCancellationPenalty) {
                        str3 = str5;
                        cVar = new a9g.c(null, Double.valueOf(((PercentageCancellationPenalty) cancelPenalties).f98084a), null, 5);
                        kVar = kVar2;
                        str4 = str8;
                        arrayList7.add(new a9g.g(string3, string4, strG4, cVar));
                        str8 = str4;
                        str5 = str3;
                        it11 = it12;
                        str9 = str12;
                        str10 = str13;
                        t0Var3 = t0Var2;
                        t0Var4 = t0Var;
                        kVar2 = kVar;
                        rVar = rVar2;
                    } else {
                        str3 = str5;
                        if (cancelPenalties instanceof AmountAndPercentagePenalties) {
                            AmountAndPercentagePenalties amountAndPercentagePenalties = (AmountAndPercentagePenalties) cancelPenalties;
                            kVar = kVar2;
                            str4 = str8;
                            cVar = new a9g.c(hx7.a.A(amountAndPercentagePenalties.f98078a), Double.valueOf(amountAndPercentagePenalties.f98079b), null, 4);
                        } else {
                            kVar = kVar2;
                            str4 = str8;
                            if (cancelPenalties instanceof AmountAndNightsPenalties) {
                                AmountAndNightsPenalties amountAndNightsPenalties = (AmountAndNightsPenalties) cancelPenalties;
                                cVar = new a9g.c(hx7.a.A(amountAndNightsPenalties.f98076a), null, Integer.valueOf(amountAndNightsPenalties.f98077b), 2);
                            } else if (cancelPenalties instanceof NoRefundPenalty) {
                                cVar = new a9g.c(null, Double.valueOf(100.0d), null, 5);
                            } else {
                                if (!(cancelPenalties instanceof NoCancellationPenalty)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = new a9g.c(null, null, null, 7);
                            }
                        }
                        arrayList7.add(new a9g.g(string3, string4, strG4, cVar));
                        str8 = str4;
                        str5 = str3;
                        it11 = it12;
                        str9 = str12;
                        str10 = str13;
                        t0Var3 = t0Var2;
                        t0Var4 = t0Var;
                        kVar2 = kVar;
                        rVar = rVar2;
                    }
                }
                str3 = str5;
                kVar = kVar2;
                str4 = str8;
                arrayList7.add(new a9g.g(string3, string4, strG4, cVar));
                str8 = str4;
                str5 = str3;
                it11 = it12;
                str9 = str12;
                str10 = str13;
                t0Var3 = t0Var2;
                t0Var4 = t0Var;
                kVar2 = kVar;
                rVar = rVar2;
            }
            String str14 = str5;
            String str15 = str8;
            a9g.r rVar3 = rVar;
            String str16 = str9;
            String str17 = str10;
            t0 t0Var5 = t0Var4;
            t0 t0Var6 = t0Var3;
            a9g.d dVar3 = new a9g.d(arrayList7, z, z3);
            CancellationRefund cancellationRefund = kVar2.f253619g;
            if (cancellationRefund != null) {
                Intrinsics.checkNotNullParameter(cancellationRefund, str14);
                dj0.d dVar4 = cancellationRefund.f97876a;
                jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                CancellationRefundBreakdown cancellationRefundBreakdown = cancellationRefund.f97877b;
                Intrinsics.checkNotNullParameter(cancellationRefundBreakdown, str14);
                dj0.d dVar5 = cancellationRefundBreakdown.f97878a;
                jo3.b bVarA2 = dVar5 != null ? hx7.a.A(dVar5) : null;
                dj0.d dVar6 = cancellationRefundBreakdown.f97879b;
                jo3.b bVarA3 = dVar6 != null ? hx7.a.A(dVar6) : null;
                dj0.d dVar7 = cancellationRefundBreakdown.f97880c;
                jo3.b bVarA4 = dVar7 != null ? hx7.a.A(dVar7) : null;
                dj0.d dVar8 = cancellationRefundBreakdown.d;
                jo3.b bVarA5 = dVar8 != null ? hx7.a.A(dVar8) : null;
                PointsMonetaryValue pointsMonetaryValue = cancellationRefundBreakdown.e;
                if (pointsMonetaryValue != null) {
                    Intrinsics.checkNotNullParameter(pointsMonetaryValue, str14);
                    c2Var = new c2(pointsMonetaryValue.f97885a.W(), hx7.a.A(pointsMonetaryValue.f97886b));
                } else {
                    c2Var = null;
                }
                dj0.d dVar9 = cancellationRefundBreakdown.f;
                jo3.b bVarA6 = dVar9 != null ? hx7.a.A(dVar9) : null;
                PointsMonetaryValue pointsMonetaryValue2 = cancellationRefundBreakdown.f97881g;
                if (pointsMonetaryValue2 != null) {
                    Intrinsics.checkNotNullParameter(pointsMonetaryValue2, str14);
                    c2Var2 = new c2(pointsMonetaryValue2.f97885a.W(), hx7.a.A(pointsMonetaryValue2.f97886b));
                } else {
                    c2Var2 = null;
                }
                RevPoints revPoints2 = cancellationRefundBreakdown.f97882h;
                fVar = new a9g.f(bVarA, new a9g.e(bVarA2, bVarA3, bVarA4, bVarA5, c2Var, bVarA6, c2Var2, revPoints2 != null ? revPoints2.W() : null));
            } else {
                fVar = null;
            }
            rei.t tVar = kVar2.f253620h;
            Intrinsics.checkNotNullParameter(tVar, str14);
            q1 q1Var = new q1(tVar.f253635a, tVar.f253636b);
            RoomOccupancy roomOccupancy = kVar2.i;
            Intrinsics.checkNotNullParameter(roomOccupancy, str14);
            j2 j2Var = new j2(roomOccupancy.f98119a, roomOccupancy.f98120b);
            rei.u uVar2 = kVar2.f253621j;
            Intrinsics.checkNotNullParameter(uVar2, str14);
            e1 e1Var = new e1(uVar2.f253637a, uVar2.f253638b);
            String str18 = kVar2.k;
            String str19 = kVar2.f253622l;
            rei.l lVar = kVar2.f253623m;
            Intrinsics.checkNotNullParameter(lVar, str14);
            String str20 = lVar.f253625a;
            String str21 = lVar.f253626b;
            ArrayList<Image> arrayList8 = lVar.f253627c;
            ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
            for (Image image : arrayList8) {
                Object obj2 = h.f172332a;
                Intrinsics.checkNotNullParameter(image, str14);
                arrayList9.add(new y1(image.f98054a, u1.g(image.f98055b, h.f172332a), image.f98056c, image.d));
                dVar3 = dVar3;
                str18 = str18;
                str15 = str15;
            }
            a9g.d dVar10 = dVar3;
            String str22 = str15;
            String str23 = str18;
            y0 y0Var = new y0(str20, str21, arrayList9);
            List list3 = kVar2.f253624n;
            if (list3 != null) {
                List<HotelsCategorisedAmenities> list4 = list3;
                ArrayList arrayList10 = new ArrayList(w.t(list4, 10));
                for (HotelsCategorisedAmenities hotelsCategorisedAmenities : list4) {
                    Object obj3 = d.f172325a;
                    Intrinsics.checkNotNullParameter(hotelsCategorisedAmenities, str14);
                    String strG5 = u1.g(hotelsCategorisedAmenities.f97840a, d.f172326b);
                    List<HotelsAmenity> list5 = hotelsCategorisedAmenities.f97841b;
                    ArrayList arrayList11 = new ArrayList(w.t(list5, 10));
                    for (HotelsAmenity hotelsAmenity : list5) {
                        Intrinsics.checkNotNullParameter(hotelsAmenity, str14);
                        arrayList11.add(new a9g.n(hotelsAmenity.f97837a, u1.g(hotelsAmenity.f97838b, d.f172325a), hotelsAmenity.f97839c, hotelsAmenity.d, hotelsAmenity.e));
                    }
                    arrayList10.add(new a9g.p(strG5, arrayList11));
                }
                arrayList2 = arrayList10;
            } else {
                arrayList2 = null;
            }
            arrayList5.add(new z0(str16, str17, t0Var6, t0Var5, strG3, dVar10, fVar, q1Var, j2Var, e1Var, str23, str19, y0Var, arrayList2));
            gVar2 = gVar;
            str5 = str14;
            it9 = it10;
            f2Var2 = f2Var3;
            str7 = str11;
            d1Var = d1Var2;
            u0Var = u0Var2;
            rVar = rVar3;
            str8 = str22;
        }
        f2 f2Var4 = f2Var2;
        String str24 = str7;
        d1 d1Var3 = d1Var;
        u0 u0Var3 = u0Var;
        String str25 = str8;
        a9g.r rVar4 = rVar;
        String str26 = str5;
        rei.i iVar = gVar2.f253609j;
        Intrinsics.checkNotNullParameter(iVar, str26);
        w0 w0Var = new w0(u1.g(iVar.f253613a, f172329c), iVar.f253614b, iVar.f253615c);
        HotelsPropertyBrief hotelsPropertyBrief = gVar2.f;
        Object obj4 = h.f172332a;
        Intrinsics.checkNotNullParameter(hotelsPropertyBrief, str26);
        String str27 = hotelsPropertyBrief.f98005a;
        String str28 = hotelsPropertyBrief.f98006b;
        ArrayList<Image> arrayList12 = hotelsPropertyBrief.f98007c;
        ArrayList arrayList13 = new ArrayList(w.t(arrayList12, 10));
        for (Image image2 : arrayList12) {
            Intrinsics.checkNotNullParameter(image2, str26);
            arrayList13.add(new y1(image2.f98054a, u1.g(image2.f98055b, h.f172332a), image2.f98056c, image2.d));
        }
        HotelsPropertyLocation hotelsPropertyLocation = hotelsPropertyBrief.d;
        Intrinsics.checkNotNullParameter(hotelsPropertyLocation, str26);
        a9g.i iVarS = ta6.a.S(hotelsPropertyLocation.f98039a);
        Country country = hotelsPropertyLocation.f98040b;
        Intrinsics.checkNotNullParameter(country, str26);
        p1 p1Var = new p1(iVarS, new a9g.k(country.f97951a, country.f97952b), h.c(hotelsPropertyLocation.f98041c));
        HotelsPropertyCheckInDetails hotelsPropertyCheckInDetails = hotelsPropertyBrief.e;
        Intrinsics.checkNotNullParameter(hotelsPropertyCheckInDetails, str26);
        l2 l2VarZ = tz4.d.z(hotelsPropertyCheckInDetails.f98013a);
        HotelsPropertyCheckInInfo hotelsPropertyCheckInInfo = hotelsPropertyCheckInDetails.f98015c;
        Intrinsics.checkNotNullParameter(hotelsPropertyCheckInInfo, str26);
        j1 j1Var = new j1(l2VarZ, new k1(hotelsPropertyCheckInInfo.f98016a, hotelsPropertyCheckInInfo.f98017b), hotelsPropertyCheckInDetails.f98014b);
        HotelsPropertyCheckOutDetails hotelsPropertyCheckOutDetails = hotelsPropertyBrief.f;
        Intrinsics.checkNotNullParameter(hotelsPropertyCheckOutDetails, str26);
        l1 l1Var = new l1(tz4.d.z(hotelsPropertyCheckOutDetails.f98018a));
        HotelsPropertyContactDetails hotelsPropertyContactDetails = hotelsPropertyBrief.f98008g;
        if (hotelsPropertyContactDetails != null) {
            Intrinsics.checkNotNullParameter(hotelsPropertyContactDetails, str26);
            m1Var = new m1(hotelsPropertyContactDetails.f98019a);
        } else {
            m1Var = null;
        }
        fgi.a aVar2 = hotelsPropertyBrief.f98009h;
        f1 f1Var = new f1(str27, str28, arrayList13, p1Var, j1Var, l1Var, m1Var, aVar2 != null ? aVar2.toString() : null);
        rei.s sVar = gVar2.k;
        if (sVar != null) {
            Intrinsics.checkNotNullParameter(sVar, str26);
            h1Var = new h1(u1.g(sVar.f253634a, e));
        } else {
            h1Var = null;
        }
        DateTime dateTime3 = gVar2.f253610l;
        String string5 = dateTime3 != null ? dateTime3.toString() : null;
        ArrayList<rei.p> arrayList14 = gVar2.f253611m;
        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
        for (rei.p pVar : arrayList14) {
            Intrinsics.checkNotNullParameter(pVar, str26);
            arrayList15.add(new b1(pVar.f253628a.name(), pVar.f253629b.name(), pVar.f253630c.name(), pVar.d));
        }
        rei.f fVar2 = gVar2.f253612n;
        String strName = fVar2 != null ? fVar2.name() : null;
        rei.c cVar2 = gVar2.o;
        if (cVar2 != null) {
            Intrinsics.checkNotNullParameter(cVar2, str26);
            String str29 = cVar2.f253597a;
            String strName2 = cVar2.f253598b.name();
            String string6 = cVar2.f253599c.toString();
            Intrinsics.checkNotNullExpressionValue(string6, str25);
            String string7 = cVar2.d.toString();
            Intrinsics.checkNotNullExpressionValue(string7, str25);
            r0Var = new a9g.r0(str29, strName2, string6, string7);
        } else {
            r0Var = null;
        }
        return new v0(str, str2, str24, d1Var3, u0Var3, f1Var, f2Var4, rVar4, arrayList5, w0Var, h1Var, string5, arrayList15, strName, r0Var);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    public static final b2 f(OverallPrice overallPrice) {
        Intrinsics.checkNotNullParameter(overallPrice, "<this>");
        jo3.b bVarA = hx7.a.A(overallPrice.f98057a);
        jo3.b bVarA2 = hx7.a.A(overallPrice.f98058b);
        dj0.d dVar = overallPrice.f98059c;
        jo3.b bVarA3 = dVar != null ? hx7.a.A(dVar) : null;
        ArrayList<PriceFee> arrayList = overallPrice.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (PriceFee priceFee : arrayList) {
            Intrinsics.checkNotNullParameter(priceFee, "<this>");
            arrayList2.add(new e2(u1.g(priceFee.f98063a, lfi.a.e), priceFee.f98064b, hx7.a.A(priceFee.d), priceFee.f98065c));
        }
        dj0.d dVar2 = overallPrice.e;
        return new b2(bVarA, bVarA2, bVarA3, arrayList2, dVar2 != null ? hx7.a.A(dVar2) : null);
    }

    public static final d2 g(HotelsPointsRedeemOption hotelsPointsRedeemOption) {
        Intrinsics.checkNotNullParameter(hotelsPointsRedeemOption, "<this>");
        String str = hotelsPointsRedeemOption.f97975a;
        String strW = hotelsPointsRedeemOption.f97976b.W();
        jo3.b bVarA = hx7.a.A(hotelsPointsRedeemOption.f97977c);
        RevPoints revPoints = hotelsPointsRedeemOption.d;
        return new d2(str, strW, revPoints != null ? revPoints.W() : null, hotelsPointsRedeemOption.e, bVarA);
    }
}
