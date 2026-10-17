package beg;

import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsRoomsSelectionAmendmentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelHotelsRoomsSelectionAmendmentScreen travelHotelsRoomsSelectionAmendmentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsRoomsSelectionAmendmentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ExtraLargeListingCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ExtraLargeListingCardDelegate.Model model = (ExtraLargeListingCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        Intrinsics.h(model);
        s sVar = (s) jVarE3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52276m;
        cgi.o oVar = obj3 instanceof cgi.o ? (cgi.o) obj3 : null;
        if (oVar != null) {
            sVar.C2(new h(sVar.I2(oVar)));
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Expect TravelHotelsPropertyRoomOccupancyRatesSelection parcel");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, unsupportedOperationException, h0Var);
        }
        return Unit.f186387a;
    }
}
