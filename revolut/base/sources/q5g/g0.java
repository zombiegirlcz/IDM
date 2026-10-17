package q5g;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsRevPayAbandoned;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsRevPayError;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable p0 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) this.receiver;
        bVar.getClass();
        if (v04.b.h(p0)) {
            bVar.v.Z2(new d0(bVar, 0));
        } else {
            ServerError serverErrorA = bVar.f93314t.a(p0);
            if (serverErrorA != null && serverErrorA.f51362a == 70104) {
                oki.h.v2(bVar.C, new TravelFlightsCheckoutScreenContract$ModalStep.PriceChanged(true), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else if (p0 instanceof TravelFlightsRevPayError) {
                yji.l.a1(bVar, bVar.X1(new y0(null, new nii.z(((TravelFlightsRevPayError) p0).f93308a, null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, null, 7);
            } else if (!(p0 instanceof TravelFlightsRevPayAbandoned)) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TravelFlightsCheckoutScreenModel", "Flight booking confirmation or RevPay checkout failed", p0, h0Var);
                yji.l.a1(bVar, bVar.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_description, null, null, 14), new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, null, 7);
            }
        }
        return Boolean.TRUE;
    }
}
