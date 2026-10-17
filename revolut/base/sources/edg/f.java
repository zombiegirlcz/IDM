package edg;

import aw0.o9;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.ExpandableDisclaimerConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.model.points.Points;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentAmountOwed;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCostWithOldPricing;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentFees;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentNewPricing;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentPrice;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.feature_travel_hotels_models.property.room.TravelHotelsRatePricing;
import gdg.g;
import h9g.m;
import i9g.v;
import ip0.ak0;
import ip0.q6;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import qv0.i;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPriceBreakdownScreenContract$InputData f125022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gdg.d f125023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gdg.a f125024c;

    public f(TravelHotelsPriceBreakdownScreenContract$InputData inputData, gdg.d itemMapper, kdc.d expandableDisclaimerConfigurationMapper, gdg.a amendmentPriceBreakdownItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(expandableDisclaimerConfigurationMapper, "expandableDisclaimerConfigurationMapper");
        Intrinsics.checkNotNullParameter(amendmentPriceBreakdownItemMapper, "amendmentPriceBreakdownItemMapper");
        this.f125022a = inputData;
        this.f125023b = itemMapper;
        this.f125024c = amendmentPriceBreakdownItemMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Collection collectionA;
        List listM;
        List listM2;
        List listL;
        ArrayList arrayListU;
        TextLocalisedClause textLocalisedClause;
        int i;
        dj0.d dVar;
        dj0.d dVar2;
        List listM3;
        List listM4;
        Iterable iterableL;
        n6c.a aVar;
        Clause clause;
        dj0.d dVar3;
        dj0.d dVar4;
        dj0.d dVar5;
        dj0.d dVar6;
        List listB;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelHotelsPriceBreakdownScreenContract$InputData travelHotelsPriceBreakdownScreenContract$InputData = this.f125022a;
        List list = travelHotelsPriceBreakdownScreenContract$InputData.f93967a;
        fgi.a aVar2 = travelHotelsPriceBreakdownScreenContract$InputData.f93970g;
        Points points = travelHotelsPriceBreakdownScreenContract$InputData.d;
        int i2 = travelHotelsPriceBreakdownScreenContract$InputData.f93969c;
        TravelHotelsRatePricing travelHotelsRatePricing = (TravelHotelsRatePricing) d0.d0(list);
        if (travelHotelsRatePricing instanceof TravelHotelsBookingAmendmentCostWithOldPricing) {
            TravelHotelsBookingAmendmentCostWithOldPricing pricing = (TravelHotelsBookingAmendmentCostWithOldPricing) travelHotelsRatePricing;
            gdg.a aVar3 = this.f125024c;
            p8g.c cVar = aVar3.f143176a;
            Intrinsics.checkNotNullParameter(pricing, "pricing");
            TravelHotelsBookingAmendmentCost travelHotelsBookingAmendmentCost = pricing.f97858a;
            Pricing pricing2 = pricing.f97859b;
            if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.NewPrice) {
                TravelHotelsBookingAmendmentCost.NewPrice newPrice = (TravelHotelsBookingAmendmentCost.NewPrice) travelHotelsBookingAmendmentCost;
                TravelHotelsBookingAmendmentNewPricing travelHotelsBookingAmendmentNewPricing = newPrice.f97848a;
                aim.e eVarB = u.b();
                OverallPrice overallPrice = pricing2.d;
                if (overallPrice == null || (dVar6 = overallPrice.f98058b) == null) {
                    dVar6 = pricing2.f98068c.f98058b;
                }
                CellDetailsDelegate.Model modelE = fcg.b.e(dVar6);
                yp0.b.l(modelE, 0, 0, 0, 0, null, false, 63);
                eVarB.add(modelE);
                aim.e eVarB2 = u.b();
                TravelHotelsBookingAmendmentPrice travelHotelsBookingAmendmentPrice = travelHotelsBookingAmendmentNewPricing.f97863b;
                dj0.d dVar7 = travelHotelsBookingAmendmentPrice.f97868a;
                dj0.d dVar8 = travelHotelsBookingAmendmentPrice.f97869b;
                eVarB2.add(fcg.b.o(i2, dVar7));
                Intrinsics.checkNotNullParameter(newPrice, "<this>");
                eVarB2.add(fcg.b.p(v13.d.e0(newPrice, true), aVar2));
                TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = newPrice.f97849b;
                if (travelHotelsBookingAmendmentFees != null && (listB = aVar3.b(travelHotelsBookingAmendmentFees)) != null) {
                    eVarB2.addAll(listB);
                }
                TravelHotelsBookingAmendmentPrice travelHotelsBookingAmendmentPrice2 = travelHotelsBookingAmendmentNewPricing.f97862a;
                Intrinsics.checkNotNullParameter(newPrice, "<this>");
                eVarB2.add(fcg.b.l(pyd.c.O(dVar8, v13.d.e0(newPrice, false))));
                TextDelegate.Model modelG = !Intrinsics.f(dVar8.f115083b, travelHotelsBookingAmendmentPrice2.f97869b.f115083b) ? fcg.b.g(pyd.c.O(travelHotelsBookingAmendmentPrice2.f97869b, v13.d.g0(newPrice))) : null;
                if (modelG != null) {
                    eVarB2.add(modelG);
                }
                aim.e eVarA = u.a(eVarB2);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                eVarB.addAll(eVarA);
                if (((v) cVar).b()) {
                    List listK = fcg.b.k(points, travelHotelsBookingAmendmentNewPricing.f97863b.f97869b, cgi.e.PAY_LATER);
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    eVarB.addAll(listK);
                }
                collectionA = u.a(eVarB);
            } else if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.AmountOwed) {
                TravelHotelsBookingAmendmentCost.AmountOwed amountOwed = (TravelHotelsBookingAmendmentCost.AmountOwed) travelHotelsBookingAmendmentCost;
                aim.e eVarB3 = u.b();
                OverallPrice overallPrice2 = pricing2.d;
                if (overallPrice2 == null || (dVar4 = overallPrice2.f98058b) == null) {
                    dVar4 = pricing2.f98068c.f98058b;
                }
                CellDetailsDelegate.Model modelE2 = fcg.b.e(dVar4);
                yp0.b.l(modelE2, 0, 0, 0, 0, null, false, 63);
                eVarB3.add(modelE2);
                aim.e eVarB4 = u.b();
                TravelHotelsBookingAmendmentNewPricing travelHotelsBookingAmendmentNewPricing2 = amountOwed.f97847c;
                TravelHotelsBookingAmendmentAmountOwed travelHotelsBookingAmendmentAmountOwed = amountOwed.f97845a;
                eVarB4.add(fcg.b.o(i2, travelHotelsBookingAmendmentNewPricing2.f97863b.f97868a));
                Intrinsics.checkNotNullParameter(amountOwed, "<this>");
                eVarB4.add(fcg.b.p(v13.d.e0(amountOwed, true), aVar2));
                dj0.d dVar9 = travelHotelsBookingAmendmentNewPricing2.f97863b.f97869b;
                eVarB4.add(fcg.b.d(dVar9));
                aim.e eVarA2 = u.a(eVarB4);
                yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
                eVarB3.addAll(eVarA2);
                aim.e eVarB5 = u.b();
                eVarB5.add(fcg.b.a(travelHotelsBookingAmendmentAmountOwed.f97843b.f97865a));
                if (points != null && (dVar5 = points.f93668a) != null) {
                    eVarB5.add(fcg.b.i(dVar5.l()));
                }
                eVarB5.add(fcg.b.h(pyd.c.H(travelHotelsBookingAmendmentAmountOwed.f97843b.f97865a, points != null ? points.f93668a : null), true));
                aim.e eVarA3 = u.a(eVarB5);
                yp0.b.k(eVarA3, 0, 0, 0, 0, 31);
                eVarB3.addAll(eVarA3);
                Intrinsics.checkNotNullParameter(amountOwed, "<this>");
                dj0.d dVarE0 = v13.d.e0(amountOwed, false);
                aim.e eVarA4 = aVar3.a(amountOwed, dVarE0, v13.d.g0(amountOwed));
                yp0.b.k(eVarA4, 0, 0, 0, 0, 31);
                eVarB3.addAll(eVarA4);
                dj0.d money = pyd.c.H(pyd.c.O(dVar9, dVarE0), points != null ? points.f93668a : null);
                Intrinsics.checkNotNullParameter(money, "money");
                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("TOTAL_PRICE_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_price_breakdown_total, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE), null, null, null, null, 0, null, false, false, null, null, 32760);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB3.add(model);
                if (((v) cVar).b()) {
                    List listK2 = fcg.b.k(points, pyd.c.H(dVar9, points != null ? points.f93668a : null), cgi.e.PAY_NOW);
                    yp0.b.k(listK2, 0, 0, 0, 0, 31);
                    eVarB3.addAll(listK2);
                }
                collectionA = u.a(eVarB3);
            } else if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.Refund) {
                TravelHotelsBookingAmendmentCost.Refund refund = (TravelHotelsBookingAmendmentCost.Refund) travelHotelsBookingAmendmentCost;
                TravelHotelsBookingAmendmentNewPricing travelHotelsBookingAmendmentNewPricing3 = refund.f97853c;
                aim.e eVarB6 = u.b();
                Intrinsics.checkNotNullParameter(refund, "<this>");
                dj0.d dVarE02 = v13.d.e0(refund, false);
                dj0.d dVarG0 = v13.d.g0(refund);
                OverallPrice overallPrice3 = pricing2.d;
                if (overallPrice3 == null || (dVar3 = overallPrice3.f98058b) == null) {
                    dVar3 = pricing2.f98068c.f98058b;
                }
                CellDetailsDelegate.Model modelE3 = fcg.b.e(dVar3);
                yp0.b.l(modelE3, 0, 0, 0, 0, null, false, 63);
                eVarB6.add(modelE3);
                aim.e eVarB7 = u.b();
                eVarB7.add(fcg.b.o(i2, travelHotelsBookingAmendmentNewPricing3.f97863b.f97868a));
                Intrinsics.checkNotNullParameter(refund, "<this>");
                eVarB7.add(fcg.b.p(v13.d.e0(refund, true), aVar2));
                eVarB7.add(fcg.b.d(travelHotelsBookingAmendmentNewPricing3.f97863b.f97869b));
                aim.e eVarA5 = u.a(eVarB7);
                yp0.b.k(eVarA5, 0, 0, 0, 0, 31);
                eVarB6.addAll(eVarA5);
                CellDetailsDelegate.Model modelB = fcg.b.b(refund.f97851a.f97870a, false);
                yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
                eVarB6.add(modelB);
                aim.e eVarA6 = aVar3.a(refund, dVarE02, dVarG0);
                yp0.b.k(eVarA6, 0, 0, 0, 0, 31);
                eVarB6.addAll(eVarA6);
                collectionA = u.a(eVarB6);
            } else {
                collectionA = f0.f322471a;
            }
        } else if (travelHotelsRatePricing instanceof Pricing) {
            List list2 = travelHotelsPriceBreakdownScreenContract$InputData.f93967a;
            ArrayList pricingList = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof Pricing) {
                    pricingList.add(obj2);
                }
            }
            cgi.e ratesType = travelHotelsPriceBreakdownScreenContract$InputData.f93968b;
            Intrinsics.checkNotNullParameter(pricingList, "pricingList");
            Intrinsics.checkNotNullParameter(ratesType, "ratesType");
            gdg.d dVar10 = this.f125023b;
            v vVar = (v) dVar10.f143179b;
            if (vVar.b()) {
                g gVar = dVar10.f143180c;
                Intrinsics.checkNotNullParameter(pricingList, "pricingList");
                Intrinsics.checkNotNullParameter(ratesType, "ratesType");
                if (((v) gVar.f143182a).a() && aVar2 == fgi.a.EXPEDIA) {
                    dj0.d dVar11 = points != null ? points.f93668a : null;
                    int i3 = gdg.f.f143181a[ratesType.ordinal()];
                    if (i3 == 1) {
                        listM3 = f0.f322471a;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aim.e eVarB8 = u.b();
                        eVarB8.add(gVar.f(i2, pricingList));
                        dj0.d.Companion.getClass();
                        dj0.d dVarO = dj0.d.e;
                        int i5 = 0;
                        for (Object obj3 : pricingList) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            if (i5 == 0) {
                                List listB2 = m.b((Pricing) obj3);
                                dj0.d.Companion.getClass();
                                dj0.d dVar12 = dj0.d.e;
                                dj0.d dVarO2 = dVar12;
                                int i21 = 0;
                                for (Object obj4 : listB2) {
                                    int i22 = i21 + 1;
                                    if (i21 < 0) {
                                        zhm.v.s();
                                        throw null;
                                    }
                                    dVarO2 = i21 == 0 ? ((PriceFee) obj4).d : pyd.c.O(dVarO2, ((PriceFee) obj4).d);
                                    i21 = i22;
                                }
                                dVarO = dVarO2;
                            } else {
                                List listB3 = m.b((Pricing) obj3);
                                dj0.d.Companion.getClass();
                                dj0.d dVarO3 = dj0.d.e;
                                int i32 = 0;
                                for (Object obj5 : listB3) {
                                    int i33 = i32 + 1;
                                    if (i32 < 0) {
                                        zhm.v.s();
                                        throw null;
                                    }
                                    dVarO3 = i32 == 0 ? ((PriceFee) obj5).d : pyd.c.O(dVarO3, ((PriceFee) obj5).d);
                                    i32 = i33;
                                }
                                dVarO = pyd.c.O(dVarO, dVarO3);
                            }
                            i5 = i6;
                        }
                        eVarB8.add(fcg.b.p(dVarO, aVar2));
                        eVarB8.add(gVar.e(dVar11));
                        dj0.d money2 = gVar.d(pricingList, ratesType, dVar11);
                        Intrinsics.checkNotNullParameter(money2, "money");
                        eVarB8.add(fcg.b.m(R$string.hotels_price_breakdown_pay_now, money2, "PAY_NOW_ITEM_ID"));
                        listM3 = u.a(eVarB8);
                    }
                } else {
                    dj0.d dVar13 = points != null ? points.f93668a : null;
                    int i43 = gdg.f.f143181a[ratesType.ordinal()];
                    if (i43 == 1) {
                        listM3 = f0.f322471a;
                    } else {
                        if (i43 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s0 s0Var = new s0(5);
                        s0Var.a(gVar.f(i2, pricingList));
                        ArrayList arrayList = new ArrayList(w.t(pricingList, 10));
                        Iterator it8 = pricingList.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(m.a((Pricing) it8.next()));
                        }
                        PriceFee priceFee = (PriceFee) d0.d0(w.u(arrayList));
                        s0Var.a(priceFee != null ? fcg.b.c(priceFee.d) : null);
                        s0Var.b(gVar.g(pricingList, new gd8.j(7)).toArray(new i[0]));
                        s0Var.a(gVar.e(dVar13));
                        dj0.d money3 = gVar.d(pricingList, ratesType, dVar13);
                        Intrinsics.checkNotNullParameter(money3, "money");
                        s0Var.a(fcg.b.m(R$string.hotels_price_breakdown_pay_now, money3, "PAY_NOW_ITEM_ID"));
                        ArrayList arrayList2 = s0Var.f186433a;
                        listM3 = zhm.v.m(arrayList2.toArray(new i[arrayList2.size()]));
                    }
                }
                List list3 = listM3;
                yp0.b.k(list3, 0, 0, 0, 0, 31);
                dj0.d.Companion.getClass();
                dj0.d dVarF = dj0.d.e;
                int i59 = 0;
                for (Object obj6 : pricingList) {
                    int i66 = i59 + 1;
                    if (i59 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarF = i59 == 0 ? m.f((Pricing) obj6, ratesType) : pyd.c.O(dVarF, m.f((Pricing) obj6, ratesType));
                    i59 = i66;
                }
                dj0.d.Companion.getClass();
                dj0.d dVarE = dj0.d.e;
                int i74 = 0;
                for (Object obj7 : pricingList) {
                    int i92 = i74 + 1;
                    if (i74 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarE = i74 == 0 ? m.e((Pricing) obj7, ratesType) : pyd.c.O(dVarE, m.e((Pricing) obj7, ratesType));
                    i74 = i92;
                }
                boolean zF = Intrinsics.f(dVarF.f115083b, dVarE.f115083b);
                int i96 = gdg.f.f143181a[ratesType.ordinal()];
                if (i96 == 1) {
                    s0 s0Var2 = new s0(4);
                    s0Var2.a(gVar.f(i2, pricingList));
                    s0Var2.b(gVar.g(pricingList, new gd8.j(5)).toArray(new i[0]));
                    s0Var2.a(gVar.c(pricingList, ratesType));
                    TextDelegate.Model modelB2 = gVar.b(pricingList, ratesType);
                    if (dVarF.k() || zF) {
                        modelB2 = null;
                    }
                    s0Var2.a(modelB2);
                    ArrayList arrayList3 = s0Var2.f186433a;
                    listM4 = zhm.v.m(arrayList3.toArray(new i[arrayList3.size()]));
                } else {
                    if (i96 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s0 s0Var3 = new s0(3);
                    s0Var3.b(gVar.g(pricingList, new gd8.j(6)).toArray(new i[0]));
                    CellDetailsDelegate.Model modelC = gVar.c(pricingList, ratesType);
                    dj0.d.Companion.getClass();
                    dj0.d dVarE2 = dj0.d.e;
                    int i99 = 0;
                    for (Object obj8 : pricingList) {
                        int i100 = i99 + 1;
                        if (i99 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        dVarE2 = i99 == 0 ? m.e((Pricing) obj8, ratesType) : pyd.c.O(dVarE2, m.e((Pricing) obj8, ratesType));
                        i99 = i100;
                    }
                    if (dVarE2.k()) {
                        modelC = null;
                    }
                    s0Var3.a(modelC);
                    TextDelegate.Model modelB3 = gVar.b(pricingList, ratesType);
                    if (dVarF.k() || zF) {
                        modelB3 = null;
                    }
                    s0Var3.a(modelB3);
                    ArrayList arrayList4 = s0Var3.f186433a;
                    listM4 = zhm.v.m(arrayList4.toArray(new i[arrayList4.size()]));
                }
                List list4 = listM4;
                yp0.b.k(list4, 0, 0, 0, 0, 31);
                dj0.d dVar14 = points != null ? points.f93668a : null;
                ArrayList arrayList5 = new ArrayList(w.t(pricingList, 10));
                Iterator it9 = pricingList.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(boh.f.k((Pricing) it9.next()));
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO4 = dj0.d.e;
                int i101 = 0;
                for (Object obj9 : arrayList5) {
                    int i102 = i101 + 1;
                    if (i101 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarO4 = i101 == 0 ? (dj0.d) obj9 : pyd.c.O(dVarO4, (dj0.d) obj9);
                    i101 = i102;
                }
                dj0.d money4 = g.a(gVar, dVarO4, dVar14);
                Intrinsics.checkNotNullParameter(money4, "money");
                List listC = u.c(fcg.b.m(R$string.hotels_price_breakdown_total, money4, "TOTAL_ITEM_ID"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                List listK3 = fcg.b.k(points, gVar.d(pricingList, ratesType, points != null ? points.f93668a : null), ratesType);
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                arrayListU = w.u(zhm.v.k(list3, list4, listC, listK3));
            } else {
                if (vVar.a() && aVar2 == fgi.a.EXPEDIA) {
                    int i103 = gdg.c.f143177a[ratesType.ordinal()];
                    if (i103 == 1) {
                        listM = f0.f322471a;
                    } else {
                        if (i103 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aim.e eVarB9 = u.b();
                        eVarB9.add(dVar10.e(i2, pricingList));
                        dj0.d.Companion.getClass();
                        dj0.d dVarO5 = dj0.d.e;
                        int i104 = 0;
                        for (Object obj10 : pricingList) {
                            int i105 = i104 + 1;
                            if (i104 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            if (i104 == 0) {
                                List listB4 = m.b((Pricing) obj10);
                                dj0.d.Companion.getClass();
                                dj0.d dVarO6 = dj0.d.e;
                                int i106 = 0;
                                for (Object obj11 : listB4) {
                                    int i107 = i106 + 1;
                                    if (i106 < 0) {
                                        zhm.v.s();
                                        throw null;
                                    }
                                    dVarO6 = i106 == 0 ? ((PriceFee) obj11).d : pyd.c.O(dVarO6, ((PriceFee) obj11).d);
                                    i106 = i107;
                                }
                                dVarO5 = dVarO6;
                            } else {
                                List listB5 = m.b((Pricing) obj10);
                                dj0.d.Companion.getClass();
                                dj0.d dVarO7 = dj0.d.e;
                                int i108 = 0;
                                for (Object obj12 : listB5) {
                                    int i109 = i108 + 1;
                                    if (i108 < 0) {
                                        zhm.v.s();
                                        throw null;
                                    }
                                    dVarO7 = i108 == 0 ? ((PriceFee) obj12).d : pyd.c.O(dVarO7, ((PriceFee) obj12).d);
                                    i108 = i109;
                                }
                                dVarO5 = pyd.c.O(dVarO5, dVarO7);
                            }
                            i104 = i105;
                        }
                        eVarB9.add(fcg.b.p(dVarO5, aVar2));
                        eVarB9.add(dVar10.d(pricingList, ratesType));
                        listM = u.a(eVarB9);
                    }
                } else {
                    int i110 = gdg.c.f143177a[ratesType.ordinal()];
                    if (i110 == 1) {
                        listM = f0.f322471a;
                    } else {
                        if (i110 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s0 s0Var4 = new s0(4);
                        s0Var4.a(dVar10.e(i2, pricingList));
                        ArrayList arrayList6 = new ArrayList(w.t(pricingList, 10));
                        Iterator it10 = pricingList.iterator();
                        while (it10.hasNext()) {
                            arrayList6.add(m.a((Pricing) it10.next()));
                        }
                        PriceFee priceFee2 = (PriceFee) d0.d0(w.u(arrayList6));
                        s0Var4.a(priceFee2 != null ? fcg.b.c(priceFee2.d) : null);
                        s0Var4.b(dVar10.f(pricingList, new gd8.j(4)).toArray(new i[0]));
                        s0Var4.a(dVar10.d(pricingList, ratesType));
                        ArrayList arrayList7 = s0Var4.f186433a;
                        listM = zhm.v.m(arrayList7.toArray(new i[arrayList7.size()]));
                    }
                }
                List list5 = listM;
                yp0.b.k(list5, 0, 0, 0, 0, 31);
                dj0.d.Companion.getClass();
                dj0.d dVarF2 = dj0.d.e;
                int i111 = 0;
                for (Object obj13 : pricingList) {
                    int i112 = i111 + 1;
                    if (i111 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarF2 = i111 == 0 ? m.f((Pricing) obj13, ratesType) : pyd.c.O(dVarF2, m.f((Pricing) obj13, ratesType));
                    i111 = i112;
                }
                dj0.d.Companion.getClass();
                dj0.d dVarE3 = dj0.d.e;
                int i113 = 0;
                for (Object obj14 : pricingList) {
                    int i114 = i113 + 1;
                    if (i113 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarE3 = i113 == 0 ? m.e((Pricing) obj14, ratesType) : pyd.c.O(dVarE3, m.e((Pricing) obj14, ratesType));
                    i113 = i114;
                }
                boolean zF2 = Intrinsics.f(dVarF2.f115083b, dVarE3.f115083b);
                int i115 = gdg.c.f143177a[ratesType.ordinal()];
                if (i115 == 1) {
                    s0 s0Var5 = new s0(4);
                    s0Var5.a(dVar10.e(i2, pricingList));
                    s0Var5.b(dVar10.f(pricingList, new gd8.j(2)).toArray(new i[0]));
                    s0Var5.a(dVar10.c(pricingList, ratesType));
                    TextDelegate.Model modelB4 = dVar10.b(pricingList, ratesType);
                    if (dVarF2.k() || zF2) {
                        modelB4 = null;
                    }
                    s0Var5.a(modelB4);
                    ArrayList arrayList8 = s0Var5.f186433a;
                    listM2 = zhm.v.m(arrayList8.toArray(new i[arrayList8.size()]));
                } else {
                    if (i115 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s0 s0Var6 = new s0(3);
                    s0Var6.b(dVar10.f(pricingList, new gd8.j(3)).toArray(new i[0]));
                    CellDetailsDelegate.Model modelC2 = dVar10.c(pricingList, ratesType);
                    dj0.d.Companion.getClass();
                    dj0.d dVarE4 = dj0.d.e;
                    int i116 = 0;
                    for (Object obj15 : pricingList) {
                        int i117 = i116 + 1;
                        if (i116 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        dVarE4 = i116 == 0 ? m.e((Pricing) obj15, ratesType) : pyd.c.O(dVarE4, m.e((Pricing) obj15, ratesType));
                        i116 = i117;
                    }
                    if (dVarE4.k()) {
                        modelC2 = null;
                    }
                    s0Var6.a(modelC2);
                    TextDelegate.Model modelB5 = dVar10.b(pricingList, ratesType);
                    if (dVarF2.k() || zF2) {
                        modelB5 = null;
                    }
                    s0Var6.a(modelB5);
                    ArrayList arrayList9 = s0Var6.f186433a;
                    listM2 = zhm.v.m(arrayList9.toArray(new i[arrayList9.size()]));
                }
                List list6 = listM2;
                yp0.b.k(list6, 0, 0, 0, 0, 31);
                ArrayList arrayList10 = new ArrayList(w.t(pricingList, 10));
                Iterator it11 = pricingList.iterator();
                while (it11.hasNext()) {
                    arrayList10.add(boh.f.k((Pricing) it11.next()));
                }
                dj0.d.Companion.getClass();
                dj0.d money5 = dj0.d.e;
                int i118 = 0;
                for (Object obj16 : arrayList10) {
                    int i119 = i118 + 1;
                    if (i118 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    money5 = i118 == 0 ? (dj0.d) obj16 : pyd.c.O(money5, (dj0.d) obj16);
                    i118 = i119;
                }
                Intrinsics.checkNotNullParameter(money5, "money");
                List listC2 = u.c(fcg.b.m(R$string.hotels_price_breakdown_total, money5, "TOTAL_ITEM_ID"));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                dj0.d.Companion.getClass();
                dj0.d dVarO8 = dj0.d.e;
                int i120 = 0;
                for (Object obj17 : pricingList) {
                    int i121 = i120 + 1;
                    if (i120 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i120 == 0) {
                        Pricing pricing3 = (Pricing) obj17;
                        HotelsPropertyCashback hotelsPropertyCashback = pricing3.e;
                        if (hotelsPropertyCashback == null || (dVarO8 = hotelsPropertyCashback.f98011a) == null) {
                            dVarO8 = new dj0.d(0L, pricing3.f98068c.f98057a.f115083b);
                        }
                    } else {
                        Pricing pricing4 = (Pricing) obj17;
                        HotelsPropertyCashback hotelsPropertyCashback2 = pricing4.e;
                        if (hotelsPropertyCashback2 == null || (dVar2 = hotelsPropertyCashback2.f98011a) == null) {
                            dVar2 = new dj0.d(0L, pricing4.f98068c.f98057a.f115083b);
                        }
                        dVarO8 = pyd.c.O(dVarO8, dVar2);
                    }
                    i120 = i121;
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj18 : pricingList) {
                    if (((Pricing) obj18).e != null) {
                        arrayList11.add(obj18);
                    }
                }
                ArrayList arrayList12 = new ArrayList();
                Iterator it12 = arrayList11.iterator();
                while (it12.hasNext()) {
                    HotelsPropertyCashback hotelsPropertyCashback3 = ((Pricing) it12.next()).e;
                    if (hotelsPropertyCashback3 != null) {
                        arrayList12.add(hotelsPropertyCashback3);
                    }
                }
                if (dVarO8.k()) {
                    listL = f0.f322471a;
                } else {
                    q6 q6Var = new q6("CASHBACK_ITEM_ID", new TextLocalisedClause(R$string.hotels_price_breakdown_cashback_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), h9g.g.a(new HotelsPropertyCashback(((HotelsPropertyCashback) d0.b0(arrayList12)).f98012b, dVarO8)), null, null, R$attr.uikit_dp12, 0, 1912);
                    double d = ((HotelsPropertyCashback) d0.b0(arrayList12)).f98012b;
                    Intrinsics.checkNotNullParameter(pricingList, "<this>");
                    ArrayList arrayList13 = new ArrayList(w.t(pricingList, 10));
                    Iterator it13 = pricingList.iterator();
                    while (it13.hasNext()) {
                        arrayList13.add(((Pricing) it13.next()).f98068c.f98058b.f115083b);
                    }
                    List listU = d0.U(arrayList13);
                    ArrayList arrayList14 = new ArrayList();
                    Iterator it14 = pricingList.iterator();
                    while (it14.hasNext()) {
                        OverallPrice overallPrice4 = ((Pricing) it14.next()).d;
                        xi0.b bVar = (overallPrice4 == null || (dVar = overallPrice4.f98058b) == null) ? null : dVar.f115083b;
                        if (bVar != null) {
                            arrayList14.add(bVar);
                        }
                    }
                    List listU2 = d0.U(arrayList14);
                    boolean z = listU.size() == 1 && listU2.size() == 1 && !Intrinsics.f(d0.b0(listU), d0.b0(listU2));
                    if (ratesType == cgi.e.PAY_NOW && !z) {
                        textLocalisedClause = new TextLocalisedClause(R$string.hotels_price_breakdown_cashback_pay_now_subtitle, u.c(dVar10.a(d)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                    } else if (ratesType == cgi.e.PAY_LATER) {
                        int i122 = gdg.c.f143177a[ratesType.ordinal()];
                        if (i122 == 1) {
                            i = R$string.hotels_price_breakdown_cashback_pay_later_subtitle;
                        } else {
                            if (i122 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$string.hotels_price_breakdown_instant_cashback_subtitle;
                        }
                        textLocalisedClause = new TextLocalisedClause(i, u.c(dVar10.a(d)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                    } else {
                        textLocalisedClause = new TextLocalisedClause(R$string.hotels_price_breakdown_cashback_generic_subtitle, u.c(dVar10.a(d)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                    }
                    i[] elements = {q6Var, new TextDelegate.Model("CASHBACK_SUBTITLE_ITEM_ID", textLocalisedClause, false, new ak0(yj0.START, null, 2), null, null, 0, 0, 0, 0, 2036)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    listL = kotlin.collections.d.L(elements);
                }
                List list7 = listL;
                yp0.b.k(list7, 0, 0, 0, 0, 31);
                arrayListU = w.u(zhm.v.k(list5, list6, listC2, list7));
            }
            collectionA = arrayListU;
        } else {
            collectionA = f0.f322471a;
        }
        Collection collection = collectionA;
        PaymentMethod.Pocket pocket = travelHotelsPriceBreakdownScreenContract$InputData.e;
        if (pocket == null || (aVar = travelHotelsPriceBreakdownScreenContract$InputData.f) == null) {
            iterableL = f0.f322471a;
        } else {
            ExpandableDisclaimerConfiguration expandableDisclaimerConfigurationB = kdc.d.b(pocket, aVar);
            iterableL = zhm.v.l((expandableDisclaimerConfigurationB == null || (clause = expandableDisclaimerConfigurationB.f84341b) == null) ? null : new TextDelegate.Model("SAVINGS_TERMS_FOOTER_ITEM_ID", clause, false, new ak0(yj0.CENTER_HORIZONTAL, null, 2), null, null, 0, 0, 0, 0, 2036));
        }
        return new e(d0.E0(iterableL, collection));
    }
}
