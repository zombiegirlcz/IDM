package y4g;

import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelFlightsBookingContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelFlightsBookingContactScreen travelFlightsBookingContactScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelFlightsBookingContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wi0.b bVarF;
        int i = this.u;
        TravelFlightsBookingContactScreen travelFlightsBookingContactScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b) travelFlightsBookingContactScreen.d()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b) travelFlightsBookingContactScreen.d();
                TravelFlightsBookingContactScreenContract$InputData travelFlightsBookingContactScreenContract$InputData = bVar.o;
                y yVar = bVar.f93268t;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                if (!((i) j2Var.getValue()).d) {
                    g gVar = ((i) j2Var2.getValue()).f310926b;
                    g gVar2 = ((i) j2Var2.getValue()).f310925a;
                    if (!Intrinsics.f(gVar, gVar2)) {
                        boolean zF = bVar.f93265q.f(gVar);
                        String str = gVar.f310921a;
                        if (zF) {
                            bVar.H2(yVar, new y4b.b(10));
                            if (travelFlightsBookingContactScreenContract$InputData instanceof TravelFlightsBookingContactScreenContract$InputData.ForCheckout) {
                                PhoneNumber phoneNumberJ2 = com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b.J2(gVar);
                                if (phoneNumberJ2 == null) {
                                    phoneNumberJ2 = ((TravelFlightsBookingContactScreenContract$InputData.ForCheckout) travelFlightsBookingContactScreenContract$InputData).f93260b;
                                }
                                bVar.C2(new h(str, phoneNumberJ2));
                            } else {
                                if (!(travelFlightsBookingContactScreenContract$InputData instanceof TravelFlightsBookingContactScreenContract$InputData.ForBookingDetails)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (Intrinsics.f(str, gVar2.f310921a)) {
                                    str = null;
                                }
                                PhoneNumber phoneNumberJ22 = com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b.J2(gVar);
                                if (phoneNumberJ22 == null || Intrinsics.f(gVar.f310922b, gVar2.f310922b)) {
                                    phoneNumberJ22 = null;
                                }
                                bVar.l2(new com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.a(bVar, new l7g.c(str, phoneNumberJ22), gVar, null), new yi5.b(26));
                            }
                        }
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b bVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b) travelFlightsBookingContactScreen.d();
                j jVar = ((i) ((j2) bVar2.f93268t.f22677a).getValue()).f310926b.f310922b;
                if ((jVar == null || (bVarF = jVar.f310928a) == null) && (bVarF = bVar2.f93264p.f()) == null) {
                    wi0.b.Companion.getClass();
                    bVarF = wi0.b.p0;
                }
                oki.h.v2(bVar2.u, new TravelFlightsBookingContactScreenContract$ModalStep.CountrySelection(bVarF), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
        }
    }
}
