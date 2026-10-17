package a72;

import akl.w1;
import au6.c3;
import au6.k3;
import au6.l0;
import au6.r3;
import au6.u1;
import au6.x1;
import au6.y3;
import au6.z1;
import b4g.c0;
import b4g.h0;
import b4g.i0;
import b4g.n;
import b4g.q;
import b4g.s;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreview;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewItineraryDetails;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewParams;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewPayment;
import com.revolut.feature.travel.flights.models.domain.booking.EmergencyContact;
import com.revolut.feature.travel.flights.models.domain.booking.OfferDetails;
import com.revolut.feature.travel.flights.models.domain.booking.PrimaryContact;
import com.revolut.feature.travel.flights.models.domain.booking.TravelDocument;
import com.revolut.feature.travel.flights.models.domain.booking.TravelFlightsAirlineLegalReference;
import com.revolut.feature.travel.flights.models.domain.booking.TravelFlightsLegalAcceptance;
import com.revolut.feature.travel.flights.models.domain.booking.TravelFlightsPartnerLegalReference;
import com.revolut.feature.travel.flights.models.domain.booking.TravellerDetails;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFareBaggageItem;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFareExtraBenefit;
import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import com.revolut.feature.travel.flights.models.domain.payment.PriceWithPoints;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.FlowCollector;
import l7g.y;
import s7g.a1;
import s7g.b2;
import s7g.d1;
import s7g.g1;
import s7g.j1;
import s7g.k2;
import s7g.m1;
import s7g.n2;
import s7g.o2;
import s7g.p1;
import s7g.r2;
import s7g.s1;
import s7g.v1;
import s7g.x0;
import s7g.y1;
import t7g.u;
import w7g.r;
import yhm.o;
import z7g.x;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f1759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1760x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f1760x = obj2;
    }

    private final Object b(Object obj2) {
        String str = (String) this.f1759w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        TravelFlightsApi travelFlightsApi = ((b4g.f) this.f1760x).f12329a;
        this.f1759w = null;
        this.v = 1;
        Object bookingDetails = travelFlightsApi.getBookingDetails(str, this);
        return bookingDetails == aVar ? aVar : bookingDetails;
    }

    private final Object c(Object obj2) {
        b4g.m mVar = (b4g.m) this.f1759w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        q qVar = (q) this.f1760x;
        this.f1759w = null;
        this.v = 1;
        Object objA = q.a(qVar, mVar, this);
        return objA == aVar ? aVar : objA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsAirProductPriceBreakdown] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsExtraProductsPriceBreakdown] */
    /* JADX WARN: Type inference failed for: r18v6 */
    private final Object n(Object obj2) {
        BookingPreviewItineraryDetails bookingPreviewItineraryDetails;
        Object objPreviewBooking;
        String str;
        b2 b2Var;
        Iterator it8;
        String str2;
        p1 p1Var;
        ?? r162;
        n nVar = (n) this.f1759w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            TravelFlightsApi travelFlightsApi = ((q) this.f1760x).f12358a;
            BookingPreviewParams bookingPreviewParams = nVar.f12353a;
            Intrinsics.checkNotNullParameter(bookingPreviewParams, "<this>");
            String str3 = bookingPreviewParams.f93449a;
            PrimaryContact primaryContact = bookingPreviewParams.f93450b;
            Intrinsics.checkNotNullParameter(primaryContact, "<this>");
            String str4 = primaryContact.f93465a;
            String str5 = primaryContact.f93466b;
            PhoneNumber phoneNumber = primaryContact.f93467c;
            Intrinsics.checkNotNullParameter(phoneNumber, "<this>");
            v1 v1Var = new v1(str4, str5, new t7g.o(phoneNumber.f93496a, phoneNumber.f93497b));
            List list = bookingPreviewParams.f93451c;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                TravellerDetails travellerDetails = (TravellerDetails) it9.next();
                Intrinsics.checkNotNullParameter(travellerDetails, "<this>");
                String str6 = travellerDetails.f93480a;
                String str7 = travellerDetails.f93481b;
                String str8 = travellerDetails.f93482c;
                y yVar = travellerDetails.d;
                String strName = yVar != null ? yVar.name() : null;
                LocalDate localDate = travellerDetails.e;
                String string = localDate != null ? localDate.toString() : null;
                TravelDocument travelDocument = travellerDetails.f;
                if (travelDocument != null) {
                    Intrinsics.checkNotNullParameter(travelDocument, "<this>");
                    str = str8;
                    String str9 = travelDocument.f93468a;
                    LocalDate localDate2 = travelDocument.f93469b;
                    String string2 = localDate2 != null ? localDate2.toString() : null;
                    String str10 = travelDocument.f93470c;
                    String str11 = travelDocument.d;
                    LocalDate localDate3 = travelDocument.e;
                    b2Var = new b2(str9, string2, str10, str11, localDate3 != null ? localDate3.toString() : null);
                } else {
                    str = str8;
                    b2Var = null;
                }
                EmergencyContact emergencyContact = travellerDetails.f93483g;
                if (emergencyContact != null) {
                    Intrinsics.checkNotNullParameter(emergencyContact, "<this>");
                    String str12 = emergencyContact.f93460a;
                    PhoneNumber phoneNumber2 = emergencyContact.f93461b;
                    Intrinsics.checkNotNullParameter(phoneNumber2, "<this>");
                    str2 = str7;
                    it8 = it9;
                    p1Var = new p1(str12, new t7g.o(phoneNumber2.f93496a, phoneNumber2.f93497b));
                } else {
                    it8 = it9;
                    str2 = str7;
                    p1Var = null;
                }
                arrayList.add(new r2(str6, str2, str, strName, string, b2Var, p1Var));
                it9 = it8;
            }
            List listO0 = d0.O0(bookingPreviewParams.d);
            ArrayList arrayList2 = new ArrayList(w.t(listO0, 10));
            Iterator it10 = listO0.iterator();
            while (it10.hasNext()) {
                arrayList2.add(new y1((String) it10.next()));
            }
            g1 g1Var = new g1(str3, v1Var, arrayList, arrayList2);
            String str13 = nVar.f12354b;
            bookingPreviewItineraryDetails = null;
            this.f1759w = null;
            this.v = 1;
            objPreviewBooking = travelFlightsApi.previewBooking(g1Var, str13, this);
            if (objPreviewBooking == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objPreviewBooking = obj2;
            bookingPreviewItineraryDetails = null;
        }
        j1 j1Var = (j1) objPreviewBooking;
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        String str14 = j1Var.f260747a;
        d1 d1Var = j1Var.f260748b;
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        dj0.d dVarO = mo3.a.o(d1Var.f260698a);
        z7g.l lVar = d1Var.f260699b;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        PriceWithPoints priceWithPoints = new PriceWithPoints(c8g.b.a(lVar.f319985b), mo3.a.o(lVar.f319984a));
        RevPoints revPointsA = c8g.b.a(d1Var.f260700c);
        jo3.a aVar2 = d1Var.d;
        ?? O = aVar2 != null ? mo3.a.o(aVar2) : bookingPreviewItineraryDetails;
        dj0.d dVarO2 = mo3.a.o(d1Var.e);
        List<z7g.i> list2 = d1Var.f;
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        for (z7g.i iVar : list2) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            arrayList3.add(new PointsRedeemOption(c8g.b.a(iVar.f319981b), c8g.b.a(iVar.e), mo3.a.o(iVar.f319982c), iVar.f319980a, iVar.d));
        }
        List list3 = d1Var.f260701g;
        if (list3 != null) {
            List list4 = list3;
            ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
            Iterator it11 = list4.iterator();
            while (it11.hasNext()) {
                arrayList4.add(c8g.b.d((x) it11.next()));
            }
            r162 = arrayList4;
        } else {
            r162 = bookingPreviewItineraryDetails;
        }
        z7g.o oVar = d1Var.f260702h;
        ?? C = oVar != null ? c8g.b.c(oVar) : bookingPreviewItineraryDetails;
        z7g.d0 d0Var = d1Var.i;
        BookingPreviewPayment bookingPreviewPayment = new BookingPreviewPayment(dVarO, priceWithPoints, revPointsA, O, dVarO2, arrayList3, r162, C, d0Var != null ? c8g.b.e(d0Var) : bookingPreviewItineraryDetails);
        s1 s1Var = j1Var.f260749c;
        Intrinsics.checkNotNullParameter(s1Var, "<this>");
        String str15 = s1Var.f260795a;
        List list5 = s1Var.f260796b;
        ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
        Iterator it12 = list5.iterator();
        while (it12.hasNext()) {
            arrayList5.add(hx7.b.B((x0) it12.next()));
        }
        a1 a1Var = s1Var.f260797c;
        if (a1Var != null) {
            List list6 = a1Var.f260685b;
            Intrinsics.checkNotNullParameter(a1Var, "<this>");
            s7g.n nVar2 = (s7g.n) d0.d0(list6);
            if (nVar2 != null) {
                bookingPreviewItineraryDetails = new BookingPreviewItineraryDetails(a1Var.f260684a, nVar2.f260765a.f268676b, nVar2.f260766b.f268676b, list6.size() > 1);
            }
        }
        OfferDetails offerDetails = new OfferDetails(str15, arrayList5, bookingPreviewItineraryDetails);
        n2 n2Var = j1Var.d;
        Intrinsics.checkNotNullParameter(n2Var, "<this>");
        o2 o2Var = n2Var.f260770a;
        Intrinsics.checkNotNullParameter(o2Var, "<this>");
        TravelFlightsPartnerLegalReference travelFlightsPartnerLegalReference = new TravelFlightsPartnerLegalReference(o2Var.f260776a, o2Var.f260777b, o2Var.f260778c);
        List<k2> list7 = n2Var.f260771b;
        ArrayList arrayList6 = new ArrayList(w.t(list7, 10));
        for (k2 k2Var : list7) {
            Intrinsics.checkNotNullParameter(k2Var, "<this>");
            arrayList6.add(new TravelFlightsAirlineLegalReference(k2Var.f260752a, k2Var.f260753b, k2Var.f260754c, k2Var.d, k2Var.e, k2Var.f, k2Var.f260755g));
        }
        TravelFlightsLegalAcceptance travelFlightsLegalAcceptance = new TravelFlightsLegalAcceptance(travelFlightsPartnerLegalReference, arrayList6);
        List list8 = j1Var.e;
        ArrayList arrayList7 = new ArrayList(w.t(list8, 10));
        Iterator it13 = list8.iterator();
        while (it13.hasNext()) {
            arrayList7.add(hx7.e.x((u) it13.next()));
        }
        return new BookingPreview(str14, bookingPreviewPayment, offerDetails, travelFlightsLegalAcceptance, arrayList7, j1Var.f);
    }

    private final Object o(Object obj2) {
        String str = (String) this.f1759w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            TravelFlightsApi travelFlightsApi = ((q) this.f1760x).f12358a;
            this.f1759w = null;
            this.v = 1;
            obj2 = travelFlightsApi.getBookingStatus(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return c8g.a.H((m1) obj2);
    }

    private final Object p(Object obj2) {
        s sVar = (s) this.f1759w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        TravelFlightsApi travelFlightsApi = ((b4g.u) this.f1760x).f12363a;
        String str = sVar.f12361a;
        String str2 = sVar.f12362b;
        this.f1759w = null;
        this.v = 1;
        TravelFlightsApi.Companion companion = TravelFlightsApi.INSTANCE;
        Object bookingReceipts = travelFlightsApi.getBookingReceipts(str, str2, "60611f9b-e539-476e-912b-1be604544a36", this);
        return bookingReceipts == aVar ? aVar : bookingReceipts;
    }

    private final Object s(Object obj2) {
        Object fareOptions;
        Iterator it8;
        boolean z;
        p7g.d dVar;
        b4g.x xVar = (b4g.x) this.f1759w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        boolean z3 = true;
        if (i == 0) {
            o.b(obj2);
            TravelFlightsApi travelFlightsApi = ((b4g.y) this.f1760x).f12369a;
            String str = xVar.f12367a;
            String str2 = xVar.f12368b;
            this.f1759w = null;
            this.v = 1;
            fareOptions = travelFlightsApi.getFareOptions(str, str2, this);
            if (fareOptions == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            fareOptions = obj2;
        }
        r rVar = (r) fareOptions;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        List list = rVar.f295543a;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            w7g.l lVar = (w7g.l) it9.next();
            String str3 = lVar.f295534a;
            String str4 = lVar.f295535b;
            List<w7g.i> list2 = lVar.f295536c;
            ArrayList arrayList2 = new ArrayList(w.t(list2, i2));
            for (w7g.i iVar : list2) {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                boolean z4 = iVar.f295529a;
                p7g.c cVar = p7g.d.Companion;
                String str5 = iVar.f295530b;
                cVar.getClass();
                if (str5 != null) {
                    p7g.d[] dVarArrValues = p7g.d.values();
                    int length = dVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            it8 = it9;
                            z = true;
                            dVar = null;
                            break;
                        }
                        dVar = dVarArrValues[i3];
                        it8 = it9;
                        z = true;
                        if (a0.z(dVar.name(), str5, true)) {
                            break;
                        }
                        i3++;
                        it9 = it8;
                    }
                    if (dVar == null) {
                    }
                    arrayList2.add(new TravelFlightsFareBaggageItem(z4, dVar, iVar.f295531c, iVar.d, iVar.e, iVar.f));
                    z3 = z;
                    it9 = it8;
                } else {
                    it8 = it9;
                    z = z3;
                }
                dVar = p7g.d.UNKNOWN;
                arrayList2.add(new TravelFlightsFareBaggageItem(z4, dVar, iVar.f295531c, iVar.d, iVar.e, iVar.f));
                z3 = z;
                it9 = it8;
            }
            Iterator it10 = it9;
            boolean z6 = z3;
            List<w7g.o> list3 = lVar.d;
            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
            for (w7g.o oVar : list3) {
                Intrinsics.checkNotNullParameter(oVar, "<this>");
                arrayList3.add(new TravelFlightsFareExtraBenefit(oVar.f295539a, oVar.f295540b));
            }
            List list4 = lVar.e;
            ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
            Iterator it11 = list4.iterator();
            while (it11.hasNext()) {
                arrayList4.add(hx7.i.K((v7g.f) it11.next()));
            }
            arrayList.add(new TravelFlightsFare(str3, str4, arrayList2, arrayList3, arrayList4, c8g.b.b(lVar.f), lVar.f295537g));
            z3 = z6;
            i2 = 10;
            it9 = it10;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.f1759w
            java.lang.String r1 = (java.lang.String) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.v
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1e
            if (r3 != r5) goto L16
            yhm.o.b(r17)
            r1 = r17
            goto L32
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            yhm.o.b(r17)
            java.lang.Object r3 = r0.f1760x
            b4g.a0 r3 = (b4g.a0) r3
            com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi r3 = r3.f12314a
            r0.f1759w = r4
            r0.v = r5
            java.lang.Object r1 = r3.searchLocations(r1, r0)
            if (r1 != r2) goto L32
            return r2
        L32:
            x7g.f r1 = (x7g.f) r1
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.List r1 = r1.f303198a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = zhm.w.t(r1, r6)
            r3.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L4c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r1.next()
            x7g.c r6 = (x7g.c) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.revolut.feature.travel.flights.models.domain.location.LocationSearchResult r7 = new com.revolut.feature.travel.flights.models.domain.location.LocationSearchResult
            java.lang.String r8 = r6.f303193a
            java.lang.String r9 = r6.f303194b
            java.lang.String r10 = r6.f303195c
            m7g.e r11 = m7g.f.Companion
            java.lang.String r12 = r6.d
            r11.getClass()
            if (r12 == 0) goto L8b
            m7g.f[] r11 = m7g.f.values()
            int r13 = r11.length
            r14 = 0
        L72:
            if (r14 >= r13) goto L85
            r15 = r11[r14]
            java.lang.String r4 = r15.name()
            boolean r4 = kotlin.text.a0.z(r4, r12, r5)
            if (r4 == 0) goto L81
            goto L86
        L81:
            int r14 = r14 + 1
            r4 = 0
            goto L72
        L85:
            r15 = 0
        L86:
            if (r15 != 0) goto L89
            goto L8b
        L89:
            r11 = r15
            goto L8e
        L8b:
            m7g.f r15 = m7g.f.UNKNOWN
            goto L89
        L8e:
            java.lang.String r12 = r6.e
            java.lang.String r13 = r6.f
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r3.add(r7)
            r4 = 0
            goto L4c
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a72.k.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a72.k.u(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                k kVar = new k((m) this.f1760x, (Continuation) obj4, 0);
                kVar.f1759w = (String) obj3;
                return kVar.invokeSuspend(Unit.f186387a);
            case 1:
                k kVar2 = new k((acd.a) this.f1760x, (Continuation) obj4, 1);
                kVar2.f1759w = (mcd.c) obj3;
                return kVar2.invokeSuspend(Unit.f186387a);
            case 2:
                k kVar3 = new k((ae6.c) this.f1760x, (Continuation) obj4, 2);
                kVar3.f1759w = (FlowCollector) obj2;
                return kVar3.invokeSuspend(Unit.f186387a);
            case 3:
                k kVar4 = new k((akl.r) this.f1760x, (Continuation) obj4, 3);
                kVar4.f1759w = (akl.m) obj3;
                return kVar4.invokeSuspend(Unit.f186387a);
            case 4:
                k kVar5 = new k((w1) this.f1760x, (Continuation) obj4, 4);
                kVar5.f1759w = (akl.v1) obj3;
                return kVar5.invokeSuspend(Unit.f186387a);
            case 5:
                k kVar6 = new k((ald.a) this.f1760x, (Continuation) obj4, 5);
                kVar6.f1759w = (SlotChecklistFetchConfig) obj3;
                return kVar6.invokeSuspend(Unit.f186387a);
            case 6:
                k kVar7 = new k((au6.d0) this.f1760x, (Continuation) obj4, 6);
                kVar7.f1759w = (AcquiringPaymentsQuery) obj3;
                return kVar7.invokeSuspend(Unit.f186387a);
            case 7:
                String str = ((AcquiringPayment$Id) obj3).f73363a;
                k kVar8 = new k((au6.d0) this.f1760x, (Continuation) obj4, 7);
                kVar8.f1759w = str;
                return kVar8.invokeSuspend(Unit.f186387a);
            case 8:
                k kVar9 = new k((l0) this.f1760x, (Continuation) obj4, 8);
                kVar9.f1759w = (xi0.b) obj3;
                return kVar9.invokeSuspend(Unit.f186387a);
            case 9:
                k kVar10 = new k((au6.p1) this.f1760x, (Continuation) obj4, 9);
                kVar10.f1759w = (ur6.b) obj3;
                return kVar10.invokeSuspend(Unit.f186387a);
            case 10:
                k kVar11 = new k((u1) this.f1760x, (Continuation) obj4, 10);
                kVar11.f1759w = (String) obj3;
                return kVar11.invokeSuspend(Unit.f186387a);
            case 11:
                return new k((x1) this.f1760x, (Continuation) obj4, 11).invokeSuspend(Unit.f186387a);
            case 12:
                k kVar12 = new k((z1) this.f1760x, (Continuation) obj4, 12);
                kVar12.f1759w = (ir6.c) obj3;
                return kVar12.invokeSuspend(Unit.f186387a);
            case 13:
                k kVar13 = new k((c3) this.f1760x, (Continuation) obj4, 13);
                kVar13.f1759w = (String) obj3;
                return kVar13.invokeSuspend(Unit.f186387a);
            case 14:
                k kVar14 = new k((k3) this.f1760x, (Continuation) obj4, 14);
                kVar14.f1759w = (ds6.j) obj3;
                return kVar14.invokeSuspend(Unit.f186387a);
            case 15:
                k kVar15 = new k((r3) this.f1760x, (Continuation) obj4, 15);
                kVar15.f1759w = (String) obj3;
                return kVar15.invokeSuspend(Unit.f186387a);
            case 16:
                k kVar16 = new k((y3) this.f1760x, (Continuation) obj4, 16);
                kVar16.f1759w = (String) obj3;
                return kVar16.invokeSuspend(Unit.f186387a);
            case 17:
                return new k((awd.c) this.f1760x, (Continuation) obj4, 17).invokeSuspend(Unit.f186387a);
            case 18:
                k kVar17 = new k((ayc.i) this.f1760x, (Continuation) obj4, 18);
                kVar17.f1759w = (List) obj3;
                return kVar17.invokeSuspend(Unit.f186387a);
            case 19:
                k kVar18 = new k((ayc.i) this.f1760x, (Continuation) obj4, 19);
                kVar18.f1759w = (EntityConfigRepository$Params) obj3;
                return kVar18.invokeSuspend(Unit.f186387a);
            case 20:
                k kVar19 = new k((b34.b) this.f1760x, (Continuation) obj4, 20);
                kVar19.f1759w = (String) obj3;
                return kVar19.invokeSuspend(Unit.f186387a);
            case 21:
                k kVar20 = new k((b4g.f) this.f1760x, (Continuation) obj4, 21);
                kVar20.f1759w = (String) obj3;
                return kVar20.invokeSuspend(Unit.f186387a);
            case 22:
                k kVar21 = new k((q) this.f1760x, (Continuation) obj4, 22);
                kVar21.f1759w = (b4g.m) obj3;
                return kVar21.invokeSuspend(Unit.f186387a);
            case 23:
                k kVar22 = new k((q) this.f1760x, (Continuation) obj4, 23);
                kVar22.f1759w = (n) obj3;
                return kVar22.invokeSuspend(Unit.f186387a);
            case 24:
                k kVar23 = new k((q) this.f1760x, (Continuation) obj4, 24);
                kVar23.f1759w = (String) obj3;
                return kVar23.invokeSuspend(Unit.f186387a);
            case 25:
                k kVar24 = new k((b4g.u) this.f1760x, (Continuation) obj4, 25);
                kVar24.f1759w = (s) obj3;
                return kVar24.invokeSuspend(Unit.f186387a);
            case 26:
                k kVar25 = new k((b4g.y) this.f1760x, (Continuation) obj4, 26);
                kVar25.f1759w = (b4g.x) obj3;
                return kVar25.invokeSuspend(Unit.f186387a);
            case 27:
                k kVar26 = new k((b4g.a0) this.f1760x, (Continuation) obj4, 27);
                kVar26.f1759w = (String) obj3;
                return kVar26.invokeSuspend(Unit.f186387a);
            case 28:
                k kVar27 = new k((b4g.d0) this.f1760x, (Continuation) obj4, 28);
                kVar27.f1759w = (c0) obj3;
                return kVar27.invokeSuspend(Unit.f186387a);
            default:
                k kVar28 = new k((i0) this.f1760x, (Continuation) obj4, 29);
                kVar28.f1759w = (h0) obj3;
                return kVar28.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v23, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v33, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v57, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 a8g.b0, still in use, count: 2, list:
          (r13v2 a8g.b0) from 0x0100: MOVE (r38v1 a8g.b0) = (r13v2 a8g.b0)
          (r13v2 a8g.b0) from 0x00bf: MOVE (r38v3 a8g.b0) = (r13v2 a8g.b0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 3518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a72.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
