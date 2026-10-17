package ydg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsRoomDetailsAmendmentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelHotelsRoomDetailsAmendmentScreen travelHotelsRoomDetailsAmendmentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsRoomDetailsAmendmentScreen;
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
        o.b(obj2);
        f fVarE3 = this.v.d();
        Intrinsics.h(model);
        g gVar = (g) fVarE3;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        gVar.f312695q.a();
        return Unit.f186387a;
    }
}
