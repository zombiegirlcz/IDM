package qeb;

import android.content.Intent;
import android.provider.CalendarContract;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.retail.restaurants.impl.domain.model.LocationInfo;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.ReservationDetailsScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.ReservationDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import xdb.r;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReservationDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReservationDetailsScreen reservationDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reservationDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Reservation reservation;
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = item.f58316a;
        int iHashCode = str.hashCode();
        ReservationDetailsScreen reservationDetailsScreen = this.v;
        if (iHashCode != -221240342) {
            if (iHashCode != 77688362) {
                if (iHashCode == 2081248430 && str.equals("reservation_details_calendar")) {
                    com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.a aVar2 = (com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.a) reservationDetailsScreen.R2();
                    r details = (r) ((f) ((j2) aVar2.f82875r.f22677a).getValue()).f245106a.getContent();
                    if (details != null) {
                        Reservation reservation2 = details.f304405a;
                        aVar2.f82874q.getClass();
                        Intrinsics.checkNotNullParameter(details, "details");
                        LocalDate localDate = reservation2.f82811c;
                        LocationInfo locationInfo = reservation2.e;
                        long epochMilli = ZonedDateTime.of(localDate, reservation2.d, locationInfo.a()).toInstant().toEpochMilli();
                        Intent intentPutExtra = new Intent("android.intent.action.INSERT", CalendarContract.Events.CONTENT_URI).putExtra("beginTime", epochMilli).putExtra("endTime", Duration.ofHours(2L).toMillis() + epochMilli).putExtra("eventTimezone", locationInfo.a().getId()).putExtra("title", locationInfo.f82806c).putExtra("eventLocation", o51.a.b(locationInfo.d, null));
                        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
                        if (intentPutExtra != null) {
                            aVar2.C1(new ExternalDestination.ByIntent(intentPutExtra, null));
                        }
                    }
                }
            } else if (str.equals("reservation_details_modify")) {
                reservationDetailsScreen.R2().getClass();
            }
        } else if (str.equals("reservation_details_cancel")) {
            com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.a aVar3 = (com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.a) reservationDetailsScreen.R2();
            r rVar = (r) ((f) ((j2) aVar3.f82875r.f22677a).getValue()).f245106a.getContent();
            if (rVar != null && (reservation = rVar.f304405a) != null) {
                Intrinsics.checkNotNullParameter(reservation, "<this>");
                xdb.a[] elements = {xdb.a.CONFIRMED, xdb.a.CREATED};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (kotlin.collections.d.y0(elements).contains(reservation.f82810b)) {
                    oki.h.v2(aVar3.f82876s, new ReservationDetailsScreenContract$ModalStep.CancelReservation(reservation), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
            }
        }
        return Unit.f186387a;
    }
}
