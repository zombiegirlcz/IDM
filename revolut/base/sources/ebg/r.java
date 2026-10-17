package ebg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsHomeBookingsScreenContract$InputData f124353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dyf.f f124354b;

    public r(TravelHotelsHomeBookingsScreenContract$InputData inputData, dyf.f travelFullScreenBookingsItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelFullScreenBookingsItemMapper, "travelFullScreenBookingsItemMapper");
        this.f124353a = inputData;
        this.f124354b = travelFullScreenBookingsItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data travelBookingsList = domainState.f124336a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_bookings_empty_state_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_bookings_empty_state_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.hotels_bookings_empty_state_action_title, null, null, 14);
        TravelHotelsHomeBookingsScreenContract$InputData travelHotelsHomeBookingsScreenContract$InputData = this.f124353a;
        if (travelHotelsHomeBookingsScreenContract$InputData.f93834a) {
            textLocalisedClause3 = null;
        }
        lxf.a customResources = new lxf.a(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_title_upcoming, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_subtitle_upcoming, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_action_title_past_and_cancelled, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_button_past_and_cancelled, null, null, 14));
        Intrinsics.checkNotNullParameter(travelBookingsList, "travelBookingsList");
        Intrinsics.checkNotNullParameter(customResources, "customResources");
        dyf.f fVar = this.f124354b;
        return new j(d0.E0(v.l(domainState.f124337b.getContent()), (List) iii.c.f(travelBookingsList, new dwi.f(fVar, 23), new dug.d(fVar, 19), new dn8.k(fVar, customResources, 4))), travelHotelsHomeBookingsScreenContract$InputData.f93834a);
    }
}
