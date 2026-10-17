package ebg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreen;
import ebg.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsHomeBookingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelHotelsHomeBookingsScreen travelHotelsHomeBookingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsHomeBookingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        String listId = model.f52373a;
        p pVar = (p) iVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -2068568964) {
            if (iHashCode != -64050524) {
                if (iHashCode == 1089808640 && listId.equals("PAST_OR_CANCELLED_BOOKINGS_BUTTON_ID")) {
                    pVar.f124350r.Z2(new n(pVar, null));
                }
            } else if (listId.equals("ERROR_BLOCK_ID")) {
                pVar.l2(new o(pVar, null, 0), new yi5.b(26));
            }
        } else if (listId.equals("EMPTY_BOOKINGS_STATE_ID")) {
            pVar.C2(g.b.f124340a);
        }
        return Unit.f186387a;
    }
}
