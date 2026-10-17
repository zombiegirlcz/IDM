package o2g;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ngh.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static r40 a(TravelExperienceLocation travelExperienceLocation) {
        return new r40("ITINERARY_DEPARTURE_LOCATION_ITEM_ID", null, new TextLocalisedClause(R$string.experiences_itinerary_start, null, null, 14), new TextClause(travelExperienceLocation.f92827b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, R$attr.uikit_colorAccent, false, new o40(n40.CURRENT), 0, 0, 0, null, 16050);
    }

    public static r40 b(TravelExperienceLocation travelExperienceLocation) {
        return new r40("ITINERARY_RETURN_LOCATION_ITEM_ID", null, new TextLocalisedClause(R$string.experiences_itinerary_end, null, null, 14), new TextClause(travelExperienceLocation.f92827b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, R$attr.uikit_colorGrey10, false, new o40(n40.FUTURE), 0, 0, 0, null, 16050);
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new d((List) iii.c.f(domainState.f221619a, new f(0), new nz7.g(18), new i(this, 13)));
    }
}
