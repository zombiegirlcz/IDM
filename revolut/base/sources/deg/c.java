package deg;

import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking.TravelHotelsRoomsSelectionBookingScreen;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsRoomsSelectionBookingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelHotelsRoomsSelectionBookingScreen travelHotelsRoomsSelectionBookingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsRoomsSelectionBookingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((c) create((ExtraLargeListingCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        throw null;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ExtraLargeListingCardDelegate.Model model = (ExtraLargeListingCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarR2 = this.v.R2();
        Intrinsics.h(model);
        ((i) hVarR2).getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        throw new NotImplementedError("An operation is not implemented: TRAVEL-1350 Not yet implemented");
    }
}
