package jeg;

import beb.n;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.TravelHotelsRoomAmenitiesFilterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsRoomAmenitiesFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelHotelsRoomAmenitiesFilterScreen travelHotelsRoomAmenitiesFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsRoomAmenitiesFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVarR2 = this.v.R2();
        Intrinsics.h(model);
        j jVar = (j) eVarR2;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        jVar.I2(new n(model, 4));
        return Unit.f186387a;
    }
}
