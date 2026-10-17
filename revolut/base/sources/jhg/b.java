package jhg;

import aim.e;
import aw0.d7;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.android.R$string;
import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.k;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$plurals;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAirlineIcon;
import com.revolut.tracking.v3.AirMilesSearchResultClickContext;
import dj0.d;
import f01.c;
import hfg.c0;
import hfg.d0;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rw0.f;
import rw0.i;
import rw0.j;
import rw0.l;
import rw0.n;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f174248a;

    public b(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f174248a = uiKitResources;
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v35 */
    public final TripDetailsDelegate.Model a(String listId, d0 flight, double d, d flightClassTaxesPrice, TextLocalisedClause textLocalisedClause, Object obj2) {
        Clause textClause;
        List listL;
        long j2;
        boolean z;
        Clause clauseM;
        ?? r102;
        AnalyticsContext analyticsContext;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(flight, "flight");
        Intrinsics.checkNotNullParameter(flightClassTaxesPrice, "flightClassTaxesPrice");
        ArrayList arrayList = flight.f151816b;
        LocalDateTime localDateTime = flight.d;
        LocalDateTime localDateTime2 = flight.f151817c;
        String str = flight.f151815a;
        int size = arrayList.size();
        if (size == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Airlines cannot be empty. Flight id: ", str));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (size == 1) {
            textClause = new TextClause(((c0) zhm.d0.b0(arrayList)).f151809a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (size != 2) {
            List listV0 = zhm.d0.V0(arrayList, 2);
            ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
            Iterator it8 = listV0.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new TextClause(((c0) it8.next()).f151809a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
            textClause = new CompositeClause(zhm.d0.F0(new TextLocalisedQuantityClause(R$plurals.miles_search_flight_more_airlines, Integer.valueOf(arrayList.size() - 2), u.c(Integer.valueOf(arrayList.size() - 2)), (Style) null, 24), arrayList2), new TextClause(" + ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                arrayList3.add(new TextClause(((c0) it9.next()).f151809a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
            textClause = new CompositeClause(arrayList3, new TextClause(" + ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        Clause clause = textClause;
        ArrayList arrayList4 = new ArrayList();
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = ((c0) it10.next()).f151810b;
            TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
            if (local != null) {
                arrayList4.add(local);
            }
        }
        if (arrayList4.isEmpty()) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it11 = arrayList.iterator();
            while (it11.hasNext()) {
                Image imageB = b(((c0) it11.next()).f151810b);
                if (imageB != null) {
                    arrayList5.add(imageB);
                }
            }
            listL = arrayList5;
        } else {
            listL = v.l(b((TravelMilesSearchAirlineIcon) zhm.d0.b0(arrayList4)));
        }
        rw0.b header = new rw0.b(new i(clause, listL));
        k kVar = d7.Companion;
        LocalTime localTime = localDateTime2.toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
        j startPoint = new j(k.a(kVar, localTime), null, new TextClause(flight.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        LocalTime localTime2 = localDateTime.toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
        TimeClause timeClauseA = k.a(kVar, localTime2);
        long jBetween = ChronoUnit.DAYS.between(localDateTime2.toLocalDate(), localDateTime.toLocalDate());
        j endPoint = new j(timeClauseA, jBetween > 0 ? new TextClause(p.a.m(jBetween, "+"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextClause(flight.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        Duration duration = flight.f151818g;
        long minutes = duration.toMinutes();
        if (minutes <= 0) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Flight duration has to be greater than 0: " + minutes + ". Flight id: " + str);
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
            clauseM = new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            r102 = 0;
        } else {
            long hours = duration.toHours();
            long minutes2 = duration.minusHours(hours).toMinutes();
            e eVarB = u.b();
            if (hours > 0) {
                j2 = 0;
                eVarB.add(yoj.b.w(new TextClause(String.valueOf(hours), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.date_shortest_hour_format, null, null, 14)));
            } else {
                j2 = 0;
            }
            if (minutes2 > j2) {
                z = false;
                eVarB.add(yoj.b.w(new TextClause(String.valueOf(minutes2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.date_shortest_minute_format, null, null, 14)));
            } else {
                z = false;
            }
            clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.a(eVarB));
            r102 = z;
        }
        Clause middleText = clauseM;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_flight_price, r102, r102, 14);
        CompositeClause compositeClauseK = nub.a.k(d, o9.NON_SENSITIVE, null, Integer.valueOf(R$attr.uikit_colorForeground), 16.0f, null, 38);
        MoneyClause moneyClause = new MoneyClause(flightClassTaxesPrice, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        if (flightClassTaxesPrice.k()) {
            moneyClause = null;
        }
        f priceFooter = new f(textLocalisedClause2, compositeClauseK, moneyClause);
        int i = flight.f151820j - 1;
        Clause middleBottomText = i == 0 ? new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_flight_nonstop, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.miles_search_flight_stops, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(middleText, "middleText");
        Intrinsics.checkNotNullParameter(middleBottomText, "middleBottomText");
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(priceFooter, "priceFooter");
        n nVar = new n(header, middleText, middleBottomText, new l(startPoint), new l(endPoint), priceFooter);
        String str2 = flight.f151821l;
        String str3 = flight.k;
        if (str2 == null || str3 == null) {
            analyticsContext = null;
        } else {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            AirMilesSearchResultClickContext.b bVarNewBuilder = AirMilesSearchResultClickContext.newBuilder();
            bVarNewBuilder.c();
            ((AirMilesSearchResultClickContext) bVarNewBuilder.f49761b).setResultId(str2);
            bVarNewBuilder.c();
            ((AirMilesSearchResultClickContext) bVarNewBuilder.f49761b).setPartner(str3);
            ArrayList arrayList6 = flight.f151816b;
            ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
            int i2 = 0;
            for (Object obj3 : arrayList6) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                arrayList7.add(new Pair(Integer.valueOf(i2), ((c0) obj3).f151809a));
                i2 = i3;
            }
            Map mapT = r0.t(arrayList7);
            bVarNewBuilder.c();
            ((AirMilesSearchResultClickContext) bVarNewBuilder.f49761b).getMutableAirlinesMap().putAll(mapT);
            w0 w0VarA = bVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        }
        TripDetailsDelegate.Model model = new TripDetailsDelegate.Model(listId, nVar, true, textLocalisedClause, analyticsContext, obj2);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final Image b(TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon) {
        if (travelMilesSearchAirlineIcon == null) {
            return null;
        }
        if (!(travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local)) {
            if (travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote) {
                return new UrlImage(((TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon).f94124a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            }
            throw new NoWhenBranchMatchedException();
        }
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        String str = ((TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon).f94123a;
        int iA = this.f174248a.a(str);
        if (iA <= 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str, " not found"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            iA = R$drawable.uikit_icn_24_travel;
        }
        return companion.i(iA, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10);
    }
}
