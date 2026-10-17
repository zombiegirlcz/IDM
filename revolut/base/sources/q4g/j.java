package q4g;

import android.os.Parcelable;
import aw0.c7;
import aw0.d7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.p0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.models.domain.common.Bound;
import com.revolut.feature.travel.flights.models.domain.common.FlightPoint;
import com.revolut.feature.travel.flights.models.domain.common.Segment;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public interface j {
    static ArrayList a(k kVar, ArrayList bounds, String boundItemIdPrefix, boolean z, int i) {
        boolean z3 = (i & 8) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(boundItemIdPrefix, "boundItemIdPrefix");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj2 : bounds) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            Bound bound = (Bound) obj2;
            String strK = com.google.android.gms.internal.mlkit_vision_face.a.k(i2, boundItemIdPrefix, "SUBHEADER_");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2 == 0 ? R$string.travel_flights_itinerary_details_card_outbound : R$string.travel_flights_itinerary_details_card_return, null, null, 14);
            DotDividerClause dotDividerClause = new DotDividerClause((Integer) null);
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDate localDate = bound.f93484a.d.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
            LocalDateClause$DateFormat.INSTANCE.getClass();
            CompositeClause compositeClause = new CompositeClause(v.k(textLocalisedClause, dotDividerClause, com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b)), null, null, null, 14);
            int i5 = k.f242150c;
            int i6 = k.e;
            int i21 = k.d;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strK, (Image) null, (Clause) compositeClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i5, i6, i21, i21, 4090);
            ArrayList arrayList2 = bound.e;
            FlightPoint flightPoint = bound.f93485b;
            FlightPoint flightPoint2 = bound.f93484a;
            Segment segment = (Segment) d0.d0(arrayList2);
            String strO = p.a.o(boundItemIdPrefix, i2);
            RowDelegate.Model.MainImage.Image40 image40 = segment != null ? new RowDelegate.Model.MainImage.Image40(l.a(segment, Integer.valueOf(R$attr.uikit_colorGreyTone10)), null, null, false, null, false, 62) : null;
            CompositeClause compositeClause2 = new CompositeClause(v.k(new TextClause(flightPoint2.f93490a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(flightPoint.f93490a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause(" – ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            com.revolut.core.ui_kit.models.k kVar2 = d7.Companion;
            LocalTime localTime = flightPoint2.d.toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
            TimeClause timeClauseA = com.revolut.core.ui_kit.models.k.a(kVar2, localTime);
            LocalTime localTime2 = flightPoint.d.toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
            a0.x(v.k(model, new RowDelegate.Model(strO, image40, compositeClause2, null, 0, new CompositeClause(v.k(new CompositeClause(v.k(timeClauseA, com.revolut.core.ui_kit.models.k.a(kVar2, localTime2)), new TextClause(" – ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new DotDividerClause((Integer) null), new TimeClause(Duration.ofMinutes(bound.f93486c).toMillis(), new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(p0.MINUTES)), null, null, 12)), null, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, Integer.valueOf(i2), null, i5, i5, i21, i21, 281015256)), arrayList);
            i2 = i3;
        }
        if (z3) {
            int i22 = k.f242148a;
            int i32 = k.f242149b;
            yp0.b.k(arrayList, i22, i22, i32, i32, 16);
        }
        return arrayList;
    }
}
