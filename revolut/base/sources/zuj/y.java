package zuj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesDestination;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsHomeKompotDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.api.navigation.AsftFeatureConfig;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItineraryAddExperiences;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItineraryAddFastTrack;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItineraryAddStays;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreenContract$ModalStep;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a f325516b;

    public /* synthetic */ y(com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar, int i) {
        this.f325515a = i;
        this.f325516b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f325515a;
        com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar = this.f325516b;
        switch (i) {
            case 0:
                n update = (n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                xoj.a aVar2 = ((i9g.v) aVar.f101611r).f159843b;
                yoj.c cVar = yoj.c.STAYS;
                yoj.d dVar = yoj.d.DISABLED;
                boolean zK = yoj.b.k(((cpj.b) aVar2).g(cVar, dVar));
                boolean zK2 = yoj.b.k(((cpj.b) ((c1g.m) aVar.f101612s).f20497a).g(yoj.c.TRAVEL_EXPERIENCES, dVar));
                boolean zA = aVar.f101613t.a();
                jte.d dVar2 = (jte.d) aVar.u;
                return n.a(update, null, null, null, new o(zK, zK2, zA, dVar2.c(TravelTripsApi$Toggles$TripItineraryAddStays.f99260c), dVar2.c(TravelTripsApi$Toggles$TripItineraryAddExperiences.f99258c), dVar2.c(TravelTripsApi$Toggles$TripItineraryAddFastTrack.f99259c)), 7);
            case 1:
                eii.k outputData = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof eii.i) {
                    Object obj3 = ((eii.i) outputData).f126655a;
                    m mVar = obj3 instanceof m ? (m) obj3 : null;
                    if (mVar == null) {
                        return Unit.f186387a;
                    }
                    int i2 = a0.f325486a[mVar.ordinal()];
                    if (i2 == 1) {
                        aVar.C1(new TravelHotelsHomeKompotDestination(null, null, null, 7));
                    } else if (i2 == 2) {
                        aVar.C1(new TravelExperiencesDestination.Home(null));
                    } else if (i2 == 3) {
                        aVar.C1(new AsftFeatureConfig.HomeDestination(null));
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        puj.e eVar = (puj.e) ((n) ((j2) aVar.z.f22677a).getValue()).f325497a.getContent();
                        if (eVar != null) {
                            com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar.f101616y;
                            LocalDate localDate = eVar.d.toLocalDate();
                            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                            LocalDate localDate2 = eVar.e.toLocalDate();
                            Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                            oki.h.v2(aVar3, new TravelItineraryScreenContract$ModalStep.AddEvent(eVar.f239914c, localDate, localDate2), ModalDestination.Style.POPUP.f98311a);
                            Unit unit = Unit.f186387a;
                        }
                    }
                }
                return Unit.f186387a;
            default:
                aii.q it8 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aVar.f101615x.a();
                aVar.K2(new TextLocalisedClause(R$string.travel_trip_itinerary_edit_dates_success, null, null, 14), "TRAVEL_ITINERARY_EDIT_DATES_SUCCESS_DIALOG_ID");
                return Unit.f186387a;
        }
    }
}
