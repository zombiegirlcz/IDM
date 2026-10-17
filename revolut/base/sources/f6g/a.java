package f6g;

import a0.d;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FlightSegmentDelegate;
import com.revolut.core.ui_kit.delegates.h6;
import com.revolut.core.ui_kit.delegates.j6;
import com.revolut.core.ui_kit.delegates.k6;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.flights.models.domain.common.Bound;
import com.revolut.feature.travel.flights.models.domain.common.Carrier;
import com.revolut.feature.travel.flights.models.domain.common.FlightPoint;
import com.revolut.feature.travel.flights.models.domain.common.Segment;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q4g.l;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4g.b f132424a;

    public a(p4g.b dateFormatter) {
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        this.f132424a = dateFormatter;
    }

    public static ArrayList a(Bound bound, int i) {
        FlightSegmentDelegate.Model.a h6Var;
        Bound bound2 = bound;
        Intrinsics.checkNotNullParameter(bound2, "bound");
        ArrayList arrayList = bound2.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            Segment segment = (Segment) obj2;
            Carrier carrier = segment.f93500c;
            FlightPoint flightPoint = segment.f93501g;
            FlightPoint flightPoint2 = segment.f93502h;
            if (carrier == null) {
                carrier = segment.f93499b;
            }
            String strG = d.g(i, i2, "segment_", "_");
            Image imageB = l.b(null, carrier.f93489c);
            k6 k6Var = new k6(new TextClause(carrier.f93488b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(segment.f93498a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
            LocalDate localDate = bound2.f93484a.d.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
            LocalDateTime localDateTime = flightPoint.d;
            CompositeClause compositeClause = new CompositeClause(v.k(new TextClause(flightPoint.f93490a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null), new TextClause(flightPoint.f93492c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
            Duration durationOfMinutes = Duration.ofMinutes(segment.e);
            LocalDateTime localDateTime2 = flightPoint2.d;
            CompositeClause compositeClause2 = new CompositeClause(v.k(new TextClause(flightPoint2.f93490a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null), new TextClause(flightPoint2.f93492c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
            if (segment.i != null) {
                Duration durationOfMinutes2 = Duration.ofMinutes(r4.intValue());
                Intrinsics.checkNotNullExpressionValue(durationOfMinutes2, "ofMinutes(...)");
                h6Var = new j6(durationOfMinutes2);
            } else {
                LocalDate localDate2 = flightPoint2.d.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                h6Var = new h6(localDate2);
            }
            arrayList2.add(new FlightSegmentDelegate.Model(strG, imageB, k6Var, localDate, localDateTime, compositeClause, durationOfMinutes, localDateTime2, compositeClause2, h6Var));
            bound2 = bound;
            i2 = i3;
        }
        return arrayList2;
    }
}
