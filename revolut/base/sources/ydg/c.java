package ydg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsRoomDetailsAmendmentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsRoomDetailsAmendmentScreen travelHotelsRoomDetailsAmendmentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsRoomDetailsAmendmentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsRoomDetailsAmendmentScreen travelHotelsRoomDetailsAmendmentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) travelHotelsRoomDetailsAmendmentScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) travelHotelsRoomDetailsAmendmentScreen.e3()).C2(e.f312693a);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) travelHotelsRoomDetailsAmendmentScreen.e3()).I2();
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) travelHotelsRoomDetailsAmendmentScreen.e3()).I2();
                break;
        }
        return Unit.f186387a;
    }
}
