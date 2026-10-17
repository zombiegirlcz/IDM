package k6g;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect.TravelFlightsChatRedirectScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect.TravelFlightsChatRedirectScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.manage_booking.TravelFlightsManageBookingScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsManageBookingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelFlightsManageBookingScreen travelFlightsManageBookingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsManageBookingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.P.getValue();
        Intrinsics.h(model);
        j jVar = (j) hVar;
        y yVar = jVar.f181717q;
        Intrinsics.checkNotNullParameter(model, "model");
        String str2 = model.f53228a;
        switch (str2.hashCode()) {
            case -713829422:
                str = "MANAGE_BOOKING_BROWSE_FAQS";
                str2.equals(str);
                break;
            case -325678664:
                if (str2.equals("MANAGE_BOOKING_DOCUMENTS")) {
                    jVar.C2(new f(((e) ((j2) yVar.f22677a).getValue()).f181712a));
                }
                break;
            case -66071405:
                str = "MANAGE_BOOKING_CHANGE_TRAVELLER_DETAILS";
                str2.equals(str);
                break;
            case 2090815:
                str = "MANAGE_BOOKING_CALL_US";
                str2.equals(str);
                break;
            case 959742082:
                str = "MANAGE_BOOKING_ADD_BAGGAGE";
                str2.equals(str);
                break;
            case 1806688138:
                str = "MANAGE_BOOKING_CHANGE_BOOKING";
                str2.equals(str);
                break;
            case 2059701781:
                if (str2.equals("MANAGE_BOOKING_START_CHAT")) {
                    j5g.b bVar = jVar.f181716p;
                    TravelFlightsChatRedirectScreenContract$InputData inputData = new TravelFlightsChatRedirectScreenContract$InputData(((e) ((j2) yVar.f22677a).getValue()).f181712a);
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    l.j2(jVar, new TravelFlightsChatRedirectScreen(inputData), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                }
                break;
        }
        return Unit.f186387a;
    }
}
