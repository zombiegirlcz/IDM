package yhg;

import aw0.e;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FlightSegmentDelegate;
import com.revolut.core.ui_kit.delegates.h6;
import com.revolut.core.ui_kit.delegates.i6;
import com.revolut.core.ui_kit.delegates.j6;
import com.revolut.core.ui_kit.delegates.k6;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAirlineIcon;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$FlightSegment;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$NextConnection;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$SegmentsBreakdown;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rd0.d;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f314166a;

    public c(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f314166a = uiKitResources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.revolut.core.ui_kit.models.TextClause] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // cli.n
    public final o c(j jVar) {
        ?? arrayList;
        Image urlImage;
        FlightSegmentDelegate.Model.a h6Var;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = domainState.f314165a;
        ArrayList arrayList2 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
        ArrayList<TravelMilesSearchFlightDetails$FlightSegment> arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
        String str = null;
        if (arrayList2.isEmpty()) {
            arrayList = f0.f322471a;
        } else {
            LocalDate localDate = ((TravelMilesSearchFlightDetails$FlightSegment) d0.b0(arrayList3)).f94131g.toLocalDate();
            arrayList = new ArrayList(w.t(arrayList3, 10));
            for (TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment : arrayList3) {
                TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                Intrinsics.h(localDate);
                String str2 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                if (travelMilesSearchAirlineIcon == null) {
                    m70.a.c(t0.f186434a);
                    urlImage = new UrlImage("", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                } else if (travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local) {
                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                    String str3 = ((TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon).f94123a;
                    int iA = this.f314166a.a(str3);
                    if (iA <= 0) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str3, " not found"));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                        d.a(rd0.c.ERROR, str, str, illegalArgumentException, h0Var);
                        iA = R$drawable.uikit_icn_24_travel;
                    }
                    urlImage = companion.i(iA, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10);
                } else {
                    if (!(travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    urlImage = new UrlImage(((TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon).f94124a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                }
                TextClause textClause = new TextClause(travelMilesSearchFlightDetails$FlightSegment.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause2 = new TextClause(travelMilesSearchFlightDetails$FlightSegment.f94129b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                k6 k6Var = new k6(textClause, textClause2, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : str);
                Image image = urlImage;
                LocalDateTime localDateTime = travelMilesSearchFlightDetails$FlightSegment.f94131g;
                LocalDateTime localDateTime2 = travelMilesSearchFlightDetails$FlightSegment.f94132h;
                Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                List listK = v.k(new TextClause(travelMilesSearchFlightDetails$FlightSegment.f94133j, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(travelMilesSearchFlightDetails$FlightSegment.f94134l, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                t0 t0Var = t0.f186434a;
                m70.a.t(t0Var);
                CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                List listK2 = v.k(new TextClause(travelMilesSearchFlightDetails$FlightSegment.k, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(travelMilesSearchFlightDetails$FlightSegment.f94135m, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                CompositeClause compositeClause2 = new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                if (travelMilesSearchFlightDetails$NextConnection != null) {
                    Duration durationOf = Duration.of(travelMilesSearchFlightDetails$NextConnection.f94138b, ChronoUnit.MINUTES);
                    if (travelMilesSearchFlightDetails$NextConnection.f94137a) {
                        TextClause textClause3 = new TextClause(travelMilesSearchFlightDetails$FlightSegment.f94135m, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        Intrinsics.h(durationOf);
                        h6Var = new i6(textClause3, durationOf);
                    } else {
                        Intrinsics.h(durationOf);
                        h6Var = new j6(durationOf);
                    }
                } else {
                    h6Var = new h6(travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a);
                }
                arrayList.add(new FlightSegmentDelegate.Model(str2, image, k6Var, localDate, localDateTime, compositeClause, duration, localDateTime2, compositeClause2, h6Var));
                str = null;
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R$string.miles_flight_details_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayList, new lw0.a(new TextLocalisedClause(R$string.miles_flight_details_segments, null, null, 14), null, null, null, false, 30));
    }
}
