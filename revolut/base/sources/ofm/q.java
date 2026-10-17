package ofm;

import android.content.Context;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import aw0.o9;
import bjk.k0;
import bjk.l0;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsLoyaltyProgrammeSummary;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAddress;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.trading.core.domain.orders.InvestStockOrder;
import com.revolut.retail.trading.core.domain.orders.InvestTaaOrder;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import d9.e1;
import dfl.i0;
import dx4.a1;
import dx4.y0;
import e8l.u;
import efm.y;
import ggk.s;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import rv1.x;
import skm.g1;
import tof.a3;
import tof.e0;
import yhm.m;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f224945a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bgm.d f224946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ufm.g f224947c;
    public volatile boolean d;
    public volatile boolean e;
    public Throwable f;

    public q(bgm.d dVar, ufm.g gVar) {
        this.f224946b = dVar;
        this.f224947c = gVar;
    }

    public static final boolean A(qua.p pVar, DateTime dateNow) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(dateNow, "dateNow");
        LocalDate localDate = pVar.f249314a.f;
        return pd.b.j(localDate != null ? Boolean.valueOf(localDate.isEqual(dateNow.toLocalDate())) : null);
    }

    public static final boolean B(qua.p pVar, DateTime dateNow) {
        LocalDate localDateMinusDays;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(dateNow, "dateNow");
        LocalDate localDate = pVar.f249314a.f;
        return pd.b.j((localDate == null || (localDateMinusDays = localDate.minusDays(1)) == null) ? null : Boolean.valueOf(localDateMinusDays.isEqual(dateNow.toLocalDate())));
    }

    public static final boolean C(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (!iVar.getType().e() || !Intrinsics.f(iVar.getRecurring(), Boolean.FALSE)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.L() == null;
    }

    public static final boolean D(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.getType() == ibd.h.PAY_LATER_PAYMENT;
    }

    public static final boolean E(qua.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.REFUND;
    }

    public static final boolean F(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return jli.e.e(iVar.L());
    }

    public static final boolean G(oq9.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        List listK = iVar.k();
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return true;
        }
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            if (((oq9.j) it8.next()).d instanceof oq9.n) {
                return false;
            }
        }
        return true;
    }

    public static final boolean H(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.L() == null;
    }

    public static final boolean I(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return jli.e.f(iVar.L());
    }

    public static final Object J(yy0.f fVar, Image image, Context context, int i, int i2, gim.c frame) {
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        fVar.c(image, context, i, i2, new o8c.e(lVar, 4), new b9k.k(lVar, 5));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    public static final void K(mki.b bVar, ActionFooterView view) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag2 = view.getTag(R$id.internal_bottom_sheet_footer_registrator_set);
        Boolean bool = tag2 instanceof Boolean ? (Boolean) tag2 : null;
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        view.setTag(R$id.internal_bottom_sheet_footer_registrator_set, Boolean.TRUE);
        Intrinsics.checkNotNullParameter(view, "view");
        es0.k kVar = new es0.k();
        if (view.isAttachedToWindow()) {
            kVar.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(kVar);
    }

    public static final rfm.d L(CoroutineContext coroutineContext, Function2 function2) {
        if (coroutineContext.get(g1.f263979a) == null) {
            return new rfm.d(new clm.m(coroutineContext, function2, 0), 0);
        }
        throw new IllegalArgumentException(("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static final Clause M(sr6.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return sy6.a.f266627b[bVar.ordinal()] == 1 ? new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_option_upon_receipt, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.freelancer_sale_invoice_schedule_option_in_days, Integer.valueOf(bVar.b()), (List) null, (Style) null, 28);
    }

    public static final TextLocalisedClause N(sr6.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = sy6.a.f266626a[aVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.freelancer_sale_invoice_default_date_option_today, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.freelancer_sale_invoice_default_date_option_first_day_current_month, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.freelancer_sale_invoice_default_date_option_first_day_next_month, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextLocalisedClause O(v60.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new TextLocalisedClause(dVar.a(), (List) null, (Clause) null, dVar instanceof v60.c, 14);
    }

    public static final k71.i P(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        int i = vhf.a.f289470a[a3Var.L1.ordinal()];
        if (i == 1) {
            return new k71.h(a3Var, e0.f272704a);
        }
        if (i == 2) {
            return new k71.g(a3Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TradeRevPointsAccount Q(j1f.c cVar) {
        u2f.j jVar;
        u2f.j jVar2;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f170367a;
        String str2 = cVar.f170368b;
        u2f.j[] jVarArrValues = u2f.j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            jVar = null;
            if (i >= length) {
                jVar2 = null;
                break;
            }
            jVar2 = jVarArrValues[i];
            if (a0.z(jVar2.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (jVar2 == null) {
            jVar2 = u2f.j.UNKNOWN;
        }
        int i2 = 0;
        u2f.j jVar3 = jVar2;
        String str3 = cVar.f170369c;
        j1f.a0 a0Var = cVar.d;
        String str4 = a0Var.f170362a;
        String str5 = a0Var.f170363b;
        u2f.j[] jVarArrValues2 = u2f.j.values();
        int length2 = jVarArrValues2.length;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            u2f.j jVar4 = jVarArrValues2[i2];
            if (a0.z(jVar4.name(), str5, true)) {
                jVar = jVar4;
                break;
            }
            i2++;
        }
        if (jVar == null) {
            jVar = u2f.j.UNKNOWN;
        }
        return new TradeRevPointsAccount(str, jVar3, str3, new TradeRevPointsLoyaltyProgrammeSummary(str4, jVar, a0Var.f170364c, a0Var.d), cVar.e);
    }

    public static final TradeRevPointsAccount R(p1f.a aVar) {
        u2f.j jVar;
        u2f.j jVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f231897a;
        String str2 = aVar.f231898b;
        u2f.j[] jVarArrValues = u2f.j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            jVar = null;
            if (i >= length) {
                jVar2 = null;
                break;
            }
            jVar2 = jVarArrValues[i];
            if (a0.z(jVar2.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (jVar2 == null) {
            jVar2 = u2f.j.UNKNOWN;
        }
        int i2 = 0;
        u2f.j jVar3 = jVar2;
        String str3 = aVar.f231899c;
        p1f.c cVar = aVar.d;
        String str4 = cVar.f231914a;
        String str5 = cVar.d;
        u2f.j[] jVarArrValues2 = u2f.j.values();
        int length2 = jVarArrValues2.length;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            u2f.j jVar4 = jVarArrValues2[i2];
            if (a0.z(jVar4.name(), str5, true)) {
                jVar = jVar4;
                break;
            }
            i2++;
        }
        if (jVar == null) {
            jVar = u2f.j.UNKNOWN;
        }
        return new TradeRevPointsAccount(str, jVar3, str3, new TradeRevPointsLoyaltyProgrammeSummary(str4, jVar, cVar.f231915b, cVar.f231916c), aVar.e);
    }

    public static final TravelExperienceAddress S(qzf.c cVar) {
        String str;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String streetLine1 = cVar.getStreetLine1();
        if (streetLine1 == null) {
            m70.a.c(t0.f186434a);
            streetLine1 = "";
        }
        String streetLine2 = cVar.getStreetLine2();
        if (streetLine2 == null) {
            m70.a.c(t0.f186434a);
            streetLine2 = "";
        }
        String region = cVar.getRegion();
        if (region == null) {
            m70.a.c(t0.f186434a);
            region = "";
        }
        String city = cVar.getCity();
        if (city == null) {
            m70.a.c(t0.f186434a);
            city = "";
        }
        String country = cVar.getCountry();
        if (country == null) {
            m70.a.c(t0.f186434a);
            country = "";
        }
        String postcode = cVar.getPostcode();
        if (postcode == null) {
            m70.a.c(t0.f186434a);
            str = "";
        } else {
            str = postcode;
        }
        return new TravelExperienceAddress(streetLine1, streetLine2, region, city, country, str);
    }

    public static final TravelExperienceAddress T(rzf.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new TravelExperienceAddress(bVar.getStreetLine1(), bVar.getStreetLine2(), bVar.getRegion(), bVar.getCity(), bVar.getCountry(), bVar.getPostcode());
    }

    public static final TravelExperienceLocation U(qzf.a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        String id10 = a0Var.getId();
        String name = a0Var.getName();
        if (name == null) {
            m70.a.c(t0.f186434a);
            name = "";
        }
        qzf.c address = a0Var.getAddress();
        return new TravelExperienceLocation(id10, name, address != null ? S(address) : null);
    }

    public static final OrderRate V(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        BigDecimal bigDecimal = new BigDecimal(uVar.getMarketRate());
        BigDecimal bigDecimal2 = new BigDecimal(uVar.getFinalRate());
        String strB = uVar.getEffectiveRate();
        BigDecimal bigDecimal3 = strB != null ? new BigDecimal(strB) : null;
        Amount amountF = mif.a.F(uVar.getTotalMarkup());
        Boolean boolA = uVar.getDealing();
        return new OrderRate(bigDecimal, bigDecimal2, bigDecimal3, amountF, boolA != null ? boolA.booleanValue() : true);
    }

    public static final ggk.q W(k0 k0Var) {
        String icon;
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        String type = k0Var.getType();
        ggk.r rVar = null;
        s sVar = null;
        if (Intrinsics.f(type, "IMAGE")) {
            String imageUrl = k0Var.getImageUrl();
            if (imageUrl != null) {
                l0 badge = k0Var.getBadge();
                if (badge != null) {
                    Intrinsics.checkNotNullParameter(badge, "<this>");
                    String icon2 = badge.getIcon();
                    String style = badge.getStyle();
                    s[] sVarArrValues = s.values();
                    int length = sVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        s sVar2 = sVarArrValues[i];
                        if (a0.z(sVar2.name(), style, true)) {
                            sVar = sVar2;
                            break;
                        }
                        i++;
                    }
                    if (sVar == null) {
                        sVar = s.UNKNOWN;
                    }
                    rVar = new ggk.r(icon2, sVar);
                }
                return new ggk.p(imageUrl, rVar);
            }
        } else if (Intrinsics.f(type, "ICON") && (icon = k0Var.getIcon()) != null) {
            return new ggk.o(icon);
        }
        return null;
    }

    public static final ol4.a X(vn4.a aVar) {
        a1 a1VarA;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strA = aVar.getAccountName();
        String strC = aVar.getTitle();
        vn4.b bVarB = aVar.getSubtitle();
        ol4.b bVar = null;
        if (bVarB != null) {
            String text = bVarB.getText();
            if (bVarB.getIcon() != null) {
                y0 y0Var = a1.Companion;
                String icon = bVarB.getIcon();
                y0Var.getClass();
                a1VarA = y0.a(icon);
            } else {
                a1VarA = null;
            }
            nx4.n action = bVarB.getAction();
            bVar = new ol4.b(text, a1VarA, action != null ? nx4.p.a(action) : null);
        }
        return new ol4.a(strA, strC, bVar);
    }

    public static final udh.a Y(t7h.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i = u7h.a.f277755a[fVar.ordinal()];
        if (i == 1) {
            return udh.a.KILLSWITCH;
        }
        if (i == 2) {
            return udh.a.NON_MARGINABLE_INSTRUMENT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xbc.b Z(oac.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strF = aVar.getOrderId();
        String strC = aVar.getBookingReference();
        String strB = aVar.getBookingManagementUrl();
        Boolean boolE = aVar.getNotificationsEnabled();
        List<oac.d> listD = aVar.getFlightTickets();
        ArrayList arrayList = new ArrayList(w.t(listD, 10));
        for (oac.d dVar : listD) {
            arrayList.add(new xbc.j(dVar.getAirlineName(), dVar.getAirlineIataCode(), dVar.getAirlineLogoUrl(), dVar.getFlightNumber(), dVar.getDurationMinutes(), a0(dVar.getArrival()), a0(dVar.getDeparture())));
        }
        return new xbc.b(strF, strC, strB, boolE, arrayList);
    }

    public static final xbc.g a0(oac.c cVar) {
        xbc.f fVar;
        xbc.h hVar;
        String strB = cVar.getAirportIataCode();
        String strG = cVar.getTerminal();
        String strC = cVar.getGate();
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(cVar.getScheduledTime());
        Intrinsics.checkNotNullExpressionValue(zonedDateTime, "parse(...)");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(cVar.getActualTime());
        Intrinsics.checkNotNullExpressionValue(zonedDateTime2, "parse(...)");
        String strF = cVar.getStatus();
        xbc.h[] hVarArrValues = xbc.h.values();
        int length = hVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            fVar = null;
            if (i2 >= length) {
                hVar = null;
                break;
            }
            xbc.h hVar2 = hVarArrValues[i2];
            if (a0.z(hVar2.name(), strF, true)) {
                hVar = hVar2;
                break;
            }
            i2++;
        }
        if (hVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String strD = cVar.getPunctuality();
        if (strD != null) {
            xbc.f[] fVarArrValues = xbc.f.values();
            int length2 = fVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                xbc.f fVar2 = fVarArrValues[i];
                if (a0.z(fVar2.name(), strD, true)) {
                    fVar = fVar2;
                    break;
                }
                i++;
            }
        }
        return new xbc.g(strB, strG, strC, zonedDateTime, zonedDateTime2, hVar, fVar);
    }

    public static final Object b(yy0.f fVar, Image image, ImageView imageView, gim.i frame) {
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        fVar.a(image, imageView, new o8c.e(lVar, 3), new b9k.k(lVar, 4));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    public static final xk5.a b0(al5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List listA = aVar.getCurrencies();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        int i = 0;
        for (Object obj2 : listA) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new Pair((String) obj2, Integer.valueOf(i)));
            i = i2;
        }
        return new xk5.a(r0.t(arrayList));
    }

    public static final boolean c(fui.e eVar, dj0.d checkoutPrice) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        PaymentMethod.Pocket pocket = eVar.f138217a;
        dj0.d dVar = pocket.i;
        if (Intrinsics.f(pocket.i.f115083b, checkoutPrice.f115083b)) {
            return dVar.e(checkoutPrice);
        }
        xi0.b bVar = dVar.f115083b;
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CheckoutRevPayExtensions", a0.d.s("Can not perform balance sufficiency check. Pocket currency ", bVar.f306286a, " does not match payment currency ", checkoutPrice.f115083b.f306286a), null, h0Var);
        return false;
    }

    public static final al5.a c0(xk5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List listP0 = d0.P0(aVar.f306608a.entrySet(), new el5.b());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add((String) ((Map.Entry) it8.next()).getKey());
        }
        return new al5.a(arrayList);
    }

    public static final void d(yy0.f fVar, Image image, LottieAnimationView to6, jz0.c cVar) {
        yuc.p pVar;
        yq0.e eVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (cVar != null) {
            pVar = new yuc.p(cVar, 19);
            eVar = new yq0.e(cVar, 16);
        } else {
            pVar = null;
            eVar = null;
        }
        fVar.a(image, to6, pVar, eVar);
    }

    public static final k0 d0(ggk.q qVar) {
        l0 l0Var;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (!(qVar instanceof ggk.p)) {
            if (qVar instanceof ggk.o) {
                return new k0("ICON", null, ((ggk.o) qVar).f143762a, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        ggk.p pVar = (ggk.p) qVar;
        String str = pVar.f143768a;
        ggk.r rVar = pVar.f143769b;
        if (rVar != null) {
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            l0Var = new l0(rVar.f143773a, rVar.f143774b.name());
        } else {
            l0Var = null;
        }
        return new k0("IMAGE", str, null, l0Var);
    }

    public static void e(yy0.f fVar, Image image, ImageSwitcher to6) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(to6, "to");
        View nextView = to6.getNextView();
        Intrinsics.i(nextView, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        fVar.a(image, (AppCompatImageView) nextView, null, null);
        to6.showNext();
    }

    public static final p1f.a e0(TradeRevPointsAccount tradeRevPointsAccount) {
        Intrinsics.checkNotNullParameter(tradeRevPointsAccount, "<this>");
        String str = tradeRevPointsAccount.f91181a;
        String strName = tradeRevPointsAccount.f91182b.name();
        String str2 = tradeRevPointsAccount.f91183c;
        TradeRevPointsLoyaltyProgrammeSummary tradeRevPointsLoyaltyProgrammeSummary = tradeRevPointsAccount.d;
        return new p1f.a(str, strName, str2, new p1f.c(tradeRevPointsLoyaltyProgrammeSummary.f91187a, tradeRevPointsLoyaltyProgrammeSummary.f91189c, tradeRevPointsLoyaltyProgrammeSummary.d, tradeRevPointsLoyaltyProgrammeSummary.f91188b.name()), tradeRevPointsAccount.e);
    }

    public static final n9l.a f0(qta.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new n9l.a(cVar.f249046a, cVar.f249047b, cVar.f249048c.doubleValue(), cVar.e, cVar.f, cVar.f249049g);
    }

    public static final String g0(qta.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (y6h.d.f311287a[fVar.ordinal()]) {
            case 1:
                return "1d";
            case 2:
                return "1w";
            case 3:
                return "1mo";
            case 4:
                return "3mo";
            case 5:
                return "6mo";
            case 6:
                return "1y";
            case 7:
                return "5y";
            case 8:
                return "max";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final a2a.g h0(qua.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        int i = l1a.a.f191502a[pVar.f249314a.f160152c.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return a2a.g.CARD_MANDATE;
        }
        if (i == 4) {
            return a2a.g.EXTERNAL_MANDATE;
        }
        if (i != 5) {
            return null;
        }
        return a2a.g.STANDING_ORDER;
    }

    public static final String i0(qua.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        ibd.e eVar = pVar.f249314a;
        ibd.e eVar2 = pVar.f249314a;
        return l1a.a.f191502a[eVar.f160152c.ordinal()] == 4 ? kotlin.text.d0.e0(eVar2.f160150a, "EM_") : eVar2.f160150a;
    }

    public static final x j(g12.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        g12.p pVar = qVar instanceof g12.p ? (g12.p) qVar : null;
        g12.m mVar = pVar != null ? pVar.f139527a : null;
        if (mVar instanceof x) {
            return (x) mVar;
        }
        return null;
    }

    public static final int k(mki.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.d() ? R$drawable.uikit_icn_24_cross : R$drawable.uikit_icn_24_back_button_arrow;
    }

    public static final Clause l(k4l.p pVar) throws Throwable {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof k4l.m) {
            return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_status_executed, null, null, 14);
        }
        if (pVar instanceof k4l.n) {
            return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_status_pending, null, null, 14);
        }
        if (!(pVar instanceof k4l.l)) {
            if (pVar instanceof k4l.o) {
                return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_place_order_pending_open_title, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        InvestOrder investOrder = ((k4l.l) pVar).f180990a;
        if (investOrder instanceof InvestStockOrder) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException("Stock order is not expected");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                str = ((InvestStockOrder) investOrder).F;
            }
        } else if (investOrder instanceof InvestTaaOrder) {
            try {
                m.Companion companion3 = yhm.m.INSTANCE;
                throw new IllegalStateException("Tax Advantaged order is not expected");
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th11) {
                m.Companion companion4 = yhm.m.INSTANCE;
                Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                if (thA2 != null) {
                    hx7.e.n(thA2);
                }
                str = ((InvestTaaOrder) investOrder).F;
            }
        } else if (investOrder instanceof InvestCommodityOrder) {
            try {
                m.Companion companion5 = yhm.m.INSTANCE;
                throw new IllegalStateException("Commodity order is not expected");
            } catch (CancellationException e4) {
                throw e4;
            } catch (Throwable th12) {
                m.Companion companion6 = yhm.m.INSTANCE;
                Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                if (thA3 != null) {
                    hx7.e.n(thA3);
                }
                str2 = null;
            }
        } else if (investOrder instanceof InvestFundOrder) {
            try {
                m.Companion companion7 = yhm.m.INSTANCE;
                throw new IllegalStateException("Fund order is not expected");
            } catch (CancellationException e5) {
                throw e5;
            } catch (Throwable th13) {
                m.Companion companion8 = yhm.m.INSTANCE;
                Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                if (thA4 != null) {
                    hx7.e.n(thA4);
                }
                str = ((InvestFundOrder) investOrder).H;
            }
        } else if (investOrder instanceof InvestMutualFundOrder) {
            try {
                m.Companion companion9 = yhm.m.INSTANCE;
                throw new IllegalStateException("Mutual fund order is not expected");
            } catch (CancellationException e6) {
                throw e6;
            } catch (Throwable th14) {
                m.Companion companion10 = yhm.m.INSTANCE;
                Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                if (thA5 != null) {
                    hx7.e.n(thA5);
                }
                str = ((InvestMutualFundOrder) investOrder).H;
            }
        } else if (investOrder instanceof InvestOptionOrder) {
            try {
                m.Companion companion11 = yhm.m.INSTANCE;
                throw new IllegalStateException("Option order is not expected");
            } catch (CancellationException e22) {
                throw e22;
            } catch (Throwable th15) {
                m.Companion companion12 = yhm.m.INSTANCE;
                Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                if (thA6 != null) {
                    hx7.e.n(thA6);
                }
                str = ((InvestOptionOrder) investOrder).H;
            }
        } else {
            if (!(investOrder instanceof InvestMarginOrder)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((InvestMarginOrder) investOrder).L;
        }
        str2 = str;
        return (str2 == null || str2.length() == 0) ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_status_declined, null, null, 14) : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final BigDecimal m(qta.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        BigDecimal bigDecimal = cVar.d;
        if (bigDecimal != null) {
            if (e1.I(bigDecimal)) {
                bigDecimal = null;
            }
            if (bigDecimal != null) {
                BigDecimal bigDecimalSubtract = cVar.f249048c.subtract(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal, RoundingMode.HALF_EVEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(100));
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                return bigDecimalMultiply;
            }
        }
        return null;
    }

    public static final xdh.b n(alc.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        List list = nVar.f6212j;
        List list2 = nVar.f6212j;
        return list.contains(alc.m.PORTFOLIO_TEMPLATE_CHANGE) ? xdh.b.PENDING_TEMPLATE_CHANGE : list2.contains(alc.m.PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE) ? xdh.b.PENDING_TEMPLATE_ALLOCATION_CHANGE : list2.contains(alc.m.INITIAL_FUNDING) ? xdh.b.PENDING_INITIAL_FUNDING : Intrinsics.f(list2, zhm.u.c(alc.m.FUNDING)) ? xdh.b.PENDING_CASH_ALLOCATION : !list2.isEmpty() ? xdh.b.PENDING_REBALANCE : xdh.b.NO_REBALANCE;
    }

    public static final long o(i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Long lE = i0Var.e();
        if (lE != null) {
            return lE.longValue();
        }
        Long lQ = i0Var.q();
        return lQ != null ? lQ.longValue() : i0Var.i();
    }

    public static final boolean p(qua.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.ACQUIRING_ONE_OFF;
    }

    public static final boolean q(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return jli.e.a(iVar.L());
    }

    public static final boolean r(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return jli.e.b(iVar.L());
    }

    public static final boolean s(oq9.i iVar, PaymentGroup group) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(group, "group");
        if (group.i != null) {
            return !iVar.b().isBefore(r2);
        }
        return true;
    }

    public static final boolean t(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.getType().e();
    }

    public static final boolean u(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (!iVar.getType().e() || !Intrinsics.f(iVar.getRecurring(), Boolean.TRUE)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.L() == null;
    }

    public static final boolean v(qua.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        ibd.h hVar = pVar.f249314a.f160152c;
        return hVar == ibd.h.WALLET || hVar == ibd.h.SAVINGS_POCKET || hVar == ibd.h.VAULT;
    }

    public static final boolean w(qua.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.YOUTH_ALLOWANCE;
    }

    public static final boolean x(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return jli.e.d(iVar.L());
    }

    public static final boolean y(ibd.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        LocalDate localDateN2 = iVar.n2();
        LocalDate localDateNow = LocalDate.now();
        if (localDateN2 != null) {
            return localDateN2.isAfter(localDateNow) || localDateN2.isEqual(localDateNow);
        }
        return false;
    }

    public static final boolean z(ibd.i iVar, DateTime dateNow) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(dateNow, "dateNow");
        LocalDate localDateN2 = iVar.n2();
        if (localDateN2 == null) {
            return false;
        }
        LocalDate localDate = dateNow.toLocalDate();
        return localDateN2.isAfter(localDate) || localDateN2.isEqual(localDate);
    }

    public void a(y yVar, Object obj2) {
    }

    public final boolean f() {
        return this.f224945a.getAndIncrement() == 0;
    }

    public final boolean g() {
        AtomicInteger atomicInteger = this.f224945a;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    public final void h(Object obj2, ifm.c cVar) {
        AtomicInteger atomicInteger = this.f224945a;
        int i = atomicInteger.get();
        bgm.d dVar = this.f224946b;
        ufm.g gVar = this.f224947c;
        if (i == 0 && atomicInteger.compareAndSet(0, 1)) {
            a(dVar, obj2);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            gVar.offer(obj2);
            if (!f()) {
                return;
            }
        }
        c6d.b.h(gVar, dVar, cVar, this);
    }

    public final void i(Object obj2, ifm.c cVar) {
        AtomicInteger atomicInteger = this.f224945a;
        int i = atomicInteger.get();
        bgm.d dVar = this.f224946b;
        ufm.g gVar = this.f224947c;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            gVar.offer(obj2);
            if (!f()) {
                return;
            }
        } else if (gVar.isEmpty()) {
            a(dVar, obj2);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            gVar.offer(obj2);
        }
        c6d.b.h(gVar, dVar, cVar, this);
    }
}
