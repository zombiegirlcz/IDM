package dp4;

import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentAmountOwed;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentFees;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentOwedPrice;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentPointsRefund;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentRefund;
import com.revolut.feature_travel_hotels_models.property.Description;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.room.Area;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import com.revolut.feature_travel_hotels_models.property.room.MaxOccupancy;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import com.revolut.feature_travel_hotels_models.property.room.RoomView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import r9g.j0;

/* JADX INFO: loaded from: classes22.dex */
public final class a1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f116596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f116597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f116596w = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.Map] */
    private final Object b(Object obj2) {
        Object amendmentAvailability;
        Description description;
        Area area;
        MaxOccupancy maxOccupancy;
        ArrayList arrayList;
        String str;
        TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees;
        String str2;
        Description description2;
        ArrayList arrayList2;
        TravelHotelsBookingAmendmentCost amountOwed;
        qei.g gVar = (qei.g) this.f116597x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        String str3 = null;
        if (i == 0) {
            yhm.o.b(obj2);
            TravelHotelsService travelHotelsService = ((fag.o) this.f116596w).f133352a;
            String str4 = gVar.f245168a;
            String string = gVar.f245169b.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = gVar.f245170c.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.f116597x = null;
            this.v = 1;
            amendmentAvailability = travelHotelsService.getAmendmentAvailability(str4, string, string2, this);
            if (amendmentAvailability == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            amendmentAvailability = obj2;
        }
        r9g.i0 i0Var = (r9g.i0) amendmentAvailability;
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        boolean originalRateOnly = i0Var.getOriginalRateOnly();
        List rooms = i0Var.getRooms();
        int i2 = 10;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(rooms, 10));
        Iterator it8 = rooms.iterator();
        while (it8.hasNext()) {
            r9g.m0 m0Var = (r9g.m0) it8.next();
            Intrinsics.checkNotNullParameter(m0Var, "<this>");
            String id10 = m0Var.getId();
            String name = m0Var.getName();
            ofi.h description3 = m0Var.getDescription();
            if (description3 != null) {
                Object obj3 = lfi.a.f194929a;
                Intrinsics.checkNotNullParameter(description3, "<this>");
                description = new Description(description3.getPlainText());
            } else {
                description = new Description(str3);
            }
            List images = m0Var.getImages();
            ArrayList arrayList4 = new ArrayList(zhm.w.t(images, i2));
            Iterator it9 = images.iterator();
            while (it9.hasNext()) {
                arrayList4.add(lfi.a.k((ofi.i) it9.next()));
            }
            List rates = m0Var.getRates();
            ArrayList arrayList5 = new ArrayList(zhm.w.t(rates, i2));
            Iterator it10 = rates.iterator();
            while (it10.hasNext()) {
                r9g.l0 l0Var = (r9g.l0) it10.next();
                Intrinsics.checkNotNullParameter(l0Var, "<this>");
                String id11 = l0Var.getId();
                cgi.e eVar = (cgi.e) u1.t(l0Var.getType(), cgi.e.PAY_LATER, j9g.j.f172335b);
                cgi.d dVar = (cgi.d) u1.t(l0Var.getPaymentMode(), cgi.d.WALLET, j9g.j.f172336c);
                int availableRooms = l0Var.getAvailableRooms();
                List amenities = l0Var.getAmenities();
                ArrayList arrayList6 = new ArrayList(zhm.w.t(amenities, 10));
                Iterator it11 = amenities.iterator();
                while (it11.hasNext()) {
                    arrayList6.add(j9g.d.a((ofi.e) it11.next()));
                }
                CancellationPolicy cancellationPolicyA = j9g.j.a(l0Var.getCancellationPolicy());
                List occupancyRates = l0Var.getOccupancyRates();
                ArrayList arrayList7 = new ArrayList(zhm.w.t(occupancyRates, 10));
                Iterator it12 = occupancyRates.iterator();
                while (it12.hasNext()) {
                    r9g.k0 k0Var = (r9g.k0) it12.next();
                    Intrinsics.checkNotNullParameter(k0Var, "<this>");
                    RoomOccupancy roomOccupancyC = j9g.j.c(k0Var.getOccupancy());
                    Iterator it13 = it12;
                    List listB = k0Var.getBedOptions();
                    Iterator it14 = it8;
                    ArrayList arrayList8 = arrayList6;
                    r9g.m0 m0Var2 = m0Var;
                    ArrayList arrayList9 = new ArrayList(zhm.w.t(listB, 10));
                    Iterator it15 = listB.iterator();
                    while (it15.hasNext()) {
                        ofi.c cVar = (ofi.c) it15.next();
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        arrayList9.add(new BedOption(cVar.getId(), cVar.getBookingToken(), cVar.getDescription()));
                        it15 = it15;
                        it10 = it10;
                    }
                    Iterator it16 = it10;
                    r9g.j0 j0VarA = k0Var.getAmendmentCost();
                    Intrinsics.checkNotNullParameter(j0VarA, "<this>");
                    r9g.z zVarA = j0VarA.getFees();
                    if (zVarA != null) {
                        Intrinsics.checkNotNullParameter(zVarA, "<this>");
                        List overall = zVarA.getOverall();
                        if (overall == null) {
                            overall = zhm.f0.f322471a;
                        }
                        List list = overall;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it17 = list.iterator();
                        while (it17.hasNext()) {
                            arrayList10.add(lfi.a.n((ofi.m) it17.next()));
                        }
                        List inRequestedCurrency = zVarA.getInRequestedCurrency();
                        if (inRequestedCurrency == null) {
                            inRequestedCurrency = zhm.f0.f322471a;
                        }
                        List list2 = inRequestedCurrency;
                        str = id10;
                        ArrayList arrayList11 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it18 = list2.iterator();
                        while (it18.hasNext()) {
                            arrayList11.add(lfi.a.n((ofi.m) it18.next()));
                        }
                        travelHotelsBookingAmendmentFees = new TravelHotelsBookingAmendmentFees(arrayList10, arrayList11);
                    } else {
                        str = id10;
                        travelHotelsBookingAmendmentFees = null;
                    }
                    jo3.a aVarB = j0VarA.getPenalty();
                    dj0.d dVarO = aVarB != null ? mo3.a.o(aVarB) : null;
                    if (j0VarA instanceof j0.d) {
                        amountOwed = new TravelHotelsBookingAmendmentCost.Unchanged(travelHotelsBookingAmendmentFees, j9g.q.a(((j0.d) j0VarA).getPricing()), dVarO);
                        str2 = name;
                        description2 = description;
                        arrayList2 = arrayList4;
                    } else if (j0VarA instanceof j0.c) {
                        j0.c cVar2 = (j0.c) j0VarA;
                        r9g.f0 f0VarD = cVar2.getRefund();
                        Intrinsics.checkNotNullParameter(f0VarD, "<this>");
                        dj0.d dVarO2 = mo3.a.o(f0VarD.getTotal());
                        dj0.d dVarO3 = mo3.a.o(f0VarD.getMonetary());
                        str2 = name;
                        r9g.e0 e0VarB = f0VarD.getPointsRefund();
                        Intrinsics.checkNotNullParameter(e0VarB, "<this>");
                        description2 = description;
                        arrayList2 = arrayList4;
                        amountOwed = new TravelHotelsBookingAmendmentCost.Refund(new TravelHotelsBookingAmendmentRefund(dVarO2, dVarO3, new TravelHotelsBookingAmendmentPointsRefund(mo3.a.o(e0VarB.getPoints()), mo3.a.o(e0VarB.getMonetaryValue()))), travelHotelsBookingAmendmentFees, j9g.q.a(cVar2.getPricing()), dVarO);
                    } else {
                        str2 = name;
                        description2 = description;
                        arrayList2 = arrayList4;
                        if (j0VarA instanceof j0.b) {
                            amountOwed = new TravelHotelsBookingAmendmentCost.NewPrice(travelHotelsBookingAmendmentFees, j9g.q.a(((j0.b) j0VarA).getPricing()), dVarO);
                        } else if (j0VarA instanceof j0.a) {
                            j0.a aVar2 = (j0.a) j0VarA;
                            r9g.w wVarC = aVar2.getAmountOwed();
                            Intrinsics.checkNotNullParameter(wVarC, "<this>");
                            r9g.b0 b0VarB = wVarC.getOverallPrice();
                            Intrinsics.checkNotNullParameter(b0VarB, "<this>");
                            TravelHotelsBookingAmendmentOwedPrice travelHotelsBookingAmendmentOwedPrice = new TravelHotelsBookingAmendmentOwedPrice(mo3.a.o(b0VarB.getInclusivePrice()));
                            r9g.b0 b0VarE = wVarC.getPriceInRequestedCurrency();
                            Intrinsics.checkNotNullParameter(b0VarE, "<this>");
                            TravelHotelsBookingAmendmentOwedPrice travelHotelsBookingAmendmentOwedPrice2 = new TravelHotelsBookingAmendmentOwedPrice(mo3.a.o(b0VarE.getInclusivePrice()));
                            List listC = wVarC.getPointsRedeemOptions();
                            if (listC == null) {
                                listC = zhm.f0.f322471a;
                            }
                            List<r9g.d0> list3 = listC;
                            ArrayList arrayList12 = new ArrayList(zhm.w.t(list3, 10));
                            for (r9g.d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                arrayList12.add(new HotelsPointsRedeemOption(qvb.a.c(mo3.a.o(d0Var.getPoints())), qvb.a.c(mo3.a.o(d0Var.getPointsReward())), mo3.a.o(d0Var.getDiscount()), d0Var.getToken(), d0Var.getQuoteToken()));
                            }
                            jo3.a aVarD = wVarC.getPointsReward();
                            RevPoints revPointsC = aVarD != null ? qvb.a.c(mo3.a.o(aVarD)) : null;
                            ofi.d dVarA = wVarC.getCashback();
                            amountOwed = new TravelHotelsBookingAmendmentCost.AmountOwed(new TravelHotelsBookingAmendmentAmountOwed(travelHotelsBookingAmendmentOwedPrice, travelHotelsBookingAmendmentOwedPrice2, arrayList12, revPointsC, dVarA != null ? lfi.a.e(dVarA) : null), travelHotelsBookingAmendmentFees, j9g.q.a(aVar2.getPricing()), dVarO);
                        } else {
                            if (!(j0VarA instanceof j0.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            amountOwed = TravelHotelsBookingAmendmentCost.Unknown.f97857a;
                        }
                    }
                    arrayList7.add(new cgi.l(roomOccupancyC, arrayList9, amountOwed));
                    arrayList6 = arrayList8;
                    it12 = it13;
                    it8 = it14;
                    m0Var = m0Var2;
                    id10 = str;
                    it10 = it16;
                    name = str2;
                    arrayList4 = arrayList2;
                    description = description2;
                }
                arrayList5.add(new cgi.m(id11, eVar, dVar, availableRooms, arrayList6, cancellationPolicyA, arrayList7));
            }
            Iterator it19 = it8;
            r9g.m0 m0Var3 = m0Var;
            String str5 = id10;
            String str6 = name;
            Description description4 = description;
            ArrayList arrayList13 = arrayList4;
            List amenities2 = m0Var3.getAmenities();
            ArrayList arrayList14 = new ArrayList(zhm.w.t(amenities2, 10));
            Iterator it20 = amenities2.iterator();
            while (it20.hasNext()) {
                arrayList14.add(j9g.d.a((ofi.e) it20.next()));
            }
            List<cag.k> views = m0Var3.getViews();
            ArrayList arrayList15 = new ArrayList(zhm.w.t(views, 10));
            for (cag.k kVar : views) {
                Map map = j9g.j.f172334a;
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                arrayList15.add(new RoomView(kVar.getId(), kVar.getName()));
            }
            ofi.b area2 = m0Var3.getArea();
            if (area2 != null) {
                Map map2 = j9g.j.f172334a;
                Intrinsics.checkNotNullParameter(area2, "<this>");
                area = new Area(area2.getValue(), (cgi.a) u1.u(area2.getUnit(), j9g.j.f172334a));
            } else {
                area = null;
            }
            cag.g maxOccupancy2 = m0Var3.getMaxOccupancy();
            if (maxOccupancy2 != null) {
                Map map3 = j9g.j.f172334a;
                Intrinsics.checkNotNullParameter(maxOccupancy2, "<this>");
                maxOccupancy = new MaxOccupancy(maxOccupancy2.getTotal(), maxOccupancy2.getAdults(), maxOccupancy2.getChildren());
            } else {
                maxOccupancy = null;
            }
            List units = m0Var3.getUnits();
            if (units != null) {
                List list4 = units;
                i2 = 10;
                ArrayList arrayList16 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it21 = list4.iterator();
                while (it21.hasNext()) {
                    arrayList16.add(j9g.j.b((cag.f) it21.next()));
                }
                arrayList = arrayList16;
            } else {
                i2 = 10;
                arrayList = null;
            }
            arrayList3.add(new cgi.n(str5, str6, description4, arrayList13, arrayList5, arrayList14, arrayList15, area, maxOccupancy, arrayList));
            it8 = it19;
            str3 = null;
        }
        return new qei.f(arrayList3, originalRateOnly);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                a1 a1Var = new a1((c1) this.f116596w, (Continuation) obj4, 0);
                a1Var.f116597x = (cp4.m0) obj3;
                return a1Var.invokeSuspend(Unit.f186387a);
            case 1:
                a1 a1Var2 = new a1((c1) this.f116596w, (Continuation) obj4, 1);
                a1Var2.f116597x = (cp4.p0) obj3;
                return a1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                a1 a1Var3 = new a1((c1) this.f116596w, (Continuation) obj4, 2);
                a1Var3.f116597x = (cp4.q0) obj3;
                return a1Var3.invokeSuspend(Unit.f186387a);
            case 3:
                a1 a1Var4 = new a1((a5h.g) this.f116596w, (Continuation) obj4, 3);
                a1Var4.f116597x = (cp4.k0) obj3;
                return a1Var4.invokeSuspend(Unit.f186387a);
            case 4:
                a1 a1Var5 = new a1((dwd.c) this.f116596w, (Continuation) obj4, 4);
                a1Var5.f116597x = (String) obj3;
                return a1Var5.invokeSuspend(Unit.f186387a);
            case 5:
                a1 a1Var6 = new a1((e1a.f) this.f116596w, (Continuation) obj4, 5);
                a1Var6.f116597x = (String) obj3;
                return a1Var6.invokeSuspend(Unit.f186387a);
            case 6:
                a1 a1Var7 = new a1((e44.b) this.f116596w, (Continuation) obj4, 6);
                a1Var7.f116597x = (e44.a) obj3;
                return a1Var7.invokeSuspend(Unit.f186387a);
            case 7:
                a1 a1Var8 = new a1((e56.c) this.f116596w, (Continuation) obj4, 7);
                a1Var8.f116597x = (d56.c) obj3;
                return a1Var8.invokeSuspend(Unit.f186387a);
            case 8:
                a1 a1Var9 = new a1((e76.d) this.f116596w, (Continuation) obj4, 8);
                a1Var9.f116597x = (e76.b) obj3;
                return a1Var9.invokeSuspend(Unit.f186387a);
            case 9:
                a1 a1Var10 = new a1((com.revolut.feature.wealth.impl.data.repositories.a) this.f116596w, (Continuation) obj4, 9);
                a1Var10.f116597x = (o7h.x) obj3;
                return a1Var10.invokeSuspend(Unit.f186387a);
            case 10:
                a1 a1Var11 = new a1((e8h.y) this.f116596w, (Continuation) obj4, 10);
                a1Var11.f116597x = (String) obj3;
                return a1Var11.invokeSuspend(Unit.f186387a);
            case 11:
                a1 a1Var12 = new a1((e8h.c0) this.f116596w, (Continuation) obj4, 11);
                a1Var12.f116597x = (Set) obj3;
                return a1Var12.invokeSuspend(Unit.f186387a);
            case 12:
                return new a1((eci.b) this.f116596w, (Continuation) obj4, 12).invokeSuspend(Unit.f186387a);
            case 13:
                a1 a1Var13 = new a1((eg0.h) this.f116596w, (Continuation) obj4, 13);
                a1Var13.f116597x = (eg0.c) obj3;
                return a1Var13.invokeSuspend(Unit.f186387a);
            case 14:
                a1 a1Var14 = new a1((eg0.h) this.f116596w, (Continuation) obj4, 14);
                a1Var14.f116597x = (zf0.c) obj3;
                return a1Var14.invokeSuspend(Unit.f186387a);
            case 15:
                a1 a1Var15 = new a1((eh7.d) this.f116596w, (Continuation) obj4, 15);
                a1Var15.f116597x = (gh7.k) obj3;
                return a1Var15.invokeSuspend(Unit.f186387a);
            case 16:
                a1 a1Var16 = new a1((ej9.e0) this.f116596w, (Continuation) obj4, 16);
                a1Var16.f116597x = (dj9.d0) obj3;
                return a1Var16.invokeSuspend(Unit.f186387a);
            case 17:
                a1 a1Var17 = new a1((ej9.f0) this.f116596w, (Continuation) obj4, 17);
                a1Var17.f116597x = (ej9.h) obj3;
                return a1Var17.invokeSuspend(Unit.f186387a);
            case 18:
                a1 a1Var18 = new a1((ej9.f0) this.f116596w, (Continuation) obj4, 18);
                a1Var18.f116597x = (ej9.i) obj3;
                return a1Var18.invokeSuspend(Unit.f186387a);
            case 19:
                a1 a1Var19 = new a1((enb.g) this.f116596w, (Continuation) obj4, 19);
                a1Var19.f116597x = (List) obj3;
                return a1Var19.invokeSuspend(Unit.f186387a);
            case 20:
                a1 a1Var20 = new a1((eqb.b) this.f116596w, (Continuation) obj4, 20);
                a1Var20.f116597x = (String) obj3;
                return a1Var20.invokeSuspend(Unit.f186387a);
            case 21:
                a1 a1Var21 = new a1((eve.b) this.f116596w, (Continuation) obj4, 21);
                a1Var21.f116597x = (eve.a) obj3;
                return a1Var21.invokeSuspend(Unit.f186387a);
            case 22:
                a1 a1Var22 = new a1((f44.c) this.f116596w, (Continuation) obj4, 22);
                a1Var22.f116597x = (f44.a) obj3;
                return a1Var22.invokeSuspend(Unit.f186387a);
            case 23:
                return new a1((fa7.e) this.f116596w, (Continuation) obj4, 23).invokeSuspend(Unit.f186387a);
            case 24:
                a1 a1Var23 = new a1((fag.o) this.f116596w, (Continuation) obj4, 24);
                a1Var23.f116597x = (qei.g) obj3;
                return a1Var23.invokeSuspend(Unit.f186387a);
            case 25:
                a1 a1Var24 = new a1((fag.o) this.f116596w, (Continuation) obj4, 25);
                a1Var24.f116597x = (qei.n) obj3;
                return a1Var24.invokeSuspend(Unit.f186387a);
            case 26:
                a1 a1Var25 = new a1((ff8.i) this.f116596w, (Continuation) obj4, 26);
                a1Var25.f116597x = (String) obj3;
                return a1Var25.invokeSuspend(Unit.f186387a);
            case 27:
                a1 a1Var26 = new a1((fg0.e) this.f116596w, (Continuation) obj4, 27);
                a1Var26.f116597x = (fg0.c) obj3;
                return a1Var26.invokeSuspend(Unit.f186387a);
            case 28:
                a1 a1Var27 = new a1((fg0.k) this.f116596w, (Continuation) obj4, 28);
                a1Var27.f116597x = (zf0.c) obj3;
                return a1Var27.invokeSuspend(Unit.f186387a);
            default:
                a1 a1Var28 = new a1((fm1.c) this.f116596w, (Continuation) obj4, 29);
                a1Var28.f116597x = (cm1.c) obj3;
                return a1Var28.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:365:0x0809, code lost:
    
        if (r0 == r14) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x081e, code lost:
    
        if (r0 == r14) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0837, code lost:
    
        if (r0 == r14) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0868, code lost:
    
        if (r0 == r14) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0884, code lost:
    
        if (r0 == r14) goto L397;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:585:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v61, types: [com.revolut.feature.wealth.impl.data.network.recurring_buy_hub_collection.RecurringBuyHubCollectionService] */
    /* JADX WARN: Type inference failed for: r1v91, types: [com.revolut.feature.retail.savings.impl.documents.data.network.SavingsDocumentsService] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v50, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v65, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v57, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v18, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp4.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
