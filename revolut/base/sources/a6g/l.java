package a6g;

import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFareBaggageItem;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFareExtraBenefit;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.feature.travel.flights.models.domain.payment.PriceWithPoints;
import ip0.e8;
import ip0.iq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q4g.m;
import zhm.a0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    @NotNull
    private static final k Companion = new k();

    /* JADX WARN: Type inference failed for: r27v1, types: [com.revolut.core.ui_kit.models.Style, java.lang.Throwable, java.util.List] */
    @Override // cli.n
    public final o c(cli.j jVar) throws Throwable {
        List listA;
        Iterator it8;
        Throwable th10;
        boolean z;
        Object objA;
        Iterable iterable;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f1687a;
        String str = domainState.f1688b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((TravelFlightsFare) obj2).f93517b == null) {
                arrayList.add(obj2);
            }
        }
        int i = 10;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((TravelFlightsFare) it9.next()).f93516a);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z3 = false;
        Throwable th11 = null;
        if (zIsEmpty) {
            List list2 = domainState.f1687a;
            ArrayList arrayList3 = new ArrayList();
            Iterator it10 = list2.iterator();
            while (it10.hasNext()) {
                TravelFlightsFare fare = (TravelFlightsFare) it10.next();
                Intrinsics.checkNotNullParameter(fare, "fare");
                String str2 = fare.f93517b;
                Payment payment = fare.f;
                String str3 = fare.f93516a;
                if (str2 == null) {
                    iterable = f0.f322471a;
                    it8 = it10;
                    z = z3;
                    th10 = th11;
                } else {
                    aim.e eVarB = u.b();
                    eVarB.add(new InputChecklistDelegate.Model(j6.a.q("FARE_OPTION_ID_", str3), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(str3, str), false, null, iq.RADIO_BUTTON, null, null, null, null, 0, 0, 0, 524248));
                    ArrayList arrayList4 = fare.f93518c;
                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, i));
                    int i2 = 0;
                    for (Object obj3 : arrayList4) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            Throwable th12 = th11;
                            v.s();
                            throw th12;
                        }
                        TravelFlightsFareBaggageItem travelFlightsFareBaggageItem = (TravelFlightsFareBaggageItem) obj3;
                        Throwable th13 = th11;
                        Iterator it11 = it10;
                        arrayList5.add(c6g.a.a(v1.c.t(i2, "FARE_OPTION_BAGGAGE_INFO_ID_", str3, "_"), travelFlightsFareBaggageItem.f93522c, travelFlightsFareBaggageItem.f93520a, i2 == 0, v.j(arrayList4) == i2));
                        i2 = i3;
                        th11 = th13;
                        it10 = it11;
                    }
                    it8 = it10;
                    ?? r272 = th11;
                    eVarB.addAll(arrayList5);
                    ArrayList arrayList6 = fare.d;
                    ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                    int i5 = 0;
                    for (Object obj4 : arrayList6) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            v.s();
                            throw r272;
                        }
                        TravelFlightsFareExtraBenefit travelFlightsFareExtraBenefit = (TravelFlightsFareExtraBenefit) obj4;
                        ArrayList arrayList8 = arrayList6;
                        arrayList7.add(c6g.a.a(v1.c.t(i5, "FARE_OPTION_BENEFIT_INFO_ID_", str3, "_"), travelFlightsFareExtraBenefit.f93524b, travelFlightsFareExtraBenefit.f93523a, i5 == 0, v.j(arrayList8) == i5));
                        i5 = i6;
                        arrayList6 = arrayList8;
                    }
                    yp0.b.q(arrayList7, 0, 0, 0, 0, 15);
                    eVarB.addAll(arrayList7);
                    String str4 = "FARE_OPTION_PRICE_ID_" + str3;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_search_result_card_price_title, r272, r272, 14);
                    PriceWithPoints priceWithPoints = payment.f93535b;
                    t0 t0Var = new t0(textLocalisedClause, priceWithPoints != null ? null : new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, priceWithPoints == null, 20);
                    dj0.d dVar = payment.f93534a;
                    MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13);
                    o9 o9Var = o9.NON_SENSITIVE;
                    eVarB.add(new CellDetailsDelegate.Model(str4, t0Var, new MoneyClause(dVar, defaults, null, o9Var, 4), null, payment, null, null, 0, null, false, false, null, null, 30648));
                    if (priceWithPoints != null) {
                        th10 = null;
                        z = false;
                        objA = new e8(j6.a.q("FARE_OPTION_PAY_WITH_POINTS_ID_", str3), new TextLocalisedClause(R$string.travel_flights_search_result_card_pay_with_points_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new nw0.a(priceWithPoints.f93543b.b(), new MoneyClause(priceWithPoints.f93542a, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, o9Var, 4)), payment, R$attr.uikit_dp0, 0, CaptureActivity.RESULT_EXIT_USER_FLOW);
                    } else {
                        th10 = null;
                        z = false;
                        objA = m.a(payment, j6.a.q("FARE_OPTION_POINTS_YOU_EARN_ID_", str3), R$attr.uikit_dp0);
                    }
                    if (objA != null) {
                        eVarB.add(objA);
                    }
                    aim.e eVarA = u.a(eVarB);
                    yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                    iterable = eVarA;
                }
                a0.x(iterable, arrayList3);
                th11 = th10;
                z3 = z;
                it10 = it8;
                i = 10;
            }
            listA = arrayList3;
        } else {
            if (!arrayList2.isEmpty()) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing fare names for fare IDs: " + arrayList2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TravelFlightsFareSelectionStateMapper", null, illegalStateException, h0Var);
            }
            listA = q4g.b.a(4, "FARE_OPTIONS_ERROR_ID", false);
        }
        return new j(listA, (!zIsEmpty || str == null) ? z3 : true, zIsEmpty);
    }
}
